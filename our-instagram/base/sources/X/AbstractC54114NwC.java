package X;

/* renamed from: X.NwC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54114NwC {
    public static final EnumC53253Ngr A00(String str) {
        C14360o3.A0B(str, 0);
        EnumC53253Ngr enumC53253Ngr = EnumC53253Ngr.A04;
        if (!"everyone".equals(str)) {
            enumC53253Ngr = EnumC53253Ngr.A06;
            if (!"people_you_follow".equals(str)) {
                enumC53253Ngr = EnumC53253Ngr.A05;
                if (!"off".equals(str)) {
                    throw AbstractC166987dD.A12("Could not convert to UserTagSettings");
                }
            }
        }
        return enumC53253Ngr;
    }
}
