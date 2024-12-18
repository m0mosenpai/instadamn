package X;

import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.IOException;
import kotlin.enums.EnumEntries;

/* renamed from: X.F7e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34206F7e {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.EtC, java.lang.Object] */
    public static C33600EtC parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            FxcalAccountType fxcalAccountType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    EnumEntries enumEntries = FxcalAccountType.A02;
                    C14360o3.A0B(A1P2, 0);
                    fxcalAccountType = (FxcalAccountType) FxcalAccountType.A01.get(A1P2);
                } else if ("token_id".equals(A0s)) {
                    c16l.A1D();
                } else if ("user_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("token_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumEntries enumEntries2 = EnumC33436Eq7.A02;
                    C14360o3.A0B(A1P, 0);
                    EnumC33436Eq7.A01.get(A1P);
                } else if ("token_app".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("token_source".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = fxcalAccountType;
            obj.A01 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
