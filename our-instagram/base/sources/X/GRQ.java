package X;

import com.facebook.msys.mci.CQLResultSet;

/* loaded from: classes6.dex */
public final class GRQ implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;

    public GRQ(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        int i;
        CQLResultSet cQLResultSet;
        int i2;
        switch (this.A00) {
            case 0:
                AbstractC1351869s abstractC1351869s = (AbstractC1351869s) this.A02;
                i = this.A01;
                cQLResultSet = abstractC1351869s.mResultSet;
                i2 = 14;
                break;
            case 1:
                AbstractC1351869s abstractC1351869s2 = (AbstractC1351869s) this.A02;
                i = this.A01;
                cQLResultSet = abstractC1351869s2.mResultSet;
                i2 = 100;
                break;
            case 2:
                AbstractC1351869s abstractC1351869s3 = (AbstractC1351869s) this.A02;
                i = this.A01;
                cQLResultSet = abstractC1351869s3.mResultSet;
                i2 = 138;
                break;
            default:
                C23031Ai c23031Ai = (C23031Ai) this.A02;
                int i3 = this.A01 + 1;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7D("mpp_megaphone_dismiss_count", i3);
                A0w.apply();
                return null;
        }
        return cQLResultSet.getString(i, i2);
    }
}
