package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Cyw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29482Cyw implements InterfaceC30961DjI {
    public final C29486Cz0 A00;
    public final Context A01;
    public final FoaUserSession A02;

    @Override // X.InterfaceC30961DjI
    public final void E5P() {
        this.A00.E5P();
    }

    public C29482Cyw(Context context, FoaUserSession foaUserSession) {
        this.A02 = foaUserSession;
        this.A01 = context;
        this.A00 = new C29486Cz0(context, foaUserSession);
    }
}
