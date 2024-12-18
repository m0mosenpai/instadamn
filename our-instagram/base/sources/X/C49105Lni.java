package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Lni, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49105Lni implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;

    public C49105Lni(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A00 = interfaceC11380iw;
        boolean z = anonymousClass988.A1U;
        C77Z c77z = new C77Z((InterfaceC164887Zb) interfaceC165247aD, 0, 0, false);
        C158657Ab c158657Ab = new C158657Ab(interfaceC165247aD, z);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z);
        this.A01 = new C162907Rb(AbstractC166987dD.A1J(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), c77z, c158657Ab, c7q9, (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, true)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C44788Js9 c44788Js9 = new C44788Js9(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_magic_media_remix_content, false));
        c44788Js9.A01.post(new M4A(this, c44788Js9));
        return c44788Js9;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A01.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C44788Js9 c44788Js9 = (C44788Js9) c7qd;
        C7QY c7qy = (C7QY) interfaceC129555tK;
        AbstractC167017dG.A1N(c44788Js9, c7qy);
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        if (abstractC1583778x instanceof C158737Aj) {
            IgProgressImageView igProgressImageView = c44788Js9.A02;
            C158737Aj c158737Aj = (C158737Aj) abstractC1583778x;
            igProgressImageView.getIgImageView().setUrl(c158737Aj.A00, this.A00);
            Float f = c158737Aj.A02;
            if (f != null) {
                float floatValue = f.floatValue();
                ((MediaFrameLayout) c44788Js9.A03).A00 = floatValue;
                igProgressImageView.setAspectRatio(floatValue);
            }
        }
        this.A01.A02(c44788Js9, c7qy);
    }
}
