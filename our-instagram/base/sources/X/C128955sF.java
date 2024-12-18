package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.5sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C128955sF extends ImageView {
    public boolean A00;
    public final C3WT A01;
    public final C128965sG A02;

    public ColorStateList getSupportBackgroundTintList() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A01();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C69182VjB c69182VjB;
        C128965sG c128965sG = this.A02;
        if (c128965sG != null && (c69182VjB = c128965sG.A01) != null) {
            return c69182VjB.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C69182VjB c69182VjB;
        C128965sG c128965sG = this.A02;
        if (c128965sG != null && (c69182VjB = c128965sG.A01) != null) {
            return c69182VjB.A01;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(this.A02.A02.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C128965sG c128965sG = this.A02;
        if (c128965sG != null && drawable != null && !this.A00) {
            c128965sG.A00 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c128965sG != null) {
            c128965sG.A00();
            if (!this.A00) {
                ImageView imageView = c128965sG.A02;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c128965sG.A00);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            c128965sG.A01(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A06(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            C69182VjB c69182VjB = c128965sG.A01;
            C69182VjB c69182VjB2 = c69182VjB;
            if (c69182VjB == null) {
                ?? obj = new Object();
                c128965sG.A01 = obj;
                c69182VjB2 = obj;
            }
            c69182VjB2.A00 = colorStateList;
            c69182VjB2.A02 = true;
            c128965sG.A00();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            C69182VjB c69182VjB = c128965sG.A01;
            C69182VjB c69182VjB2 = c69182VjB;
            if (c69182VjB == null) {
                ?? obj = new Object();
                c128965sG.A01 = obj;
                c69182VjB2 = obj;
            }
            c69182VjB2.A01 = mode;
            c69182VjB2.A03 = true;
            c128965sG.A00();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C128955sF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A00 = false;
        C3WR.A03(this, getContext());
        C3WT c3wt = new C3WT(this);
        this.A01 = c3wt;
        c3wt.A07(attributeSet, i);
        C128965sG c128965sG = new C128965sG(this);
        this.A02 = c128965sG;
        c128965sG.A02(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A02();
        }
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            c128965sG.A00();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A04(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            c128965sG.A00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.A00 = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        C128965sG c128965sG = this.A02;
        if (c128965sG != null) {
            c128965sG.A00();
        }
    }
}
