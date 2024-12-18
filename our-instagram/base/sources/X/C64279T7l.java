package X;

/* renamed from: X.T7l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64279T7l implements C2n2 {
    public static final C64279T7l A00 = new C64279T7l();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS A03;
        C2JS A02;
        C2JS c2js = (C2JS) obj;
        if (c2js != null && (A03 = c2js.A03(C59533Qh7.class, "payment_pin_update(data:$input)", 1365850279)) != null && (A02 = A03.A02(C59532Qh6.class, "authentication_ticket", -1899007378)) != null) {
            try {
                QSA qsa = (QSA) A02.A01(QSA.class, -1563793709);
                if (qsa != null) {
                    return AbstractC62194S1p.A00(qsa);
                }
                return null;
            } catch (ClassNotFoundException e) {
                throw AbstractC58318PtA.A0f(e);
            }
        }
        return null;
    }
}
