package X;

import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class I3F {
    public static ProductArEffectMetadata parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            ContainerEffectEnum containerEffectEnum = null;
            DynamicEffectState dynamicEffectState = null;
            String str = null;
            HashMap hashMap = null;
            String str2 = null;
            EffectThumbnailImageDict effectThumbnailImageDict = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("container_effect_type".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P2 = null;
                        } else {
                            A1P2 = c16l.A1P();
                        }
                        containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(A1P2);
                        if (containerEffectEnum == null) {
                            containerEffectEnum = ContainerEffectEnum.A0I;
                        }
                    } else if ("dynamic_effect_state".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        dynamicEffectState = (DynamicEffectState) DynamicEffectState.A01.get(A1P);
                        if (dynamicEffectState == null) {
                            dynamicEffectState = DynamicEffectState.A07;
                        }
                    } else if ("effect_id".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("effect_parameters".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("effect_parameters_data".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("effect_thumbnail_image".equals(A0s)) {
                        effectThumbnailImageDict = AbstractC93474He.parseFromJson(c16l);
                    }
                    c16l.A0z();
                } else {
                    return new ProductArEffectMetadata(containerEffectEnum, dynamicEffectState, effectThumbnailImageDict, str, str2, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
