package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93834Jr {
    public C50104M9s A00;
    public final Map A01;
    public final Map A02;

    public final Object A00(C6C2 c6c2) {
        Object obj;
        String str = c6c2.A01;
        if (str != null && (obj = this.A02.get(str)) != null) {
            return obj;
        }
        String str2 = c6c2.A00;
        if (str2 != null) {
            return this.A01.get(str2);
        }
        return null;
    }

    public final void A01(C6C2 c6c2, Object obj) {
        String str = c6c2.A01;
        boolean z = false;
        if (str != null) {
            z = true;
        }
        C18C.A0G(z, "Insertion key can only have either igid or fbid set");
        if (str != null) {
            this.A02.put(str, obj);
        }
    }

    public C93834Jr(C93834Jr c93834Jr) {
        this.A02 = new HashMap(c93834Jr.A02);
        this.A01 = new HashMap(c93834Jr.A01);
    }

    public C93834Jr() {
        this.A02 = new HashMap();
        this.A01 = new HashMap();
    }
}
