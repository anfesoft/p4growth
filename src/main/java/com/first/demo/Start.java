package com.first.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import com.firt.gui.resources.*;


//https://zetcode.com/articles/springbootswing/
//https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html
@SpringBootApplication
public class Start extends JFrame implements WebMvcConfigurer {
	private static final long serialVersionUID = 1L;

	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
        .addResourceLocations("classpath:/static/")
        .setCachePeriod(0);
    }

	
	
	public Start() {

        initUI();
    }
	
	private void initUI() {

        var quitButton = new JButton("Text");
        
        quitButton.addActionListener((ActionEvent event) -> {
        	 new TextArea("text");

        });

        var btPanes = new JButton("Panels");
        btPanes.addActionListener((ActionEvent event) -> {

          	 new PanelsTabs();
          });
        
        
        
        
        createLayout(quitButton,btPanes);

        setTitle("First window");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

	
	private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
        );
    }
   
	

	
	
	public static void main(String[] args) {

        var ctx = new SpringApplicationBuilder(Start.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {

            var ex = ctx.getBean(Start.class);
            ex.setVisible(true);
        });
        
	}
	}




