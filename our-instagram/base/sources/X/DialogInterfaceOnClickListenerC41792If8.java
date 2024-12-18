package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.If8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41792If8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass389 A00;

    public DialogInterfaceOnClickListenerC41792If8(AnonymousClass389 anonymousClass389) {
        this.A00 = anonymousClass389;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1XJ c1xj = C1XJ.A00;
        AnonymousClass389 anonymousClass389 = this.A00;
        FragmentActivity requireActivity = anonymousClass389.A00.requireActivity();
        UserSession userSession = anonymousClass389.A03;
        String str = userSession.userId;
        String moduleName = anonymousClass389.A02.getModuleName();
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
        ((C1XI) c1xj).A00.A0T();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("merchant_id", str);
        AbstractC37300Gc1.A0c(A05, moduleName);
        HCS hcs = new HCS();
        hcs.setArguments(A05);
        A0r.A0E(hcs);
        A0r.A04();
    }
}
