package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.5qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127865qF {
    public static ExploreTopicCluster parseFromJson(C16L c16l) {
        EnumC127875qG enumC127875qG;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ExploreTopicCluster exploreTopicCluster = new ExploreTopicCluster();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    exploreTopicCluster.A06 = str;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    exploreTopicCluster.A0A = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    exploreTopicCluster.A09 = str;
                } else if ("cover_media".equals(A0q)) {
                    exploreTopicCluster.A02 = C38321qM.A0h.A0B(c16l, true);
                } else if ("debug_info".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    exploreTopicCluster.A05 = str;
                } else if ("ranked_position".equals(A0q)) {
                    exploreTopicCluster.A00 = c16l.A1D();
                } else if ("can_mute".equals(A0q)) {
                    exploreTopicCluster.A0B = c16l.A0d();
                } else if ("is_muted".equals(A0q)) {
                    exploreTopicCluster.A0C = c16l.A0d();
                } else if ("bloks_app_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    exploreTopicCluster.A04 = str;
                } else if ("lat".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    exploreTopicCluster.A07 = str;
                } else if ("lng".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    exploreTopicCluster.A08 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    Integer[] A00 = C05F.A00(11);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (C14360o3.A0K(AbstractC127885qH.A00(num), A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            num = C05F.A02;
                            break;
                        }
                    }
                    C14360o3.A0B(num, 0);
                    exploreTopicCluster.A03 = num;
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    int A1D = c16l.A1D();
                    EnumC127875qG[] values = EnumC127875qG.values();
                    int length2 = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            enumC127875qG = values[i2];
                            if (enumC127875qG.A00 == A1D) {
                                break;
                            }
                            i2++;
                        } else {
                            enumC127875qG = EnumC127875qG.A05;
                            break;
                        }
                    }
                    exploreTopicCluster.A01 = enumC127875qG;
                }
                c16l.A0z();
            }
            return exploreTopicCluster;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
