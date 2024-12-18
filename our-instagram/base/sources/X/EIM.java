package X;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class EIM extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleFragment";
    public C45126Jxv A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new X32(this, 26));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_ux_flow_lifecycle";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started", this.A03);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((InterfaceC37148GYj) this.A04.getValue()).Dgx(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int i;
        int A02 = C0f9.A02(1971425462);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        int i2 = requireArguments.getInt("ux_flow_linking_code");
        Integer[] A00 = C05F.A00(3);
        if (i2 >= 0 && i2 < A00.length) {
            num = A00[i2];
        } else {
            num = C05F.A00;
        }
        String string = requireArguments.getString("ux_flow_entrypoint");
        if (string == null) {
            string = "";
        }
        int i3 = requireArguments.getInt("ux_flow_flow");
        Integer[] A002 = C05F.A00(3);
        if (i3 >= 0 && i3 < A002.length) {
            num2 = A002[i3];
        } else {
            num2 = C05F.A00;
        }
        String string2 = requireArguments.getString("ux_flow_page_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = requireArguments.getString("back_stack_tag");
        if (string3 == null) {
            string3 = "";
        }
        C14360o3.A0B(num, 1);
        C14360o3.A0B(num2, 3);
        this.A01 = num;
        this.A02 = string;
        this.A00 = new C45126Jxv(string2, num2, string3);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("started", false);
        }
        this.A03 = z;
        if (z) {
            i = 72115629;
        } else {
            this.A03 = true;
            ((InterfaceC37148GYj) this.A04.getValue()).Csx();
            i = 268161338;
        }
        C0f9.A09(i, A02);
    }
}
