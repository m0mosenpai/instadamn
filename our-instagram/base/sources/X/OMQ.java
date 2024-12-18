package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;

/* loaded from: classes9.dex */
public class OMQ {
    public AnonymousClass195 A00;
    public final View A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public OMQ(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        this.A02 = userSession;
        this.A01 = view;
        C43210J8h c43210J8h = new C43210J8h(42, this, enumC142806cg, abstractC59962oe);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57558PgW(new C57558PgW(abstractC59962oe, 17), 18));
        this.A06 = AbstractC25225BEi.A0a(new C57558PgW(A00, 19), c43210J8h, C57530Pg4.A00(null, A00, 11), AbstractC25225BEi.A1D(C51018MgQ.class));
        this.A03 = C57558PgW.A02(this, 14);
        this.A04 = C57558PgW.A02(this, 15);
        this.A05 = C57558PgW.A02(this, 16);
        if (enumC142806cg != EnumC142806cg.A05) {
            A05(abstractC59962oe);
        }
    }

    public final C51018MgQ A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52830NZn) {
            interfaceC09390do = ((C52830NZn) this).A0D;
        } else if (this instanceof C52831NZo) {
            interfaceC09390do = ((C52831NZo) this).A07;
        } else {
            interfaceC09390do = this.A06;
        }
        return (C51018MgQ) interfaceC09390do.getValue();
    }

    public final void A03() {
        C51018MgQ A02 = A02();
        IgLiveLikesRepository igLiveLikesRepository = A02.A04;
        C1Df c1Df = igLiveLikesRepository.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
        igLiveLikesRepository.A00 = null;
        AnonymousClass195 anonymousClass195 = A02.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        A02.A00 = null;
    }

    public void A04() {
        C51018MgQ A02 = A02();
        IgLiveLikesRepository igLiveLikesRepository = A02.A04;
        C1Df c1Df = igLiveLikesRepository.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
        igLiveLikesRepository.A00 = null;
        AnonymousClass195 anonymousClass195 = A02.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        A02.A00 = null;
        AnonymousClass195 anonymousClass1952 = this.A00;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A00 = null;
    }

    public void A05(Fragment fragment) {
        A02().A06();
        if (this.A00 == null) {
            this.A00 = AbstractC50522MSa.A0s(fragment, C57167PZl.A01(this, null, 17), A02().A09);
        }
    }
}
