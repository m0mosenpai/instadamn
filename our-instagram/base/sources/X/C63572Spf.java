package X;

/* renamed from: X.Spf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63572Spf implements C1N8 {
    public static final C63572Spf A00 = new C63572Spf();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QWW qww;
        C2JS A02;
        C2JS reinterpretRequired;
        C58924QQm c58924QQm;
        C2JS A04;
        R0M r0m = (R0M) obj;
        if (r0m == null) {
            return null;
        }
        QRH A0E = r0m.A0E();
        if (A0E != null && (A04 = A0E.A04(QRE.class, "error", -1726869523)) != null) {
            qww = AbstractC58322PtE.A0L(A04);
        } else {
            qww = null;
        }
        QRH A0E2 = r0m.A0E();
        if (A0E2 != null && (A02 = A0E2.A02(QRD.class, "additional_authentication_error", -1706267096)) != null && (reinterpretRequired = A02.reinterpretRequired(0, QQc.class, -2102847039)) != null) {
            C2JS optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "auth_factor_requirements", QQb.class, 1632846769);
            if (optionalTreeField != null && optionalTreeField.reinterpretRequired(0, C58924QQm.class, 1363505257) != null) {
                C2JS optionalTreeField2 = reinterpretRequired.getOptionalTreeField(0, "auth_factor_requirements", QQb.class, 1632846769);
                if (optionalTreeField2 != null && (c58924QQm = (C58924QQm) optionalTreeField2.reinterpretRequired(0, C58924QQm.class, 1363505257)) != null) {
                    return new REX(AbstractC62183S1e.A00(c58924QQm));
                }
                throw AbstractC166997dE.A0g();
            }
            return new REX(new C62738SOe(C16930sl.A00, 0));
        }
        if (qww == null) {
            return null;
        }
        return AbstractC63238Sfs.A03(qww);
    }
}
