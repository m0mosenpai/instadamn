package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GBg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36582GBg implements InterfaceC156026zW {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

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
        return "profile_saved";
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return AbstractC111324zv.A00(3209);
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
        EMJ emj = new EMJ();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.A01);
        A0b.putString("profile_user_id", this.A02);
        emj.setArguments(A0b);
        return emj;
    }

    public C36582GBg(Context context, UserSession userSession, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        AbstractC167017dG.A1N(viewGroup, str);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_save_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(R.drawable.instagram_save_pano_filled_24));
        A00.setTitle(AbstractC166997dE.A0p(context, 2131972806));
        View view = A00.getView();
        view.setContentDescription(AbstractC166997dE.A0p(context, 2131972806));
        return view;
    }

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return "saved";
    }
}
