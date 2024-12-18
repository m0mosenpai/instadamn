package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;

/* loaded from: classes10.dex */
public final class SL5 {
    public final Context A00;
    public final C3O0 A01;

    public final void A00(EnumC61062Reb enumC61062Reb) {
        int i;
        EnumC141996bI enumC141996bI;
        String str;
        C3O0 c3o0 = this.A01;
        C146106i8 c146106i8 = new C146106i8();
        Context context = this.A00;
        boolean z = enumC61062Reb instanceof QEQ;
        if (z) {
            i = R.string.res_0x7f13001d_name_removed;
        } else if (enumC61062Reb instanceof QEP) {
            i = R.string.res_0x7f13001c_name_removed;
        } else {
            i = R.string.res_0x7f13001f_name_removed;
        }
        c146106i8.A0D = context.getString(i);
        if (z) {
            enumC141996bI = ((QEQ) enumC61062Reb).A00;
        } else if (enumC61062Reb instanceof QEP) {
            enumC141996bI = ((QEP) enumC61062Reb).A00;
        } else {
            enumC141996bI = ((QEO) enumC61062Reb).A00;
        }
        c146106i8.A0C(enumC141996bI);
        if (z) {
            str = "bwp_consent_denial";
        } else if (enumC61062Reb instanceof QEP) {
            str = "bwp_auth_flow_success";
        } else {
            str = "bwp_auth_flow_error";
        }
        c146106i8.A0H = str;
        c3o0.A0A(c146106i8.A00());
    }

    public SL5(Context context, InterfaceC172717mh interfaceC172717mh) {
        this.A00 = context;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bwp_snack_bar_stub);
        FrameLayout frameLayout = ((BrowserLiteFragment) interfaceC172717mh).A0D;
        if (frameLayout != null) {
            frameLayout.addView(viewStub);
        }
        C3O0 c3o0 = new C3O0(viewStub, false);
        this.A01 = c3o0;
        c3o0.A06(80);
    }
}
