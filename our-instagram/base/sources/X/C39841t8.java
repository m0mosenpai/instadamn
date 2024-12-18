package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39841t8 {
    public static final AtomicInteger A03 = new AtomicInteger(-1);
    public Boolean A00;
    public final C39831t7 A01;
    public final String A02;

    public C39841t8(C39831t7 c39831t7, String str) {
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A01 = c39831t7;
    }

    public final String A00() {
        C39831t7 c39831t7 = this.A01;
        if (c39831t7 == null) {
            return "^^^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append('^');
        sb.append("");
        sb.append('^');
        sb.append(c39831t7.A00);
        sb.append('^');
        sb.append("");
        return sb.toString();
    }

    public C39841t8(C39831t7 c39831t7, String str, boolean z) {
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A01 = c39831t7;
        this.A00 = true;
    }
}
