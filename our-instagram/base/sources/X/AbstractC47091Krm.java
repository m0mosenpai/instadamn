package X;

/* renamed from: X.Krm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47091Krm {
    public static final EnumC46218Kcu A00(String str) {
        EnumC46218Kcu enumC46218Kcu = EnumC46218Kcu.A07;
        if (!C14360o3.A0K(str, "LUNA")) {
            EnumC46218Kcu enumC46218Kcu2 = EnumC46218Kcu.A06;
            if (!C14360o3.A0K(str, "HUGO")) {
                EnumC46218Kcu enumC46218Kcu3 = EnumC46218Kcu.A09;
                if (!C14360o3.A0K(str, "ZIGGY")) {
                    return EnumC46218Kcu.A08;
                }
                return enumC46218Kcu3;
            }
            return enumC46218Kcu2;
        }
        return enumC46218Kcu;
    }
}
