package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.5J9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J9 {
    public int A00;
    public int A01;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public final C92304Bk A0A;
    public final String A0B;
    public String A07 = "";
    public long A03 = Long.MAX_VALUE;
    public long A02 = -1;
    public Pair A06 = Pair.create(-1L, -1L);

    public final String toString() {
        return String.format(Locale.US, "isKeyCached=%s, networkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", Boolean.valueOf(this.A09), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A05), Long.valueOf(this.A04), Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02)));
    }

    public C5J9(C92304Bk c92304Bk, String str) {
        this.A0A = c92304Bk;
        this.A0B = str;
    }
}
