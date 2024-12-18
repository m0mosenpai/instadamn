package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Ibn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41655Ibn {
    public static C105824pt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C105824pt c105824pt = new C105824pt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                HashSet hashSet = null;
                ArrayList arrayList3 = null;
                if (!AbstractC37301Gc2.A1V(c16l, A0q) && !TraceFieldType.BroadcastId.equals(A0q)) {
                    if ("broadcast_experiments".equals(A0q)) {
                        c105824pt.A02 = AbstractC108564uh.parseFromJson(c16l);
                    } else if ("cover_frame_url".equals(A0q)) {
                        c105824pt.A05 = AbstractC222616c.A00(c16l);
                    } else if ("dash_playback_url".equals(A0q)) {
                        c105824pt.A0b = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(202).equals(A0q)) {
                        c105824pt.A0Z = AbstractC167017dG.A0m(c16l);
                    } else if ("dash_manifest".equals(A0q)) {
                        c105824pt.A0a = AbstractC167017dG.A0m(c16l);
                    } else if ("progressive_playback_url".equals(A0q)) {
                        c105824pt.A0i = AbstractC167017dG.A0m(c16l);
                    } else if ("dimensions".equals(A0q)) {
                        c105824pt.A08 = I2N.parseFromJson(c16l);
                    } else if ("broadcast_owner".equals(A0q)) {
                        c105824pt.A09 = AbstractC31171DnF.A0S(c16l, false);
                    } else if ("viewer_count".equals(A0q)) {
                        c105824pt.A0R = AbstractC166997dE.A0h(c16l);
                    } else if (AbstractC111324zv.A00(557).equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList2);
                            }
                        }
                        c105824pt.A0m = arrayList2;
                    } else if (AbstractC111324zv.A00(546).equals(A0q)) {
                        c105824pt.A0Q = AbstractC166997dE.A0h(c16l);
                    } else if ("published_time".equals(A0q)) {
                        c105824pt.A0T = AbstractC31173DnH.A0h(c16l);
                    } else if ("expire_at".equals(A0q)) {
                        c105824pt.A0S = AbstractC31173DnH.A0h(c16l);
                    } else if ("muted".equals(A0q)) {
                        c105824pt.A0L = AbstractC166997dE.A0d(c16l);
                    } else if (AbstractC37300Gc1.A1J(A0q)) {
                        c105824pt.A0e = AbstractC167017dG.A0m(c16l);
                    } else if ("broadcast_status".equals(A0q)) {
                        c105824pt.A06 = AbstractC109124vc.A00(c16l.A1Q());
                    } else if ("ranked_position".equals(A0q)) {
                        c105824pt.A0V = AbstractC31173DnH.A0h(c16l);
                    } else if ("seen_ranked_position".equals(A0q)) {
                        c105824pt.A0W = AbstractC31173DnH.A0h(c16l);
                    } else if ("organic_tracking_token".equals(A0q)) {
                        c105824pt.A0h = AbstractC167017dG.A0m(c16l);
                    } else if ("encoding_tag".equals(A0q)) {
                        c105824pt.A0c = AbstractC167017dG.A0m(c16l);
                    } else if ("cobroadcasters".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = AbstractC166987dD.A1H();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, hashSet);
                            }
                        }
                        c105824pt.A0n = hashSet;
                    } else if ("question_pk".equals(A0q)) {
                        c105824pt.A0U = AbstractC31173DnH.A0h(c16l);
                    } else if ("simulcast_fb_broadcast_id".equals(A0q)) {
                        c105824pt.A0j = AbstractC167017dG.A0m(c16l);
                    } else if ("internal_only".equals(A0q)) {
                        c105824pt.A0C = AbstractC166997dE.A0d(c16l);
                    } else if ("visibility".equals(A0q)) {
                        c105824pt.A0A = AbstractC109134vd.A00(c16l.A1D());
                    } else if ("number_of_qualities".equals(A0q)) {
                        c105824pt.A0P = AbstractC166997dE.A0h(c16l);
                    } else if ("copyright_violation".equals(A0q)) {
                        c105824pt.A0B = AbstractC166997dE.A0d(c16l);
                    } else if ("is_scheduled_live".equals(A0q)) {
                        c105824pt.A0I = AbstractC166997dE.A0d(c16l);
                    } else if ("is_exclusive_live".equals(A0q)) {
                        c105824pt.A0F = AbstractC166997dE.A0d(c16l);
                    } else if (AbstractC111324zv.A00(227).equals(A0q)) {
                        c105824pt.A0H = AbstractC166997dE.A0d(c16l);
                    } else if ("hide_from_feed_unit".equals(A0q)) {
                        c105824pt.A0E = AbstractC166997dE.A0d(c16l);
                    } else if ("preview".equals(A0q)) {
                        c105824pt.A0g = AbstractC167017dG.A0m(c16l);
                    } else if ("media_overlay_info".equals(A0q)) {
                        c105824pt.A04 = AbstractC109074vW.parseFromJson(c16l);
                    } else if ("charity_info".equals(A0q)) {
                        c105824pt.A01 = AbstractC69864Vwp.parseFromJson(c16l);
                    } else if ("user_pay_viewer_config".equals(A0q)) {
                        c105824pt.A03 = AbstractC109684wu.parseFromJson(c16l);
                    } else if ("broadcast_message".equals(A0q)) {
                        c105824pt.A0Y = AbstractC167017dG.A0m(c16l);
                    } else if ("igtv_post_id".equals(A0q)) {
                        c105824pt.A0d = AbstractC167017dG.A0m(c16l);
                    } else if ("sponsor_tags".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C102184io parseFromJson = AbstractC102174in.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList3.add(parseFromJson);
                                }
                            }
                        }
                        c105824pt.A0l = arrayList3;
                    } else if (MSV.A00(55).equals(A0q)) {
                        c105824pt.A0K = AbstractC166997dE.A0d(c16l);
                    } else if ("affiliate_info".equals(A0q)) {
                        c105824pt.A00 = AbstractC41241INh.parseFromJson(c16l);
                    } else if ("chat_info".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                H45 parseFromJson2 = IOQ.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c105824pt.A0k = arrayList;
                    } else if ("show_bff_upsell".equals(A0q)) {
                        c105824pt.A0M = AbstractC166997dE.A0d(c16l);
                    } else if (MSV.A00(47).equals(A0q)) {
                        c105824pt.A0D = AbstractC166997dE.A0d(c16l);
                    } else if ("sup_active".equals(A0q)) {
                        c105824pt.A0J = AbstractC166997dE.A0d(c16l);
                    } else if ("index_position_in_response".equals(A0q)) {
                        c105824pt.A0O = AbstractC166997dE.A0h(c16l);
                    } else {
                        C55702hA.A01(c16l, c105824pt, A0q);
                    }
                } else {
                    c105824pt.A0X = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c105824pt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C105824pt c105824pt) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1D(anonymousClass182, c105824pt.A0X);
        if (c105824pt.A02 != null) {
            anonymousClass182.A0r("broadcast_experiments");
            AbstractC108564uh.A00(anonymousClass182, c105824pt.A02);
        }
        if (c105824pt.A05 != null) {
            anonymousClass182.A0r("cover_frame_url");
            AbstractC222616c.A01(anonymousClass182, c105824pt.A05);
        }
        String str = c105824pt.A0b;
        if (str != null) {
            anonymousClass182.A0S("dash_playback_url", str);
        }
        String str2 = c105824pt.A0Z;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(202), str2);
        }
        String str3 = c105824pt.A0a;
        if (str3 != null) {
            anonymousClass182.A0S("dash_manifest", str3);
        }
        String str4 = c105824pt.A0i;
        if (str4 != null) {
            anonymousClass182.A0S("progressive_playback_url", str4);
        }
        if (c105824pt.A08 != null) {
            anonymousClass182.A0r("dimensions");
            C41022IEr c41022IEr = c105824pt.A08;
            anonymousClass182.A0d();
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c41022IEr.A00);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c41022IEr.A01);
            anonymousClass182.A0a();
        }
        if (c105824pt.A09 != null) {
            anonymousClass182.A0r("broadcast_owner");
            User user = c105824pt.A09;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        Integer num = c105824pt.A0R;
        if (num != null) {
            anonymousClass182.A0Q("viewer_count", num.intValue());
        }
        if (c105824pt.A0m != null) {
            C16V.A03(anonymousClass182, AbstractC111324zv.A00(557));
            Iterator it = c105824pt.A0m.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        Integer num2 = c105824pt.A0Q;
        if (num2 != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(546), num2.intValue());
        }
        Long l = c105824pt.A0T;
        if (l != null) {
            anonymousClass182.A0R("published_time", l.longValue());
        }
        Long l2 = c105824pt.A0S;
        if (l2 != null) {
            anonymousClass182.A0R("expire_at", l2.longValue());
        }
        Boolean bool = c105824pt.A0L;
        if (bool != null) {
            anonymousClass182.A0T("muted", bool.booleanValue());
        }
        String str5 = c105824pt.A0e;
        if (str5 != null) {
            anonymousClass182.A0S("media_id", str5);
        }
        EnumC109104va enumC109104va = c105824pt.A06;
        if (enumC109104va != null) {
            anonymousClass182.A0S("broadcast_status", enumC109104va.toString());
        }
        Long l3 = c105824pt.A0V;
        if (l3 != null) {
            anonymousClass182.A0R("ranked_position", l3.longValue());
        }
        Long l4 = c105824pt.A0W;
        if (l4 != null) {
            anonymousClass182.A0R("seen_ranked_position", l4.longValue());
        }
        String str6 = c105824pt.A0h;
        if (str6 != null) {
            anonymousClass182.A0S("organic_tracking_token", str6);
        }
        String str7 = c105824pt.A0c;
        if (str7 != null) {
            anonymousClass182.A0S("encoding_tag", str7);
        }
        if (c105824pt.A0n != null) {
            C16V.A03(anonymousClass182, "cobroadcasters");
            Iterator it2 = c105824pt.A0n.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        Long l5 = c105824pt.A0U;
        if (l5 != null) {
            anonymousClass182.A0R("question_pk", l5.longValue());
        }
        String str8 = c105824pt.A0j;
        if (str8 != null) {
            anonymousClass182.A0S("simulcast_fb_broadcast_id", str8);
        }
        Boolean bool2 = c105824pt.A0C;
        if (bool2 != null) {
            anonymousClass182.A0T("internal_only", bool2.booleanValue());
        }
        C3PO c3po = c105824pt.A0A;
        if (c3po != null) {
            anonymousClass182.A0Q("visibility", c3po.A00.intValue());
        }
        Integer num3 = c105824pt.A0P;
        if (num3 != null) {
            anonymousClass182.A0Q("number_of_qualities", num3.intValue());
        }
        Boolean bool3 = c105824pt.A0B;
        if (bool3 != null) {
            anonymousClass182.A0T("copyright_violation", bool3.booleanValue());
        }
        Boolean bool4 = c105824pt.A0I;
        if (bool4 != null) {
            anonymousClass182.A0T("is_scheduled_live", bool4.booleanValue());
        }
        Boolean bool5 = c105824pt.A0F;
        if (bool5 != null) {
            anonymousClass182.A0T("is_exclusive_live", bool5.booleanValue());
        }
        Boolean bool6 = c105824pt.A0H;
        if (bool6 != null) {
            anonymousClass182.A0T(AbstractC111324zv.A00(227), bool6.booleanValue());
        }
        Boolean bool7 = c105824pt.A0E;
        if (bool7 != null) {
            anonymousClass182.A0T("hide_from_feed_unit", bool7.booleanValue());
        }
        String str9 = c105824pt.A0g;
        if (str9 != null) {
            anonymousClass182.A0S("preview", str9);
        }
        if (c105824pt.A04 != null) {
            anonymousClass182.A0r("media_overlay_info");
            AbstractC109074vW.A00(anonymousClass182, c105824pt.A04);
        }
        if (c105824pt.A01 != null) {
            anonymousClass182.A0r("charity_info");
            AbstractC69864Vwp.A00(anonymousClass182, c105824pt.A01);
        }
        if (c105824pt.A03 != null) {
            anonymousClass182.A0r("user_pay_viewer_config");
            AbstractC109684wu.A00(anonymousClass182, c105824pt.A03);
        }
        String str10 = c105824pt.A0Y;
        if (str10 != null) {
            anonymousClass182.A0S("broadcast_message", str10);
        }
        String str11 = c105824pt.A0d;
        if (str11 != null) {
            anonymousClass182.A0S("igtv_post_id", str11);
        }
        if (c105824pt.A0l != null) {
            C16V.A03(anonymousClass182, "sponsor_tags");
            for (C102184io c102184io : c105824pt.A0l) {
                if (c102184io != null) {
                    AbstractC102174in.A00(anonymousClass182, c102184io);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool8 = c105824pt.A0K;
        if (bool8 != null) {
            anonymousClass182.A0T(MSV.A00(55), bool8.booleanValue());
        }
        if (c105824pt.A00 != null) {
            anonymousClass182.A0r("affiliate_info");
            AbstractC41241INh.A00(anonymousClass182, c105824pt.A00);
        }
        if (c105824pt.A0k != null) {
            C16V.A03(anonymousClass182, "chat_info");
            for (H45 h45 : c105824pt.A0k) {
                if (h45 != null) {
                    IOQ.A00(anonymousClass182, h45);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool9 = c105824pt.A0M;
        if (bool9 != null) {
            anonymousClass182.A0T("show_bff_upsell", bool9.booleanValue());
        }
        Boolean bool10 = c105824pt.A0D;
        if (bool10 != null) {
            anonymousClass182.A0T(MSV.A00(47), bool10.booleanValue());
        }
        Boolean bool11 = c105824pt.A0J;
        if (bool11 != null) {
            anonymousClass182.A0T("sup_active", bool11.booleanValue());
        }
        Integer num4 = c105824pt.A0O;
        if (num4 != null) {
            anonymousClass182.A0Q("index_position_in_response", num4.intValue());
        }
        C55702hA.A00(anonymousClass182, c105824pt);
        anonymousClass182.A0a();
    }
}
