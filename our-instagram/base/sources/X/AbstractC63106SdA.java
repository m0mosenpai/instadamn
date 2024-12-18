package X;

/* renamed from: X.SdA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63106SdA {
    public static final SZR A00 = new SZR();
    public static final SZR A01;

    public static SZR A01() {
        return A00;
    }

    static {
        SZR szr;
        try {
            szr = (SZR) AbstractC58321PtD.A0p("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            szr = null;
        }
        A01 = szr;
    }

    public static SZR A00() {
        SZR szr = A01;
        if (szr != null) {
            return szr;
        }
        throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
    }
}
