package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: X.03l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC009703l {
    public static void A01(View view, final C03M c03m, String[] strArr) {
        view.setOnReceiveContentListener(strArr, new OnReceiveContentListener(c03m) { // from class: X.03m
            public final C03M A00;

            {
                this.A00 = c03m;
            }

            @Override // android.view.OnReceiveContentListener
            public final ContentInfo onReceiveContent(View view2, ContentInfo contentInfo) {
                C006302d A00 = C006302d.A00(contentInfo);
                C006302d Dd9 = this.A00.Dd9(view2, A00);
                if (Dd9 == null) {
                    return null;
                }
                if (Dd9 == A00) {
                    return contentInfo;
                }
                return Dd9.A01();
            }
        });
    }

    public static C006302d A00(View view, C006302d c006302d) {
        ContentInfo A01 = c006302d.A01();
        ContentInfo performReceiveContent = view.performReceiveContent(A01);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == A01) {
            return c006302d;
        }
        return C006302d.A00(performReceiveContent);
    }

    public static String[] A02(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
