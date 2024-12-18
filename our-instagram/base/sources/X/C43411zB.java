package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43411zB implements InterfaceC43361z6 {
    public final LinkedHashSet A00 = new LinkedHashSet();

    @Override // X.InterfaceC43361z6
    public final void E0Y(Rect rect, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, WeakReference weakReference) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 3);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC43361z6) it.next()).E0Y(rect, interfaceC11380iw, imageUrl, weakReference);
        }
    }

    @Override // X.InterfaceC43361z6
    public final void E0b(Context context, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 2);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC43361z6) it.next()).E0b(context, interfaceC11380iw, imageUrl);
        }
    }

    @Override // X.InterfaceC43361z6
    public final void DLM(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC43361z6) it.next()).DLM(interfaceC11380iw, imageUrl, str, i, i2, i3, i4, i5, i6, z);
        }
    }

    @Override // X.InterfaceC43361z6
    public final void DLT(InterfaceC11380iw interfaceC11380iw, EnumC82173le enumC82173le, ImageUrl imageUrl, String str, String str2, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC43361z6) it.next()).DLT(interfaceC11380iw, enumC82173le, imageUrl, str, str2, i);
        }
    }
}
