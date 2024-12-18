package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KJm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45675KJm extends AbstractC66422zJ {
    public final UserSession A00;
    public final C47331Kvg A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44614JpK(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_ai_sticker_entrypoint_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44614JpK c44614JpK = (C44614JpK) c3oo;
        C14360o3.A0B(c44614JpK, 1);
        IgImageView igImageView = c44614JpK.A00;
        Context context = igImageView.getContext();
        igImageView.setVisibility(0);
        AbstractC166997dE.A18(context, igImageView, 2131958710);
        UserSession userSession = this.A00;
        AMT amt = new AMT(userSession, context);
        amt.A0A(AbstractC47158Kst.A00);
        amt.A0B = true;
        amt.A06(R.drawable.instagram_gen_ai_pano_filled_24);
        amt.A04 = AbstractC25227BEk.A0o();
        amt.A05 = AbstractC166997dE.A0p(context, 2131958711);
        igImageView.setImageDrawable(amt.A04());
        C3P9 A0s = AbstractC166987dD.A0s(igImageView);
        A0s.A04 = new KKp(this, 18);
        AbstractC47848LBr.A01(userSession, A0s);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45659KIw.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44614JpK c44614JpK = (C44614JpK) c3oo;
        C14360o3.A0B(c44614JpK, 0);
        c44614JpK.A00.setVisibility(8);
    }

    public C45675KJm(UserSession userSession, C47331Kvg c47331Kvg) {
        this.A00 = userSession;
        this.A01 = c47331Kvg;
    }
}
