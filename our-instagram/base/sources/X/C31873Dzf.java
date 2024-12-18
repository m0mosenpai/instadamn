package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.Dzf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31873Dzf extends C2UU {
    public List A00 = AbstractC166987dD.A1E();
    public boolean A01;
    public final GZL A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new E32((ViewGroup) AbstractC31175DnJ.A07(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.row_one_tap_user, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        E32 e32 = (E32) c3oo;
        C14360o3.A0B(e32, 0);
        C51757Mtg c51757Mtg = (C51757Mtg) this.A00.get(i);
        GZL gzl = this.A02;
        boolean z = this.A01;
        C14360o3.A0B(c51757Mtg, 0);
        ImageUrl imageUrl = (ImageUrl) c51757Mtg.A01;
        String str = c51757Mtg.A02;
        if (imageUrl != null) {
            e32.A03.setUrl(imageUrl, AbstractC31171DnF.A0D("NullAnalyticsModule"));
        } else {
            CircularImageView circularImageView = e32.A03;
            AbstractC166997dE.A19(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        TextView textView = e32.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        ViewOnClickListenerC31591DuJ.A00(e32.itemView, 66, gzl, c51757Mtg);
        View view = e32.A00;
        ViewOnClickListenerC31591DuJ.A00(view, 67, gzl, c51757Mtg);
        AbstractC56952jT.A01(view);
        View view2 = e32.A01;
        if (z) {
            view2.setVisibility(8);
        } else {
            ViewOnClickListenerC31591DuJ.A00(view2, 68, gzl, c51757Mtg);
        }
    }

    public C31873Dzf(GZL gzl) {
        this.A02 = gzl;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1614273418);
        int size = this.A00.size();
        C0f9.A0A(-1173568651, A03);
        return size;
    }
}
