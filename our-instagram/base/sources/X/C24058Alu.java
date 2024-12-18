package X;

import android.view.View;

/* renamed from: X.Alu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24058Alu implements C88F {
    public final /* synthetic */ C23629AdO A00;

    public C24058Alu(C23629AdO c23629AdO) {
        this.A00 = c23629AdO;
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        if (obj == EnumC1810181d.A1C && this.A00.A0I) {
            return true;
        }
        return false;
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvQ(Object obj) {
        View view = this.A00.A0L;
        C9GR.A03(view.getContext(), view.getResources().getString(2131970035), "product_sticker_invalid_tokenized_name_error", 0);
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvM(Object obj) {
    }
}
