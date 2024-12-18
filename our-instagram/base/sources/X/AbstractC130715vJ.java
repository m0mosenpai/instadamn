package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130715vJ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5vK, java.lang.Object] */
    public static C130725vK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList2 = null;
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A04 = str;
                } else if ("last_activity_at_ms".equals(A0q)) {
                    obj.A01 = c16l.A0y();
                } else if ("is_active".equals(A0q)) {
                    obj.A08 = c16l.A0d();
                } else if ("app_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    obj.A02 = str2;
                } else if ("copresence_enabled".equals(A0q)) {
                    obj.A07 = c16l.A0d();
                } else if ("capabilities".equals(A0q)) {
                    obj.A00 = c16l.A0y();
                } else if ("correlation_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    obj.A03 = str3;
                } else if ("thread_copresence_payloads".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C22992ABr parseFromJson = A1Z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    obj.A06 = arrayList2;
                } else if ("reels_together_copresence_payloads".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C22991ABq parseFromJson2 = A1X.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A05 = arrayList;
                } else if ("is_close_friend".equals(A0q)) {
                    obj.A09 = c16l.A0d();
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
