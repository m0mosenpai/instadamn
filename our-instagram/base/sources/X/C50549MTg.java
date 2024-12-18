package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.MTg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50549MTg {
    public C9SP A00;
    public final View A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C50549MTg(View view) {
        C14360o3.A0B(view, 1);
        View A0F = AbstractC43594JPz.A0F(view, R.id.iglive_error_viewstub);
        C14360o3.A07(A0F);
        this.A01 = A0F;
        this.A05 = C57557PgV.A01(this, 13);
        this.A04 = C57557PgV.A01(this, 12);
        this.A02 = C57557PgV.A01(this, 9);
        this.A08 = C57557PgV.A01(this, 10);
        this.A07 = C57557PgV.A01(this, 15);
        this.A03 = C57557PgV.A01(this, 11);
        this.A06 = C57557PgV.A01(this, 14);
        A00().setGradientColors(R.style.ViewerLoadingGradientStyle);
    }

    public final GradientSpinner A00() {
        return (GradientSpinner) AbstractC166987dD.A17(this.A08);
    }
}
