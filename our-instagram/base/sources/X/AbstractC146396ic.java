package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC146396ic implements InterfaceC64122vX {
    public final C146386ib A00;

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public C19280xC A00(C146386ib c146386ib, C82383m1 c82383m1, Object obj, Object obj2, String str) {
        C41551w4 c41551w4;
        C41181vS c41181vS;
        ?? r8;
        C141596ac c141596ac;
        int i;
        String str2;
        C14360o3.A0B(c146386ib, 0);
        boolean z = this instanceof C6QD;
        if (z) {
            c41551w4 = (C41551w4) obj;
            C14360o3.A0B(c41551w4, 0);
        } else {
            C149716oO c149716oO = (C149716oO) obj2;
            C14360o3.A0B(c149716oO, 1);
            c41551w4 = c149716oO.A00;
        }
        if (this instanceof C142116bU) {
            c41181vS = (C41181vS) obj;
            C14360o3.A0B(c41181vS, 0);
        } else {
            C6Q6 c6q6 = (C6Q6) obj2;
            C14360o3.A0B(c6q6, 1);
            c41181vS = c6q6.A01;
        }
        if (z) {
            C6Q6 c6q62 = (C6Q6) obj2;
            r8 = 1;
            C14360o3.A0B(c6q62, 1);
            c141596ac = c6q62.A02;
        } else {
            C149716oO c149716oO2 = (C149716oO) obj2;
            r8 = 1;
            C14360o3.A0B(c149716oO2, 1);
            c141596ac = c149716oO2.A02;
        }
        UserSession userSession = c146386ib.A00;
        InterfaceC60442pS interfaceC60442pS = c146386ib.A01;
        String str3 = c146386ib.A05;
        C3G2 c3g2 = c146386ib.A02;
        C28091Xn c28091Xn = c146386ib.A04;
        C1M1 c1m1 = c146386ib.A03;
        String str4 = c146386ib.A07;
        Reel reel = c41551w4.A0H;
        Integer num = reel.A0g;
        if (C18U.A06(C06090Tz.A05, userSession, 36312591278015682L)) {
            interfaceC60442pS = new C138356Or(interfaceC60442pS, reel, c3g2);
        }
        double d = (c141596ac.A0B * c141596ac.A0A) / 1000.0d;
        C19280xC A00 = C19280xC.A00(interfaceC60442pS, str3);
        A00.A0C("viewer_session_id", c1m1.getSessionId());
        A00.A0C("tray_session_id", str4);
        A00.A0C("reel_id", c41181vS.A0k);
        A00.A0C("m_pk", c41181vS.A0j);
        A00.A08(Integer.valueOf(c41551w4.A0E), "tray_position");
        A00.A08(Integer.valueOf(c41551w4.A02(userSession)), "reel_size");
        A00.A08(Integer.valueOf(C41551w4.A00(userSession, c41551w4).indexOf(c41181vS)), "reel_position");
        A00.A0C("reel_type", reel.A0H(userSession));
        String A002 = C6PL.A00(userSession, interfaceC60442pS, c41181vS);
        if (A002 != null) {
            A00.A0C("tracking_token", A002);
        }
        if (c41181vS.A0C() != null) {
            i = c41181vS.A0C().A00;
        } else {
            i = -1;
        }
        A00.A08(Integer.valueOf(i), "m_t");
        A00.A0A("time_elapsed", Double.valueOf(d));
        A00.A0A("time_remaining", Double.valueOf((c141596ac.A0A / 1000.0d) - d));
        A00.A0A("time_paused", Double.valueOf(c141596ac.A03));
        if (z) {
            C6Q6 c6q63 = (C6Q6) obj2;
            C14360o3.A0B(c6q63, r8);
            StringBuilder sb = new StringBuilder();
            sb.append("carousel_transformation_reel_item_");
            C41181vS c41181vS2 = c6q63.A01;
            sb.append(c41181vS2.A0j);
            sb.append("_segment_");
            sb.append(c6q63.A00);
            sb.append("_token_");
            sb.append(c41181vS2.BzL(((C6QD) this).A00.A00));
            str2 = sb.toString();
        } else {
            C41181vS c41181vS3 = (C41181vS) obj;
            C14360o3.A0B(c41181vS3, 0);
            str2 = c41181vS3.A0j;
            C14360o3.A07(str2);
        }
        A00.A09("client_sub_impression", Boolean.valueOf(!c28091Xn.A02(str2)));
        A00.A09("is_media_loaded", Boolean.valueOf(c141596ac.A0l));
        A00.A09("is_highlights_sourced", Boolean.valueOf(c41181vS.A1K()));
        A00.A0C("story_ranking_token", c146386ib.A06);
        A00.A0C("nav_chain", str);
        A00.A09("has_translation", Boolean.valueOf(c41181vS.A11()));
        A00.A08(num, "dynamic_story_duration");
        AbstractC131945xU.A00(A00, c82383m1);
        if (c41181vS.CdW()) {
            List list = reel.A0w;
            if (list != null) {
                int indexOf = C41551w4.A00(userSession, c41551w4).indexOf(c41181vS);
                A00.A0D("carousel_transformation_cards", AbstractC138416Ox.A00(list));
                A00.A08(Integer.valueOf(AbstractC130925vf.A03(list)), "reel_size");
                A00.A08(Integer.valueOf(AbstractC130925vf.A04(list, indexOf)), "reel_position");
                A00.A08(Integer.valueOf(list.size()), "segment_count");
                A00.A08(Integer.valueOf(indexOf), "segment_index");
            }
            boolean z2 = false;
            if (c141596ac.A0V != null) {
                z2 = true;
            }
            A00.A09("is_end_scene_shown", Boolean.valueOf(z2));
            A00.A0C("end_scene_subtitle", c141596ac.A0Y);
            C06090Tz c06090Tz = C06090Tz.A06;
            A00.A09("is_merlin_double_logging_enabled", Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36313424502327273L)));
            if (new C674732m(userSession).A04()) {
                C674732m c674732m = new C674732m(userSession);
                C38321qM c38321qM = c41181vS.A0b;
                C675032p c675032p = c674732m.A04;
                boolean A05 = c674732m.A05(c38321qM);
                boolean z3 = true;
                if (c3g2 != C3G2.A06) {
                    z3 = false;
                }
                if (A05) {
                    ArrayList arrayList = new ArrayList();
                    if (!C18U.A06(c06090Tz, c675032p.A00, 36324776100311499L)) {
                        arrayList.add("launcher_not_enabled");
                    }
                    if (AbstractC39681HjD.A03) {
                        arrayList.add("delay_skip_in_progress");
                    }
                    if (AbstractC39681HjD.A02) {
                        arrayList.add("cap_rule_not_expired");
                    }
                    if (z3) {
                        arrayList.add("unsupported_viewer_source");
                    }
                    if (arrayList.isEmpty()) {
                        A00.A09("is_rendered_as_delayed_skip", Boolean.valueOf((boolean) r8));
                    } else {
                        A00.A09("is_rendered_as_delayed_skip", false);
                        A00.A0D("delayed_skip_ad_ineligible_reasons", arrayList);
                    }
                }
            }
            if (!c41181vS.A1o() && (c82383m1.A04 >= 2000 || c82383m1.A05 >= 2000)) {
                A00.A09("is_ad_engaged_view", Boolean.valueOf((boolean) r8));
            }
        } else {
            A00.A09("is_merlin_double_logging_enabled", Boolean.valueOf(C18U.A06(C06090Tz.A06, userSession, 36313424501737440L)));
        }
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo != null) {
            A00.A09("is_multi_ads", Boolean.valueOf((boolean) r8));
            A00.A08(intentAwareAdsInfo.A02, "multi_ads_type");
            A00.A0C("hscroll_seed_ad_id", intentAwareAdsInfo.A07);
            A00.A0C("multi_ads_unit_id", intentAwareAdsInfo.A06);
            A00.A0C("intent_aware_ads_trigger_type", intentAwareAdsInfo.A09);
        }
        A00.A08(24, "imp_logger_ver");
        return A00;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        C41181vS c41181vS;
        boolean z;
        Long l;
        String str2;
        int i;
        String str3;
        InterfaceC107774tM BEB;
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        List list;
        C14360o3.A0B(c82383m1, 2);
        boolean z2 = this instanceof C142116bU;
        if (z2) {
            c41181vS = (C41181vS) obj;
            C14360o3.A0B(c41181vS, 0);
        } else {
            C6Q6 c6q6 = (C6Q6) obj2;
            C14360o3.A0B(c6q6, 1);
            c41181vS = c6q6.A01;
        }
        if (!c41181vS.CdW()) {
            C146386ib c146386ib = this.A00;
            UserSession userSession = c146386ib.A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36313424501737440L)) {
                if (z2) {
                    C41181vS c41181vS2 = (C41181vS) obj;
                    C149716oO c149716oO = (C149716oO) obj2;
                    C14360o3.A0B(c41181vS2, 1);
                    C14360o3.A0B(c149716oO, 2);
                    C41551w4 c41551w4 = c149716oO.A00;
                    C3G2 c3g2 = c146386ib.A02;
                    InterfaceC60442pS interfaceC60442pS = c146386ib.A01;
                    Reel reel = c41551w4.A0H;
                    Integer num = reel.A0g;
                    if (C18U.A06(C06090Tz.A05, userSession, 36312591278015682L)) {
                        interfaceC60442pS = new C138356Or(interfaceC60442pS, reel, c3g2);
                    }
                    C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
                    InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_vpvd_imp");
                    if (A00.isSampled()) {
                        C28091Xn c28091Xn = c146386ib.A04;
                        C1M1 c1m1 = c146386ib.A03;
                        String str4 = c146386ib.A07;
                        C141596ac c141596ac = c149716oO.A02;
                        double d = (c141596ac.A0B * c141596ac.A0A) / 1000.0d;
                        int indexOf = C41551w4.A00(userSession, c41551w4).indexOf(c41181vS2);
                        if (!c41551w4.A06 && c141596ac.A00 >= 0.25d) {
                            z = true;
                            c41551w4.A06 = true;
                        } else {
                            z = false;
                        }
                        Long l2 = null;
                        if (num != null) {
                            l = Long.valueOf(num.intValue());
                        } else {
                            l = null;
                        }
                        C38321qM c38321qM = c41181vS2.A0b;
                        if (c38321qM != null && (BEB = c38321qM.A0C.BEB()) != null && (AZh = BEB.AZh()) != null && (interfaceC107754tK = (InterfaceC107754tK) AZh.get(0)) != null) {
                            str2 = interfaceC107754tK.BlW();
                            if (str2 != null) {
                                List A03 = new C11L(":").A03(str2);
                                if (!A03.isEmpty()) {
                                    ListIterator listIterator = A03.listIterator(A03.size());
                                    while (listIterator.hasPrevious()) {
                                        if (((String) listIterator.previous()).length() != 0) {
                                            list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                list = C16930sl.A00;
                                l2 = Long.valueOf(Long.parseLong(((String[]) list.toArray(new String[0]))[1]));
                            }
                        } else {
                            str2 = null;
                        }
                        A00.A8I("max_duration_ms", Double.valueOf(c82383m1.A04));
                        A00.A8I("sum_duration_ms", Double.valueOf(c82383m1.A05));
                        A00.A8I("legacy_duration_ms", Double.valueOf(c82383m1.A02));
                        A00.AAP("tracking_token", C6PL.A00(userSession, interfaceC60442pS, c41181vS2));
                        A00.AAP("m_pk", c41181vS2.A0j);
                        if (c41181vS2.A0C() != null) {
                            i = c41181vS2.A0C().A00;
                        } else {
                            i = -1;
                        }
                        A00.AAP("m_t", String.valueOf(i));
                        A00.AAP("reel_id", c41181vS2.A0k);
                        A00.AAP("tray_session_id", str4);
                        A00.AAP("viewer_session_id", c1m1.getSessionId());
                        A00.A9K("reel_position", Long.valueOf(indexOf));
                        A00.A9K("reel_viewer_position", Long.valueOf(c141596ac.A0I));
                        A00.AAP("reel_type", reel.A0H(userSession));
                        A00.A9K("reel_size", Long.valueOf(c41551w4.A02(userSession)));
                        A00.A9K("tray_position", Long.valueOf(c41551w4.A0E));
                        A00.A8I("time_elapsed", Double.valueOf(d));
                        A00.A8I("time_remaining", Double.valueOf((c141596ac.A0A / 1000.0d) - d));
                        A00.A8I("time_paused", Double.valueOf(c141596ac.A03));
                        A00.A7v("is_highlights_sourced", Boolean.valueOf(c41181vS2.A1K()));
                        A00.AAP("story_ranking_token", c146386ib.A06);
                        A00.A8I("client_receive_time", Double.valueOf(TimeUnit.MILLISECONDS.toSeconds(AbstractC23021Ah.A00(userSession).A01.getLong("last_stories_tray_request_timestamp", -1L))));
                        A00.A7v("client_sub_impression", Boolean.valueOf(!c28091Xn.A02(r10)));
                        A00.A7v("is_media_loaded", Boolean.valueOf(c141596ac.A0l));
                        A00.AAP("nav_chain", str);
                        A00.A7v("is_merlin_double_logging_enabled", Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36313424501737440L)));
                        A00.A7v("is_from_merlin_infra", false);
                        A00.A7v("has_translation", Boolean.valueOf(c41181vS2.A11()));
                        A00.AAk("attribution_type", Collections.unmodifiableList(c141596ac.A1D));
                        A00.A9K("highlight_id", l2);
                        A00.AAP("highlight_reel_id", str2);
                        A00.A7v("is_stories_pog_impression", Boolean.valueOf(z));
                        A00.A9K("dynamic_story_duration", l);
                        C38491qd c38491qd = reel.A0M;
                        if (c38491qd != null && (str3 = c38491qd.A0X) != null) {
                            A00.AAP("ranking_info_token", str3);
                        }
                        A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                        A00.AAP("canonical_nav_chain_previous", C3NN.A00);
                        A00.A9K("canonical_nav_chain_delta_ms_since_last_update", Long.valueOf(C3NP.A01.now() - C3NP.A00));
                        A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                        A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                        A00.AAP("device_fold_state", AbstractC82683mW.A00);
                        A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                        A00.Cht();
                        return null;
                    }
                    return null;
                }
                return null;
            }
        }
        return A00(this.A00, c82383m1, obj, obj2, str);
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public AbstractC146396ic(C146386ib c146386ib) {
        this.A00 = c146386ib;
    }
}
