package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81503kK {
    public static final DirectThreadThemeInfo A00(C16L c16l) {
        ImmutableMap copyOf;
        String A1P;
        String A1P2;
        Integer num;
        int i;
        String A1P3;
        String A1P4;
        try {
            DirectThreadThemeInfo directThreadThemeInfo = new DirectThreadThemeInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                if ("fallback_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0b = str2;
                } else if ("dark_fallback_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0M = str3;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    C14360o3.A0B(str4, 0);
                    directThreadThemeInfo.A0o = str4;
                } else if ("accessibility_label".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0f = str5;
                } else if ("gradient_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList.add(A1P4);
                            }
                        }
                    }
                    directThreadThemeInfo.A0s = arrayList;
                } else if ("dark_gradient_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList2.add(A1P3);
                            }
                        }
                    }
                    directThreadThemeInfo.A0q = arrayList2;
                } else if ("background_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0Z = str6;
                } else if ("dark_background_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0K = str7;
                } else if ("thread_view_mode".equals(A0q)) {
                    int A1D = c16l.A1D();
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            switch (num.intValue()) {
                                case 1:
                                    i = 2;
                                    break;
                                case 2:
                                    i = 3;
                                    break;
                                default:
                                    i = 1;
                                    break;
                            }
                            if (i != A1D) {
                                i2++;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    }
                    directThreadThemeInfo.A0A = num;
                } else if ("light_large_background_image_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0l = str8;
                } else if ("dark_large_background_image_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0i = str9;
                } else if ("accessibility_label_id".equals(A0q)) {
                    directThreadThemeInfo.A00 = c16l.A1D();
                } else if ("composer_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0a = str10;
                } else if ("dark_composer_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str11 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0L = str11;
                } else if ("light_theme_background_drawable_resource_id".equals(A0q)) {
                    directThreadThemeInfo.A06 = c16l.A1D();
                } else if ("dark_theme_background_drawable_resource_id".equals(A0q)) {
                    directThreadThemeInfo.A02 = c16l.A1D();
                } else if ("light_preview_icon_drawable_resource_id".equals(A0q)) {
                    directThreadThemeInfo.A07 = c16l.A1D();
                } else if ("dark_preview_icon_drawable_resource_id".equals(A0q)) {
                    directThreadThemeInfo.A03 = c16l.A1D();
                } else if ("light_preview_icon_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0n = str12;
                } else if ("dark_preview_icon_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str13 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0j = str13;
                } else if ("light_background_preview_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str14 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0m = str14;
                } else if ("dark_background_preview_uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str15 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0h = str15;
                } else if ("light_theme_incoming_message_bubble_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str16 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0c = str16;
                } else if ("dark_theme_incoming_message_bubble_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str17 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0N = str17;
                } else if ("bubble_border_width".equals(A0q)) {
                    directThreadThemeInfo.A01 = c16l.A1D();
                } else if ("ungroupable_bubble_corner_radius".equals(A0q)) {
                    directThreadThemeInfo.A08 = c16l.A1D();
                } else if ("groupable_bubble_corner_radius".equals(A0q)) {
                    directThreadThemeInfo.A05 = c16l.A1D();
                } else if ("light_theme_nav_bar_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str18 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0d = str18;
                } else if ("dark_theme_nav_bar_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str19 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0O = str19;
                } else if ("light_theme_nav_bar_subtitle_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str20 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0e = str20;
                } else if ("dark_theme_nav_bar_subtitle_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str21 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0P = str21;
                } else if ("light_primary_text_message_from_me_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str22 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0Y = str22;
                } else if ("dark_primary_text_message_from_me_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str23 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0J = str23;
                } else if ("light_composer_border_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str24 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0S = str24;
                } else if ("dark_composer_border_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str25 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0D = str25;
                } else if ("light_composer_icon_background_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList3.add(A1P2);
                            }
                        }
                    }
                    directThreadThemeInfo.A0r = arrayList3;
                } else if ("dark_composer_icon_background_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList4.add(A1P);
                            }
                        }
                    }
                    directThreadThemeInfo.A0p = arrayList4;
                } else if ("light_composer_icon_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str26 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0T = str26;
                } else if ("dark_composer_icon_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str27 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0E = str27;
                } else if ("light_action_bar_badge_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str28 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0Q = str28;
                } else if ("dark_action_bar_badge_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str29 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0B = str29;
                } else if ("light_message_attribution_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str30 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0V = str30;
                } else if ("dark_message_attribution_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str31 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0G = str31;
                } else if ("light_message_context_line_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str32 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0W = str32;
                } else if ("dark_message_context_line_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str33 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0H = str33;
                } else if ("extra_theme_info".equals(A0q)) {
                    directThreadThemeInfo.A04 = c16l.A1D();
                } else if ("extra_theme_info_string".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str34 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0k = str34;
                } else if ("light_primary_button_text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str35 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0X = str35;
                } else if ("dark_primary_button_text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str36 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0I = str36;
                } else if ("force_dark_naviation_bar".equals(A0q)) {
                    directThreadThemeInfo.A0t = c16l.A0d();
                } else if ("light_input_placeholder_text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str37 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0U = str37;
                } else if ("dark_input_placeholder_text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str38 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0F = str38;
                } else if ("custom_background_drawable_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str39 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0g = str39;
                } else if ("light_bottom_gradient_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str40 = c16l.A1P();
                    }
                    directThreadThemeInfo.A0R = str40;
                } else if ("dark_bottom_gradient_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    directThreadThemeInfo.A0C = str;
                }
                c16l.A0z();
            }
            if (!(c16l instanceof C07950bF)) {
                C0w9.A03("direct_theme_info_missing_session", "DirectThreadThemeInfo JSON needs to be parsed using SessionAwareJsonParser");
            } else {
                UserSession userSession = ((C07950bF) c16l).A01;
                boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36314558373104319L);
                directThreadThemeInfo.A0u = A06;
                if (!A06) {
                    C14360o3.A0B(userSession, 0);
                    String A04 = C18U.A04(C06090Tz.A05, userSession, 36875721620193355L);
                    if (C14360o3.A0K(AbstractC47901LDv.A02, A04)) {
                        copyOf = AbstractC47901LDv.A00;
                    } else {
                        AbstractC47901LDv.A02 = A04;
                        HashMap hashMap = new HashMap();
                        List A0R = AbstractC001900j.A0R(A04, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : A0R) {
                            if (AbstractC125795mU.A00.get(obj) != null) {
                                arrayList5.add(obj);
                            }
                        }
                        for (Object obj2 : arrayList5) {
                            Object obj3 = AbstractC125795mU.A00.get(obj2);
                            if (obj3 != null) {
                                hashMap.put(obj2, obj3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        copyOf = ImmutableMap.copyOf((Map) hashMap);
                        AbstractC47901LDv.A00 = copyOf;
                    }
                    DirectThreadThemeInfo directThreadThemeInfo2 = (DirectThreadThemeInfo) copyOf.get(directThreadThemeInfo.A0o);
                    if (directThreadThemeInfo2 == null) {
                        directThreadThemeInfo2 = AbstractC125795mU.A00();
                        C14360o3.A07(directThreadThemeInfo2);
                    }
                    directThreadThemeInfo.A0o = directThreadThemeInfo2.A0o;
                    if (directThreadThemeInfo.A0b == null) {
                        directThreadThemeInfo.A0b = directThreadThemeInfo2.A0b;
                    }
                    if (directThreadThemeInfo.A0M == null) {
                        directThreadThemeInfo.A0M = directThreadThemeInfo2.A0M;
                    }
                    if (directThreadThemeInfo.A0s == null) {
                        directThreadThemeInfo.A0s = directThreadThemeInfo2.A0s;
                    }
                    if (directThreadThemeInfo.A0q == null) {
                        directThreadThemeInfo.A0q = directThreadThemeInfo2.A0q;
                    }
                    if (directThreadThemeInfo.A0A == null) {
                        directThreadThemeInfo.A0A = directThreadThemeInfo2.A0A;
                    }
                    if (directThreadThemeInfo.A0l == null) {
                        directThreadThemeInfo.A0l = directThreadThemeInfo2.A0l;
                    }
                    if (directThreadThemeInfo.A0i == null) {
                        directThreadThemeInfo.A0i = directThreadThemeInfo2.A0i;
                    }
                    if (directThreadThemeInfo.A0c == null) {
                        directThreadThemeInfo.A0c = directThreadThemeInfo2.A0c;
                    }
                    if (directThreadThemeInfo.A0N == null) {
                        directThreadThemeInfo.A0N = directThreadThemeInfo2.A0N;
                    }
                    if (directThreadThemeInfo.A0a == null) {
                        directThreadThemeInfo.A0a = directThreadThemeInfo2.A0a;
                    }
                    if (directThreadThemeInfo.A0L == null) {
                        directThreadThemeInfo.A0L = directThreadThemeInfo2.A0L;
                    }
                    if (directThreadThemeInfo.A0d == null) {
                        directThreadThemeInfo.A0d = directThreadThemeInfo2.A0d;
                    }
                    if (directThreadThemeInfo.A0O == null) {
                        directThreadThemeInfo.A0O = directThreadThemeInfo2.A0O;
                    }
                    if (directThreadThemeInfo.A0e == null) {
                        directThreadThemeInfo.A0e = directThreadThemeInfo2.A0e;
                    }
                    if (directThreadThemeInfo.A0P == null) {
                        directThreadThemeInfo.A0P = directThreadThemeInfo2.A0P;
                    }
                    if (directThreadThemeInfo.A0Z == null) {
                        directThreadThemeInfo.A0Z = directThreadThemeInfo2.A0Z;
                    }
                    if (directThreadThemeInfo.A0K == null) {
                        directThreadThemeInfo.A0K = directThreadThemeInfo2.A0K;
                    }
                    if (directThreadThemeInfo.A0Y == null) {
                        directThreadThemeInfo.A0Y = directThreadThemeInfo2.A0Y;
                    }
                    if (directThreadThemeInfo.A0J == null) {
                        directThreadThemeInfo.A0J = directThreadThemeInfo2.A0J;
                    }
                    if (directThreadThemeInfo.A0S == null) {
                        directThreadThemeInfo.A0S = directThreadThemeInfo2.A0S;
                    }
                    if (directThreadThemeInfo.A0D == null) {
                        directThreadThemeInfo.A0D = directThreadThemeInfo2.A0D;
                    }
                    if (directThreadThemeInfo.A0n == null) {
                        directThreadThemeInfo.A0n = directThreadThemeInfo2.A0n;
                    }
                    if (directThreadThemeInfo.A0j == null) {
                        directThreadThemeInfo.A0j = directThreadThemeInfo2.A0j;
                    }
                    directThreadThemeInfo.A08 = directThreadThemeInfo2.A08;
                    directThreadThemeInfo.A05 = directThreadThemeInfo2.A05;
                    directThreadThemeInfo.A01 = directThreadThemeInfo2.A01;
                    directThreadThemeInfo.A02 = directThreadThemeInfo2.A02;
                    directThreadThemeInfo.A06 = directThreadThemeInfo2.A06;
                    directThreadThemeInfo.A07 = directThreadThemeInfo2.A07;
                    directThreadThemeInfo.A03 = directThreadThemeInfo2.A03;
                    directThreadThemeInfo.A00 = directThreadThemeInfo2.A00;
                    directThreadThemeInfo.A0f = directThreadThemeInfo2.A0f;
                    directThreadThemeInfo.A0Q = directThreadThemeInfo2.A0Q;
                    directThreadThemeInfo.A0B = directThreadThemeInfo2.A0B;
                    directThreadThemeInfo.A0r = directThreadThemeInfo2.A0r;
                    directThreadThemeInfo.A0p = directThreadThemeInfo2.A0p;
                    directThreadThemeInfo.A0T = directThreadThemeInfo2.A0T;
                    directThreadThemeInfo.A0E = directThreadThemeInfo2.A0E;
                    directThreadThemeInfo.A0V = directThreadThemeInfo2.A0V;
                    directThreadThemeInfo.A0G = directThreadThemeInfo2.A0G;
                    directThreadThemeInfo.A0W = directThreadThemeInfo2.A0W;
                    directThreadThemeInfo.A0H = directThreadThemeInfo2.A0H;
                    directThreadThemeInfo.A09 = directThreadThemeInfo2.A09;
                    directThreadThemeInfo.A04 = directThreadThemeInfo2.A04;
                    directThreadThemeInfo.A0k = directThreadThemeInfo2.A0k;
                    directThreadThemeInfo.A0X = directThreadThemeInfo2.A0X;
                    directThreadThemeInfo.A0I = directThreadThemeInfo2.A0I;
                    directThreadThemeInfo.A0t = directThreadThemeInfo2.A0t;
                    directThreadThemeInfo.A0U = directThreadThemeInfo2.A0U;
                    directThreadThemeInfo.A0F = directThreadThemeInfo2.A0F;
                    return directThreadThemeInfo;
                }
            }
            return directThreadThemeInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
