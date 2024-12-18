package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P6r implements InterfaceC156026zW {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return "potato";
    }

    @Override // X.InterfaceC156026zW
    public final String BN1() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final EnumC125765mR BiA() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final String C4o() {
        return AbstractC111324zv.A00(2923);
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return "tap_potato_tab";
    }

    @Override // X.InterfaceC156026zW
    public final void Dro(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final void Drp() {
    }

    @Override // X.InterfaceC156026zW
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final InterfaceC152836uD AMq(boolean z) {
        UserSession userSession = this.A01;
        String str = this.A02;
        C26839Bt1 c26839Bt1 = new C26839Bt1();
        c26839Bt1.setArguments(AbstractC167017dG.A0T("arg_profile_user_id", str, MSY.A0n(userSession)));
        return c26839Bt1;
    }

    public P6r(Context context, UserSession userSession, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        AbstractC167017dG.A1N(viewGroup, str);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_templates_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(R.drawable.instagram_templates_pano_filled_24));
        A00.setTitle(AbstractC166997dE.A0p(context, 2131969886));
        View view = A00.getView();
        view.setContentDescription(AbstractC166997dE.A0p(context, 2131969886));
        return view;
    }
}
