package X;

/* renamed from: X.FxZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36159FxZ implements InterfaceC12870lZ {
    public static String A00;
    public static String A01;
    public static String A02;
    public static final C36159FxZ A03;

    public final boolean A00(AbstractC12990ll abstractC12990ll, String str) {
        String str2;
        if (C1AD.A06(AbstractC25225BEi.A0j(abstractC12990ll, 2), 18302732548969263L) && !AbstractC31181DnP.A11(abstractC12990ll, str) && (str2 = A02) != null && str2.length() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lZ, java.lang.Object, X.FxZ] */
    static {
        ?? obj = new Object();
        A03 = obj;
        C218914p.A05(obj);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A032 = C0f9.A03(-1496038186);
        A02 = null;
        A00 = null;
        A01 = null;
        C0f9.A0A(-10451535, A032);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1677661108, C0f9.A03(1906622948));
    }
}
