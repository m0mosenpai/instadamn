package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KII extends AbstractC66412zI {
    public final UserSession A00;

    public KII(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44602Jp8(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.comment_avatar_sticker_suggestion_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        Drawable drawable;
        K00 k00 = (K00) interfaceC66482zP;
        C44602Jp8 c44602Jp8 = (C44602Jp8) c3oo;
        AbstractC167007dF.A1K(k00, c44602Jp8);
        IgImageView igImageView = c44602Jp8.A00;
        C148286ly c148286ly = k00.A00;
        if (c148286ly.A04() == C05F.A0N) {
            context = igImageView.getContext();
            C14360o3.A07(context);
            UserSession userSession = this.A00;
            drawable = C74N.A00(context, userSession, c148286ly, false, AbstractC47041Kqy.A00(userSession));
        } else {
            UserSession userSession2 = this.A00;
            context = igImageView.getContext();
            C202588xc c202588xc = new C202588xc(context, null, userSession2, c148286ly, k00.A01, null, c148286ly.A0S);
            c202588xc.A04();
            drawable = c202588xc;
        }
        igImageView.setImageDrawable(drawable);
        String str = c148286ly.A0M;
        if (str == null) {
            str = AbstractC166997dE.A0p(context, 2131953534);
        }
        igImageView.setContentDescription(str);
        KKp.A01(AbstractC166987dD.A0s(igImageView), k00, 6);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K00.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        JQ1.A0b(c3oo);
    }
}
