package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FcG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35043FcG {
    public static C0O A00(String str, boolean z, boolean z2, boolean z3) {
        C0O c0o = new C0O();
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC111324zv.A00(1938), str);
        bundle.putBoolean(AbstractC111324zv.A00(1934), z);
        bundle.putString(AbstractC111324zv.A00(1943), null);
        bundle.putBoolean(AbstractC111324zv.A00(1942), z2);
        bundle.putBoolean(AbstractC111324zv.A00(3959), z3);
        c0o.setArguments(bundle);
        return c0o;
    }

    public final void A01(Activity activity, View view, UserSession userSession, String str) {
        if (AbstractC151756sL.A01() && AbstractC151756sL.A00().A04(userSession) && !AbstractC31172DnG.A1a(AbstractC166987dD.A0x(userSession), MSV.A00(461))) {
            AbstractC151756sL.A00().A03();
            C5SU A0f = AbstractC167017dG.A0f(activity, AbstractC167007dF.A0f(activity, str, 2131969044));
            A0f.A03(view);
            A0f.A01();
            A0f.A00 = 5000;
            A0f.A0A = true;
            view.postDelayed(new GOZ(userSession, EfP.A00(A0f, userSession, 10)), 500L);
        }
    }

    public final void A02(Activity activity, UserSession userSession) {
        PendingRecipient pendingRecipient;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 1), userSession, 36321043774383198L)) {
            ImageUrl imageUrl = PendingRecipient.A0g;
            pendingRecipient = new PendingRecipient(AbstractC166997dE.A0Y(userSession));
            pendingRecipient.A0Y = true;
        } else {
            pendingRecipient = null;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("targetGroupProfile", pendingRecipient);
        A0b.putParcelable(AbstractC111324zv.A00(78), pendingRecipient);
        A0b.putBoolean(AbstractC111324zv.A00(2746), true);
        A0b.putSerializable("cameraEntryPoint", C22P.A5N);
        A0b.putStringArrayList(MSV.A00(367), AbstractC16960so.A1M(C128535rM.A00.A02, C208509Kk.A00.A02, C81U.A00.A02));
        A0b.putSerializable(AbstractC111324zv.A00(496), C81K.A09);
        C6XJ A02 = C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(3268));
        A02.A0J = new int[]{R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit};
        A02.A0C(activity);
        AbstractC34277F9x.A00(new C35953FuD(), userSession, "tap", "universal_create_button", "unknown", userSession.userId, null);
    }

    public final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        AbstractC167027dH.A13(fragmentActivity, userSession, interfaceC11380iw);
        AbstractC151756sL.A00().A02();
        String str2 = userSession.userId;
        String A00 = AbstractC111324zv.A00(4349);
        C14360o3.A0B(str2, 4);
        AbstractC34277F9x.A00(interfaceC11380iw, userSession, "tap", A00, str, str2, null);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(AbstractC111324zv.A00(1941), z);
        AbstractC31174DnI.A0a(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(5020)).A0A(fragmentActivity, 68682);
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(0, str, fragmentActivity, userSession);
        A05(fragmentActivity, userSession, num, str, str2, z, z2, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (r19.equals("qp_megaphone") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        if (r19.equals(r2) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
    
        if (r19.equals(r0) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(androidx.fragment.app.FragmentActivity r15, com.instagram.common.session.UserSession r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35043FcG.A05(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str, List list) {
        AbstractC167007dF.A1D(fragmentActivity, 1, userSession);
        String str2 = (String) AbstractC001800i.A0J(list);
        String A00 = AbstractC111324zv.A00(2824);
        String A002 = AbstractC111324zv.A00(3696);
        String str3 = C1M3.A00().A00;
        AbstractC151756sL.A00().A03();
        String string = fragmentActivity.getString(2131969040);
        ArrayList A1F = AbstractC166987dD.A1F(list);
        ContextualFeedNetworkConfig contextualFeedNetworkConfig = new ContextualFeedNetworkConfig(null, "", "", null, null, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        C37330GcY c37330GcY = new C37330GcY();
        Bundle A0b2 = AbstractC166987dD.A0b();
        c37330GcY.A01(A0b2);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(C31569Dtv.A00(A0b2, A0b, null, contextualFeedNetworkConfig, null, null, A002, string, null, str2, A00, null, null, null, null, "opal_posts", null, str2, str3, "opal_posts", A1F, 0, false, false, true, true, false, false, true, false, true, false));
        AbstractC31175DnJ.A0s(null, contextualFeedFragment, A0r);
        AbstractC151756sL.A00().A02();
        AbstractC34277F9x.A00(new C35954FuE(), userSession, "tap", "content_notification", str, "", null);
    }
}
