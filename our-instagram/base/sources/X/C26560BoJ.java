package X;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* renamed from: X.BoJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26560BoJ extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
    
        if (r2 != false) goto L12;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r20) {
        /*
            r19 = this;
            r4 = 0
            r5 = r20
            X.C14360o3.A0B(r5, r4)
            r11 = r19
            boolean r2 = r11.A06
            r14 = 0
            if (r2 != 0) goto L12
            boolean r0 = r11.A05
            if (r0 != 0) goto L12
            return r14
        L12:
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            android.content.Context r1 = X.AbstractC77363dM.A00(r5)
            X.2XE r6 = r5.A05
            android.content.Context r7 = X.AbstractC25225BEi.A0E(r6)
            android.content.Context r0 = X.AbstractC53172bz.A01(r7)
            int r0 = X.AbstractC53242c7.A02(r0)
            int r8 = r1.getColor(r0)
            r9.setColor(r8)
            long r0 = X.AbstractC77623dm.A07(r5)
            int r0 = X.AbstractC25228BEl.A07(r5, r0)
            float r0 = (float) r0
            r9.setCornerRadius(r0)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            android.content.Context r5 = X.AbstractC77363dM.A00(r5)
            android.content.Context r1 = X.AbstractC53172bz.A01(r7)
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            int r0 = r5.getColor(r0)
            r3.setColor(r0)
            X.2Z0 r5 = X.AbstractC167007dF.A0P(r6)
            X.3ay r0 = X.C51722Yv.A02
            java.lang.Integer r6 = X.C05F.A00
            r7 = 4
            X.2Yv r10 = X.C9CV.A00(r14, r6, r9, r7)
            X.2Z0 r9 = X.AbstractC25232BEp.A13(r5)
            boolean r0 = r11.A05
            if (r0 == 0) goto Lfa
            r0 = 41
            X.X32 r13 = new X.X32
            r13.<init>(r11, r0)
            r12 = 2131238194(0x7f081d32, float:1.809266E38)
            r1 = 2131954805(0x7f130c75, float:1.954612E38)
            r0 = 1
            X.2WH r0 = A03(r9, r13, r12, r1, r0)
            r9.A00(r0)
            if (r2 == 0) goto Lb3
            r0 = 2131165237(0x7f070035, float:1.7944685E38)
            long r0 = X.AbstractC77623dm.A0D(r9, r0)
            java.lang.Integer r2 = X.C05F.A01
            X.9CU r0 = X.AbstractC25225BEi.A0n(r2, r4, r0)
            X.2Yv r0 = X.AbstractC25233BEq.A0V(r14, r0, r6, r3, r7)
            X.2WH r0 = X.AbstractC76963ci.A0M(r9, r0)
            r9.A00(r0)
        L9b:
            r12 = 2131238989(0x7f08204d, float:1.8094272E38)
            boolean r3 = r11.A03
            if (r3 != 0) goto Lef
            r2 = 2131954811(0x7f130c7b, float:1.9546132E38)
        La5:
            r1 = 42
            X.X32 r0 = new X.X32
            r0.<init>(r11, r1)
            X.2WH r0 = A03(r9, r0, r12, r2, r3)
            r9.A00(r0)
        Lb3:
            X.AbstractC25227BEk.A1H(r9, r5, r10)
            r0 = 2131240258(0x7f082542, float:1.8096846E38)
            android.graphics.drawable.Drawable r0 = X.AbstractC25228BEl.A0N(r5, r0)
            X.AbstractC166997dE.A1F(r0, r8)
            X.2Yv r3 = X.C9CV.A00(r14, r6, r0, r7)
            long r1 = X.AbstractC77623dm.A0A(r5)
            java.lang.Integer r0 = X.C05F.A01
            X.2Yv r1 = X.C9CU.A00(r3, r0, r4, r1)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            X.9CU r0 = X.AbstractC25230BEn.A0h(r5, r6, r0, r4)
            X.2Yv r0 = X.AbstractC25234BEr.A0H(r1, r0, r6)
            X.2WH r0 = X.AbstractC76963ci.A0M(r5, r0)
            r5.A00(r0)
            java.util.List r0 = r5.A01
            X.2WF r13 = new X.2WF
            r15 = r14
            r16 = r14
            r18 = r4
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        Lef:
            boolean r0 = r11.A04
            r2 = 2131954807(0x7f130c77, float:1.9546124E38)
            if (r0 == 0) goto La5
            r2 = 2131954806(0x7f130c76, float:1.9546122E38)
            goto La5
        Lfa:
            if (r2 == 0) goto Lb3
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26560BoJ.A0Y(X.3bS):X.2Vc");
    }

    public static final C2WH A03(C2Z1 c2z1, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        StateListDrawable stateListDrawable;
        int A03;
        int A02;
        float[] fArr = new float[8];
        Arrays.fill(fArr, AbstractC25228BEl.A0A(c2z1, AbstractC77623dm.A07(c2z1)));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, true, 4));
        if (z) {
            stateListDrawable = new StateListDrawable();
            int[] iArr = {R.attr.state_pressed};
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(AbstractC77623dm.A03(c2z1, com.facebook.R.color.primary_text_disabled_material_dark));
            stateListDrawable.addState(iArr, shapeDrawable);
        } else {
            stateListDrawable = null;
        }
        Integer num2 = C05F.A00;
        C51722Yv A0c = AbstractC25233BEq.A0c(AbstractC25231BEo.A0Y(C9CV.A00(A0h, num2, stateListDrawable, 4), new C50368MLv(interfaceC16820sZ, 6)), C05F.A0F, z);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        Drawable A0N = AbstractC25228BEl.A0N(A0L, i);
        if (z) {
            Context context = A0L.A00.A0C;
            A03 = context.getColor(AbstractC53242c7.A0A(context));
        } else {
            A03 = AbstractC77623dm.A03(A0L, com.facebook.R.color.gradient_light);
        }
        AbstractC166997dE.A1F(A0N, A03);
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, num2, 0, AbstractC77623dm.A0C(A0L)), num, 0, AbstractC77623dm.A0C(A0L));
        long A0D = AbstractC77623dm.A0D(A0L, com.facebook.R.dimen.abc_edit_text_inset_top_material);
        long A0B = AbstractC77623dm.A0B(A0L);
        long A0A = AbstractC77623dm.A0A(A0L);
        long A0B2 = AbstractC77623dm.A0B(A0L);
        C51722Yv A14 = AbstractC25232BEp.A14(A00, 0, A0D);
        Integer num3 = C05F.A08;
        C51722Yv A002 = C9CU.A00(A14, num3, 0, A0B);
        Integer num4 = C05F.A09;
        C51722Yv A003 = C9CU.A00(A002, num4, 0, A0A);
        Integer num5 = C05F.A0A;
        C51722Yv A0H = AbstractC25234BEr.A0H(A003, AbstractC25225BEi.A0n(num5, 0, A0B2), num2);
        C2XE c2xe = A0L.A00;
        AbstractC25234BEr.A0r(A0N, c2xe, A0L, A0H);
        long A0B3 = AbstractC77623dm.A0B(A0L);
        C51722Yv A004 = C9CU.A00(C9CU.A00(C9CU.A00(null, num3, 0, A0B3), num4, 0, AbstractC77623dm.A0D(A0L, com.facebook.R.dimen.abc_edit_text_inset_top_material)), num5, 0, AbstractC77623dm.A0B(A0L));
        String A0F = AbstractC77623dm.A0F(A0L, i2);
        Integer num6 = C05F.A0j;
        if (z) {
            A02 = AbstractC53172bz.A01(AbstractC77363dM.A00(A0L)).getColor(AbstractC53242c7.A0A(c2xe.A0C));
        } else {
            A02 = A0L.BoZ().A02(com.facebook.R.color.gradient_light);
        }
        long A0r = AbstractC25232BEp.A0r(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, com.facebook.R.style.igds_emphasized_body_2);
        AbstractC25233BEq.A1B(A0L, A0a, A02, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0L, A0a, A0D2);
        AbstractC25234BEr.A1F(A0a, num6, num2);
        A0a.A0E();
        AbstractC25229BEm.A1E(A0a);
        AbstractC25233BEq.A1A(A0L, A004, A0a);
        return AbstractC76963ci.A0I(A0L, c2z1, A0c);
    }

    public C26560BoJ(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A02 = interfaceC16660sJ;
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16660sJ2;
        this.A06 = z3;
        this.A05 = z4;
    }
}
