package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168267fL {
    public static C168277fM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C168277fM c168277fM = new C168277fM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("anonymous_user_count".equals(A0q)) {
                    c168277fM.A0J = Integer.valueOf(c16l.A1D());
                } else if ("auto_expand_chaining".equals(A0q)) {
                    c168277fM.A08 = Boolean.valueOf(c16l.A0d());
                } else if ("big_list".equals(A0q)) {
                    c168277fM.A09 = Boolean.valueOf(c16l.A0d());
                } else {
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    String str = null;
                    ArrayList arrayList3 = null;
                    String str2 = null;
                    String str3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    String str4 = null;
                    ArrayList arrayList6 = null;
                    String str5 = null;
                    ArrayList arrayList7 = null;
                    if ("chaining_upsell_cards".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C66632UQj parseFromJson = VO4.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        c168277fM.A0c = arrayList2;
                    } else if ("disclaimer_text".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c168277fM.A0X = str;
                    } else if ("friend_requests".equals(A0q)) {
                        c168277fM.A01 = AbstractC225459xA.parseFromJson(c16l);
                    } else if ("global_blacklist_sample".equals(A0q)) {
                        c168277fM.A00 = AbstractC225419x6.parseFromJson(c16l);
                    } else if ("groups".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                E88 parseFromJson2 = AbstractC33743EvV.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList3.add(parseFromJson2);
                                }
                            }
                        }
                        c168277fM.A0d = arrayList3;
                    } else if ("has_chaining".equals(A0q)) {
                        c168277fM.A0A = Boolean.valueOf(c16l.A0d());
                    } else if ("has_more".equals(A0q)) {
                        c168277fM.A0j = c16l.A0d();
                    } else if ("has_stories".equals(A0q)) {
                        c168277fM.A0K = Integer.valueOf(c16l.A1D());
                    } else if ("hashtag_count".equals(A0q)) {
                        c168277fM.A0L = Integer.valueOf(c16l.A1D());
                    } else if ("is_recommend_account".equals(A0q)) {
                        c168277fM.A0B = Boolean.valueOf(c16l.A0d());
                    } else if ("media_info".equals(A0q)) {
                        c168277fM.A05 = C38321qM.A00(c16l);
                    } else if ("more_groups_available".equals(A0q)) {
                        c168277fM.A0C = Boolean.valueOf(c16l.A0d());
                    } else if ("next_max_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c168277fM.A0Y = str2;
                    } else if ("num_ci_friends".equals(A0q)) {
                        c168277fM.A0M = Integer.valueOf(c16l.A1D());
                    } else if ("num_fb_friends".equals(A0q)) {
                        c168277fM.A0N = Integer.valueOf(c16l.A1D());
                    } else if ("page_size".equals(A0q)) {
                        c168277fM.A0O = Integer.valueOf(c16l.A1D());
                    } else if ("page_token".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c168277fM.A0Z = str3;
                    } else if ("pending_admins".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator = User.CREATOR;
                                User A00 = AbstractC38851rI.A00(c16l, false);
                                if (A00 != null) {
                                    arrayList4.add(A00);
                                }
                            }
                        }
                        c168277fM.A0e = arrayList4;
                    } else if ("post_impression_count".equals(A0q)) {
                        c168277fM.A0P = Integer.valueOf(c16l.A1D());
                    } else if ("preview_hashtags".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                H6X parseFromJson3 = AbstractC40375HvN.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList5.add(parseFromJson3);
                                }
                            }
                        }
                        c168277fM.A0f = arrayList5;
                    } else if ("rank_token".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        c168277fM.A0a = str4;
                    } else if ("sections".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C211769a1 parseFromJson4 = AbstractC225469xB.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList6.add(parseFromJson4);
                                }
                            }
                        }
                        c168277fM.A0g = arrayList6;
                    } else if ("sequence_id".equals(A0q)) {
                        c168277fM.A0W = Long.valueOf(c16l.A0y());
                    } else if ("should_limit_list_of_followers".equals(A0q)) {
                        c168277fM.A0D = Boolean.valueOf(c16l.A0d());
                    } else if ("show_spam_follow_request_tab".equals(A0q)) {
                        c168277fM.A0E = Boolean.valueOf(c16l.A0d());
                    } else if ("spam_follower_is_nux".equals(A0q)) {
                        c168277fM.A0F = Boolean.valueOf(c16l.A0d());
                    } else if ("spam_follower_setting_enabled".equals(A0q)) {
                        c168277fM.A0G = Boolean.valueOf(c16l.A0d());
                    } else if ("spam_follower_setting_help_center_link".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        c168277fM.A0b = str5;
                    } else if ("special_empty_state".equals(A0q)) {
                        c168277fM.A02 = AbstractC33692Eug.parseFromJson(c16l);
                    } else if ("suggested_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList7 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                User A002 = AbstractC38851rI.A00(c16l, false);
                                if (A002 != null) {
                                    arrayList7.add(A002);
                                }
                            }
                        }
                        c168277fM.A0h = arrayList7;
                    } else if ("target_follower_count".equals(A0q)) {
                        c168277fM.A0Q = Integer.valueOf(c16l.A1D());
                    } else if ("target_following_count".equals(A0q)) {
                        c168277fM.A0R = Integer.valueOf(c16l.A1D());
                    } else if ("total_unique_viewer_count".equals(A0q)) {
                        c168277fM.A0S = Integer.valueOf(c16l.A1D());
                    } else if ("truncate_follow_requests_at_index".equals(A0q)) {
                        c168277fM.A0T = Integer.valueOf(c16l.A1D());
                    } else if ("truncate_users_at_index".equals(A0q)) {
                        c168277fM.A0U = Integer.valueOf(c16l.A1D());
                    } else if ("use_clickable_see_more".equals(A0q)) {
                        c168277fM.A0H = Boolean.valueOf(c16l.A0d());
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                        Parcelable.Creator creator3 = User.CREATOR;
                        c168277fM.A07 = AbstractC38851rI.A00(c16l, false);
                    } else if ("user_count".equals(A0q)) {
                        c168277fM.A0V = Integer.valueOf(c16l.A1D());
                    } else if ("user_has_hidden_groups".equals(A0q)) {
                        c168277fM.A0I = Boolean.valueOf(c16l.A0d());
                    } else if ("user_pay_info".equals(A0q)) {
                        c168277fM.A04 = AbstractC40438HwT.parseFromJson(c16l);
                    } else if ("user_story".equals(A0q)) {
                        c168277fM.A06 = AbstractC40710I2q.parseFromJson(c16l);
                    } else if ("users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator4 = User.CREATOR;
                                User A003 = AbstractC38851rI.A00(c16l, false);
                                if (A003 != null) {
                                    arrayList.add(A003);
                                }
                            }
                        }
                        c168277fM.A0i = arrayList;
                    } else {
                        C55702hA.A01(c16l, c168277fM, A0q);
                    }
                }
                c16l.A0z();
            }
            Integer num = c168277fM.A0J;
            Boolean bool = c168277fM.A08;
            Boolean bool2 = c168277fM.A09;
            List list = c168277fM.A0c;
            String str6 = c168277fM.A0X;
            C169397hD c169397hD = c168277fM.A01;
            C169417hF c169417hF = c168277fM.A00;
            List list2 = c168277fM.A0d;
            Boolean bool3 = c168277fM.A0A;
            boolean z = c168277fM.A0j;
            Integer num2 = c168277fM.A0K;
            Integer num3 = c168277fM.A0L;
            Boolean bool4 = c168277fM.A0B;
            C38321qM c38321qM = c168277fM.A05;
            Boolean bool5 = c168277fM.A0C;
            String str7 = c168277fM.A0Y;
            Integer num4 = c168277fM.A0M;
            Integer num5 = c168277fM.A0N;
            Integer num6 = c168277fM.A0O;
            String str8 = c168277fM.A0Z;
            List list3 = c168277fM.A0e;
            Integer num7 = c168277fM.A0P;
            List list4 = c168277fM.A0f;
            String str9 = c168277fM.A0a;
            List list5 = c168277fM.A0g;
            Long l = c168277fM.A0W;
            Boolean bool6 = c168277fM.A0D;
            Boolean bool7 = c168277fM.A0E;
            Boolean bool8 = c168277fM.A0F;
            Boolean bool9 = c168277fM.A0G;
            String str10 = c168277fM.A0b;
            GraphGuardianContentImpl graphGuardianContentImpl = c168277fM.A02;
            List list6 = c168277fM.A0h;
            Integer num8 = c168277fM.A0Q;
            Integer num9 = c168277fM.A0R;
            Integer num10 = c168277fM.A0S;
            Integer num11 = c168277fM.A0T;
            Integer num12 = c168277fM.A0U;
            Boolean bool10 = c168277fM.A0H;
            User user = c168277fM.A07;
            Integer num13 = c168277fM.A0V;
            c168277fM.A03 = new C168287fN(c169417hF, c169397hD, graphGuardianContentImpl, c168277fM.A04, c38321qM, c168277fM.A06, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, c168277fM.A0I, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, l, str6, str7, str8, str9, str10, list, list2, list3, list4, list5, list6, c168277fM.A0i, z);
            return c168277fM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
