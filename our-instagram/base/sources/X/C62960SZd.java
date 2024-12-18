package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SZd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62960SZd {
    public static final C62972SZr A02;
    public static final Object A03 = AbstractC58318PtA.A0b();
    public Object A01 = A03;
    public C62972SZr A00 = A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C62960SZd c62960SZd = (C62960SZd) obj;
            if (!Util.A0F(this.A01, c62960SZd.A01) || !Util.A0F(this.A00, c62960SZd.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return (AbstractC25225BEi.A05(((AbstractC25225BEi.A05(((((AbstractC166997dE.A0J(this.A00, (217 + this.A01.hashCode()) * 31) * 31 * 31) + i) * 31) + i) * 31, i) * 31 * 31) + i) * 31, i) * 31) + i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Q8n] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.SN6] */
    static {
        SO1 so1 = null;
        ImmutableList.of();
        List emptyList = Collections.emptyList();
        ImmutableList of = ImmutableList.of();
        SNA sna = SNA.A00;
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (uri != null) {
            so1 = new SO1(uri, of, emptyList);
        }
        C62972SZr c62972SZr = C62972SZr.A08;
        A02 = new C62972SZr(new Object(), new Object(), so1, sna, Y1V.A0W, "androidx.media3.common.Timeline");
    }
}
