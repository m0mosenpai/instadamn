package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Ka7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46052Ka7 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NudityDetectionSettingsFragment";
    public C47859LCf A00;
    public C5zZ A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131968865);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nudity_detection_settings";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.LCf, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C5zZ c5zZ = new C5zZ(AbstractC166987dD.A0r(this.A02));
        this.A01 = c5zZ;
        this.A00 = new Object();
        Context A07 = AbstractC31173DnH.A07(this, new C36731GHa(new C55519OlD(this, 12), 2131968865, c5zZ.A02.A01(1)), A1E);
        String A0p = AbstractC166997dE.A0p(A07, 2131965052);
        String A10 = AbstractC43592JPx.A10(A07.getString(2131968866), A0p);
        C46067KaO c46067KaO = new C46067KaO(this, AbstractC31174DnI.A02(A07));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A10);
        AnonymousClass773.A04(A0H, c46067KaO, A0p);
        C35246Fgf c35246Fgf = new C35246Fgf(A0H);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        A1E.add(c35246Fgf);
        setItems(A1E);
    }

    public static final void A00(C46052Ka7 c46052Ka7, boolean z) {
        C5zZ c5zZ = c46052Ka7.A01;
        if (c5zZ == null) {
            C14360o3.A0F("manager");
            throw C00O.createAndThrow();
        }
        c5zZ.A00(new C49355Lrn(c46052Ka7, z), z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1757973307);
        super.onDestroy();
        C5zZ c5zZ = this.A01;
        if (c5zZ == null) {
            C14360o3.A0F("manager");
            throw C00O.createAndThrow();
        }
        c5zZ.A00.A01();
        C0f9.A09(-1166531287, A02);
    }
}
