package com.instagram.service.tigon;

import X.C09170dP;
import X.C106654rN;
import X.C1Ef;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.HttpPriorityContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class IGHttpPriorityContext extends HttpPriorityContext {
    public static final C106654rN Companion = new Object();
    public final String currentModule;
    public final int distanceToViewport;
    public final boolean isAppStartMedia;
    public final boolean isInUIGraph;
    public final boolean isUIGraphNull;
    public final C1Ef policyBehavior;
    public final int requestCategory;
    public final String sentModule;

    public /* synthetic */ IGHttpPriorityContext(int i, C1Ef c1Ef, String str, boolean z, String str2, boolean z2, int i2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, c1Ef, str, z, str2, z2, i2, z3);
    }

    public static final native HybridData initHybrid(int i, int i2, String str, boolean z, String str2, boolean z2, int i3, boolean z3);

    public final native void setEnableShadowModeOnUpdate(boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4rN, java.lang.Object] */
    static {
        C09170dP.A0C("igtigon-jni");
    }

    public IGHttpPriorityContext(int i, C1Ef c1Ef, String str, boolean z, String str2, boolean z2, int i2, boolean z3) {
        super(initHybrid(i, c1Ef.A00, str, z, str2, z2, i2, z3));
        this.requestCategory = i;
        this.policyBehavior = c1Ef;
        this.sentModule = str;
        this.isInUIGraph = z;
        this.currentModule = str2;
        this.isAppStartMedia = z2;
        this.distanceToViewport = i2;
        this.isUIGraphNull = z3;
    }

    public final String getCurrentModule() {
        return this.currentModule;
    }

    public final int getDistanceToViewport() {
        return this.distanceToViewport;
    }

    public final C1Ef getPolicyBehavior() {
        return this.policyBehavior;
    }

    public final int getRequestCategory() {
        return this.requestCategory;
    }

    public final String getSentModule() {
        return this.sentModule;
    }

    public final boolean isAppStartMedia() {
        return this.isAppStartMedia;
    }

    public final boolean isInUIGraph() {
        return this.isInUIGraph;
    }

    public final boolean isUIGraphNull() {
        return this.isUIGraphNull;
    }
}
