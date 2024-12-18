package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Wl7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70960Wl7 implements InterfaceC71955XCh, InterfaceC71979XDo, XDP, InterfaceC71956XCi {
    public final /* synthetic */ C68042V7t A00;

    @Override // X.InterfaceC71955XCh
    public final void DLw(C67845UzJ c67845UzJ) {
    }

    @Override // X.InterfaceC71955XCh
    public final void DLx(String str) {
    }

    @Override // X.XDP
    public final void Ddh(Reel reel) {
    }

    @Override // X.XDP
    public final void Ddj(C38321qM c38321qM) {
    }

    @Override // X.XDP
    public final void Ddz() {
    }

    @Override // X.InterfaceC71956XCi
    public final void Dyi(Venue venue) {
    }

    @Override // X.InterfaceC71956XCi
    public final void onFinish() {
    }

    public C70960Wl7(C68042V7t c68042V7t) {
        this.A00 = c68042V7t;
    }

    @Override // X.InterfaceC71979XDo
    public final void DFf() {
        C68042V7t c68042V7t = this.A00;
        c68042V7t.A02.Dfp();
        FragmentActivity activity = c68042V7t.A00.getActivity();
        if (activity != null) {
            C9GR.A03(activity, activity.getString(2131974293), "onFeedRequestFail", 0);
        }
    }

    @Override // X.InterfaceC71979XDo
    public final void DGX(EnumC68206VFy enumC68206VFy, C67847UzS c67847UzS, boolean z) {
        List A06;
        C69138ViT c69138ViT = new C69138ViT(c67847UzS.A01, c67847UzS.A02, c67847UzS.A05);
        C68042V7t c68042V7t = this.A00;
        UserSession userSession = c68042V7t.A01;
        List list = c67847UzS.A03;
        if (list == null) {
            A06 = Collections.emptyList();
        } else {
            C14360o3.A0B(userSession, 0);
            A06 = C127895qI.A06(userSession, null, list);
        }
        ArrayList A00 = AbstractC40614HzY.A00(new C155376yQ(userSession), A06);
        C14360o3.A0B(userSession, 0);
        AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(V7X.class, C71776X4d.A00);
        String str = c68042V7t.A03.A01;
        boolean A1R = AbstractC167007dF.A1R(0, str, enumC68206VFy);
        ((V7Z) abstractC69735VuV.A01(str)).A00 = enumC68206VFy;
        W5E w5e = c68042V7t.A04;
        String str2 = W5E.A00(w5e, enumC68206VFy).A01;
        C14360o3.A0B(str2, A1R ? 1 : 0);
        ((V7Z) abstractC69735VuV.A01(str)).A01 = str2;
        abstractC69735VuV.A02(new C69016Vfs(c69138ViT, A06), str, W5E.A00(w5e, enumC68206VFy).A04.A03.A07, null, null, z);
        c68042V7t.A02.DgU(null, null, A00, null, false, z);
    }

    @Override // X.InterfaceC71979XDo
    public final void DRY() {
        this.A00.A02.Dfz();
    }

    @Override // X.InterfaceC71979XDo
    public final void DRb() {
        this.A00.A02.DgF();
    }

    public C70960Wl7() {
    }
}
