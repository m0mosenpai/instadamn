package X;

import android.R;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.356, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass356 extends AnonymousClass346 {
    public AnonymousClass359 A00;
    public final UserSession A01;
    public final AnonymousClass357 A02;
    public final boolean A03;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.2uS, java.lang.Object] */
    public AnonymousClass356(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A01 = userSession;
        int integer = context.getResources().getInteger(R.integer.config_mediumAnimTime);
        C675432t c675432t = new C675432t(userSession, interfaceC60442pS, c1m1);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36313424501934051L);
        boolean z = true;
        boolean z2 = !C18U.A06(c06090Tz, userSession, 36313424501868514L);
        if (!A06 && !z2) {
            z = false;
        }
        this.A03 = z;
        this.A02 = new AnonymousClass357(c675432t, AbstractC12220kQ.A01(interfaceC60442pS, userSession), integer);
        if (C18U.A06(C06090Tz.A06, this.A01, 36313424501868514L)) {
            this.A00 = new AnonymousClass359(c675432t, userSession, interfaceC60442pS, AbstractC63462uT.A00(userSession), new Object());
        }
    }
}
