package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

/* renamed from: X.KHz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45636KHz extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C47400Kwp A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44720Jr3(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.emoji_reaction_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String A0f;
        ReactionViewModel reactionViewModel = (ReactionViewModel) interfaceC66482zP;
        C44720Jr3 c44720Jr3 = (C44720Jr3) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, reactionViewModel, c44720Jr3);
        TextView textView = c44720Jr3.A00;
        String str = reactionViewModel.A06;
        textView.setText(str);
        if (reactionViewModel.A08 && reactionViewModel.A07) {
            ViewOnClickListenerC48062LPn.A00(c44720Jr3.itemView, 58, this);
            A0f = AbstractC31172DnG.A05(c44720Jr3).getString(2131972171);
        } else {
            LQ1.A00(c44720Jr3.itemView, 33, this, reactionViewModel);
            A0f = AbstractC167007dF.A0f(AbstractC31172DnG.A05(c44720Jr3), str, 2131959339);
        }
        C14360o3.A0A(A0f);
        View view = c44720Jr3.itemView;
        Context context = view.getContext();
        String str2 = reactionViewModel.A04;
        view.setContentDescription(AbstractC31174DnI.A0t(context, str, str2, 2131959338));
        AbstractC010103p.A0B(c44720Jr3.itemView, new C44442Jl9(A0f, A1R ? 1 : 0));
        if (str2 != null) {
            c44720Jr3.A03.setUrl(C148336m3.A04.A04(str2), this.A00);
        }
        ImageUrl imageUrl = reactionViewModel.A02;
        if (imageUrl != null) {
            CircularImageView circularImageView = c44720Jr3.A02;
            circularImageView.setVisibility(0);
            circularImageView.setUrl(imageUrl, this.A00);
        } else {
            c44720Jr3.A02.setVisibility(8);
        }
        int i = reactionViewModel.A00;
        if (i != 0 && reactionViewModel.A07) {
            TextView textView2 = c44720Jr3.A01;
            textView2.setVisibility(0);
            textView2.setText(i);
            return;
        }
        c44720Jr3.A01.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return ReactionViewModel.class;
    }

    public C45636KHz(InterfaceC11380iw interfaceC11380iw, C47400Kwp c47400Kwp) {
        this.A01 = c47400Kwp;
        this.A00 = interfaceC11380iw;
    }
}
