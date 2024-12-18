package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78523fJ extends YogaNodeJNIBase {
    public C78523fJ(AbstractC78513fH abstractC78513fH) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(((C78503fG) abstractC78513fH).A00));
        this.mConfig = abstractC78513fH;
    }

    public final void finalize() {
        long j = this.mNativePointer;
        if (j != 0) {
            this.mNativePointer = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public C78523fJ() {
    }
}
