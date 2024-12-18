package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HFZ extends AbstractC65632xz {
    public final ProductCollectionFragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    private final void A00(TextView textView, String str) {
        if (str == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(str), this.A02);
        c85383rT.A03(new C42668IuP(this, 2));
        SpannableStringBuilder A00 = c85383rT.A00();
        C14360o3.A07(A00);
        textView.setText(A00);
        textView.setMovementMethod(new LinkMovementMethod());
    }

    public HFZ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1015184110);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            II9 ii9 = (II9) tag;
            C39696HjS c39696HjS = (C39696HjS) obj;
            User user = c39696HjS.A00;
            if (user != null) {
                GradientSpinnerAvatarView gradientSpinnerAvatarView = ii9.A03;
                gradientSpinnerAvatarView.setVisibility(0);
                gradientSpinnerAvatarView.A0F(null, this.A01, user.Bhu());
                ViewOnClickListenerC42034Ik3.A00(gradientSpinnerAvatarView, 66, user, this);
                AbstractC37302Gc3.A0o(gradientSpinnerAvatarView.getContext(), gradientSpinnerAvatarView, user.getUsername(), 2131970237);
            } else {
                ii9.A03.setVisibility(8);
            }
            A00(ii9.A02, c39696HjS.A03);
            A00(ii9.A01, c39696HjS.A02);
            A00(ii9.A00, c39696HjS.A01);
            C0f9.A0A(363142538, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1388470513, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1314822015);
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 1), viewGroup, R.layout.product_feed_metadata_layout, false);
        A0C.setTag(new II9(A0C));
        C0f9.A0A(786995163, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
