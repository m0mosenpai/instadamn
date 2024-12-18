package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2tU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62912tU {
    public C9ZS A00;
    public Long A01;
    public final C006802i A02;
    public final String A03;
    public final C62902tT A04;

    public static final void A00(C62912tU c62912tU, InterfaceC16820sZ interfaceC16820sZ) {
        UserSession userSession = c62912tU.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315404481596594L)) {
            C50722Ut c50722Ut = AbstractC50712Us.A00;
            if (AbstractC50712Us.A01.A05((int) C18U.A01(c06090Tz, userSession, 36596879458372278L)) == 0) {
                interfaceC16820sZ.invoke();
            }
        }
    }

    public C62912tU(C006802i c006802i, C62902tT c62902tT, String str) {
        this.A02 = c006802i;
        this.A04 = c62902tT;
        this.A03 = str;
    }
}
