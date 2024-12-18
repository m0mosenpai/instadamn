package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.87s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1825387s {
    public C189478aR A00;
    public C189448aO A01;
    public final C1825187q A02;
    public final int A03;
    public final UserSession A04;

    public C1825387s(C1825187q c1825187q, UserSession userSession, int i) {
        C14360o3.A0B(c1825187q, 2);
        this.A04 = userSession;
        this.A02 = c1825187q;
        this.A03 = i;
    }

    public final void A00(Context context, float f) {
        C14360o3.A0B(context, 0);
        KDT kdt = new KDT();
        C189448aO c189448aO = new C189448aO(this.A04);
        c189448aO.A0k = false;
        c189448aO.A0q = true;
        c189448aO.A03 = f;
        c189448aO.A0x = true;
        c189448aO.A04 = 1.0f;
        c189448aO.A0a = true;
        c189448aO.A0T = kdt;
        c189448aO.A0U = new C24098Amj(this);
        c189448aO.A1O = false;
        c189448aO.A06 = this.A03;
        this.A01 = c189448aO;
        C189478aR A00 = c189448aO.A00();
        this.A00 = A00;
        A00.A0D(context, kdt);
    }
}
