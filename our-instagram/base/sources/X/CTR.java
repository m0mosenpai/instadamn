package X;

import android.text.Layout;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CTR {
    public final ArrayList A00(Layout layout, Integer num, String str) {
        ArrayList A1E;
        int i = 0;
        C14360o3.A0B(layout, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    A1E = AbstractC166987dD.A1E();
                    int lineCount = layout.getLineCount();
                    while (i < lineCount) {
                        AbstractC166997dE.A1R(Integer.valueOf(layout.getLineStart(i)), Integer.valueOf(layout.getLineEnd(i)), A1E);
                        i++;
                    }
                } else {
                    throw B4Z.A00();
                }
            } else {
                if (str == null) {
                    str = layout.getText().toString();
                }
                A1E = AbstractC166987dD.A1E();
                int length = str.length();
                int i2 = -1;
                while (i < length) {
                    if (!C11K.A01(str.charAt(i))) {
                        if (i2 == -1) {
                            i2 = i;
                        }
                    } else if (i2 != -1) {
                        AbstractC166997dE.A1R(Integer.valueOf(i2), Integer.valueOf(i), A1E);
                        i2 = -1;
                    }
                    i++;
                }
                if (i2 != -1) {
                    AbstractC166997dE.A1R(Integer.valueOf(i2), Integer.valueOf(length), A1E);
                }
            }
        } else {
            if (str == null) {
                str = layout.getText().toString();
            }
            A1E = AbstractC166987dD.A1E();
            int i3 = 0;
            int i4 = 0;
            while (i3 < str.length()) {
                i++;
                if (!C11K.A01(str.charAt(i3))) {
                    AbstractC166997dE.A1R(Integer.valueOf(i4), Integer.valueOf(i), A1E);
                }
                i3++;
                i4 = i;
            }
        }
        return A1E;
    }
}
