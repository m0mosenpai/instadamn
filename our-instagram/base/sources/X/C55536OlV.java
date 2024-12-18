package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.OlV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55536OlV implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C55536OlV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C141796aw A00;
        InterfaceC16620sF pyz;
        switch (this.A00) {
            case 0:
                if (i != 6) {
                    return false;
                }
                AbstractC50903MeY A002 = ((AbstractC52138N5n) this.A01).A00();
                A00 = AbstractC141776au.A00(A002);
                pyz = new PYZ(A002, null, 44);
                break;
            case 1:
                if (i != 6) {
                    return false;
                }
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C52149N5z) this.A01).A03);
                A00 = AbstractC141776au.A00(A0Z);
                pyz = new PZF(A0Z, null, 5);
                break;
            case 2:
                C56162OwU c56162OwU = (C56162OwU) this.A01;
                C51026MgZ A003 = C56162OwU.A00(c56162OwU);
                NG3 ng3 = c56162OwU.A0B;
                long A004 = ng3.A00();
                int i2 = ((AbstractC13100lw) ng3).A00;
                ((AbstractC13100lw) ng3).A00 = 0;
                A003.A01("", i2, A004, true);
                return true;
            case 3:
                C14360o3.A0B(textView, 0);
                C52837NZu c52837NZu = (C52837NZu) this.A01;
                String A01 = C52837NZu.A01(textView);
                if (4 != i || A01.length() <= 0) {
                    return false;
                }
                c52837NZu.A0G(textView);
                return true;
            case 4:
                if (i != 5) {
                    return false;
                }
                N52.A00((N52) this.A01);
                return false;
            default:
                return false;
        }
        AbstractC166987dD.A1Z(pyz, A00);
        return false;
    }
}
