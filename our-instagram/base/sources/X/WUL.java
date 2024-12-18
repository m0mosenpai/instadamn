package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes11.dex */
public final class WUL implements InterfaceC71948XBz {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WGO A01;

    public WUL(WGO wgo, long j) {
        this.A01 = wgo;
        this.A00 = j;
    }

    @Override // X.InterfaceC71948XBz
    public final /* bridge */ /* synthetic */ void DqR(Bundle bundle, Object obj) {
        C69737VuX c69737VuX;
        boolean z;
        String str;
        C67814Uyn c67814Uyn;
        String str2;
        String str3;
        C68736VbF c68736VbF = (C68736VbF) obj;
        WGO wgo = this.A01;
        WUU wuu = wgo.A0R;
        wuu.A05("background_job_new_protocol_remote_setting", "get_remote_settng_success", null, null);
        if (c68736VbF != null && (c67814Uyn = c68736VbF.A00) != null && (str2 = c67814Uyn.A00) != null) {
            long j = this.A00;
            c69737VuX = wgo.A0S;
            c69737VuX.A00("local_permission_checks");
            z = false;
            boolean A1N = AbstractC167007dF.A1N(wgo.A0N.checkCallingOrSelfPermission("android.permission.READ_CONTACTS"));
            c69737VuX.A01("device_permission", String.valueOf(A1N));
            long A00 = wgo.A0V.A00();
            String str4 = "on";
            boolean equalsIgnoreCase = str2.equalsIgnoreCase("on");
            c69737VuX.A01("ccu_setting", str2);
            c69737VuX.A01("upload_source", "CCU_BACKGROUND_PING");
            wuu.A05("background_job_new_protocol_remote_setting", "start_ccu_with_remote_setting", null, null);
            if (!equalsIgnoreCase) {
                str4 = "off";
            }
            wuu.A04(str4, null, j, A00, A1N);
            if (!equalsIgnoreCase) {
                wuu.A05("background_job_new_protocol_remote_setting", "exit_background_job", "no_app_permission", null);
                str3 = "setting_not_on";
            } else if (wgo.A0D) {
                wuu.A05("background_job_new_protocol_remote_setting", "exit_background_job", "ccu_is_running", null);
                str = "ccu_already_running";
                c69737VuX.A01("ccu_already_running", String.valueOf(true));
            } else if (!A1N) {
                str3 = "no_os_permission";
                wuu.A05("background_job_new_protocol_remote_setting", "exit_background_job", "no_os_permission", null);
            } else if (System.currentTimeMillis() - A00 < j) {
                wuu.A05("background_job_new_protocol_remote_setting", "exit_background_job", "time_interval", null);
                str = "time_interval_check_failed";
            } else {
                wuu.A05("background_job_new_protocol_remote_setting", "start_contact_upload", null, null);
                wgo.A06();
                return;
            }
            c69737VuX.A02(true, str3);
            return;
        }
        c69737VuX = wgo.A0S;
        c69737VuX.A01(TraceFieldType.FailureReason, "settings_response_invalid");
        z = false;
        str = "get_remote_setting_failed";
        c69737VuX.A02(z, str);
    }

    @Override // X.InterfaceC71948XBz
    public final void onFailure(Throwable th) {
        WGO wgo = this.A01;
        wgo.A0R.A05("background_job_new_protocol_remote_setting", "exit_background_job", "get_remote_settng_fail", null);
        C69737VuX c69737VuX = wgo.A0S;
        c69737VuX.A01(TraceFieldType.FailureReason, th.getMessage());
        c69737VuX.A02(false, "get_remote_setting_failed");
    }
}
