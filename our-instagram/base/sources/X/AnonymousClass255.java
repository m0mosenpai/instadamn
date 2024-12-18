package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.255, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass255 extends AbstractRunnableC14200nk {
    public final /* synthetic */ AnonymousClass253 A00;

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass253 anonymousClass253 = this.A00;
        UserSession userSession = anonymousClass253.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A1G;
        C0YR[] c0yrArr = C23031Ai.A8c;
        int intValue = ((Number) interfaceC16530ry.CES(A00, c0yrArr[22])).intValue();
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        long longValue = ((Number) A002.A1H.CES(A002, c0yrArr[23])).longValue();
        boolean z = true;
        if (intValue == -1 || intValue == 0 || intValue != 1) {
            z = false;
        }
        anonymousClass253.A01 = z;
        anonymousClass253.A00 = longValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass255(AnonymousClass253 anonymousClass253) {
        super(1793449280, 3, false, false);
        this.A00 = anonymousClass253;
    }
}
