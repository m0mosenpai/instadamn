package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jnq extends C2UU {
    public List A00 = AbstractC166987dD.A1E();
    public final UserSession A01;
    public final Context A02;
    public final C87U A03;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C44713Jqw c44713Jqw;
        C14360o3.A0B(c3oo, 0);
        C152526tf c152526tf = (C152526tf) AbstractC001800i.A0O(this.A00, i);
        if (c152526tf != null && (str = c152526tf.A00) != null) {
            C87U c87u = this.A03;
            if ((c3oo instanceof C44713Jqw) && (c44713Jqw = (C44713Jqw) c3oo) != null) {
                IgImageView igImageView = c44713Jqw.A03;
                Context context = igImageView.getContext();
                AbstractC166997dE.A19(context, igImageView, R.drawable.instagram_search_pano_outline_24);
                AbstractC31177DnL.A0p(context, igImageView, AbstractC53242c7.A0H(context, R.attr.igdsPrimaryIcon));
                TextView textView = c44713Jqw.A01;
                textView.setText(str);
                textView.setTypeface(null, 0);
                AbstractC31177DnL.A0q(context, textView, R.attr.igds_color_primary_text);
                IgSimpleImageView igSimpleImageView = c44713Jqw.A02;
                igSimpleImageView.setVisibility(0);
                ViewOnClickListenerC48066LPr.A00(c44713Jqw.A00, 33, c87u, c44713Jqw);
                ViewOnClickListenerC48066LPr.A00(igSimpleImageView, 34, c87u, c44713Jqw);
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C44713Jqw(AbstractC25227BEk.A0D(LayoutInflater.from(this.A02), viewGroup, R.layout.row_effect_recent_search, false));
    }

    public Jnq(Context context, UserSession userSession, C87U c87u) {
        this.A02 = context;
        this.A01 = userSession;
        this.A03 = c87u;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1570498332);
        int size = this.A00.size();
        C0f9.A0A(1764348291, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(1592392973, C0f9.A03(858584638));
        return 0;
    }
}
