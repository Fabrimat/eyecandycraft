package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScalettaMuro extends ModelBase {
	  //fields
	    ModelRenderer Shape1s;
	    ModelRenderer Shape1;
	    ModelRenderer Shape2a;
	    ModelRenderer Shape2c;
	    ModelRenderer Shape2b;
	    ModelRenderer Shape2;
	    ModelRenderer Shape3;
	    ModelRenderer Shape3a;
	    ModelRenderer Shape3b;
	    ModelRenderer Shape3c;
	  
	  public ModelScalettaMuro()
	  {
	    textureWidth = 32;
	    textureHeight = 32;
	    
	      Shape1s = new ModelRenderer(this, 0, 0);
	      Shape1s.addBox(0F, 0F, 0F, 1, 16, 1);
	      Shape1s.setRotationPoint(3F, 8F, 6F);
	      Shape1s.setTextureSize(64, 32);
	      Shape1s.mirror = true;
	      setRotation(Shape1s, 0F, 0F, 0F);
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(0F, 0F, 0F, 1, 16, 1);
	      Shape1.setRotationPoint(-4F, 8F, 6F);
	      Shape1.setTextureSize(64, 32);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2a = new ModelRenderer(this, 5, 0);
	      Shape2a.addBox(0F, 0F, 0F, 6, 1, 1);
	      Shape2a.setRotationPoint(-3F, 17F, 6F);
	      Shape2a.setTextureSize(64, 32);
	      Shape2a.mirror = true;
	      setRotation(Shape2a, 0F, 0F, 0F);
	      Shape2c = new ModelRenderer(this, 5, 0);
	      Shape2c.addBox(0F, 0F, 0F, 6, 1, 1);
	      Shape2c.setRotationPoint(-3F, 9F, 6F);
	      Shape2c.setTextureSize(64, 32);
	      Shape2c.mirror = true;
	      setRotation(Shape2c, 0F, 0F, 0F);
	      Shape2b = new ModelRenderer(this, 5, 0);
	      Shape2b.addBox(0F, 0F, 0F, 6, 1, 1);
	      Shape2b.setRotationPoint(-3F, 13F, 6F);
	      Shape2b.setTextureSize(64, 32);
	      Shape2b.mirror = true;
	      setRotation(Shape2b, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 5, 0);
	      Shape2.addBox(0F, 0F, 0F, 6, 1, 1);
	      Shape2.setRotationPoint(-3F, 21F, 6F);
	      Shape2.setTextureSize(64, 32);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape3.setRotationPoint(-4F, 9F, 7F);
	      Shape3.setTextureSize(64, 32);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape3a = new ModelRenderer(this, 0, 0);
	      Shape3a.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape3a.setRotationPoint(-4F, 22F, 7F);
	      Shape3a.setTextureSize(64, 32);
	      Shape3a.mirror = true;
	      setRotation(Shape3a, 0F, 0F, 0F);
	      Shape3b = new ModelRenderer(this, 0, 0);
	      Shape3b.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape3b.setRotationPoint(3F, 22F, 7F);
	      Shape3b.setTextureSize(64, 32);
	      Shape3b.mirror = true;
	      setRotation(Shape3b, 0F, 0F, 0F);
	      Shape3c = new ModelRenderer(this, 0, 0);
	      Shape3c.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape3c.setRotationPoint(3F, 9F, 7F);
	      Shape3c.setTextureSize(64, 32);
	      Shape3c.mirror = true;
	      setRotation(Shape3c, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Shape1s.render(f5);
	    Shape1.render(f5);
	    Shape2a.render(f5);
	    Shape2c.render(f5);
	    Shape2b.render(f5);
	    Shape2.render(f5);
	    Shape3.render(f5);
	    Shape3a.render(f5);
	    Shape3b.render(f5);
	    Shape3c.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  }

	}
