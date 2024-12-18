package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes6.dex */
public final class EXV extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final FOI A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CircularImageView circularImageView;
        C36208FyM c36208FyM = (C36208FyM) interfaceC66482zP;
        E1E e1e = (E1E) c3oo;
        ViewGroup viewGroup = e1e.A00;
        if (viewGroup != null) {
            AbstractC010103p.A0B(viewGroup, new UEI(this, 5));
            ViewOnClickListenerC35670Fp5.A00(viewGroup, 14, this, c36208FyM);
            AbstractC56952jT.A01(viewGroup);
        }
        IgTextView igTextView = e1e.A03;
        if (igTextView != null) {
            igTextView.setText(c36208FyM.A05);
        }
        IgTextView igTextView2 = e1e.A02;
        if (igTextView2 != null) {
            if (c36208FyM.A01.A06) {
                igTextView2.setText(2131953915);
                igTextView2.setSingleLine(false);
            } else {
                String str = c36208FyM.A03;
                if (str.isEmpty()) {
                    igTextView2.setVisibility(8);
                } else {
                    igTextView2.setText(str);
                    igTextView2.setSingleLine(true);
                }
            }
            igTextView2.setVisibility(0);
        }
        C57012jc c57012jc = e1e.A05;
        if (c57012jc != null && (circularImageView = e1e.A04) != null) {
            if (c36208FyM.A01.A06) {
                circularImageView.setVisibility(8);
                ((StackedAvatarView) c57012jc.A01()).setUrls(c36208FyM.A00, null, this.A01);
                c57012jc.A03(0);
            } else {
                if (c57012jc.A04()) {
                    c57012jc.A03(8);
                }
                circularImageView.setVisibility(0);
                circularImageView.setUrl(c36208FyM.A00, this.A01);
            }
        }
        IgTextView igTextView3 = e1e.A01;
        if (igTextView3 != null) {
            igTextView3.setText(c36208FyM.A02);
            C1QI.A0H(igTextView3, igTextView3);
            ViewOnClickListenerC35670Fp5.A00(igTextView3, 15, this, c36208FyM);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3OO, X.E1E] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.blocked_list_row);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = AbstractC31173DnH.A0F(A0A, R.id.blocked_list_container);
        c3oo.A03 = AbstractC31172DnG.A0X(A0A, R.id.blocked_list_username);
        c3oo.A02 = AbstractC31172DnG.A0X(A0A, R.id.blocked_list_subtitle);
        c3oo.A04 = AbstractC31173DnH.A0T(A0A, R.id.blocked_list_user_imageview);
        c3oo.A01 = AbstractC31172DnG.A0X(A0A, R.id.unblock_button);
        c3oo.A05 = AbstractC31177DnL.A0V(A0A, R.id.blocked_list_user_stacked_avatar);
        return c3oo;
    }

    public EXV(Context context, InterfaceC11380iw interfaceC11380iw, FOI foi) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = foi;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36208FyM.class;
    }
}
