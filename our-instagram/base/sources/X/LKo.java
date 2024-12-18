package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class LKo {
    public static final LKo A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, EnumC25577BSp enumC25577BSp, UserSession userSession, ContentNoteMetadata contentNoteMetadata, String str, String str2, boolean z) {
        EnumC46303KeZ enumC46303KeZ;
        String str3;
        AbstractC25233BEq.A0v(0, userSession, str, str2);
        AbstractC25228BEl.A1G(fragmentActivity, AbstractC37303Gc4.A02(userSession, AbstractC31402Dr6.A01(userSession, str2, "notes_action_sheet", str)), userSession, ModalActivity.class, "profile");
        if (contentNoteMetadata != null && (str3 = contentNoteMetadata.A09) != null) {
            BSo.A00.A04(enumC25577BSp, userSession, contentNoteMetadata.A04, contentNoteMetadata.A06, contentNoteMetadata.A0A, str3);
            return;
        }
        C135976Dc A01 = AbstractC135966Db.A01(userSession);
        if (z) {
            enumC46303KeZ = EnumC46303KeZ.A0M;
        } else {
            enumC46303KeZ = EnumC46303KeZ.A0d;
        }
        A01.A0D(enumC46303KeZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C189448aO c189448aO) {
        C189478aR A002 = F86.A00(AbstractC31172DnG.A0r(fragmentActivity));
        if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
            A002.A0G(abstractC59962oe, c189448aO, true, false);
            return;
        }
        if (abstractC59962oe instanceof KDQ) {
            c189448aO.A0T = (C51D) abstractC59962oe;
        }
        AbstractC31173DnH.A0w(fragmentActivity, abstractC59962oe, c189448aO);
    }

    public final C50674MYs A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, String str, boolean z) {
        C14360o3.A0B(str, 3);
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(fragmentActivity), R.layout.layout_bottom_sheet_header);
        A0C.findViewById(R.id.note_action_button).setVisibility(8);
        Context context = A0C.getContext();
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) AbstractC166997dE.A0R(A0C, R.id.bottom_sheet_note_author_avatar);
        reelAvatarWithBadgeView.setVisibility(0);
        if (imageUrl != null) {
            reelAvatarWithBadgeView.A04(imageUrl, interfaceC11380iw);
            TextView A0T = AbstractC166997dE.A0T(A0C, R.id.bottom_sheet_note_header_title);
            AbstractC25227BEk.A11(A0T);
            A0T.setText(str);
            if (z) {
                AbstractC166987dD.A1O(context, A0T, AbstractC53242c7.A09(context));
                A0T.setTypeface(Typeface.SANS_SERIF);
            }
            C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
            c50674MYs.A01 = A0C;
            return c50674MYs;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A04(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        String str2;
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        User A0k = AbstractC31174DnI.A0k(userSession, str);
        C14360o3.A0A(A0k);
        List A0j = AbstractC31177DnL.A0j(A0k);
        C122145g6 c122145g6 = new C122145g6(A0j);
        if (C18U.A06(C06090Tz.A05, userSession, 36313750920759533L)) {
            C7YF.A00(userSession).A02(c122145g6, A0j, new MIF(13, activity, interfaceC11380iw, userSession, z), true);
            return;
        }
        if (z) {
            str2 = "direct_thread_content_note";
        } else {
            str2 = "inbox_notes_tray";
        }
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, str2);
        A01.A0B = c122145g6;
        A01.A06();
    }

    public final void A05(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0v(1, user, fragment, interfaceC11380iw);
        InterfaceC83703oF A002 = AbstractC34056F1j.A00(userSession, user);
        if (C18U.A06(C06090Tz.A05, userSession, 36317560555181422L)) {
            List A0j = AbstractC31177DnL.A0j(user);
            C7YF.A00(userSession).A02(new C122145g6(A0j), A0j, new C50364MLq(16, fragment, interfaceC11380iw, userSession), true);
            return;
        }
        A00(fragment, interfaceC11380iw, userSession, A002);
    }

    public final void A06(FragmentActivity fragmentActivity, EnumC25577BSp enumC25577BSp, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ContentNoteMetadata contentNoteMetadata, String str, boolean z) {
        AbstractC167017dG.A1O(userSession, interfaceC11380iw);
        A01(fragmentActivity, enumC25577BSp, userSession, contentNoteMetadata, interfaceC11380iw.getModuleName(), str, z);
    }

    public final void A07(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, C4F7 c4f7, InterfaceC145226gh interfaceC145226gh, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        int i;
        View.OnClickListener lpr;
        C50674MYs A03 = A03(fragmentActivity, interfaceC11380iw, userSession, imageUrl, str2, z2);
        if (z3) {
            A03.A01(new LOw(c4f7, j, 0), 2131954087);
        }
        if (contentNoteMetadata != null) {
            i = 2131954075;
            lpr = new LPT(fragmentActivity, interfaceC11380iw, userSession, contentNoteMetadata, c4f7, str, j);
        } else {
            i = 2131954093;
            lpr = new LPR(c4f7, fragmentActivity, userSession, interfaceC11380iw, str, 0, z);
        }
        A03.A01(lpr, i);
        A03.A01(new LPN(fragmentActivity, interfaceC11380iw, userSession, contentNoteMetadata, j), 2131954100);
        A03.A03(new ViewOnClickListenerC28655Cl3(fragmentActivity, interfaceC11380iw, userSession, contentNoteMetadata, str, 2), 2131954102);
        if (interfaceC145226gh != null) {
            A03.A03 = interfaceC145226gh;
        }
        C3DN A0r = AbstractC31172DnG.A0r(fragmentActivity);
        if (A0r != null && ((C3DP) A0r).A0h) {
            new C31727DwY(A03).A06(fragmentActivity);
        } else {
            C31727DwY.A00(fragmentActivity, A03);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        C36881nl A01 = C36881nl.A01(fragment.requireActivity(), interfaceC11380iw, userSession, AbstractC111324zv.A00(4659));
        if ((fragment instanceof InterfaceC59832oQ) && (fragment instanceof InterfaceC11380iw) && !C18U.A06(C06090Tz.A06, userSession, 36311560487699059L)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36311560486191708L) || C18U.A06(c06090Tz, userSession, 36311560487174763L)) {
                FragmentActivity requireActivity = fragment.requireActivity();
                A01.A0z = true;
                A01.A00 = fragment;
                A01.A02 = requireActivity;
                A01.A0A = (InterfaceC59832oQ) fragment;
                A01.A05 = (InterfaceC11380iw) fragment;
            }
        }
        A01.A0B = interfaceC83713oG;
        A01.A0n = true;
        A01.A01 = fragment;
        A01.A0x = false;
        A01.A0s = true;
        A01.A06();
    }
}
