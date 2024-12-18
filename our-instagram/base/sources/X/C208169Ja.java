package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;

/* renamed from: X.9Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208169Ja extends GradientDrawable implements InterfaceC85603rp {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public float[] A0D;
    public int[] A0E;

    public C208169Ja(GradientDrawable.Orientation orientation) {
        super(orientation, null);
        this.A0E = null;
        this.A0A = -1;
        this.A06 = -1;
        this.A09 = -1;
    }

    @Override // X.InterfaceC85603rp
    /* renamed from: CTy */
    public final boolean CTz(InterfaceC85603rp interfaceC85603rp) {
        C14360o3.A0B(interfaceC85603rp, 0);
        return equals(interfaceC85603rp);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208169Ja)) {
            return false;
        }
        C208169Ja c208169Ja = (C208169Ja) obj;
        return this.A04 == c208169Ja.A04 && C14360o3.A0K(this.A0B, c208169Ja.A0B) && this.A00 == c208169Ja.A00 && this.A05 == c208169Ja.A05 && this.A01 == c208169Ja.A01 && this.A07 == c208169Ja.A07 && this.A0A == c208169Ja.A0A && this.A06 == c208169Ja.A06 && this.A09 == c208169Ja.A09 && this.A03 == c208169Ja.A03 && this.A02 == c208169Ja.A02 && this.A08 == c208169Ja.A08 && getOrientation() == c208169Ja.getOrientation() && Arrays.equals(this.A0E, c208169Ja.A0E) && Arrays.equals(this.A0D, c208169Ja.A0D) && C14360o3.A0K(this.A0C, c208169Ja.A0C);
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setStroke(int i, ColorStateList colorStateList, float f, float f2) {
        C14360o3.A0B(colorStateList, 1);
        super.setStroke(i, colorStateList, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A0C = colorStateList;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(new Object[]{getOrientation(), Integer.valueOf(this.A04), this.A0B, Float.valueOf(this.A00), Integer.valueOf(this.A05), Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A0A), Integer.valueOf(this.A06), Integer.valueOf(this.A09), Float.valueOf(this.A03), Float.valueOf(this.A02), Integer.valueOf(this.A08), this.A0C}) * 31) + Arrays.hashCode(this.A0E)) * 31) + Arrays.hashCode(this.A0D);
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setColor(int i) {
        super.setColor(i);
        this.A04 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setColors(int[] iArr) {
        super.setColors(iArr);
        this.A0E = iArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setCornerRadii(float[] fArr) {
        super.setCornerRadii(fArr);
        this.A0D = fArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setCornerRadius(float f) {
        super.setCornerRadius(f);
        this.A00 = f;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setGradientRadius(float f) {
        super.setGradientRadius(f);
        this.A01 = f;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setGradientType(int i) {
        super.setGradientType(i);
        this.A05 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setShape(int i) {
        super.setShape(i);
        this.A07 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.A0A = i;
        this.A06 = i2;
    }

    public C208169Ja() {
        this(GradientDrawable.Orientation.TOP_BOTTOM);
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setColor(ColorStateList colorStateList) {
        super.setColor(colorStateList);
        this.A0B = colorStateList;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setStroke(int i, int i2, float f, float f2) {
        super.setStroke(i, i2, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A08 = i2;
    }
}
