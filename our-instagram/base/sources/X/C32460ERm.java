package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import java.util.List;

/* renamed from: X.ERm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32460ERm extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final EnumC31556Dtg A02;
    public final C31535DtK A03;

    public C32460ERm(Context context, InterfaceC11380iw interfaceC11380iw, EnumC31556Dtg enumC31556Dtg, C31535DtK c31535DtK) {
        C14360o3.A0B(enumC31556Dtg, 3);
        this.A00 = context;
        this.A03 = c31535DtK;
        this.A02 = enumC31556Dtg;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Boolean BwQ;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        int i2;
        StackedAvatarView stackedAvatarView;
        View view2;
        int A03 = C0f9.A03(1062773612);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            C34627FNk c34627FNk = (C34627FNk) tag;
            InterfaceC37277GbU interfaceC37277GbU = (InterfaceC37277GbU) obj;
            C31535DtK c31535DtK = this.A03;
            EnumC31556Dtg enumC31556Dtg = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C14360o3.A0B(c34627FNk, 0);
            C14360o3.A0B(interfaceC37277GbU, 1);
            AbstractC25233BEq.A0w(A06, c31535DtK, enumC31556Dtg, interfaceC11380iw);
            TextView textView = c34627FNk.A02;
            textView.setText(interfaceC37277GbU.getTitle());
            TextView textView2 = c34627FNk.A01;
            textView2.setText(interfaceC37277GbU.CIp());
            textView2.setImportantForAccessibility(A06);
            if (C14360o3.A0K(interfaceC37277GbU.BAS(), "potential_spam")) {
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c34627FNk.A04;
                Context context = gradientSpinnerAvatarView2.getContext();
                Drawable drawable = context.getDrawable(R.drawable.instagram_warning_pano_outline_24);
                if (drawable != null) {
                    AbstractC166997dE.A1F(drawable.mutate(), AbstractC53242c7.A01(context));
                    CircularImageView circularImageView = c34627FNk.A03;
                    circularImageView.setImageDrawable(drawable);
                    circularImageView.setVisibility(0);
                    i2 = 8;
                    gradientSpinnerAvatarView2.setVisibility(8);
                    view2 = c34627FNk.A05;
                }
                ViewGroup viewGroup = c34627FNk.A00;
                ViewOnClickListenerC35684FpJ.A00(viewGroup, c31535DtK, interfaceC37277GbU, enumC31556Dtg, 65);
                viewGroup.setContentDescription(textView.getText());
                AbstractC56952jT.A01(viewGroup);
                C0f9.A0A(-1327473714, A03);
                return;
            }
            int size = interfaceC37277GbU.B45().size();
            List B45 = interfaceC37277GbU.B45();
            if (size == A06) {
                ImageUrl A0T = AbstractC31177DnL.A0T(B45, 0);
                ImageUrl A0T2 = AbstractC31177DnL.A0T(interfaceC37277GbU.B45(), 1);
                stackedAvatarView = c34627FNk.A05;
                stackedAvatarView.setUrls(A0T, A0T2, interfaceC11380iw);
            } else {
                if (B45.size() == 1) {
                    if (AbstractC166997dE.A1Z(interfaceC37277GbU.BwQ(), true)) {
                        stackedAvatarView = c34627FNk.A05;
                        stackedAvatarView.setFrontAvatarDrawable(stackedAvatarView.getContext().getDrawable(R.drawable.follow_hashtags_nux_icon));
                        stackedAvatarView.setBackAvatarUrl(AbstractC31177DnL.A0T(interfaceC37277GbU.B45(), 0), interfaceC11380iw);
                    } else {
                        gradientSpinnerAvatarView = c34627FNk.A04;
                        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, AbstractC31177DnL.A0T(interfaceC37277GbU.B45(), 0));
                    }
                } else {
                    if (interfaceC37277GbU.B45().isEmpty() && (BwQ = interfaceC37277GbU.BwQ()) != null && BwQ.booleanValue()) {
                        gradientSpinnerAvatarView = c34627FNk.A04;
                        Drawable drawable2 = gradientSpinnerAvatarView.getContext().getDrawable(R.drawable.follow_hashtags_nux_icon);
                        if (drawable2 != null) {
                            gradientSpinnerAvatarView.A0D(drawable2);
                        }
                    }
                    ViewGroup viewGroup2 = c34627FNk.A00;
                    ViewOnClickListenerC35684FpJ.A00(viewGroup2, c31535DtK, interfaceC37277GbU, enumC31556Dtg, 65);
                    viewGroup2.setContentDescription(textView.getText());
                    AbstractC56952jT.A01(viewGroup2);
                    C0f9.A0A(-1327473714, A03);
                    return;
                }
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                gradientSpinnerAvatarView.setVisibility(0);
                i2 = 8;
                c34627FNk.A03.setVisibility(8);
                view2 = c34627FNk.A05;
            }
            stackedAvatarView.setVisibility(0);
            i2 = 8;
            c34627FNk.A04.setVisibility(8);
            view2 = c34627FNk.A03;
            view2.setVisibility(i2);
            ViewGroup viewGroup22 = c34627FNk.A00;
            ViewOnClickListenerC35684FpJ.A00(viewGroup22, c31535DtK, interfaceC37277GbU, enumC31556Dtg, 65);
            viewGroup22.setContentDescription(textView.getText());
            AbstractC56952jT.A01(viewGroup22);
            C0f9.A0A(-1327473714, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1479517956, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 513902833);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.user_group, false);
        A0C.setTag(new C34627FNk(A0C));
        C0f9.A0A(1416862741, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
