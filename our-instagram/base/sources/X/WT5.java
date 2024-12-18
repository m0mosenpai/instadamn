package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class WT5 implements C08T {
    public static final C69504VpZ A02 = new Object();
    public final HashMap A00;
    public final AtomicInteger A01;

    @Override // X.C08T
    public final Bundle ELr() {
        java.util.Set<Map.Entry> entrySet = this.A00.entrySet();
        C14360o3.A07(entrySet);
        ArrayList A0q = AbstractC167017dG.A0q(entrySet);
        for (Map.Entry entry : entrySet) {
            AbstractC166997dE.A1R(String.valueOf(((Number) entry.getKey()).intValue()), entry.getValue(), A0q);
        }
        C09530e4[] c09530e4Arr = (C09530e4[]) A0q.toArray(new C09530e4[0]);
        return AbstractC61636Rr0.A00((C09530e4[]) Arrays.copyOf(c09530e4Arr, c09530e4Arr.length));
    }

    public WT5(HashMap hashMap) {
        this.A00 = hashMap;
        this.A01 = new AtomicInteger(hashMap.size());
    }
}
