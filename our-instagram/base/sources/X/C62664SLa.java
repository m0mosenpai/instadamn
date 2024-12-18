package X;

/* renamed from: X.SLa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62664SLa {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public C62664SLa(Integer num, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TosFlow{shouldAcceptTos=");
        A1C.append(this.A01);
        A1C.append(", shouldShowExplicitTos=");
        A1C.append(this.A02);
        A1C.append(", reason=");
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLICIT_COMPONENT_STATE";
                break;
            case 2:
                str = "DEFAULT_COMPONENT_STATE";
                break;
            case 3:
                str = "UNEXPECTED_SIGNATURES_STATE";
                break;
            case 4:
                str = "APPMANAGER_NOT_INSTALLED";
                break;
            case 5:
                str = "FALLBACK_V13_NO_SIM";
                break;
            case 6:
                str = "FALLBACK_V13_EU_CANADA";
                break;
            default:
                str = "FALLBACK_V13_OUTSIDE_EU_CANADA";
                break;
        }
        A1C.append(str);
        return AbstractC167027dH.A0R(A1C);
    }
}
