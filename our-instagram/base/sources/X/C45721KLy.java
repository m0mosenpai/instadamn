package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KLy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45721KLy extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45721KLy(UserSession userSession, Context context) {
        super(1639392710, 2, false, true);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JQ0.A0J(this.A01).A00(this.A00);
    }
}
