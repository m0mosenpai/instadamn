package X;

import android.view.View;

/* renamed from: X.KaG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46059KaG extends AnonymousClass772 {
    public final /* synthetic */ C45487KCc A00;
    public final /* synthetic */ C45842KQx A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46059KaG(C45487KCc c45487KCc, C45842KQx c45842KQx, int i, boolean z) {
        super(Integer.valueOf(i));
        this.A00 = c45487KCc;
        this.A02 = z;
        this.A01 = c45842KQx;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        MRK mrk;
        C45487KCc c45487KCc = this.A00;
        if ((C4AC.A07(AbstractC166987dD.A0r(c45487KCc.A0i)) || this.A02) && (mrk = c45487KCc.A0P) != null) {
            mrk.Cs1(this.A01.A08);
        }
    }
}
