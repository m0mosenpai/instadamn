package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AWJ implements BBT {
    public final /* synthetic */ C22948A9s A00;

    public AWJ(C22948A9s c22948A9s) {
        this.A00 = c22948A9s;
    }

    @Override // X.BBT
    public final C177797vD Cpz(C203678zW c203678zW) {
        C22948A9s c22948A9s = this.A00;
        Context context = c22948A9s.A00;
        UserSession userSession = c22948A9s.A05;
        AKM akm = new AKM(context, userSession, c22948A9s.A06);
        akm.A01 = c22948A9s.A03;
        C150156pL A00 = c22948A9s.A01.A00(EnumC142606cM.A01);
        C55613Omw c55613Omw = c22948A9s.A02;
        C9Y5 c9y5 = null;
        String str = null;
        if (c55613Omw != null) {
            String str2 = C1F8.A00(userSession).A04;
            if (str2 != null) {
                str = AbstractC001900j.A0B(AbstractC001900j.A0F("Bearer", str2)).toString();
            }
            String str3 = userSession.userId;
            c9y5 = new C9Y5(c55613Omw, c55613Omw.A00, C05F.A01, str3, str);
        }
        return new C177797vD(akm.A01(c203678zW, A00, c9y5, null, null, null).A00, c22948A9s.A04);
    }
}
