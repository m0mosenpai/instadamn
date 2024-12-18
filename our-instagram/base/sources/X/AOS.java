package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public final class AOS implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C6WG A01;
    public final /* synthetic */ String A02;

    public AOS(Activity activity, C6WG c6wg, String str) {
        this.A01 = c6wg;
        this.A02 = str;
        this.A00 = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C22P c22p = C22P.A1U;
        ACRType aCRType = ACRType.A07;
        UserSession userSession = this.A01.A00;
        C8JX.A00(userSession).A00(c22p, aCRType);
        Bundle A00 = AbstractC86593tX.A0C(c22p).A00();
        String str = this.A02;
        A00.putString(AbstractC111324zv.A00(80), str);
        C14360o3.A0B(aCRType, 0);
        A00.putString(AbstractC111324zv.A00(145), aCRType.A00);
        Activity activity = this.A00;
        C6XJ A02 = C6XJ.A02(activity, A00, userSession, TransparentModalActivity.class, "clips_camera");
        A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        A02.A0A(activity, 9587);
        C14360o3.A0B(userSession, 0);
        FAR.A00(userSession, MSV.A00(116), str);
    }
}
