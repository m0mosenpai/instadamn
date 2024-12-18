package X;

import android.content.Context;

/* renamed from: X.2ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61972ry implements C1GL {
    public final Context A00;
    public final AbstractC018607g A01;
    public final Integer A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C61972ry(Context context, AbstractC018607g abstractC018607g) {
        this(context, abstractC018607g, null);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(abstractC018607g, 2);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            AbstractC62382sd.A00(this.A00, this.A01, c11r, this.A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C61972ry(Context context, AbstractC018607g abstractC018607g, Integer num) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(abstractC018607g, 2);
        this.A01 = abstractC018607g;
        this.A02 = num;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
