package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.GDf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36633GDf implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AbstractC31173DnH.A0v(this.A00, AbstractC166987dD.A0b(), userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5180));
    }

    public C36633GDf(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
