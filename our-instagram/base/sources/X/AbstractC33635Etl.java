package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.Etl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33635Etl {
    public static final ArrayList A00(C6FW c6fw) {
        int i = 0;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        Integer num = C05F.A0N;
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num2 = A00[i];
            if (C14360o3.A0K(AbstractC34255F9b.A00(num2), A03)) {
                num = num2;
                break;
            }
            i++;
        }
        Context context = C1LZ.A00().A00;
        ArrayList A12 = AbstractC166997dE.A12(num, 0);
        ArrayList A002 = AbstractC34340FCi.A00(context);
        if (!A002.isEmpty()) {
            A12.addAll(A002);
        }
        if (num != C05F.A0C && num != num && "".length() != 0) {
            A12.add("");
        }
        String str = FEW.A00;
        if (str != null && str.length() != 0) {
            A12.add(str);
        }
        return A12;
    }
}
