package X;

import java.util.List;

/* renamed from: X.AUa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23289AUa implements C8EF {
    public final /* synthetic */ C44816Jsn A00;

    @Override // X.C8EF
    public final void D6b(Exception exc, List list) {
        C14360o3.A0B(list, 0);
        if (AbstractC166987dD.A1b(list)) {
            C44816Jsn c44816Jsn = this.A00;
            c44816Jsn.A01 = ((C184028Eq) list.get(0)).A01;
            c44816Jsn.A02 = AbstractC166987dD.A1A("llama2_tokenizer", ((C184028Eq) list.get(0)).A03);
            if (c44816Jsn.A0A()) {
                c44816Jsn.A09();
            }
        }
    }

    public C23289AUa(C44816Jsn c44816Jsn) {
        this.A00 = c44816Jsn;
    }
}
