package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7NW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7NW {
    public static C9CI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Long l = null;
            Long l2 = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("direct_thread_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("direct_pending_recipients".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            PendingRecipient parseFromJson = C7NT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("msys_thread_key".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("msys_thread_fbid".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("msys_transport_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("msys_pending_recipients".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C54994OUd parseFromJson2 = AbstractC54054NvE.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            return new C9CI(l, l2, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
