package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.24U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24U {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final C24Q A0E;
    public final UserSession A0F;
    public final long A0G;

    public final void A04(int i) {
        C24Q c24q = this.A0E;
        c24q.A0B(c24q.A04(Integer.valueOf(i), null, 17639880, this.A0G), "search_session_id", this.A07, false);
    }

    public final void A07(String str) {
        if (!str.equals("IGNORE_search_back")) {
            if (str.equals("notes_music_button")) {
                C22C A01 = AnonymousClass229.A01(this.A0F);
                C82X.A00(((C22F) A01).A03).A00 = C1811481q.A00;
                ((C22F) A01).A04.A08 = EnumC114925Hg.NOTE;
            }
            C24Q c24q = this.A0E;
            long A04 = c24q.A04(null, null, 17641988, this.A0B);
            this.A02 = A04;
            c24q.A0B(A04, "music_browser_entry_point", str, false);
        }
    }

    public final void A0C(String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            this.A0E.A0D("submitted_debounced", this.A03, null, null, null, null);
        }
    }

    public final void A0D(String str, String str2) {
        String str3 = str;
        C24Q c24q = this.A0E;
        c24q.A0B(this.A02, "music_browser_failure_category", str2, false);
        long j = this.A02;
        if (str == null) {
            str3 = "music_browser_open_failed";
        }
        this.A02 = c24q.A07(str3, "", 17641988, j);
    }

    public final void A0E(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A05 = null;
        this.A00 = 0;
        C24Q c24q = this.A0E;
        if (!c24q.A0E(17636867, this.A03) && str.length() > 0) {
            long A04 = c24q.A04(null, null, 17636867, this.A0C);
            this.A03 = A04;
            c24q.A0B(A04, "capture_state", str2, false);
        } else if (str.length() > 0) {
            c24q.A0D("query_changed", this.A03, null, null, null, null);
            c24q.A08(this.A03, this.A0C, 17636867);
        } else {
            A00();
            return;
        }
        this.A06 = str;
        if (C14360o3.A0K(this.A07, "null") || C14360o3.A0K(this.A07, "not_search")) {
            this.A07 = C0HM.A00().toString();
        }
        c24q.A0B(this.A03, "search_session_id", this.A07, false);
    }

    public final void A0F(String str, boolean z) {
        C14360o3.A0B(str, 0);
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            if (z) {
                this.A0E.A0C("local_cache_success", this.A03);
            }
            this.A0E.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, this.A03, null, null, null, null);
        }
    }

    public final void A0G(String str, boolean z, int i) {
        String str2;
        C14360o3.A0B(str, 0);
        String str3 = this.A05;
        if (str3 == null || !str3.equals(str)) {
            C24Q c24q = this.A0E;
            if (c24q.A0E(17636867, this.A03)) {
                long j = this.A03;
                if (z) {
                    str2 = "network_cache_success";
                } else {
                    str2 = "network_request_success";
                }
                c24q.A0D(str2, j, "num_items", String.valueOf(i), null, null);
            }
        }
    }

    private final void A00() {
        C24Q c24q = this.A0E;
        if (c24q.A0E(17636867, this.A03)) {
            this.A03 = c24q.A06(CancelReason.USER_CANCELLED, "Query cleared or browser closed", 17636867, this.A03);
        }
        C48U c48u = (C48U) c24q.A08.get(17639880);
        if (c48u != null) {
            c24q.A00.flowMarkPoint(c48u.A00, "query_cleared_browser_closed");
        }
        Iterator it = AbstractC001800i.A0k(c24q.A07.keySet()).iterator();
        while (it.hasNext()) {
            c24q.A00.flowMarkPoint(((Number) it.next()).longValue(), "query_cleared_browser_closed");
        }
    }

    public final void A02() {
        C24Q c24q = this.A0E;
        long A04 = c24q.A04(null, null, 17645025, this.A0D);
        this.A04 = A04;
        c24q.A0B(A04, "use_case", "music_editor_resume", false);
    }

    public final void A03(int i) {
        C24Q c24q = this.A0E;
        c24q.A0D("network_finished", c24q.A00.generateFlowId(17639880, i), null, null, null, null);
    }

    public final void A05(int i, String str) {
        C24Q c24q = this.A0E;
        long generateFlowId = c24q.A00.generateFlowId(17639880, i);
        if (c24q.A0E(17639880, generateFlowId)) {
            c24q.A06(CancelReason.SYSTEM_CANCELLED, str, 17639880, generateFlowId);
        }
    }

    public final void A06(Boolean bool, String str, boolean z) {
        if (str == null) {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        if (z && !C14360o3.A0K(bool, true)) {
            this.A0E.A0C(AnonymousClass001.A0R("Received transcode preview for: ", str), this.A01);
        } else {
            C24Q c24q = this.A0E;
            c24q.A09(this.A01, "audio_filter", str);
            c24q.A09(this.A01, "is_transcoded", String.valueOf(z));
            this.A01 = c24q.A02(17634511, this.A01);
        }
    }

    public final void A08(String str) {
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            C24Q c24q = this.A0E;
            if (c24q.A0E(17636867, this.A03)) {
                c24q.A0C("network_request_cancel", this.A03);
            }
        }
    }

    public final void A09(String str) {
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            this.A0E.A0D("network_request_fail", this.A03, null, null, null, null);
        }
    }

    public final void A0A(String str) {
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            C24Q c24q = this.A0E;
            if (c24q.A0E(17636867, this.A03)) {
                c24q.A0D("network_request_finish", this.A03, null, null, null, null);
            }
        }
    }

    public final void A0B(String str) {
        String str2 = this.A05;
        if (str2 == null || !str2.equals(str)) {
            this.A0E.A0D("network_request_start", this.A03, null, null, null, null);
        }
    }

    public final void A0H(boolean z, boolean z2) {
        C24Q c24q = this.A0E;
        long A03 = c24q.A03(17645025, this.A0D);
        this.A04 = A03;
        c24q.A09(A03, "use_case", "during_recording");
        c24q.A09(this.A04, "has_audio_overlay_track", String.valueOf(z));
        c24q.A09(this.A04, "is_album_icon_set", String.valueOf(z2));
    }

    public C24U(C24Q c24q, UserSession userSession) {
        this.A0F = userSession;
        this.A0E = c24q;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0D = C18U.A01(c06090Tz, userSession, 36602862347752278L);
        this.A0B = C18U.A01(c06090Tz, userSession, 36602862347817815L);
        this.A0C = C18U.A01(c06090Tz, userSession, 36602862347883352L);
        this.A0G = C18U.A01(c06090Tz, userSession, 36602862348014426L);
        this.A04 = 17645025L;
        this.A02 = 17641988L;
        this.A03 = 17636867L;
        this.A01 = 17634511L;
        this.A07 = "null";
    }

    public final void A01() {
        this.A07 = "null";
        A00();
    }
}
