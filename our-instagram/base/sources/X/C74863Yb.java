package X;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74863Yb {
    public View A00;
    public boolean A01;
    public final InterfaceC74953Yl A02;
    public final UserSession A03;

    public C74863Yb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = true;
        C74883Yd c74883Yd = C74883Yd.A00;
        C14360o3.A0C(c74883Yd, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableState(c74883Yd, false);
    }
}
