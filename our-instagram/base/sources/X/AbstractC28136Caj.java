package X;

/* renamed from: X.Caj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28136Caj {
    public static final C5UP A00 = new C5UQ(DE6.A00);

    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(interfaceC16620sF, 0);
        c5Tl.Enr(-314605014);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1498347061, "com.instagram.wonderwall.ui.compose.components.video.ProvideWallMediaPlaybackManager (ProvideWallMediaPlaybackManager.kt:21)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1574571925);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new CT6();
                c5Tl.FBy(A0q);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C0eB c0eB = C0eB.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1574569807);
            if (A0q2 == obj) {
                A0q2 = new PYu(A0q, null, 27);
                c5Tl.FBy(A0q2);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, A0q2, c0eB, false);
            AbstractC117695Ue.A00(c5Tl, A00.A02(A0q), interfaceC16620sF, ((i2 << 3) & 112) | 8);
            if (C0fH.A02()) {
                C0fH.A00(1590070743);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, interfaceC16620sF, i, 9);
        }
    }
}
