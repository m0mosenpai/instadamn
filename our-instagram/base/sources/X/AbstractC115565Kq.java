package X;

import com.facebook.location.platform.api.Location;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.feed.media.CameraToolInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.5Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115565Kq {
    public static C115545Ko parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C115545Ko c115545Ko = new C115545Ko();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (Location.SPEED.equals(A0q)) {
                    c115545Ko.A00 = (float) c16l.A0U();
                } else if ("timer_duration_ms".equals(A0q)) {
                    c115545Ko.A01 = c16l.A1D();
                } else if ("ghost_mode_on".equals(A0q)) {
                    c115545Ko.A05 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    HashSet hashSet = null;
                    ArrayList arrayList2 = null;
                    if ("camera_tool".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    hashSet.add(A1P);
                                }
                            }
                        }
                        c115545Ko.A04 = hashSet;
                    } else if ("camera_ar_effect_list".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                CameraAREffect parseFromJson = AbstractC120315cU.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        c115545Ko.A02 = arrayList2;
                    } else if ("camera_tools_struct".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                CameraToolInfo parseFromJson2 = C51S.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c115545Ko.A03 = arrayList;
                    }
                }
                c16l.A0z();
            }
            if (c115545Ko.A01 <= 0) {
                c115545Ko.A01 = -1;
                return c115545Ko;
            }
            return c115545Ko;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
