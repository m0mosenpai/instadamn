package com.instagram.autoplay.models;

import X.C14360o3;
import X.C16930sl;
import X.JQ0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayConfiguration {
    public final List autoplayCustomizations;
    public final AutoplayLayout layout;
    public final int normativeMaximumBufferingMs;
    public final int normativeMinimumBufferingMs;

    public AutoplayConfiguration(AutoplayLayout autoplayLayout, List list, int i, int i2) {
        C14360o3.A0B(autoplayLayout, 1);
        C14360o3.A0B(list, 2);
        this.layout = autoplayLayout;
        this.autoplayCustomizations = list;
        this.normativeMinimumBufferingMs = i;
        this.normativeMaximumBufferingMs = i2;
    }

    public final List getAutoplayCustomizations() {
        return this.autoplayCustomizations;
    }

    public final AutoplayLayout getLayout() {
        return this.layout;
    }

    public final int getNormativeMaximumBufferingMs() {
        return this.normativeMaximumBufferingMs;
    }

    public final int getNormativeMinimumBufferingMs() {
        return this.normativeMinimumBufferingMs;
    }

    public /* synthetic */ AutoplayConfiguration(AutoplayLayout autoplayLayout, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoplayLayout, (i3 & 2) != 0 ? C16930sl.A00 : list, JQ0.A03(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }
}
