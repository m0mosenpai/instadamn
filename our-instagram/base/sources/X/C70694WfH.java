package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.WfH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70694WfH implements C6DU {
    public final C1339263a A00;
    public final String A01;
    public final Map A02;
    public final long A03;
    public final V4W A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Map A08;

    public C70694WfH(C1339263a c1339263a, V4W v4w, String str, String str2, String str3, Map map, Map map2, long j) {
        Map map3;
        C14360o3.A0B(str2, 3);
        this.A04 = v4w;
        this.A01 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = j;
        this.A08 = map;
        this.A07 = map2;
        this.A00 = c1339263a;
        if (v4w != null) {
            map3 = A00(v4w.A00, this, C05F.A00);
        } else {
            map3 = null;
        }
        this.A02 = map3;
    }

    public static final Map A00(Q08 q08, C70694WfH c70694WfH, Integer num) {
        C09530e4[] c09530e4Arr;
        C09530e4 c09530e4;
        Integer num2 = num;
        if (!(q08 instanceof Q09)) {
            if (q08 instanceof C60925Rbf) {
                AbstractC25241Le.A00(null, "BloksComponentQueryInitialData", AnonymousClass001.A0g("Network request failed for component query with app id ", c70694WfH.A05, ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."), ((C60925Rbf) q08).A00);
                num2 = C05F.A0C;
            } else {
                throw new RuntimeException();
            }
        }
        Map A00 = AbstractC62261S4g.A00(q08, num2);
        if (!(q08 instanceof Q0A)) {
            c09530e4Arr = new C09530e4[2];
            c09530e4 = new C09530e4("components", null);
        } else {
            Map map = ((Q0A) q08).A00.A01;
            LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                A0y.put(entry.getKey(), new C6AQ(entry.getValue(), c70694WfH.A06, C16930sl.A00, c70694WfH.A07));
            }
            c09530e4Arr = new C09530e4[2];
            c09530e4 = new C09530e4("components", A0y);
        }
        c09530e4Arr[0] = c09530e4;
        c09530e4Arr[1] = new C09530e4("info", A00);
        return AbstractC06930Yk.A06(c09530e4Arr);
    }

    @Override // X.C6DU
    public final Runnable AIf(C6FG c6fg, AnonymousClass630 anonymousClass630, C63162tt c63162tt) {
        C6Er c6Er;
        if (this.A04 != null) {
            return null;
        }
        C1339263a c1339263a = this.A00;
        VIV A02 = c1339263a.A02(this.A05, this.A08, new BAO(0, anonymousClass630, this), this.A03, false);
        if (A02 instanceof V4W) {
            synchronized (c1339263a.A0A) {
                c6Er = c1339263a.A00;
            }
            anonymousClass630.A0I(new C6FO(c6Er), A00(((V4W) A02).A00, this, C05F.A01), "acq", this.A01);
            return null;
        }
        if (A02 instanceof C66236U5g) {
            return ((C66236U5g) A02).A00;
        }
        throw new RuntimeException();
    }

    @Override // X.C6DU
    public final /* bridge */ /* synthetic */ Object BHk() {
        return this.A02;
    }
}
