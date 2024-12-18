package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.KCq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45501KCq extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "FeedReplaceAudioMusicEditorFragment";
    public AudioOverlayTrack A00;
    public C189988bH A01;
    public String A02;
    public String A03;
    public AnonymousClass878 A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC60122ou A08 = new C48227LWc(this, 1);
    public final C49520LuZ A07 = new C49520LuZ(this, 2);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_replace_audio_music_editor_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (X.AbstractC81033jX.A03(r2) == false) goto L25;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r13 = 0
            r1 = r21
            X.C14360o3.A0B(r1, r13)
            r8 = r20
            r0 = r22
            super.onViewCreated(r1, r0)
            X.0do r2 = r8.A06
            com.instagram.common.session.UserSession r9 = X.AbstractC166987dD.A0r(r2)
            r0 = 2131432838(0x7f0b1586, float:1.8487445E38)
            android.view.View r6 = X.AbstractC166987dD.A0c(r1, r0)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            r14 = 7
            r10 = 0
            r17 = 1
            X.9B8 r7 = new X.9B8
            r11 = r7
            r12 = r13
            r15 = r17
            r16 = r13
            r11.<init>(r12, r13, r14, r15, r16)
            X.LuZ r11 = r8.A07
            X.8BO r12 = X.C8BO.A09
            X.8bH r5 = new X.8bH
            r14 = r13
            r15 = r13
            r18 = r13
            r19 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8.A01 = r5
            X.878 r0 = r8.A04
            if (r0 != 0) goto L4a
            java.lang.String r0 = "musicSyncController"
        L42:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4a:
            r5.A0b = r0
            com.instagram.music.common.model.AudioOverlayTrack r4 = r8.A00
            if (r4 == 0) goto L77
            com.instagram.music.common.model.MusicAssetModel r3 = r4.A08
            if (r3 == 0) goto L5d
            boolean r0 = r8.A05
            if (r0 == 0) goto L73
            int r0 = r4.A03
            r5.A0K(r3, r0, r13)
        L5d:
            r0 = 2131438177(0x7f0b2a61, float:1.8498274E38)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = X.AbstractC31172DnG.A0a(r1, r0)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r2)
            X.1DX r2 = X.C1DW.A00(r0)
            java.lang.String r0 = r8.A02
            if (r0 != 0) goto L7a
            java.lang.String r0 = "mediaId"
            goto L42
        L73:
            r5.A0L(r3, r13)
            goto L5d
        L77:
            java.lang.String r0 = "audioTrack"
            goto L42
        L7a:
            X.1qM r3 = r2.A02(r0)
            if (r3 == 0) goto L92
            android.net.Uri r2 = r3.A05
            boolean r0 = r3.A4w()
            if (r0 == 0) goto Lbc
            if (r2 == 0) goto Lbc
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.AbstractC81033jX.A00(r2, r0, r0)
        L8f:
            r4.setUrl(r2, r8)
        L92:
            boolean r0 = r8.A05
            if (r0 == 0) goto La2
            r0 = 2131432839(0x7f0b1587, float:1.8487447E38)
            android.view.View r2 = X.AbstractC43594JPz.A0F(r1, r0)
            r0 = 49
            X.ViewOnClickListenerC48063LPo.A00(r2, r0, r8)
        La2:
            r0 = 2131427525(0x7f0b00c5, float:1.8476669E38)
            android.view.View r2 = X.AbstractC166987dD.A0c(r1, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 50
            X.LPo r0 = new X.LPo
            r0.<init>(r8, r1)
            X.2iT r1 = X.C56342iS.A01(r0, r2)
            X.2ou r0 = r8.A08
            r1.A0X(r0)
            return
        Lbc:
            android.content.Context r0 = r8.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r3.A1q(r0)
            if (r2 == 0) goto L92
            boolean r0 = X.AbstractC81033jX.A03(r2)
            if (r0 != 0) goto L92
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45501KCq.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(278062651);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("args_audio_track");
        if (parcelable != null) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcelable;
            C14360o3.A0B(audioOverlayTrack, 0);
            this.A00 = audioOverlayTrack;
            String string = requireArguments.getString("args_media_id");
            if (string != null) {
                this.A02 = string;
                this.A05 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
                this.A03 = AbstractC31172DnG.A13(requireArguments, "args_music_browse_session_full_id");
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A06;
                this.A04 = new AnonymousClass878(requireContext, AbstractC166987dD.A0r(interfaceC09390do), this, AbstractC43594JPz.A0h(requireContext(), interfaceC09390do), new C49522Lub(this, 4));
                C0f9.A09(1861832406, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -2111075997;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -18736887;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(765772371);
        C14360o3.A0B(layoutInflater, 0);
        if (!C1H6.A03()) {
            layoutInflater = AbstractC43593JPy.A0C(requireContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.feed_replace_audio_music_editor, false);
        C0f9.A09(-980829457, A02);
        return A0C;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(917517439);
        super.onPause();
        AnonymousClass878 anonymousClass878 = this.A04;
        if (anonymousClass878 == null) {
            C14360o3.A0F("musicSyncController");
            throw C00O.createAndThrow();
        }
        anonymousClass878.onPause();
        C0f9.A09(1400823693, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1656682704);
        super.onResume();
        AnonymousClass878 anonymousClass878 = this.A04;
        if (anonymousClass878 == null) {
            C14360o3.A0F("musicSyncController");
            throw C00O.createAndThrow();
        }
        anonymousClass878.onResume();
        C0f9.A09(93092824, A02);
    }
}
