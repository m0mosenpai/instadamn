package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hn7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39917Hn7 {
    public static Map A00(JLO jlo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jlo.getLength();
        A1I.put("length", Integer.valueOf(jlo.getLength()));
        jlo.getOffset();
        A1I.put("offset", Integer.valueOf(jlo.getOffset()));
        if (jlo.Bhi() != null) {
            A1I.put("profile_deeplink", jlo.Bhi());
        }
        if (jlo.BiG() != null) {
            A1I.put("profile_www_link", jlo.BiG());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
