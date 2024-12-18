package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.Vr4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69540Vr4 {
    public final Map A01 = new HashMap();
    public final C68659VZt A00 = new C68659VZt();

    public final void A00(String str) {
        C68889Vdl c68889Vdl;
        synchronized (this) {
            Map map = this.A01;
            Object obj = map.get(str);
            Rs8.A00(obj);
            c68889Vdl = (C68889Vdl) obj;
            int i = c68889Vdl.A00;
            if (i >= 1) {
                int i2 = i - 1;
                c68889Vdl.A00 = i2;
                if (i2 == 0) {
                    C68889Vdl c68889Vdl2 = (C68889Vdl) map.remove(str);
                    if (c68889Vdl2.equals(c68889Vdl)) {
                        Queue queue = this.A00.A00;
                        synchronized (queue) {
                            try {
                                if (queue.size() < 10) {
                                    queue.offer(c68889Vdl2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(c68889Vdl);
                        sb.append(", but actually removed: ");
                        sb.append(c68889Vdl2);
                        sb.append(", safeKey: ");
                        throw AbstractC58320PtC.A0o(str, sb);
                    }
                }
            } else {
                throw new IllegalStateException(AnonymousClass001.A07(i, "Cannot release a lock that is not held, safeKey: ", str, ", interestedThreads: "));
            }
        }
        c68889Vdl.A01.unlock();
    }
}
