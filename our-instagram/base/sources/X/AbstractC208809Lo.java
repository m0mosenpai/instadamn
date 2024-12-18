package X;

import android.os.Handler;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;

/* renamed from: X.9Lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208809Lo {
    public final RunnableC208819Lp A00;

    public boolean A07() {
        return false;
    }

    public void A02() {
        InterfaceC25217BDq interfaceC25217BDq;
        if (this instanceof C219899nb) {
            C9MF.A02(((C219899nb) this).A02);
            return;
        }
        C219909nc c219909nc = (C219909nc) this;
        C219919nd c219919nd = c219909nc.A05;
        if (!c219919nd.A0H.get() && (interfaceC25217BDq = ((C9KW) c219919nd).A05) != null) {
            interfaceC25217BDq.DHN("onFinish");
        }
        c219909nc.A08();
        ABZ abz = c219909nc.A01;
        if (abz.A00 == 4) {
            return;
        }
        abz.A00 = 4;
    }

    public void A03() {
        ClipInfo clipInfo;
        if (this instanceof C219909nc) {
            C219909nc c219909nc = (C219909nc) this;
            ABZ abz = c219909nc.A01;
            if (abz.A00 == 0) {
                abz.A00 = 1;
            }
            ((AbstractC208809Lo) c219909nc).A00.A02(C05F.A01);
            C47Z c47z = ((C9KW) c219909nc.A05).A09;
            if (c47z != null && (clipInfo = c47z.A1N) != null) {
                c219909nc.A02.A02(clipInfo, false);
            }
            c219909nc.A09("oninit", null);
            return;
        }
        C219899nb c219899nb = (C219899nb) this;
        c219899nb.A00.A02(C05F.A01);
        C9MF c9mf = c219899nb.A02;
        C9MF.A03(c9mf);
        C208719Lf c208719Lf = c219899nb.A01;
        C47Z c47z2 = ((C9KW) c9mf).A09;
        if (c47z2 != null) {
            c208719Lf.A02(c47z2.A1N, true);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public void A04() {
        C208719Lf c208719Lf;
        InterfaceC25217BDq interfaceC25217BDq;
        if (this instanceof C219909nc) {
            C219909nc c219909nc = (C219909nc) this;
            C219919nd c219919nd = c219909nc.A05;
            if (!c219919nd.A0H.get() && (interfaceC25217BDq = ((C9KW) c219919nd).A05) != null) {
                interfaceC25217BDq.DHN("onPause");
            }
            ((C9KW) c219919nd).A00 = c219919nd.A07();
            c219909nc.A08();
            ABZ abz = c219909nc.A01;
            if (abz.A00 == 2) {
                abz.A00 = 3;
            }
            c208719Lf = c219909nc.A02;
        } else {
            C219899nb c219899nb = (C219899nb) this;
            C9MF.A02(c219899nb.A02);
            c208719Lf = c219899nb.A01;
        }
        c208719Lf.E3e();
    }

    public void A05() {
        if (this instanceof C219899nb) {
            C219899nb c219899nb = (C219899nb) this;
            c219899nb.A01.EKi();
            C9MF.A03(c219899nb.A02);
            return;
        }
        C219909nc c219909nc = (C219909nc) this;
        c219909nc.A02.EKi();
        ABZ abz = c219909nc.A01;
        int i = abz.A00;
        if (i == 1 || i == 3) {
            abz.A00 = 2;
        }
        c219909nc.A09("onresume", null);
        C219919nd c219919nd = c219909nc.A05;
        if (!c219919nd.A09) {
            return;
        }
        int i2 = c219919nd.A01;
        C55208OeM c55208OeM = c219919nd.A05;
        if (c55208OeM != null) {
            c55208OeM.A09(i2);
        }
        c219919nd.A09 = false;
    }

    public void A06() {
        InterfaceC25217BDq interfaceC25217BDq;
        if (this instanceof C219899nb) {
            final C9MF c9mf = ((C219899nb) this).A02;
            final InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c9mf).A04;
            if (interfaceC25215BDn != null) {
                ((C9KW) c9mf).A01.post(new Runnable() { // from class: X.9MS
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25215BDn.this.Dz9(c9mf.A0I);
                    }
                });
            }
            if (!((C9KW) c9mf).A0A.isEmpty()) {
                C95334Qt c95334Qt = c9mf.A04;
                if (c95334Qt != null) {
                    if (c95334Qt.A09.A0I.A0J()) {
                        ((C9KW) c9mf).A01.post(new Runnable() { // from class: X.9N4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9MF c9mf2 = C9MF.this;
                                Iterator it = ((C9KW) c9mf2).A0A.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC184058Eu) it.next()).DzQ(c9mf2.A0I);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        C219909nc c219909nc = (C219909nc) this;
        C219919nd c219919nd = c219909nc.A05;
        Handler handler = c219919nd.A0C;
        handler.post(c219909nc.A04);
        if (!c219909nc.A01.A00() && !c219919nd.A0N() && c219909nc.A00 > 0) {
            Runnable runnable = c219909nc.A03;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 100L);
        }
        if (!c219919nd.A0H.compareAndSet(false, true) || (interfaceC25217BDq = ((C9KW) c219919nd).A05) == null) {
            return;
        }
        interfaceC25217BDq.onFirstFrameRendered();
    }

    public AbstractC208809Lo(RunnableC208819Lp runnableC208819Lp) {
        this.A00 = runnableC208819Lp;
        runnableC208819Lp.A03 = this;
    }
}
