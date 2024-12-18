package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback;
import java.util.Map;

/* loaded from: classes9.dex */
public final class On1 implements ContentDeliveryLibraryResultCallback {
    public final /* synthetic */ OBR A00;
    public final /* synthetic */ LiveEditingRawMemoryPointerHolder A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    @Override // com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback
    public final void onError(String str) {
        C14360o3.A0B(str, 0);
        this.A04.invoke(new C51468MoF(str));
        this.A00.A01.A01("generate_color_ramps_failure", this.A02, str, this.A03);
    }

    public On1(OBR obr, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, String str, Map map, InterfaceC16660sJ interfaceC16660sJ) {
        this.A04 = interfaceC16660sJ;
        this.A01 = liveEditingRawMemoryPointerHolder;
        this.A00 = obr;
        this.A02 = str;
        this.A03 = map;
    }

    @Override // com.facebook.cdl.p001native.ContentDeliveryLibraryResultCallback
    public final void onSucceed() {
        this.A04.invoke(new C51467MoE(this.A01));
        this.A00.A01.A01("generate_color_ramps_complete", this.A02, null, this.A03);
    }
}
