package com.instagram.analytics.sampling;

import X.AbstractC03270Dk;
import X.AbstractC18680vv;
import X.C023409i;
import X.C0CA;
import X.C14360o3;
import X.C17060sy;
import android.content.Context;
import com.instagram.common.analytics.sampling.BaseAnalytics2SamplingPolicyConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class IgAnalytics2SamplingPolicyConfig extends BaseAnalytics2SamplingPolicyConfig {
    public String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgAnalytics2SamplingPolicyConfig(Context context) {
        super(context);
        String str;
        C14360o3.A0B(context, 1);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        if (A05 != null && (A05 instanceof UserSession)) {
            str = C17060sy.A01.A01(AbstractC03270Dk.A00(A05)).getId();
        } else {
            str = "0";
        }
        this.A00 = str;
    }

    @Override // com.instagram.common.analytics.sampling.BaseAnalytics2SamplingPolicyConfig, com.facebook.flexiblesampling.SamplingPolicyConfig
    public final void E6R(C0CA c0ca) {
        super.E6R(c0ca);
        C0CA.A00(c0ca, "v7", "qpl_config_version");
    }
}
