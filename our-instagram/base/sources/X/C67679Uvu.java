package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.Uvu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67679Uvu extends AbstractC67710Uwb {
    public C2GT A00;
    public C63406Sjd A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67679Uvu(C152406tQ c152406tQ) {
        super(c152406tQ);
        C14360o3.A0B(c152406tQ, 1);
        this.A02 = AbstractC09440dt.A01(X43.A00);
        this.A01 = C63406Sjd.A03(null);
    }

    @Override // X.AbstractC67710Uwb, X.UFZ
    public final void A09(Bundle bundle) {
        this.A00 = C75M.A01(C75M.A02(((AbstractC67710Uwb) this).A03, new X59(this, 44)), new X59(this, 45));
        super.A09(bundle);
    }

    public static final void A01(C67679Uvu c67679Uvu, String str, String str2, String str3) {
        String A07;
        C2GC c2gc = C2FP.A02().A01;
        HashMap A00 = VNP.A00(c67679Uvu.A0B());
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67679Uvu).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            A00.put("financial_entity_id", A07);
            A00.put("view_name", "payouthub_payouts");
            if (str2 != null) {
                A00.put("batch_item_id", str2);
            }
            if (str3 != null) {
                A00.put("target_name", str3);
            }
            c2gc.Chz(str, A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
