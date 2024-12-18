package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fv2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36004Fv2 implements InterfaceC11380iw {
    public static final C36004Fv2 A00 = new Object();
    public static final String __redex_internal_original_name = "DirectVideoCallDialogHelper";

    public static final void A00(Context context, UserSession userSession, Runnable runnable, Runnable runnable2, List list) {
        String A0a;
        int i;
        Object[] objArr;
        String string;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        int size = list.size();
        if (size == 1) {
            A0a = context.getString(2131976806);
        } else {
            A0a = AbstractC31177DnL.A0a(context, size, 2131976803);
        }
        C14360o3.A0A(A0a);
        A0I.A05 = A0a;
        int size2 = list.size();
        if (size2 != 1) {
            if (size2 != 2) {
                Resources resources = context.getResources();
                boolean A05 = C18U.A05(C06090Tz.A05, userSession);
                int i2 = R.plurals.videocall_start_multiple_blocked_user_message;
                if (A05) {
                    i2 = R.plurals.videocall_start_multiple_blocked_user_message_chat;
                }
                int i3 = size2 - 2;
                string = resources.getQuantityString(i2, i3, list.get(0), list.get(1), Integer.valueOf(i3));
                C14360o3.A07(string);
                A0I.A0r(string);
                A0I.A0d(DialogInterfaceOnClickListenerC35453FkA.A00(runnable2, 12), AbstractC166997dE.A0p(context, 2131976802));
                DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, runnable, 4);
                A0I.A0D(DialogInterfaceOnClickListenerC35417Fja.A00);
                A0I.A0t(true);
                AbstractC166987dD.A1W(A0I);
            }
            i = 2131976807;
            if (C18U.A05(C06090Tz.A05, userSession)) {
                i = 2131976808;
            }
            objArr = new Object[]{list.get(0), list.get(1)};
        } else {
            i = 2131976804;
            if (C18U.A05(C06090Tz.A05, userSession)) {
                i = 2131976805;
            }
            objArr = new Object[]{list.get(0)};
        }
        string = context.getString(i, objArr);
        C14360o3.A07(string);
        A0I.A0r(string);
        A0I.A0d(DialogInterfaceOnClickListenerC35453FkA.A00(runnable2, 12), AbstractC166997dE.A0p(context, 2131976802));
        DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, runnable, 4);
        A0I.A0D(DialogInterfaceOnClickListenerC35417Fja.A00);
        A0I.A0t(true);
        AbstractC166987dD.A1W(A0I);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread";
    }
}
