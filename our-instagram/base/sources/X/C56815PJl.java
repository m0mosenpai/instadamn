package X;

import java.util.List;

/* renamed from: X.PJl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56815PJl implements C8YA {
    public final /* synthetic */ C56162OwU A00;
    public final /* synthetic */ String A01;

    @Override // X.C8YA
    public final String AbY() {
        return "live_comment_create";
    }

    @Override // X.C8YA
    public final /* synthetic */ void CzK() {
    }

    @Override // X.C8YA
    public final /* synthetic */ void DOg() {
    }

    @Override // X.C8YA
    public final /* synthetic */ void E1m() {
    }

    @Override // X.C8YA
    public final /* synthetic */ void E1n() {
    }

    public C56815PJl(C56162OwU c56162OwU, String str) {
        this.A00 = c56162OwU;
        this.A01 = str;
    }

    @Override // X.C8YA
    public final void Dw9() {
        C56162OwU c56162OwU = this.A00;
        C51026MgZ A00 = C56162OwU.A00(c56162OwU);
        String str = this.A01;
        C14360o3.A0B(str, 0);
        C51026MgZ.A00(null, A00, str, 15, false, false, false);
        AbstractC167007dF.A0J().postDelayed(new RunnableC56942POj(c56162OwU), 100L);
    }

    @Override // X.C8YA
    public final void E4v() {
        C56162OwU c56162OwU = this.A00;
        C51026MgZ A00 = C56162OwU.A00(c56162OwU);
        NG3 ng3 = c56162OwU.A0B;
        long A002 = ng3.A00();
        int i = ((AbstractC13100lw) ng3).A00;
        ((AbstractC13100lw) ng3).A00 = 0;
        A00.A01(this.A01, i, A002, false);
    }

    @Override // X.C8YA
    public final List getContent() {
        return AbstractC166987dD.A1J(this.A01);
    }
}
