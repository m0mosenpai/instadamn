package X;

/* renamed from: X.0ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12360ke implements YOn {
    public static final InterfaceC65205Tfo A00 = new InterfaceC65205Tfo() { // from class: X.0kd
    };

    private void A00(InterfaceC58193Pqz interfaceC58193Pqz, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("EVENT TYPE: ig_contextual_config_micro_exposure_exception\n");
        A01(interfaceC58193Pqz, sb, i);
    }

    private void A02(InterfaceC58193Pqz interfaceC58193Pqz, WFT[] wftArr, WFT[] wftArr2, WFT[] wftArr3, String[] strArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("EVENT TYPE: ig_contextual_config_micro_exposure\n");
        A01(interfaceC58193Pqz, sb, i);
        sb.append(" - RESULT - ");
        if (!A03(" contexts: ", sb, interfaceC58193Pqz.ArL())) {
            sb.append(" contexts: none");
        }
        if (!A03(" , buckets: ", sb, strArr)) {
            sb.append(" , buckets: none");
        }
        if (!A03(" , values: ", sb, wftArr)) {
            sb.append(" , values: none");
        }
        if (!A03(" , monitors: ", sb, interfaceC58193Pqz.BUn())) {
            sb.append(" , monitors: none");
        }
        if (!A03(" , monitor_values: ", sb, wftArr2)) {
            sb.append(" , monitor_values: none");
        }
        A03(" , result: ", sb, wftArr3);
    }

    public static boolean A03(String str, StringBuilder sb, Object[] objArr) {
        if (objArr != null) {
            sb.append(str);
            AbstractC126965oa.A01(A00, ", ", sb, objArr);
            return true;
        }
        return false;
    }

    public static void A01(InterfaceC58193Pqz interfaceC58193Pqz, StringBuilder sb, int i) {
        sb.append(interfaceC58193Pqz.getName());
        sb.append(" (policy: ");
        sb.append(interfaceC58193Pqz.BeE());
        sb.append(" , ver: ");
        sb.append(interfaceC58193Pqz.CEq());
        sb.append(" , ver_timestamp: ");
        sb.append(interfaceC58193Pqz.Byv());
        sb.append(" , sample_rate: ");
        sb.append(i);
        sb.append(" , ");
        sb.append(interfaceC58193Pqz.BkV().A00());
        sb.append(")");
    }

    @Override // X.YOn
    public final void ECY(InterfaceC58193Pqz interfaceC58193Pqz, String str, int i) {
        A00(interfaceC58193Pqz, i);
    }

    @Override // X.YOn
    public final void ECX(InterfaceC58193Pqz interfaceC58193Pqz, WFT[] wftArr, WFT[] wftArr2, WFT[] wftArr3, String[] strArr, int i) {
        A02(interfaceC58193Pqz, wftArr, wftArr2, wftArr3, strArr, i);
    }
}
