package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.CvO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29267CvO implements InterfaceC50459MPn {
    public final /* synthetic */ C26828Bsq A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public C29267CvO(C26828Bsq c26828Bsq, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = c26828Bsq;
        this.A02 = z;
        this.A01 = directThreadThemeInfo;
    }

    @Override // X.InterfaceC50459MPn
    public final void D1q() {
        C26828Bsq c26828Bsq = this.A00;
        C28457Ch7 c28457Ch7 = c26828Bsq.A00;
        if (c28457Ch7 == null) {
            C14360o3.A0F("aiThemesLogger");
            throw C00O.createAndThrow();
        }
        String A01 = ((C25870BcR) c26828Bsq.A08.getValue()).A01();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28457Ch7.A01, "direct_theme_preview_back_click");
        if (A0f.isSampled()) {
            C28457Ch7.A03(A0f, c28457Ch7, A01);
            C28457Ch7.A01(C8e.AI_THEME_LOADING, A0f, c28457Ch7, "minor_entry_point");
            C28457Ch7.A02(A0f, c28457Ch7);
        }
        AbstractC25226BEj.A1P(c26828Bsq);
    }

    @Override // X.InterfaceC50459MPn
    public final void Dl5() {
        C26828Bsq c26828Bsq = this.A00;
        if (c26828Bsq.A01) {
            C193328hC c193328hC = new C193328hC((Activity) c26828Bsq.requireActivity());
            c193328hC.A0A(2131955028);
            c193328hC.A09(2131955027);
            c193328hC.A0S(new DialogInterfaceOnClickListenerC35447Fk4(0, this.A01, c26828Bsq, this.A02), EnumC193348hE.A04, 2131956794);
            c193328hC.A0D(DialogInterfaceOnClickListenerC28549Cih.A00);
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            AbstractC166987dD.A1W(c193328hC);
            return;
        }
        if (this.A02) {
            DirectThreadThemeInfo directThreadThemeInfo = this.A01;
            Intent intent = new Intent();
            intent.putExtra("theme_info", directThreadThemeInfo);
            c26828Bsq.requireActivity().setResult(-1, intent);
            AbstractC25227BEk.A1B(c26828Bsq);
            return;
        }
        C26828Bsq.A02(c26828Bsq);
    }
}
