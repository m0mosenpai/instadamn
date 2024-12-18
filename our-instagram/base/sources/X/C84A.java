package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.84A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84A implements InterfaceC13000lm {
    public final Map A00;
    public final Context A01;
    public final C12N A02;
    public final UserSession A03;
    public final C49602Pt A04;

    public C84A(Context context, C12N c12n, UserSession userSession, C49602Pt c49602Pt) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c49602Pt, 3);
        C14360o3.A0B(c12n, 4);
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = c49602Pt;
        this.A02 = c12n;
        this.A00 = new HashMap();
    }

    public final C84F A00(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A00;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new C84F(this.A01, this.A02, this.A03, this.A04);
            map.put(str, obj);
        }
        return (C84F) obj;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Map map = this.A00;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C84F) it.next()).A00();
        }
        map.clear();
    }
}
