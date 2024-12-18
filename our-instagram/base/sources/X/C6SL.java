package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6SL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SL {
    public RelativeLayout A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public C141596ac A04;
    public final InterfaceC56392iX A05;

    public C6SL(View view) {
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view, false, false);
        this.A05 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6SM
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C6SL c6sl = C6SL.this;
                RelativeLayout relativeLayout = (RelativeLayout) view2.requireViewById(R.id.netego_ig_consent_layout);
                C14360o3.A0B(relativeLayout, 0);
                c6sl.A00 = relativeLayout;
                IgTextView igTextView = (IgTextView) view2.requireViewById(R.id.title);
                C14360o3.A0B(igTextView, 0);
                c6sl.A02 = igTextView;
                IgTextView igTextView2 = (IgTextView) view2.requireViewById(R.id.top_text);
                C14360o3.A0B(igTextView2, 0);
                c6sl.A03 = igTextView2;
                IgTextView igTextView3 = (IgTextView) view2.requireViewById(R.id.bottom_text);
                C14360o3.A0B(igTextView3, 0);
                c6sl.A01 = igTextView3;
            }
        });
    }
}
