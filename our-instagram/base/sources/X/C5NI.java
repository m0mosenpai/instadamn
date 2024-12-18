package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.5NI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5NI {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5NJ, java.lang.Object] */
    public static C5NJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                HashSet hashSet = null;
                if ("image_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    obj.A05 = str2;
                } else if ("sticker_spec".equals(A0q)) {
                    obj.A04 = C5NK.parseFromJson(c16l);
                } else if ("image_regions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = new HashSet();
                        while (c16l.A1J() != C16R.A08) {
                            C5NO parseFromJson = C5NN.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                hashSet.add(parseFromJson);
                            }
                        }
                    }
                    obj.A07 = hashSet;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    C5NP c5np = (C5NP) C5NP.A02.get(c16l.A1P());
                    if (c5np == null) {
                        c5np = C5NP.A07;
                    }
                    obj.A03 = c5np;
                } else if ("original_image_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A06 = str;
                } else if ("timing".equals(A0q)) {
                    obj.A02 = AbstractC22737A1h.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5NJ c5nj) {
        anonymousClass182.A0d();
        String str = c5nj.A05;
        if (str != null) {
            anonymousClass182.A0S("image_path", str);
        }
        if (c5nj.A04 != null) {
            anonymousClass182.A0r("sticker_spec");
            C5NK.A00(anonymousClass182, c5nj.A04);
        }
        if (c5nj.A07 != null) {
            C16V.A03(anonymousClass182, "image_regions");
            for (C5NO c5no : c5nj.A07) {
                if (c5no != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("drawable_id", c5no.A0B);
                    anonymousClass182.A0P("center_x", c5no.A00);
                    anonymousClass182.A0P("center_y", c5no.A01);
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c5no.A0A);
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c5no.A02);
                    anonymousClass182.A0P("normalized_center_x", c5no.A03);
                    anonymousClass182.A0P("normalized_center_y", c5no.A05);
                    anonymousClass182.A0P("normalized_center_x_precise", c5no.A04);
                    anonymousClass182.A0P("normalized_center_y_precise", c5no.A06);
                    anonymousClass182.A0P("normalized_width", c5no.A08);
                    anonymousClass182.A0P("normalized_height", c5no.A07);
                    anonymousClass182.A0Q("video_position", c5no.A0C);
                    anonymousClass182.A0P("rotation", c5no.A09);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        C5NP c5np = c5nj.A03;
        if (c5np != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c5np.toString());
        }
        String str2 = c5nj.A06;
        if (str2 != null) {
            anonymousClass182.A0S("original_image_url", str2);
        }
        if (c5nj.A02 != null) {
            anonymousClass182.A0r("timing");
            C22880A7a c22880A7a = c5nj.A02;
            anonymousClass182.A0d();
            anonymousClass182.A0Q(TraceFieldType.StartTime, c22880A7a.A01);
            anonymousClass182.A0Q("end_time", c22880A7a.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c5nj.A01);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c5nj.A00);
        anonymousClass182.A0a();
    }
}
