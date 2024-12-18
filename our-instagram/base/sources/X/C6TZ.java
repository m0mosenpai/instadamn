package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.6TZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TZ {
    public C139586Tn A00;
    public final View A01;
    public final C139516Tg A02;
    public final C139456Ta A03;
    public final C139496Te A04;
    public final C139476Tc A05;

    public C6TZ(View view) {
        this.A01 = view;
        this.A03 = new C139456Ta(AbstractC56372iV.A01(view.requireViewById(R.id.popularity_proof_stub), false, false), C05F.A01);
        this.A05 = new C139476Tc(AbstractC56372iV.A01(view.requireViewById(R.id.product_thumbnail_stub), false, false));
        this.A04 = new C139496Te(AbstractC56372iV.A01(view.requireViewById(R.id.product_pill_stub), false, false));
        this.A02 = new C139516Tg(AbstractC56372iV.A01(view.requireViewById(R.id.afi_footer_stub), false, false));
    }
}
