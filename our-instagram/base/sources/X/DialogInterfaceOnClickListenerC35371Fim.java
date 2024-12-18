package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fim, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35371Fim implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public DialogInterfaceOnClickListenerC35371Fim(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A01 = obj;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
            fragmentActivity.onBackPressed();
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = (UserSession) this.A04;
            InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A02;
            String str = this.A06;
            String moduleName = interfaceC60442pS.getModuleName();
            String str2 = this.A05;
            User user = (User) this.A03;
            c1xj.A0N(fragmentActivity, user.A03.Bt7(), userSession, interfaceC60442pS, str, moduleName, "incentive", str2, user.A03.getUsername()).A05();
            return;
        }
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.A03;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
        JZ8 jz8 = AbstractC47193KtS.A01;
        UserSession userSession2 = (UserSession) this.A04;
        jz8.A01((Activity) this.A01, (C53O) this.A02, userSession2, this.A06, this.A05);
    }
}
