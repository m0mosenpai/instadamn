package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36669GEp implements GYB {
    public final Activity A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final Context A03;

    public C36669GEp(Context context, UserSession userSession) {
        this.A03 = context;
        this.A02 = userSession;
        this.A00 = (Activity) AbstractC13320mI.A00(context, Activity.class);
        this.A01 = (FragmentActivity) AbstractC13320mI.A00(context, FragmentActivity.class);
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FVS.A00();
        Context context = this.A03;
        DialogInterfaceOnClickListenerC35454FkB A00 = DialogInterfaceOnClickListenerC35454FkB.A00(this, 56);
        DialogInterfaceOnClickListenerC35434Fjr dialogInterfaceOnClickListenerC35434Fjr = DialogInterfaceOnClickListenerC35434Fjr.A00;
        C14360o3.A0B(dialogInterfaceOnClickListenerC35434Fjr, 2);
        AbstractC35175FfS.A01(context, A00, dialogInterfaceOnClickListenerC35434Fjr);
    }
}
