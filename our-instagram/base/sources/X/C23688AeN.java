package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AeN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23688AeN implements C3PE {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C8DN A03;

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    public C23688AeN(Activity activity, Context context, UserSession userSession, C8DN c8dn) {
        this.A03 = c8dn;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = context;
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C183688Ct c183688Ct = this.A03.A00;
        if (AbstractC101614hW.A0E(((C8NW) c183688Ct.A1h.get()).A16())) {
            AbstractC35234FgS.A04(this.A02, this.A01);
            return true;
        }
        C8Y8 c8y8 = (C8Y8) c183688Ct.A1z.get();
        if (c8y8 != null) {
            c8y8.A0E();
        }
        this.A00.finish();
        return true;
    }
}
