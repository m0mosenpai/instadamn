package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225769xv {
    public static C2040190q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C2040190q c2040190q = new C2040190q();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("face_models".equals(A0s)) {
                    c2040190q.A01 = AbstractC69924Vxp.parseFromJson(c16l);
                } else if ("new_face_models".equals(A0s)) {
                    c2040190q.A02 = AbstractC69924Vxp.parseFromJson(c16l);
                } else if ("new_segmentation_model".equals(A0s)) {
                    c2040190q.A04 = AbstractC69924Vxp.parseFromJson(c16l);
                } else if ("new_hair_segmentation_model".equals(A0s)) {
                    c2040190q.A03 = AbstractC69924Vxp.parseFromJson(c16l);
                } else if ("new_target_recognition_model".equals(A0s)) {
                    c2040190q.A05 = AbstractC69924Vxp.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("effects".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                CameraAREffect parseFromJson = AbstractC120315cU.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c2040190q.A07 = arrayList;
                    } else if ("pre_capture_effects_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A0A = arrayList;
                    } else if ("post_capture_effects_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A09 = arrayList;
                    } else if ("live_effects_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A08 = arrayList;
                    } else if ("video_call_effects_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A0D = arrayList;
                    } else if ("reels_effects_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A0B = arrayList;
                    } else if ("saved_effects_list".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                CameraAREffect parseFromJson2 = AbstractC120315cU.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c2040190q.A0C = arrayList;
                    } else if ("last_face_effects_fetch_time_ms".equals(A0s)) {
                        c2040190q.A00 = c16l.A0y();
                    } else if ("last_world_tracker_fetch_time_ms".equals(A0s)) {
                        c16l.A0y();
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                        c2040190q.A06 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return c2040190q;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
