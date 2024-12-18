package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LPu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48069LPu implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public ViewOnClickListenerC48069LPu(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, String str, int i) {
        C0fQ.A00(new ViewOnClickListenerC48069LPu(obj, obj2, str, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.Osu, java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        Lyrics lyrics;
        Object trackDataImpl;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1099296386);
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                c35133Fea.A02(context, AbstractC166987dD.A0o(((C32261EIv) this.A02).A09), new SimpleWebViewConfig(new SXK(AbstractC63260SgI.A01(context, this.A03))));
                i = -1451622077;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1388604971);
                C47258KuV c47258KuV = (C47258KuV) this.A01;
                String str2 = this.A03;
                C45502KCr c45502KCr = c47258KuV.A00;
                AbstractC43594JPz.A0N(c45502KCr.A09).A0G(VG4.A11, "media_cell");
                ((C44523JmT) c45502KCr.A0B.getValue()).A01(str2);
                i = 848093288;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-2017879779);
                C47259KuW c47259KuW = (C47259KuW) this.A01;
                String str3 = this.A03;
                C45503KCs c45503KCs = c47259KuW.A00;
                AbstractC43594JPz.A0N(c45503KCs.A0C).A0G(VG4.A11, "media_cell");
                ((C44523JmT) c45503KCs.A0F.getValue()).A01(str3);
                i = -1484516576;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-32297963);
                ((MOC) this.A01).DJh((ImageUrl) this.A02, this.A03);
                i = 75719155;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-299530313);
                String str4 = this.A03;
                if (str4 != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.A01;
                    IgAutoCompleteTextView igAutoCompleteTextView = ((C52155N6g) this.A02).A00;
                    if (igAutoCompleteTextView == null) {
                        C14360o3.A0F("textView");
                        throw C00O.createAndThrow();
                    }
                    linkedHashMap.put(str4, AbstractC167007dF.A0g(igAutoCompleteTextView));
                }
                InterfaceC09390do interfaceC09390do = ((C52155N6g) this.A02).A03;
                C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.A01;
                ?? obj = new Object();
                obj.A00 = linkedHashMap2;
                A0Q.A05(obj);
                AbstractC43593JPy.A1P(AbstractC166987dD.A0r(interfaceC09390do));
                i = 355863681;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(263747426);
                C45487KCc c45487KCc = (C45487KCc) this.A02;
                Jn3 jn3 = (Jn3) c45487KCc.A0j.getValue();
                FragmentActivity requireActivity = c45487KCc.requireActivity();
                C45068Jwx c45068Jwx = (C45068Jwx) this.A01;
                TrackData trackData = c45068Jwx.A03;
                int i2 = c45068Jwx.A01;
                int i3 = c45068Jwx.A00;
                String str5 = this.A03;
                AbstractC167007dF.A1F(trackData, 1, str5);
                boolean allowsSaving = trackData.getAllowsSaving();
                String artistId = trackData.getArtistId();
                String audioAssetId = trackData.getAudioAssetId();
                String audioClusterId = trackData.getAudioClusterId();
                trackData.AsE();
                ImageUrl AsF = trackData.AsF();
                String AvV = trackData.AvV();
                String dashManifest = trackData.getDashManifest();
                String displayArtist = trackData.getDisplayArtist();
                Integer Azi = trackData.Azi();
                String fastStartProgressiveDownloadUrl = trackData.getFastStartProgressiveDownloadUrl();
                Boolean BC4 = trackData.BC4();
                List BE6 = trackData.BE6();
                String id = trackData.getId();
                String igUsername = trackData.getIgUsername();
                Boolean CT1 = trackData.CT1();
                Boolean CTb = trackData.CTb();
                boolean isExplicit = trackData.isExplicit();
                LyricsIntf BPT = trackData.BPT();
                String progressiveDownloadUrl = trackData.getProgressiveDownloadUrl();
                String Bkl = trackData.Bkl();
                String BqC = trackData.BqC();
                String subtitle = trackData.getSubtitle();
                String title = trackData.getTitle();
                String CHM = trackData.CHM();
                ImageUrl AsF2 = trackData.AsF();
                if (trackData instanceof ImmutablePandoTrackData) {
                    TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                    C09530e4 A1L = AbstractC166987dD.A1L("allows_saving", Boolean.valueOf(allowsSaving));
                    C09530e4 A1L2 = AbstractC166987dD.A1L("artist_id", artistId);
                    C09530e4 A1L3 = AbstractC166987dD.A1L("audio_asset_id", audioAssetId);
                    C09530e4 A1L4 = AbstractC166987dD.A1L("audio_cluster_id", audioClusterId);
                    TreeUpdaterJNI treeUpdaterJNI2 = null;
                    if (AsF2 != null) {
                        str = AsF2.getUrl();
                    } else {
                        str = null;
                    }
                    C09530e4 A1L5 = AbstractC166987dD.A1L("cover_artwork_thumbnail_uri", str);
                    C09530e4 A1L6 = AbstractC166987dD.A1L("cover_artwork_uri", AsF.getUrl());
                    C09530e4 A1L7 = AbstractC166987dD.A1L("dark_message", AvV);
                    C09530e4 A1L8 = AbstractC166987dD.A1L("dash_manifest", dashManifest);
                    C09530e4 A1L9 = AbstractC166987dD.A1L("display_artist", displayArtist);
                    C09530e4 A1L10 = AbstractC166987dD.A1L("duration_in_ms", Azi);
                    C09530e4 A1L11 = AbstractC166987dD.A1L("fast_start_progressive_download_url", fastStartProgressiveDownloadUrl);
                    C09530e4 A1L12 = AbstractC166987dD.A1L("has_lyrics", BC4);
                    C09530e4 A1L13 = AbstractC166987dD.A1L("highlight_start_times_in_ms", BE6);
                    C09530e4 A1L14 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, id);
                    C09530e4 A1L15 = AbstractC166987dD.A1L("ig_username", igUsername);
                    C09530e4 A1L16 = AbstractC166987dD.A1L("is_eligible_for_audio_effects", CT1);
                    C09530e4 A1L17 = AbstractC166987dD.A1L("is_eligible_for_vinyl_sticker", CTb);
                    C09530e4 A1L18 = AbstractC166987dD.A1L("is_explicit", Boolean.valueOf(isExplicit));
                    if (BPT != null) {
                        treeUpdaterJNI2 = BPT.F7o();
                    }
                    trackDataImpl = AbstractC37303Gc4.A06(trackData, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, AbstractC166987dD.A1L("lyrics", treeUpdaterJNI2), AbstractC166987dD.A1L("progressive_download_url", progressiveDownloadUrl), AbstractC166987dD.A1L("reactive_audio_download_url", Bkl), AbstractC166987dD.A1L("sanitized_title", BqC), AbstractC166987dD.A1L("subtitle", subtitle), AbstractC166987dD.A1L(DialogModule.KEY_TITLE, title), AbstractC166987dD.A1L("web_30s_preview_download_url", CHM)});
                } else {
                    if (BPT != null) {
                        lyrics = BPT.EwA();
                    } else {
                        lyrics = null;
                    }
                    trackDataImpl = new TrackDataImpl(lyrics, AsF2, AsF, BC4, CT1, CTb, Azi, artistId, audioAssetId, audioClusterId, AvV, dashManifest, displayArtist, fastStartProgressiveDownloadUrl, id, igUsername, progressiveDownloadUrl, Bkl, BqC, subtitle, title, CHM, BE6, allowsSaving, isExplicit);
                }
                Bundle A0T = AbstractC167017dG.A0T("arg_music_note_original_author_id", str5, AbstractC166987dD.A1L("arg_music_to_preload", new AudioOverlayTrack(MusicAssetModel.A01((TrackData) trackDataImpl, false), i2, i3)));
                UserSession userSession = jn3.A02;
                AbstractC31177DnL.A0n(requireActivity, A0T, userSession, ModalActivity.class, "notes_creation");
                AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0H);
                new C4AA(userSession).A00(C05F.A0u);
                i = 855420342;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-844164531);
                C47566Kzc c47566Kzc = (C47566Kzc) this.A02;
                String str6 = this.A03;
                Activity activity = (Activity) this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("target_user_id", str6);
                if (str6 != null) {
                    AbstractC31176DnK.A0d(activity, A0b, c47566Kzc.A01, ModalActivity.class, "recs_from_friends_sender").A0C(activity);
                }
                UserSession userSession2 = c47566Kzc.A01;
                InterfaceC11380iw interfaceC11380iw = c47566Kzc.A00;
                L9S l9s = new L9S(interfaceC11380iw, userSession2);
                Long A0n = AbstractC25233BEq.A0n(str6);
                String moduleName = interfaceC11380iw.getModuleName();
                C14360o3.A0B(moduleName, 2);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(l9s.A00, "ig_recs_from_friends_xma_click_events");
                AbstractC31171DnF.A1C(A0f, "tap_sender_entry_point");
                A0f.A9K("target_id", A0n);
                AbstractC31171DnF.A1D(A0f, moduleName);
                A0f.Cht();
                i = 1447082036;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1326435724);
                ((C44562Jnj) this.A02).A03.invoke(this.A03, this.A01);
                i = -540200020;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-1871643388);
                IgdsCheckBox igdsCheckBox = ((C44680JqP) this.A01).A01;
                igdsCheckBox.setChecked(!igdsCheckBox.isChecked());
                boolean isChecked = igdsCheckBox.isChecked();
                List list = ((C44557Jnd) this.A02).A01;
                String str7 = this.A03;
                if (isChecked) {
                    list.add(str7);
                } else {
                    list.remove(str7);
                }
                i = 1888205610;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
