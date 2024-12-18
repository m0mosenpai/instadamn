package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PKF implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public PKF(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C56138Ovy c56138Ovy;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                EnumC61185Rgl enumC61185Rgl = (EnumC61185Rgl) obj;
                C56133Ovt c56133Ovt = (C56133Ovt) this.A03;
                boolean z = enumC61185Rgl.A01;
                boolean z2 = !z;
                c56133Ovt.A03 = z2;
                if (z) {
                    boolean A0K = C14360o3.A0K(this.A04, "FETCH_PRICE");
                    Map map = (Map) this.A02;
                    if (A0K) {
                        map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ERROR_IN_FETCH");
                        map.put("fetch_status_error_code", enumC61185Rgl.name());
                        str = enumC61185Rgl.A00;
                        str2 = "fetch_status_error_description";
                    } else {
                        map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "PURCHASE_FAILURE");
                        map.put("purchase_status_error_code", enumC61185Rgl.name());
                        str = enumC61185Rgl.A00;
                        str2 = "purchase_product_status_error_description";
                    }
                    map.put(str2, str);
                }
                InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) this.A01;
                if (!interfaceC24901Jp.isActive()) {
                    return;
                }
                if (z2) {
                    c56138Ovy = c56133Ovt.A01;
                } else if (!z2) {
                    c56138Ovy = null;
                } else {
                    throw B4Z.A00();
                }
                interfaceC24901Jp.resumeWith(c56138Ovy);
                return;
            case 1:
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (interfaceC132965zL instanceof C48496Lcn) {
                    C0w9.A07(this.A04, (Throwable) AbstractC132975zM.A00(interfaceC132965zL));
                    C9GR.A0A((Context) this.A01, "error");
                    return;
                }
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                C14360o3.A0B(abstractC12990ll, 0);
                C12210kP c12210kP = new C12210kP(abstractC12990ll);
                c12210kP.A01 = "ig_upload_flow";
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_media_publish_success");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.AAP(AbstractC50529MSi.A01(), "N/A");
                A0f.AAP("publish_id", "N/A");
                A0f.AAP("ingest_surface", "unknown");
                A0f.AAP("target_surface", "unknown");
                A0f.AAP("media_type", "photo");
                A0f.AAP("connection", AbstractC15820qc.A08((Context) this.A01));
                A0f.AAP("application_state", AbstractC101994iE.A00());
                A0f.A9K(AbstractC111324zv.A00(50), AbstractC92784Dr.A01(((DirectShareTarget) this.A02).A01()));
                A0f.A7v("is_e2ee", AbstractC166997dE.A0b());
                A0f.Cht();
                return;
            case 2:
                Fragment fragment = (Fragment) this.A01;
                TextView textView = (TextView) this.A02;
                String str3 = this.A04;
                View view = (View) this.A03;
                if (TextUtils.isEmpty((String) obj)) {
                    textView.setText(2131957629);
                } else {
                    AbstractC31177DnL.A10(textView, fragment, str3, 2131957782);
                }
                C9GR.A07(view.getContext(), 2131972697);
                return;
            default:
                return;
        }
    }
}
