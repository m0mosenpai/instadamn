package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: X.Etm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33636Etm {
    public static final ArrayList A00(C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, AbstractC31171DnF.A0f(A03));
        ArrayList A1E = AbstractC166987dD.A1E();
        String quote = Pattern.quote(A0Z);
        C14360o3.A07(quote);
        for (String str : (String[]) AbstractC31178DnM.A1b((String) A03, quote)) {
            A1E.add(str);
        }
        return A1E;
    }
}
