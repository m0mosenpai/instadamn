package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;

/* renamed from: X.3BL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BL {
    public final C18920wW A00;

    public C3BL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public final void A01(Integer num, ArrayList arrayList, long j) {
        Integer num2;
        String str;
        String A00;
        Integer num3;
        String A002;
        String str2;
        C14360o3.A0B(num, 0);
        if (arrayList != null && !arrayList.isEmpty()) {
            num2 = C05F.A0C;
        } else {
            num2 = C05F.A0N;
        }
        C18920wW c18920wW = this.A00;
        C12180kM c12180kM = c18920wW.A00;
        InterfaceC02590Ai A003 = c18920wW.A00(c12180kM, "ig4a_ndx_request");
        A003.AAP("flow_name", "ig_server_eligibility_check");
        if (2 - num2.intValue() != 0) {
            str = "fail_ig_server_filter";
        } else {
            str = "pass_ig_server_filter";
        }
        A003.AAP("action", str);
        A003.AAP("step_latency", String.valueOf(j));
        A003.AAP("ig_appid", "567067343352427");
        String A004 = AbstractC34276F9w.A00(num);
        A003.AAP("ig_ndx_source", A004);
        A003.Cht();
        if (arrayList != null && !arrayList.isEmpty()) {
            for (Integer num4 : C05F.A00(5)) {
                switch (num4.intValue()) {
                    case 1:
                        A00 = "multiple_account";
                        break;
                    case 2:
                        A00 = "phone_number_acquisition";
                        break;
                    case 3:
                        A00 = "email_acquisition";
                        break;
                    case 4:
                        A00 = AbstractC111324zv.A00(1082);
                        break;
                    default:
                        A00 = "contact_importer";
                        break;
                }
                if (arrayList.contains(A00)) {
                    num3 = C05F.A0C;
                } else {
                    num3 = C05F.A0N;
                }
                InterfaceC02590Ai A005 = c18920wW.A00(c12180kM, "ig4a_ndx_request");
                switch (num4.intValue()) {
                    case 1:
                        A002 = "multiple_account";
                        break;
                    case 2:
                        A002 = "phone_number_acquisition";
                        break;
                    case 3:
                        A002 = "email_acquisition";
                        break;
                    case 4:
                        A002 = AbstractC111324zv.A00(1082);
                        break;
                    default:
                        A002 = "contact_importer";
                        break;
                }
                A005.AAP("flow_name", A002);
                if (2 - num3.intValue() != 0) {
                    str2 = "fail_ig_server_filter";
                } else {
                    str2 = "pass_ig_server_filter";
                }
                A005.AAP("action", str2);
                A005.AAP("ig_appid", "567067343352427");
                A005.AAP("ig_ndx_source", A004);
                A005.Cht();
            }
        }
    }

    public final void A00(Integer num, Long l) {
        String str;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig4a_ndx_request");
        A00.AAP("flow_name", "ndx_immersive_launcher");
        switch (num.intValue()) {
            case 6:
                str = "ndx_steps_found";
                break;
            case 7:
                str = "no_ndx_steps_found";
                break;
            case 8:
                str = "ndx_request_already_finished";
                break;
            case 9:
                str = "ndx_request_error";
                break;
            case 10:
                str = "user_already_seen_ndx";
                break;
            case 11:
                str = "ndx_client_start";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "ndx_client_start_qp";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "ndx_client_start_error";
                break;
            case 14:
                str = "ndx_client_start_error_qp";
                break;
            case Process.SIGTERM /* 15 */:
                str = "ndx_bloks_host_error";
                break;
            case 16:
                str = "ndx_bloks_host_error_qp";
                break;
            case 17:
                str = "device_above_a13_not_running";
                break;
            case 18:
                str = "device_above_a13_running";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "device_below_a13_running";
                break;
            default:
                str = "ndx_client_null_activity";
                break;
        }
        A00.AAP("action", str);
        A00.AAP("ig_appid", "567067343352427");
        A00.AAP("ig_ndx_source", "NDX_IG_IMMERSIVE");
        if (l != null) {
            A00.AAP("step_latency", l.toString());
        }
        A00.Cht();
    }
}
