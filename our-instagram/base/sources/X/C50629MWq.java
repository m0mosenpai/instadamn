package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.MWq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50629MWq implements InterfaceC156026zW {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final User A04;

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return AbstractC43591JPw.A00(296);
    }

    @Override // X.InterfaceC156026zW
    public final String BN1() {
        return "internal_tab";
    }

    @Override // X.InterfaceC156026zW
    public final EnumC125765mR BiA() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final String C4o() {
        return "profile_ar_effects";
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return "tap_ar_effects_tab";
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
        C45509KCy c45509KCy = new C45509KCy();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.A03);
        A0b.putString(AbstractC43591JPw.A00(1255), this.A04.getId());
        c45509KCy.setArguments(A0b);
        return c45509KCy;
    }

    public C50629MWq(Context context, UserSession userSession, User user) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = C6PY.A00(userSession).booleanValue() ? R.drawable.instagram_effects_pano_outline_24 : R.drawable.instagram_sparkles_pano_outline_24;
        this.A01 = C6PY.A00(userSession).booleanValue() ? R.drawable.instagram_effects_pano_filled_24 : R.drawable.instagram_sparkles_pano_outline_24;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        AbstractC167017dG.A1N(viewGroup, str);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A02;
        Drawable drawable = context.getDrawable(this.A00);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(this.A01));
        String A0p = AbstractC166997dE.A0p(context, 2131953162);
        A00.setTitle(A0p);
        View view = A00.getView();
        view.setContentDescription(A0p);
        return view;
    }
}
