package X;

import android.app.Application;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;

/* renamed from: X.BbI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25801BbI extends C193578hc {
    public C5C3 A00;
    public boolean A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25801BbI(Application application, UserSession userSession, String str) {
        super(application);
        AbstractC167017dG.A1P(application, userSession);
        this.A04 = userSession;
        str = str == null ? "" : str;
        long j = C5C2.A01;
        ParcelableSnapshotMutableState A0U = AbstractC25230BEn.A0U(CH8.A00(new C5C3(str, j)));
        this.A03 = A0U;
        this.A02 = AbstractC25229BEm.A0R(A0U.getValue());
        this.A00 = new C5C3("", j);
    }
}
