package X;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes11.dex */
public final class Wm3 implements C5NL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        c5ng.A06 = AbstractC166987dD.A1J(this.A04);
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A00;
    }

    public Wm3(Rect rect, String str, String str2) {
        AbstractC167027dH.A13(str, str2, rect);
        this.A04 = str;
        this.A05 = str2;
        this.A01 = rect.left;
        this.A03 = rect.top;
        this.A02 = rect.right;
        this.A00 = rect.bottom;
    }

    public Wm3() {
        this.A04 = "";
        this.A05 = "";
    }
}
