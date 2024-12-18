package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* renamed from: X.5p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127305p8 {
    public static volatile C127305p8 A02;
    public final C1QT A00;
    public final UserSession A01;

    public final void A03(C42557Isb c42557Isb, Reel reel) {
        String str;
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            long A00 = A00(id);
            EnumC40111tc enumC40111tc = c42557Isb.A01;
            boolean z = reel.A1a;
            C1QT c1qt = this.A00;
            c1qt.flowAnnotate(A00, "is_incomplete_media", true);
            c1qt.flowAnnotate(A00, "self_story", z);
            if (enumC40111tc != null) {
                str = enumC40111tc.name();
            } else {
                str = null;
            }
            c1qt.flowAnnotate(A00, "media_type", str);
        }
    }

    public final void A0C(Reel reel, C41181vS c41181vS) {
        Integer num;
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            long A00 = A00(id);
            UserSession userSession = this.A01;
            int indexOf = reel.A0O(userSession).indexOf(c41181vS);
            if (c41181vS.CdW()) {
                num = C05F.A01;
            } else if (c41181vS.A1Q()) {
                num = C05F.A0C;
            } else {
                num = C05F.A00;
            }
            EnumC40111tc A0C = c41181vS.A0C();
            c41181vS.A0n();
            boolean z = reel.A1a;
            C1QT c1qt = this.A00;
            c1qt.flowAnnotate(A00, "is_materialized", true);
            c1qt.flowAnnotate(A00, "segment_type", AbstractC129045sP.A00(num));
            c1qt.flowAnnotate(A00, "reel_type", reel.A0H(userSession));
            c1qt.flowAnnotate(A00, "self_story", z);
            if (A0C != null) {
                c1qt.flowAnnotate(A00, "media_type", A0C.name());
            }
            if (indexOf != -1) {
                c1qt.flowAnnotate(A00, "segment_position", indexOf);
            }
        }
    }

    public final void A0D(C3G4 c3g4, String str) {
        C14360o3.A0B(c3g4, 0);
        if (A02(this)) {
            Reel reel = c3g4.A03;
            String id = reel.getId();
            C14360o3.A07(id);
            long A00 = A00(id);
            C1QT c1qt = this.A00;
            c1qt.flowStart(A00, new UserFlowConfig("TRAY", true));
            if (A02(this)) {
                String id2 = reel.getId();
                C14360o3.A07(id2);
                long A002 = A00(id2);
                c1qt.flowAnnotate(A002, "is_add_to_story", reel.A0a());
                c1qt.flowAnnotate(A002, "is_nux_reel", reel.A1P);
                c1qt.flowAnnotate(A002, "is_roll_call_empty_state_pog", reel.A0o());
                c1qt.flowAnnotate(A002, "is_roll_call_pog", reel.getId().equals("election:rollcall_v2"));
                Integer num = reel.A0e;
                if (num != null) {
                    c1qt.flowAnnotate(A002, "reel_media_count", num.intValue());
                }
                c1qt.flowAnnotate(A002, "has_failed_pending_media", reel.A0Z());
                c1qt.flowAnnotate(A002, "has_permanently_failed_pending_media", c3g4.A02());
                UserSession userSession = this.A01;
                c1qt.flowAnnotate(A002, "has_media_flagged_by_rights_manager", c3g4.A05(userSession));
                c1qt.flowAnnotate(A002, "is_empty", c3g4.A06(userSession));
                c1qt.flowAnnotate(A002, "is_muted", reel.A1Y);
                c1qt.flowAnnotate(A002, "is_broadcast_reel", reel.A0d());
                c1qt.flowAnnotate(A002, "is_co_broadcast_reel", c3g4.A03());
                c1qt.flowAnnotate(A002, "is_live_question_and_answer", reel.A0j());
                c1qt.flowAnnotate(A002, "is_highlight_reel", reel.A0i());
                c1qt.flowAnnotate(A002, "is_suggested_highlight_reel", reel.A0p());
                boolean z = false;
                if (reel.A0P == ReelType.A0Q) {
                    z = true;
                }
                c1qt.flowAnnotate(A002, "is_highlight_rewind_reel", z);
            }
            c1qt.flowAnnotate(A00, "reel_tray_item_view_type", str);
        }
    }

    private final long A00(String str) {
        return this.A00.generateFlowId(17309598, String.valueOf(str).hashCode());
    }

    public static final boolean A02(C127305p8 c127305p8) {
        return C18U.A06(C06090Tz.A05, c127305p8.A01, 36324874884493869L);
    }

    public C127305p8(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C1QS.A00(userSession);
    }

    public static final Long A01(C127305p8 c127305p8, String str) {
        long A00 = c127305p8.A00(str);
        if (!c127305p8.A00.isOngoingFlow(A00)) {
            return null;
        }
        return Long.valueOf(A00);
    }

    public final void A04(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            long A00 = A00(id);
            boolean z = reel.A1a;
            C1QT c1qt = this.A00;
            c1qt.flowAnnotate(A00, "is_self_without_story", true);
            c1qt.flowAnnotate(A00, "self_story", z);
        }
    }

    public final void A05(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            long A00 = A00(id);
            boolean z = reel.A1a;
            C1QT c1qt = this.A00;
            c1qt.flowAnnotate(A00, "is_superlative", true);
            c1qt.flowAnnotate(A00, "self_story", z);
        }
    }

    public final void A06(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_avatar_view");
            }
        }
    }

    public final void A07(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_item_preview");
            }
        }
    }

    public final void A08(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_label");
            }
        }
    }

    public final void A09(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_muted_state");
            }
        }
    }

    public final void A0A(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_seen_state_and_self_pog_text");
            }
        }
    }

    public final void A0B(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            C14360o3.A07(id);
            Long A01 = A01(this, id);
            if (A01 != null) {
                this.A00.flowMarkPoint(A01.longValue(), "bind_tap_listener");
            }
        }
    }
}
