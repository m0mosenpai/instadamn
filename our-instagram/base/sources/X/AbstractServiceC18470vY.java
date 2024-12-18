package X;

/* renamed from: X.0vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC18470vY extends AnonymousClass028 {
    @Override // X.AnonymousClass028
    public final AnonymousClass026 dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            android.util.Log.e("CustomJobIntentService", AnonymousClass001.A0R("Captured a failure for ", getClass().getSimpleName()), e);
            return null;
        }
    }
}
