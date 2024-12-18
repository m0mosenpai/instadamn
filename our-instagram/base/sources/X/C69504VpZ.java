package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.VpZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69504VpZ {
    public final WT5 A00(FragmentActivity fragmentActivity) {
        HashMap hashMap;
        WT5 wt5;
        C08U c08u = fragmentActivity.savedStateRegistryController.A01;
        C08T A01 = c08u.A01("bloks.nav.tracker.key");
        if (!(A01 instanceof WT5) || (wt5 = (WT5) A01) == null) {
            Bundle A00 = c08u.A00("bloks.nav.tracker.key");
            if (A00 != null) {
                java.util.Set<String> keySet = A00.keySet();
                C14360o3.A07(keySet);
                ArrayList A0q = AbstractC167017dG.A0q(keySet);
                for (String str : keySet) {
                    C14360o3.A0A(str);
                    AbstractC166997dE.A1R(AbstractC58319PtB.A0m(str), Integer.valueOf(A00.getInt(str, -1)), A0q);
                }
                C09530e4[] c09530e4Arr = (C09530e4[]) A0q.toArray(new C09530e4[0]);
                hashMap = AbstractC06930Yk.A02((C09530e4[]) Arrays.copyOf(c09530e4Arr, c09530e4Arr.length));
            } else {
                hashMap = new HashMap();
            }
            WT5 wt52 = new WT5(hashMap);
            c08u.A03(wt52, "bloks.nav.tracker.key");
            return wt52;
        }
        return wt5;
    }
}
