package X;

import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.model.showreelnative.IgShowreelNativeAssetImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.52l, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52l {
    public static IgShowreelNativeAnimation parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("animation_payload".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("assets".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("assets_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            IgShowreelNativeAssetImpl parseFromJson = C52m.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("client_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("content".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("template_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new IgShowreelNativeAnimation(num, num2, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        anonymousClass182.A0d();
        String str = igShowreelNativeAnimation.A02;
        if (str != null) {
            anonymousClass182.A0S("animation_payload", str);
        }
        List<String> list = igShowreelNativeAnimation.A06;
        if (list != null) {
            C16V.A03(anonymousClass182, "assets");
            for (String str2 : list) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        List<IgShowreelNativeAsset> list2 = igShowreelNativeAnimation.A07;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "assets_info");
            for (IgShowreelNativeAsset igShowreelNativeAsset : list2) {
                if (igShowreelNativeAsset != null) {
                    IgShowreelNativeAssetImpl F6a = igShowreelNativeAsset.F6a();
                    anonymousClass182.A0d();
                    Integer num = F6a.A00;
                    if (num != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
                    }
                    String str3 = F6a.A02;
                    if (str3 != null) {
                        anonymousClass182.A0S("url", str3);
                    }
                    Integer num2 = F6a.A01;
                    if (num2 != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num2.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str4 = igShowreelNativeAnimation.A03;
        if (str4 != null) {
            anonymousClass182.A0S("client_name", str4);
        }
        String str5 = igShowreelNativeAnimation.A04;
        if (str5 != null) {
            anonymousClass182.A0S("content", str5);
        }
        Integer num3 = igShowreelNativeAnimation.A00;
        if (num3 != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num3.intValue());
        }
        String str6 = igShowreelNativeAnimation.A05;
        if (str6 != null) {
            anonymousClass182.A0S("template_name", str6);
        }
        Integer num4 = igShowreelNativeAnimation.A01;
        if (num4 != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num4.intValue());
        }
        anonymousClass182.A0a();
    }
}
