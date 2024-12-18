package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes11.dex */
public final class WUU implements InterfaceC71991XEe {
    public final C69527Vqr A00;

    private void A03(Bundle bundle) {
        C69690Vtg A00 = this.A00.A00("ccu_contacts_upload_failed_event");
        String string = bundle.getString(TraceFieldType.FailureReason);
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C(TraceFieldType.FailureReason, string);
        A00(bundle, c19280xC, "failure_message", bundle.getString("failure_message"));
        A01(bundle, A00, Long.valueOf(bundle.getLong("last_upload_success_time")), "last_upload_success_time");
        c19280xC.A0C("ccu_session_id", bundle.getString("ccu_session_id"));
        c19280xC.A0C(CacheBehaviorLogger.SOURCE, bundle.getString(CacheBehaviorLogger.SOURCE));
        A00.A00();
    }

    public final void A04(String str, String str2, long j, long j2, boolean z) {
        C69690Vtg A00 = this.A00.A00("contact_upload_ccu_setting_check");
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C("ccu_setting", str);
        c19280xC.A09("has_os_permission", Boolean.valueOf(z));
        A00.A01("upload_interval_in_ms", Long.valueOf(j));
        A00.A01("last_upload_success_time", Long.valueOf(j2));
        A00.A01("now_in_ms", AbstractC31173DnH.A0g());
        if (str2 != null) {
            c19280xC.A0C("family_device_id", str2);
        }
        A00.A00();
    }

