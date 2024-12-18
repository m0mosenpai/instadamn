package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.MSZ;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.DevserverInfo;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class DevServerEntityConverterKt {
    public static final List pandoToEntities(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories devserverCategories = (DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories) it.next();
            String name = devserverCategories.getName();
            boolean supportsVpnless = devserverCategories.getSupportsVpnless();
            ImmutableList devserverInfos = devserverCategories.getDevserverInfos();
            ArrayList A0i2 = AbstractC167007dF.A0i(devserverInfos);
            Iterator<E> it2 = devserverInfos.iterator();
            while (it2.hasNext()) {
                DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos devserverInfos2 = (DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos) it2.next();
                String url = devserverInfos2.getUrl();
                String description = devserverInfos2.getDescription();
                if (description == null) {
                    description = "";
                }
                MSZ.A1Q(new DevServerEntity(url, name, description, supportsVpnless, 0L, 16, null), A12, A0i2);
            }
            A0i.add(A0i2);
        }
        return A12;
    }

    public static final List pandoToEntitiesOld(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevserverInfo devserverInfo = (DevserverInfo) it.next();
            String url = devserverInfo.getUrl();
            String hostType = devserverInfo.getHostType();
            String description = devserverInfo.getDescription();
            if (description == null) {
                description = "";
            }
            A0q.add(new DevServerEntity(url, hostType, description, false, 0L, 16, null));
        }
        return A0q;
    }
}
