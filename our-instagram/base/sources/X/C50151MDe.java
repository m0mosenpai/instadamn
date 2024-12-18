package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.data.SoundSyncSuggestedAudioNetworkDataSource;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MDe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50151MDe extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50151MDe(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MRI c48605Leh;
        switch (this.A00) {
            case 0:
                String str = ((C9LN) this.A01).A0V;
                if (str != null) {
                    return str;
                }
                return "";
            case 1:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                return AbstractC166997dE.A0c(AbstractC166997dE.A0U(abstractC12990ll), abstractC12990ll, 36323741013192254L);
            case 2:
                KCE kce = (KCE) this.A01;
                return new C47540Kz8(AbstractC166987dD.A0r(kce.A0D), kce.requireContext());
            case 3:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_empty_state_layout);
            case 4:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_empty_state_subtitle);
            case 5:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_empty_state_title);
            case 6:
                return Integer.valueOf(((C41711wL) ((KCE) this.A01).A09.getValue()).A09());
            case 7:
                return C41711wL.A01(AbstractC166987dD.A0r(((KCE) this.A01).A0D));
            case 8:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_item_recycler_view);
            case 9:
                KCE kce2 = (KCE) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(kce2.A0D);
                C44535Jmf c44535Jmf = (C44535Jmf) kce2.A0F.getValue();
                C47942LFs c47942LFs = kce2.A03;
                return new JnF(kce2.requireActivity(), kce2.requireActivity().getLifecycle(), kce2, A0r, c47942LFs, c44535Jmf);
            case 10:
                return new LinearLayoutManager(AbstractC31172DnG.A07(this.A01), 0, false);
            case 11:
                return new C44220JgP(this.A01, 5);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return this.A01;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 43:
                return AbstractC25226BEj.A1C(this.A01);
            case 14:
            case 44:
                return AbstractC167027dH.A0B(this.A01);
            case Process.SIGTERM /* 15 */:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_subtitle);
            case 16:
                KCE kce3 = (KCE) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(kce3.A0D);
                return new KGV(kce3.requireActivity(), kce3.requireContext(), AbstractC018607g.A00(kce3), A0r2);
            case 17:
                return JQ0.A0F(this.A01).findViewById(R.id.clips_acr_browser_primary_button);
            case 18:
                return new C47788L8u((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                ClipsACRBrowserPagingSource clipsACRBrowserPagingSource = (ClipsACRBrowserPagingSource) this.A01;
                Context context = clipsACRBrowserPagingSource.A01;
                UserSession userSession = clipsACRBrowserPagingSource.A03;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                C14360o3.A0B(A00, 2);
                return new C55209OeS(context, userSession, A00);
            case 20:
                C55333Ogw c55333Ogw = (C55333Ogw) this.A01;
                AbstractC24321Hb.A00(c55333Ogw.A02).A00(false);
                c55333Ogw.A01.A08(0.0f);
                c55333Ogw.A00.A03(c55333Ogw);
                break;
            case 21:
                C47541Kz9 c47541Kz9 = ((C44535Jmf) this.A01).A04;
                return new ClipsACRBrowserPagingSource(c47541Kz9.A01, c47541Kz9.A00);
            case 22:
                return new C41185IKy((UserSession) this.A01);
            case 23:
                ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository = (ClipsSoundSyncMediaImportRepository) this.A01;
                Context context2 = clipsSoundSyncMediaImportRepository.A06;
                UserSession userSession2 = clipsSoundSyncMediaImportRepository.A07;
                AbstractC167017dG.A1N(context2, userSession2);
                return C2Ps.A00(context2, userSession2);
            case 24:
                return new OGx((SoundSyncSuggestedAudioNetworkDataSource) this.A01);
            case 25:
            case 45:
            default:
                return AbstractC166997dE.A0S((View) this.A01, R.id.text_overlay_edit_text_container);
            case 26:
                return ((View) this.A01).requireViewById(R.id.done_button);
            case 27:
                return AbstractC166997dE.A0X((View) this.A01, R.id.before_and_after_sticker_stub);
            case 28:
                C46050Ka5 c46050Ka5 = (C46050Ka5) this.A01;
                Serializable serializable = c46050Ka5.requireArguments().getSerializable("ARGUMENT_CAMERA_SETTINGS_MODE");
                C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.camerasettings.constants.CameraSettingsMode");
                int ordinal = ((EnumC46157Kbv) serializable).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        FragmentActivity requireActivity = c46050Ka5.requireActivity();
                        UserSession A0r3 = AbstractC166987dD.A0r(c46050Ka5.A01);
                        Context requireContext = c46050Ka5.requireContext();
                        Resources A0N = AbstractC166997dE.A0N(c46050Ka5);
                        EnumC53140Net enumC53140Net = EnumC53140Net.A04;
                        AbstractC167007dF.A1F(A0r3, 2, A0N);
                        c48605Leh = new C56255Oy2(requireContext, A0N, requireActivity, A0r3, enumC53140Net, c46050Ka5);
                    } else {
                        throw AbstractC166987dD.A14("Not a valid camera settings mode");
                    }
                } else {
                    c48605Leh = new C48605Leh(c46050Ka5.requireActivity(), c46050Ka5.requireContext(), AbstractC166987dD.A0r(c46050Ka5.A01));
                }
                C14360o3.A0A(c48605Leh);
                c48605Leh.EcQ(new C48604Leg(c46050Ka5, c48605Leh));
                return c48605Leh;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ABX(C1OU.A04((UserSession) this.A01));
            case 30:
                C47692L3z c47692L3z = (C47692L3z) this.A01;
                UserSession userSession3 = c47692L3z.A01;
                InterfaceC169497hP interfaceC169497hP = (InterfaceC169497hP) c47692L3z.A03.getValue();
                C14360o3.A0B(interfaceC169497hP, 0);
                return AbstractC65980TxZ.A01(userSession3, null, (C24036AlV) c47692L3z.A04.getValue(), null, interfaceC169497hP, C05F.A00, false);
            case 31:
                C47692L3z c47692L3z2 = (C47692L3z) this.A01;
                return new C24036AlV(c47692L3z2.A01, c47692L3z2.A00);
            case 32:
                C47692L3z c47692L3z3 = (C47692L3z) this.A01;
                return AbstractC183898Dp.A00(c47692L3z3.A00, c47692L3z3.A01, "story_user_tag_page", true, false);
            case 33:
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC31172DnG.A1H(((C70827Whk) this.A01).A00.getResources(), A0K, 2131974569);
                return A0K.A00();
            case 34:
                return ((C70827Whk) this.A01).A02.requireViewById(R.id.character_count_text);
            case 35:
                return AbstractC166997dE.A0S((View) this.A01, R.id.post_capture_texture_view_container);
            case 36:
                C146106i8 A0K2 = AbstractC31171DnF.A0K();
                AbstractC31172DnG.A1H(((C70827Whk) this.A01).A00.getResources(), A0K2, 2131974565);
                A0K2.A01 = 4500;
                A0K2.A0J = true;
                return A0K2.A00();
            case 37:
                return AbstractC166997dE.A0S(((C70827Whk) this.A01).A02, R.id.story_caption_hashtag_suggestions_container);
            case 38:
                return AbstractC166997dE.A0S((View) this.A01, R.id.post_capture_interactive_contents_container);
            case 39:
                return AbstractC166997dE.A0S(((C70827Whk) this.A01).A02, R.id.mention_tagging_container);
            case 40:
                C70827Whk.A00((C70827Whk) this.A01).A08();
                break;
            case Seq.NULL_REFNUM /* 41 */:
                C70827Whk.A00((C70827Whk) this.A01).A07();
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC166997dE.A0X((View) this.A01, R.id.join_chat_sticker_editor_stub);
            case 47:
                return AbstractC166997dE.A0X((View) this.A01, R.id.subscriber_chat_sticker_editor_stub);
            case 48:
                final C1810981l c1810981l = (C1810981l) this.A01;
                return new InterfaceC184358Fz(c1810981l) { // from class: X.8Fy
                    public final C1810981l A00;
                    public final C8G0 A01;
                    public final Map A02;

                    /* JADX WARN: Type inference failed for: r0v2, types: [X.8G0, java.lang.Object] */
                    {
                        C14360o3.A0B(c1810981l, 1);
                        this.A00 = c1810981l;
                        this.A02 = new LinkedHashMap();
                        this.A01 = new Object();
                    }

                    @Override // X.C82M
                    public final /* synthetic */ void A7T(Parcelable parcelable) {
                    }

                    private final C8G1 A00() {
                        C8G1 c8g1 = (C8G1) this.A02.get(this.A00.A08.A00);
                        if (c8g1 == null) {
                            return this.A01;
                        }
                        return c8g1;
                    }

                    @Override // X.InterfaceC184358Fz
                    public final void A81(C55U c55u, C8G1 c8g1) {
                        this.A02.put(c55u, c8g1);
                    }

                    @Override // X.C82M
                    public final /* synthetic */ Parcelable ANh() {
                        return null;
                    }

                    @Override // X.InterfaceC184358Fz
                    public final int CW4() {
                        return A00().CW4();
                    }

                    @Override // X.InterfaceC184358Fz
                    public final boolean CdL() {
                        return A00().CdL();
                    }

                    @Override // X.InterfaceC184358Fz
                    public final boolean Ce7() {
                        return A00().Ce7();
                    }

                    @Override // X.InterfaceC184358Fz
                    public final boolean DIq() {
                        return A00().DIq();
                    }

                    @Override // X.InterfaceC184358Fz
                    public final boolean DIr() {
                        return A00().DIr();
                    }

                    @Override // X.InterfaceC184358Fz
                    public final void DmE() {
                        A00().DmE();
                    }
                };
            case 49:
                return new C23825Aga((UserSession) this.A01);
        }
        return C0eB.A00;
    }
}
