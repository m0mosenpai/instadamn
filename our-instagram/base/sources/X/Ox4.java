package X;

import android.net.NetworkInfo;

/* loaded from: classes9.dex */
public final class Ox4 implements InterfaceC15680qO {
    public final int A00;
    public final Object A01;

    public Ox4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        NetworkInfo.State state;
        JIM A05;
        switch (this.A00) {
            case 0:
                C55213OeY c55213OeY = ((OWf) this.A01).A03;
                if (c55213OeY == null) {
                    return;
                }
                String str = null;
                if (networkInfo != null && (state = networkInfo.getState()) != null) {
                    str = state.name();
                }
                C55213OeY.A03(new P9r(str), c55213OeY);
                return;
            case 1:
                if (networkInfo == null || !networkInfo.isConnected()) {
                    return;
                }
                C37662Ghv c37662Ghv = (C37662Ghv) this.A01;
                c37662Ghv.A04.post(new PPA(c37662Ghv));
                return;
            default:
                C37560GgG c37560GgG = (C37560GgG) this.A01;
                C25370BKn A04 = C37560GgG.A04(c37560GgG);
                if (A04 != null && !c37560GgG.A0d(A04) && networkInfo != null && networkInfo.isConnected() && (A05 = C37560GgG.A05(c37560GgG, A04)) != null) {
                    A05.EKu();
                    return;
                }
                return;
        }
    }
}
