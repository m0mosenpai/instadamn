package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;

/* renamed from: X.Pg2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57528Pg2 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57528Pg2(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57528Pg2 A00(Object obj, int i) {
        return new C57528Pg2(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C52942bb A0F;
        Class cls;
        UserSession A0r;
        Context requireContext;
        C677733r c677733r;
        InterfaceC09390do interfaceC09390do;
        String str;
        C52166N6v c52166N6v;
        InterfaceC018407e interfaceC018407e;
        switch (this.A00) {
            case 0:
                AMp aMp = (AMp) this.A01;
                View A0S = AbstractC166997dE.A0S(aMp.A0G, R.id.avatar_sticker_preview_view);
                ViewOnClickListenerC23249ASk.A00(A0S, 51, aMp);
                return A0S;
            case 1:
                AMp aMp2 = (AMp) this.A01;
                WeakReference weakReference = aMp2.A0P;
                Object obj = weakReference.get();
                Context context = null;
                if (!(obj instanceof InterfaceC018407e) || (interfaceC018407e = (InterfaceC018407e) obj) == null) {
                    return null;
                }
                UserSession userSession = aMp2.A0I;
                Integer num = C05F.A00;
                Fragment fragment = (Fragment) weakReference.get();
                if (fragment != null) {
                    context = fragment.requireActivity().getApplicationContext();
                }
                C14360o3.A0C(context, AbstractC111324zv.A00(19));
                return MSW.A0F(new C52291NCg((Application) context, userSession, num), interfaceC018407e).A00(C44540Jmk.class);
            case 2:
                AMp aMp3 = (AMp) this.A01;
                Fragment fragment2 = (Fragment) aMp3.A0P.get();
                if (fragment2 != null) {
                    A0F = MSW.A0F(new C215649gg(aMp3.A0I), fragment2);
                    cls = C143266dR.class;
                    return A0F.A00(cls);
                }
                return null;
            case 3:
                return new C155466yZ(AbstractC166987dD.A0r(((KD1) this.A01).A05));
            case 4:
            case 6:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 32:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 44:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 5:
                return new C155466yZ(AbstractC166987dD.A0r(((C45480KBs) this.A01).A0A));
            case 7:
                return new MusicOnProfileRepository((UserSession) this.A01);
            case 8:
                return new O8D((UserSession) this.A01);
            case 9:
                C52166N6v c52166N6v2 = (C52166N6v) this.A01;
                A0r = AbstractC166987dD.A0r(c52166N6v2.A0U);
                requireContext = c52166N6v2.requireContext();
                c677733r = c52166N6v2.A04;
                c52166N6v = c52166N6v2;
                return new ND9(requireContext, A0r, c52166N6v, c677733r);
            case 10:
                C52166N6v c52166N6v3 = (C52166N6v) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(c52166N6v3.A0U), c52166N6v3.requireActivity());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C52168N6x c52168N6x = (C52168N6x) this.A01;
                A0r = AbstractC166987dD.A0r(c52168N6x.A0R);
                requireContext = c52168N6x.requireContext();
                c677733r = c52168N6x.A06;
                c52166N6v = c52168N6x;
                return new ND9(requireContext, A0r, c52166N6v, c677733r);
            case 14:
                C52168N6x c52168N6x2 = (C52168N6x) this.A01;
                return new ND1(c52168N6x2.requireActivity(), AbstractC166987dD.A0r(c52168N6x2.A0R), (C87D) c52168N6x2.A0N.getValue(), ((ClipsCreationViewModel) c52168N6x2.A0O.getValue()).A0S);
            case Process.SIGTERM /* 15 */:
                C52168N6x c52168N6x3 = (C52168N6x) this.A01;
                return AbstractC50522MSa.A0V(c52168N6x3, c52168N6x3.A0R);
            case 16:
                C52168N6x c52168N6x4 = (C52168N6x) this.A01;
                return AbstractC50522MSa.A0W(c52168N6x4, c52168N6x4.A0R);
            case 17:
                C52168N6x c52168N6x5 = (C52168N6x) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c52168N6x5.A0R);
                MusicProduct musicProduct = c52168N6x5.A05;
                if (musicProduct != null) {
                    ImmutableList immutableList = c52168N6x5.A04;
                    if (immutableList == null) {
                        str = "ineligibleAudioTypes";
                    } else {
                        ImmutableList immutableList2 = c52168N6x5.A03;
                        if (immutableList2 == null) {
                            str = "attachedTracks";
                        } else {
                            return new C52321NDk(c52168N6x5.A02, immutableList, immutableList2, musicProduct, c52168N6x5, A0r2, (C50669MYn) c52168N6x5.A0Q.getValue());
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "musicProduct";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 18:
                interfaceC09390do = ((C52168N6x) this.A01).A0R;
                return new NBB(AbstractC166987dD.A0r(interfaceC09390do));
            case 24:
            case 33:
                return this.A01;
            case 25:
            case 34:
                return AbstractC25226BEj.A1C(this.A01);
            case 26:
            case 35:
                return AbstractC167027dH.A0B(this.A01);
            case 27:
                MYT myt = (MYT) this.A01;
                A0r = AbstractC166987dD.A0r(myt.A0S);
                requireContext = myt.requireContext();
                c677733r = myt.A03;
                c52166N6v = myt;
                return new ND9(requireContext, A0r, c52166N6v, c677733r);
            case 28:
                MYT myt2 = (MYT) this.A01;
                return new ND1(myt2.requireActivity(), AbstractC166987dD.A0r(myt2.A0S), (C87D) myt2.A0P.getValue(), MSX.A0N(myt2).A0S);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                MYT myt3 = (MYT) this.A01;
                return AbstractC50522MSa.A0V(myt3, myt3.A0S);
            case 30:
                MYT myt4 = (MYT) this.A01;
                return AbstractC50522MSa.A0W(myt4, myt4.A0S);
            case 31:
                MYT myt5 = (MYT) this.A01;
                return AnonymousClass849.A00(AbstractC25231BEo.A0L(myt5), AbstractC166987dD.A0r(myt5.A0S)).A00(MSX.A0N(myt5).A0S).A00;
            case 36:
                MYT myt6 = (MYT) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(myt6.A0S);
                MusicProduct musicProduct2 = myt6.A01;
                if (musicProduct2 != null) {
                    return new NC2(musicProduct2, A0r3);
                }
                str = "musicProduct";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 37:
                interfaceC09390do = ((MYT) this.A01).A0S;
                return new NBB(AbstractC166987dD.A0r(interfaceC09390do));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                MYT myt7 = (MYT) this.A01;
                FragmentActivity requireActivity = myt7.requireActivity();
                Application application = myt7.requireActivity().getApplication();
                UserSession A0r4 = AbstractC166987dD.A0r(myt7.A0S);
                AbstractC167017dG.A1P(application, A0r4);
                A0F = MSW.A0F(new C52316NDf(application, null, A0r4, null, "browserTrendingAudio", null), requireActivity);
                cls = Gt5.class;
                return A0F.A00(cls);
            case 45:
                NQJ nqj = (NQJ) this.A01;
                A0r = AbstractC166987dD.A0r(nqj.A0F);
                requireContext = nqj.requireContext();
                c677733r = nqj.A00;
                c52166N6v = nqj;
                return new ND9(requireContext, A0r, c52166N6v, c677733r);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                interfaceC09390do = ((NQJ) this.A01).A0F;
                return new NBB(AbstractC166987dD.A0r(interfaceC09390do));
        }
    }
}
