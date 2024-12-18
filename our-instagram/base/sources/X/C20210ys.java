package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20210ys extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    boolean z = false;
                    if (i2 == 0) {
                        z = true;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return AbstractC06930Yk.A08(AbstractC001800i.A0R(AbstractC009903n.A0I(stringArrayExtra), arrayList));
            }
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C14360o3.A0B(strArr, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C14360o3.A07(putExtra);
        return putExtra;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ C00f A01(Context context, Object obj) {
        Map linkedHashMap;
        String[] strArr = (String[]) obj;
        C14360o3.A0B(strArr, 1);
        int length = strArr.length;
        int i = 0;
        if (length == 0) {
            linkedHashMap = C16920sk.A00;
            C14360o3.A0C(linkedHashMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        } else {
            int i2 = 0;
            while (C02G.A00(context, strArr[i2]) == 0) {
                i2++;
                if (i2 >= length) {
                    int A0L = AbstractC16850sd.A0L(length);
                    if (A0L < 16) {
                        A0L = 16;
                    }
                    linkedHashMap = new LinkedHashMap(A0L);
                    do {
                        linkedHashMap.put(strArr[i], true);
                        i++;
                    } while (i < length);
                }
            }
            return null;
        }
        return new C00f(linkedHashMap);
    }
}
