package X;

/* loaded from: classes10.dex */
public abstract class S3O {
    public static C60799RTk A00(SY8 sy8, Integer num, Integer num2) {
        if (num != null) {
            if (num2 != null) {
                return new C60799RTk(sy8, num.intValue(), num2.intValue());
            }
            throw AbstractC58318PtA.A0x("tag size not set");
        }
        throw AbstractC58318PtA.A0x("key size not set");
    }
}
