package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.Tb8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64983Tb8 extends C0YY implements InterfaceC16820sZ {
    public static final C64983Tb8 A00 = new C64983Tb8();

    public C64983Tb8() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C78503fG c78503fG = new C78503fG();
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(c78503fG.A00, 0.0f);
        YogaNative.jni_YGConfigSetErrataJNI(c78503fG.A00, Integer.MAX_VALUE);
        return c78503fG;
    }
}
