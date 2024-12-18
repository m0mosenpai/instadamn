package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.4KW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KW {
    public final C18920wW A00;

    public final void A00(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_thread_fetch_success_rate");
        A00.AAP("action", "error");
        A00.AAP("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A00.AAP("fetch_type", str3);
        A00.Cht();
    }

    public final void A01(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_thread_fetch_success_rate");
        A00.AAP("action", "retry");
        A00.AAP("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A00.AAP("fetch_type", str3);
        A00.Cht();
    }

    public final void A02(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_thread_fetch_success_rate");
        A00.AAP("action", "success");
        A00.AAP("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A00.AAP("fetch_type", str3);
        A00.Cht();
    }

    public final void A03(String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_thread_fetch_success_rate");
        A00.AAP("action", RealtimeConstants.SEND_ATTEMPT);
        A00.AAP("fetch_uuid", str);
        if (str3 == null) {
            str4 = "snapshot";
        } else {
            str4 = "paging_new";
        }
        A00.AAP("fetch_type", str4);
        A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A00.AAP("oldest_cursor", str3);
        A00.Cht();
    }

    public final void A04(String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_thread_fetch_success_rate");
        A00.AAP("action", "intent");
        A00.AAP("fetch_uuid", str);
        if (str3 == null) {
            str4 = "snapshot";
        } else {
            str4 = "paging_new";
        }
        A00.AAP("fetch_type", str4);
        A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A00.AAP("oldest_cursor", str3);
        A00.Cht();
    }

    public C4KW(C18920wW c18920wW) {
        this.A00 = c18920wW;
    }
}
