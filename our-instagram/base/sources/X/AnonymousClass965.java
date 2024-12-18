package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.965, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass965 implements InterfaceC12870lZ {
    public static AnonymousClass965 A02;
    public static final AnonymousClass966 A03 = new Object();
    public final AnonymousClass968 A00;
    public final AnonymousClass969 A01 = new AnonymousClass969();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0iw, java.lang.Object] */
    public AnonymousClass965(Context context, UserSession userSession) {
        this.A00 = new AnonymousClass968(context, AbstractC12220kQ.A01(new Object(), userSession), userSession);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        int A032 = C0f9.A03(1730655972);
        if (!C18U.A06(C06090Tz.A05, this.A00.A02, 36310765916913935L)) {
            i = 1046696534;
        } else {
            AtomicBoolean atomicBoolean = this.A01.A00;
            if (!atomicBoolean.getAndSet(true)) {
                if (AbstractC19730y1.A00(AbstractC12960li.A00).A00.getLong("bigfoot_reporter_last_foreground_measurement", 0L) < System.currentTimeMillis() - 86400000) {
                    C14120nc.A00().ATO(new C60943Rbx(this));
                } else {
                    atomicBoolean.set(false);
                }
            }
            i = 1001981991;
        }
        C0f9.A0A(i, A032);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(916252009, C0f9.A03(1805108369));
    }
}
