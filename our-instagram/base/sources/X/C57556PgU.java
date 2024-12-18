package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import go.Seq;
import java.lang.reflect.Proxy;

/* renamed from: X.PgU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57556PgU extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57556PgU(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(C57556PgU c57556PgU) {
        return (View) ((C56161OwT) c57556PgU.A01).A06.getValue();
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C57556PgU(obj, i));
    }

    public final C23851Ah3 A02() {
        C82M c82m;
        String str;
        OyP oyP = (OyP) this.A01;
        AbstractC59962oe abstractC59962oe = oyP.A05;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(180));
        C018307d viewModelStore = requireActivity.getViewModelStore();
        FragmentActivity requireActivity2 = abstractC59962oe.requireActivity();
        UserSession userSession = oyP.A06;
        C1810981l c1810981l = (C1810981l) new C52942bb(new C1810881k(requireActivity2, userSession, false, false), viewModelStore, C52962bd.A00).A00(C1810981l.class);
        C81S c81s = C81S.A00;
        C22P c22p = C22P.A2y;
        c1810981l.A0F(c22p, c81s);
        FragmentActivity requireActivity3 = abstractC59962oe.requireActivity();
        C1815483h c1815483h = new C1815483h(null, null, c1810981l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false);
        C14360o3.A0B(c22p, 0);
        AnonymousClass840 anonymousClass840 = new AnonymousClass840(c22p, new C1816783z(c1815483h), null);
        InterfaceC09390do interfaceC09390do = oyP.A0C;
        C1809981b c1809981b = (C1809981b) interfaceC09390do.getValue();
        Integer num = C05F.A08;
        C57556PgU c57556PgU = new C57556PgU(oyP, 9);
        C57556PgU c57556PgU2 = new C57556PgU(oyP, 10);
        C57556PgU c57556PgU3 = new C57556PgU(oyP, 11);
        if (!C2B0.A00(num)) {
            c82m = (C82M) c57556PgU.invoke();
        } else {
            Object newProxyInstance = Proxy.newProxyInstance(C8AC.class.getClassLoader(), new Class[]{C8AC.class}, new B0E(new C82K(c1809981b, num, c57556PgU, c57556PgU2, c57556PgU3, true)));
            if (newProxyInstance != null) {
                c82m = (C8AC) newProxyInstance;
            } else {
                throw AbstractC166987dD.A15("null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystem");
            }
        }
        C8AD c8ad = (C8AD) c82m;
        C1809981b c1809981b2 = (C1809981b) interfaceC09390do.getValue();
        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
        View view = oyP.A04;
        InteractiveDrawableContainer interactiveDrawableContainer = oyP.A03;
        if (interactiveDrawableContainer == null) {
            str = "interactiveDrawableContainer";
        } else {
            C3I9 c3i9 = oyP.A07;
            TargetViewSizeProvider targetViewSizeProvider = (TargetViewSizeProvider) oyP.A0E.getValue();
            ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = oyP.A02;
            if (viewOnTouchListenerC1829889t == null) {
                str = "eyedropperColorPickerController";
            } else {
                C183738Cy c183738Cy = new C183738Cy();
                C8C0 c8c0 = (C8C0) oyP.A0B.getValue();
                C8D9 c8d9 = oyP.A01;
                if (c8d9 == null) {
                    str = "colorPaletteController";
                } else {
                    return new C23851Ah3(requireActivity3, view, A00, abstractC59962oe, abstractC59962oe, userSession, c3i9, c1810981l, targetViewSizeProvider, anonymousClass840, c8d9, viewOnTouchListenerC1829889t, c8c0, oyP, c8ad, c183738Cy, c1809981b2, interactiveDrawableContainer, oyP);
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        switch (this.A00) {
            case 1:
                return new NBX((UserSession) this.A01);
            case 2:
                view = ((OyP) this.A01).A04;
                i = R.id.clear_button;
                break;
            case 3:
                view = ((OyP) this.A01).A04;
                i = R.id.done_button;
                break;
            case 4:
                view = ((OyP) this.A01).A04;
                i = R.id.iglive_floating_button_picker_stub;
                break;
            case 5:
                OyP oyP = (OyP) this.A01;
                AbstractC59962oe abstractC59962oe = oyP.A05;
                Context requireContext = abstractC59962oe.requireContext();
                UserSession userSession = oyP.A06;
                C8C0 c8c0 = new C8C0(requireContext, AbstractC167007dF.A0L(oyP.A0A), abstractC59962oe.getViewLifecycleOwner(), null, userSession, null, (TargetViewSizeProvider) oyP.A0E.getValue(), null, null, null, null, null, R.drawable.floating_button_background, false, false, false);
                c8c0.A0P.setVisibility(0);
                return c8c0;
            case 6:
            case 25:
            case 30:
            case 45:
                return this.A01;
            case 7:
            case 26:
            case 31:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 8:
            case 27:
            case 32:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
            case 10:
            case 11:
                OyP oyP2 = (OyP) this.A01;
                UserSession userSession2 = oyP2.A06;
                AbstractC59962oe abstractC59962oe2 = oyP2.A05;
                return new C8AC(abstractC59962oe2, abstractC59962oe2, userSession2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return A02();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                OyP oyP3 = (OyP) this.A01;
                return AbstractC58002lE.A00(oyP3.A05.requireActivity(), oyP3.A06);
            case 14:
                return new NBY(((OyP) this.A01).A06);
            case Process.SIGTERM /* 15 */:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.live_badges_button;
                break;
            case 16:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.live_expand_button;
                break;
            case 17:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.heart_button;
                break;
            case 18:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.live_invite_button;
                break;
            case Process.SIGSTOP /* 19 */:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.new_requests_to_join_badge;
                break;
            case 20:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.live_options_button;
                break;
            case 21:
                view = ((C56163OwV) this.A01).A02;
                View findViewById = view.findViewById(R.id.qa_mode_button_with_badge);
                if (findViewById != null) {
                    return findViewById;
                }
                i = R.id.qa_mode_button;
                break;
            case 22:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.qa_mode_button_unread_count_badge;
                break;
            case 23:
                view = ((C56163OwV) this.A01).A02;
                View findViewById2 = view.findViewById(R.id.live_rooms_button_with_badge);
                if (findViewById2 != null) {
                    return findViewById2;
                }
                i = R.id.live_rooms_button;
                break;
            case 24:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.direct_share_button;
                break;
            case 28:
                view = ((C56163OwV) this.A01).A02;
                i = R.id.ssi_broadcaster_button;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C56163OwV c56163OwV = (C56163OwV) this.A01;
                int ordinal = c56163OwV.A06.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        return new NCI(c56163OwV.A03, c56163OwV.A04);
                    }
                    return new NBZ(c56163OwV.A04);
                }
                return new C52259NBa(c56163OwV.A04);
            case 33:
                return new C52260NBb((UserSession) this.A01);
            case 34:
                View view2 = ((C56161OwT) this.A01).A04;
                if (view2.findViewById(R.id.iglive_chain_preview_view_stub) != null) {
                    return AbstractC50523MSb.A07(view2, R.id.iglive_chain_preview_view_stub);
                }
                View findViewById3 = view2.findViewById(R.id.iglive_chain_preview_view);
                C14360o3.A0A(findViewById3);
                return findViewById3;
            case 35:
                view = A00(this);
                i = R.id.reel_viewer_profile_picture;
                break;
            case 36:
                view = A00(this);
                i = R.id.iglive_chain_preview_header_layout;
                break;
            case 37:
                view = A00(this);
                i = R.id.iglive_header_main_text;
                break;
            case 38:
                return new C72993Pa(A00(this));
            case 39:
                view = A00(this);
                i = R.id.iglive_chain_preview_main_text;
                break;
            case 40:
                view = A00(this);
                i = R.id.iglive_header_options;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                view = A00(this);
                i = R.id.iglive_chain_preview_segmented_progress_bar;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                view = A00(this);
                i = R.id.iglive_chain_preview_thumbnail_image;
                break;
            case 43:
                view = A00(this);
                i = R.id.iglive_watch_live_button;
                break;
            case 44:
                view = A00(this);
                i = R.id.iglive_chain_preview_whos_watching_text;
                break;
            case 48:
                return new C52261NBc((UserSession) this.A01);
            case 49:
                Context context = ((OF2) this.A01).A01;
                PJ4 pj4 = new PJ4(context);
                pj4.A05.setText(AbstractC166997dE.A0p(context, 2131954754));
                return pj4;
        }
        return view.findViewById(i);
    }
}
