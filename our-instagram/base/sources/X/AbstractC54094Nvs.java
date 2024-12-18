package X;

/* renamed from: X.Nvs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54094Nvs {
    public static final C115435Kd A00(C54600OAb c54600OAb, OXD oxd, boolean z) {
        EnumC115415Kb enumC115415Kb;
        String str;
        AbstractC167017dG.A1N(oxd, c54600OAb);
        C47Z c47z = oxd.A0C;
        C40781ul c40781ul = (C40781ul) c54600OAb.A01;
        c47z.A1d.A01++;
        c47z.A0Z(EnumC915447k.A07);
        if (c47z.A3b != null) {
            if (C18U.A06(C06090Tz.A05, oxd.A0B, 36318831865698843L)) {
                String A0x = AbstractC43593JPy.A0x();
                C14360o3.A0B(A0x, 0);
                c47z.A3t = A0x;
            }
        }
        C9BS c9bs = c47z.A0j;
        if (c9bs.A01) {
            c47z.A3u = null;
            ((java.util.Set) c9bs.A00).clear();
        }
        c47z.A09++;
        String str2 = "Failed on configure: Reply: Media needs reupload";
        if (c40781ul != null) {
            String str3 = c40781ul.mErrorTitle;
            if (str3 != null && str3.length() != 0) {
                str2 = AnonymousClass001.A0g("Failed on configure: Reply: Media needs reupload", " Title: ", str3);
            }
            String errorMessage = c40781ul.getErrorMessage();
            if (errorMessage != null && errorMessage.length() != 0) {
                str2 = AnonymousClass001.A0g(str2, " Message: ", c40781ul.getErrorMessage());
            }
            String str4 = c40781ul.mErrorSource;
            if (str4 != null && str4.length() != 0) {
                str2 = AnonymousClass001.A0g(str2, " Source: ", str4);
            }
            String str5 = c40781ul.mErrorBody;
            if (str5 != null && str5.length() != 0) {
                str2 = AnonymousClass001.A0g(str2, " Body: ", str5);
            }
        }
        if (z) {
            oxd.A0D.EHI(c47z);
            if (c47z.A1d.A01 < AbstractC25225BEi.A07(C06090Tz.A05, oxd.A0B, 36603536658011084L)) {
                enumC115415Kb = EnumC115415Kb.A0L;
                str = "server asks client to re-upload video";
            } else {
                enumC115415Kb = EnumC115415Kb.A0J;
                str = "max re-upload attempts for async config met without success.";
            }
            return oxd.A02(enumC115415Kb, str);
        }
        C115435Kd A02 = oxd.A02(EnumC115415Kb.A0L, str2);
        oxd.A0D.EHK(A02.A01, c47z, str2, c54600OAb.A02);
        return A02;
    }
}
