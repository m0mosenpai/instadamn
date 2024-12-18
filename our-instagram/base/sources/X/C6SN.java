package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6SN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SN {
    public IgTextView A00;
    public IgTextView A01;
    public IgTextView A02;
    public final InterfaceC56392iX A03;

    public C6SN(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A03 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6SO
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6SN c6sn = C6SN.this;
                c6sn.A01 = (IgTextView) view.requireViewById(R.id.title);
                c6sn.A02 = (IgTextView) view.requireViewById(R.id.top_text);
                c6sn.A00 = (IgTextView) view.requireViewById(R.id.bottom_text);
            }
        });
    }
}
