package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fk7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35450Fk7 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnClickListenerC35450Fk7(FragmentActivity fragmentActivity, UserSession userSession, User user, int i) {
        this.A00 = i;
        if (13 - i != 0) {
            this.A03 = userSession;
            this.A01 = fragmentActivity;
        } else {
            this.A01 = fragmentActivity;
            this.A03 = userSession;
        }
        this.A02 = user;
    }

    public static boolean A00(Context context, C36325G0u c36325G0u, int i, int i2) {
        return C14360o3.A0K(c36325G0u.A06[i], context.getString(i2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032b  */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r22, int r23) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnClickListenerC35450Fk7.onClick(android.content.DialogInterface, int):void");
    }

    public DialogInterfaceOnClickListenerC35450Fk7(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }
}
