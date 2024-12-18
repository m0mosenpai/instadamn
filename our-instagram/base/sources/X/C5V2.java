package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5V2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5V2 {
    public static final C5UP A0F = new C5UQ(C5V3.A00);
    public static final C5UP A0G = new C5UQ(C5V4.A00);
    public static final C5UP A0H = new C5UQ(C5V5.A00);
    public static final C5UP A00 = new C5UQ(C5V6.A00);
    public static final C5UP A04 = new C5UQ(C5V7.A00);
    public static final C5UP A01 = new C5UQ(C5V8.A00);
    public static final C5UP A02 = new C5UQ(C5V9.A00);
    public static final C5UP A0I = new C5UQ(C5VA.A00);
    public static final C5UP A03 = new C5UQ(C5VB.A00);
    public static final C5UP A05 = new C5UQ(C5VC.A00);
    public static final C5UP A06 = new C5UQ(C5VD.A00);
    public static final C5UP A07 = new C5UQ(C5VE.A00);
    public static final C5UP A0J = new C5UQ(C5VF.A00);
    public static final C5UP A0A = new C5UQ(C5VG.A00);
    public static final C5UP A0B = new C5UQ(C5VH.A00);
    public static final C5UP A0C = new C5UQ(C5VI.A00);
    public static final C5UP A0D = new C5UQ(C5VJ.A00);
    public static final C5UP A0E = new C5UQ(C5VK.A00);
    public static final C5UP A08 = new C5UQ(C5VL.A00);
    public static final C5UP A09 = new C117745Uk(AbstractC74873Yc.A00(), C5VM.A00);

    public static final /* synthetic */ void A01(String str) {
        throw new IllegalStateException(AnonymousClass001.A0g("CompositionLocal ", str, " not present"));
    }

    public static final void A00(C5Tl c5Tl, InterfaceC1128457r interfaceC1128457r, InterfaceC117815Ur interfaceC117815Ur, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        boolean AH6;
        boolean AH62;
        c5Tl.Enr(874662829);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                AH62 = c5Tl.AH4(interfaceC1128457r);
            } else {
                AH62 = c5Tl.AH6(interfaceC1128457r);
            }
            int i3 = 2;
            if (AH62) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                AH6 = c5Tl.AH4(interfaceC117815Ur);
            } else {
                AH6 = c5Tl.AH6(interfaceC117815Ur);
            }
            int i4 = 16;
            if (AH6) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i5 = 128;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2047210048, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1128457r;
            C117685Ud A022 = A0F.A02(androidComposeView.A0c);
            C117685Ud A023 = A0G.A02(androidComposeView.A0P);
            C117685Ud A024 = A0H.A02(androidComposeView.A0Q);
            C117685Ud A025 = A00.A02(androidComposeView.A0d);
            C117685Ud A026 = A01.A02(interfaceC1128457r.getDensity());
            C117685Ud A027 = A02.A02(androidComposeView.A0S);
            C117685Ud A028 = A0I.A02(androidComposeView.A0m);
            A028.A00 = false;
            C117685Ud A029 = A03.A02(interfaceC1128457r.getFontFamilyResolver());
            A029.A00 = false;
            AbstractC117695Ue.A01(c5Tl, interfaceC16620sF, new C117685Ud[]{A022, A023, A024, A025, A026, A027, A028, A029, A05.A02(androidComposeView.A0U), A06.A02(androidComposeView.A0V), A07.A02(interfaceC1128457r.getLayoutDirection()), A0J.A02(androidComposeView.A0n), A0A.A02(androidComposeView.A0h), A0B.A02(androidComposeView.A0i), A0C.A02(interfaceC117815Ur), A0D.A02(androidComposeView.A0j), A0E.A02(androidComposeView.A0k), A08.A02(androidComposeView.A0W), A04.A02(androidComposeView.A0T)}, ((i2 >> 3) & 112) | 8);
            if (C0fH.A02()) {
                C0fH.A00(-903877637);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C9FR(i, 2, interfaceC117815Ur, interfaceC1128457r, interfaceC16620sF);
        }
    }
}
