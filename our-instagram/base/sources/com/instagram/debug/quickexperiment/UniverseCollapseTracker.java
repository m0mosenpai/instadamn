package com.instagram.debug.quickexperiment;

import X.AbstractC43592JPx;
import X.C14360o3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UniverseCollapseTracker {
    public final boolean collapseByDefault;
    public final Map collapsedState = new LinkedHashMap();

    public final boolean isCollapsed(String str) {
        C14360o3.A0B(str, 0);
        Boolean bool = (Boolean) this.collapsedState.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.collapseByDefault;
    }

    public final void toggleCollapsedState(String str) {
        C14360o3.A0B(str, 0);
        AbstractC43592JPx.A1W(str, this.collapsedState, !isCollapsed(str));
    }

    public UniverseCollapseTracker(boolean z) {
        this.collapseByDefault = z;
    }
}
