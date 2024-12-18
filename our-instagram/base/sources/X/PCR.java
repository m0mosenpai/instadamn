package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class PCR implements InterfaceC57985PnV {
    public ImageUrl A00;
    public O53 A01;
    public final View A03;
    public final InterfaceC11380iw A04;
    public final boolean A0Q;
    public final boolean A0R;
    public final InterfaceC09390do A0E = C57520Pfu.A00(this, 48);
    public final InterfaceC09390do A0D = C57520Pfu.A00(this, 47);
    public final InterfaceC09390do A0J = C57553PgR.A01(this, 5);
    public final InterfaceC09390do A0I = C57553PgR.A01(this, 4);
    public final InterfaceC09390do A0F = C57520Pfu.A00(this, 49);
    public final InterfaceC09390do A05 = C57520Pfu.A00(this, 36);
    public final InterfaceC09390do A0C = C57520Pfu.A00(this, 46);
    public final InterfaceC09390do A08 = C57520Pfu.A00(this, 40);
    public final InterfaceC09390do A0P = C57553PgR.A01(this, 11);
    public final InterfaceC09390do A09 = C57520Pfu.A00(this, 42);
    public final InterfaceC09390do A06 = C57520Pfu.A00(this, 38);
    public final InterfaceC09390do A07 = C57520Pfu.A00(this, 39);
    public final InterfaceC09390do A0A = C57520Pfu.A00(this, 45);
    public final InterfaceC09390do A0H = C57553PgR.A01(this, 3);
    public final InterfaceC09390do A0N = C57553PgR.A01(this, 9);
    public final InterfaceC09390do A0M = C57553PgR.A01(this, 8);
    public final InterfaceC09390do A0G = C57553PgR.A01(this, 1);
    public final InterfaceC09390do A0O = C57553PgR.A01(this, 10);
    public final InterfaceC09390do A0L = C57553PgR.A01(this, 7);
    public final InterfaceC09390do A0K = C57553PgR.A01(this, 6);
    public final InterfaceC09390do A0B = C1XM.A00(C57431PeT.A00);
    public boolean A02 = true;

    public /* synthetic */ PCR(View view, InterfaceC11380iw interfaceC11380iw, boolean z, boolean z2) {
        this.A03 = view;
        this.A04 = interfaceC11380iw;
        this.A0Q = z;
        this.A0R = z2;
    }

    public static final void A01(View view, PCR pcr, int i) {
        view.setAlpha(0.0f);
        view.setTranslationY(MSZ.A03(pcr.A0K));
        AbstractC43594JPz.A0H(view).setDuration(250L).setStartDelay(i * 100.0f).setInterpolator((DecelerateInterpolator) pcr.A0B.getValue()).translationY(0.0f).start();
    }

    public static final void A00(View view) {
        view.setAlpha(1.0f);
        MSX.A14(AbstractC43594JPz.A0G(view).setDuration(250L), new PO2(view));
    }

    public static final void A02(PCR pcr) {
        View A0d = AbstractC166987dD.A0d(pcr.A0N);
        if (A0d != null) {
            A00(A0d);
        }
        View A0d2 = AbstractC166987dD.A0d(pcr.A0M);
        if (A0d2 != null) {
            A00(A0d2);
        }
        MSW.A0D(pcr.A0L).setText(2131954551);
    }

    public final O53 A03() {
        O53 o53 = this.A01;
        if (o53 != null) {
            return o53;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        AbstractC50523MSb.A0g();
        throw C00O.createAndThrow();
    }
}
