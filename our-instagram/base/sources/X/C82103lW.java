package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3lW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82103lW {
    public static final InterfaceC14020nS A01;
    public static final C82113lX A02 = new Object();
    public final C96494Vi A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3lX, java.lang.Object] */
    static {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = AbstractC82123lY.A00;
        A01 = new C18240vB(A00);
    }

    public C82103lW(UserSession userSession, int i, int i2, long j) {
        this.A00 = new C96494Vi(userSession, i2, i * 3600000, j);
    }
}
