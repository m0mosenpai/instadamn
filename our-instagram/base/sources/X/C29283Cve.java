package X;

import java.util.List;

/* renamed from: X.Cve, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29283Cve implements GZ7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C83403nh A01;
    public final /* synthetic */ C1DX A02;
    public final /* synthetic */ List A03;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        int i = this.A00;
        if (i >= 0) {
            List list = this.A03;
            if (i < list.size() && C14360o3.A0K(((C51u) list.get(i)).A00, this.A01)) {
                ((C83403nh) ((C51u) list.get(i)).A00).A15(c38321qM);
                this.A02.A03(c38321qM);
            }
        }
    }

    public C29283Cve(C83403nh c83403nh, C1DX c1dx, List list, int i) {
        this.A00 = i;
        this.A03 = list;
        this.A01 = c83403nh;
        this.A02 = c1dx;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        AbstractC166987dD.A1T(C18950wb.A01, "Failed to fetch direct reshare chaining clips media: $errorMessage", 20135027);
    }
}
