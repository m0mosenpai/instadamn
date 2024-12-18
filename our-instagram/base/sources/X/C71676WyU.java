package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71676WyU implements InterfaceC08830cm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC08830cm A02;

    public C71676WyU(Context context, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A02 = interfaceC08830cm;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        InterfaceC08830cm interfaceC08830cm = this.A02;
        return new C67678Uvt(this.A00, this.A01, interfaceC08830cm);
    }
}
