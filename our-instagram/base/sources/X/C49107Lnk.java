package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lnk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49107Lnk implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;

    public C49107Lnk(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A00 = interfaceC11380iw;
        this.A01 = new C162907Rb(AbstractC166987dD.A1J(new C1580177l(null, new C49023LmB(interfaceC11380iw, userSession, (InterfaceC165017Zq) interfaceC165247aD), new C49031LmJ(interfaceC11380iw, userSession, interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, anonymousClass988.A1U), (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49152LoV c49152LoV = new C49152LoV(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_selfie_reply_message, false));
        this.A01.A00(c49152LoV);
        return c49152LoV;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A01.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49152LoV c49152LoV = (C49152LoV) c7qd;
        KT8 kt8 = (KT8) interfaceC129555tK;
        boolean A1R = AbstractC167007dF.A1R(0, c49152LoV, kt8);
        C41761wQ c41761wQ = c49152LoV.A02;
        c41761wQ.A01();
        C158797Aq c158797Aq = kt8.A00;
        C42221xC c42221xC = null;
        if (c158797Aq != null) {
            c42221xC = c158797Aq.A09;
        }
        boolean z = kt8.A01;
        if (c158797Aq != null) {
            String str = c158797Aq.A0a;
            if (c158797Aq.A0t == A1R && str != null) {
                SimpleImageUrl A0Q = AbstractC43593JPy.A0Q(str);
                IgProgressImageView igProgressImageView = c49152LoV.A03;
                igProgressImageView.setUrl(A0Q, this.A00);
                c49152LoV.A01.setVisibility(0);
                igProgressImageView.setVisibility(0);
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igProgressImageView.setAlpha(f);
                this.A01.A02(c49152LoV, kt8);
            }
        }
        if (c42221xC != null) {
            c41761wQ.A02(C43601JQh.A00(c42221xC, MKP.A00, 6).A0G(), new C49714Lxj(A1R ? 1 : 0, this, c49152LoV, z));
        } else {
            c49152LoV.A01.setVisibility(8);
            c49152LoV.A03.setVisibility(8);
        }
        this.A01.A02(c49152LoV, kt8);
    }
}
