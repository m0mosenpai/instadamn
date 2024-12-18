package X;

import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WDt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70158WDt {
    public static C67637Uts A00(X9Y x9y, X9Z x9z, U7W u7w, Map map) {
        HashMap hashMap = new HashMap();
        SparseArray sparseArray = (SparseArray) map.get(EnumC1125356h.VIDEO);
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                hashMap.put(Integer.toString(sparseArray.keyAt(i)), sparseArray.valueAt(i));
            }
        }
        return new C67637Uts(u7w, x9y, x9z, hashMap, 1);
    }

    public static C67638Utt A01(MediaComposition mediaComposition, X9W x9w, X9X x9x, U7W u7w) {
        HashMap hashMap = new HashMap();
        Iterator A14 = AbstractC166997dE.A14(mediaComposition.A06(EnumC1125356h.VIDEO));
        int i = 0;
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            Integer num = (Integer) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                hashMap.put(Integer.toString(i), new C69067VhI((C69688VtY) it.next(), num));
                i++;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator A142 = AbstractC166997dE.A14(hashMap);
        while (A142.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A142.next();
            C1125456i c1125456i = ((C69067VhI) entry2.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0L, c1125456i.A03(timeUnit));
            long A02 = c1125456i.A02(timeUnit);
            if (A02 < 0) {
                A02 = Long.MAX_VALUE;
            }
            hashMap2.put(entry2.getKey(), new C1125456i(timeUnit, max, A02));
        }
        return new C67638Utt(x9w, x9x, u7w, hashMap2, hashMap);
    }

    public static ArrayList A02(EnumC1125356h enumC1125356h, U7W u7w, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = (SparseArray) map.get(enumC1125356h);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                valueAt.getClass();
                if (((C1125456i) valueAt).A06(TimeUnit.MICROSECONDS, j, u7w.A1P())) {
                    AbstractC166997dE.A1W(arrayList, keyAt);
                }
            }
        }
        return arrayList;
    }

    public static void A03(InterfaceC58019Po5 interfaceC58019Po5, EnumC1125356h enumC1125356h, C69489VoC c69489VoC, Map map) {
        MediaComposition mediaComposition = c69489VoC.A08;
        mediaComposition.getClass();
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 == null) {
            if (enumC1125356h == EnumC1125356h.VIDEO && !c69489VoC.A0B.A07()) {
                throw new Exception();
            }
            return;
        }
        Iterator A14 = AbstractC166997dE.A14(A07);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            int intValue = ((Number) entry.getKey()).intValue();
            C1125956n c1125956n = (C1125956n) entry.getValue();
            long A01 = AbstractC66047Tyk.A01(interfaceC58019Po5, c1125956n);
            SparseArray sparseArray = (SparseArray) map.get(enumC1125356h);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                map.put(enumC1125356h, sparseArray);
            }
            long j = c1125956n.A00;
            sparseArray.put(intValue, new C1125456i(TimeUnit.MICROSECONDS, j, j + A01));
        }
    }
}
