package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class N5S extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AudioTranslationsOptionsFragment";
    public int A00;
    public IgTextView A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0D;
    public final String A0E = "audio_translations_option_fragment";
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131955326);
        interfaceC56362iU.AAF(new ViewOnClickListenerC28666ClE(this, 61), 2131961124);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((ClipsSharingDraftViewModel) MSY.A0c(new C57515Pfp(this, 36), new C57515Pfp(this, 37), new D8J(33, null, this), AbstractC25225BEi.A1D(ClipsSharingDraftViewModel.class))).A00.A06(getViewLifecycleOwner(), new BY8(16, new C30170DRa(23, this, view)));
    }

    public static final void A00(N5S n5s) {
        String str;
        ((C50985Mfs) n5s.A0B.getValue()).A01(false);
        IgdsListCell igdsListCell = n5s.A02;
        if (igdsListCell == null) {
            str = "audioTranslationOptInToggle";
        } else {
            igdsListCell.setChecked(false);
            IgdsListCell igdsListCell2 = n5s.A03;
            if (igdsListCell2 == null) {
                str = "audioTranslationsLanguageSelector";
            } else {
                igdsListCell2.setVisibility(8);
                AbstractC25233BEq.A14(n5s);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r4.A07 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.N5S r4, boolean r5) {
        /*
            com.instagram.igds.components.textcell.IgdsListCell r1 = r4.A03
            if (r1 != 0) goto Le
            java.lang.String r0 = "audioTranslationsLanguageSelector"
        L6:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            r3 = 0
            int r0 = X.AbstractC167007dF.A05(r5)
            r1.setVisibility(r0)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r4.A04
            if (r2 != 0) goto L1d
            java.lang.String r0 = "lipSyncOptInToggle"
            goto L6
        L1d:
            if (r5 == 0) goto L24
            boolean r1 = r4.A07
            r0 = 0
            if (r1 != 0) goto L26
        L24:
            r0 = 8
        L26:
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r1 != 0) goto L30
            java.lang.String r0 = "lipSyncOptInToggleSubtitle"
            goto L6
        L30:
            if (r5 == 0) goto L3a
            boolean r0 = r4.A07
            if (r0 == 0) goto L3a
        L36:
            r1.setVisibility(r3)
            return
        L3a:
            r3 = 8
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5S.A01(X.N5S, boolean):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public N5S() {
        C0YZ A1D = AbstractC25225BEi.A1D(C50985Mfs.class);
        this.A0B = AbstractC25225BEi.A0a(new C57515Pfp(this, 38), new C57515Pfp(this, 39), new D8J(34, null, this), A1D);
        this.A0D = AbstractC09440dt.A01(new C57515Pfp(this, 40));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(173233630);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = AbstractC153636vY.A01(requireArguments, "clips_share_sheet_draft_info_session_id");
        this.A09 = requireArguments.getBoolean("clips_is_voice_translations_on", false);
        this.A08 = requireArguments.getBoolean("clips_is_lip_sync_on", false);
        this.A00 = requireArguments.getInt("clips_selected_languages_count", 0);
        C0f9.A09(1161237862, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2101953834);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_audio_translations_options_fragment, false);
        C0f9.A09(-1885140476, A02);
        return A0R;
    }
}
