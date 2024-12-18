package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6S9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S9 {
    public View A00;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public final InterfaceC56392iX A06;

    public C6S9(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A06 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6SA
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6S9 c6s9 = C6S9.this;
                View requireViewById = view.requireViewById(R.id.feature_icon);
                C14360o3.A0B(requireViewById, 0);
                c6s9.A00 = requireViewById;
                IgTextView igTextView = (IgTextView) view.requireViewById(R.id.title_text);
                C14360o3.A0B(igTextView, 0);
                c6s9.A05 = igTextView;
                IgTextView igTextView2 = (IgTextView) view.requireViewById(R.id.subtitle_text);
                C14360o3.A0B(igTextView2, 0);
                c6s9.A04 = igTextView2;
                IgTextView igTextView3 = (IgTextView) view.requireViewById(R.id.start_survey_button);
                C14360o3.A0B(igTextView3, 0);
                c6s9.A03 = igTextView3;
                IgTextView igTextView4 = (IgTextView) view.requireViewById(R.id.skip_survey_text);
                C14360o3.A0B(igTextView4, 0);
                c6s9.A02 = igTextView4;
                View requireViewById2 = view.requireViewById(R.id.thank_you_check_icon);
                C14360o3.A0B(requireViewById2, 0);
                c6s9.A01 = requireViewById2;
            }
        });
    }
}
