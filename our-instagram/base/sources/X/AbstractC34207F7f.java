package X;

import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.StringWriter;
import kotlin.enums.EnumEntries;

/* renamed from: X.F7f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34207F7f {
    public static String A00(FNZ fnz) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        FxcalAccountType fxcalAccountType = fnz.A00;
        if (fxcalAccountType != null) {
            EnumEntries enumEntries = FxcalAccountType.A02;
            A0S.A0S("account_type", fxcalAccountType.A00);
        }
        A0S.A0Q("token_id", 0);
        String str = fnz.A04;
        if (str != null) {
            A0S.A0S("token_str", str);
        }
        String str2 = fnz.A05;
        if (str2 != null) {
            A0S.A0S("user_fbid", str2);
        }
        EnumC33436Eq7 enumC33436Eq7 = fnz.A01;
        if (enumC33436Eq7 != null) {
            EnumEntries enumEntries2 = EnumC33436Eq7.A02;
            A0S.A0S("token_type", enumC33436Eq7.A00);
        }
        String str3 = fnz.A02;
        if (str3 != null) {
            A0S.A0S("token_app", str3);
        }
        String str4 = fnz.A03;
        if (str4 != null) {
            A0S.A0S("token_source", str4);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
