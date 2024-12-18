package com.instagram.urlhandlers.media;

import X.AbstractC12290kX;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31180DnO;
import X.C06090Tz;
import X.C0f9;
import X.C18U;
import X.C1ON;
import X.C53Z;
import X.ET6;
import X.FC8;
import X.InterfaceC56362iU;
import X.InterfaceC60112ot;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public class ShortUrlReelLoadingFragment extends C53Z implements InterfaceC60112ot {
    public final Handler A00 = AbstractC167007dF.A0J();
    public SpinnerImageView mLoadingSpinner;

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "short_url_reel_loading_fragment";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Resources A0N;
        if (C18U.A06(C06090Tz.A05, getSession(), 36330028845253252L)) {
            A0N = AbstractC12290kX.A00.getResources();
        } else {
            A0N = AbstractC166997dE.A0N(this);
        }
        interfaceC56362iU.ESp(getSession(), R.layout.action_bar_title_logo, A0N.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0);
        interfaceC56362iU.EkS(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(566205458);
        super.onCreate(bundle);
        String string = requireArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL");
        if (string != null) {
            C1ON A00 = FC8.A00(getSession(), string);
            A00.A00 = new ET6(this, string);
            schedule(A00);
        }
        C0f9.A09(1049292480, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1738416918);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_loading_spinner);
        C0f9.A09(188695034, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1179998937);
        super.onDestroyView();
        this.mLoadingSpinner = null;
        C0f9.A09(-1358229143, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        this.mLoadingSpinner = A0V;
        AbstractC31171DnF.A1M(A0V);
    }
}
