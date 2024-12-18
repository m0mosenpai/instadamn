package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1w7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41571w7 {
    public final Map A00 = new HashMap();

    public final C40971v4 A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id == null || AbstractC41641wE.A00) {
            return null;
        }
        return (C40971v4) this.A00.get(id);
    }

    public final void A01(C40971v4 c40971v4) {
        C14360o3.A0B(c40971v4, 0);
        String id = c40971v4.A0K.getId();
        if (id != null && !AbstractC41641wE.A00) {
            this.A00.put(id, c40971v4);
        }
    }
}
