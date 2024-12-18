package com.instagram.autoplay.models;

import X.C14360o3;
import X.C16930sl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayConfigRoot {
    public final List autoplayConfigurations;
    public final AutoplayGlobalConfig globalConfig;

    public AutoplayConfigRoot(AutoplayGlobalConfig autoplayGlobalConfig, List list) {
        C14360o3.A0B(autoplayGlobalConfig, 1);
        C14360o3.A0B(list, 2);
        this.globalConfig = autoplayGlobalConfig;
        this.autoplayConfigurations = list;
    }

    public final List getAutoplayConfigurations() {
        return this.autoplayConfigurations;
    }

    public final AutoplayGlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public /* synthetic */ AutoplayConfigRoot(AutoplayGlobalConfig autoplayGlobalConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoplayGlobalConfig, (i & 2) != 0 ? C16930sl.A00 : list);
    }
}
