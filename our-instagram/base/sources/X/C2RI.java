package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2RI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RI {
    public static C2RI A04;
    public final int A01;
    public String A00 = "";
    public final Map A02 = new HashMap();
    public final java.util.Set A03 = new HashSet();

    public C2RI(int i) {
        this.A01 = i;
        C0L6.A02(new C0L2() { // from class: X.2RJ
            @Override // X.C0L2
            public final /* synthetic */ void DDi(String str, String str2, WeakReference weakReference) {
                C2RI c2ri = C2RI.this;
                Map map = c2ri.A02;
                synchronized (map) {
                    c2ri.A00 = str2;
                    map.clear();
                    c2ri.A03.clear();
                }
            }
        });
    }
}
