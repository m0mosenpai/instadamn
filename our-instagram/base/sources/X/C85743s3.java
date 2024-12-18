package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85743s3 {
    public static final String A01(Collection collection) {
        C14360o3.A0B(collection, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0A.A0u((String) it.next());
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public static final String A00(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A19(userSession)) {
                A0A.A0d();
                A0A.A0S("reel_id", reel.getId());
                A0A.A0R("created_at", reel.A03);
                A0A.A0a();
            }
        }
        A0A.A0Z();
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final String A02(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = reel.A0O(userSession).iterator();
            while (it2.hasNext()) {
                C38321qM c38321qM = ((C41181vS) it2.next()).A0b;
                if (c38321qM != null) {
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        arrayList.add(A2u);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                A0A.A0d();
                A0A.A0S("reel_id", reel.getId());
                A0A.A0S("media_count", String.valueOf(arrayList.size()));
                A0A.A0R("timestamp", reel.A03);
                A0A.A0S("media_ids", A01(arrayList));
                A0A.A0a();
            }
        }
        A0A.A0Z();
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
