package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IdQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41697IdQ {
    public static final long A03 = TimeUnit.SECONDS.toMillis(1);
    public final Activity A00;
    public final Resources A01;
    public final UserSession A02;

    public C41697IdQ(Activity activity, Resources resources, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = resources;
    }

    public final void A01(View view, View view2, EnumC39595He5 enumC39595He5) {
        C14360o3.A0B(view, 0);
        view2.postDelayed(new J5X(view, enumC39595He5, this), A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (X.C18U.A06(r2, r3, 36324557056913644L) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC58132lV A00(X.EnumC39595He5 r4, X.C41697IdQ r5) {
        /*
            X.He5 r0 = X.EnumC39595He5.A09
            if (r4 != r0) goto L1e
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324557057044717(0x810cfe000230ed, double:3.035134377901566E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L1e
            r0 = 36324557056913644(0x810cfe000030ec, double:3.035134377818675E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L25
        L1e:
            X.He5 r0 = X.EnumC39595He5.A08
            if (r4 == r0) goto L25
            X.2lV r0 = X.EnumC58132lV.A03
            return r0
        L25:
            X.2lV r0 = X.EnumC58132lV.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41697IdQ.A00(X.He5, X.IdQ):X.2lV");
    }
}
