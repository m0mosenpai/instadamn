package com.instagram.debug.devoptions.search.bootstrap;

import X.C0YY;
import X.C127165ou;
import X.C14360o3;
import X.InterfaceC16620sF;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class BootstrapUserInfo$Companion$generateInfosForSurface$1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C127165ou $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootstrapUserInfo$Companion$generateInfosForSurface$1(C127165ou c127165ou) {
        super(2);
        this.$surface = c127165ou;
    }

    @Override // X.InterfaceC16620sF
    public final Integer invoke(BootstrapUserInfo bootstrapUserInfo, BootstrapUserInfo bootstrapUserInfo2) {
        Map map = this.$surface.A03;
        if (map == null) {
            map = Collections.emptyMap();
        }
        Object obj = map.get(bootstrapUserInfo2.user.getId());
        C14360o3.A0A(obj);
        double doubleValue = ((Number) obj).doubleValue();
        Map map2 = this.$surface.A03;
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        Object obj2 = map2.get(bootstrapUserInfo.user.getId());
        C14360o3.A0A(obj2);
        return Integer.valueOf(Double.compare(doubleValue, ((Number) obj2).doubleValue()));
    }
}
