package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SxQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63993SxQ implements InterfaceC65563Tmj {
    public JSONObject A00;

    @Override // X.InterfaceC65563Tmj
    public final int Aoq() {
        try {
            return this.A00.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        } catch (JSONException unused) {
            return 0;
        }
    }

    @Override // X.InterfaceC65563Tmj
    public final String Bu2() {
        try {
            return this.A00.getString("severity");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC65563Tmj
    public final String C40() {
        try {
            return this.A00.getString("summary");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC65563Tmj
    public final String getDescription() {
        try {
            return this.A00.getString(DevServerEntity.COLUMN_DESCRIPTION);
        } catch (JSONException unused) {
            return null;
        }
    }
}
