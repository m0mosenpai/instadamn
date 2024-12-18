package X;

import android.os.Bundle;

/* renamed from: X.KWx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45983KWx extends KDD {
    public static final String __redex_internal_original_name = "FeedPostExistingThreadSheetFragment";
    public KZH A00;
    public InterfaceC37172GZj A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final boolean A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_post_existing_thread_sheet_fragment";
    }

    public C45983KWx() {
        C0YZ A1D = AbstractC25225BEi.A1D(C44547Jmr.class);
        this.A02 = AbstractC25225BEi.A0a(new B5y(this, 35), new B5y(this, 36), new C57256Pbe(41, null, this), A1D);
        this.A03 = AbstractC60492pY.A02(this);
        this.A04 = true;
        this.A01 = new C49323LrH(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-732990337);
        super.onCreate(bundle);
        super.A04 = requireArguments().getString("SELECTED_CHAT_THREAD_ID_KEY");
        C0f9.A09(1880348568, A02);
    }
}
