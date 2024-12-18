package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* loaded from: classes6.dex */
public final class ERG extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final OneTapLoginLandingFragment A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERG(InterfaceC11380iw interfaceC11380iw, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        this.A00 = interfaceC11380iw;
        this.A01 = oneTapLoginLandingFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(2003375110);
        C34614FMx c34614FMx = (C34614FMx) AbstractC31172DnG.A0x(view);
        C83803oP c83803oP = (C83803oP) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        OneTapLoginLandingFragment oneTapLoginLandingFragment = this.A01;
        ImageUrl imageUrl = c83803oP.A02;
        if (imageUrl != null) {
            c34614FMx.A04.setUrl(imageUrl, interfaceC11380iw);
        } else {
            CircularImageView circularImageView = c34614FMx.A04;
            AbstractC166997dE.A19(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        c34614FMx.A03.setText(c83803oP.A07);
        ViewOnClickListenerC31591DuJ.A00(c34614FMx.A00, 62, c83803oP, oneTapLoginLandingFragment);
        ViewOnClickListenerC31591DuJ.A00(c34614FMx.A01, 63, c83803oP, oneTapLoginLandingFragment);
        ViewOnClickListenerC31591DuJ.A00(c34614FMx.A02, 64, c83803oP, oneTapLoginLandingFragment);
        C0f9.A0A(-1327904465, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-550007132);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_one_tap_user);
        viewGroup2.setTag(new C34614FMx(viewGroup2));
        C0f9.A0A(-230962892, A03);
        return viewGroup2;
    }
}
