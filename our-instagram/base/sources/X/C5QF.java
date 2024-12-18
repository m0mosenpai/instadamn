package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5QF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QF {
    public static C5QG parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            C5QG c5qg = new C5QG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str11 = null;
                String str12 = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    C14360o3.A0B(str3, 0);
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (1 - num.intValue() != 0) {
                                str = "text";
                            } else {
                                str = "sticker";
                            }
                            if (str.equals(str3)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    c5qg.A0A = num;
                } else if ("sticker_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c5qg.A0I = str4;
                } else if ("sticker_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c5qg.A0H = str5;
                } else if ("start".equals(A0q)) {
                    c5qg.A01 = c16l.A1D();
                } else if ("end".equals(A0q)) {
                    c5qg.A00 = c16l.A1D();
                } else if ("x".equals(A0q)) {
                    c5qg.A05 = new Float(c16l.A0U());
                } else if ("y".equals(A0q)) {
                    c5qg.A06 = new Float(c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c5qg.A09 = new Float(c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c5qg.A04 = new Float(c16l.A0U());
                } else if ("rotation".equals(A0q)) {
                    c5qg.A07 = new Float(c16l.A0U());
                } else if ("scale".equals(A0q)) {
                    c5qg.A08 = new Float(c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    c5qg.A0B = Integer.valueOf(c16l.A1D());
                } else if ("is_text_to_speech_enabled".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    boolean z = false;
                    if (A1Q != null && A1Q.equalsIgnoreCase(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        z = true;
                    }
                    c5qg.A0P = z;
                } else if ("voice_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c5qg.A0K = str6;
                } else if ("voice_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    c5qg.A0L = str7;
                } else if ("shortwave_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    c5qg.A0G = str8;
                } else if ("is_outside_suggested_margins".equals(A0q)) {
                    c5qg.A03 = Boolean.valueOf(c16l.A0d());
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    c5qg.A0J = str9;
                } else if ("reusable_text_info".equals(A0q)) {
                    c5qg.A02 = AbstractC93044Fd.parseFromJson(c16l);
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    c5qg.A0E = str10;
                } else if ("effects".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList.add(A1P2);
                            }
                        }
                    }
                    c5qg.A0N = arrayList;
                } else if ("colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList2.add(A1P);
                            }
                        }
                    }
                    c5qg.A0M = arrayList2;
                } else if ("alignment".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str11 = c16l.A1P();
                    }
                    c5qg.A0C = str11;
                } else if ("animation".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    c5qg.A0D = str12;
                } else if ("graphic_effect".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c5qg.A0F = str2;
                } else if ("is_spinnable".equals(A0q)) {
                    c5qg.A0O = c16l.A0d();
                }
                c16l.A0z();
            }
            return c5qg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5QG c5qg) {
        String str;
        String str2;
        anonymousClass182.A0d();
        Integer num = c5qg.A0A;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str2 = "text";
            } else {
                str2 = "sticker";
            }
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        }
        String str3 = c5qg.A0I;
        if (str3 != null) {
            anonymousClass182.A0S("sticker_type", str3);
        }
        String str4 = c5qg.A0H;
        if (str4 != null) {
            anonymousClass182.A0S("sticker_id", str4);
        }
        anonymousClass182.A0Q("start", c5qg.A01);
        anonymousClass182.A0Q("end", c5qg.A00);
        Float f = c5qg.A05;
        if (f != null) {
            anonymousClass182.A0P("x", f.floatValue());
        }
        Float f2 = c5qg.A06;
        if (f2 != null) {
            anonymousClass182.A0P("y", f2.floatValue());
        }
        Float f3 = c5qg.A09;
        if (f3 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
        }
        Float f4 = c5qg.A04;
        if (f4 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f4.floatValue());
        }
        Float f5 = c5qg.A07;
        if (f5 != null) {
            anonymousClass182.A0P("rotation", f5.floatValue());
        }
        Float f6 = c5qg.A08;
        if (f6 != null) {
            anonymousClass182.A0P("scale", f6.floatValue());
        }
        Integer num2 = c5qg.A0B;
        if (num2 != null) {
            anonymousClass182.A0Q("z_index", num2.intValue());
        }
        if (c5qg.A0P) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        anonymousClass182.A0S("is_text_to_speech_enabled", str);
        String str5 = c5qg.A0K;
        if (str5 != null) {
            anonymousClass182.A0S("voice_id", str5);
        }
        String str6 = c5qg.A0L;
        if (str6 != null) {
            anonymousClass182.A0S("voice_name", str6);
        }
        String str7 = c5qg.A0G;
        if (str7 != null) {
            anonymousClass182.A0S("shortwave_id", str7);
        }
        Boolean bool = c5qg.A03;
        if (bool != null) {
            anonymousClass182.A0T("is_outside_suggested_margins", bool.booleanValue());
        }
        String str8 = c5qg.A0J;
        if (str8 != null) {
            anonymousClass182.A0S("text", str8);
        }
        if (c5qg.A02 != null) {
            anonymousClass182.A0r("reusable_text_info");
            AbstractC93044Fd.A00(anonymousClass182, c5qg.A02);
        }
        String str9 = c5qg.A0E;
        if (str9 != null) {
            anonymousClass182.A0S("format_type", str9);
        }
        if (c5qg.A0N != null) {
            C16V.A03(anonymousClass182, "effects");
            for (String str10 : c5qg.A0N) {
                if (str10 != null) {
                    anonymousClass182.A0u(str10);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c5qg.A0M != null) {
            C16V.A03(anonymousClass182, "colors");
            for (String str11 : c5qg.A0M) {
                if (str11 != null) {
                    anonymousClass182.A0u(str11);
                }
            }
            anonymousClass182.A0Z();
        }
        String str12 = c5qg.A0C;
        if (str12 != null) {
            anonymousClass182.A0S("alignment", str12);
        }
        String str13 = c5qg.A0D;
        if (str13 != null) {
            anonymousClass182.A0S("animation", str13);
        }
        String str14 = c5qg.A0F;
        if (str14 != null) {
            anonymousClass182.A0S("graphic_effect", str14);
        }
        anonymousClass182.A0T("is_spinnable", c5qg.A0O);
        anonymousClass182.A0a();
    }
}
