package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Jnh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44560Jnh extends C2UU {
    public final UserSession A00;
    public final C43996Jcj A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        IgLinearLayout igLinearLayout;
        ViewOnClickListenerC48072LPx A00;
        C44762Jrj c44762Jrj = (C44762Jrj) c3oo;
        C14360o3.A0B(c44762Jrj, 0);
        L4B l4b = (L4B) this.A02.get(i);
        UserSession userSession = this.A00;
        C43996Jcj c43996Jcj = this.A01;
        C14360o3.A0B(l4b, 0);
        c44762Jrj.A00.setText(l4b.A02);
        c44762Jrj.A02.setImageResource(l4b.A00);
        IgImageView igImageView = c44762Jrj.A03;
        int i2 = l4b.A01;
        igImageView.setImageResource(i2);
        ME7 me7 = new ME7(46, c43996Jcj, c44762Jrj, l4b, userSession);
        View view = c44762Jrj.itemView;
        if (i2 == R.drawable.instagram_x_pano_filled_12) {
            view.setBackgroundResource(R.drawable.twinbox_filter_background_selected);
            igLinearLayout = c44762Jrj.A01;
            A00 = ViewOnClickListenerC48072LPx.A00(c43996Jcj, 54);
        } else {
            view.setBackgroundResource(R.drawable.twinbox_filter_background);
            igLinearLayout = c44762Jrj.A01;
            A00 = ViewOnClickListenerC48072LPx.A00(me7, 55);
        }
        C0fQ.A00(A00, igLinearLayout);
        ViewOnClickListenerC48072LPx.A01(c44762Jrj.itemView, 56, me7);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44762Jrj(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.twinbox_filter_item, false));
    }

    public C44560Jnh(UserSession userSession, C43996Jcj c43996Jcj) {
        this.A00 = userSession;
        this.A01 = c43996Jcj;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(791442142);
        int size = this.A02.size();
        C0f9.A0A(360966750, A03);
        return size;
    }
}
