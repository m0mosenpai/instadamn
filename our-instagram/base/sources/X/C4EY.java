package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectPreview;
import com.instagram.model.shopping.ProductItemWithAR;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4EY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4EY {
    public static CreativeConfig parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AttributionUserImpl attributionUserImpl = null;
            ArrayList arrayList = null;
            String str = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList3 = null;
            EffectPreview effectPreview = null;
            ProductItemWithAR productItemWithAR = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ArrayList arrayList4 = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("attribution_user".equals(A0q)) {
                    attributionUserImpl = C4HY.parseFromJson(c16l);
                } else if ("camera_tools".equals(A0q)) {
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
                } else if ("capture_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creation_tool_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            CameraToolInfo parseFromJson = C51S.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("draft_metadata".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("draft_session_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("effect_configs".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            EffectPreview parseFromJson2 = C4HX.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("effect_preview".equals(A0q)) {
                    effectPreview = C4HX.parseFromJson(c16l);
                } else if ("effect_product".equals(A0q)) {
                    productItemWithAR = IR9.parseFromJson(c16l);
                } else if ("expressive_format".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("face_effect_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (TraceFieldType.FailureReason.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("format_variant".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("gen_ai_tool_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            GenAIToolInfoDict parseFromJson3 = ONS.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("persisted_effect_metadata_json".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new CreativeConfig(attributionUserImpl, effectPreview, productItemWithAR, str, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
