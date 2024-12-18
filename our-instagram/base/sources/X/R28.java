package X;

/* loaded from: classes10.dex */
public final class R28 extends SP6 {
    public C62541SFs A00;

    public final String toString() {
        Long valueOf;
        String str;
        String str2;
        C62541SFs c62541SFs = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{src_pkg=");
        A1C.append(this.A02);
        A1C.append(", status=");
        A1C.append(A02());
        A1C.append(MSV.A00(37));
        A1C.append(A00());
        A1C.append(", creation_time=");
        if (c62541SFs == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(c62541SFs.A00);
        }
        A1C.append(valueOf);
        A1C.append(", generator_pkg=");
        if (c62541SFs == null) {
            str = null;
        } else {
            str = c62541SFs.A02;
        }
        A1C.append(str);
        A1C.append(", generator_action=");
        if (c62541SFs == null) {
            str2 = null;
        } else {
            str2 = c62541SFs.A01;
        }
        A1C.append(str2);
        A1C.append(", prev_generator_pkg=");
        A1C.append((String) null);
        A1C.append(", prev_generator_action=");
        return AbstractC50523MSb.A0W(null, A1C);
    }
}
