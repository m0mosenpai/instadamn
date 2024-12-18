package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.facebook.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes11.dex */
public final class WFU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public C65Q A0D;
    public boolean A0F;
    public final MaterialButton A0I;
    public boolean A0H = false;
    public boolean A0E = false;
    public boolean A0G = false;

    public static void A02(WFU wfu) {
        int i;
        C65O A00 = A00(wfu, false);
        C65O A002 = A00(wfu, true);
        if (A00 != null) {
            A00.A0H(wfu.A09, wfu.A06);
            if (A002 != null) {
                float f = wfu.A06;
                if (wfu.A0H) {
                    i = AbstractC1343565e.A01(wfu.A0I, R.attr.colorSurface);
                } else {
                    i = 0;
                }
                A002.A00.A04 = f;
                A002.invalidateSelf();
                A002.A0G(ColorStateList.valueOf(i));
            }
        }
    }

    public static C65O A00(WFU wfu, boolean z) {
        LayerDrawable layerDrawable = wfu.A0C;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (C65O) ((LayerDrawable) ((DrawableWrapper) wfu.A0C.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public static void A01(WFU wfu) {
        int i;
        MaterialButton materialButton = wfu.A0I;
        C65O c65o = new C65O(wfu.A0D);
        c65o.A0E(materialButton.getContext());
        c65o.setTintList(wfu.A07);
        PorterDuff.Mode mode = wfu.A0A;
        if (mode != null) {
            c65o.setTintMode(mode);
        }
        c65o.A0H(wfu.A09, wfu.A06);
        C65O c65o2 = new C65O(wfu.A0D);
        c65o2.setTint(0);
        float f = wfu.A06;
        if (wfu.A0H) {
            i = AbstractC1343565e.A01(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        c65o2.A00.A04 = f;
        c65o2.invalidateSelf();
        c65o2.A0G(ColorStateList.valueOf(i));
        C65O c65o3 = new C65O(wfu.A0D);
        wfu.A0B = c65o3;
        c65o3.setTint(-1);
        ColorStateList colorStateList = wfu.A08;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c65o2, c65o}), wfu.A03, wfu.A05, wfu.A04, wfu.A02), wfu.A0B);
        wfu.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C65O A00 = A00(wfu, false);
        if (A00 != null) {
            A00.A0A(wfu.A01);
        }
    }

    public static void A03(WFU wfu, int i, int i2) {
        MaterialButton materialButton = wfu.A0I;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = wfu.A05;
        int i4 = wfu.A02;
        wfu.A02 = i2;
        wfu.A05 = i;
        if (!wfu.A0E) {
            A01(wfu);
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final C65P A04() {
        Object drawable;
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.A0C.getNumberOfLayers();
            LayerDrawable layerDrawable2 = this.A0C;
            if (numberOfLayers > 2) {
                drawable = layerDrawable2.getDrawable(2);
            } else {
                drawable = layerDrawable2.getDrawable(1);
            }
            return (C65P) drawable;
        }
        return null;
    }

    public final void A05(C65Q c65q) {
        this.A0D = c65q;
        if (A00(this, false) != null) {
            A00(this, false).setShapeAppearanceModel(c65q);
        }
        if (A00(this, true) != null) {
            A00(this, true).setShapeAppearanceModel(c65q);
        }
        if (A04() != null) {
            A04().setShapeAppearanceModel(c65q);
        }
    }

    public WFU(MaterialButton materialButton, C65Q c65q) {
        this.A0I = materialButton;
        this.A0D = c65q;
    }
}
