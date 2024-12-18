package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36670GEq implements GYB {
    public final Context A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A03;
        String string = C41768Iek.A02(userSession, C41768Iek.A00).getString(AbstractC111324zv.A00(2654), null);
        C41220IMj A0V = C1XJ.A00.A0V(userSession);
        C14360o3.A07(A0V);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AbstractC018607g abstractC018607g = this.A01;
        A0V.A00(context, abstractC018607g, interfaceC11380iw, string, true);
        if (string != null) {
            C14360o3.A0B(abstractC018607g, 3);
            GUV guv = GUV.A00;
            GUW guw = GUW.A00;
            AbstractC167017dG.A1S(guv, guw);
            A0V.A01(context, abstractC018607g, guw, new C50275MIe(context, A0V, abstractC018607g, guw, guv, interfaceC11380iw, string, 1));
        }
    }

    public C36670GEq(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
        this.A00 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = A00;
    }
}
