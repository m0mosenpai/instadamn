package X;

/* loaded from: classes10.dex */
public abstract class S3E {
    public static RTO A00(C62931SXy c62931SXy, Integer num, Integer num2) {
        if (num2 != null) {
            if (num != null) {
                return new RTO(c62931SXy, num2.intValue(), num.intValue());
            }
            throw AbstractC58318PtA.A0x("IV size is not set");
        }
        throw AbstractC58318PtA.A0x("Key size is not set");
    }
}
