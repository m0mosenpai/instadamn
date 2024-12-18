package X;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes9.dex */
public final class NJC extends AbstractC52142N5r {
    public static final String __redex_internal_original_name = "ClipsCoverPhotoPickerFragment";
    public MediaCroppingCoordinates A00;
    public ClipsCoverPhotoPickerController A01;
    public C51012MgJ A02;
    public C47Z A03;
    public C50982Mfp A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public ShareMediaLoggingInfo A09;
    public C50889MeK A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_cover_photo_picker";
    }

    @Override // X.AbstractC52142N5r, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.crop_profile_image_button);
        A0N.setVisibility(0);
        Context A0L = AbstractC166997dE.A0L(A0N);
        AbstractC166987dD.A1O(A0L, A0N, C1QI.A01(A0L));
        ViewOnClickListenerC55466OkL.A02(A0N, 6, this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 16), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(NJC njc) {
        InterfaceC09390do interfaceC09390do = njc.A0C;
        O7Z A00 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(interfaceC09390do));
        A00.A01.flowMarkPoint(A00.A00, "CROP_PROFILE_IMAGE_CLICKED");
        C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
        EnumC50631MWs enumC50631MWs = ((C22F) A0T).A04.A0C;
        if (A0T.A0J() != null && enumC50631MWs != null) {
            A0T.A1R(enumC50631MWs, "SHARE_SHEET_COVER_PHOTO_PROFILE_GRID_TAP");
        }
        C140966Yy A0j = AbstractC25233BEq.A0j(njc, interfaceC09390do);
        A0j.A08();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C47Z c47z = njc.A03;
        if (c47z == null) {
            C14360o3.A0F("pendingMedia");
            throw C00O.createAndThrow();
        }
        String str = c47z.A33;
        if (str != null) {
            ShareMediaLoggingInfo shareMediaLoggingInfo = njc.A09;
            C14360o3.A0B(A0o, 0);
            NN8 nn8 = new NN8();
            Bundle A0T2 = AbstractC167017dG.A0T("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO", shareMediaLoggingInfo, AbstractC166987dD.A1L("ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH", str));
            AbstractC03240Dh.A00(A0T2, A0o);
            AbstractC31175DnJ.A0t(A0T2, nn8, A0j);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public NJC() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C57525Pfz.A00(C57525Pfz.A00(this, 27), 28));
        C0YZ A1D = AbstractC25225BEi.A1D(C50966MfZ.class);
        this.A0B = AbstractC25225BEi.A0a(C57525Pfz.A00(A00, 29), MSW.A1G(this, A00, 29), MSW.A1G(A00, null, 28), A1D);
        this.A0C = AbstractC60492pY.A02(this);
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [X.2ba, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-91539768);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            setModuleNameV2("clips_cover_photo_picker");
            InterfaceC09390do interfaceC09390do = this.A0C;
            C47Z A03 = C25A.A00(AbstractC166987dD.A0r(interfaceC09390do)).A03(bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"));
            if (A03 != null) {
                this.A03 = A03;
                this.A05 = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID");
                this.A09 = (ShareMediaLoggingInfo) bundle2.getParcelable("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO");
                C47Z c47z = this.A03;
                if (c47z != null) {
                    ClipInfo clipInfo = c47z.A1N;
                    this.A06 = c47z.A33;
                    this.A07 = c47z.A5M;
                    this.A00 = (MediaCroppingCoordinates) ((C50966MfZ) this.A0B.getValue()).A01.A00("PROFILE_CROP_COORDINATES_KEY");
                    FragmentActivity requireActivity = requireActivity();
                    C47Z c47z2 = this.A03;
                    if (c47z2 != null) {
                        Context requireContext = requireContext();
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        DisplayMetrics displayMetrics = AbstractC166997dE.A0N(this).getDisplayMetrics();
                        C14360o3.A07(displayMetrics);
                        C24197AoK c24197AoK = new C24197AoK(requireContext, A0r, c47z2, AbstractC13880nE.A05(displayMetrics));
                        int i2 = clipInfo.A07;
                        int i3 = clipInfo.A05;
                        C47Z c47z3 = this.A03;
                        if (c47z3 != null) {
                            OEB A00 = AbstractC54906OQd.A00(c47z3.A1N);
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            C14360o3.A0B(A0r2, 5);
                            C50982Mfp c50982Mfp = (C50982Mfp) MSW.A0F(new C55570Om6(A0r2, c24197AoK, A00, 0.5625f, i2, i3), requireActivity).A00(C50982Mfp.class);
                            this.A04 = c50982Mfp;
                            C47Z c47z4 = this.A03;
                            if (c47z4 != null) {
                                String str = c47z4.A33;
                                if (str != null) {
                                    if (c50982Mfp != null) {
                                        C11T.A02(new RunnableC57012PRd(c50982Mfp, str));
                                    }
                                    C14360o3.A0F("videoScrubbingViewModel");
                                    throw C00O.createAndThrow();
                                }
                                C50982Mfp c50982Mfp2 = this.A04;
                                if (c50982Mfp2 != null) {
                                    C47Z c47z5 = this.A03;
                                    if (c47z5 != null) {
                                        MSX.A1B(c50982Mfp2.A0C, c47z5.A5M);
                                        C50982Mfp c50982Mfp3 = this.A04;
                                        if (c50982Mfp3 != null) {
                                            C47Z c47z6 = this.A03;
                                            if (c47z6 != null) {
                                                c50982Mfp3.A00(c47z6.A06, true);
                                                C50982Mfp c50982Mfp4 = this.A04;
                                                if (c50982Mfp4 != null) {
                                                    AbstractC31174DnI.A1E(this, c50982Mfp4.A07, new C57749Pjc(this, 5), 0);
                                                    C50982Mfp c50982Mfp5 = this.A04;
                                                    if (c50982Mfp5 != null) {
                                                        AbstractC50522MSa.A14(this, PZV.A02(this, null, 26), c50982Mfp5.A0G);
                                                        C50982Mfp c50982Mfp6 = this.A04;
                                                        if (c50982Mfp6 != null) {
                                                            AbstractC31174DnI.A1E(this, c50982Mfp6.A04, new C57749Pjc(this, 6), 0);
                                                            C50982Mfp c50982Mfp7 = this.A04;
                                                            if (c50982Mfp7 != null) {
                                                                AbstractC31174DnI.A1E(this, c50982Mfp7.A08, new C57749Pjc(this, 7), 0);
                                                                C50889MeK c50889MeK = (C50889MeK) AbstractC31175DnJ.A0A(this).A00(C50889MeK.class);
                                                                this.A0A = c50889MeK;
                                                                String str2 = "galleryCoverPhotoPickerViewModel";
                                                                if (c50889MeK != null) {
                                                                    C50982Mfp c50982Mfp8 = this.A04;
                                                                    if (c50982Mfp8 != null) {
                                                                        c50889MeK.A00.A0B(new P1I(c50982Mfp8));
                                                                        C50889MeK c50889MeK2 = this.A0A;
                                                                        if (c50889MeK2 != null) {
                                                                            AbstractC50522MSa.A14(this, PZV.A02(this, null, 27), c50889MeK2.A02);
                                                                            this.A02 = (C51012MgJ) MSW.A0F(new Object(), requireActivity()).A00(C51012MgJ.class);
                                                                            Context requireContext2 = requireContext();
                                                                            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                            C50982Mfp c50982Mfp9 = this.A04;
                                                                            if (c50982Mfp9 != null) {
                                                                                C51012MgJ c51012MgJ = this.A02;
                                                                                if (c51012MgJ == null) {
                                                                                    str2 = "textEditingViewModel";
                                                                                } else {
                                                                                    C47Z c47z7 = this.A03;
                                                                                    if (c47z7 != null) {
                                                                                        ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = new ClipsCoverPhotoPickerController(requireContext2, this, this, A0r3, this, c51012MgJ, c47z7, c50982Mfp9, this.A05, AbstractC167007dF.A1W(c47z7.A10), false);
                                                                                        this.A01 = clipsCoverPhotoPickerController;
                                                                                        registerLifecycleListener(clipsCoverPhotoPickerController);
                                                                                        C0f9.A09(-1441426361, A02);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                C14360o3.A0F(str2);
                                                                throw C00O.createAndThrow();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("videoScrubbingViewModel");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                C14360o3.A0F("pendingMedia");
                throw C00O.createAndThrow();
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 82987454;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -219385765;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
