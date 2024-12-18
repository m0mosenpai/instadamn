package X;

import com.instagram.common.bloks.signals.CollectionHelpers$iterator$1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140026Vg {
    public final AnonymousClass632 A00;
    public final C6FD A01;
    public final C63162tt A02;
    public final C140016Vf A03;
    public final C140036Vh A04;
    public final C68734VbD A05;
    public final InterfaceC103074ki A06;
    public final String A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;

    public final boolean A01(String[] strArr) {
        boolean z;
        int length;
        boolean A04;
        C14360o3.A0B(strArr, 0);
        C68734VbD c68734VbD = this.A05;
        if (c68734VbD != null) {
            C18570vk c18570vk = c68734VbD.A00;
            synchronized (c18570vk) {
                z = false;
                if (c18570vk.A01 == 0) {
                    z = true;
                }
            }
            if (!z && (length = strArr.length) != 0) {
                int i = 0;
                do {
                    String str = strArr[i];
                    synchronized (c18570vk) {
                        A04 = c18570vk.A04(str);
                    }
                    if (A04) {
                        return true;
                    }
                    i++;
                } while (i < length);
            }
        }
        return false;
    }

    public C140026Vg(AnonymousClass632 anonymousClass632, C6FD c6fd, C63162tt c63162tt, C140026Vg c140026Vg, C140016Vf c140016Vf, InterfaceC103074ki interfaceC103074ki, String str) {
        Map map;
        C18570vk c18570vk;
        HashMap hashMap;
        C18590vm c18590vm;
        this.A00 = anonymousClass632;
        this.A06 = interfaceC103074ki;
        this.A01 = c6fd;
        this.A02 = c63162tt;
        this.A07 = str;
        this.A03 = c140016Vf;
        Map map2 = anonymousClass632.A08;
        C14360o3.A06(map2);
        this.A04 = new C140036Vh(map2);
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        this.A08 = synchronizedMap;
        C68734VbD c68734VbD = null;
        if (c140026Vg != null) {
            map = c140026Vg.A08;
        } else {
            map = null;
        }
        this.A09 = map;
        if (c140026Vg != null) {
            C18570vk c18570vk2 = AbstractC004901o.A00;
            c18570vk = new C18570vk(6);
            C18590vm c18590vm2 = c140026Vg.A04.A00;
            synchronized (c18590vm2) {
                c18590vm = new C18590vm(c18590vm2.A01);
                Object[] objArr = c18590vm2.A03;
                Object[] objArr2 = c18590vm2.A04;
                long[] jArr = c18590vm2.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    c18590vm.A09(objArr[i4], objArr2[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            C105094oP A0D = AbstractC224917l.A0D(new CollectionHelpers$iterator$1(c18590vm, null));
            while (A0D.hasNext()) {
                C09530e4 c09530e4 = (C09530e4) A0D.next();
                Object obj = c09530e4.A00;
                if (!C14360o3.A0K(map2.get(obj), c09530e4.A01)) {
                    c18570vk.A09(obj);
                }
            }
            c68734VbD = new C68734VbD(c18570vk);
        } else {
            c18570vk = null;
        }
        this.A05 = c68734VbD;
        HashMap hashMap2 = new HashMap();
        if (c18570vk != null && c140026Vg != null) {
            synchronized (c140026Vg.A0A) {
                hashMap = new HashMap(c140026Vg.A0A);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                C69748Vui c69748Vui = (C69748Vui) entry.getValue();
                if (!A01((String[]) c69748Vui.A01.toArray(new String[0]))) {
                    hashMap2.put(key, c69748Vui);
                }
            }
        }
        this.A0A = Collections.synchronizedMap(hashMap2);
    }

    public final C6FQ A00(C102884kP c102884kP, InterfaceC136406Ft interfaceC136406Ft, InterfaceC103384lE interfaceC103384lE) {
        List list = c102884kP.A0A;
        Map map = this.A08;
        AnonymousClass632 anonymousClass632 = this.A00;
        Map map2 = this.A0A;
        InterfaceC103074ki interfaceC103074ki = this.A06;
        return new C6FQ(null, null, null, anonymousClass632, interfaceC136406Ft, this.A02, interfaceC103384lE, interfaceC103074ki, C05F.A00, this.A07, null, list, map, map2);
    }
}
