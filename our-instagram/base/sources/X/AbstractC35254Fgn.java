package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fgn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35254Fgn {
    public static final C193328hC A00(Context context) {
        C14360o3.A0B(context, 0);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131961880);
        A0I.A0J(DialogInterfaceOnClickListenerC35440Fjx.A00, 2131960994);
        return A0I;
    }

    public static final void A03(Context context, AbstractC115105If abstractC115105If) {
        C14360o3.A0B(context, 0);
        if (abstractC115105If.A01() != null) {
            A01(context);
        }
        C9CD c9cd = (C9CD) abstractC115105If.A00();
        if (c9cd != null) {
            A04(context, new C115115Ig(new FLY(c9cd.A02, c9cd.A01, c9cd.A03)));
        }
    }

    public static final void A01(Context context) {
        C11T.A02(new GN6(context));
    }

    public static final void A04(Context context, AbstractC115105If abstractC115105If) {
        FLY fly = (FLY) ((C115115Ig) abstractC115105If).A00;
        if (!fly.A02) {
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            String str = fly.A01;
            if (str == null) {
                str = AbstractC166997dE.A0p(context, 2131961880);
            }
            A06(context, fly.A00, str);
        }
    }

    public static final void A02(Context context, AbstractC115105If abstractC115105If) {
        AbstractC167017dG.A1N(context, abstractC115105If);
        if (abstractC115105If.A01() != null) {
            A01(context);
            return;
        }
        InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
        if (A0L == null) {
            return;
        }
        A04(context, new C115115Ig(new FLY(A0L.getErrorTitle(), A0L.getErrorMessage(), A0L.isFeedbackRequired())));
    }

    public static final void A05(Context context, CharSequence charSequence, String str) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0r(charSequence);
        A0I.A07();
        if (str != null) {
            A0I.A05 = str;
        }
        C11T.A02(new GN7(A0I));
    }

    public static final void A06(Context context, CharSequence charSequence, String str) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0r(charSequence);
        A0I.A0J(null, 2131960994);
        if (str != null) {
            A0I.A05 = str;
        }
        C11T.A02(new GN7(A0I));
    }

    public static void A07(Fragment fragment, AbstractC115105If abstractC115105If) {
        A02(fragment.requireContext(), abstractC115105If);
    }
}
