package X;

import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public final class WW6 implements InterfaceC48192Ji {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public WW6(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        if (this.A00 != 0) {
            C65886Tvq c65886Tvq = (C65886Tvq) this.A02;
            String str = this.A03;
            long j = this.A01;
            C18920wW c18920wW = c65886Tvq.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ctd_automated_responses_gql_mutation_success");
            if (A00.isSampled()) {
                C65886Tvq.A01(A00, c65886Tvq, str, j);
                A00.Cht();
                return;
            }
            return;
        }
        C58451PvZ c58451PvZ = (C58451PvZ) this.A02;
        String str2 = this.A03;
        int i = (int) this.A01;
        SharedPreferences.Editor edit = c58451PvZ.A00.getSharedPreferences("token_ack_prefs", 0).edit();
        edit.putInt(str2, i);
        edit.apply();
    }
}
