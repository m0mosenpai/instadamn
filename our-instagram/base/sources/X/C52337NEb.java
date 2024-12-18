package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.NEb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52337NEb extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A0D, new C51334Mlv(A0D));
        if (A0Q instanceof C51334Mlv) {
            return (C3OO) A0Q;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        OvU ovU = (OvU) interfaceC66482zP;
        C51334Mlv c51334Mlv = (C51334Mlv) c3oo;
        AbstractC167017dG.A1N(ovU, c51334Mlv);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        AbstractC167007dF.A1E(context, 0, interfaceC11380iw);
        Integer num = ovU.A03;
        if (num != null) {
            i = c51334Mlv.A00.getResources().getDimensionPixelSize(num.intValue());
        } else {
            i = 0;
        }
        c51334Mlv.A00.setPadding(i, 0, i, 0);
        IgTextView igTextView = c51334Mlv.A01;
        igTextView.setTypeface(null, 0);
        igTextView.setText(ovU.A00);
        ImageUrl imageUrl = ovU.A02;
        CircularImageView circularImageView = c51334Mlv.A02;
        if (imageUrl != null) {
            circularImageView.setVisibility(8);
            StackedAvatarView stackedAvatarView = (StackedAvatarView) c51334Mlv.A03.getView();
            stackedAvatarView.setUrls(ovU.A01, imageUrl, interfaceC11380iw);
            stackedAvatarView.setVisibility(0);
            return;
        }
        circularImageView.setUrl(ovU.A01, interfaceC11380iw);
        context.getColor(AbstractC53242c7.A08(context));
        circularImageView.invalidate();
        circularImageView.setVisibility(0);
        AbstractC31178DnM.A1P(c51334Mlv.A03);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return OvU.class;
    }

    public C52337NEb(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }
}
