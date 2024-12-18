package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public final class ASS implements View.OnClickListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AlD A01;
    public final /* synthetic */ C17N A02;
    public final /* synthetic */ ViewOnFocusChangeListenerC207619Gp A03;

    public ASS(ImageView imageView, AlD alD, C17N c17n, ViewOnFocusChangeListenerC207619Gp viewOnFocusChangeListenerC207619Gp) {
        this.A03 = viewOnFocusChangeListenerC207619Gp;
        this.A00 = imageView;
        this.A02 = c17n;
        this.A01 = alD;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalStateException A14;
        int i;
        int A05 = C0f9.A05(-1747318696);
        Bundle A0b = AbstractC166987dD.A0b();
        C17N c17n = this.A02;
        ViewOnFocusChangeListenerC207619Gp viewOnFocusChangeListenerC207619Gp = this.A03;
        AlD alD = this.A01;
        A0b.putString("CREATOR_PROFILE_PICTURE_URL", c17n.Bhu().getUrl());
        A0b.putString("CREATOR_USERNAME", c17n.getUsername());
        String str = viewOnFocusChangeListenerC207619Gp.A0E;
        if (str != null) {
            A0b.putString("MEDIA_ID", str);
            String str2 = alD.A00.A08;
            if (str2 != null) {
                A0b.putString("QUESTION_ID", str2);
                A0b.putString("REEL_VIEWER_NAME", viewOnFocusChangeListenerC207619Gp.A0O);
                A0b.putString("MEDIA_DELIVERY_CLASS", viewOnFocusChangeListenerC207619Gp.A0D);
                A0b.putString("TRAY_SESSION_ID", viewOnFocusChangeListenerC207619Gp.A0P);
                A0b.putInt("TRAY_POSITION", viewOnFocusChangeListenerC207619Gp.A00);
                C14360o3.A0A(view);
                A0b.putParcelable("camera_entry_bounds", AbstractC13880nE.A0G(view));
                UserSession userSession = viewOnFocusChangeListenerC207619Gp.A0K;
                FragmentActivity fragmentActivity = viewOnFocusChangeListenerC207619Gp.A0J;
                C6XJ.A02(fragmentActivity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5187)).A0C(fragmentActivity);
                viewOnFocusChangeListenerC207619Gp.A0Q.add(this.A00);
                C0f9.A0C(-1018694077, A05);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1718693779;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -2030455948;
        }
        C0f9.A0C(i, A05);
        throw A14;
    }
}
