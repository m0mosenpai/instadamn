package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LwJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49626LwJ implements C7XU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47443KxY A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C49626LwJ(Context context, UserSession userSession, C47443KxY c47443KxY) {
        this.A02 = c47443KxY;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.C7XU
    public final void DAy() {
        C47443KxY c47443KxY = this.A02;
        if (!c47443KxY.A00) {
            new C55101ObE(this.A01, this.A00).A02();
            c47443KxY.A00 = false;
        }
    }
}
