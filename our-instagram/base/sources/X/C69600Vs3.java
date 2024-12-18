package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.Vs3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69600Vs3 {
    public C135266Ab A00;
    public C135266Ab A01;
    public final CUA A02;
    public final C68888Vdk A03;
    public final C6FG A04;

    public final C79243gV A00(View view, C102884kP c102884kP) {
        int i;
        int i2;
        int makeMeasureSpec;
        C135266Ab A03;
        C102884kP A08 = c102884kP.A08(43);
        if (A08 != null) {
            float A00 = VSE.A00(A08, 49);
            float A002 = VSE.A00(A08, 43);
            Resources resources = view.getResources();
            C6FG c6fg = this.A04;
            Context context = c6fg.A00;
            float min = Math.min(resources.getDisplayMetrics().widthPixels * 0.8f, VSI.A00(context, 300.0f));
            if (A00 == 0.0f) {
                i = (int) min;
                int i3 = AbstractC75953b0.A00;
                i2 = Integer.MIN_VALUE;
            } else {
                i = (int) A00;
                int i4 = AbstractC75953b0.A00;
                i2 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i, i2);
            if (A002 == 0.0f) {
                makeMeasureSpec = AbstractC75953b0.A00;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) A002, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }
            CUA cua = this.A02;
            cua.A00 = null;
            C135276Ac c135276Ac = C135266Ab.A04;
            C135266Ab A032 = c135276Ac.A03(c135276Ac.A01(context, this.A01, c6fg, null, -1), A08, null, AbstractC78403f6.A00(makeMeasureSpec2, makeMeasureSpec));
            this.A01 = A032;
            C79243gV c79243gV = A032.A01;
            int A01 = c79243gV.A01();
            int A003 = c79243gV.A00();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            C69780VvH c69780VvH = new C69780VvH(displayMetrics.widthPixels, displayMetrics.heightPixels, iArr[0], iArr[1], view.getWidth(), view.getHeight(), A01, A003, VSF.A00(AbstractC166997dE.A0L(view)));
            C68888Vdk c68888Vdk = this.A03;
            HashMap hashMap = c68888Vdk.A01;
            SPC spc = (SPC) hashMap.get(c69780VvH);
            if (spc == null) {
                InterfaceC103384lE A0B = c102884kP.A0B(40);
                if (A0B != null) {
                    C6FG c6fg2 = c68888Vdk.A00;
                    Context context2 = c6fg2.A00;
                    C6FX c6fx = new C6FX();
                    float f = c69780VvH.A05;
                    DisplayMetrics A0K = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K);
                    c6fx.A03(Float.valueOf(f / A0K.density), 0);
                    float f2 = c69780VvH.A04;
                    DisplayMetrics A0K2 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K2);
                    c6fx.A03(Float.valueOf(f2 / A0K2.density), 1);
                    float f3 = c69780VvH.A02;
                    DisplayMetrics A0K3 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K3);
                    c6fx.A03(Float.valueOf(f3 / A0K3.density), 2);
                    float f4 = c69780VvH.A03;
                    DisplayMetrics A0K4 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K4);
                    c6fx.A03(Float.valueOf(f4 / A0K4.density), 3);
                    float f5 = c69780VvH.A01;
                    DisplayMetrics A0K5 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K5);
                    c6fx.A03(Float.valueOf(f5 / A0K5.density), 4);
                    float f6 = c69780VvH.A00;
                    DisplayMetrics A0K6 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K6);
                    c6fx.A03(Float.valueOf(f6 / A0K6.density), 5);
                    float f7 = c69780VvH.A07;
                    DisplayMetrics A0K7 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K7);
                    c6fx.A03(Float.valueOf(f7 / A0K7.density), 6);
                    float f8 = c69780VvH.A06;
                    DisplayMetrics A0K8 = AbstractC167007dF.A0K(context2);
                    C14360o3.A07(A0K8);
                    c6fx.A03(Float.valueOf(f8 / A0K8.density), 7);
                    c6fx.A03(Boolean.valueOf(c69780VvH.A08), 8);
                    Object A004 = C131845xK.A00(C6FQ.A01(c6fg2, A0B, c102884kP.A0A), c6fx.A00(), A0B);
                    C14360o3.A07(A004);
                    C102884kP c102884kP2 = (C102884kP) A004;
                    C14360o3.A0B(c102884kP2, 0);
                    float A02 = c102884kP2.A02(43, 0.0f);
                    float A022 = c102884kP2.A02(44, 0.0f);
                    float A023 = c102884kP2.A02(42, 0.0f);
                    float A024 = c102884kP2.A02(41, 0.0f);
                    float A025 = c102884kP2.A02(38, 0.0f);
                    float A026 = c102884kP2.A02(40, 0.0f);
                    float A027 = c102884kP2.A02(48, 0.0f);
                    float A028 = c102884kP2.A02(46, 0.0f);
                    float A029 = c102884kP2.A02(55, 0.0f);
                    float A0210 = c102884kP2.A02(56, 0.0f);
                    float A0211 = c102884kP2.A02(54, 0.0f);
                    float A0212 = c102884kP2.A02(53, 0.0f);
                    String A0L = c102884kP2.A0L(45);
                    for (EnumC61153RgE enumC61153RgE : EnumC61153RgE.values()) {
                        if (C14360o3.A0K(enumC61153RgE.A00, A0L)) {
                            String A0G = c102884kP2.A0G();
                            for (EnumC61161RgM enumC61161RgM : EnumC61161RgM.values()) {
                                if (C14360o3.A0K(enumC61161RgM.A00, A0G)) {
                                    spc = new SPC(new RectF(VSI.A00(context2, A02), VSI.A00(context2, A022), VSI.A00(context2, A02 + A023), VSI.A00(context2, A022 + A024)), new RectF(VSI.A00(context2, A029), VSI.A00(context2, A0210), VSI.A00(context2, A029 + A0211), VSI.A00(context2, A0210 + A0212)), new RectF(VSI.A00(context2, A025), VSI.A00(context2, A026), VSI.A00(context2, A025 + A027), VSI.A00(context2, A026 + A028)), enumC61161RgM, enumC61153RgE);
                                    hashMap.put(c69780VvH, spc);
                                }
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            if (C14360o3.A0K(cua.A00, spc)) {
                A03 = this.A00;
                if (A03 == null) {
                    return null;
                }
            } else {
                cua.A00 = spc;
                C78473fD A012 = c135276Ac.A01(context, this.A00, c6fg, null, -1);
                RectF rectF = spc.A02;
                int width = (int) rectF.width();
                int height = (int) rectF.height();
                A03 = c135276Ac.A03(A012, A08, null, C78443fA.A00.A00(width, width, height, height));
                this.A00 = A03;
            }
            return A03.A01;
        }
        throw new IllegalArgumentException("Server should have ensured that the Tooltip Container always has a Tooltip.");
    }

    public C69600Vs3(CUA cua, C6FG c6fg) {
        this.A04 = c6fg;
        this.A02 = cua;
        this.A03 = new C68888Vdk(c6fg);
    }
}
