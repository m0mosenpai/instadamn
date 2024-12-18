package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.VrM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69557VrM {
    public final VD5 A00;
    public final String A01;

    public final String toString() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("[%s:%s]", this.A00, this.A01);
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public C69557VrM(VD5 vd5, String str) {
        this.A00 = vd5;
        this.A01 = str;
    }
}
