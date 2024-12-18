package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Rbh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60927Rbh extends AbstractC60592pi {
    public List A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC65458TkU A03;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C1GJ.A03(new C60940Rbu(this, 1));
    }

    public C60927Rbh(Context context, UserSession userSession, InterfaceC65458TkU interfaceC65458TkU) {
        this.A01 = context;
        this.A03 = interfaceC65458TkU;
        this.A02 = userSession;
    }
}
