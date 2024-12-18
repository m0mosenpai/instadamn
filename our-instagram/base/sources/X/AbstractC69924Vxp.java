package X;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.Vxp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69924Vxp {
    public static void A00(C16L c16l, AbstractMap abstractMap) {
        C69707Vu2 c69707Vu2 = null;
        String A1P = c16l.A1P();
        c16l.A1J();
        if (c16l.A11() == C16R.A0G || (c69707Vu2 = AbstractC68469VRz.parseFromJson(c16l)) != null) {
            abstractMap.put(A1P, c69707Vu2);
        }
    }

    public static W59 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            W59 w59 = new W59();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (MSV.A00(231).equals(A0s)) {
                        w59.A00 = c16l.A0y();
                    } else {
                        HashMap hashMap = null;
                        if ("aml_face_models".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    A00(c16l, hashMap);
                                }
                            }
                            w59.A03 = hashMap;
                        } else if ("segmentation_models".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    A00(c16l, hashMap);
                                }
                            }
                            w59.A05 = hashMap;
                        } else {
                            if (!"segmentation_model_version".equals(A0s)) {
                                if ("hair_segmentation_models".equals(A0s)) {
                                    if (c16l.A11() == c16r) {
                                        hashMap = new HashMap();
                                        while (c16l.A1J() != c16r2) {
                                            A00(c16l, hashMap);
                                        }
                                    }
                                    w59.A04 = hashMap;
                                } else if (!"hair_segmentation_model_version".equals(A0s)) {
                                    if ("body_tracking_models".equals(A0s)) {
                                        if (c16l.A11() == c16r) {
                                            hashMap = new HashMap();
                                            while (c16l.A1J() != c16r2) {
                                                A00(c16l, hashMap);
                                            }
                                        }
                                        w59.A02 = hashMap;
                                    } else if (!"body_tracking_model_version".equals(A0s)) {
                                        if ("world_tracker_device_config".equals(A0s)) {
                                            w59.A01 = VS0.parseFromJson(c16l);
                                        }
                                    }
                                }
                            }
                            c16l.A0y();
                        }
                    }
                    c16l.A0z();
                } else {
                    return w59;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
