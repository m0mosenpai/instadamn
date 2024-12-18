package com.instagram.creation.fragment.preview;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.AbstractC60492pY;
import X.AnonymousClass840;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C2J9;
import X.C38K;
import X.C38U;
import X.C9KJ;
import X.InterfaceC189598ae;
import X.InterfaceC189608af;
import X.KED;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.preview.ThumbnailPreviewFragment;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class ThumbnailPreviewFragment extends C38K {
    public static final C38U A03 = C38U.A00;
    public UserSession A00;
    public KED A01;
    public InterfaceC189598ae A02;
    public View mContainer;
    public EmptyStateView mEmptyStateView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "metadata_thumbnail_preview";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1867871847);
        super.onCreate(bundle);
        AnonymousClass840 Ak4 = ((InterfaceC189608af) requireContext()).Ak4();
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = AbstractC166987dD.A0b();
        }
        UserSession userSession = (UserSession) AbstractC60492pY.A02(this).getValue();
        this.A00 = userSession;
        this.A02 = (InterfaceC189598ae) requireContext();
        this.A01 = new KED(requireContext(), this, userSession, Ak4, this.A02, A03, bundle2.getInt("args_selected_thumbnail_index"));
        C0f9.A09(1548199589, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-791162136);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_thumbnail_preview);
        C0f9.A09(1588675318, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-888823205);
        super.onDestroyView();
        ThumbnailPreviewFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(322232772, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-798952668);
        super.onPause();
        Iterator it = this.A01.A01.A05.iterator();
        while (it.hasNext()) {
            ((C9KJ) it.next()).A01();
        }
        C0f9.A09(-1059218324, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity activity;
        int A02 = C0f9.A02(-418372827);
        super.onResume();
        if (Build.VERSION.SDK_INT >= 34 && (activity = getActivity()) != null && activity.getDisplay() != null && getActivity().getDisplay().isHdrSdrRatioAvailable() && getActivity().getWindow() != null) {
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 0);
            if (C2J9.A06(userSession) && C18U.A06(C06090Tz.A06, userSession, 36321623594378892L)) {
                getActivity().getWindow().setColorMode(2);
            }
        }
        Iterator it = this.A01.A01.A05.iterator();
        while (it.hasNext()) {
            ((C9KJ) it.next()).A03();
        }
        C0f9.A09(656705631, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainer = view;
        this.A02.EDa(new Runnable() { // from class: X.PMB
            @Override // java.lang.Runnable
            public final void run() {
                ThumbnailPreviewFragment thumbnailPreviewFragment = ThumbnailPreviewFragment.this;
                ViewOnClickListenerC55460OkF.A00(thumbnailPreviewFragment.mContainer, 61, thumbnailPreviewFragment);
                thumbnailPreviewFragment.A0U(thumbnailPreviewFragment.A01);
                thumbnailPreviewFragment.A01.A0C();
            }
        });
    }
}
