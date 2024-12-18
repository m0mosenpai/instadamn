package X;

import android.text.TextUtils;

/* renamed from: X.SKr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62657SKr {
    public final /* synthetic */ SYM A00;

    public C62657SKr(SYM sym) {
        this.A00 = sym;
    }

    public final String A00(String str) {
        if (str != null && str.length() != 0) {
            C0NO c0no = this.A00.A00;
            android.net.Uri A00 = AbstractC08820cl.A00(c0no, str);
            if (A00 == null) {
                return "failed-to-parse";
            }
            android.net.Uri A002 = AbstractC63387Sj3.A00(A00, c0no);
            if (TextUtils.isEmpty(A002.getHost())) {
                return A002.toString();
            }
            String F7g = C04690Ml.A00(A002, AbstractC63387Sj3.A00).F7g();
            if (F7g != null) {
                return F7g;
            }
            return "failed-to-sanitize";
        }
        return str;
    }
}
