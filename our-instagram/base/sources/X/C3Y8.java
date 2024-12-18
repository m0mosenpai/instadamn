package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3Y8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y8 {
    public View.OnClickListener A00;
    public final C57012jc A01;

    public final void A00(EnumC79303gb enumC79303gb) {
        C14360o3.A0B(enumC79303gb, 0);
        if (enumC79303gb.ordinal() != 1) {
            C57012jc c57012jc = this.A01;
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            Context context = A01.getContext();
            C14360o3.A07(context);
            if (!AbstractC56862jK.A00(context)) {
                c57012jc.A03(0);
                View A012 = c57012jc.A01();
                C14360o3.A07(A012);
                C0fQ.A00(this.A00, A012);
                return;
            }
            return;
        }
        this.A01.A03(8);
    }

    public C3Y8(ViewStub viewStub) {
        this.A01 = new C57012jc(viewStub);
    }
}
