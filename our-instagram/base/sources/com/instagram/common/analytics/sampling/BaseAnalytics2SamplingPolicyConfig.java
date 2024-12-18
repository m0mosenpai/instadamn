package com.instagram.common.analytics.sampling;

import X.AbstractC12880la;
import X.AnonymousClass001;
import X.C0CA;
import X.C12130kH;
import X.C12140kI;
import X.C12150kJ;
import X.C14360o3;
import X.InterfaceC38631qu;
import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import com.instagram.analytics.sampling.IgAnalytics2SamplingPolicyConfig;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class BaseAnalytics2SamplingPolicyConfig implements SamplingPolicyConfig {
    public final C12130kH A00;
    public final C12150kJ A01;
    public final String A02;

    /* loaded from: classes.dex */
    public final class NoOpSamplingPolicyConfig implements SamplingPolicyConfig {
        @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
        public final void E6R(C0CA c0ca) {
        }

        @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
        public final void E6k(C0CA c0ca) {
        }

        @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
        public final void FBo(InterfaceC38631qu interfaceC38631qu, InputStream inputStream) {
        }
    }

    public BaseAnalytics2SamplingPolicyConfig(Context context) {
        C12130kH A00;
        C12130kH A002;
        synchronized (BaseAnalytics2SamplingPolicyConfig.class) {
            A00 = C12130kH.A00();
            A00 = A00 == null ? C12130kH.A01(context) : A00;
        }
        String A04 = AbstractC12880la.A04(context);
        synchronized (BaseAnalytics2SamplingPolicyConfig.class) {
            A002 = C12130kH.A00();
            A002 = A002 == null ? C12130kH.A01(context) : A002;
        }
        C12150kJ c12150kJ = new C12150kJ(A002);
        this.A00 = A00;
        this.A02 = A04;
        this.A01 = c12150kJ;
    }

    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public void E6R(C0CA c0ca) {
        C12130kH c12130kH = this.A00;
        String str = ((IgAnalytics2SamplingPolicyConfig) this).A00;
        C14360o3.A0A(str);
        C12140kI A02 = C12130kH.A02(c12130kH);
        if (str == null) {
            str = "0";
        }
        C0CA.A00(c0ca, A02.A00.A00(AnonymousClass001.A0R("ig_pigeon_sampling_policy_v2_", str)).getString("__config_checksum__", null), "config_checksum");
        C0CA.A00(c0ca, "v2", "config_version");
    }

    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public final void E6k(C0CA c0ca) {
        C0CA.A00(c0ca, this.A02, "app_ver");
        String str = ((IgAnalytics2SamplingPolicyConfig) this).A00;
        C14360o3.A0A(str);
        C0CA.A00(c0ca, str, "app_uid");
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0415, code lost:
    
        if (r0.equals(r5) != false) goto L174;
     */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0aS, android.util.SparseLongArray] */
    /* JADX WARN: Type inference failed for: r22v1, types: [android.util.SparseIntArray, X.0aR] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.0aS, android.util.SparseLongArray] */
    /* JADX WARN: Type inference failed for: r23v1, types: [android.util.SparseIntArray, X.0aR] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.util.SparseIntArray, X.0aR] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.0Z8, java.lang.Object] */
    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBo(X.InterfaceC38631qu r46, java.io.InputStream r47) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.analytics.sampling.BaseAnalytics2SamplingPolicyConfig.FBo(X.1qu, java.io.InputStream):void");
    }
}
