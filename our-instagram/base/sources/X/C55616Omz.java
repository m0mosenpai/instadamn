package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback;

/* renamed from: X.Omz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55616Omz implements ContentDeliveryLibraryResultCallback {
    public final /* synthetic */ LiveEditingRawMemoryPointerHolder A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback
    public final void onError(String str) {
        C14360o3.A0B(str, 0);
        this.A01.invoke(new C51468MoF(str));
    }

    public C55616Omz(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = liveEditingRawMemoryPointerHolder;
    }

    @Override // com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback
    public final void onSucceed() {
        this.A01.invoke(new C51467MoE(this.A00));
    }
}
