package X;

import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Fct, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35082Fct {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.8Ws, java.lang.Object] */
    public static final C188538Ws A00(String str, String str2, int i, int i2) {
        boolean A1R = AbstractC167007dF.A1R(0, str, str2);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 4);
        ?? obj = new Object();
        obj.A00 = "";
        obj.A02 = str2;
        obj.A01 = str;
        obj.A03 = c16930sl;
        obj.A04 = A1R;
        RectF A07 = MX2.A07(MX2.A01(new Rect(0, 0, i, i2)), i, i2);
        obj.A03 = AbstractC16960so.A1Q(Float.valueOf(A07.left), Float.valueOf(A07.top), Float.valueOf(A07.right), Float.valueOf(A07.bottom));
        return obj;
    }

    public static final String A02(C188538Ws c188538Ws) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            FWS.A00(A0A, c188538Ws);
            A0A.close();
            return AbstractC166987dD.A19(stringWriter);
        } catch (IOException unused) {
            C0K8.A0C("PendingHighlightsInfo_Error", "Error writing pending highlights info to string.");
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.8Ws, java.lang.Object] */
    public static final C188538Ws A01(String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1O(str, str3);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 4);
        ?? obj = new Object();
        obj.A00 = str;
        obj.A02 = str3;
        obj.A01 = str2;
        obj.A03 = c16930sl;
        obj.A04 = z;
        return obj;
    }
}
