package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.8Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183348Bh {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public Long A0E;
    public AtomicLong A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public final C1QT A0J;
    public final C24Q A0K;
    public final C006802i A0L;

    public C183348Bh(C1QT c1qt, C24Q c24q, C006802i c006802i) {
        C14360o3.A0B(c006802i, 1);
        C14360o3.A0B(c1qt, 2);
        C14360o3.A0B(c24q, 3);
        this.A0L = c006802i;
        this.A0J = c1qt;
        this.A0K = c24q;
        this.A07 = 0L;
        this.A0I = 838609653L;
        this.A0C = 0L;
        this.A02 = 0L;
        this.A01 = 42144080L;
        this.A03 = 42152557L;
        this.A09 = 0L;
        this.A08 = 17630492L;
        this.A05 = 17636574L;
        this.A0F = new AtomicLong(838607486L);
        this.A0H = 838604618L;
        this.A0G = 838613025L;
        this.A06 = 838604519L;
        this.A0D = 17634094L;
        this.A0B = 613293953L;
        this.A00 = 17636030L;
        this.A04 = 17643726L;
        this.A0A = 0L;
    }

    public final void A05(C22P c22p, C5JK c5jk, String str, String str2, int i) {
        C14360o3.A0B(c22p, 0);
        C14360o3.A0B(c5jk, 3);
        if (c5jk == C5JK.A05) {
            AtomicLong atomicLong = this.A0F;
            C24Q c24q = this.A0K;
            atomicLong.set(c24q.A04(null, null, 838607486, 12000L));
            c24q.A0B(atomicLong.get(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name(), true);
            c24q.A0B(atomicLong.get(), "num_segments", String.valueOf(i), false);
            c24q.A0B(atomicLong.get(), "camera_destination", str, true);
            c24q.A0B(atomicLong.get(), "clips_creation_type", c5jk.A00, true);
            if (str2 != null) {
                c24q.A0B(atomicLong.get(), "camera_session_id", str2, false);
            }
        }
    }

    public final void A06(C22P c22p, C5JK c5jk, String str, List list) {
        C14360o3.A0B(c5jk, 0);
        if (c5jk == C5JK.A05) {
            if (list != null) {
                this.A0K.A0B(this.A0F.get(), "segments_sources", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, B9S.A00), false);
            }
            A01(c22p, this, c5jk, str, "trans_post_cap_finish", "2");
        }
    }

    public final void A07(C22P c22p, String str, int i, boolean z, boolean z2) {
        C14360o3.A0B(c22p, 0);
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 838609653, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        this.A0I = A04;
        c24q.A0B(A04, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name(), false);
        c24q.A0B(this.A0I, "is_soundsync", String.valueOf(z), false);
        c24q.A0B(this.A0I, "media_type", str, false);
        c24q.A0B(this.A0I, "duration_ms", String.valueOf(i), false);
        c24q.A0B(this.A0I, "is_template", String.valueOf(z2), false);
    }

    public final void A09(EnumC1810381f enumC1810381f, String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(enumC1810381f, 3);
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 838604618, 12000L);
        this.A0H = A04;
        c24q.A0B(A04, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str, false);
        if (str3 != null) {
            c24q.A0B(this.A0H, "camera_session_id", str3, true);
        }
        c24q.A0B(this.A0H, "capture_state", enumC1810381f.name(), true);
        c24q.A0B(this.A0H, "camera_destination", str2, false);
        if (C14360o3.A0K(str4, "clips_use_audio_button") && !z) {
            c24q.A0D("music_apply_started_during_use_audio", this.A0D, null, null, null, null);
        }
    }

    public final void A0H(String str) {
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 42144080, 12000L);
        this.A01 = A04;
        c24q.A0B(A04, "camera_session_id", str, false);
    }

    public final void A0K(String str) {
        C14360o3.A0B(str, 0);
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 17634094, 12000L);
        this.A0D = A04;
        c24q.A0B(A04, "camera_destination", str, false);
    }

    public final void A0L(String str, long j) {
        C14360o3.A0B(str, 0);
        this.A0K.A07(str, "", 42154153, j);
    }

    public final void A0M(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 838613025, 7000L);
        this.A0G = A04;
        if (str != null) {
            c24q.A0B(A04, "camera_session_id", str, true);
        }
        c24q.A0B(this.A0G, "segment_source", str2, true);
    }

    public final void A0N(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.A05 = this.A0K.A07(str, str2, 17636574, this.A05);
    }

    public static AHF A00(C183348Bh c183348Bh) {
        C1QT c1qt = c183348Bh.A0J;
        long j = c183348Bh.A07;
        AHF ahf = new AHF(c1qt);
        ahf.A01 = j;
        return ahf;
    }

    public static final void A01(C22P c22p, C183348Bh c183348Bh, C5JK c5jk, String str, String str2, String str3) {
        String str4;
        AtomicLong atomicLong = c183348Bh.A0F;
        String str5 = str2;
        if (atomicLong.compareAndSet(838607486L, 0L)) {
            C24Q c24q = c183348Bh.A0K;
            atomicLong.set(c24q.A04(null, null, 838607486, 12000L));
            c24q.A0B(atomicLong.get(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name(), false);
            c24q.A0B(atomicLong.get(), "camera_destination", str, true);
            c24q.A0B(atomicLong.get(), "clips_creation_type", c5jk.A00, true);
            c24q.A0B(atomicLong.get(), "unknown_flow_start_point", str2, true);
            long j = atomicLong.get();
            String str6 = AbstractC25041Ki.A00;
            if (str6 != null) {
                int length = str6.length();
                int i = 500;
                if (500 > length) {
                    i = length;
                }
                str4 = str6.substring(length - i);
                C14360o3.A07(str4);
            } else {
                str4 = "";
            }
            c24q.A0B(j, "nav_chain", str4, false);
            return;
        }
        C5JK c5jk2 = C5JK.A05;
        C24Q c24q2 = c183348Bh.A0K;
        long j2 = atomicLong.get();
        if (c5jk != c5jk2) {
            str5 = AnonymousClass001.A0g(str3, "_wrong_cct_", c5jk.name());
        }
        c24q2.A0D(str5, j2, null, null, null, null);
    }

    public final void A02() {
        this.A0G = this.A0K.A02(838613025, this.A0G);
    }

    public final void A03() {
        C24Q c24q = this.A0K;
        this.A0H = c24q.A02(838604618, this.A0H);
        if (c24q.A0E(17634094, this.A0D)) {
            this.A0D = c24q.A02(17634094, this.A0D);
        }
    }

    public final void A04() {
        C1QT c1qt = this.A0J;
        long j = this.A02;
        AHF ahf = new AHF(c1qt);
        ahf.A01 = j;
        ahf.A04("AUDIO_TRACK_DOWNLOAD_FAIL");
        long j2 = this.A02;
        AHF ahf2 = new AHF(c1qt);
        ahf2.A01 = j2;
        ahf2.A02();
    }

    public final void A08(C55U c55u, String str) {
        long j = this.A06;
        boolean z = c55u instanceof C81V;
        if (j != 838604519) {
            if (!z) {
                this.A06 = this.A0K.A02(838604519, j);
            }
        } else {
            if (!z) {
                return;
            }
            C24Q c24q = this.A0K;
            long A04 = c24q.A04(null, null, 838604519, 1800000L);
            this.A06 = A04;
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            c24q.A0B(A04, "reels_camera_session_id", obj, true);
            if (str == null) {
                return;
            }
            c24q.A0B(this.A06, "camera_session_id", str, true);
        }
    }

    public final void A0A(String str) {
        long j = this.A00;
        if (j != 17636030) {
            this.A0K.A0D(str, j, null, null, null, null);
        }
    }

    public final void A0B(String str) {
        this.A0G = this.A0K.A07(str, "", 838613025, this.A0G);
    }

    public final void A0C(String str) {
        C24Q c24q = this.A0K;
        this.A0H = c24q.A06(CancelReason.USER_CANCELLED, str, 838604618, this.A0H);
        if (c24q.A0E(17634094, this.A0D) && c24q.A0E(17634094, this.A0D)) {
            this.A0D = c24q.A06(CancelReason.USER_CANCELLED, str, 17634094, this.A0D);
        }
    }

    public final void A0D(String str) {
        C24Q c24q = this.A0K;
        this.A0H = c24q.A07(str, "", 838604618, this.A0H);
        if (c24q.A0E(17634094, this.A0D)) {
            this.A0D = c24q.A07(str, "", 17634094, this.A0D);
        }
    }

    public final void A0E(String str) {
        this.A0K.A0D(str, this.A0H, null, null, null, null);
    }

    public final void A0F(String str) {
        this.A0K.A0D(str, this.A05, null, null, null, null);
    }

    public final void A0G(String str) {
        C24Q c24q = this.A0K;
        c24q.A0B(this.A08, "result_action_name", str, true);
        this.A08 = c24q.A02(17630492, this.A08);
    }

    public final void A0I(String str) {
        this.A0I = this.A0K.A07(str, "", 838609653, this.A0I);
    }

    public final void A0J(String str) {
        String str2;
        if (this.A0I == 838609653) {
            C24Q c24q = this.A0K;
            long A04 = c24q.A04(null, null, 838609653, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            this.A0I = A04;
            c24q.A0D(str, A04, null, null, null, null);
            long j = this.A0I;
            String str3 = AbstractC25041Ki.A00;
            if (str3 != null) {
                int length = str3.length();
                int i = 500;
                if (500 > length) {
                    i = length;
                }
                str2 = str3.substring(length - i);
                C14360o3.A07(str2);
            } else {
                str2 = "";
            }
            c24q.A0B(j, "nav_chain", str2, false);
            long j2 = this.A0I;
            String A00 = C0JY.A00(new Exception());
            C14360o3.A07(A00);
            c24q.A0B(j2, "stack_trace", C00Q.A03(A00, 1000), false);
        }
        this.A0I = this.A0K.A02(838609653, this.A0I);
    }

    public final void A0O(String str, String str2) {
        C24Q c24q = this.A0K;
        c24q.A09(this.A01, "error", AnonymousClass001.A0T(str, str2, ' '));
        this.A01 = c24q.A07(str, "", 42144080, this.A01);
    }

    public final void A0P(String str, String str2) {
        C24Q c24q = this.A0K;
        c24q.A09(this.A03, "error", AnonymousClass001.A0R(str, str2));
        this.A03 = c24q.A07(str, "", 42152557, this.A03);
    }

    public final void A0Q(boolean z, boolean z2) {
        String str;
        C24Q c24q = this.A0K;
        long A04 = c24q.A04(null, null, 42152557, 12000L);
        this.A03 = A04;
        if (z) {
            str = "saved-drafts";
        } else {
            str = "autosaved-drafts";
        }
        c24q.A0B(A04, "draft_type", str, false);
        c24q.A0B(this.A03, "is_duplicate", String.valueOf(z2), false);
    }
}
