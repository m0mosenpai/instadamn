package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.64a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1341564a implements C64X {
    public static final C1341664b A03 = new Object();
    public final int A00;
    public final C41051vD A01;
    public final boolean A02;

    public C1341564a(C41051vD c41051vD, int i, boolean z) {
        C14360o3.A0B(c41051vD, 1);
        this.A01 = c41051vD;
        this.A00 = i;
        this.A02 = z;
    }

    public static final UserSession A00(C1341564a c1341564a) {
        UserSession userSession = c1341564a.A01.A00;
        if (userSession != null) {
            return userSession;
        }
        throw new RuntimeException("Trying to access showreel without session init");
    }

    @Override // X.C64X
    public final boolean EiK() {
        return this.A02;
    }

    @Override // X.C64X
    public final /* synthetic */ boolean Ej7() {
        return true;
    }

    public final C72064XMi A01() {
        int A01;
        long A012;
        UserSession A00 = A00(this);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A00, 36321357306340702L);
        boolean A062 = C18U.A06(c06090Tz, A00(this), 36321357306471775L);
        if (!A06 && !A062) {
            A01 = 0;
        } else {
            A01 = (int) C18U.A01(c06090Tz, A00(this), 36602832282981198L);
            if (A06 || A062) {
                A012 = C18U.A01(c06090Tz, A00(this), 36602832283112271L);
                Long valueOf = Long.valueOf(A012);
                C14360o3.A0A(valueOf);
                return new C72064XMi(A01, valueOf.longValue(), A06, A062);
            }
        }
        A012 = 0;
        Long valueOf2 = Long.valueOf(A012);
        C14360o3.A0A(valueOf2);
        return new C72064XMi(A01, valueOf2.longValue(), A06, A062);
    }

    @Override // X.C64X
    public final int AzQ() {
        return (int) C18U.A01(C06090Tz.A05, A00(this), 36592245190689145L);
    }

    @Override // X.C64X
    public final boolean CQb() {
        return C18U.A06(C06090Tz.A05, A00(this), 36310770214240530L);
    }

    @Override // X.C64X
    public final boolean CWq() {
        return C18U.A06(C06090Tz.A05, A00(this), 36310770215026965L);
    }

    @Override // X.C64X
    public final boolean Cah() {
        return C18U.A06(C06090Tz.A05, A00(this), 36310770214633747L);
    }

    @Override // X.C64X
    public final boolean Cai() {
        return C18U.A06(C06090Tz.A05, A00(this), 36310770215813400L);
    }
}
