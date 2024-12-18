package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC35338FiF implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ DialogInterfaceOnClickListenerC35338FiF(Fragment fragment, UserSession userSession, Integer num) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = num;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FVP.A01(this.A00, this.A01, this.A02);
    }
}
