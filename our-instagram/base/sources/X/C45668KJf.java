package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.KJf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45668KJf extends AbstractC66422zJ {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final DirectThreadKey A02;
    public final InterfaceC16820sZ A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44630Jpa(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.magic_media_remix_item_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C48309LZi c48309LZi = (C48309LZi) interfaceC66482zP;
        C44630Jpa c44630Jpa = (C44630Jpa) c3oo;
        AbstractC167017dG.A1N(c48309LZi, c44630Jpa);
        ImageView imageView = c44630Jpa.A00;
        imageView.setImageBitmap(c48309LZi.A01);
        imageView.setVisibility(0);
        ViewOnClickListenerC48068LPt.A00(c44630Jpa.itemView, this, c44630Jpa, c48309LZi, 18);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48309LZi.class;
    }

    public C45668KJf(FragmentActivity fragmentActivity, UserSession userSession, DirectThreadKey directThreadKey, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = directThreadKey;
        this.A03 = interfaceC16820sZ;
    }
}
