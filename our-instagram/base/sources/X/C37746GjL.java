package X;

/* renamed from: X.GjL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37746GjL implements InterfaceC62702t9 {
    public static final C37746GjL A00 = new C37746GjL();

    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        String str;
        String str2;
        C38321qM c38321qM;
        C14360o3.A0B(c59062n7, 0);
        C120985dq c120985dq = (C120985dq) c59062n7.A03;
        if (c120985dq == null || (str = c120985dq.A06().A0j) == null) {
            str = "";
        }
        String hexString = Integer.toHexString(str.hashCode());
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            str2 = c38321qM.getId();
        } else {
            str2 = null;
        }
        return AnonymousClass001.A0T(hexString, str2, '_');
    }
}
