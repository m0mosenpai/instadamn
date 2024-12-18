package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3o5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83623o5 {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    public static DirectThreadKey parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("thread_v2_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("recipient_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (arrayList != null) {
                obj.A02 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectThreadKey directThreadKey) {
        anonymousClass182.A0d();
        String str = directThreadKey.A00;
        if (str != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        String str2 = directThreadKey.A01;
        if (str2 != null) {
            anonymousClass182.A0S("thread_v2_id", str2);
        }
        if (directThreadKey.A02 != null) {
            C16V.A03(anonymousClass182, "recipient_ids");
            for (String str3 : directThreadKey.A02) {
                if (str3 != null) {
                    anonymousClass182.A0u(str3);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
