package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Cyx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29483Cyx implements InterfaceC30961DjI {
    public final C29481Cyv A00;
    public final C29485Cyz A01;
    public final Context A02;
    public final FoaUserSession A03;

    public C29483Cyx(Context context, FoaUserSession foaUserSession) {
        C14360o3.A0B(foaUserSession, 1);
        this.A03 = foaUserSession;
        this.A02 = context;
        this.A00 = new C29481Cyv(foaUserSession);
        this.A01 = new C29485Cyz(foaUserSession);
    }

    @Override // X.InterfaceC30961DjI
    public final void E5P() {
        this.A00.E5P();
        this.A01.E5P();
    }
}
