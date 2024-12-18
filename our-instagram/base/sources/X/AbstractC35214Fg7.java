package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fg7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35214Fg7 {
    public static final boolean A04(Activity activity, UserSession userSession, InterfaceC37122GXh interfaceC37122GXh, int i, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (z) {
            return false;
        }
        Resources resources = activity.getResources();
        String quantityString = resources.getQuantityString(R.plurals.direct_permissions_choice_delete_revamp_bottom_sheet_title, i);
        C14360o3.A07(quantityString);
        String A0q = AbstractC166997dE.A0q(resources, 2131957640);
        String quantityString2 = resources.getQuantityString(R.plurals.direct_permissions_choice_delete_revamp_bottom_sheet_body, i);
        C14360o3.A07(quantityString2);
        String A0q2 = AbstractC166997dE.A0q(resources, 2131960126);
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putCharSequence("content_text_key", quantityString2);
        A0b.putString("switch_text_key", A0q2);
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, abstractC59962oe, userSession);
        A0W.A0d = quantityString;
        A0W.A0g = A0q;
        A0W.A1J = true;
        A0W.A0K = new ViewOnClickListenerC35684FpJ(26, abstractC59962oe, interfaceC37122GXh, AbstractC31172DnG.A0r(activity));
        AbstractC31173DnH.A0w(activity, abstractC59962oe, A0W);
        return true;
    }

    public static final AnonymousClass172 A00(InterfaceC50518MRv interfaceC50518MRv) {
        if (interfaceC50518MRv.CVQ()) {
            return interfaceC50518MRv.BJU();
        }
        return (AnonymousClass172) AbstractC166987dD.A16(interfaceC50518MRv.Bl6());
    }

    public static final void A01(Context context, UserSession userSession, DirectThreadKey directThreadKey) {
        boolean A1b = AbstractC25233BEq.A1b(context, userSession, directThreadKey);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131959750);
        A0I.A09(2131959752);
        A0I.A0L(DialogInterfaceOnClickListenerC35455FkC.A00(directThreadKey, userSession, 28), 2131959745);
        A0I.A0D(DialogInterfaceOnClickListenerC35419Fjc.A00);
        AbstractC31178DnM.A1R(A0I, A1b);
    }

    public static final void A02(Context context, GZ5 gz5, Boolean bool, String str, int i) {
        int i2;
        int i3;
        Object[] objArr;
        String string;
        String quantityString = context.getResources().getQuantityString(R.plurals.twinbox_accept_request_dialog_title, i);
        C14360o3.A07(quantityString);
        if (i > 1) {
            i3 = 2131975823;
            objArr = AbstractC25228BEl.A1Y(i);
        } else {
            if (AbstractC166997dE.A1Z(bool, true)) {
                i2 = 2131975819;
            } else if (str != null) {
                i3 = 2131975820;
                objArr = new Object[]{str};
            } else {
                i2 = 2131975821;
            }
            string = context.getString(i2);
            C14360o3.A0A(string);
            String A0p = AbstractC166997dE.A0p(context, 2131975822);
            C14360o3.A0B(string, 2);
            C193328hC A0a = AbstractC31176DnK.A0a(context, string, quantityString);
            A0a.A0s(true);
            A0a.A0t(true);
            DialogInterfaceOnCancelListenerC35300FhZ.A00(A0a, gz5, 2);
            A0a.A0Z(DialogInterfaceOnClickListenerC35453FkA.A00(gz5, 11), EnumC193348hE.A02, A0p, true);
            AbstractC166987dD.A1W(A0a);
        }
        string = context.getString(i3, objArr);
        C14360o3.A0A(string);
        String A0p2 = AbstractC166997dE.A0p(context, 2131975822);
        C14360o3.A0B(string, 2);
        C193328hC A0a2 = AbstractC31176DnK.A0a(context, string, quantityString);
        A0a2.A0s(true);
        A0a2.A0t(true);
        DialogInterfaceOnCancelListenerC35300FhZ.A00(A0a2, gz5, 2);
        A0a2.A0Z(DialogInterfaceOnClickListenerC35453FkA.A00(gz5, 11), EnumC193348hE.A02, A0p2, true);
        AbstractC166987dD.A1W(A0a2);
    }

    public static final void A03(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC50518MRv interfaceC50518MRv, GZ5 gz5, int i) {
        String str;
        String A0W;
        boolean A1a = AbstractC167017dG.A1a(userSession, abstractC59962oe);
        Context requireContext = abstractC59962oe.requireContext();
        AnonymousClass172 A00 = A00(interfaceC50518MRv);
        if (A00 != null) {
            str = AbstractC101904i3.A05(A00);
        } else {
            str = null;
        }
        int size = interfaceC50518MRv.Bl6().size();
        if (i == A1a) {
            i = size;
        }
        if (str != null && (A0W = AbstractC31175DnJ.A0W(requireContext.getResources(), str, R.plurals.inbox_folder_request_thread_move_dialog_title, i)) != null) {
            boolean A03 = C2E8.A03(userSession);
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            if (A03) {
                FVA.A01(requireActivity, userSession, C2057498z.A00, gz5);
            } else {
                FVA.A00(requireContext, requireActivity, userSession, gz5, A0W);
            }
        }
    }
}
