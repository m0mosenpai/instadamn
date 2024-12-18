package X;

import android.content.Context;

/* renamed from: X.2K2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2K2 implements C2K3 {
    public final C48322Jx A00;

    public C2K2(C48322Jx c48322Jx) {
        this.A00 = c48322Jx;
    }

    public final Context A00() {
        Context context = this.A00.A00;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // X.C2K3
    public final /* synthetic */ Object FFc() {
        Context context = this.A00.A00;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
