package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class WYQ implements XC7 {
    public final /* synthetic */ C4TS A00;

    @Override // X.XC7
    public final void DmR(IOException iOException) {
    }

    public WYQ(C4TS c4ts) {
        this.A00 = c4ts;
    }

    @Override // X.XC7
    public final /* bridge */ /* synthetic */ void DmQ(Object obj) {
        C92124As c92124As = (C92124As) obj;
        C4TS c4ts = this.A00;
        if (c92124As != null) {
            if ((c4ts.A0C(c92124As) || C4TS.A00(c92124As) != null) && c4ts.A0E.A04().A01.get(2)) {
                C96414Uz c96414Uz = new C96414Uz(c4ts.A0E.A04());
                c96414Uz.A09(2, false);
                c4ts.A0E.A05(c96414Uz);
            }
        }
    }
}
