package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.4E9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4E9 implements InterfaceC13000lm {
    public final C4EQ A00;
    public final C4E5 A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(String str, View view) {
        JI7 ji7;
        C29452CyS c29452CyS;
        C4ER c4er;
        C4EQ c4eq = this.A00;
        Reference reference = (Reference) c4eq.A00.remove(str);
        if (reference != null && (ji7 = (JI7) reference.get()) != null) {
            C0YZ c0yz = new C0YZ(ji7.getClass());
            if (c0yz.equals(new C0YZ(BFT.class))) {
                C4ET c4et = c4eq.A03;
                BFT bft = (BFT) ji7;
                C14360o3.A0B(bft, 0);
                C4E5 c4e5 = bft.A00;
                if (c4e5.A09 || c4e5.A0A) {
                    c4et.A00.A05(bft);
                }
                if (c4e5.A0B && view != null) {
                    c4et.A01.A01.EGO(view);
                }
                c4et.A02.remove(view);
                return;
            }
            if (c0yz.equals(new C0YZ(AbstractC29453CyT.class))) {
                throw new NullPointerException("getConfig");
            }
            if (c0yz.equals(new C0YZ(C29451CyR.class))) {
                C4EW c4ew = c4eq.A02;
                C29451CyR c29451CyR = (C29451CyR) ji7;
                C14360o3.A0B(c29451CyR, 0);
                C4E5 c4e52 = c29451CyR.A00;
                if (!c4e52.A09 && !c4e52.A0A) {
                    return;
                }
                c4er = c4ew.A00;
                c29452CyS = c29451CyR;
            } else {
                if (!c0yz.equals(new C0YZ(C29452CyS.class))) {
                    return;
                }
                C4EX c4ex = c4eq.A01;
                C29452CyS c29452CyS2 = (C29452CyS) ji7;
                C14360o3.A0B(c29452CyS2, 0);
                C4E5 c4e53 = c29452CyS2.A00;
                if (!c4e53.A09 && !c4e53.A0A) {
                    return;
                }
                c4er = c4ex.A00;
                c29452CyS = c29452CyS2;
            }
            c4er.A05(c29452CyS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(ICP icp, InterfaceC43457JHv interfaceC43457JHv, JI7 ji7) {
        WeakHashMap weakHashMap;
        InterfaceC58972mv BXB;
        C29452CyS c29452CyS;
        BFT bft;
        ICP icp2 = icp;
        if (this.A02) {
            ji7.Aq8().A00 = this.A03;
            C4EQ c4eq = this.A00;
            C0YZ c0yz = new C0YZ(ji7.getClass());
            if (c0yz.equals(new C0YZ(BFT.class))) {
                C4ET c4et = c4eq.A03;
                BFT bft2 = (BFT) ji7;
                synchronized (c4et) {
                    View view = (View) bft2.A01.get();
                    if (view != null) {
                        C4E5 c4e5 = bft2.A00;
                        boolean z = c4e5.A09;
                        if (z || c4e5.A0A) {
                            if (c4e5.A00 && (bft = (BFT) c4et.A02.get(view)) != null) {
                                c4et.A00.A05(bft);
                            }
                            C4ER c4er = c4et.A00;
                            C37869GlO c37869GlO = C37869GlO.A00;
                            if (!z) {
                                icp2 = null;
                            }
                            c4er.A04(icp2, interfaceC43457JHv, c4et, bft2, c37869GlO, false);
                        }
                        if (c4e5.A0B) {
                            C4ES c4es = c4et.A01;
                            c4es.A01.AAU(new J2R(bft2, c4es), view, interfaceC43457JHv.BrL(), bft2.Aq2(), false);
                        }
                        c4et.A02.put(view, bft2);
                    }
                }
            } else {
                if (c0yz.equals(new C0YZ(AbstractC29453CyT.class))) {
                    throw new NullPointerException("getView");
                }
                if (c0yz.equals(new C0YZ(C29451CyR.class))) {
                    C4EW c4ew = c4eq.A02;
                    C29451CyR c29451CyR = (C29451CyR) ji7;
                    C4E5 c4e52 = c29451CyR.A00;
                    if (c4e52.A09 || c4e52.A0A) {
                        c4ew.A00.A04(null, interfaceC43457JHv, c4ew, c29451CyR, C43367JEi.A00, false);
                    }
                    weakHashMap = c4ew.A01;
                    BXB = c29451CyR.BXB();
                    c29452CyS = c29451CyR;
                } else if (c0yz.equals(new C0YZ(C29452CyS.class))) {
                    C4EX c4ex = c4eq.A01;
                    C29452CyS c29452CyS2 = (C29452CyS) ji7;
                    C4E5 c4e53 = c29452CyS2.A00;
                    if (c4e53.A09 || c4e53.A0A) {
                        c4ex.A00.A04(null, interfaceC43457JHv, c4ex, c29452CyS2, C43366JEh.A00, true);
                    }
                    weakHashMap = c4ex.A01;
                    BXB = c29452CyS2.BXB();
                    c29452CyS = c29452CyS2;
                }
                weakHashMap.put(BXB, c29452CyS);
            }
            String Aq2 = ji7.Aq2();
            C3ND c3nd = c4eq.A00;
            c3nd.remove(Aq2);
            c3nd.put(Aq2, new WeakReference(ji7));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C4ER c4er = this.A00.A04;
        synchronized (c4er) {
            if (c4er.A01) {
                c4er.A01 = false;
                c4er.A02();
            }
        }
        c4er.A03();
    }

    public C4E9(UserSession userSession, C4E5 c4e5, String str, boolean z) {
        this.A01 = c4e5;
        this.A02 = z;
        C4EA c4ea = new C4EA(str, new WeakReference(userSession));
        C14360o3.A0B(userSession, 0);
        C4EG c4eg = (C4EG) userSession.A01(C4EG.class, new C29892DGg(userSession, 27));
        this.A03 = C18U.A06(C06090Tz.A05, userSession, 36313424504424451L);
        this.A00 = new C4EQ(c4ea, c4eg, C3K9.A01, C4EP.A01);
    }
}
