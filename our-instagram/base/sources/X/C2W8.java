package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.2W8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2W8 {
    public static final AbstractC78513fH A00;

    static {
        C78503fG c78503fG = new C78503fG();
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(c78503fG.A00, true);
        YogaNative.jni_YGConfigSetErrataJNI(c78503fG.A00, 2147483646);
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(c78503fG.A00, 0, C2V3.isYogaFlexBasisFixEnabled);
        A00 = c78503fG;
    }

    public static final C78523fJ A00() {
        AbstractC78513fH abstractC78513fH = A00;
        C14360o3.A0B(abstractC78513fH, 0);
        return new C78523fJ(abstractC78513fH);
    }
}
