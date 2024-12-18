package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.urlhandlers.passwordreset.PasswordResetExternalUrlHandlerActivity;

/* renamed from: X.Dy3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31784Dy3 extends C06K {
    public final int A00;
    public final Object A01;

    public C31784Dy3(PasswordResetExternalUrlHandlerActivity passwordResetExternalUrlHandlerActivity, int i) {
        this.A00 = i;
        this.A01 = passwordResetExternalUrlHandlerActivity;
    }

    @Override // X.C06K
    public final void A05(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        boolean z;
        if (this.A00 != 0) {
            z = fragment instanceof C72743Nv;
        } else {
            z = fragment instanceof C66207U4d;
        }
        if (z && abstractC10360h2.A0U.A04().isEmpty()) {
            ((Activity) this.A01).finish();
        }
    }
}
