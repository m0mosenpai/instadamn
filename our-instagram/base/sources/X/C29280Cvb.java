package X;

import java.util.List;

/* renamed from: X.Cvb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29280Cvb implements GZ7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C165907bI A01;
    public final /* synthetic */ C83403nh A02;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        List list = (List) this.A01.A09.get(this.A02);
        if (list != null) {
            list.set(this.A00, C128085qc.A02(c38321qM));
        }
    }

    public C29280Cvb(C165907bI c165907bI, C83403nh c83403nh, int i) {
        this.A01 = c165907bI;
        this.A02 = c83403nh;
        this.A00 = i;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        AbstractC166987dD.A1T(C18950wb.A01, "Failed to fetch direct reshare chaining clips media: $errorMessage", 20135027);
    }
}
