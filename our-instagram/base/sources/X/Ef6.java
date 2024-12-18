package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class Ef6 extends AbstractC32357ENe {
    public static final String __redex_internal_original_name = "IgFxBaseFragment";
    public UserSession A00;
    public String A01;
    public String A02;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        String A0g;
        int A02 = C0f9.A02(420437615);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A01 = AbstractC31173DnH.A0j(requireArguments, "flow");
        String A00 = AbstractC111324zv.A00(1156);
        this.A02 = requireArguments.getString(A00);
        UserSession userSession = this.A00;
        String str2 = this.A01;
        if (this instanceof Ef5) {
            AbstractC167017dG.A1N(userSession, str2);
            C35191Ffj.A00(userSession, "initial_async_controller_request_start", str2);
        }
        UserSession userSession2 = this.A00;
        boolean z = this instanceof Ef4;
        if (z) {
            str = "com.bloks.www.fxim.sync.interop.async";
        } else {
            str = "com.bloks.www.fxcal.link.async";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        if (z) {
            A0g = AnonymousClass001.A0g("{server_params: {", AnonymousClass001.A0S("\"flow\":\"", this.A01, '\"'), "}}");
        } else {
            String A002 = Ef5.A00("logging_event", "linking_flow_initiated");
            UserSession userSession3 = this.A00;
            C14360o3.A06(userSession3);
            int A003 = FVN.A00(userSession3);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('\"');
            A1C.append("cds_client_value");
            A1C.append("\":");
            A1C.append(A003);
            ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(A002, A1C.toString()));
            String str3 = this.A01;
            if (str3 != null) {
                A1F.add(Ef5.A00("flow", str3));
            }
            String str4 = this.A02;
            if (str4 != null) {
                A1F.add(Ef5.A00(A00, str4));
            }
            A0g = AnonymousClass001.A0g("{server_params: {", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1F), "}}");
        }
        A1G.put("params", A0g);
        AbstractC192798gL A04 = C192108fB.A04(userSession2, str, A1G);
        C32392EOt.A00(A04, this, 3);
        schedule(A04);
        C0f9.A09(1501295586, A02);
    }
}
