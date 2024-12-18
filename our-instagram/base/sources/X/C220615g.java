package X;

import com.facebook.mobileboost.framework.os.jni.lite.MobileBoostNativeLite;

/* renamed from: X.15g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C220615g extends C0YY implements InterfaceC16820sZ {
    public static final C220615g A00 = new C220615g();

    public C220615g() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(MobileBoostNativeLite.sNativeLibLoaded);
    }
}
