package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.TVm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64822TVm implements InterfaceC08830cm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC08830cm A02;

    public C64822TVm(Context context, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A02 = interfaceC08830cm;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        return new RDm(this.A00, this.A01, this.A02);
    }
}
