package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;

/* renamed from: X.Idp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41718Idp {
    public long A00;
    public C3FQ A01;
    public boolean A02;
    public final Rect A03;
    public final Adapter A04;
    public final C0JO A05;
    public final InterfaceC11380iw A06;
    public final C18920wW A07;
    public final UserSession A08;
    public final InterfaceC65232xL A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0JO, java.lang.Object] */
    public C41718Idp(Adapter adapter, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC65232xL interfaceC65232xL, String str, String str2) {
        ?? obj = new Object();
        Rect A0U = AbstractC166987dD.A0U();
        this.A08 = userSession;
        this.A06 = interfaceC11380iw;
        this.A04 = adapter;
        this.A09 = interfaceC65232xL;
        this.A0A = str;
        this.A0B = str2;
        this.A05 = obj;
        this.A03 = A0U;
        this.A07 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static int A00(C41718Idp c41718Idp) {
        int B6q = c41718Idp.A01.B6q();
        int BM3 = c41718Idp.A01.BM3() - B6q;
        float f = 0.0f;
        int i = B6q;
        for (int i2 = 0; i2 <= BM3; i2++) {
            View AnU = c41718Idp.A01.AnU(i2);
            if (AnU != null && ((AnU.getTag() instanceof C81303k0) || (AnU.getTag() instanceof C3W3))) {
                AnU.getGlobalVisibleRect(c41718Idp.A03);
                float height = r0.height() / AnU.getHeight();
                if (height > f) {
                    i = i2 + B6q;
                    f = height;
                }
            }
        }
        return i;
    }

    public static int A01(C41718Idp c41718Idp, int i) {
        C38321qM A04 = AbstractC41071vF.A04(c41718Idp.A04.getItem(i));
        if (A04 != null) {
            return c41718Idp.A09.BRZ(A04).getPosition();
        }
        return -1;
    }

    public static String A02(C41718Idp c41718Idp, int i) {
        return AbstractC25231BEo.A0s(AbstractC41071vF.A04(c41718Idp.A04.getItem(i)));
    }
}
