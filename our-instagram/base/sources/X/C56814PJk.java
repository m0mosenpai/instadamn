package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PJk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56814PJk implements C8YA {
    public final int A00;
    public final Object A01;

    public C56814PJk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C8YA
    public final String AbY() {
        switch (this.A00) {
            case 1:
                return "caption_edit";
            case 2:
                return "caption_repost";
            default:
                return "caption_create";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8YA
    public final /* synthetic */ void CzK() {
        ShareLaterFragment shareLaterFragment;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0r = true;
                EditMediaInfoFragment.A0F(editMediaInfoFragment);
                AbstractC167007dF.A0w(editMediaInfoFragment.mPostOverlayView);
                IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
                shareLaterFragment = editMediaInfoFragment;
                if (igAutoCompleteTextView != null) {
                    igAutoCompleteTextView.clearFocus();
                    shareLaterFragment = editMediaInfoFragment;
                    break;
                }
                break;
            case 2:
                ShareLaterFragment shareLaterFragment2 = (ShareLaterFragment) this.A01;
                IgAutoCompleteTextView igAutoCompleteTextView2 = shareLaterFragment2.A05;
                if (igAutoCompleteTextView2 != null) {
                    igAutoCompleteTextView2.clearFocus();
                    C56352iT.A0t.A03(shareLaterFragment2.requireActivity()).setIsLoading(false);
                    shareLaterFragment = shareLaterFragment2;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 3:
                OFX ofx = ((N6J) this.A01).A06;
                if (ofx == null) {
                    C14360o3.A0F("viewHolder");
                    throw C00O.createAndThrow();
                }
                View view = ofx.A00;
                OF9 of9 = ofx.A08;
                IgdsButton igdsButton = of9.A07;
                IgdsButton igdsButton2 = of9.A06;
                AbstractC167017dG.A1R(igdsButton, igdsButton2);
                view.setVisibility(0);
                igdsButton.setEnabled(false);
                igdsButton2.setEnabled(false);
                return;
            case 4:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                FollowersShareFragment.A0K(followersShareFragment, true);
                AbstractC13880nE.A0O(followersShareFragment.mView);
                OUI.A00(followersShareFragment).clearFocus();
                return;
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = true;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
        }
        View view2 = shareLaterFragment.mView;
        if (view2 == null) {
            return;
        }
        AbstractC13880nE.A0O(view2);
    }

    @Override // X.C8YA
    public final /* synthetic */ void DOg() {
        if (4 - this.A00 == 0) {
            FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
            CallerContext callerContext = FollowersShareFragment.A0z;
            followersShareFragment.A0M = "475590606393264";
        }
    }

    @Override // X.C8YA
    public final /* synthetic */ void Dw9() {
        IgAutoCompleteTextView A0J;
        switch (this.A00) {
            case 1:
                A0J = ((EditMediaInfoFragment) this.A01).mCaption;
                if (A0J == null) {
                    return;
                }
                break;
            case 2:
                A0J = ((ShareLaterFragment) this.A01).A05;
                if (A0J == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
            case 3:
            default:
                return;
            case 4:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                OUI.A00(followersShareFragment).requestFocus();
                if ("475590606393264".equals(followersShareFragment.A0M)) {
                    return;
                }
                followersShareFragment.A0M = "2420199268222207";
                return;
            case 5:
                A0J = ((ClipsEditMetadataController) this.A01).A0J();
                break;
        }
        A0J.requestFocus();
    }

    @Override // X.C8YA
    public final /* synthetic */ void E1m() {
        switch (this.A00) {
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0r = false;
                EditMediaInfoFragment.A0F(editMediaInfoFragment);
                AbstractC167007dF.A0x(editMediaInfoFragment.mPostOverlayView);
                return;
            case 2:
            default:
                return;
            case 3:
                OFX ofx = ((N6J) this.A01).A06;
                if (ofx == null) {
                    C14360o3.A0F("viewHolder");
                    throw C00O.createAndThrow();
                }
                View view = ofx.A00;
                OF9 of9 = ofx.A08;
                IgdsButton igdsButton = of9.A07;
                IgdsButton igdsButton2 = of9.A06;
                AbstractC167017dG.A1R(igdsButton, igdsButton2);
                view.setVisibility(8);
                igdsButton.setEnabled(true);
                igdsButton2.setEnabled(true);
                return;
            case 4:
                FollowersShareFragment.A0K((FollowersShareFragment) this.A01, false);
                return;
            case 5:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = false;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
        }
    }

    @Override // X.C8YA
    public final /* synthetic */ void E1n() {
        if (4 - this.A00 == 0) {
            FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
            CallerContext callerContext = FollowersShareFragment.A0z;
            String str = followersShareFragment.A0M;
            if (str == null || str.length() == 0) {
                followersShareFragment.A0M = "683412648733504";
            }
        }
    }

    @Override // X.C8YA
    public final void E4v() {
        List list;
        C54626OBb c54626OBb;
        switch (this.A00) {
            case 0:
                C214959fX c214959fX = (C214959fX) this.A01;
                c214959fX.A07 = true;
                C214959fX.A04(c214959fX);
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0r = false;
                EditMediaInfoFragment.A0F(editMediaInfoFragment);
                if (editMediaInfoFragment.A0n && !editMediaInfoFragment.A0N.A01.getBoolean("has_seen_boost_edit_caption_confirmation_dialog", false)) {
                    EditMediaInfoFragment.A01(editMediaInfoFragment.requireActivity(), editMediaInfoFragment);
                    return;
                } else {
                    EditMediaInfoFragment.A08(editMediaInfoFragment);
                    return;
                }
            case 2:
                C56342iS c56342iS = C56352iT.A0t;
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                c56342iS.A03(shareLaterFragment.requireActivity()).setIsLoading(true);
                shareLaterFragment.A09 = AbstractC166997dE.A17();
                C13400mQ c13400mQ = new C13400mQ(AbstractC167007dF.A0J(), new G0V(shareLaterFragment, 1), 15000L);
                shareLaterFragment.A01 = c13400mQ;
                c13400mQ.A01(AbstractC166997dE.A0n());
                return;
            case 3:
                N6J n6j = (N6J) this.A01;
                boolean z = ClipsSharingDraftViewModel.A00(n6j).A17;
                String A07 = N6J.A07(n6j);
                C52094N2u c52094N2u = N6J.A06(n6j).A00;
                if (c52094N2u != null && (c54626OBb = c52094N2u.A00) != null) {
                    list = c54626OBb.A02;
                } else {
                    list = null;
                }
                N6J.A0O(n6j, A07, ClipsSharingDraftViewModel.A00(n6j).A0X, n6j.getModuleName(), list, z);
                return;
            case 4:
                FollowersShareFragment.A0G((FollowersShareFragment) this.A01);
                return;
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = false;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                ClipsEditMetadataController.A09(clipsEditMetadataController);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C8YA
    public final List getContent() {
        String str;
        String A06;
        switch (this.A00) {
            case 0:
                C47Z A00 = C214959fX.A00((C214959fX) this.A01);
                ArrayList A1E = AbstractC166987dD.A1E();
                if (A00 != null) {
                    Iterator it = A00.A4h.iterator();
                    while (it.hasNext()) {
                        String str2 = ((C55m) it.next()).A09;
                        if (str2 != null) {
                            A1E.add(str2);
                        }
                    }
                }
                if (!A1E.isEmpty()) {
                    return A1E;
                }
                A1E.add("");
                return A1E;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
                if (igAutoCompleteTextView != null && igAutoCompleteTextView.getText() != null) {
                    str = AbstractC167007dF.A0g(editMediaInfoFragment.mCaption);
                } else {
                    str = "";
                }
                return Collections.singletonList(str);
            case 2:
                IgAutoCompleteTextView igAutoCompleteTextView2 = ((ShareLaterFragment) this.A01).A05;
                if (igAutoCompleteTextView2 != null) {
                    A06 = AbstractC167007dF.A0g(igAutoCompleteTextView2);
                    return AbstractC166987dD.A1J(A06);
                }
                throw AbstractC166997dE.A0g();
            case 3:
                A06 = N6J.A07((N6J) this.A01);
                return AbstractC166987dD.A1J(A06);
            case 4:
                A06 = FollowersShareFragment.A06((FollowersShareFragment) this.A01);
                return AbstractC166987dD.A1J(A06);
            default:
                A06 = ClipsEditMetadataController.A00((ClipsEditMetadataController) this.A01);
                return AbstractC166987dD.A1J(A06);
        }
    }
}
