package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.412, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass412 extends RuntimeException {
    public C2V9 A00;
    public final ArrayList A01;
    public final HashMap A02;
    public final C2XE A03;
    public final String A04;
    public final String A05;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        AbstractC50812Vc abstractC50812Vc;
        String str2;
        StringBuilder sb = new StringBuilder("Real Cause");
        Throwable cause = getCause();
        if (cause == null) {
            throw new IllegalStateException("Required value was null.");
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null) {
                break;
            }
            cause = cause2;
        }
        C2XE c2xe = this.A03;
        if (c2xe != null && (abstractC50812Vc = c2xe.A01) != null) {
            sb.append(" at <cls>");
            Class<?> cls = abstractC50812Vc.getClass();
            if (cls != null) {
                str2 = cls.getName();
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append("</cls>");
        }
        sb.append(" => ");
        sb.append(cause.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(cause.getMessage());
        sb.append('\n');
        sb.append("Litho Context:");
        sb.append('\n');
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    sb.append((String) arrayList.get(size));
                    if (size != 0) {
                        sb.append(" -> ");
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            sb.append('\n');
        }
        if (c2xe == null || (str = c2xe.A02.A01.A07) == null) {
            str = "";
        }
        if ((!AbstractC001900j.A0T(str)) || (str = this.A04) != null) {
            sb.append("  log_tag: ");
            sb.append(str);
            sb.append('\n');
        }
        String str3 = this.A05;
        if (str3 != null) {
            sb.append("  tree_root: <cls>");
            sb.append(str3);
            sb.append("</cls>");
            sb.append('\n');
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append('\n');
        for (Map.Entry entry : this.A02.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            sb.append("  ");
            sb.append(str4);
            sb.append(": ");
            sb.append(str5);
            sb.append('\n');
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        int length = obj.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            int i3 = length;
            if (!z) {
                i3 = i2;
            }
            int A00 = C14360o3.A00(obj.charAt(i3), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length--;
            }
        }
        return obj.subSequence(i2, length + 1).toString();
    }

    public AnonymousClass412(C2XE c2xe, String str, String str2, Throwable th) {
        this.A03 = c2xe;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = new ArrayList();
        this.A02 = new HashMap();
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (r4 != null) goto L7;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass412(com.facebook.litho.ComponentTree r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L1b
            X.2Vc r0 = r4.A0F()
            if (r0 == 0) goto L1b
            java.lang.String r1 = r0.A0H()
        Ld:
            X.2XE r0 = r4.A0W
            X.3ab r0 = r0.A02
            if (r0 == 0) goto L1f
            X.2V3 r0 = r0.A01
            java.lang.String r0 = r0.A07
        L17:
            r3.<init>(r2, r1, r0, r5)
            return
        L1b:
            r1 = r2
            if (r4 == 0) goto L1f
            goto Ld
        L1f:
            r0 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass412.<init>(com.facebook.litho.ComponentTree, java.lang.Throwable):void");
    }
}
