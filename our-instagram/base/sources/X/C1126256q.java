package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.56q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1126256q {
    public HashMap A02 = new HashMap();
    public HashMap A00 = new HashMap();
    public HashMap A01 = new HashMap();

    public final void A01(C1125456i c1125456i, EnumC1125356h enumC1125356h, MediaEffect mediaEffect) {
        A02(c1125456i, enumC1125356h, mediaEffect, null);
    }

    public static void A00(EnumC1125356h enumC1125356h, C1126256q c1126256q, String str) {
        AbstractMap abstractMap = (AbstractMap) c1126256q.A02.get(enumC1125356h);
        if (abstractMap != null) {
            Iterator it = new ArrayList(abstractMap.values()).iterator();
            while (it.hasNext() && !((C1125956n) it.next()).A03.containsKey(str)) {
            }
        }
    }

    public final void A02(C1125456i c1125456i, EnumC1125356h enumC1125356h, MediaEffect mediaEffect, String str) {
        AbstractMap hashMap;
        if (str != null) {
            try {
                HashMap hashMap2 = this.A01;
                if (hashMap2.containsKey(enumC1125356h)) {
                    hashMap = (AbstractMap) hashMap2.get(enumC1125356h);
                } else {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(str)) {
                    A00(enumC1125356h, this, str);
                }
                hashMap.put(str, mediaEffect);
                hashMap2.put(enumC1125356h, hashMap);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
        C69688VtY c69688VtY = new C69688VtY(c1125456i, mediaEffect);
        List arrayList = new ArrayList();
        HashMap hashMap3 = this.A00;
        if (!hashMap3.containsKey(enumC1125356h) || (arrayList = (List) hashMap3.get(enumC1125356h)) != null) {
            arrayList.add(c69688VtY);
        }
        hashMap3.put(enumC1125356h, arrayList);
    }

    public final void A03(EnumC1125356h enumC1125356h, MediaEffect mediaEffect) {
        A02(new C1125456i(TimeUnit.MILLISECONDS, -1L, -1L), enumC1125356h, mediaEffect, null);
    }

    public final void A04(C1125956n c1125956n) {
        int size;
        try {
            AbstractC1126356r.A07(!new ArrayList(c1125956n.A04).isEmpty(), null);
            EnumC1125356h enumC1125356h = c1125956n.A01;
            Iterator it = new ArrayList(c1125956n.A03.keySet()).iterator();
            while (it.hasNext()) {
                A00(enumC1125356h, this, (String) it.next());
            }
            HashMap hashMap = this.A02;
            AbstractMap abstractMap = (AbstractMap) hashMap.get(enumC1125356h);
            if (abstractMap == null) {
                abstractMap = new HashMap();
                size = 0;
            } else {
                size = abstractMap.size();
            }
            abstractMap.put(Integer.valueOf(size), c1125956n);
            hashMap.put(enumC1125356h, abstractMap);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
