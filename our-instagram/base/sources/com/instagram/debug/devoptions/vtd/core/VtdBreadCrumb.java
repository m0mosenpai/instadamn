package com.instagram.debug.devoptions.vtd.core;

import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes8.dex */
public final class VtdBreadCrumb extends C0T6 {
    public final VtdLifecycleEvent lifecycleEvent;
    public final long timestamp;

    public VtdBreadCrumb(long j, VtdLifecycleEvent vtdLifecycleEvent) {
        C14360o3.A0B(vtdLifecycleEvent, 2);
        this.timestamp = j;
        this.lifecycleEvent = vtdLifecycleEvent;
    }

    public final long component1() {
        return this.timestamp;
    }

    public final VtdLifecycleEvent component2() {
        return this.lifecycleEvent;
    }

    public final VtdBreadCrumb copy(long j, VtdLifecycleEvent vtdLifecycleEvent) {
        C14360o3.A0B(vtdLifecycleEvent, 1);
        return new VtdBreadCrumb(j, vtdLifecycleEvent);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VtdBreadCrumb) {
                VtdBreadCrumb vtdBreadCrumb = (VtdBreadCrumb) obj;
                if (this.timestamp != vtdBreadCrumb.timestamp || this.lifecycleEvent != vtdBreadCrumb.lifecycleEvent) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ VtdBreadCrumb copy$default(VtdBreadCrumb vtdBreadCrumb, long j, VtdLifecycleEvent vtdLifecycleEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vtdBreadCrumb.timestamp;
        }
        if ((i & 2) != 0) {
            vtdLifecycleEvent = vtdBreadCrumb.lifecycleEvent;
        }
        C14360o3.A0B(vtdLifecycleEvent, 1);
        return new VtdBreadCrumb(j, vtdLifecycleEvent);
    }

    public final VtdLifecycleEvent getLifecycleEvent() {
        return this.lifecycleEvent;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.lifecycleEvent, AbstractC25235BEs.A03(this.timestamp));
    }
}
