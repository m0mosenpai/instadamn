package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public final class KIJ extends AbstractC66412zI {
    public final UserSession A00;

    public KIJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44603Jp9(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.comment_giphy_sticker_suggestion_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45218Jzy c45218Jzy = (C45218Jzy) interfaceC66482zP;
        C44603Jp9 c44603Jp9 = (C44603Jp9) c3oo;
        AbstractC167007dF.A1K(c45218Jzy, c44603Jp9);
        IgImageView igImageView = c44603Jp9.A00;
        Context context = igImageView.getContext();
        AA7 aa7 = c45218Jzy.A00;
        C47712L4t c47712L4t = aa7.A00.A00;
        C14360o3.A07(c47712L4t);
        float f = c47712L4t.A01;
        float f2 = c47712L4t.A00;
        String A0w = AbstractC43592JPx.A0w(c47712L4t.A05);
        if (f != 0.0f && f2 != 0.0f && !A0w.equals("")) {
            GifUrlImpl gifUrlImpl = new GifUrlImpl(A0w, c47712L4t.A07, f, f2);
            C14360o3.A0A(context);
            UserSession userSession = this.A00;
            String str = aa7.A05;
            C14360o3.A07(str);
            igImageView.setImageDrawable(new C74P(context, userSession, C74U.A00(1.0f, (int) f, (int) f2, -1), gifUrlImpl, (GifUrlImpl) null, C05F.A01, str, AbstractC43594JPz.A04(context), context.getColor(R.color.igds_secondary_background), context.getColor(R.color.context_line_color), false));
            AbstractC166997dE.A18(context, igImageView, 2131963229);
            KKp.A01(AbstractC166987dD.A0s(igImageView), c45218Jzy, 7);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45218Jzy.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        JQ1.A0b(c3oo);
    }
}
