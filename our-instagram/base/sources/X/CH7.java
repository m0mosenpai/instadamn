package X;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class CH7 {
    public static final C5C8 A00(Resources resources, C5W3 c5w3, C26062Bfp[] c26062BfpArr, int i) {
        C6C7 A0g = AbstractC25228BEl.A0g();
        ArrayList A17 = AbstractC25225BEi.A17(c26062BfpArr.length);
        for (C26062Bfp c26062Bfp : c26062BfpArr) {
            A17.add(resources.getString(c26062Bfp.A00));
        }
        String[] strArr = (String[]) A17.toArray(new String[0]);
        String string = resources.getString(i, Arrays.copyOf(strArr, strArr.length));
        C14360o3.A07(string);
        A0g.A09(string);
        for (C26062Bfp c26062Bfp2 : c26062BfpArr) {
            String A0q = AbstractC166997dE.A0q(resources, c26062Bfp2.A00);
            int A08 = AbstractC001900j.A08(string, A0q, 0, false);
            int A04 = AbstractC25226BEj.A04(A0q, A08);
            A0g.A06(c5w3, A08, A04);
            A0g.A0A(c26062Bfp2.A02, c26062Bfp2.A01, A08, A04);
        }
        return A0g.A02();
    }
}
