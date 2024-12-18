package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iw8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42770Iw8 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        if (C1ZP.A01 != null) {
            AbstractC40901I9z.A00().A01(this.A00, null, this.A01, EnumC39549HdL.A04, null);
        }
    }

    public C42770Iw8(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
