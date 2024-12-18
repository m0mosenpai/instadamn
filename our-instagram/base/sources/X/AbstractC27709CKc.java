package X;

/* renamed from: X.CKc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27709CKc {
    public static final void A00(C5Tl c5Tl, C75363a3 c75363a3, L86 l86, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        C14360o3.A0B(c75363a3, 0);
        AbstractC167027dH.A13(interfaceC16820sZ, interfaceC16820sZ2, l86);
        c5Tl.Enr(700046259);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c75363a3) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, l86);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1066389930, "com.instagram.wonderwall.ui.compose.components.video.WallVideoPlaybackEffect (WallVideoPlayBackEffect.kt:21)");
            }
            C07T lifecycle = ((C07X) c5Tl.AJX(C5VN.A00)).getLifecycle();
            String A02 = c75363a3.A02();
            c5Tl.Eno(946764899);
            boolean z = true;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, lifecycle, AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED), AbstractC167007dF.A1P(i2 & 14, 4)) | AbstractC167007dF.A1P(i2 & 896, 256);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1U | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new PZR(interfaceC16820sZ2, l86, c75363a3, lifecycle, interfaceC16820sZ, null, 6);
                c5Tl.FBy(EEc);
            }
            AbstractC25231BEo.A10(c5Tl, EEc, A02);
            if (C0fH.A02()) {
                C0fH.A00(388765280);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c75363a3, l86, interfaceC16820sZ, interfaceC16820sZ2, i, 29);
        }
    }
}
