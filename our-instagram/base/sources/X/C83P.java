package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.83P, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C83P {
    public void A03() {
    }

    public void A04() {
    }

    public void A05(EffectManifest effectManifest) {
    }

    public void A07(String str) {
    }

    public void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
    }

    public void A09(String str) {
    }

    public void A0A(String str, Throwable th) {
    }

    public void A06(String str) {
        JSONObject jSONObject;
        C195868lW A04;
        List list;
        if (this instanceof C200558ty) {
            C200558ty c200558ty = (C200558ty) this;
            for (C83L c83l : c200558ty.A0G) {
                CameraAREffect cameraAREffect = c200558ty.A0M;
                if (c83l != null && cameraAREffect != null) {
                    c83l.DD2(cameraAREffect, false, false);
                }
            }
            java.util.Set<A5F> set = c200558ty.A05;
            if (set != null) {
                c200558ty.A00++;
                CameraAREffect cameraAREffect2 = c200558ty.A0M;
                if (cameraAREffect2 != null) {
                    for (A5F a5f : set) {
                        if (a5f != null) {
                            int i = c200558ty.A00;
                            if (cameraAREffect2.A0I()) {
                                C185948Mo c185948Mo = a5f.A00;
                                if (c185948Mo.A07 != null && c185948Mo.A01 != null && (A04 = c185948Mo.A0k.A02.A01.A04()) != null) {
                                    AbstractC223779uM abstractC223779uM = (AbstractC223779uM) c185948Mo.A01.A02();
                                    String str2 = c185948Mo.A0G;
                                    if (str2 != null && str2.equals(A04.A07())) {
                                        if (abstractC223779uM instanceof C218409lC) {
                                            list = ((C218409lC) abstractC223779uM).A00;
                                        } else if ((abstractC223779uM instanceof C218419lD) || (abstractC223779uM instanceof C218439lF)) {
                                            list = new ArrayList();
                                        }
                                        cameraAREffect2.A0k = AbstractC226619zJ.A00(list);
                                    }
                                    cameraAREffect2.A0k = null;
                                    c185948Mo.A02 = new AUS(cameraAREffect2, c200558ty, a5f, i);
                                    String str3 = c185948Mo.A0H;
                                    if (str3 == null || !str3.equals(A04.A07())) {
                                        c185948Mo.A0H = A04.A07();
                                        C185948Mo.A0B(c185948Mo, 2131964712);
                                        c185948Mo.A07.AUd(c185948Mo.A0W);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            CameraAREffect cameraAREffect3 = c200558ty.A0M;
            if (cameraAREffect3 != null && (jSONObject = cameraAREffect3.A0k) != null) {
                c200558ty.A07.A00(jSONObject);
                return;
            }
            return;
        }
        IgCameraEffectsController igCameraEffectsController = (IgCameraEffectsController) this;
        CameraAREffect cameraAREffect4 = igCameraEffectsController.A09;
        if (cameraAREffect4 != null) {
            for (C83L c83l2 : igCameraEffectsController.A0Q) {
                if (c83l2 != null) {
                    c83l2.DD2(cameraAREffect4, igCameraEffectsController.A0D, true);
                }
            }
        }
    }
}
