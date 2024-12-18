package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163507Tn {
    public final Map A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C163507Tn() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    public final C160787Im A01(String str) {
        if (str == null) {
            return null;
        }
        Map map = this.A01;
        if (!map.containsKey(str)) {
            map = this.A00;
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return (C160787Im) map.get(str);
    }

    public final void A02(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        String A0h = c83403nh.A0h();
        if (A0h != null && A0h.length() != 0) {
            this.A01.put(A0h, c160787Im);
        }
        String A0g = c83403nh.A0g();
        if (A0g != null && A0g.length() != 0) {
            this.A00.put(A0g, c160787Im);
        }
    }

    public /* synthetic */ C163507Tn(Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.A01 = concurrentHashMap;
        this.A00 = concurrentHashMap2;
    }

    public final void A03(C160787Im c160787Im) {
        C83403nh c83403nh = c160787Im.A0e;
        if (c83403nh != null) {
            String A0h = c83403nh.A0h();
            if (A0h != null && A0h.length() != 0) {
                this.A01.remove(A0h);
            }
            String A0g = c83403nh.A0g();
            if (A0g != null && A0g.length() != 0) {
                this.A00.remove(A0g);
            }
        }
    }

    public final C160787Im A00(C83403nh c83403nh) {
        C160787Im c160787Im;
        C2EY c2ey;
        C2EY c2ey2;
        String A0h = c83403nh.A0h();
        if (A0h == null || (c160787Im = (C160787Im) this.A01.get(A0h)) == null) {
            String A0g = c83403nh.A0g();
            if (A0g != null) {
                c160787Im = (C160787Im) this.A00.get(A0g);
            } else {
                c160787Im = null;
            }
            if (c160787Im == null || ((c2ey = c83403nh.A10) != (c2ey2 = c160787Im.A0e.A10) && (c2ey2 != C2EY.A19 || c2ey != C2EY.A1G))) {
                return null;
            }
        }
        return c160787Im;
    }
}
