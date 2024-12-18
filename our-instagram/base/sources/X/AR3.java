package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;

/* loaded from: classes4.dex */
public final class AR3 implements View.OnClickListener {
    public final /* synthetic */ C189988bH A00;

    public AR3(C189988bH c189988bH) {
        this.A00 = c189988bH;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        int A05 = C0f9.A05(277251708);
        C189988bH c189988bH = this.A00;
        UserSession userSession = c189988bH.A0v;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (A01.A0J() != null) {
            C22C.A08(((C22F) A01).A04.A0C, A01, "AUDIO_FILTERS_FROM_BROWSER_TAP", false);
        }
        C189988bH.A06(c189988bH);
        View view2 = c189988bH.A04;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = c189988bH.A03;
        if (view3 != null) {
            num = Integer.valueOf(view3.getVisibility());
        } else {
            num = null;
        }
        c189988bH.A0d = num;
        View view4 = c189988bH.A03;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        C24026AlJ c24026AlJ = c189988bH.A0Y;
        if (c24026AlJ != null) {
            c24026AlJ.A05.setEnabled(false);
        }
        BottomSheetViewController bottomSheetViewController = c189988bH.A0K;
        if (bottomSheetViewController == null) {
            Context requireContext = c189988bH.A0u.requireContext();
            ViewGroup viewGroup = c189988bH.A08;
            if (viewGroup != null) {
                bottomSheetViewController = new BottomSheetViewController(requireContext, viewGroup, new C23871AhQ(c189988bH), false);
                c189988bH.A0K = bottomSheetViewController;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        String str = "bottomSheetViewController";
        if (c189988bH.A0J == null) {
            c189988bH.A0J = new NHT(c189988bH.A0u, userSession, C189988bH.A00(c189988bH), c189988bH.A0x, new C54425O3f(c189988bH), c189988bH.A16);
        }
        C185278Js A00 = C189988bH.A00(c189988bH);
        if (A00 != null) {
            MusicAssetModel musicAssetModel = c189988bH.A0P;
            if (musicAssetModel != null) {
                TrackSnippet trackSnippet = c189988bH.A0Q;
                if (trackSnippet != null) {
                    int i = trackSnippet.A01;
                    EnumC185288Jt enumC185288Jt = c189988bH.A0L;
                    A00.A07 = musicAssetModel;
                    A00.A01 = i;
                    C185278Js.A01(A00, enumC185288Jt);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        NHT nht = c189988bH.A0J;
        if (nht == null) {
            str = "audioFilterBottomSheetContentController";
        } else {
            bottomSheetViewController.A03 = nht;
            BottomSheetViewController bottomSheetViewController2 = c189988bH.A0K;
            if (bottomSheetViewController2 != null) {
                bottomSheetViewController2.A02();
                C0f9.A0C(1727389952, A05);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
