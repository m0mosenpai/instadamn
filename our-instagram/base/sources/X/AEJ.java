package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEJ {
    public static AGS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AGS ags = new AGS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("x".equals(A0s)) {
                    ags.A09 = AbstractC167007dF.A0a(c16l);
                } else if ("y".equals(A0s)) {
                    ags.A0A = AbstractC167007dF.A0a(c16l);
                } else if ("z".equals(A0s)) {
                    ags.A0F = AbstractC166997dE.A0h(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    ags.A08 = AbstractC167007dF.A0a(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    ags.A06 = AbstractC167007dF.A0a(c16l);
                } else if ("rotation".equals(A0s)) {
                    ags.A07 = AbstractC167007dF.A0a(c16l);
                } else if ("metadata".equals(A0s)) {
                    ags.A01 = AbstractC22748A1s.parseFromJson(c16l);
                } else if ("product_type".equals(A0s)) {
                    ags.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("is_pinned".equals(A0s)) {
                    ags.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("duration".equals(A0s)) {
                    ags.A05 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC111324zv.A00(1099).equals(A0s)) {
                    ags.A0I = AbstractC167017dG.A0m(c16l);
                } else if ("is_immersive".equals(A0s)) {
                    ags.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("tap_state".equals(A0s)) {
                    ags.A0D = AbstractC166997dE.A0h(c16l);
                } else if ("media_id".equals(A0s)) {
                    ags.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("end_time_ms".equals(A0s)) {
                    ags.A0B = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(539).equals(A0s)) {
                    ags.A0M = AbstractC167017dG.A0m(c16l);
                } else if ("start_time_ms".equals(A0s)) {
                    ags.A0C = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(182).equals(A0s)) {
                    ags.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("trimmed_from_start".equals(A0s)) {
                    ags.A0E = AbstractC166997dE.A0h(c16l);
                } else if ("is_archive".equals(A0s)) {
                    ags.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("sticker_id".equals(A0s)) {
                    ags.A0K = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    ags.A0L = AbstractC167017dG.A0m(c16l);
                } else if ("media_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    EnumC222909sV enumC222909sV = (EnumC222909sV) EnumC222909sV.A01.get(A0m);
                    if (enumC222909sV == null) {
                        enumC222909sV = EnumC222909sV.A06;
                    }
                    ags.A00 = enumC222909sV;
                }
                c16l.A0z();
            }
            return ags;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AGS ags) {
        anonymousClass182.A0d();
        Float f = ags.A09;
        if (f != null) {
            anonymousClass182.A0P("x", f.floatValue());
        }
        Float f2 = ags.A0A;
        if (f2 != null) {
            anonymousClass182.A0P("y", f2.floatValue());
        }
        Integer num = ags.A0F;
        if (num != null) {
            anonymousClass182.A0Q("z", num.intValue());
        }
        Float f3 = ags.A08;
        if (f3 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
        }
        Float f4 = ags.A06;
        if (f4 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f4.floatValue());
        }
        Float f5 = ags.A07;
        if (f5 != null) {
            anonymousClass182.A0P("rotation", f5.floatValue());
        }
        if (ags.A01 != null) {
            anonymousClass182.A0r("metadata");
            AGG agg = ags.A01;
            anonymousClass182.A0d();
            Float f6 = agg.A01;
            if (f6 != null) {
                anonymousClass182.A0P("input_width", f6.floatValue());
            }
            Float f7 = agg.A00;
            if (f7 != null) {
                anonymousClass182.A0P("input_height", f7.floatValue());
            }
            String str = agg.A03;
            if (str != null) {
                anonymousClass182.A0S("giphy_uri", str);
            }
            Integer num2 = agg.A02;
            if (num2 != null) {
                anonymousClass182.A0Q(AbstractC111324zv.A00(133), num2.intValue());
            }
            String str2 = agg.A04;
            if (str2 != null) {
                anonymousClass182.A0S("ui_version", str2);
            }
            anonymousClass182.A0a();
        }
        String str3 = ags.A0J;
        if (str3 != null) {
            anonymousClass182.A0S("product_type", str3);
        }
        Boolean bool = ags.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_pinned", bool.booleanValue());
        }
        Float f8 = ags.A05;
        if (f8 != null) {
            anonymousClass182.A0P("duration", f8.floatValue());
        }
        String str4 = ags.A0I;
        if (str4 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(1099), str4);
        }
        Boolean bool2 = ags.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("is_immersive", bool2.booleanValue());
        }
        Integer num3 = ags.A0D;
        if (num3 != null) {
            anonymousClass182.A0Q("tap_state", num3.intValue());
        }
        String str5 = ags.A0H;
        if (str5 != null) {
            anonymousClass182.A0S("media_id", str5);
        }
        Integer num4 = ags.A0B;
        if (num4 != null) {
            anonymousClass182.A0Q("end_time_ms", num4.intValue());
        }
        String str6 = ags.A0M;
        if (str6 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(539), str6);
        }
        Integer num5 = ags.A0C;
        if (num5 != null) {
            anonymousClass182.A0Q("start_time_ms", num5.intValue());
        }
        String str7 = ags.A0G;
        if (str7 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(182), str7);
        }
        Integer num6 = ags.A0E;
        if (num6 != null) {
            anonymousClass182.A0Q("trimmed_from_start", num6.intValue());
        }
        Boolean bool3 = ags.A02;
        if (bool3 != null) {
            anonymousClass182.A0T("is_archive", bool3.booleanValue());
        }
        String str8 = ags.A0K;
        if (str8 != null) {
            anonymousClass182.A0S("sticker_id", str8);
        }
        String str9 = ags.A0L;
        if (str9 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str9);
        }
        anonymousClass182.A0S("media_type", ags.A00.A00);
        anonymousClass182.A0a();
    }
}
