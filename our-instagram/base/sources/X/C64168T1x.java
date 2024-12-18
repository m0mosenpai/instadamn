package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.T1x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64168T1x implements InterfaceC65375Tj7 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final /* synthetic */ C64170T1z A03;

    public C64168T1x(C64170T1z c64170T1z, long j, long j2, long j3) {
        this.A03 = c64170T1z;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    @Override // X.InterfaceC65375Tj7
    public final JSONObject EqM() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.A01);
        A0q.put("data", this.A02);
        A0q.put("cache", this.A00);
        return A0q;
    }
}
