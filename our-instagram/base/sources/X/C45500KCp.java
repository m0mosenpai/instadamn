package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.creation.base.CreationSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.KCp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45500KCp extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ComposerMusicEditorFragment";
    public ListView A00;
    public AudioOverlayTrack A01;
    public C189988bH A02;
    public AnonymousClass878 A03;
    public AnonymousClass840 A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC60122ou A08 = new C48227LWc(this, 0);
    public final C49520LuZ A07 = new C49520LuZ(this, 1);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "composer_music_editor_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A06;
        C189988bH c189988bH = new C189988bH((ViewStub) AbstractC166987dD.A0c(view, R.id.composer_music_editor_stub), new C9B8(0, 0, 7, 1, false), this, AbstractC166987dD.A0r(interfaceC09390do), null, this.A07, C8BO.A09, 0, false, false, false, true, false, false);
        this.A02 = c189988bH;
        AnonymousClass878 anonymousClass878 = this.A03;
        if (anonymousClass878 != null) {
            c189988bH.A0b = anonymousClass878;
            AudioOverlayTrack audioOverlayTrack = this.A01;
            if (audioOverlayTrack != null) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    if (this.A05) {
                        c189988bH.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                    } else {
                        c189988bH.A0L(musicAssetModel, false);
                    }
                }
                ListView listView = (ListView) view.findViewById(R.id.preview_list_view);
                C14360o3.A0B(listView, 0);
                this.A00 = listView;
                C49534Lun c49534Lun = new C49534Lun(this);
                AnonymousClass840 anonymousClass840 = this.A04;
                if (anonymousClass840 != null) {
                    KED ked = new KED(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do), anonymousClass840, c49534Lun, C38U.A00, 0.0f);
                    ListView listView2 = this.A00;
                    if (listView2 != null) {
                        listView2.setAdapter((ListAdapter) ked);
                        ked.A0C();
                    } else {
                        str = "previewListView";
                    }
                }
                if (this.A05) {
                    ViewOnClickListenerC48063LPo.A00(AbstractC43594JPz.A0F(view, R.id.composer_music_remove_song_stub), 44, this);
                }
                C56342iS.A01(new ViewOnClickListenerC48063LPo(this, 45), (ViewGroup) AbstractC166987dD.A0c(view, R.id.action_bar_container)).A0X(this.A08);
                return;
            }
            str = "audioTrack";
        } else {
            str = "musicSyncController";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1599272119);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) AbstractC153636vY.A00(requireArguments, AudioOverlayTrack.class, "args_audio_track");
        C14360o3.A0B(audioOverlayTrack, 0);
        this.A01 = audioOverlayTrack;
        CreationSession creationSession = (CreationSession) AbstractC153636vY.A00(requireArguments, CreationSession.class, "args_creation_session");
        C22P c22p = C22P.values()[requireArguments.getInt("args_creation_entry_point")];
        InterfaceC09390do interfaceC09390do = this.A06;
        this.A04 = MX9.A00(c22p, AbstractC166987dD.A0r(interfaceC09390do), creationSession, new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false));
        this.A05 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
        this.A03 = new AnonymousClass878(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this, AbstractC43594JPz.A0h(requireContext(), interfaceC09390do), new C49522Lub(this, 2));
        C0f9.A09(1712696265, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-41149451);
        C14360o3.A0B(layoutInflater, 0);
        if (!C1H6.A03()) {
            layoutInflater = AbstractC43593JPy.A0C(requireContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.fragment_composer_music_editor, false);
        C0f9.A09(-944060188, A02);
        return A0C;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1872970449);
        super.onPause();
        AnonymousClass878 anonymousClass878 = this.A03;
        if (anonymousClass878 != null) {
            anonymousClass878.onPause();
            C0f9.A09(-241560291, A02);
        } else {
            C14360o3.A0F("musicSyncController");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1057052321);
        super.onResume();
        AnonymousClass878 anonymousClass878 = this.A03;
        if (anonymousClass878 != null) {
            anonymousClass878.onResume();
            C0f9.A09(502166825, A02);
        } else {
            C14360o3.A0F("musicSyncController");
            throw C00O.createAndThrow();
        }
    }
}
