package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes7.dex */
public abstract class IAP {
    public static IKA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IKA ika = new IKA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                HashSet hashSet = null;
                if (TraceFieldType.BroadcastId.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    ika.A03 = A0m;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    ika.A00 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("cobroadcasters".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = AbstractC166987dD.A1H();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, hashSet);
                        }
                    }
                    ika.A04 = hashSet;
                } else if ("compound_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("published_time".equals(A0s)) {
                    c16l.A0y();
                } else {
                    if (!"is_periodic".equals(A0s)) {
                        if ("broadcast_message".equals(A0s)) {
                            if (c16l.A11() == C16R.A0G) {
                            }
                            c16l.A1P();
                        } else if ("display_notification".equals(A0s)) {
                            ika.A06 = c16l.A0d();
                        } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                            AbstractC109124vc.A00(c16l.A1Q());
                        } else if (!"copyright_violation".equals(A0s) && !"is_scheduled_live".equals(A0s) && !"is_exclusive_live".equals(A0s)) {
                            if ("event_type".equals(A0s)) {
                                String A1Q = c16l.A1Q();
                                C14360o3.A0B(A1Q, 0);
                                EnumC39579Hdp enumC39579Hdp = (EnumC39579Hdp) EnumC39579Hdp.A01.get(A1Q);
                                if (enumC39579Hdp == null) {
                                    enumC39579Hdp = EnumC39579Hdp.A05;
                                }
                                ika.A01 = enumC39579Hdp;
                            } else if ("add_to_home_tray".equals(A0s)) {
                                ika.A05 = c16l.A0d();
                            } else if ("question_pk".equals(A0s)) {
                                ika.A02 = AbstractC31173DnH.A0h(c16l);
                            }
                        }
                    }
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return ika;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
