package X;

/* renamed from: X.Rtr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61797Rtr {
    public static int A00(String str) {
        int A0M = new C60782q2(str).A0M("Orientation", 1);
        for (EnumC61163RgP enumC61163RgP : EnumC61163RgP.values()) {
            if (A0M == enumC61163RgP.A00) {
                Number number = (Number) S8Y.A00.get(enumC61163RgP);
                if (number == null) {
                    return 0;
                }
                return number.intValue();
            }
        }
        throw AbstractC25230BEn.A0n("Invalid ExifInterface Orientation: ", A0M);
    }
}
