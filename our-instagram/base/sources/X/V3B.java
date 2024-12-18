package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class V3B extends AbstractC65632xz {
    public final Context A00;
    public final C34405FEv A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C47732L5t A04 = new Object();
    public final C68758Vbb A05;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C0f9.A03(961997382);
        VJF vjf = (VJF) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        Context context = this.A00;
        C68941Vef c68941Vef = (C68941Vef) AbstractC31172DnG.A0x(view);
        if (c153336v2 == null) {
            i2 = 0;
        } else {
            i2 = c153336v2.A00;
        }
        C47732L5t c47732L5t = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        UserSession userSession = this.A03;
        C68758Vbb c68758Vbb = this.A05;
        C34405FEv c34405FEv = this.A01;
        boolean A1T = AbstractC31175DnJ.A1T(1, context, c68941Vef);
        AbstractC25234BEr.A0k(2, vjf, c47732L5t, interfaceC11380iw, userSession);
        C14360o3.A0B(c68758Vbb, 8);
        C14360o3.A0B(c34405FEv, 9);
        IC0 ic0 = vjf.A00;
        if (ic0 != null) {
            AbstractC40621Hzf.A00(interfaceC11380iw, userSession, c47732L5t, c68758Vbb, c68941Vef.A01, ic0, i2);
        }
        User user = vjf.A01;
        if (user != null) {
            C69213Vjg c69213Vjg = c68941Vef.A00;
            CircularImageView circularImageView = c69213Vjg.A02;
            AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
            TextView textView = c69213Vjg.A01;
            textView.setText(user.B8y());
            C85963sQ.A0C(textView, user.isVerified());
            TextView textView2 = c69213Vjg.A00;
            textView2.setVisibility(A1T ? 1 : 0);
            AbstractC166987dD.A1O(context, textView2, R.color.grey_5);
            textView2.setText(user.A03.getCategory());
            FollowButton followButton = c69213Vjg.A03;
            followButton.setVisibility(A1T ? 1 : 0);
            followButton.A0J.A04(interfaceC11380iw, userSession, user);
            ViewOnClickListenerC35683FpI viewOnClickListenerC35683FpI = new ViewOnClickListenerC35683FpI(16, c34405FEv, user);
            C0fQ.A00(viewOnClickListenerC35683FpI, circularImageView);
            C0fQ.A00(viewOnClickListenerC35683FpI, textView);
            C0fQ.A00(viewOnClickListenerC35683FpI, textView2);
        }
        C0f9.A0A(1322993149, A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.L5t] */
    public V3B(Context context, C34405FEv c34405FEv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68758Vbb c68758Vbb) {
        this.A00 = context;
        this.A05 = c68758Vbb;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = c34405FEv;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2140022864);
        Context context = this.A00;
        View inflate = AbstractC31172DnG.A09(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        ViewGroup A0C = AbstractC31176DnK.A0C(inflate, R.id.container);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, A0C, false);
        AbstractC31176DnK.A1D(inflate2, R.id.view_profile);
        inflate2.setTag(new C69213Vjg((TextView) inflate2.requireViewById(R.id.username), AbstractC31176DnK.A0E(inflate2), (CircularImageView) inflate2.requireViewById(R.id.profile_imageview), (FollowButton) inflate2.requireViewById(R.id.follow_button)));
        A0C.addView(inflate2);
        Object tag = inflate2.getTag();
        if (tag != null) {
            C69213Vjg c69213Vjg = (C69213Vjg) tag;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag(new C68759Vbc(linearLayout));
            A0C.addView(linearLayout);
            Object tag2 = linearLayout.getTag();
            if (tag2 != null) {
                inflate.setTag(new C68941Vef(c69213Vjg, (C68759Vbc) tag2));
                C0f9.A0A(-2103393901, A03);
                return inflate;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
