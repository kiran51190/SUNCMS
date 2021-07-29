package locaters;

import org.openqa.selenium.By;

public interface Sun {
	public interface loginpage
	{
		public By user=By.id("user_name");
		public By password=By.id("password");
		public By submit=By.id("load");
		public By CMS=By.cssSelector("button[class='btn btn-sm btn-primary m-t-n-xs cms']");
		public By MPS=By.cssSelector("button[class='btn btn-sm btn-primary m-t-n-xs mps']");
		public By Audit=By.cssSelector("button[class='btn btn-sm btn-primary m-t-n-xs audit']");
	}
	public interface Configurepage
	{
		public By Configure=By.linkText("Configure");
		public By Studios=By.linkText("Studios");
		public By create=By.cssSelector("i[class='fa fa-plus-square']");
		public By StudioName=By.id("_cStudioName");
		public By StudioPrimaryContactName=By.id("_cStudioPrimaryContactName");
		public By StudioPrimaryContactEmail=By.id("_cStudioPrimaryContactEmail");
		public By StudioPrimaryContactNumber=By.id("_cStudioPrimaryContactNumber");
		public By StudioStartDate=By.id("_cStudioStartDate");
		public By selecttoday=By.cssSelector("th[class='today']");
		public By StudioEndDate=By.id("_cStudioEndDate");
		public By TenantName=By.id("_cTenantName");
		public By StudioType=By.id("_cStudioType");
		public By StudioDescription=By.id("_cStudioDescription");
		public By submit=By.cssSelector("button[class='btn btn-primary studioButtonCreate']");
		public By studioSearchTerm=By.id("studioSearchTerm");
		public By studioupdatesubmit=By.cssSelector("button[class='btn btn-primary studioButtonUpdate _cStudiopl']");
		
		
		public By Properties=By.linkText("Properties");
		public By propertyType=By.id("_cpropertyType");
		public By configBy=By.id("_cconfigBy");
		public By propertyName=By.id("_cpropertyName");
		public By categoryType=By.id("_ccategoryType");
		public By multiValue=By.id("_cmultiValue");
		public By classification=By.id("_cclassificationId");
		public By isMandatoryno=By.cssSelector("input[name='isMandatory'][value='no']");
		public By isMandatoryyes=By.cssSelector("input[name='isMandatory'][value='yes']");
		public By propertyDesc=By.id("_cpropertyDesc");
		public By isBulkNo=By.cssSelector("input[name='isMandatory'][value='no']");
		public By isBulkyes=By.cssSelector("input[name='isMandatory'][value='yes']");
		public By entityType=By.cssSelector("input[id='_centityType'][value='content']");
		public By propertsubmit=By.cssSelector("button[class='btn btn-primary _cPropertyButton']");
		public By propertiessearch=By.id("searchPropertyTerm");
		public By edit=By.cssSelector("i[class='fa fa-pencil-square-o']");
		public By propertyupdatesubmit=By.cssSelector("button[class='btn btn-primary _uPropertyButton']");
		public By addvalues=By.cssSelector("i[class='fa fa-plus-circle add-plus']");
		public By value1=By.name("metaPropVal");
		public By value2=By.id("inputbox1");
		public By valuesubmit=By.cssSelector("button[class='btn btn-primary addremovebtn']");
		public By view=By.cssSelector("i[class='fa fa-file-text']");
		public By viewselectall=By.id("selectAll");
		public By viewsearch=By.id("_aSearchMetaValue");
		public By viewsearchgo=By.cssSelector("button[type='submit']");
		public By viewclose=By.cssSelector("button[class='btn btn-primary update-buttton']");
		
		public By entityCreate=By.cssSelector("a[data-target='#entityCreateModal']");
		public By entityname=By.id("_centityname");
		public By entitysubmit=By.id("btn btn-primary update-buttton entityButton");
		
		public By contenttype=By.cssSelector("a[data-target='#contentTypeCreateModal']");
		public By contenttypename=By.id("_ccontenttypename");
		public By contentnamedec=By.id("_ccontentmastertypename");
		public By contenttypesubmit=By.cssSelector("button[class='btn btn-primary update-buttton contentTypeButton']");
		
		public By Users=By.linkText("Users");
	}
	public interface Studios
	{
		
	}
	public interface Properties
	{
		
	}
	public interface Content
	{
		public By content=By.linkText("Content");
		public By Create=By.linkText("Create");
		public By contentname=By.id("_ccontentName");
		public By startdate=By.id("_cstartDate");
		public By today=By.cssSelector("th[class='today']");
		public By shortdesc=By.id("_cshortDescription");
		public By longdesc=By.id("_clongDescription");
		public By duration=By.id("_cduration");
		public By contenttype=By.id("_ccontentType");
		public By saveandproceed=By.xpath("//button[contains(.,'Save and Proceed')]");
		//*[@id="content_subtitle_update_form"]/div[5]/button[2]
		//public By saveandproceedmeta=By.xpath("//button[contains(.,'Save and Proceed')]");
		//By.xpath("//*[text() = 'Save and Proceed
		//public By saveandproceedsubtitles=By.xpath("//button[contains(.,'Save and Proceed')]");
		public By ReleaseDate=By.id("ReleasedDate");
		//public By imagetype=By.id("_uimageType1");
		//xpath=//div[@id='_uimageOptions0']/div/div/select
		public By uploadimage=By.xpath("//*[@id=\"_cimageOptions0\"]/div[3]/div/div/div");
		public By saveandexit=By.cssSelector("button[class='btn btn-primary _cContentImageExitBtn']");
		
		
	
		
		
	}

}
