package X;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class Uvv extends AbstractC67710Uwb {
    public C2GT A00;
    public C63406Sjd A01;
    public boolean A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uvv(C152406tQ c152406tQ) {
        super(c152406tQ);
        C14360o3.A0B(c152406tQ, 1);
        this.A03 = AbstractC09440dt.A01(X3q.A00);
        this.A01 = C63406Sjd.A03(null);
    }

    @Override // X.AbstractC67710Uwb, X.UFZ
    public final void A09(Bundle bundle) {
        this.A00 = C75M.A01(C75M.A02(((AbstractC67710Uwb) this).A03, new X59(this, 29)), new X59(this, 30));
        super.A09(bundle);
    }

    public static final void A01(Uvv uvv, String str) {
        String A07;
        C2GC c2gc = C2FP.A02().A01;
        HashMap A00 = VNP.A00(uvv.A0B());
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) uvv).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            A00.put("financial_entity_id", A07);
            A00.put("view_name", "payouthub_earnings");
            c2gc.Chz(str, A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
