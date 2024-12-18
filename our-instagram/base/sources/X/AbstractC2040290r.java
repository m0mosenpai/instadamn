package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.90r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2040290r {
    public static final C2040190q A00() {
        C2040190q c2040190q;
        InterfaceC19610xo ARD;
        String str;
        Integer num;
        if (C2040190q.A0F == null) {
            synchronized (C2040190q.class) {
                if (C2040190q.A0F == null) {
                    C17320tT A01 = AbstractC19750y3.A01("ig_mq_asset_prefs");
                    String string = A01.getString("prefs_asset_snapshot_key", null);
                    if (string != null) {
                        try {
                            if (string.length() != 0) {
                                try {
                                    try {
                                        c2040190q = AbstractC225769xv.parseFromJson(C16V.A00(string));
                                    } catch (Throwable th) {
                                        th = th;
                                        InterfaceC19610xo ARD2 = A01.ARD();
                                        ARD2.EEj("prefs_asset_snapshot_key");
                                        ARD2.apply();
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    C0K8.A0F("EffectAssetSnapshot", "IOException on reading cached copy of AssetSnapshot", e);
                                    if (0 == 0) {
                                        ARD = A01.ARD();
                                        ARD.EEj("prefs_asset_snapshot_key");
                                    }
                                }
                                if (c2040190q != null) {
                                    C14360o3.A06(c2040190q.A07);
                                    if (!r0.isEmpty()) {
                                        List<CameraAREffect> list = c2040190q.A07;
                                        long j = c2040190q.A00;
                                        synchronized (c2040190q) {
                                            str = c2040190q.A06;
                                        }
                                        synchronized (c2040190q) {
                                            ArrayList arrayList = new ArrayList();
                                            if (list != null) {
                                                for (CameraAREffect cameraAREffect : list) {
                                                    String str2 = cameraAREffect.A0K;
                                                    if (str2 != null && (num = cameraAREffect.A09) != C05F.A00 && !"FOCUSV2".equals(CameraAREffect.A00(num)) && !C2040190q.A0E.contains(str2)) {
                                                        arrayList.add(cameraAREffect);
                                                    }
                                                }
                                            }
                                            c2040190q.A07 = Collections.unmodifiableList(arrayList);
                                            c2040190q.A00 = j;
                                            c2040190q.A06 = str;
                                        }
                                        C2040190q.A0F = c2040190q;
                                    }
                                }
                                ARD = A01.ARD();
                                ARD.EEj("prefs_asset_snapshot_key");
                                ARD.apply();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (0 != 0) {
                                throw th;
                            }
                            InterfaceC19610xo ARD22 = A01.ARD();
                            ARD22.EEj("prefs_asset_snapshot_key");
                            ARD22.apply();
                            throw th;
                        }
                    }
                    c2040190q = new C2040190q();
                    C2040190q.A0F = c2040190q;
                }
            }
        }
        C2040190q c2040190q2 = C2040190q.A0F;
        if (c2040190q2 != null) {
            return c2040190q2;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
