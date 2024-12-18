package com.instagram.debug.devoptions.search.bootstrap;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC43593JPy;
import X.C01T;
import X.C127165ou;
import X.C14360o3;
import X.InterfaceC16620sF;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class BootstrapUserInfo {
    public static final Companion Companion = new Object();
    public int rank;
    public final Map surfaceToScoreMap;
    public final User user;

    public BootstrapUserInfo(User user) {
        C14360o3.A0B(user, 1);
        this.user = user;
        this.surfaceToScoreMap = new HashMap();
    }

    public static final List generateInfosForSurface(Map map, C127165ou c127165ou, List list) {
        return Companion.generateInfosForSurface(map, c127165ou, list);
    }

    public final void putScore(String str, double d) {
        C14360o3.A0B(str, 0);
        this.surfaceToScoreMap.put(str, Double.valueOf(d));
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final List generateInfosForSurface(Map map, C127165ou c127165ou, List list) {
            AbstractC167027dH.A12(map, c127165ou, list);
            ArrayList arrayList = new ArrayList();
            Map map2 = c127165ou.A03;
            if (map2 == null) {
                map2 = Collections.emptyMap();
            }
            Iterator A12 = AbstractC43593JPy.A12(map2);
            while (A12.hasNext()) {
                String str = (String) A12.next();
                User user = (User) map.get(str);
                if (user == null) {
                    user = new User(str, "[Not in Bootstrap User List]");
                }
                arrayList.add(new BootstrapUserInfo(user));
            }
            final BootstrapUserInfo$Companion$generateInfosForSurface$1 bootstrapUserInfo$Companion$generateInfosForSurface$1 = new BootstrapUserInfo$Companion$generateInfosForSurface$1(c127165ou);
            C01T.A1D(arrayList, new Comparator(bootstrapUserInfo$Companion$generateInfosForSurface$1) { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo$sam$java_util_Comparator$0
                public final /* synthetic */ InterfaceC16620sF function;

                {
                    C14360o3.A0B(bootstrapUserInfo$Companion$generateInfosForSurface$1, 1);
                    this.function = bootstrapUserInfo$Companion$generateInfosForSurface$1;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Number) this.function.invoke(obj, obj2)).intValue();
                }
            });
            int i = 0;
            int size = arrayList.size();
            while (i < size) {
                BootstrapUserInfo bootstrapUserInfo = (BootstrapUserInfo) arrayList.get(i);
                i++;
                bootstrapUserInfo.rank = i;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C127165ou c127165ou2 = (C127165ou) it.next();
                    String id = bootstrapUserInfo.user.getId();
                    Map map3 = c127165ou2.A03;
                    if (map3 == null) {
                        map3 = Collections.emptyMap();
                    }
                    if (map3.containsKey(id)) {
                        String str2 = c127165ou2.A01;
                        C14360o3.A07(str2);
                        Map map4 = c127165ou2.A03;
                        if (map4 == null) {
                            map4 = Collections.emptyMap();
                        }
                        Object obj = map4.get(id);
                        if (obj != null) {
                            bootstrapUserInfo.putScore(str2, ((Number) obj).doubleValue());
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
            return arrayList;
        }

        public Companion() {
        }
    }

    public final int getRank() {
        return this.rank;
    }

    public final Map getScores() {
        return this.surfaceToScoreMap;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setRank(int i) {
        this.rank = i;
    }
}
