package X;

import java.io.IOException;

/* renamed from: X.5ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130305ua {
    public static final void A00(C16R c16r, C16R c16r2) {
        if (c16r == c16r2) {
            return;
        }
        C0w9.A03("IGLegacyFragmentModelResponseParser", "Unexpected token");
        StringBuilder sb = new StringBuilder();
        sb.append("Expected token ");
        sb.append(c16r2);
        sb.append(" but found ");
        sb.append(c16r);
        throw new IOException(sb.toString());
    }
}
