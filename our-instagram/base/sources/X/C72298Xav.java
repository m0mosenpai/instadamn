package X;

import com.facebook.R;

/* renamed from: X.Xav, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72298Xav extends AbstractC72282Xaf {
    public XOM A00;
    public final /* synthetic */ C71070WnS A01;

    @Override // X.AbstractC72282Xaf, X.C72283Xag, X.YQ3
    public final void CNp(C22978ABc c22978ABc) {
        C14360o3.A0B(c22978ABc, 0);
        super.CNp(c22978ABc);
        if (isValid()) {
            XO3 xo3 = ((AbstractC73478YFb) this).A04;
            if (xo3 != null) {
                this.A00 = AbstractC72046XLm.A08("uCenterBoost", xo3.A03);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        ((AbstractC73478YFb) this).A05 = this.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72298Xav(C71070WnS c71070WnS) {
        super("", R.raw.point_vertex, R.raw.neon_glow_fragment, R.drawable.radial_asset);
        this.A01 = c71070WnS;
    }
}
