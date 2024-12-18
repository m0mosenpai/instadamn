package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76793cR implements InterfaceC76813cT {
    public static final C76823cU A01 = new Object();
    public final UserSession A00;

    public C76793cR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(context, 0);
        String string = context.getString(2131969210);
        C14360o3.A07(string);
        return string;
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 2);
        return A01.A00(this.A00, c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC76813cT
    public final boolean Ejq() {
        return true;
    }

    @Override // X.InterfaceC76813cT
    public final Integer BEt() {
        return Integer.valueOf(R.drawable.instagram_media_pano_outline_24);
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ List Bre(C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjQ(UserSession userSession, C38321qM c38321qM) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjP(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        return null;
    }
}
