package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OEg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54704OEg {
    public final Context A00;
    public final Resources A01;
    public final View A02;
    public final View A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final InterfaceC09390do A06;

    public C54704OEg(View view, C07X c07x, InterfaceC018407e interfaceC018407e) {
        C14360o3.A0B(interfaceC018407e, 1);
        this.A02 = view;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = A0L;
        this.A01 = AbstractC166997dE.A0M(A0L);
        this.A06 = Ny8.A00(new C55565Olz(), interfaceC018407e, AbstractC25225BEi.A1D(C38325GtK.class));
        this.A03 = AbstractC166997dE.A0S(view, R.id.reel_viewer_text_container);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.reel_viewer_title);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.reel_viewer_timestamp);
        C57158PZc.A02(c07x, this, C07Y.A00(c07x), 11);
    }
}
