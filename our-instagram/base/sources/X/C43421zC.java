package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.1zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43421zC implements InterfaceC43361z6 {
    public static final C43421zC A00 = new Object();

    @Override // X.InterfaceC43361z6
    public final void E0Y(Rect rect, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, WeakReference weakReference) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 3);
        C1KM.A09.A0C(rect, imageUrl, interfaceC11380iw.getModuleName(), weakReference);
    }

    @Override // X.InterfaceC43361z6
    public final void E0b(Context context, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 2);
        C1KM.A09.A0F(imageUrl, interfaceC11380iw.getModuleName());
    }

    @Override // X.InterfaceC43361z6
    public final void DLM(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (interfaceC11380iw != null) {
            C1KM.A09.A0H(imageUrl, interfaceC11380iw.getModuleName(), str);
        }
    }

    @Override // X.InterfaceC43361z6
    public final void DLT(InterfaceC11380iw interfaceC11380iw, EnumC82173le enumC82173le, ImageUrl imageUrl, String str, String str2, int i) {
        if (interfaceC11380iw != null) {
            C1KM.A09.A0G(imageUrl, interfaceC11380iw.getModuleName());
            C52092a9.A00.A01(enumC82173le, imageUrl, str, interfaceC11380iw.getModuleName(), i);
        }
    }
}
