package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IJ5 {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final InterfaceC56392iX A03;
    public final C42104IlE A04;

    public IJ5(View view, int i) {
        this.A00 = AbstractC166997dE.A0L(view);
        View A0S = AbstractC166997dE.A0S(view, R.id.container);
        this.A01 = A0S;
        this.A02 = AbstractC166997dE.A0S(view, i);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.background_stub);
        this.A04 = new C42104IlE(A0S);
    }
}
