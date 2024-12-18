package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.3Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70013Cl implements InterfaceC13050lr {
    public long A01;
    public boolean A02;
    public final LinkedList A03 = new LinkedList();
    public double A00 = 0.0d;

    public final synchronized String A01() {
        String str;
        LinkedList linkedList = this.A03;
        if (linkedList.isEmpty()) {
            str = "";
        } else {
            str = (String) linkedList.getLast();
        }
        return str;
    }

    public final synchronized String A02() {
        String str;
        LinkedList linkedList = this.A03;
        if (linkedList.isEmpty()) {
            str = "";
        } else {
            str = (String) linkedList.getFirst();
            for (int i = 1; i < linkedList.size(); i++) {
                str = AnonymousClass001.A0g(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, (String) linkedList.get(i));
            }
        }
        return str;
    }

    public static C70013Cl A00(final UserSession userSession) {
        return (C70013Cl) userSession.A01(C70013Cl.class, new InterfaceC16820sZ() { // from class: X.3Cm
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C70013Cl(UserSession.this);
            }
        });
    }

    public final void A03(String str) {
        if (this.A02) {
            synchronized (this) {
                LinkedList linkedList = this.A03;
                linkedList.addLast(str);
                if (linkedList.size() > this.A01) {
                    linkedList.removeFirst();
                }
            }
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A03.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (X.C18U.A06(r3, r5, 36315580575845801L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70013Cl(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.A03 = r0
            r2 = 0
            r0 = 0
            r4.A00 = r0
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36593460664993097(0x82018f000a0549, double:3.20519010235604E-306)
            long r0 = X.C18U.A01(r3, r5, r0)
            r4.A01 = r0
            r0 = 36311985687823189(0x81018f00030355, double:3.027184193385031E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L40
            r0 = 36311985687692115(0x81018f00010353, double:3.027184193302139E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L40
            X.C14360o3.A0B(r5, r2)
            r0 = 36315580575845801(0x8104d400090da9, double:3.029457615045983E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto L41
        L40:
            r2 = 1
        L41:
            r4.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70013Cl.<init>(com.instagram.common.session.UserSession):void");
    }
}
