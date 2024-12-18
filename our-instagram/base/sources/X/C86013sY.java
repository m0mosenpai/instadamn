package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.3sY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86013sY {
    public int A00;
    public InterfaceC80063hv A01;
    public boolean A02;
    public final C57012jc A03;
    public final boolean A04;

    public final void A00(int i) {
        View A01;
        this.A00 = i;
        if ((!this.A04 || this.A03.A00 != null) && (A01 = this.A03.A01()) != null) {
            AbstractC13880nE.A0U(A01, this.A00);
        }
    }

    public C86013sY(ViewStub viewStub, boolean z) {
        this.A04 = z;
        C57012jc c57012jc = new C57012jc(viewStub);
        this.A03 = c57012jc;
        this.A02 = true;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.3sZ
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                TextView textView = (TextView) view;
                C14360o3.A0B(textView, 0);
                textView.setVisibility(8);
                textView.getPaint().setFakeBoldText(true);
                C86013sY c86013sY = C86013sY.this;
                if (c86013sY.A04) {
                    AbstractC13880nE.A0U(textView, c86013sY.A00);
                }
            }
        };
    }
}
