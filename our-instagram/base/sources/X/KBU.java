package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.litho.LithoView;

/* loaded from: classes8.dex */
public final class KBU extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FollowUpBottomSheetFragment";
    public LithoView A00;
    public InterfaceC84443pn A01;
    public InterfaceC88183wS A02;
    public AbstractC46470KhU A03;
    public InterfaceC50486MQo A04;
    public AnonymousClass341 A05;
    public final C47444KxZ A07 = new C47444KxZ(this);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "follow_up_bottom_sheet";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C3DN A0l = AbstractC43593JPy.A0l(this, C3DN.A00);
        if (A0l != null) {
            ((C3DP) A0l).A0H = new C49624LwH(this, 4);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(KBU kbu) {
        InterfaceC84443pn interfaceC84443pn = kbu.A01;
        if (interfaceC84443pn != null) {
            LithoView lithoView = kbu.A00;
            if (lithoView == null) {
                C14360o3.A0F("lithoView");
                throw C00O.createAndThrow();
            }
            lithoView.setComponent(new C26354Bkz(interfaceC84443pn, AbstractC166987dD.A0r(kbu.A06), kbu.A07));
        }
    }

    public final void A01(InterfaceC84443pn interfaceC84443pn) {
        this.A01 = interfaceC84443pn;
        this.A03 = new HLW(interfaceC84443pn, this.A02);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            C14360o3.A0F("lithoView");
            throw C00O.createAndThrow();
        }
        ViewTreeObserver viewTreeObserver = lithoView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            JXP.A00(viewTreeObserver, this, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1493003656);
        C14360o3.A0B(layoutInflater, 0);
        LithoView lithoView = new LithoView(layoutInflater.getContext());
        this.A00 = lithoView;
        C0f9.A09(-624812751, A02);
        return lithoView;
    }
}
