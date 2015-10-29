package com.liferay.example;

import javax.portlet.Portlet;

import com.liferay.util.bridges.soy.SoyPortlet;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Soy Portlet",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.template-path=/soy/",
		"javax.portlet.init-param.view-template=soy.multiTest.simple"
	},
	service = Portlet.class
)
public class SoyExamplePortlet extends SoyPortlet {

}