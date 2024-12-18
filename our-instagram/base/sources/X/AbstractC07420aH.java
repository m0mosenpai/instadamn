package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.0aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07420aH {
    public static final C07380aC A00;
    public static final C07380aC A01;
    public static final C07380aC A02;
    public static final C07380aC A03;
    public static final C07380aC A04;
    public static final Map A05;
    public static final C07380aC A06;
    public static final C07380aC A07;
    public static final C07380aC A08;

    static {
        final String str = "myAnnotationInt";
        C07380aC c07380aC = new C07380aC(AbstractC16960so.A1M(new C0TV("myAnnotationString1", 20), new C0TV("myAnnotationString2", 50), new AbstractC07400aE(str) { // from class: X.0Uk
        }, new C0TV("myAnnotationString3", 50)), 196609, 5);
        A06 = c07380aC;
        C07380aC c07380aC2 = new C07380aC(AbstractC16960so.A1M(new C0TV("effect_session_id", 40), new C0TV("delivery_session_id", 40), new C0TV("onecamera_active_session_id", 50), new C0TV("product_session_id", 40), new C0TV("product_name", 35), new C0TV("effect_id", 20), new C0TV("effect_instance_id", 20)), 16321564, 4);
        A01 = c07380aC2;
        C07380aC c07380aC3 = new C07380aC(AbstractC16960so.A1M(new C0TV("camera_destination", 14), new C0TV("camera_session_id", 48), new C0TV("creation_session", 48)), 17638868, 1);
        A02 = c07380aC3;
        C07380aC c07380aC4 = new C07380aC(null, 838599736, 1);
        A03 = c07380aC4;
        C07380aC c07380aC5 = new C07380aC(AbstractC16960so.A1M(new C0TV("ann_avail_mem_at_start", 13), new C0TV("ann_zero", 4), new C0TV("cp_low_on_memory", 14)), 16323880, 4);
        A00 = c07380aC5;
        final String str2 = "isOutgoing";
        C07380aC c07380aC6 = new C07380aC(AbstractC16960so.A1M(new C0TV("localCallId", 36), new C0TV("signaling_id", 10), new C0TV("shared_call_id", 80), new C0TV("call_trigger", 60), new C0TV("is_connected", 1), new AbstractC07400aE(str2) { // from class: X.0Uk
        }), 144192964, 3);
        A04 = c07380aC6;
        final String str3 = "media_type";
        AbstractC07400aE abstractC07400aE = new AbstractC07400aE(str3) { // from class: X.0Uk
        };
        final String str4 = "thread_type";
        AbstractC07400aE abstractC07400aE2 = new AbstractC07400aE(str4) { // from class: X.0Uk
        };
        C0TV c0tv = new C0TV("persistent_id", 36);
        final String str5 = TraceFieldType.ErrorCode;
        final String str6 = "attachment_index";
        C07380aC c07380aC7 = new C07380aC(AbstractC16960so.A1M(abstractC07400aE, abstractC07400aE2, c0tv, new AbstractC07400aE(str5) { // from class: X.0Uk
        }, new C0TV(TraceFieldType.ErrorDomain, 50), new AbstractC07400aE(str6) { // from class: X.0Uk
        }), 919808481, 20);
        A08 = c07380aC7;
        C07380aC c07380aC8 = new C07380aC(AbstractC16960so.A1M(new AbstractC07400aE(str3) { // from class: X.0Uk
        }, new AbstractC07400aE(str4) { // from class: X.0Uk
        }, new C0TV("persistent_id", 36), new AbstractC07400aE(str5) { // from class: X.0Uk
        }, new C0TV(TraceFieldType.ErrorDomain, 50), new AbstractC07400aE(str6) { // from class: X.0Uk
        }), 919808481, 5);
        A07 = c07380aC8;
        A05 = AbstractC06930Yk.A06(new C09530e4(c07380aC.A04.getValue(), c07380aC), new C09530e4(c07380aC2.A04.getValue(), c07380aC2), new C09530e4(c07380aC3.A04.getValue(), c07380aC3), new C09530e4(c07380aC4.A04.getValue(), c07380aC4), new C09530e4(c07380aC6.A04.getValue(), c07380aC6), new C09530e4(c07380aC7.A04.getValue(), c07380aC7), new C09530e4(c07380aC8.A04.getValue(), c07380aC8), new C09530e4(c07380aC5.A04.getValue(), c07380aC5));
    }
}
