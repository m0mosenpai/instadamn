package X;

import android.app.Activity;
import android.view.View;
import com.facebook.litho.LithoView;

/* loaded from: classes8.dex */
public final class LRZ implements InterfaceC65626Tpm {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final L46 A03;
    public final KLD A04;
    public final Jn5 A05;
    public final InterfaceC60152ox A06;
    public final C3I9 A07;
    public final InterfaceC60442pS A08;

    public LRZ(Activity activity, View view, Jn5 jn5, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(jn5, 4);
        this.A02 = view;
        this.A05 = jn5;
        this.A08 = interfaceC60442pS;
        L46 l46 = new L46(view);
        this.A03 = l46;
        C3I8 A01 = C3I7.A01(this, false, true);
        A01.Dnr(activity);
        this.A07 = A01;
        this.A06 = new C48548Ldl(this, 3);
        this.A04 = new KLD(this);
        this.A01 = l46.A00;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C3I9 c3i9 = this.A07;
        c3i9.onStop();
        c3i9.onDestroy();
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A07.EFx(this.A06);
        this.A03.A03.removeTextChangedListener(this.A04);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A07.A9e(this.A06);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStart(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A03.A03.addTextChangedListener(this.A04);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final void A00(InterfaceC166367c5 interfaceC166367c5, L5U l5u, LRZ lrz, C7IM c7im) {
        LithoView lithoView = lrz.A03.A02;
        lithoView.setComponent(new C26424Bm7(interfaceC166367c5, l5u, lrz.A05, c7im, lrz.A08));
        lithoView.setVisibility(0);
    }
}
