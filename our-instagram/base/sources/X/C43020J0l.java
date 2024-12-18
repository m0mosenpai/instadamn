package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.J0l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43020J0l implements BCD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C43020J0l(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.BCD
    public final void Cz1() {
        new C55101ObE(this.A01, this.A00).A02();
    }
}
