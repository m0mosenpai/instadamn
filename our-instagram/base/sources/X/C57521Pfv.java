package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pfv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57521Pfv extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57521Pfv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new C57521Pfv(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        Context context2;
        NI6 ni6;
        OGt oGt;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        ViewStub viewStub;
        switch (this.A00) {
            case 0:
            case 16:
                return AbstractC167027dH.A0B(this.A01);
            case 1:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) this.A01;
                C48625Lf1 c48625Lf1 = clipsStackedTimelineFragment.A08;
                if (c48625Lf1 != null) {
                    c48625Lf1.A01();
                }
                C48625Lf1 c48625Lf12 = clipsStackedTimelineFragment.A08;
                if (c48625Lf12 != null) {
                    c48625Lf12.A07.A0w(AbstractC43591JPw.A00(328));
                }
                ((C50865Mdw) clipsStackedTimelineFragment.A15.getValue()).A0E();
                return C0eB.A00;
            case 2:
                ClipsCreationViewModel clipsCreationViewModel = ((ClipsStackedTimelineFragment) this.A01).A0Z;
                if (clipsCreationViewModel == null) {
                    C14360o3.A0F("clipsCreationViewModel");
                    throw C00O.createAndThrow();
                }
                return Integer.valueOf(MSW.A04(clipsCreationViewModel));
            case 3:
                return new Handler(((C51165Mj8) this.A01).A0B.getMainLooper());
            case 4:
                NI6.A00((NI6) this.A01);
                return C0eB.A00;
            case 5:
                NI6 ni62 = (NI6) this.A01;
                C51165Mj8 c51165Mj8 = ni62.A0C;
                NIX nix = ni62.A0J;
                int A07 = MSZ.A07(((AbstractC50863Mdu) nix).A01);
                Integer[] numArr = ni62.A0B.A02;
                c51165Mj8.A01(A07, MSW.A07(numArr, 0), MSW.A07(numArr, 1));
                return Boolean.valueOf(nix.A0Y(ni62.A01, MSW.A07(numArr, 0), MSW.A07(numArr, 1), true, true));
            case 6:
                NI6 ni63 = (NI6) this.A01;
                Integer[] numArr2 = ni63.A0B.A02;
                NI6.A03(ni63, MSW.A07(numArr2, 0), MSW.A07(numArr2, 1));
                return C0eB.A00;
            case 7:
                context = ((NI6) this.A01).A07;
                return Integer.valueOf((int) (((int) (AbstractC167017dG.A0B(context) / AbstractC50522MSa.A00(context, OZQ.A00))) * 0.5d));
            case 8:
                NI6 ni64 = (NI6) this.A01;
                context2 = ni64.A07;
                ni6 = ni64;
                return Integer.valueOf((int) (((OXZ) ni6).A00 / AbstractC50522MSa.A00(context2, OZQ.A00)));
            case 9:
                NI5 ni5 = (NI5) this.A01;
                C50868Mdz c50868Mdz = ni5.A0K;
                Context context3 = ni5.A07;
                int i = ((OXZ) ni5).A00;
                if (!c50868Mdz.A0Z() && !(c50868Mdz.A0F.A0E() instanceof C187508Ss)) {
                    if (c50868Mdz.A0A) {
                        c50868Mdz.A0A = false;
                    } else {
                        int A00 = (int) (i / AbstractC50522MSa.A00(context3, OZQ.A00));
                        int A04 = MSW.A04(c50868Mdz.A0E);
                        if (A00 > A04) {
                            A00 = A04;
                        }
                        c50868Mdz.A0N(A00);
                    }
                }
                return C0eB.A00;
            case 10:
                context = ((NI5) this.A01).A07;
                return Integer.valueOf((int) (((int) (AbstractC167017dG.A0B(context) / AbstractC50522MSa.A00(context, OZQ.A00))) * 0.5d));
            case 11:
                NI5 ni52 = (NI5) this.A01;
                context2 = ni52.A07;
                ni6 = ni52;
                return Integer.valueOf((int) (((OXZ) ni6).A00 / AbstractC50522MSa.A00(context2, OZQ.A00)));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = (ClipsStackedTimelineViewController) this.A01;
                clipsStackedTimelineViewController.A0B.DuY(((OXZ) clipsStackedTimelineViewController).A00);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C56283Oyu c56283Oyu = (C56283Oyu) this.A01;
                C51147Miq c51147Miq = new C51147Miq(c56283Oyu.A02, c56283Oyu.A03);
                c51147Miq.A01 = c56283Oyu.A05;
                return c51147Miq;
            case 14:
                return this.A01;
            case Process.SIGTERM /* 15 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 17:
                C52408NHe c52408NHe = (C52408NHe) ((C56050OuP) this.A01).A0M;
                if (c52408NHe != null) {
                    c52408NHe.A06(0);
                }
                return C0eB.A00;
            case 18:
                ((C56050OuP) this.A01).A0M.A03(-2);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                return new Handler(((C51164Mj7) this.A01).A03.getMainLooper());
            case 20:
                return new Handler(((C51141Mik) this.A01).A03.getMainLooper());
            case 21:
                return AbstractC166997dE.A0X((View) this.A01, R.id.clips_editor_item_effect_picker_stub);
            case 22:
                C211029Uz c211029Uz = (C211029Uz) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c211029Uz.A01;
            case 23:
                return AbstractC166997dE.A0S(AbstractC167017dG.A0V(((C211029Uz) this.A01).A09), R.id.clips_editor_transition_effects_rebound_viewpager);
            case 24:
                return AbstractC166997dE.A0S(AbstractC167017dG.A0V(((C211029Uz) this.A01).A09), R.id.clips_editor_transition_effects_shutter_button);
            case 25:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C50866Mdx) this.A01).A04, 36610309821241371L);
            case 26:
                C50866Mdx c50866Mdx = (C50866Mdx) this.A01;
                synchronized (c50866Mdx) {
                    oGt = new OGt(new C54506O6j(c50866Mdx.A04, EnumC27091Ti.A19));
                }
                return oGt;
            case 27:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C50866Mdx) this.A01).A04, 36328834844475201L);
            case 28:
                userSession = ((C50866Mdx) this.A01).A04;
                c06090Tz = C06090Tz.A05;
                j = 36610309821306908L;
                return Float.valueOf(((float) C18U.A01(c06090Tz, userSession, j)) / 1000.0f);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                userSession = ((C50866Mdx) this.A01).A04;
                c06090Tz = C06090Tz.A05;
                j = 36610309821372445L;
                return Float.valueOf(((float) C18U.A01(c06090Tz, userSession, j)) / 1000.0f);
            case 30:
                List list = (List) ((C38686GzR) this.A01).A01;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MusicSearchPlaylist musicSearchPlaylist = ((C38061Goo) it.next()).A0E;
                    if (musicSearchPlaylist != null) {
                        A1E.add(musicSearchPlaylist);
                    }
                }
                return A1E;
            case 31:
                C214909fS c214909fS = (C214909fS) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(c214909fS.A0P), c214909fS.requireActivity());
            case 32:
            case 34:
            case 36:
            case 39:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 33:
                C23885Ahe c23885Ahe = (C23885Ahe) this.A01;
                return new C185258Jq(c23885Ahe.A05, c23885Ahe.A04.requireActivity());
            case 35:
                C56304OzP c56304OzP = (C56304OzP) this.A01;
                return new C185258Jq(c56304OzP.A05, c56304OzP.A04.requireActivity());
            case 37:
                return AbstractC166987dD.A0d(((C27967CUn) this.A01).A04).findViewById(R.id.compose_view);
            case 38:
                return ((C27967CUn) this.A01).A00.inflate();
            case 40:
                return AbstractC50523MSb.A0A(this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                ((InterfaceC16660sJ) this.A01).invoke(EnumC222619s2.A02);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                View findViewById = ((Ah1) this.A01).A09.A00.findViewById(R.id.clips_debug_overlay_stub);
                if (findViewById instanceof ViewStub) {
                    viewStub = (ViewStub) findViewById;
                } else {
                    viewStub = null;
                }
                return new C57012jc(viewStub);
            case 43:
                final UserSession userSession2 = (UserSession) this.A01;
                return new AbstractC36266FzJ(userSession2) { // from class: X.9oj
                    public static final C226909zm A01 = new Object();
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession2, 1);
                        this.A00 = userSession2;
                    }

                    @Override // X.AbstractC36266FzJ
                    public final String A00() {
                        return "NEW_REMIX_INTRODUCTION_NUX_MANAGER";
                    }

                    @Override // X.AbstractC36266FzJ
                    public final void A01() {
                        C23031Ai A002 = AbstractC23021Ah.A00(this.A00);
                        AbstractC167007dF.A1L(A002, A002.A7W, C23031Ai.A8c, 269, true);
                    }

                    @Override // X.AbstractC36266FzJ
                    public final boolean A03() {
                        C23031Ai A002 = AbstractC23021Ah.A00(this.A00);
                        return !AbstractC167017dG.A1b(A002, A002.A7W, C23031Ai.A8c, 269);
                    }
                };
            case 44:
                return new C52628NQb((UserSession) this.A01);
            case 45:
                return Integer.valueOf(AbstractC167017dG.A0A(AbstractC31172DnG.A07(this.A01)));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "arg_browse_session_id");
            case 47:
                C52151N6b c52151N6b = (C52151N6b) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(c52151N6b.A0E), c52151N6b.requireActivity());
            case 48:
                C52151N6b c52151N6b2 = (C52151N6b) this.A01;
                FragmentActivity requireActivity = c52151N6b2.requireActivity();
                String A15 = AbstractC25225BEi.A15(c52151N6b2.A0C);
                InterfaceC09390do interfaceC09390do = c52151N6b2.A0E;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                Context requireContext = c52151N6b2.requireContext();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC167017dG.A1N(requireContext, A0r2);
                C49602Pt A002 = C2Ps.A00(requireContext, A0r2);
                C57312k6 A0S = AbstractC25235BEs.A0S(c52151N6b2);
                AbstractC167017dG.A1R(A0r, A002);
                return new C55569Om5(requireActivity, A0r, A002, A15, A0S);
        }
    }
}
