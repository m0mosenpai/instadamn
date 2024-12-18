package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.0jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11880jn {
    public static final C11870jm A02 = new Object();
    public final C11790jd A00;
    public final WeakReference A01;

    public final void A01() {
        C11790jd c11790jd = this.A00;
        synchronized (c11790jd) {
            c11790jd.A01.edit().putBoolean("phone_id_synced", true).apply();
        }
    }

    public final C19U A00() {
        return this.A00.A01((AbstractC12990ll) this.A01.get());
    }

    public /* synthetic */ C11880jn(Context context, AbstractC12990ll abstractC12990ll) {
        this.A00 = C11790jd.A04.A00(context);
        this.A01 = new WeakReference(abstractC12990ll);
    }
}
