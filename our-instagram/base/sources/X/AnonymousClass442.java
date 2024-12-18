package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.442, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass442 {
    public C206409Bx A00;
    public C9CL A01;
    public C1575375n A02;
    public C7QR A03;
    public C7QP A04;
    public C101864hx A05;
    public C101584hT A06;
    public C101584hT A07;
    public C4G2 A08;
    public C910143t A09;
    public C67640Utv A0A;
    public L93 A0B;
    public C38321qM A0C;
    public C38321qM A0D;
    public C2EY A0E;
    public C2EY A0F;
    public C1120954b A0G;
    public DirectStoreStickerResponseItem A0H;
    public ExtendedImageUrl A0I;
    public Boolean A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public HashMap A0X;
    public List A0Y;

    public AnonymousClass442(C206409Bx c206409Bx, C9CL c9cl, C1575375n c1575375n, C7QR c7qr, C7QP c7qp, C101864hx c101864hx, C101584hT c101584hT, C4G2 c4g2, C910143t c910143t, C67640Utv c67640Utv, C38321qM c38321qM, C2EY c2ey, C2EY c2ey2, C1120954b c1120954b, DirectStoreStickerResponseItem directStoreStickerResponseItem, ExtendedImageUrl extendedImageUrl, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, long j) {
        this.A0F = C2EY.A1i;
        this.A0W = "";
        this.A0T = str3;
        this.A0R = str;
        this.A0F = c2ey2;
        this.A0U = str5;
        this.A0V = str6;
        this.A0A = c67640Utv;
        this.A01 = c9cl;
        this.A0B = null;
        this.A0C = c38321qM;
        this.A03 = c7qr;
        this.A04 = c7qp;
        this.A02 = c1575375n;
        this.A08 = c4g2;
        this.A07 = c101584hT;
        this.A0G = c1120954b;
        this.A0H = directStoreStickerResponseItem;
        this.A0Q = str4;
        this.A09 = c910143t;
        this.A0Y = list;
        this.A00 = c206409Bx;
        this.A0E = c2ey;
        this.A0I = extendedImageUrl;
        this.A05 = c101864hx;
        this.A0P = Long.valueOf(j);
        this.A0S = str2;
        this.A0J = bool;
        this.A0X = map != null ? new HashMap(map) : null;
    }

    public static AnonymousClass442 A00(C16L c16l) {
        Integer num;
        String str;
        long j;
        C101584hT c101584hT;
        try {
            AnonymousClass442 anonymousClass442 = new AnonymousClass442();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 == c16r) {
                while (true) {
                    C16R A1J = c16l.A1J();
                    C16R c16r2 = C16R.A09;
                    if (A1J == c16r2) {
                        break;
                    }
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    ArrayList arrayList = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    HashMap hashMap = null;
                    Long l = null;
                    Long l2 = null;
                    Long l3 = null;
                    Long l4 = null;
                    Long l5 = null;
                    if ("client_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        anonymousClass442.A0R = str2;
                    } else if ("item_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        anonymousClass442.A0T = str3;
                    } else if ("item_type".equals(A0q)) {
                        anonymousClass442.A0F = C2EY.A0A.A00(c16l.A1P());
                    } else if ("text".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        anonymousClass442.A0V = str4;
                    } else if ("image_glyphs".equals(A0q)) {
                        anonymousClass442.A0A = AbstractC69935Vy6.parseFromJson(c16l);
                    } else if ("media".equals(A0q)) {
                        anonymousClass442.A0C = C38321qM.A0h.A0C(c16l, true, false);
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        anonymousClass442.A0U = str5;
                    } else if ("reel_share".equals(A0q)) {
                        anonymousClass442.A03 = LCB.parseFromJson(c16l);
                    } else if ("story_share".equals(A0q)) {
                        anonymousClass442.A04 = LCC.parseFromJson(c16l);
                    } else if ("clip".equals(A0q)) {
                        anonymousClass442.A02 = IQG.parseFromJson(c16l);
                    } else if ("media_share".equals(A0q)) {
                        anonymousClass442.A0D = C38321qM.A0h.A0C(c16l, true, false);
                    } else if ("direct_media_share".equals(A0q)) {
                        anonymousClass442.A01 = FUV.parseFromJson(c16l);
                    } else if ("voice_media".equals(A0q)) {
                        anonymousClass442.A08 = C4G1.parseFromJson(c16l);
                    } else if ("visual_media".equals(A0q)) {
                        anonymousClass442.A07 = AbstractC101574hS.parseFromJson(c16l);
                    } else if ("message_item_dict".equals(A0q)) {
                        anonymousClass442.A06 = AbstractC101574hS.parseFromJson(c16l);
                    } else if ("animated_media".equals(A0q)) {
                        anonymousClass442.A0G = C54V.parseFromJson(c16l);
                    } else if ("store_sticker".equals(A0q)) {
                        anonymousClass442.A0H = AbstractC47869LCp.parseFromJson(c16l);
                    } else if ("xma".equals(A0q)) {
                        anonymousClass442.A09 = AbstractC910043s.parseFromJson(c16l);
                    } else if ("status_reply".equals(A0q)) {
                        anonymousClass442.A0B = LCE.parseFromJson(c16l);
                    } else if ("replied_to_action_source".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        anonymousClass442.A0Q = str6;
                    } else if ("link".equals(A0q)) {
                        anonymousClass442.A00 = AbstractC1122154p.parseFromJson(c16l);
                    } else if ("message_item_type".equals(A0q)) {
                        anonymousClass442.A0E = C2EY.A0A.A00(c16l.A1P());
                    } else if ("reaction_image_url_info".equals(A0q)) {
                        anonymousClass442.A0I = C17Y.parseFromJson(c16l);
                    } else if ("video_call_event".equals(A0q)) {
                        anonymousClass442.A05 = AbstractC101854hw.parseFromJson(c16l);
                    } else if ("timestamp".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        anonymousClass442.A0W = str7;
                    } else if ("timestamp_in_micro".equals(A0q)) {
                        anonymousClass442.A04(c16l.A0y());
                    } else if ("collection_item_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        anonymousClass442.A0S = str8;
                    } else if ("is_ae".equals(A0q)) {
                        anonymousClass442.A0J = Boolean.valueOf(c16l.A0d());
                    } else if ("media_interventions".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    Integer valueOf = Integer.valueOf(c16l.A1D());
                                    if (valueOf != null) {
                                        hashMap2.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        anonymousClass442.A0X = hashMap;
                    } else if ("ephemeral_duration_sec".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l = Long.valueOf(c16l.A0y());
                        }
                        anonymousClass442.A0K = l;
                    } else if ("ephemeral_view_timestamp_ms".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l2 = Long.valueOf(c16l.A0y());
                        }
                        anonymousClass442.A0O = l2;
                    } else if ("ephemeral_view_duration_sec".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l3 = Long.valueOf(c16l.A0y());
                        }
                        anonymousClass442.A0M = l3;
                    } else if ("ephemeral_after_view_expiration_timestamp_ms".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l4 = Long.valueOf(c16l.A0y());
                        }
                        anonymousClass442.A0N = l4;
                    } else if ("message_expiration_timestamp_ms".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l5 = Long.valueOf(c16l.A0y());
                        }
                        anonymousClass442.A0L = l5;
                    } else if ("hscroll_share".equals(A0q) || "xma_profile".equals(A0q) || "xma_media_share".equals(A0q) || "xma_reel_share".equals(A0q) || "xma_reel_mention".equals(A0q) || "xma_story_share".equals(A0q) || "xma_live_viewer_invite".equals(A0q) || "xma_product_share".equals(A0q) || "xma_felix_share".equals(A0q) || "xma_clip".equals(A0q) || "xma_ar_effect".equals(A0q) || "shops_collection_share".equals(A0q) || "shop_share".equals(A0q) || "reels_audio_share".equals(A0q) || "ig_rooms_xma".equals(A0q) || "appointment_booking".equals(A0q) || "info_center".equals(A0q) || "info_center_fact".equals(A0q) || "generic_template".equals(A0q) || "generic_xma".equals(A0q) || "direct_group_poll_v1".equals(A0q) || "p2p_payment".equals(A0q) || "fbpay_referral".equals(A0q) || "music".equals(A0q) || "p2b_order".equals(A0q) || "book_now_link_share".equals(A0q) || "direct_headmoji".equals(A0q) || "comment_reshare".equals(A0q) || "location_share_xma".equals(A0q) || "fundraiser".equals(A0q) || "avatar_sticker".equals(A0q) || "animated_avatar_sticker".equals(A0q) || "destination".equals(A0q) || "collections_share".equals(A0q) || "public_collections_share".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C910143t parseFromJson = AbstractC910043s.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        anonymousClass442.A0Y = arrayList;
                    }
                    c16l.A0z();
                }
            } else {
                c16l.A0z();
                anonymousClass442 = null;
            }
            if (anonymousClass442 != null) {
                if (c16l instanceof C07950bF) {
                    UserSession userSession = ((C07950bF) c16l).A01;
                    if (!TextUtils.isEmpty(anonymousClass442.A0W)) {
                        anonymousClass442.A04(Long.parseLong(anonymousClass442.A0W));
                    }
                    C2EY c2ey = anonymousClass442.A0F;
                    if (c2ey == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Encountered DirectRepliedToMessage with null content: type=");
                        sb.append(c2ey);
                        C0w9.A04("DirectRepliedToMessage", sb.toString(), 1);
                        return null;
                    }
                    AnonymousClass443 anonymousClass443 = AnonymousClass443.$redex_init_class;
                    int ordinal = c2ey.ordinal();
                    if (ordinal != 20) {
                        if (ordinal == 4 && (c101584hT = anonymousClass442.A07) != null) {
                            C38321qM c38321qM = c101584hT.A05;
                            c38321qM.getClass();
                            c38321qM.A0C.ETH(true);
                            C101584hT c101584hT2 = anonymousClass442.A07;
                            c101584hT2.A05 = C43V.A01(userSession, c101584hT2.A05, anonymousClass442.A0U);
                            C101584hT c101584hT3 = anonymousClass442.A07;
                            c101584hT3.A04 = AbstractC101604hV.A00(userSession, c101584hT3.A05);
                        }
                    } else {
                        C38321qM c38321qM2 = anonymousClass442.A0D;
                        if (c38321qM2 != null) {
                            C38321qM A01 = C43V.A01(userSession, c38321qM2, anonymousClass442.A0U);
                            anonymousClass442.A0D = A01;
                            if (anonymousClass442.A01 == null) {
                                if (A01 != null) {
                                    num = A01.A2U();
                                } else {
                                    num = null;
                                }
                                C38321qM c38321qM3 = anonymousClass442.A0D;
                                if (c38321qM3 != null) {
                                    str = c38321qM3.A0C.AmM();
                                } else {
                                    str = null;
                                }
                                anonymousClass442.A01 = new C9CL(A01, num, null, str, null);
                            }
                            anonymousClass442.A0D = null;
                        }
                    }
                    synchronized (anonymousClass442) {
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        Long l6 = anonymousClass442.A0P;
                        if (l6 != null) {
                            j = l6.longValue();
                        } else {
                            j = 0;
                        }
                        long millis = timeUnit.toMillis(j);
                        Long l7 = anonymousClass442.A0K;
                        if (l7 != null) {
                            long longValue = l7.longValue();
                            if (longValue > 0) {
                                anonymousClass442.A0L = Long.valueOf(TimeUnit.SECONDS.toMillis(longValue) + millis);
                            }
                        }
                        synchronized (anonymousClass442) {
                            Long l8 = anonymousClass442.A0M;
                            if (l8 != null && anonymousClass442.A0O != null) {
                                anonymousClass442.A0N = Long.valueOf(TimeUnit.SECONDS.toMillis(l8.longValue()) + anonymousClass442.A0O.longValue());
                            }
                        }
                        return anonymousClass442;
                    }
                    return anonymousClass442;
                }
                C0w9.A03("direct_message_missing_session", "DirectMessage JSON needs to be parsed using SessionAwareJsonParser");
                return anonymousClass442;
            }
            return anonymousClass442;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public final ImmutableList A01() {
        List list = this.A0Y;
        if (list == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) list);
    }

    public final Integer A02(String str) {
        HashMap hashMap = this.A0X;
        if (hashMap != null && !hashMap.isEmpty() && hashMap.containsKey(str)) {
            return (Integer) this.A0X.get(str);
        }
        return -1;
    }

    public final String A03() {
        C206409Bx c206409Bx;
        String str;
        C7QR c7qr;
        if (this.A0F == C2EY.A1V && (c7qr = this.A03) != null && !TextUtils.isEmpty(c7qr.A0A)) {
            return this.A03.A0A;
        }
        C2EY c2ey = this.A0F;
        C2EY c2ey2 = C2EY.A1i;
        if (c2ey != c2ey2 && c2ey != C2EY.A1u) {
            if (c2ey == C2EY.A1e) {
                L93 l93 = this.A0B;
                if (l93 != null) {
                    if (l93.A01() == C05F.A01) {
                        return "❤";
                    }
                    return this.A0B.A05;
                }
            } else {
                List list = this.A0Y;
                if (list != null && list.size() == 1) {
                    C2EY c2ey3 = this.A0E;
                    if ((c2ey3 == c2ey2 || c2ey3 == C2EY.A0m) && (str = this.A0V) != null) {
                        return str;
                    }
                    if (!TextUtils.isEmpty(((C910143t) this.A0Y.get(0)).A13)) {
                        return ((C910143t) this.A0Y.get(0)).A13;
                    }
                }
                if (this.A0F == C2EY.A19 && (c206409Bx = this.A00) != null) {
                    return c206409Bx.A01;
                }
                return null;
            }
        }
        return this.A0V;
    }

    public final void A04(long j) {
        String obj;
        Long l = this.A0P;
        if (l != null && l.equals(Long.valueOf(j))) {
            return;
        }
        Long valueOf = Long.valueOf(j);
        this.A0P = valueOf;
        if (valueOf == null) {
            obj = "";
        } else {
            obj = valueOf.toString();
        }
        this.A0W = obj;
    }

    public final boolean A05() {
        Boolean bool = this.A0J;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public AnonymousClass442(LF6 lf6) {
        HashMap hashMap;
        this.A0F = C2EY.A1i;
        this.A0W = "";
        this.A0T = lf6.A0L;
        this.A0R = lf6.A0K;
        this.A0F = lf6.A0J;
        this.A0U = lf6.A0M;
        this.A0V = lf6.A0G;
        this.A0A = lf6.A07;
        this.A01 = null;
        this.A0B = lf6.A08;
        this.A0C = lf6.A09;
        this.A03 = lf6.A02;
        this.A04 = lf6.A03;
        this.A02 = lf6.A01;
        this.A08 = lf6.A06;
        this.A07 = lf6.A05;
        this.A0G = lf6.A0B;
        this.A0H = lf6.A0C;
        this.A0Q = lf6.A0F;
        this.A09 = null;
        this.A0Y = lf6.A0H;
        this.A00 = lf6.A00;
        this.A0E = lf6.A0A;
        this.A0I = null;
        this.A05 = lf6.A04;
        this.A0P = 0L;
        this.A0S = lf6.A0E;
        this.A0J = lf6.A0D;
        Map map = lf6.A0I;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        this.A0X = hashMap;
    }

    public AnonymousClass442() {
        this.A0F = C2EY.A1i;
        this.A0W = "";
    }
}
