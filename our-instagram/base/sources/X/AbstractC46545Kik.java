package X;

import java.util.ArrayList;

/* renamed from: X.Kik, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46545Kik {
    public static final C47217Ktq A00(String str) {
        boolean z;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (!Character.isDigit(str.charAt(i))) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return null;
        }
        char[] charArray = str.toCharArray();
        C14360o3.A07(charArray);
        ArrayList A17 = AbstractC25225BEi.A17(charArray.length);
        for (char c : charArray) {
            int digit = Character.digit((int) c, 10);
            if (digit >= 0) {
                A17.add(String.valueOf(digit));
            } else {
                throw AbstractC166987dD.A12(AnonymousClass001.A0T("Char ", " is not a decimal digit", c));
            }
        }
        return new C47217Ktq(AbstractC001800i.A0P("", "", "", A17, null));
    }
}
