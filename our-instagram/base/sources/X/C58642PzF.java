package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PzF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58642PzF implements YO0 {
    public boolean A00 = false;
    public final C58623Pyr A01;
    public final /* synthetic */ C48262Jq A02;

    public C58642PzF(C58623Pyr c58623Pyr, C48262Jq c48262Jq) {
        this.A02 = c48262Jq;
        this.A01 = c58623Pyr;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        int i;
        C58427Pv6 c58427Pv6;
        Integer valueOf;
        C62674SLm c62674SLm;
        Exception A18;
        C48262Jq c48262Jq = this.A02;
        synchronized (c48262Jq) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            if (c5ks.A0F()) {
                if (c5ks.A06() == null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C58623Pyr c58623Pyr = this.A01;
                    C58621Pyp c58621Pyp = c58623Pyr.A01;
                    java.util.Set set = c58621Pyp.A02;
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A1E.add(Boolean.valueOf(AbstractC167007dF.A1X(C0g3.A00().A01(AbstractC10100gN.A00(AbstractC166987dD.A1B(it))), C05F.A0C)));
                    }
                    if (c5ks.A05() != null) {
                        A18 = c5ks.A05();
                    } else {
                        A18 = AbstractC166987dD.A18("No download exception found");
                    }
                    C0K8.A0N("GooglePlayDownloader", "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s", A18, set.toString(), Pv4.A00(c58621Pyp.A01), A1E.toString());
                    c5ks.A05();
                    c58623Pyr.A00.A00(AbstractC166987dD.A18("Play Core returned an successful task but null result found."));
                    return;
                }
                if (c5ks.A06().equals(0)) {
                    c58427Pv6 = this.A01.A00;
                    c62674SLm = new C62674SLm(null, null, 1);
                } else {
                    synchronized (c48262Jq) {
                        c48262Jq.A0C.put((Integer) c5ks.A06(), this.A01);
                        c48262Jq.A02 = true;
                    }
                    return;
                }
            } else {
                Exception A05 = c5ks.A05();
                if (A05 instanceof N20) {
                    i = ((Rk3) A05).A00.A00;
                } else {
                    i = 0;
                }
                c58427Pv6 = this.A01.A00;
                Exception A052 = c5ks.A05();
                if (i == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(i);
                }
                c62674SLm = new C62674SLm(A052, valueOf, 2);
            }
            c58427Pv6.A01(c62674SLm);
        }
    }
}
