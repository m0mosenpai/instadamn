package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140706Xy {
    public static volatile C140706Xy A02;
    public final C1QT A00;
    public final UserSession A01;

    public final void A06(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        Long A01 = A01(this, str, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            c1qt.flowMarkPoint(longValue, "json_fetch_fail");
            c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_fetch_fail");
        }
        A0A(c41181vS, C05F.A00);
    }

    public final void A07(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        Long A01 = A01(this, str, A02(c41181vS));
        if (A01 != null) {
            this.A00.flowMarkPoint(A01.longValue(), "json_fetch_success");
        }
    }

    public final void A09(C41181vS c41181vS, Integer num) {
        String str;
        C14360o3.A0B(c41181vS, 0);
        String str2 = c41181vS.A0k;
        C14360o3.A07(str2);
        Long A01 = A01(this, str2, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = "dismiss_swipe";
                    break;
                case 1:
                    str = "dismiss_tap_back";
                    break;
                case 2:
                    str = "navigate_before_load";
                    break;
                default:
                    str = "navigate_to_another_view_before_load";
                    break;
            }
            c1qt.flowEndCancel(longValue, str);
        }
    }

    public final void A0A(C41181vS c41181vS, Integer num) {
        String str;
        C14360o3.A0B(c41181vS, 0);
        String str2 = c41181vS.A0k;
        C14360o3.A07(str2);
        Long A01 = A01(this, str2, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = "json_fetch_fail";
                    break;
                case 1:
                    str = "photo_fetch_fail";
                    break;
                case 2:
                    str = "video_fetch_fail";
                    break;
                default:
                    str = "video_playback_fail";
                    break;
            }
            c1qt.flowEndFail(longValue, str, null);
        }
    }

    public final void A0B(C41181vS c41181vS, boolean z) {
        Integer num;
        String str;
        C14360o3.A0B(c41181vS, 0);
        String str2 = c41181vS.A0k;
        C14360o3.A07(str2);
        Long A01 = A01(this, str2, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            if (z) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            if (num.intValue() != 0) {
                str = "network";
            } else {
                str = "cache";
            }
            c1qt.flowAnnotate(longValue, "media_fetch_mode", str);
        }
    }

    public final void A0F(C41551w4 c41551w4, String str) {
        C14360o3.A0B(c41551w4, 0);
        if (str != null) {
            C41181vS A08 = c41551w4.A08(this.A01);
            String str2 = A08.A0k;
            C14360o3.A07(str2);
            Long A01 = A01(this, str2, A02(A08));
            if (A01 != null) {
                this.A00.flowAnnotate(A01.longValue(), AbstractC43591JPw.A00(1261), str);
            }
        }
    }

    public static final long A00(C140706Xy c140706Xy, String str, String str2) {
        C1QT c1qt = c140706Xy.A00;
        if (str2 == null) {
            str2 = "";
        }
        return c1qt.generateFlowId(17313040, AnonymousClass001.A0R(str, str2).hashCode());
    }

    public static final void A05(C41551w4 c41551w4, C3G2 c3g2, C140706Xy c140706Xy, Integer num, boolean z) {
        String str;
        Reel reel = c41551w4.A0H;
        UserSession userSession = c140706Xy.A01;
        C41181vS A08 = c41551w4.A08(userSession);
        String id = reel.getId();
        C14360o3.A07(id);
        long A00 = A00(c140706Xy, id, A02(A08));
        if (!z && c140706Xy.A00.isOngoingFlow(A00)) {
            return;
        }
        C1QT c1qt = c140706Xy.A00;
        switch (num.intValue()) {
            case 0:
                str = "initial_load";
                break;
            case 1:
                str = "story";
                break;
            default:
                str = "segment";
                break;
        }
        c1qt.flowStart(A00, new UserFlowConfig(str, true));
        c1qt.flowAnnotate(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c3g2.A00);
        A03(reel, c41551w4.A08(userSession), c140706Xy);
        A04(reel, c41551w4.A08(userSession), c140706Xy);
    }

    public final void A08(C41181vS c41181vS) {
        Integer num;
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        Long A01 = A01(this, str, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            c1qt.flowMarkPoint(longValue, "media_fetch_fail");
            c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "media_fetch_fail");
        }
        if (c41181vS.A1o()) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        A0A(c41181vS, num);
    }

    public final void A0C(C41181vS c41181vS, boolean z) {
        String str;
        String str2 = c41181vS.A0k;
        C14360o3.A07(str2);
        Long A01 = A01(this, str2, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            if (z) {
                str = "media_early_fetch_start";
            } else {
                str = "media_fetch_start";
            }
            c1qt.flowMarkPoint(longValue, str);
        }
    }

    public final void A0D(C41181vS c41181vS, boolean z) {
        String str;
        String str2 = c41181vS.A0k;
        C14360o3.A07(str2);
        Long A01 = A01(this, str2, A02(c41181vS));
        if (A01 != null) {
            long longValue = A01.longValue();
            C1QT c1qt = this.A00;
            if (z) {
                str = "media_early_fetch_success";
            } else {
                str = "media_fetch_success";
            }
            c1qt.flowMarkPoint(longValue, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (X.C14360o3.A0K(r5, "disk") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.C41551w4 r4, java.lang.String r5) {
        /*
            r3 = this;
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1vS r2 = r4.A08(r0)
            java.lang.String r0 = "memory"
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "disk"
            boolean r1 = X.C14360o3.A0K(r5, r0)
            r0 = 0
            if (r1 == 0) goto L18
        L17:
            r0 = 1
        L18:
            r3.A0B(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140706Xy.A0E(X.1w4, java.lang.String):void");
    }

    public C140706Xy(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C1QS.A00(userSession);
    }

    public static final Long A01(C140706Xy c140706Xy, String str, String str2) {
        long A00 = A00(c140706Xy, str, str2);
        C1QT c1qt = c140706Xy.A00;
        if (!c1qt.isOngoingFlow(A00)) {
            A00 = A00(c140706Xy, str, null);
            if (!c1qt.isOngoingFlow(A00)) {
                return null;
            }
        }
        return Long.valueOf(A00);
    }

    public static final String A02(C41181vS c41181vS) {
        if (c41181vS.A1O()) {
            return null;
        }
        return c41181vS.A0j;
    }

    public static final void A03(Reel reel, C41181vS c41181vS, C140706Xy c140706Xy) {
        String str;
        Integer num;
        String str2;
        String id = reel.getId();
        C14360o3.A07(id);
        if (c41181vS != null) {
            str = A02(c41181vS);
        } else {
            str = null;
        }
        Long A01 = A01(c140706Xy, id, str);
        if (A01 != null) {
            long longValue = A01.longValue();
            UserSession userSession = c140706Xy.A01;
            int size = reel.A0O(userSession).size();
            int i = (int) reel.A04;
            boolean A0e = reel.A0e();
            if (reel.A0z(userSession)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            C1QT c1qt = c140706Xy.A00;
            c1qt.flowAnnotate(longValue, "number_of_segments", size);
            c1qt.flowAnnotate(longValue, "tray_position", i);
            c1qt.flowAnnotate(longValue, "self_story", A0e);
            if (num.intValue() != 0) {
                str2 = "network";
            } else {
                str2 = "cache";
            }
            c1qt.flowAnnotate(longValue, "json_fetch_mode", str2);
        }
    }

    public static final void A04(Reel reel, C41181vS c41181vS, C140706Xy c140706Xy) {
        Integer num;
        Integer num2;
        String str;
        ArrayList arrayList;
        Integer num3;
        String str2;
        if (!c41181vS.A1O()) {
            String str3 = c41181vS.A0k;
            C14360o3.A07(str3);
            Long A01 = A01(c140706Xy, str3, A02(c41181vS));
            if (A01 != null) {
                long longValue = A01.longValue();
                UserSession userSession = c140706Xy.A01;
                int indexOf = reel.A0O(userSession).indexOf(c41181vS);
                if (c41181vS.CdW()) {
                    num = C05F.A01;
                } else if (c41181vS.A1Q()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A00;
                }
                EnumC40111tc A0C = c41181vS.A0C();
                boolean A0n = c41181vS.A0n();
                if (c41181vS.A1o() && c41181vS.A0n() && !C6P0.A01(userSession, c41181vS)) {
                    num2 = C05F.A00;
                } else if (c41181vS.A1o() && C6P0.A01(userSession, c41181vS)) {
                    num2 = C05F.A01;
                } else {
                    num2 = C05F.A0C;
                }
                boolean A1u = c41181vS.A1u(userSession);
                if (indexOf != -1) {
                    c140706Xy.A00.flowAnnotate(longValue, "segment_position", indexOf);
                }
                C1QT c1qt = c140706Xy.A00;
                c1qt.flowAnnotate(longValue, "segment_type", AbstractC129045sP.A00(num));
                c1qt.flowAnnotate(longValue, "has_audio", A0n);
                switch (num2.intValue()) {
                    case 0:
                        str = "available";
                        break;
                    case 1:
                        str = "available_but_muted";
                        break;
                    default:
                        str = "unavailable";
                        break;
                }
                c1qt.flowAnnotate(longValue, "audio_availability", str);
                C38321qM c38321qM = c41181vS.A0b;
                String str4 = null;
                if (c38321qM != null) {
                    str4 = c38321qM.getId();
                }
                c1qt.flowAnnotate(longValue, "media_id", str4);
                List A0c = c41181vS.A0c();
                if (A0c == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator it = A0c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C84823qW) it.next()).A12.toString());
                    }
                }
                c1qt.flowAnnotate(longValue, "story_sticker_type", String.valueOf(arrayList));
                if (A0C != null) {
                    c1qt.flowAnnotate(longValue, "media_type", A0C.name());
                }
                Boolean bool = c41181vS.A0G;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        num3 = C05F.A00;
                    } else {
                        num3 = C05F.A01;
                    }
                    if (num3.intValue() != 0) {
                        str2 = "network";
                    } else {
                        str2 = "cache";
                    }
                    c1qt.flowAnnotate(longValue, "media_fetch_mode", str2);
                }
                c1qt.flowAnnotate(longValue, "is_showing_deletion_error", A1u);
            }
        }
    }
}
