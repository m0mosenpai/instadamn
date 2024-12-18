package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.KJd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45666KJd extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final InterfaceC16660sJ A01;
    public final boolean A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44741JrO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.notes_mentions_item, false), this.A00, this.A01, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45196Jzc c45196Jzc = (C45196Jzc) interfaceC66482zP;
        C44741JrO c44741JrO = (C44741JrO) c3oo;
        AbstractC167017dG.A1N(c45196Jzc, c44741JrO);
        c44741JrO.A00 = c45196Jzc;
        User user = c45196Jzc.A00;
        boolean A2D = user.A2D();
        IgTextView igTextView = c44741JrO.A02;
        AbstractC31173DnH.A1F(igTextView, user);
        Context context = igTextView.getContext();
        boolean z = c44741JrO.A05;
        int i = R.attr.igds_color_primary_text;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
        }
        AbstractC31177DnL.A0q(context, igTextView, i);
        CircularImageView circularImageView = c44741JrO.A03;
        circularImageView.setUrl(user.Bhu(), c44741JrO.A01);
        float f = 1.0f;
        float f2 = 0.5f;
        if (A2D) {
            f2 = 1.0f;
        }
        igTextView.setAlpha(f2);
        if (!A2D) {
            f = 0.5f;
        }
        circularImageView.setAlpha(f);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45196Jzc.class;
    }

    public C45666KJd(InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16660sJ;
        this.A02 = z;
    }
}
