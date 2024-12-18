package X;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.ui.Modifier;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class CYF {
    /* JADX WARN: Type inference failed for: r7v21, types: [X.5YV, X.BZw] */
    public static final void A00(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, Modifier modifier, InterfaceC137546La interfaceC137546La, InterfaceC137546La interfaceC137546La2, C27866CQd c27866CQd, Integer num, Integer num2, int i, int i2, boolean z, boolean z2) {
        Integer num3;
        Modifier modifier2;
        Modifier modifier3;
        C5YV c5yv;
        Modifier modifier4;
        Modifier modifier5;
        Integer num4 = num2;
        Modifier modifier6 = modifier;
        Integer num5 = num;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC119655bO, interfaceC137546La);
        c5Tl.Enr(-250480142);
        if ((i2 & 16) != 0) {
            num5 = C05F.A0C;
        }
        if ((i2 & 32) != 0) {
            modifier6 = null;
        }
        boolean A1V = AbstractC25226BEj.A1V(i2 & 64, z2);
        if ((i2 & 128) != 0) {
            num4 = C05F.A02;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1775984990, "com.instagram.creation.genai.magicmod.common.ui.ImageWithSegmentationMaskOutline (ImageWithSegmentationMaskOutline.kt:84)");
        }
        if (AbstractC25227BEk.A1U(c5Tl, 14169293)) {
            C0fH.A01(-434253034, "com.instagram.creation.genai.magicmod.common.ui.popupScaleAnimationModifier (ImageWithSegmentationMaskOutline.kt:143)");
        }
        Integer num6 = C05F.A00;
        if (num5 == num6) {
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 952104275);
            if (A0q == C5UI.A00) {
                A0q = AbstractC25230BEn.A0R(false);
                c5Tl.FBy(A0q);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            ((C136606Go) A0q).A00(Boolean.valueOf(A1R));
            BH5 A02 = BH4.A02(c5Tl);
            C25245BFe A01 = C25245BFe.A01(AbstractC25328BIx.A00, 500, 1000);
            num3 = C05F.A01;
            JTG A012 = BH4.A01(new BH6(A01, num3), A02, c5Tl, 1.0f, 1.05f, 29112);
            modifier3 = Modifier.A00;
            float A09 = AbstractC166987dD.A09(A012.getValue());
            modifier2 = CBB.A00(modifier3, A09, A09);
        } else {
            num3 = C05F.A01;
            if (num5 != num3 && num5 != C05F.A0C) {
                throw B4Z.A00();
            }
            modifier2 = Modifier.A00;
            modifier3 = modifier2;
        }
        if (C0fH.A02()) {
            C0fH.A00(-1722775676);
        }
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
        boolean A1W = AbstractC167007dF.A1W(interfaceC137546La2);
        C137026If c137026If = new C137026If(interfaceC137546La);
        String A00 = AbstractC136736Hc.A00(c5Tl, 2131969912);
        float f = 1.0f;
        if (A1W) {
            float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
            Arrays.fill(fArr, 0, 20, 0.0f);
            fArr[0] = 1.0f;
            fArr[12] = 1.0f;
            fArr[6] = 1.0f;
            fArr[18] = 1.0f;
            fArr[0] = 0.5f;
            fArr[6] = 0.5f;
            fArr[12] = 0.5f;
            fArr[18] = 1.0f;
            ?? c5yv2 = new C5YV(new ColorMatrixColorFilter(fArr));
            c5yv2.A00 = fArr;
            c5yv = c5yv2;
        } else {
            c5yv = null;
        }
        if (modifier6 == null) {
            Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
            Modifier Eq3 = AbstractC27468CAo.A00(modifier3, bitmap.getWidth() / bitmap.getHeight(), false).Eq3(AbstractC118185Wd.A01);
            if (z) {
                f = 0.0f;
            }
            modifier4 = CB8.A00(Eq3, f);
        } else {
            modifier4 = modifier6;
        }
        C6LQ.A00(c5Tl, null, modifier4, c5yv, c137026If, C5YJ.A04, A00, 0.0f, 24584, 40);
        if (c27866CQd != null) {
            Modifier Eq32 = interfaceC119655bO.Cng(modifier3).Eq3(modifier2);
            if (AbstractC25227BEk.A1U(c5Tl, 691144964)) {
                C0fH.A01(-2124190795, "com.instagram.creation.genai.magicmod.common.ui.outlineFadeInAnimationModifier (ImageWithSegmentationMaskOutline.kt:126)");
            }
            if (num5 == num3) {
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 2017012203);
                Object obj = C5UI.A00;
                if (A0q2 == obj) {
                    A0q2 = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.0f));
                }
                InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, A0q2, false);
                C0eB c0eB = C0eB.A00;
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 2017014221);
                if (A0q3 == obj) {
                    A0q3 = new PYv(A0M, null, 23);
                    c5Tl.FBy(A0q3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, A0q3, c0eB, false);
                modifier5 = CB8.A00(modifier3, AbstractC25231BEo.A03(A0M));
            } else {
                if (num5 != num6 && num5 != C05F.A0C) {
                    throw B4Z.A00();
                }
                modifier5 = modifier3;
            }
            if (C0fH.A02()) {
                C0fH.A00(-210128254);
            }
            Modifier A0G = AbstractC25227BEk.A0G(A0K, Eq32, modifier5);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0G);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A013);
            int i3 = i >> 18;
            A01(c5Tl, c27866CQd, num4, (i3 & 112) | 8 | (i3 & 896), 0, A1V);
            c5Tl.ASW();
            CHM.A00(c5Tl, interfaceC119655bO.Cng(modifier3).Eq3(modifier2), interfaceC137546La, new C6LZ(c27866CQd.A01), null, null, 456, 16);
        }
        if (C0fH.A02()) {
            C0fH.A00(-934009607);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXI(interfaceC119655bO, interfaceC137546La, interfaceC137546La2, c27866CQd, num5, modifier6, num4, i, i2, 2, z, A1V);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (X.AbstractC166997dE.A0c(X.C06090Tz.A05, r5, 36328783304802086L).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r18, X.C27866CQd r19, java.lang.Integer r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYF.A01(X.5Tl, X.CQd, java.lang.Integer, int, int, boolean):void");
    }
}
