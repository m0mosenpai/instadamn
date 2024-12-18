package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.3fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78503fG extends AbstractC78513fH {
    public long A00;

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            this.A00 = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    public C78503fG() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI != 0) {
            this.A00 = jni_YGConfigNewJNI;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }
}
