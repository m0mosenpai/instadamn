package X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.RbI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60903RbI extends C1P1 {
    public final /* synthetic */ C62723SNn A00;
    public final /* synthetic */ C5J3 A01;

    public C60903RbI(C62723SNn c62723SNn, C5J3 c5j3) {
        this.A01 = c5j3;
        this.A00 = c62723SNn;
    }

    private void A00(C60905RbK c60905RbK) {
        String str;
        String A00 = AbstractC111324zv.A00(5607);
        A00.getClass();
        C19280xC A01 = C19280xC.A01(A00, null);
        A01.A0C("event_type", "ping");
        C62723SNn c62723SNn = this.A00;
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.put("key", c62723SNn.A01);
            A0q.put("url", c62723SNn.A02);
            A0q.put("cooldown", c62723SNn.A00);
            str = A0q.toString();
        } catch (JSONException e) {
            C0K8.A0G("IgZeroCarrierSignalController", "Ping config serialization failure", e);
            str = null;
        }
        A01.A0C(DexStore.CONFIG_FILENAME, str);
        A01.A0C("url", c62723SNn.A02);
        if (c60905RbK != null) {
            AbstractC58318PtA.A1O(A01, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c60905RbK.mStatusCode);
            AbstractC58321PtD.A1M(A01, "success", c60905RbK.A01);
            AbstractC58321PtD.A1M(A01, "state_changed", c60905RbK.A00);
        } else {
            A01.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, null);
            A01.A0C("success", null);
            A01.A0C("state_changed", null);
        }
        AbstractC31173DnH.A1S(A01, this.A01.A00);
        A01.A03();
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(353542289);
        A00((C60905RbK) abstractC115105If.A00());
        C0f9.A0A(536232826, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-557729027);
        this.A01.A02 = false;
        C0f9.A0A(1703164317, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-970040107);
        C60905RbK c60905RbK = (C60905RbK) obj;
        int A032 = C0f9.A03(-1052576329);
        super.onSuccess(c60905RbK);
        A00(c60905RbK);
        AbstractC26671Qw abstractC26671Qw = this.A01.A06;
        if (abstractC26671Qw == null) {
            i = -235881528;
        } else {
            if (c60905RbK.A01 && c60905RbK.A00) {
                abstractC26671Qw.AWU("carrier_signal", true);
            }
            i = -1358727160;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(144849575, A03);
    }
}
