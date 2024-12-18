package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.MTx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50566MTx implements InterfaceC140686Xw {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ C38E A02;
    public final /* synthetic */ C3M4 A03;
    public final /* synthetic */ C50557MTo A04;
    public final /* synthetic */ C141586ab A05;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    public C50566MTx(Reel reel, C3G2 c3g2, C38E c38e, C3M4 c3m4, C50557MTo c50557MTo, C141586ab c141586ab) {
        this.A02 = c38e;
        this.A01 = c3g2;
        this.A00 = reel;
        this.A04 = c50557MTo;
        this.A05 = c141586ab;
        this.A03 = c3m4;
    }

    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        C50557MTo c50557MTo;
        C38E c38e = this.A02;
        C38D c38d = c38e.A0L;
        if (!c38d.isResumed()) {
            onCancel();
            return;
        }
        InterfaceC58058Poj interfaceC58058Poj = c38e.A06;
        if (interfaceC58058Poj != null) {
            interfaceC58058Poj.DWe();
        }
        UserSession userSession = c38e.A0K;
        C3G2 c3g2 = this.A01;
        if (!AbstractC145026gN.A01(userSession, c3g2) && !this.A00.A0g()) {
            c50557MTo = this.A04;
            C141586ab c141586ab = this.A05;
            c50557MTo.A00(c38e.A0J);
            ReelViewerFragment A01 = ITS.A01(c141586ab.A00());
            FragmentActivity activity = c38d.getActivity();
            activity.getClass();
            C140966Yy A0r = AbstractC25225BEi.A0r(activity, userSession);
            A0r.A0E(A01);
            A0r.A0A = AbstractC111324zv.A00(94);
            A0r.A07 = c38e.A01;
            A0r.A0B = c38e.A09;
            InterfaceC11380iw interfaceC11380iw = c38e.A02;
            if (interfaceC11380iw != null) {
                A0r.A09 = interfaceC11380iw;
            }
            A0r.A04();
        } else {
            c50557MTo = this.A04;
            C38E.A02(c3g2, c38e, this.A03, c50557MTo, this.A05);
        }
        c50557MTo.A00(c38e.A0J);
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        this.A04.A00(this.A02.A0J);
    }
}
