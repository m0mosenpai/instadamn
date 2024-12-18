package X;

import com.facebook.react.uimanager.UIManagerHelper;

/* loaded from: classes11.dex */
public final class WXV implements InterfaceC71844X7c {
    public final int A02;
    public final X9J A03;
    public final UDV A04;
    public int A01 = 0;
    public int A00 = 0;

    public WXV(UDV udv) {
        this.A04 = udv;
        Q21 A02 = UIManagerHelper.A02(udv);
        this.A03 = UIManagerHelper.A05(A02, udv.getId());
        this.A02 = UIManagerHelper.A00(A02);
    }
}
