package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.U6s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66273U6s implements InterfaceC72023XFl {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final SparseArray A04;
    public final InterfaceC71942XBr A05;
    public final InterfaceC71942XBr A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final HashMap A0C;
    public final List A0D;
    public final Map A0E;
    public final Map A0F;
    public final Map A0G;
    public final boolean A0H;
    public final boolean A0I;

    @Override // X.InterfaceC72023XFl
    public final String BWI() {
        return "legacy_screen";
    }

    public C66273U6s(SparseArray sparseArray, InterfaceC71942XBr interfaceC71942XBr, InterfaceC71942XBr interfaceC71942XBr2, Object obj, String str, String str2, String str3, String str4, HashMap hashMap, List list, Map map, Map map2, Map map3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        Map map4 = map;
        int i3 = i;
        long j3 = j2;
        long j4 = j;
        int i4 = i2;
        Map map5 = map3;
        Map map6 = map2;
        this.A09 = str2;
        this.A08 = str;
        this.A0C = hashMap == null ? new HashMap() : hashMap;
        this.A0F = map2 == null ? new HashMap() : map6;
        this.A0G = map3 == null ? new HashMap() : map5;
        this.A01 = i2 <= 0 ? 719983200 : i4;
        if (i3 == -1) {
            i3 = (AbstractC167017dG.A0O(str2) * 31) + (hashMap != null ? hashMap.hashCode() : 0);
            i3 = TextUtils.isEmpty(str3) ? i3 : (i3 * 31) + str3.hashCode();
            synchronized (C70005VzP.class) {
                LruCache lruCache = C70005VzP.A00;
                Integer valueOf = Integer.valueOf(i3);
                Integer num = (Integer) lruCache.get(valueOf);
                i3 = num != null ? (num.intValue() + 1) * 31 : i3;
                lruCache.put(valueOf, Integer.valueOf(i3));
            }
        }
        this.A00 = i3;
        this.A03 = j2 == -1 ? SandboxRepository.CACHE_TTL : j3;
        this.A0A = str3;
        this.A02 = j == -1 ? AwakeTimeSinceBootClock.INSTANCE.now() : j4;
        this.A0D = list;
        this.A0H = z2;
        this.A04 = sparseArray == null ? new SparseArray() : sparseArray;
        this.A0B = str4;
        this.A07 = obj;
        this.A0E = map == null ? new HashMap() : map4;
        this.A06 = interfaceC71942XBr2;
        this.A05 = interfaceC71942XBr;
        this.A0I = z;
    }

    public static Bundle A00(C66273U6s c66273U6s, boolean z) {
        long j;
        Bundle bundle = new Bundle();
        bundle.putString("BloksSurfaceProps_appId", c66273U6s.A09);
        bundle.putString("BloksSurfaceProps_analyticsModule", c66273U6s.A08);
        bundle.putSerializable("BloksSurfaceProps_params", c66273U6s.A0C);
        bundle.putInt("BloksSurfaceProps_markerId", c66273U6s.A01);
        bundle.putInt("BloksSurfaceProps_instanceId", c66273U6s.A00);
        bundle.putLong("BloksSurfaceProps_preloadTtl", c66273U6s.A03);
        Map map = c66273U6s.A0G;
        bundle.putBoolean("BloksSurfaceProps_containsExternalVariables", !map.isEmpty());
        bundle.putInt("BloksSurfaceProps_externalVariables", AbstractC66261U6f.A00(map));
        bundle.putInt("BloksSurfaceProps_clientTreeParameters", AbstractC66261U6f.A00(c66273U6s.A0F));
        bundle.putBoolean("BloksSurfaceProps_containsClientParameters", !r3.isEmpty());
        bundle.putString("BloksSurfaceProps_cacheKey", c66273U6s.A0A);
        if (z) {
            j = -1;
        } else {
            j = c66273U6s.A02;
        }
        bundle.putLong("BloksSurfaceProps_backupStartTimeStamp", j);
        bundle.putInt("BloksSurfaceProps_ttrcListener", AbstractC66261U6f.A00(c66273U6s.A0D));
        bundle.putBoolean("BloksSurfaceProps_fromConfigChanges", z);
        SparseArray sparseArray = c66273U6s.A04;
        if (sparseArray != null) {
            bundle.putInt("BloksSurfaceProps_objectSet", AbstractC66261U6f.A00(sparseArray));
        }
        String str = c66273U6s.A0B;
        if (str != null) {
            bundle.putString("BloksSurfaceProps_screenId", str);
        }
        Object obj = c66273U6s.A07;
        if (obj != null) {
            bundle.putInt("BloksSurfaceProps_screenModel", AbstractC66261U6f.A00(obj));
        }
        bundle.putInt("BloksSurfaceProps_analyticsExtras", AbstractC66261U6f.A00(c66273U6s.A0E));
        AbstractC66274U6t.A01(bundle, c66273U6s.A06, "BloksSurfaceProps_lifecycleOnNavigateTo");
        AbstractC66274U6t.A01(bundle, c66273U6s.A05, "BloksSurfaceProps_lifecycleOnNavigateFrom");
        bundle.putBoolean("BloksSurfaceProps_syncScreen", c66273U6s.A0I);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C66273U6s A01(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66273U6s.A01(android.os.Bundle):X.U6s");
    }

    public static void A02(Bundle bundle, C66273U6s c66273U6s, boolean z) {
        if (c66273U6s != null) {
            bundle.putString("__nav_data_type", "legacy_screen");
            if (z) {
                bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
                bundle.putAll(A00(c66273U6s, false));
            } else {
                bundle.putBundle("BloksSurfaceProps", A00(c66273U6s, false));
            }
        }
    }

    @Override // X.InterfaceC72023XFl
    public final String AcH() {
        return this.A09;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C66273U6s)) {
            return false;
        }
        C66273U6s c66273U6s = (C66273U6s) obj;
        String str = this.A09;
        String str2 = c66273U6s.A09;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A0C.equals(c66273U6s.A0C)) {
            return false;
        }
        String str3 = this.A0A;
        boolean isEmpty = TextUtils.isEmpty(str3);
        String str4 = c66273U6s.A0A;
        if (isEmpty) {
            equals = TextUtils.isEmpty(str4);
        } else {
            equals = str3.equals(str4);
        }
        if (!equals) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A09;
        HashMap hashMap = this.A0C;
        String str2 = this.A0A;
        int i = 0;
        int A0O = AbstractC167017dG.A0O(str) * 31;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        int i2 = A0O + i;
        if (!TextUtils.isEmpty(str2)) {
            return (i2 * 31) + str2.hashCode();
        }
        return i2;
    }

    public C66273U6s(SparseArray sparseArray, Object obj, String str, String str2, String str3, HashMap hashMap, List list, Map map, Map map2, Map map3, int i, boolean z) {
        int i2 = i;
        Map map4 = map3;
        Map map5 = map2;
        this.A09 = str;
        this.A08 = null;
        this.A0C = hashMap == null ? new HashMap() : hashMap;
        this.A0F = map2 == null ? new HashMap() : map5;
        this.A0G = map3 == null ? new HashMap() : map4;
        this.A01 = i <= 0 ? 719983200 : i2;
        int A0O = (AbstractC167017dG.A0O(str) * 31) + (hashMap != null ? hashMap.hashCode() : 0);
        A0O = TextUtils.isEmpty(str2) ? A0O : (A0O * 31) + str2.hashCode();
        synchronized (C70005VzP.class) {
            LruCache lruCache = C70005VzP.A00;
            Integer valueOf = Integer.valueOf(A0O);
            Integer num = (Integer) lruCache.get(valueOf);
            A0O = num != null ? (num.intValue() + 1) * 31 : A0O;
            lruCache.put(valueOf, Integer.valueOf(A0O));
        }
        this.A00 = A0O;
        this.A03 = SandboxRepository.CACHE_TTL;
        this.A0A = str2;
        this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
        this.A0D = list;
        this.A0H = false;
        this.A04 = sparseArray == null ? new SparseArray() : sparseArray;
        this.A0B = str3;
        this.A07 = obj;
        this.A0E = map == null ? new HashMap() : map;
        this.A06 = null;
        this.A05 = null;
        this.A0I = z;
    }
}
