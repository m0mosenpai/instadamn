package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public interface LocalMediaInjectionDataStoreManager {
    List getAllInjectionItems();

    List getInjectedJSONStrings(Context context, Set set);

    Map getInjectionDataStore();

    /* renamed from: com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager$-CC, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class CC {
        public static List $default$getAllInjectionItems(LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager) {
            return new ArrayList(localMediaInjectionDataStoreManager.getInjectionDataStore().values());
        }

        public static List $default$getInjectedJSONStrings(LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager, Context context, Set set) {
            AbstractC167017dG.A1P(context, set);
            Map injectionDataStore = localMediaInjectionDataStoreManager.getInjectionDataStore();
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AbstractC65702TsY.A1T(it.next(), arrayList, injectionDataStore);
            }
            ArrayList A0q = AbstractC167017dG.A0q(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A0q.add(LocalMediaInjectionUtil.getJSONTextForInjectedUnit(context, (LocalInjectionUnit) it2.next()));
            }
            return A0q;
        }
    }
}
