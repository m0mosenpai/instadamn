package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.Fpc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35702Fpc implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnLongClickListenerC35702Fpc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C31261Doj c31261Doj = (C31261Doj) this.A01;
                AbstractC59962oe abstractC59962oe = c31261Doj.A04;
                DeveloperOptionsLauncher.launchDirectInboxV2ExperimentSwitcherTool(abstractC59962oe.requireContext(), abstractC59962oe.requireActivity(), c31261Doj.A07);
                return true;
            case 1:
                return true;
            case 2:
                EL6 el6 = (EL6) this.A01;
                if (el6.getContext() == null) {
                    return false;
                }
                Context context = el6.getContext();
                AbstractC31171DnF.A1O(context);
                C5SU A0f = AbstractC167017dG.A0f((Activity) context, el6.getString(2131953603));
                TextView textView = el6.A02;
                if (textView == null) {
                    str = "backupCodesTextView";
                    break;
                } else {
                    A0f.A03(textView);
                    A0f.A04 = new G9L(el6, 0);
                    AbstractC166997dE.A1P(A0f);
                    return true;
                }
            case 3:
                C32262EIw c32262EIw = (C32262EIw) this.A01;
                C5SU A0f2 = AbstractC167017dG.A0f(c32262EIw.requireActivity(), c32262EIw.getString(2131969380));
                ConfirmationCodeEditText confirmationCodeEditText = c32262EIw.A0A;
                if (confirmationCodeEditText == null) {
                    str = "confirmationCodeEditText";
                    break;
                } else {
                    A0f2.A03(confirmationCodeEditText);
                    A0f2.A04 = new G9L(c32262EIw, 1);
                    AbstractC166997dE.A1P(A0f2);
                    return true;
                }
            default:
                return false;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
