package X;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L82 {
    public long A00;
    public AnonymousClass195 A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final UserSession A04;
    public final C49684LxF A05;
    public final String A06;
    public final C19L A07;

    public final void A00(boolean z) {
        C49684LxF c49684LxF = this.A05;
        if (z) {
            if (c49684LxF.A01 != null) {
                c49684LxF.A00(false);
                C5TA c5ta = c49684LxF.A01;
                if (c5ta != null) {
                    c5ta.A0A("reset player");
                }
                c49684LxF.A01 = null;
            }
        } else {
            C5TA c5ta2 = c49684LxF.A01;
            if (c5ta2 != null) {
                c5ta2.A0C("playback completed", true);
            }
        }
        this.A02.Egh(EnumC27391C6u.A02);
        InterfaceC74953Yl interfaceC74953Yl = this.A03;
        interfaceC74953Yl.Egh(new C66625UPn(0.0f, 0.0f, ((C66625UPn) interfaceC74953Yl.getValue()).A00, 0));
    }

    public L82(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1P(context, userSession);
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A04 = userSession;
        this.A06 = str;
        this.A03 = AbstractC25230BEn.A0U(new C66625UPn(0));
        this.A02 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), EnumC27391C6u.A02);
        this.A07 = AnonymousClass194.A02(new AnonymousClass197(null).plus(C12L.A00.AOT(258583802, 3)));
        this.A05 = new C49684LxF(context, userSession, interfaceC60442pS, new C30O(userSession, interfaceC60442pS, null, false));
    }
}
