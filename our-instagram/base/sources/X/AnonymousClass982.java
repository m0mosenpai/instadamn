package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.982, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass982 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final Capabilities A02;
    public final Integer A03;
    public final boolean A04;

    public static final FragmentActivity A00(AnonymousClass982 anonymousClass982) {
        return anonymousClass982.A00.requireActivity();
    }

    public AnonymousClass982(AbstractC59962oe abstractC59962oe, UserSession userSession, Capabilities capabilities, Integer num, boolean z) {
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = capabilities;
        this.A03 = num;
        this.A04 = z;
    }
}
