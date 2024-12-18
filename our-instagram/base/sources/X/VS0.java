package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VS0 {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VuJ] */
    public static C69724VuJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attitude_time_delay".equals(A0s)) {
                    obj.A00 = c16l.A0U();
                } else {
                    ArrayList arrayList = null;
                    if ("camera_device_type".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("camera_distortion_1".equals(A0s)) {
                        obj.A01 = c16l.A0U();
                    } else if ("camera_distortion_2".equals(A0s)) {
                        obj.A02 = c16l.A0U();
                    } else if ("camera_focal_length".equals(A0s)) {
                        obj.A03 = c16l.A0U();
                    } else if ("camera_imu_from_camera_rotation".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Double valueOf = Double.valueOf(c16l.A0U());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("camera_imu_from_camera_translation".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Double valueOf2 = Double.valueOf(c16l.A0U());
                                if (valueOf2 != null) {
                                    arrayList.add(valueOf2);
                                }
                            }
                        }
                        obj.A08 = arrayList;
                    } else if ("camera_principal_point_x".equals(A0s)) {
                        obj.A04 = c16l.A0U();
                    } else if ("camera_principal_point_y".equals(A0s)) {
                        obj.A05 = c16l.A0U();
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        obj.A06 = c16l.A0y();
                    } else if ("slam_capable".equals(A0s)) {
                        obj.A09 = c16l.A0d();
                    } else if ("slam_configuration_params".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("vision_only_slam".equals(A0s)) {
                        obj.A0A = c16l.A0d();
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
