package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LuQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49511LuQ implements InterfaceC65242xM {
    public final C66362zD A00;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    public C49511LuQ(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C66392zG A00 = C66362zD.A00(activity);
        A00.A01(new C45665KJc(activity, abstractC59962oe, userSession));
        this.A00 = AbstractC31173DnH.A0R(A00, new Object());
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        C14360o3.A07(A04);
        return A04;
    }
}
