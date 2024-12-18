package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AUZ implements C8EF {
    public final /* synthetic */ C44815Jsm A00;

    @Override // X.C8EF
    public final void D6b(Exception exc, List list) {
        C14360o3.A0B(list, 0);
        if (AbstractC166987dD.A1b(list)) {
            C44815Jsm c44815Jsm = this.A00;
            c44815Jsm.A01 = ((C184028Eq) list.get(0)).A01;
            c44815Jsm.A02 = AbstractC166987dD.A1A("llama2_tokenizer", ((C184028Eq) list.get(0)).A03);
            if (c44815Jsm.A0A()) {
                c44815Jsm.A09();
            }
        }
    }

    public AUZ(C44815Jsm c44815Jsm) {
        this.A00 = c44815Jsm;
    }
}
