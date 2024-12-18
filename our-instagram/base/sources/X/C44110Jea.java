package X;

import android.os.Bundle;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Jea, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44110Jea implements InterfaceC1571373s {
    public final int A00;
    public final Object A01;

    public C44110Jea(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        Object value;
        switch (this.A00) {
            case 0:
                C51039Mgp c51039Mgp = ((ArchiveReelFragment) this.A01).A03;
                C05A c05a = c51039Mgp.A08;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, C26078Bg7.A01((C26078Bg7) value, C05F.A01)));
                MBq.A01(c51039Mgp, AbstractC141776au.A00(c51039Mgp), 7);
                return;
            case 1:
                C43629JRm c43629JRm = (C43629JRm) this.A01;
                C63397SjR A0y = AbstractC25228BEl.A0y(c43629JRm.A02, c43629JRm.A03, C2Fb.A1W, "https://www.facebook.com/help/instagram/475931443650619");
                A0y.A0S = "direct_inbox_empty_state";
                A0y.A0A();
                return;
            case 2:
                JR2 jr2 = (JR2) this.A01;
                if (JR2.A0i(jr2)) {
                    AbstractC43594JPz.A1J(jr2);
                    return;
                }
                if (C2E8.A07(jr2.A0p()) && C14360o3.A0K(jr2.A0t(), C46962Dk.A00)) {
                    UserSession A0p = jr2.A0p();
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC59962oe abstractC59962oe = jr2.A1L;
                    C6XJ A03 = C6XJ.A03(abstractC59962oe.requireActivity(), A0b, A0p, ModalActivity.class, AbstractC111324zv.A00(2271));
                    A03.A0J = ModalActivity.A08;
                    AbstractC31173DnH.A1I(abstractC59962oe, A03);
                    return;
                }
                if (jr2.A0t() instanceof C2E6) {
                    jr2.A18(null, AbstractC111324zv.A00(4282), true);
                    return;
                } else {
                    jr2.A12();
                    return;
                }
            default:
                LLk lLk = (LLk) this.A01;
                if (lLk.A0O) {
                    lLk.A0t.DDR();
                    return;
                }
                if (lLk.A0i.Bsj() == C44039JdQ.A00) {
                    LLk.A0I(lLk);
                    return;
                }
                LLk.A0D(EnumC46220Kcw.A06, lLk);
                LEW lew = lLk.A0m;
                int A05 = lLk.A0j.A05();
                LEW.A00(lew, "see_all_requests", EnumC46220Kcw.A0G.A02.A00, lLk.A02.A02.A00, null, A05);
                return;
        }
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
        if (2 - this.A00 == 0) {
            C14360o3.A0B(enumC153216up, 0);
            ((JR2) this.A01).A0v().A0E(AbstractC167017dG.A0n(enumC153216up, "empty_state_view_model_added:", AbstractC166987dD.A1C()));
        }
    }
}
