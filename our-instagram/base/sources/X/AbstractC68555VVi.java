package X;

import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.VVi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68555VVi {
    public static final String A00(List list) {
        int i;
        if (!list.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72792XnD c72792XnD = (C72792XnD) it.next();
                if (c72792XnD.A03 == C05F.A0C) {
                    Pair A0D = MSY.A0D(c72792XnD.A04, c72792XnD.A01);
                    if (hashMap.containsKey(A0D)) {
                        Object obj = hashMap.get(A0D);
                        if (obj != null) {
                            i = Integer.valueOf(((Number) obj).intValue() + 1);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        i = 1;
                    }
                    hashMap.put(A0D, i);
                }
            }
            StringWriter stringWriter = new StringWriter();
            if (!hashMap.isEmpty()) {
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                Iterator A14 = AbstractC166997dE.A14(hashMap);
                while (A14.hasNext()) {
                    Map.Entry entry = (Map.Entry) A14.next();
                    Pair pair = (Pair) entry.getKey();
                    int A04 = AbstractC43593JPy.A04(entry);
                    A0A.A0d();
                    A0A.A0S("brush_type", (String) pair.first);
                    Object obj2 = pair.second;
                    C14360o3.A06(obj2);
                    A0A.A0S("brush_color", StringFormatUtil.formatStrLocaleSafe("#%06x", Integer.valueOf(((Number) obj2).intValue() & 16777215)));
                    A0A.A0Q("count", A04);
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.close();
            }
            return AbstractC166987dD.A19(stringWriter);
        }
        throw AbstractC31172DnG.A0u();
    }
}
