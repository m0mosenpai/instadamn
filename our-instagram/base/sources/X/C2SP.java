package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.2SP, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SP {
    public static final C2SB A00(UserSession userSession) {
        return (C2SB) userSession.A01(C2SB.class, new C9E1(userSession, 17));
    }

    public static final String A01(ImmutableList immutableList, ImmutableList immutableList2) {
        StringBuilder sb;
        String A05;
        if (immutableList.isEmpty() && immutableList2.isEmpty()) {
            return null;
        }
        if (immutableList.isEmpty()) {
            sb = new StringBuilder();
            sb.append("thread_id NOT IN ('");
            A05 = AbstractC13670mt.A05("','", immutableList2);
        } else if (immutableList2.isEmpty()) {
            sb = new StringBuilder();
            sb.append("thread_id IN ('");
            A05 = AbstractC13670mt.A05("','", immutableList);
        } else {
            ArrayList arrayList = new ArrayList(immutableList);
            arrayList.removeAll(immutableList2);
            sb = new StringBuilder();
            sb.append("thread_id IN ('");
            A05 = AbstractC13670mt.A05("','", arrayList);
        }
        sb.append(A05);
        sb.append("')");
        return sb.toString();
    }
}
