package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.2Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46932Dh {
    public static final C0tH[] A00 = {AbstractC20100yh.A00(36592309613101491L), AbstractC20100yh.A00(36592309613167028L), AbstractC20100yh.A00(36315365826890917L), AbstractC20100yh.A00(36315365827742889L), AbstractC20100yh.A00(36325935741482515L)};

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.2Di] */
    public static ArrayList A00(UserSession userSession) {
        ArrayList arrayList = new ArrayList();
        C0tH[] c0tHArr = A00;
        int i = 0;
        do {
            C0tH c0tH = c0tHArr[i];
            String str = c0tH.universeName;
            String str2 = c0tH.name;
            String obj = c0tH.A00(userSession).toString();
            ?? obj2 = new Object();
            obj2.A01 = str;
            obj2.A00 = str2;
            obj2.A02 = obj;
            arrayList.add(obj2);
            i++;
        } while (i < 5);
        return arrayList;
    }
}
