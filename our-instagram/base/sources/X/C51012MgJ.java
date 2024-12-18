package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.MgJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51012MgJ extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;

    public final void A01(OS6 os6) {
        Object value;
        List A0f;
        List list;
        Bitmap bitmap;
        Bitmap bitmap2;
        String str;
        C14360o3.A0B(os6, 0);
        C05A c05a = this.A00;
        do {
            value = c05a.getValue();
            MWT mwt = (MWT) value;
            A0f = AbstractC001800i.A0f((Iterable) mwt.A05, os6);
            list = (List) mwt.A02;
            bitmap = (Bitmap) mwt.A01;
            bitmap2 = (Bitmap) mwt.A00;
            str = mwt.A03;
            AbstractC167007dF.A1F(list, 0, A0f);
        } while (!c05a.AIi(value, new MWT(bitmap, bitmap2, str, list, A0f)));
    }

    public C51012MgJ() {
        C008002u A1H = AbstractC25225BEi.A1H(new MWT());
        this.A00 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
    }

    public static MWT A00(InterfaceC09390do interfaceC09390do) {
        return (MWT) ((C51012MgJ) interfaceC09390do.getValue()).A01.getValue();
    }
}
