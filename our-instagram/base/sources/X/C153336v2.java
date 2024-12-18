package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C153336v2 {
    public int A00;
    public int A01;
    public Map A02;
    public boolean A03;
    public boolean A04;
    public final Map A05 = new HashMap();

    public final void A00(int i, boolean z) {
        this.A00 = i;
        this.A04 = z;
    }

    public final void A01(String str, int i) {
        Map map = this.A02;
        if (map == null) {
            map = new HashMap();
            this.A02 = map;
        }
        map.put(str, Integer.valueOf(i));
    }
}
