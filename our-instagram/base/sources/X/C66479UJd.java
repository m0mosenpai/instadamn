package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.UJd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66479UJd extends C3OO {
    public final View A00;
    public final C69310VlI A01;
    public final C69160Vip A02;
    public final IN7 A03;
    public final C69161Viq A04;
    public final C69396Vmg A05;
    public final IJL A06;
    public final C68846Vd2 A07;
    public final C68847Vd3 A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66479UJd(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A09 = z;
        this.A01 = new C69310VlI(AbstractC166987dD.A0c(view, R.id.button_container));
        C69161Viq c69161Viq = new C69161Viq(view);
        this.A04 = c69161Viq;
        C69396Vmg c69396Vmg = new C69396Vmg(AbstractC166987dD.A0c(view, R.id.media_container));
        this.A05 = c69396Vmg;
        this.A06 = new IJL(view);
        this.A07 = new C68846Vd2(view);
        this.A08 = new C68847Vd3(view);
        this.A02 = new C69160Vip(view);
        IN7 in7 = new IN7(AbstractC166997dE.A0L(view));
        in7.A00(c69161Viq.A01);
        in7.A00(c69396Vmg.A06);
        in7.A01(c69161Viq.A02);
        in7.A01(c69396Vmg.A03);
        this.A03 = in7;
    }
}
