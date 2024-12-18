package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.KCk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45495KCk extends AbstractC59962oe implements InterfaceC185968Mq {
    public static final String __redex_internal_original_name = "ClipsEditMusicEditorFragment";
    public C87A A00;
    public C38321qM A01;
    public AudioOverlayTrack A02;
    public C189988bH A03;
    public C4QW A04;
    public String A05;
    public boolean A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final C49686LxH A09 = new C49686LxH(this);
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C57537PgB(this, 43));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_edit_metadata_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A08;
        C189988bH c189988bH = new C189988bH((ViewStub) AbstractC166987dD.A0c(view, R.id.music_editor_stub), new C9B8(0, 0, 7, 1, false), this, AbstractC166987dD.A0r(interfaceC09390do), null, (C49520LuZ) this.A07.getValue(), C8BO.A09, 0, false, false, false, true, false, false);
        this.A03 = c189988bH;
        c189988bH.A0b = A00();
        String str = this.A05;
        if (str != null) {
            FVK.A01(AbstractC166987dD.A0r(interfaceC09390do), C1GJ.A01(), new C49377LsB(2, view, this), str);
            return;
        }
        C14360o3.A0F("mediaId");
        throw C00O.createAndThrow();
    }

    public final C87A A00() {
        C87A c87a = this.A00;
        if (c87a != null) {
            return c87a;
        }
        C14360o3.A0F("musicSyncController");
        throw C00O.createAndThrow();
    }

    public final C4QW A01() {
        C4QW c4qw = this.A04;
        if (c4qw != null) {
            return c4qw;
        }
        C14360o3.A0F("videoPlayer");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.InterfaceC185968Mq
    public final void Eo6() {
        if (A00().AG5(this)) {
            A01().EMg(0, false);
            A01().E4T("autoplay", true);
            A00().E03();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1970406023);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("args_audio_track");
        if (parcelable != null) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcelable;
            C14360o3.A0B(audioOverlayTrack, 0);
            this.A02 = audioOverlayTrack;
            String A01 = AbstractC153636vY.A01(requireArguments, "args_media_id");
            C14360o3.A0B(A01, 0);
            this.A05 = A01;
            this.A06 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
            Context requireContext = requireContext();
            C49686LxH c49686LxH = this.A09;
            InterfaceC09390do interfaceC09390do = this.A08;
            this.A04 = C4QS.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), null, c49686LxH, "clips_edit_metadata_preview");
            this.A00 = new C87A(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC43594JPz.A0h(requireContext(), interfaceC09390do));
            A00().A00 = new C48619Lev(this);
            C0f9.A09(308406064, A02);
            return;
        }
        IllegalArgumentException A0n = AbstractC25227BEk.A0n();
        C0f9.A09(2024592625, A02);
        throw A0n;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(655174875);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_clips_edit_music_editor, viewGroup, false);
        C0f9.A09(1515935744, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(845473286);
        super.onDestroy();
        A01().EE4("fragment_paused");
        C0f9.A09(-1373839473, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1864506394);
        super.onPause();
        A00().DOs();
        C0f9.A09(-8701819, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-968042829);
        super.onResume();
        A00().DOt();
        Eo6();
        C0f9.A09(252207446, A02);
    }
}
