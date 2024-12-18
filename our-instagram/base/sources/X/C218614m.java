package X;

import android.content.Context;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;

/* renamed from: X.14m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C218614m extends AbstractC211911v {
    public final Context A00;

    public C218614m(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "DebugHeadInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        if (DebugHeadConfigurations.isDebugHeadEnabled) {
            AbstractC24641Ih.A02.EpA(new C52398NGt(this));
        }
    }
}
