package X;

import com.google.common.collect.ImmutableMap;

/* loaded from: classes11.dex */
public final class U4T implements Runnable {
    public final /* synthetic */ C72743Nv A00;

    public U4T(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72743Nv c72743Nv = this.A00;
        ImmutableMap immutableMap = C72743Nv.A0U;
        AbstractC69784VvL abstractC69784VvL = c72743Nv.A0A;
        if (abstractC69784VvL != null) {
            abstractC69784VvL.A02();
        }
    }
}