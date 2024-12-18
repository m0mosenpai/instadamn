package X;

import android.graphics.Rect;
import android.text.TextUtils;

/* renamed from: X.2TC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2TC {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Rect[] A04;
    public final String[] A05;
    public final C2TB[][] A06;

    public C2TC(String str, String str2, Rect[] rectArr, String[] strArr, C2TB[][] c2tbArr, int i) {
        this.A01 = str;
        String queryParameter = android.net.Uri.parse(str).getQueryParameter("v");
        this.A02 = TextUtils.isEmpty(queryParameter) ? "unknown" : queryParameter;
        this.A03 = str2;
        this.A04 = rectArr;
        this.A00 = i;
        this.A05 = strArr;
        this.A06 = c2tbArr;
    }
}
