package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;

/* renamed from: X.N5r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52142N5r extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BaseCoverPhotoPickerFragment";
    public View A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkT(ViewOnClickListenerC55466OkL.A01(this, 2), true);
        interfaceC56362iU.Efu(2131956891);
        this.A00 = interfaceC56362iU.AAF(ViewOnClickListenerC55466OkL.A01(this, 3), 2131961124);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!(this instanceof NJB)) {
            NJC njc = (NJC) this;
            C47Z c47z = njc.A03;
            String str = "pendingMedia";
            if (c47z != null) {
                c47z.A33 = njc.A06;
                c47z.A5M = njc.A07;
                ((C50966MfZ) njc.A0B.getValue()).A00(njc.A00);
                C51012MgJ c51012MgJ = njc.A02;
                if (c51012MgJ == null) {
                    str = "textEditingViewModel";
                } else {
                    c51012MgJ.A00.Egh(new MWT());
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC56952jT.A01(AbstractC166997dE.A0S(view, R.id.add_from_gallery));
    }

    public final ClipsCoverPhotoPickerController A01() {
        ClipsCoverPhotoPickerController clipsCoverPhotoPickerController;
        if (this instanceof NJB) {
            clipsCoverPhotoPickerController = ((NJB) this).A00;
        } else {
            clipsCoverPhotoPickerController = ((NJC) this).A01;
        }
        if (clipsCoverPhotoPickerController == null) {
            C14360o3.A0F("clipsCoverPhotoPickerController");
            throw C00O.createAndThrow();
        }
        return clipsCoverPhotoPickerController;
    }

    public final void A02() {
        C51012MgJ c51012MgJ;
        if (this instanceof NJB) {
            c51012MgJ = ((NJB) this).A01;
        } else {
            c51012MgJ = ((NJC) this).A02;
        }
        if (c51012MgJ == null) {
            C14360o3.A0F("textEditingViewModel");
            throw C00O.createAndThrow();
        }
        c51012MgJ.A00.Egh(new MWT());
    }

    public final void A03(String str) {
        if (this instanceof NJC) {
            NJC njc = (NJC) this;
            String str2 = njc.A05;
            if (str2 != null) {
                ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) MSW.A0F(new C50851Mdi(njc.requireActivity(), njc.requireActivity(), AbstractC166987dD.A0r(njc.A0C), str2), njc.requireActivity()).A00(ClipsSharingDraftViewModel.class);
                MXY mxy = new MXY();
                mxy.A0C = MXZ.A00(str);
                clipsSharingDraftViewModel.A06(mxy);
                return;
            }
            return;
        }
        NJB njb = (NJB) this;
        C14360o3.A0B(str, 0);
        if (str.equals(njb.A05)) {
            return;
        }
        njb.A05 = str;
        C50887MeI c50887MeI = njb.A04;
        if (c50887MeI == null) {
            C14360o3.A0F("reselectCoverPhotoViewModel");
            throw C00O.createAndThrow();
        }
        if (str.length() == 0) {
            return;
        }
        c50887MeI.A01.A0B(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(731961248);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_cover_photo_picker_fragment, false);
        C0f9.A09(-2107024800, A02);
        return A0R;
    }
}