    public final void A05(String str, String str2, String str3, String str4) {
        C69690Vtg A00 = this.A00.A00("contact_upload_entry_event");
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        c19280xC.A0C("action", str2);
        if (str3 != null) {
            c19280xC.A0C(TraceFieldType.FailureReason, str3);
        }
        if (str4 != null) {
            c19280xC.A0C("fdid", str4);
        }
        A00.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void CzC(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_information_event");
        C19280xC c19280xC = A00.A00;
        A00(bundle, c19280xC, "upload_step", "batch_upload_succeed");
        A02(bundle, A00, "batch_index");
        A02(bundle, A00, "batch_size");
        A02(bundle, A00, "contacts_upload_count");
        A02(bundle, A00, "add_count");
        A02(bundle, A00, "remove_count");
        A01(bundle, A00, AbstractC31179DnN.A0X(bundle, "update_count"), "update_count");
        c19280xC.A0C("ccu_session_id", bundle.getString("ccu_session_id"));
        A00.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "batch_upload_succeed");
        if (string != null) {
            c19280xC2.A0C("family_device_id", string);
        }
        if (string2 != null) {
            c19280xC2.A0C("ccu_session_id", string2);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void D5f(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_succeeded_event");
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("full_upload"));
        C19280xC c19280xC = A00.A00;
        c19280xC.A09("full_upload", valueOf);
        A01(bundle, A00, Long.valueOf(bundle.getLong("last_upload_success_time")), "last_upload_success_time");
        c19280xC.A0C("ccu_session_id", bundle.getString("ccu_session_id"));
        A00.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A002.A00.A0C("ccu_session_id", string2);
        }
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "close_session_success");
        if (string != null) {
            c19280xC2.A0C("family_device_id", string);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void D8N(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_create_session_check_sync_event");
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("in_sync"));
        C19280xC c19280xC = A00.A00;
        c19280xC.A09("in_sync", valueOf);
        c19280xC.A0C("root_hash", bundle.getString("root_hash"));
        A01(bundle, A00, Long.valueOf(bundle.getLong("last_upload_success_time")), "last_upload_success_time");
        c19280xC.A0C("ccu_session_id", bundle.getString("ccu_session_id"));
        A00.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A002.A00.A0C("ccu_session_id", string2);
        }
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "create_session_success");
        if (string != null) {
            c19280xC2.A0C("family_device_id", string);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void DaK(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_information_event");
        C19280xC c19280xC = A00.A00;
        A00(bundle, c19280xC, "upload_step", "batch_upload");
        A02(bundle, A00, "batch_index");
        A02(bundle, A00, "batch_size");
        A02(bundle, A00, "contacts_upload_count");
        A02(bundle, A00, "add_count");
        A02(bundle, A00, "remove_count");
        A01(bundle, A00, AbstractC31179DnN.A0X(bundle, "update_count"), "update_count");
        c19280xC.A0C("ccu_session_id", bundle.getString("ccu_session_id"));
        A00.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "batch_upload_start");
        if (string != null) {
            c19280xC2.A0C("family_device_id", string);
        }
        if (string2 != null) {
            c19280xC2.A0C("ccu_session_id", string2);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void DaL(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_information_event");
        C19280xC c19280xC = A00.A00;
        A00(bundle, c19280xC, "upload_step", "close_session");
        A02(bundle, A00, "total_batch_count");
        A02(bundle, A00, "contacts_upload_count");
        A02(bundle, A00, "add_count");
        A02(bundle, A00, "remove_count");
        A02(bundle, A00, "update_count");
        A02(bundle, A00, "phonebook_size");
        A01(bundle, A00, Long.valueOf(bundle.getLong("max_contacts_to_upload")), "max_contacts_to_upload");
        String string = bundle.getString("ccu_session_id");
        if (string != null) {
            c19280xC.A0C("ccu_session_id", string);
        }
        A00.A00();
        String string2 = bundle.getString("family_device_id");
        String string3 = bundle.getString("ccu_session_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "close_session_start");
        if (string2 != null) {
            c19280xC2.A0C("family_device_id", string2);
        }
        if (string3 != null) {
            c19280xC2.A0C("ccu_session_id", string3);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void DaN(Bundle bundle) {
        String string = bundle.getString("family_device_id");
        C69690Vtg A00 = this.A00.A00("ccu_upload_contacts_event");
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C("action", "pre_ccu_check");
        if (string != null) {
            c19280xC.A0C("family_device_id", string);
        }
        A00.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void DoD(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_information_event");
        C19280xC c19280xC = A00.A00;
        A00(bundle, c19280xC, "upload_step", "create_session");
        c19280xC.A0C(CacheBehaviorLogger.SOURCE, bundle.getString(CacheBehaviorLogger.SOURCE));
        A02(bundle, A00, "batch_size");
        A02(bundle, A00, "num_of_retries");
        A02(bundle, A00, "contacts_upload_count");
        A00.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A00.A00();
        String string = bundle.getString("family_device_id");
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        C19280xC c19280xC2 = A002.A00;
        c19280xC2.A0C("action", "create_session_start");
        if (string != null) {
            c19280xC2.A0C("family_device_id", string);
        }
        A002.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void DxI(Bundle bundle) {
        C69527Vqr c69527Vqr = this.A00;
        C69690Vtg A00 = c69527Vqr.A00("ccu_contacts_upload_failed_event");
        A00.A00.A0C(TraceFieldType.FailureReason, bundle.getString(TraceFieldType.FailureReason));
        A00.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        C69690Vtg A002 = c69527Vqr.A00("ccu_upload_contacts_event");
        C19280xC c19280xC = A002.A00;
        c19280xC.A0C("action", "pre_ccu_check_failed");
        if (string != null) {
            c19280xC.A0C("family_device_id", string);
        }
        if (string2 != null) {
            c19280xC.A0C(TraceFieldType.FailureReason, string2);
        }
        A002.A00();
    }

    public WUU(C69527Vqr c69527Vqr) {
        this.A00 = c69527Vqr;
    }

    public static void A00(BaseBundle baseBundle, C19280xC c19280xC, String str, String str2) {
        c19280xC.A0C(str, str2);
        c19280xC.A09("full_upload", Boolean.valueOf(baseBundle.getBoolean("full_upload")));
    }

    public static void A01(BaseBundle baseBundle, C69690Vtg c69690Vtg, Number number, String str) {
        c69690Vtg.A01(str, number);
        c69690Vtg.A01("time_spent", Long.valueOf(baseBundle.getLong("time_spent")));
        c69690Vtg.A01("num_of_retries", Integer.valueOf(baseBundle.getInt("num_of_retries")));
    }

    public static void A02(BaseBundle baseBundle, C69690Vtg c69690Vtg, String str) {
        c69690Vtg.A01(str, Integer.valueOf(baseBundle.getInt(str)));
    }

    @Override // X.InterfaceC71991XEe
    public final void CzB(Bundle bundle) {
        A03(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C69690Vtg A00 = this.A00.A00("ccu_upload_contacts_event");
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C("action", "batch_upload_failure");
        if (string != null) {
            c19280xC.A0C("family_device_id", string);
        }
        if (string2 != null) {
            c19280xC.A0C("ccu_session_id", string2);
        }
        A00.A00();
    }

    @Override // X.InterfaceC71991XEe
    public final void D8M(Bundle bundle) {
        A03(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        String string3 = bundle.getString("ccu_session_id");
        C69690Vtg A00 = this.A00.A00("ccu_upload_contacts_event");
        C19280xC c19280xC = A00.A00;
        c19280xC.A0C("action", "create_session_failure");
        if (string2 != null) {
            c19280xC.A0C(TraceFieldType.FailureReason, string2);
        }
        if (string != null) {
            c19280xC.A0C("family_device_id", string);
        }
        if (string3 != null) {
            c19280xC.A0C("ccu_session_id", string3);
        }
        A00.A00();
    }
}
