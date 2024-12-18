package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vr8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69544Vr8 {
    public final String A00;
    public final Map A01 = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeDocumentState{mName='");
        AbstractC58319PtB.A1K(sb, this.A00);
        sb.append(", mEventActions=");
        return AbstractC58320PtC.A11(this.A01, sb);
    }

    public C69544Vr8(String str, List list) {
        this.A00 = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69545Vr9 c69545Vr9 = (C69545Vr9) it.next();
            this.A01.put(c69545Vr9.A01, c69545Vr9);
        }
    }
}
