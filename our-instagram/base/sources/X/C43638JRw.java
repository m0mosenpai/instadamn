package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.JRw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43638JRw implements MSH {
    public final /* synthetic */ JR2 A00;

    @Override // X.MSH
    public final C44079Je4 C79(C2EC c2ec) {
        if (c2ec == null) {
            return null;
        }
        int CBz = c2ec.CBz();
        JR2 jr2 = this.A00;
        if (!AbstractC31234DoH.A00(jr2.A0p(), CBz)) {
            return null;
        }
        C93814Jp c93814Jp = (C93814Jp) jr2.A2p.getValue();
        String C7I = c2ec.C7I();
        String C7q = c2ec.C7q();
        if (C7I == null && C7q == null) {
            return null;
        }
        return (C44079Je4) c93814Jp.A01.A00(new C6C2(C7I, C7q));
    }

    @Override // X.MSH
    public final boolean CL8(C2EC c2ec) {
        C14360o3.A0B(c2ec, 0);
        JR2 jr2 = this.A00;
        DirectThreadKey directThreadKey = ((C43945Jbu) jr2.A1v.getValue()).A00;
        if (jr2.A1L.isResumed() && directThreadKey != null && directThreadKey.equals(c2ec.BKb()) && !c2ec.CM5()) {
            return true;
        }
        return false;
    }

    @Override // X.MSH
    public final boolean CMD(C2EC c2ec) {
        List list;
        C14360o3.A0B(c2ec, 0);
        JR2 jr2 = this.A00;
        String str = AbstractC43593JPy.A0W(jr2).A01;
        if (str != null) {
            list = AbstractC28761aE.A00(jr2.A0p()).CGt(c2ec.BKb(), str);
        } else {
            list = null;
        }
        if (list == null || !AbstractC166987dD.A1b(list)) {
            return false;
        }
        return true;
    }

    public C43638JRw(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC50463MPr
    public final Reel Blq(AbstractC46458KhI abstractC46458KhI) {
        return C31226Do9.A01(this.A00.A0p(), abstractC46458KhI);
    }

    @Override // X.InterfaceC50463MPr
    public final C9BW C1w(String str) {
        if (str != null) {
            return (C9BW) this.A00.A1W.get(str);
        }
        return null;
    }

    @Override // X.MSH
    public final C73743Sc CH0(String str) {
        if (str != null) {
            return (C73743Sc) this.A00.A1Y.get(str);
        }
        return null;
    }

    @Override // X.MSH
    public final boolean CKu() {
        JR2 jr2 = this.A00;
        if (jr2.A0r().CUG() && !AbstractC166987dD.A1b(jr2.A0q().A0E.A0O)) {
            return true;
        }
        return false;
    }

    @Override // X.MSH
    public final void ECn() {
        InterfaceC169517hR interfaceC169517hR;
        JR2 jr2 = this.A00;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (abstractC59962oe.isResumed()) {
            UserSession A0p = jr2.A0p();
            int size = jr2.A0q().A0E.A0O.size();
            int CCs = InterfaceC50519MRw.A01(jr2.A1j).CCs();
            boolean A02 = C3ER.A00().A02(abstractC59962oe.requireContext(), jr2.A0p());
            C14360o3.A0B(A0p, 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, A0p), "direct_inbox_manual_refresh");
            A0f.A7v("vc_multitask", Boolean.valueOf(A02));
            A0f.A8p("num_threads_unseen", Integer.valueOf(CCs));
            A0f.A8p("num_threads", Integer.valueOf(size));
            A0f.Cht();
            AbstractC46972Dl A0u = jr2.A0u();
            if (jr2.A0r().Eia()) {
                C4I3 A04 = JR2.A04(jr2);
                if (jr2.A0d != null) {
                    InterfaceC09390do interfaceC09390do = jr2.A1u;
                    ((C43782JXv) interfaceC09390do.getValue()).A02(A0u, A04, "MANUAL_REFRESH");
                    ((C43782JXv) interfaceC09390do.getValue()).A01();
                }
                if (AbstractC43593JPy.A1a(jr2)) {
                    new C220159o1(C28811aJ.A00(jr2.A0p()), "manual_refresh").A03();
                }
                jr2.A0r().AV5(A0u, A04, "manual_refresh");
                jr2.A17(null);
            }
            if (!C14360o3.A0K(A0u, C47062Du.A00) && (interfaceC169517hR = jr2.A0t) != null) {
                interfaceC169517hR.Eby("");
            }
            ((AbstractC55352ga) jr2.A2W.getValue()).DiZ();
            AbstractC65908TwF.A01(jr2.A0p(), (InterfaceC62612t0) jr2.A1g.getValue(), (InterfaceC65242xM) jr2.A1e.getValue(), C05F.A01, AbstractC25225BEi.A07(C06090Tz.A05, jr2.A0p(), 36592309613494711L));
            ((C2057098u) jr2.A1q.getValue()).A04(C05F.A02);
            C43777JXq c43777JXq = jr2.A0m;
            if (c43777JXq != null) {
                c43777JXq.A01(true);
            }
            InterfaceC19610xo A0e = AbstractC31176DnK.A0e(jr2.A0p());
            A0e.E77("should_show_refresh_close_friends_filter_toast", false);
            A0e.apply();
        }
    }

    @Override // X.MSH
    public final boolean isLoading() {
        return this.A00.A19();
    }
}
