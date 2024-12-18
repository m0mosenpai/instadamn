package X;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;

/* loaded from: classes9.dex */
public final class NJB extends AbstractC52142N5r {
    public static final String __redex_internal_original_name = "ReselectCoverPhotoPickerFragment";
    public ClipsCoverPhotoPickerController A00;
    public C51012MgJ A01;
    public C38321qM A02;
    public C50982Mfp A03;
    public C50887MeI A04;
    public C50889MeK A06;
    public String A05 = "";
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reselect_cover_photo_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [X.2ba, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-1060222650);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String A0Y = AbstractC31175DnJ.A0Y(bundle2, "ClipsConstants.ARG_CLIPS_SHARE_MEDIA_FILE_PATH ");
            InterfaceC09390do interfaceC09390do = this.A07;
            C38321qM A022 = AbstractC31176DnK.A0Z(interfaceC09390do).A02(bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_ID "));
            if (A022 == null) {
                C0w9.A01.EmN("reselect_cover_photo_fragment", "null media object");
                i = 455961951;
            } else {
                this.A02 = A022;
                String str = "media";
                int A1C = (int) A022.A1C();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C38321qM c38321qM = this.A02;
                if (c38321qM != null) {
                    Context requireContext = requireContext();
                    DisplayMetrics displayMetrics = AbstractC166997dE.A0N(this).getDisplayMetrics();
                    C14360o3.A07(displayMetrics);
                    C24198AoL c24198AoL = new C24198AoL(requireContext, A0r, c38321qM, A0Y, AbstractC13880nE.A05(displayMetrics));
                    this.A04 = (C50887MeI) AbstractC31175DnJ.A0A(this).A00(C50887MeI.class);
                    FragmentActivity requireActivity = requireActivity();
                    C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(180));
                    C38321qM c38321qM2 = this.A02;
                    if (c38321qM2 != null) {
                        float A0m = c38321qM2.A0m();
                        OEB A01 = AbstractC54906OQd.A01(A0Y, null, A1C);
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C14360o3.A0B(A0r2, 5);
                        C50982Mfp c50982Mfp = (C50982Mfp) MSW.A0F(new C55570Om6(A0r2, c24198AoL, A01, A0m, 0, A1C), requireActivity).A00(C50982Mfp.class);
                        this.A03 = c50982Mfp;
                        str = "videoScrubbingViewModel";
                        if (c50982Mfp != null) {
                            AbstractC37301Gc2.A0w(this, c50982Mfp.A07, new C30181DRm(this, 47), 48);
                            C50889MeK c50889MeK = (C50889MeK) AbstractC31175DnJ.A0A(this).A00(C50889MeK.class);
                            this.A06 = c50889MeK;
                            if (c50889MeK != null) {
                                C50982Mfp c50982Mfp2 = this.A03;
                                if (c50982Mfp2 != null) {
                                    c50889MeK.A00.A0B(new P1I(c50982Mfp2));
                                    C50889MeK c50889MeK2 = this.A06;
                                    if (c50889MeK2 != null) {
                                        AbstractC50522MSa.A14(this, new C57153PYx(this, null, 8), c50889MeK2.A02);
                                        this.A01 = (C51012MgJ) MSW.A0F(new Object(), requireActivity()).A00(C51012MgJ.class);
                                        Context requireContext2 = requireContext();
                                        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                        C50982Mfp c50982Mfp3 = this.A03;
                                        if (c50982Mfp3 != null) {
                                            C51012MgJ c51012MgJ = this.A01;
                                            if (c51012MgJ == null) {
                                                str = "textEditingViewModel";
                                            } else {
                                                ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = new ClipsCoverPhotoPickerController(requireContext2, this, this, A0r3, this, c51012MgJ, null, c50982Mfp3, null, false, true);
                                                this.A00 = clipsCoverPhotoPickerController;
                                                registerLifecycleListener(clipsCoverPhotoPickerController);
                                                i = -638029506;
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F("galleryCoverPhotoPickerViewModel");
                            throw C00O.createAndThrow();
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C0f9.A09(i, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(846283482, A02);
        throw A0g;
    }
}
