package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Wf3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70682Wf3 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "DirectLocationSharingLogger";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C18920wW A03;
    public final String A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0036. Please report as an issue. */
    public final void A00(String str) {
        String str2;
        boolean z;
        InterfaceC02590Ai A00;
        String str3;
        InterfaceC02590Ai A002;
        String str4;
        String str5;
        C14360o3.A0B(str, 2);
        if (AbstractC001900j.A0a(str, "action=", false)) {
            String A0K = AbstractC001900j.A0K(str, "action=", str);
            String A0L = AbstractC001900j.A0L(A0K, " ", A0K);
            for (Integer num : C05F.A00(9)) {
                switch (num.intValue()) {
                    case 1:
                        str2 = "POINTS_OF_INTEREST_UPDATED";
                        break;
                    case 2:
                        str2 = "LOADED";
                        break;
                    case 3:
                        str2 = "PIN_DRAGGING_STARTED";
                        break;
                    case 4:
                        str2 = "MAP_MOVED";
                        break;
                    case 5:
                        str2 = "PIN_DRAGGING_STOPPED";
                        break;
                    case 6:
                        str2 = "PIN_ADDRESS_SHARED";
                        break;
                    case 7:
                        str2 = "LIVE_LOCATION_STARTED";
                        break;
                    case 8:
                        str2 = "LIVE_LOCATION_STOPPED";
                        break;
                    default:
                        str2 = "POINTS_OF_INTEREST_SELECTED";
                        break;
                }
                if (str2.equals(A0L)) {
                    switch (num.intValue()) {
                        case 0:
                            z = true;
                            this.A02 = z;
                            return;
                        case 1:
                            z = false;
                            this.A02 = z;
                            return;
                        case 2:
                            if (this.A02) {
                                C18920wW c18920wW = this.A03;
                                InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "direct_location_static_share");
                                if (A003.isSampled()) {
                                    A003.AAP("open_thread_id", this.A04);
                                    AbstractC31175DnJ.A17(A003, "search_bar");
                                }
                            }
                            this.A02 = false;
                            return;
                        case 3:
                            C18920wW c18920wW2 = this.A03;
                            InterfaceC02590Ai A004 = c18920wW2.A00(c18920wW2.A00, "direct_location_pin");
                            if (A004.isSampled()) {
                                A004.AAP("open_thread_id", this.A04);
                                A004.AAP("action", "tap");
                                A004.Cht();
                            }
                            this.A01 = true;
                            return;
                        case 4:
                            if (!this.A01) {
                                return;
                            }
                            C18920wW c18920wW3 = this.A03;
                            InterfaceC02590Ai A005 = c18920wW3.A00(c18920wW3.A00, "direct_location_pin");
                            if (!A005.isSampled()) {
                                return;
                            }
                            A005.AAP("open_thread_id", this.A04);
                            A005.AAP("action", "drag");
                            A005.Cht();
                            return;
                        case 5:
                            if (!this.A02) {
                                C18920wW c18920wW4 = this.A03;
                                A002 = c18920wW4.A00(c18920wW4.A00, "direct_location_pin");
                                if (A002.isSampled()) {
                                    A002.AAP("open_thread_id", this.A04);
                                    str4 = "cancel";
                                    str5 = "action";
                                    A002.AAP(str5, str4);
                                    A002.Cht();
                                }
                            }
                            this.A01 = false;
                            return;
                        case 6:
                            C18920wW c18920wW5 = this.A03;
                            A002 = c18920wW5.A00(c18920wW5.A00, "direct_location_static_share");
                            if (A002.isSampled()) {
                                A002.AAP("open_thread_id", this.A04);
                                str4 = "pinned";
                                str5 = ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY;
                                A002.AAP(str5, str4);
                                A002.Cht();
                            }
                            this.A01 = false;
                            return;
                        case 7:
                            if (this.A00) {
                                C18920wW c18920wW6 = this.A03;
                                A00 = c18920wW6.A00(c18920wW6.A00, "direct_location_live_share");
                                if (A00.isSampled()) {
                                    A00.AAP("open_thread_id", this.A04);
                                    str3 = "start";
                                    A00.AAP("action", str3);
                                    A00.AAP("duration", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                    A00.Cht();
                                }
                            }
                            this.A00 = true;
                            return;
                        case 8:
                            if (this.A00) {
                                C18920wW c18920wW7 = this.A03;
                                A00 = c18920wW7.A00(c18920wW7.A00, "direct_location_live_share");
                                if (A00.isSampled()) {
                                    A00.AAP("open_thread_id", this.A04);
                                    str3 = "stop";
                                    A00.AAP("action", str3);
                                    A00.AAP("duration", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                    A00.Cht();
                                }
                            }
                            this.A00 = true;
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C70682Wf3(UserSession userSession, String str) {
        this.A03 = AbstractC12220kQ.A01(this, userSession);
        this.A04 = str == null ? "" : str;
    }
}
