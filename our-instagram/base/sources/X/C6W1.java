package X;

import android.view.View;
import android.view.ViewTreeObserver;
import go.Seq;

/* renamed from: X.6W1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6W1 implements C6W2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2.endsWith("%") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r1.endsWith("%") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r2.endsWith("%") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C102884kP r8, X.C6W1 r9) {
        /*
            java.lang.String r4 = "ViewTransformsExtensionBinderUtils"
            r0 = 141(0x8d, float:1.98E-43)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r8.A02(r0, r7)
            r9.A00 = r0
            r0 = 38
            r3 = 0
            r5 = 0
            r6 = 1
            r1 = 0
            java.lang.String r2 = r8.A0L(r0)     // Catch: X.C41M -> L4b
            r0 = 0
            if (r2 == 0) goto L1d
            float r0 = X.C6BE.A01(r2)     // Catch: X.C41M -> L4b
        L1d:
            r9.A09 = r0     // Catch: X.C41M -> L4b
            if (r2 == 0) goto L2a
            java.lang.String r0 = "%"
            boolean r2 = r2.endsWith(r0)     // Catch: X.C41M -> L4b
            r0 = 1
            if (r2 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            r9.A0I = r0     // Catch: X.C41M -> L4b
            r0 = 40
            java.lang.String r2 = r8.A0L(r0)     // Catch: X.C41M -> L4b
            r0 = 0
            if (r2 == 0) goto L3a
            float r0 = X.C6BE.A01(r2)     // Catch: X.C41M -> L4b
        L3a:
            r9.A0A = r0     // Catch: X.C41M -> L4b
            if (r2 == 0) goto L47
            java.lang.String r0 = "%"
            boolean r2 = r2.endsWith(r0)     // Catch: X.C41M -> L4b
            r0 = 1
            if (r2 != 0) goto L48
        L47:
            r0 = 0
        L48:
            r9.A0J = r0     // Catch: X.C41M -> L4b
            goto L51
        L4b:
            r2 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.AbstractC25241Le.A00(r3, r4, r0, r2)
        L51:
            r0 = 35
            float r0 = r8.A02(r0, r7)
            r9.A07 = r0
            r0 = 36
            float r0 = r8.A02(r0, r7)
            r9.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r8.A02(r0, r1)
            r9.A04 = r0
            r0 = 44
            float r0 = r8.A02(r0, r1)
            r9.A05 = r0
            r0 = 45
            float r0 = r8.A02(r0, r1)
            r9.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r8.A02(r1, r0)
            r9.A01 = r0
            r0 = 41
            java.lang.String r1 = r8.A0L(r0)     // Catch: X.C41M -> Lc5
            r0 = 42
            java.lang.String r2 = r8.A0L(r0)     // Catch: X.C41M -> Lc5
            if (r1 != 0) goto L93
            if (r2 == 0) goto Lcb
        L93:
            r9.A0F = r6     // Catch: X.C41M -> Lc5
            r0 = 1112014848(0x42480000, float:50.0)
            if (r1 == 0) goto L9d
            float r0 = X.C6BE.A01(r1)     // Catch: X.C41M -> Lc5
        L9d:
            r9.A02 = r0     // Catch: X.C41M -> Lc5
            r0 = 1112014848(0x42480000, float:50.0)
            if (r2 == 0) goto La7
            float r0 = X.C6BE.A01(r2)     // Catch: X.C41M -> Lc5
        La7:
            r9.A03 = r0     // Catch: X.C41M -> Lc5
            if (r1 == 0) goto Lb4
            java.lang.String r0 = "%"
            boolean r1 = r1.endsWith(r0)     // Catch: X.C41M -> Lc5
            r0 = 0
            if (r1 == 0) goto Lb5
        Lb4:
            r0 = 1
        Lb5:
            r9.A0G = r0     // Catch: X.C41M -> Lc5
            if (r2 == 0) goto Lc1
            java.lang.String r0 = "%"
            boolean r0 = r2.endsWith(r0)     // Catch: X.C41M -> Lc5
            if (r0 == 0) goto Lc2
        Lc1:
            r5 = 1
        Lc2:
            r9.A0H = r5     // Catch: X.C41M -> Lc5
            return
        Lc5:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.AbstractC25241Le.A00(r3, r4, r0, r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W1.A00(X.4kP, X.6W1):void");
    }

    @Override // X.C6W2
    public final boolean EPu(C6FG c6fg, Object obj, int i) {
        if (i != 35) {
            if (i != 36) {
                if (i != 38) {
                    if (i != 138) {
                        if (i != 141) {
                            switch (i) {
                                case 40:
                                    try {
                                        String str = (String) obj;
                                        float f = 0.0f;
                                        if (str != null) {
                                            f = C6BE.A01(str);
                                        }
                                        this.A0A = f;
                                        this.A0J = str.endsWith("%");
                                    } catch (C41M e) {
                                        AbstractC25241Le.A00(c6fg, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e);
                                    }
                                    View view = this.A0B;
                                    if (view == null) {
                                        return true;
                                    }
                                    float height = view.getHeight();
                                    float f2 = this.A0A;
                                    if (this.A0J) {
                                        f2 = (f2 * height) / 100.0f;
                                    }
                                    view.setTranslationY(f2);
                                    return true;
                                case Seq.NULL_REFNUM /* 41 */:
                                    try {
                                        String str2 = (String) obj;
                                        this.A02 = C6BE.A01(str2);
                                        this.A0G = str2.endsWith("%");
                                        this.A0F = true;
                                    } catch (C41M e2) {
                                        AbstractC25241Le.A00(c6fg, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e2);
                                    }
                                    View view2 = this.A0B;
                                    if (view2 == null) {
                                        return true;
                                    }
                                    float width = view2.getWidth();
                                    float f3 = this.A02;
                                    if (this.A0G) {
                                        f3 = (f3 * width) / 100.0f;
                                    }
                                    view2.setPivotX(f3);
                                    return true;
                                case Seq.RefTracker.REF_OFFSET /* 42 */:
                                    try {
                                        String str3 = (String) obj;
                                        this.A03 = C6BE.A01(str3);
                                        this.A0H = str3.endsWith("%");
                                        this.A0F = true;
                                    } catch (C41M e3) {
                                        AbstractC25241Le.A00(c6fg, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e3);
                                    }
                                    View view3 = this.A0B;
                                    if (view3 == null) {
                                        return true;
                                    }
                                    float height2 = view3.getHeight();
                                    float f4 = this.A03;
                                    if (this.A0H) {
                                        f4 = (f4 * height2) / 100.0f;
                                    }
                                    view3.setPivotY(f4);
                                    return true;
                                case 43:
                                    float floatValue = ((Number) obj).floatValue();
                                    this.A01 = floatValue;
                                    View view4 = this.A0B;
                                    if (view4 == null) {
                                        return true;
                                    }
                                    view4.setCameraDistance(C6W3.A00(view4.getContext(), floatValue));
                                    return true;
                                case 44:
                                    float floatValue2 = ((Number) obj).floatValue();
                                    this.A05 = floatValue2;
                                    View view5 = this.A0B;
                                    if (view5 == null) {
                                        return true;
                                    }
                                    view5.setRotationX(floatValue2);
                                    return true;
                                case 45:
                                    float floatValue3 = ((Number) obj).floatValue();
                                    this.A06 = floatValue3;
                                    View view6 = this.A0B;
                                    if (view6 == null) {
                                        return true;
                                    }
                                    view6.setRotationY(floatValue3);
                                    return true;
                                default:
                                    return false;
                            }
                        }
                        float floatValue4 = ((Number) obj).floatValue();
                        this.A00 = floatValue4;
                        View view7 = this.A0B;
                        if (view7 == null) {
                            return true;
                        }
                        view7.setAlpha(floatValue4);
                        return true;
                    }
                    float floatValue5 = ((Number) obj).floatValue();
                    this.A04 = floatValue5;
                    View view8 = this.A0B;
                    if (view8 == null) {
                        return true;
                    }
                    view8.setRotation(floatValue5);
                    return true;
                }
                try {
                    String str4 = (String) obj;
                    float f5 = 0.0f;
                    if (str4 != null) {
                        f5 = C6BE.A01(str4);
                    }
                    this.A09 = f5;
                    this.A0I = str4.endsWith("%");
                } catch (C41M e4) {
                    AbstractC25241Le.A00(c6fg, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e4);
                }
                View view9 = this.A0B;
                if (view9 == null) {
                    return true;
                }
                float width2 = view9.getWidth();
                float f6 = this.A09;
                if (this.A0I) {
                    f6 = (f6 * width2) / 100.0f;
                }
                view9.setTranslationX(f6);
                return true;
            }
            float floatValue6 = ((Number) obj).floatValue();
            this.A08 = floatValue6;
            View view10 = this.A0B;
            if (view10 == null) {
                return true;
            }
            view10.setScaleY(floatValue6);
            return true;
        }
        float floatValue7 = ((Number) obj).floatValue();
        this.A07 = floatValue7;
        View view11 = this.A0B;
        if (view11 == null) {
            return true;
        }
        view11.setScaleX(floatValue7);
        return true;
    }
}
