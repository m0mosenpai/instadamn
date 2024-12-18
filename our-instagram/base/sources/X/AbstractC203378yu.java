package X;

import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203378yu {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    public static ReelMoreOptionsModel parseFromJson(C16L c16l) {
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
                if ("more_option_type".equals(A0q)) {
                    EnumC183928Dt enumC183928Dt = (EnumC183928Dt) EnumC183928Dt.A01.get(Integer.valueOf(c16l.A1D()));
                    if (enumC183928Dt == null) {
                        enumC183928Dt = EnumC183928Dt.A08;
                    }
                    obj.A09 = enumC183928Dt;
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    ArrayList arrayList = null;
                    if ("web_link_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        obj.A0C = str2;
                    } else if ("igtv_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        obj.A0B = str3;
                    } else if ("ar_effect_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        obj.A0A = str4;
                    } else if ("profile_shop_link".equals(A0q)) {
                        obj.A06 = IRI.parseFromJson(c16l);
                    } else if ("instagram_shop_link".equals(A0q)) {
                        obj.A03 = A1K.parseFromJson(c16l);
                    } else if ("incentive_product_collection_link".equals(A0q)) {
                        obj.A04 = IRF.parseFromJson(c16l);
                    } else if ("product_collection_link".equals(A0q)) {
                        obj.A05 = IRF.parseFromJson(c16l);
                    } else if ("product_link".equals(A0q)) {
                        obj.A08 = A1L.parseFromJson(c16l);
                    } else if ("products_link".equals(A0q)) {
                        obj.A07 = AE8.parseFromJson(c16l);
                    } else if ("media_gating_info".equals(A0q)) {
                        obj.A00 = AbstractC41243INj.parseFromJson(c16l);
                    } else if ("branded_content_tags".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                BrandedContentTag parseFromJson = AbstractC54880OPb.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0D = arrayList;
                    } else if ("branded_content_project_metadata".equals(A0q)) {
                        obj.A01 = ONL.parseFromJson(c16l);
                    } else if ("is_paid_partnership_label".equals(A0q)) {
                        obj.A0H = c16l.A0d();
                    } else if ("create_pa_boost_post_access_token".equals(A0q)) {
                        obj.A0E = c16l.A0d();
                    } else if ("is_ads_mode".equals(A0q)) {
                        obj.A0G = c16l.A0d();
                    } else if ("has_ads_mode_changed".equals(A0q)) {
                        obj.A0F = c16l.A0d();
                    } else if ("gen_ai_detection_method".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A02 = AbstractC85933sM.A00(str);
                    }
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
}
