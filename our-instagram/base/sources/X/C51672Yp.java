package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51672Yp {
    public static int A0C = 64;
    public static float A0D = (64.0f * 4.0f) * 4.0f;
    public C101344gr A00;
    public C51812Ze A01;
    public C2ZT A02;
    public String A03;
    public boolean A04;
    public final C9BC A05;
    public final C1KO A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;
    public final java.util.Set A0B;

    public C51672Yp(C9BC c9bc, C1KO c1ko) {
        C14360o3.A0B(c1ko, 1);
        this.A06 = c1ko;
        this.A05 = c9bc;
        this.A0A = new LinkedHashMap();
        this.A07 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.A09 = arrayList;
        this.A08 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A0B = linkedHashSet;
        this.A03 = c1ko.A01;
        arrayList.add(c1ko);
        if (c1ko instanceof C49v) {
            this.A04 = true;
        } else {
            if (!(c1ko instanceof C4JX)) {
                return;
            }
            linkedHashSet.add(Integer.valueOf(((C4JX) c1ko).A00.getKeyCode()));
        }
    }
}
