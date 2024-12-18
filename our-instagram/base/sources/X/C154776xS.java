package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154776xS {
    public final Map A00;

    public C154776xS(Context context, UserSession userSession, C1GL c1gl, C61582rL c61582rL, InterfaceC154766xR interfaceC154766xR, C37494GfC c37494GfC, List list) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1gl, 3);
        this.A00 = new EnumMap(EnumC125775mS.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC125775mS enumC125775mS = (EnumC125775mS) it.next();
            this.A00.put(enumC125775mS, new C154786xT(context, userSession, c1gl, c61582rL, interfaceC154766xR, enumC125775mS, c37494GfC, null, false));
        }
    }

    public static final C154786xT A00(C154776xS c154776xS, EnumC125775mS enumC125775mS) {
        Object obj = c154776xS.A00.get(enumC125775mS);
        if (obj != null) {
            return (C154786xT) obj;
        }
        throw new IllegalStateException("Network source must be instantiated");
    }
}
