package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33188Eka extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "DirectThreadReminderBottomSheetFragment";
    public C35005Fbc A00;
    public DirectThreadKey A01;
    public Integer A02;
    public UserSession A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_reminder_bottom_sheet";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf c35246Fgf = new C35246Fgf(2131959692);
        c35246Fgf.A06 = true;
        List A1Q = AbstractC16960so.A1Q(new C35124FeR("HOUR_ONE", AbstractC31173DnH.A07(this, c35246Fgf, A1E).getString(2131959695)), new C35124FeR("HOUR_SIX", requireContext().getString(2131959696)), new C35124FeR("CUSTOM", requireContext().getString(2131959697)));
        Integer num = this.A02;
        if (num == null) {
            C14360o3.A0F("preSelectedOption");
            throw C00O.createAndThrow();
        }
        C34960Fak c34960Fak = new C34960Fak(null, AbstractC34145F4v.A00(num), A1Q);
        FGL fgl = new FGL(this);
        for (C35124FeR c35124FeR : c34960Fak.A05) {
            c35124FeR.A00 = new ViewOnClickListenerC35684FpJ(58, c34960Fak, c35124FeR, fgl);
        }
        A1E.add(c34960Fak);
        setBottomSheetMenuItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1605375110);
        super.onCreate(bundle);
        this.A03 = AbstractC31177DnL.A0R(this);
        C0f9.A09(1023978659, A02);
    }
}
