package X;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class I4G {
    public static final String A00(C38822H7p c38822H7p) {
        List list = c38822H7p.A07;
        if (list != null && !list.isEmpty()) {
            String str = ((H66) list.get(0)).A00;
            if (str == null) {
                return "";
            }
            return str;
        }
        throw AbstractC166987dD.A14("non-empty stickers expected");
    }
}
