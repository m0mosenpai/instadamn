package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49472Pe {
    public final List A00(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        List<String> A0R = AbstractC001900j.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        for (String str2 : A0R) {
            C9ZT c9zt = null;
            if (str2 != null) {
                try {
                    c9zt = AbstractC23026ADi.parseFromJson(C16V.A00(str2));
                } catch (IOException e) {
                    AbstractC12120kG.A06("ClipsSoundEffectConverter", "Failed to deserialize ClipsSoundEffect from ClipsDraft", e);
                }
            }
            if (c9zt != null) {
                arrayList.add(c9zt);
            }
        }
        return arrayList;
    }
}
