package X;

/* renamed from: X.RtL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61766RtL {
    public static Enum A00(Class cls, String str) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            for (Enum r1 : enumArr) {
                if (r1.name().equalsIgnoreCase(str)) {
                    return r1;
                }
            }
        }
        return null;
    }
}
