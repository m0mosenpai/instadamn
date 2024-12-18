package X;

import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.KMd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45726KMd extends AbstractRunnableC14200nk {
    public final /* synthetic */ JV9 A00;
    public final /* synthetic */ C4KR A01;
    public final /* synthetic */ C43707JUs A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45726KMd(JV9 jv9, C4KR c4kr, C43707JUs c43707JUs, String str, String str2, String str3, String str4, List list) {
        super(704638247, 3, false, false);
        this.A01 = c4kr;
        this.A02 = c43707JUs;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A07 = list;
        this.A00 = jv9;
        this.A06 = str4;
    }

    public static String A00(C0f5 c0f5, C83403nh c83403nh, C126455ng c126455ng) {
        c0f5.ABW("threadId", String.valueOf(c126455ng.A00().longValue()));
        c0f5.ABW("messageId", c83403nh.A0g());
        return c83403nh.A0l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C45120Jxp c45120Jxp;
        C4KR c4kr = this.A01;
        C4KV c4kv = c4kr.A08;
        UserSession userSession = c4kr.A04;
        C43707JUs c43707JUs = this.A02;
        String str3 = c43707JUs.A1E;
        C14360o3.A07(str3);
        String A0y = AbstractC43592JPx.A0y(c43707JUs.A00());
        boolean CLR = c43707JUs.CLR();
        String str4 = this.A04;
        boolean A00 = c4kr.A05.A00();
        boolean A02 = AbstractC453326q.A02(userSession);
        String str5 = this.A03;
        C14360o3.A0B(str5, 8);
        AnonymousClass776 A01 = c4kv.A01(userSession, null, null, null, 20133400, A00, A02, true);
        C006802i c006802i = c4kv.A00;
        int i = A01.A01;
        int i2 = A01.A00;
        MarkerEditor withMarker = c006802i.withMarker(i, i2);
        withMarker.annotate(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        withMarker.annotate("server_has_older", CLR);
        withMarker.annotate("fetch_reason", str4);
        withMarker.annotate("server_cursor_id", (String) null);
        withMarker.annotate("thread_jid", A0y);
        withMarker.annotate("inbox_fetch_uuid", str5);
        withMarker.markerEditingCompleted();
        String str6 = this.A05;
        if (str6 != null) {
            c4kv.A09(A01, "original_fetch_reason", str6);
        }
        String str7 = c43707JUs.A1E;
        C14360o3.A07(str7);
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            C83403nh A0e = AbstractC43592JPx.A0e(it);
            C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R("going to trigger makeup call for missing message, makeup call reason is ", str4), 20123732);
            AEp.ABW("error", A00(AEp, A0e, c43707JUs));
            AEp.report();
        }
        JV9 jv9 = this.A00;
        String str8 = this.A06;
        jv9.A02(userSession, A01, c43707JUs, str8, str4, DirectThreadApi.A00(userSession, "snapshot"));
        ArrayList A002 = jv9.A00(c43707JUs);
        if (AbstractC25226BEj.A1b(A002)) {
            c4kv.A09(A01, "size_of_error_message_post_makeup_call", String.valueOf(A002.size()));
            c4kv.A09(A01, "error_message_post_makeup_call", String.valueOf(AbstractC001800i.A0P(", ", "", "", A002, C50337MKp.A00)));
            if (c43707JUs.A04(userSession)) {
                str = "is triggered";
            } else {
                str = "is not triggered";
            }
            Iterator it2 = A002.iterator();
            while (it2.hasNext()) {
                C83403nh A0e2 = AbstractC43592JPx.A0e(it2);
                C0f5 AEp2 = C18950wb.A01.AEp(AnonymousClass001.A0g("makeupCall failed to intercept message, server response parsing ", str, " later to fix this"), 20123732);
                AEp2.ABW("error", A00(AEp2, A0e2, c43707JUs));
                AEp2.report();
            }
            if (c43707JUs.A04(userSession)) {
                AbstractC207749He.A00();
                JV6 A012 = JVE.A01(userSession);
                C4KV c4kv2 = A012.A06;
                c4kv2.A07(A01, "parse_server_response_start");
                ArrayList A1E = AbstractC166987dD.A1E();
                StringBuilder A1C = AbstractC166987dD.A1C();
                Iterator it3 = c43707JUs.A06.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    C83403nh c83403nh = (C83403nh) AbstractC166997dE.A0l(it3);
                    if (c83403nh.A10 == C2EY.A0n) {
                        String A03 = C4H6.A03(c83403nh.A0h());
                        String str9 = c83403nh.A1Y;
                        if (A03 != null && str9 != null) {
                            JSONObject jSONObject = new JSONObject(str9);
                            if (jSONObject.getBoolean("is_open_eb")) {
                                long longValue = c43707JUs.A00().longValue();
                                DirectThreadKey directThreadKey = new DirectThreadKey(c43707JUs.A1E, null);
                                List A19 = AbstractC31172DnG.A19(c43707JUs.A1d);
                                C14360o3.A0K(c43707JUs.A0z, true);
                                C83403nh c83403nh2 = (C83403nh) JV6.A03(A012, new C48657Lfi(jSONObject), new C7OH(directThreadKey, A19), longValue, true).A00;
                                if (c83403nh2 != null) {
                                    C45120Jxp c45120Jxp2 = c83403nh.A0D;
                                    if (c45120Jxp2 != null) {
                                        c45120Jxp = new C45120Jxp((Boolean) c45120Jxp2.A03, true, false, c45120Jxp2.A06, c45120Jxp2.A04);
                                    } else {
                                        c45120Jxp = null;
                                    }
                                    c83403nh2.A0x(c45120Jxp);
                                    A1E.add(c83403nh2);
                                    A1C.append(AnonymousClass001.A0R(A03, ", "));
                                } else {
                                    str2 = "failed to build message from raw data. ";
                                }
                            } else {
                                str2 = "non ttlc message. ";
                            }
                            i3++;
                            c83403nh.A1G(AnonymousClass001.A0g(c83403nh.A0l(), " server response parse failed for ", str2));
                        } else {
                            i3++;
                            c83403nh.A1G(AnonymousClass001.A0g(c83403nh.A0l(), " server response server fail for ", "otid or encryptedPayload is null."));
                            A1E.add(c83403nh);
                            C0f5 AEp3 = C18950wb.A01.AEp("parseServerResponse failed to parse message", 20123732);
                            AEp3.ABW("error", A00(AEp3, c83403nh, c43707JUs));
                            AEp3.report();
                        }
                    }
                    A1E.add(c83403nh);
                }
                if (A1E.size() != c43707JUs.A06.size()) {
                    C0K8.A0E("ArmadilloExpressEncryptedBackupReverbImpl", "Parsed message size doesn't match with the serverThreadResult");
                }
                c43707JUs.A06 = A1E;
                c4kv2.A07(A01, "parse_server_response_end");
                c4kv2.A09(A01, "otids_created_directly_from_eb_response", AbstractC166987dD.A19(A1C));
                if (i3 > 0) {
                    c4kv2.A09(A01, "size_of_error_message_for_parsing_server_response", String.valueOf(i3));
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    Iterator it4 = c43707JUs.A06.iterator();
                    while (it4.hasNext()) {
                        C83403nh c83403nh3 = (C83403nh) AbstractC166997dE.A0l(it4);
                        if (c83403nh3.A10 == C2EY.A0n) {
                            C0f5 AEp4 = C18950wb.A01.AEp("parseServerResponse failed to parse message", 20123732);
                            AEp4.ABW("error", A00(AEp4, c83403nh3, c43707JUs));
                            AEp4.report();
                            A1C2.append(AnonymousClass001.A11("directMessage_id: ", c83403nh3.A0h(), ", error: ", c83403nh3.A0l(), ", "));
                        }
                    }
                    JV0 jv0 = A012.A01;
                    String A192 = AbstractC166987dD.A19(A1C);
                    String A193 = AbstractC166987dD.A19(A1C2);
                    String str10 = c43707JUs.A1E;
                    C14360o3.A0B(str10, 2);
                    StringBuilder A1C3 = AbstractC166987dD.A1C();
                    long currentTimeMillis = System.currentTimeMillis();
                    String[] strArr = {AnonymousClass001.A0e("server_response_parse_", " : [", currentTimeMillis), AnonymousClass001.A0g("timestamp : ", AbstractC43593JPy.A10(jv0.A02, currentTimeMillis), ", "), AnonymousClass001.A0g("thread_id : ", str10, ", "), AnonymousClass001.A0g("built_from_eb_message_otids : ", A192, ", "), AnonymousClass001.A0g("error : ", A193, ", ")};
                    int i4 = 0;
                    do {
                        A1C3.append(strArr[i4]);
                        i4++;
                    } while (i4 < 5);
                    JV0.A00(jv0, A1C3);
                    c4kv2.A09(A01, "error_message_for_parsing_server_response", AbstractC166987dD.A19(A1C2));
                    c4kv2.A0A(A01, "parse_server_response", AbstractC166987dD.A19(A1C2));
                }
            } else {
                ArrayList A0q = AbstractC167017dG.A0q(A002);
                Iterator it5 = A002.iterator();
                while (it5.hasNext()) {
                    A0q.add(AbstractC43592JPx.A0e(it5).A1j);
                }
                c4kv.A09(A01, "failed_to_decrypt_msg_otids", AbstractC001800i.A0P(", ", "", "", A0q, null));
                c4kv.A0A(A01, "parse_server_response", "reverb_failed_to_intercept_encrypted_messages");
            }
        }
        c4kr.A09.A9x(c43707JUs, new DirectThreadKey(str7, null), str8);
        c4kv.A0F(A01);
        c006802i.markerEnd(i, i2, (short) 2);
    }
}
