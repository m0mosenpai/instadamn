package X;

import java.util.StringTokenizer;

/* renamed from: X.TZt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64918TZt extends StringTokenizer {
    public int A00;
    public String A01;
    public final String A02;

    public C64918TZt(String str) {
        super(str, "<,>", true);
        this.A02 = str;
    }

    @Override // java.util.StringTokenizer
    public final boolean hasMoreTokens() {
        if (this.A01 == null && !super.hasMoreTokens()) {
            return false;
        }
        return true;
    }

    @Override // java.util.StringTokenizer
    public final String nextToken() {
        String str = this.A01;
        if (str != null) {
            this.A01 = null;
            return str;
        }
        String nextToken = super.nextToken();
        this.A00 += nextToken.length();
        return nextToken.trim();
    }
}
