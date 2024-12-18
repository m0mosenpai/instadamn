package X;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36658GEe implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Handler A02 = AbstractC167007dF.A0J();

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        this.A02.post(new GMN(this));
    }

    public C36658GEe(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
