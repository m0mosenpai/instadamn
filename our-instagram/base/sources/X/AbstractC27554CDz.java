package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.CDz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27554CDz {
    public static final void A00(C5Tl c5Tl, int i, int i2) {
        int i3;
        C5UU ASZ;
        int i4;
        c5Tl.Enr(2038568695);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1704524422, "com.instagram.barcelona.creation.poll.ui.PollCountdownTimer (PollCountdownTimer.kt:17)");
            }
            long j = i;
            if (j - (System.currentTimeMillis() / 1000) < 0) {
                if (C0fH.A02()) {
                    C0fH.A00(1780722132);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 0;
                C30483DbS.A00(ASZ, i, i2, i4);
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -123649578);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, C23831Eq.A02(TimeUnit.SECONDS.toMillis(j - (System.currentTimeMillis() / 1000))));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C0eB c0eB = C0eB.A00;
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -123643618, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == obj) {
                EEc = new DHO(i, 8, interfaceC74953Yl);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1J(c5Tl, c117505Tk, EEc, c0eB, false);
            C5WR.A0u(c5Tl, AbstractC25225BEi.A0Y(c5Tl), AbstractC25228BEl.A17(c5Tl, interfaceC74953Yl.getValue(), 2131953702), AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1776918677);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 1;
            C30483DbS.A00(ASZ, i, i2, i4);
        }
    }
}
