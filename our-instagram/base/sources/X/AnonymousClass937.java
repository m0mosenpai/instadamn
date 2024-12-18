package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.937, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass937 implements InterfaceC10180ga {
    public final /* synthetic */ InterfaceC16820sZ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public AnonymousClass937(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A00 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC10180ga
    public final /* synthetic */ void EHy(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ;
        List list = AnonymousClass936.A01;
        if (C14360o3.A0K(str4, "main_direct") || (C14360o3.A0K(str2, "direct_inbox") && !C14360o3.A0K(str, "direct_inbox") && AbstractC001800i.A0u(AnonymousClass936.A00, str))) {
            interfaceC16820sZ = this.A02;
        } else if ((AbstractC001800i.A0u(AnonymousClass936.A01, str4) && !C14360o3.A0K(str4, "main_direct")) || (C14360o3.A0K(str, "direct_inbox") && !C14360o3.A0K(str2, "direct_inbox") && AbstractC001800i.A0u(AnonymousClass936.A00, str2))) {
            interfaceC16820sZ = this.A01;
        } else if (C14360o3.A0K(str, "direct_inbox") || !C14360o3.A0K(str2, "direct_inbox")) {
            return;
        } else {
            interfaceC16820sZ = this.A00;
        }
        interfaceC16820sZ.invoke();
    }
}
