package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.3xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88753xb {
    public final C88773xd A00;
    public final C88763xc A01;
    public final C04060Jx A02;

    public C88753xb(Context context, C04060Jx c04060Jx, SamplingPolicyConfig samplingPolicyConfig, String str) {
        C88773xd c88773xd;
        this.A02 = c04060Jx;
        this.A01 = new C88763xc(context, str);
        if (samplingPolicyConfig != null) {
            c88773xd = new C88773xd(samplingPolicyConfig);
        } else {
            c88773xd = null;
        }
        this.A00 = c88773xd;
    }
}
