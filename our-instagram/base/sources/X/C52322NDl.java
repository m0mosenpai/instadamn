package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52322NDl extends AbstractC61132qb {
    public final Context A00;
    public final C07T A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final EnumC53206Ng4 A04;
    public final OBK A05;
    public final InterfaceC15070pN A06;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        EnumC53206Ng4 enumC53206Ng4 = this.A04;
        InterfaceC15070pN interfaceC15070pN = this.A06;
        Context context = this.A00;
        AbstractC018607g abstractC018607g = this.A02;
        C07T c07t = this.A01;
        OBK obk = this.A05;
        return new C53041NdD(userSession, enumC53206Ng4, new C49655Lwm(context, c07t, abstractC018607g, userSession, obk), obk, interfaceC15070pN);
    }

    public C52322NDl(Context context, C07T c07t, AbstractC018607g abstractC018607g, UserSession userSession, EnumC53206Ng4 enumC53206Ng4, OBK obk, InterfaceC15070pN interfaceC15070pN) {
        AbstractC167027dH.A13(userSession, enumC53206Ng4, interfaceC15070pN);
        this.A03 = userSession;
        this.A04 = enumC53206Ng4;
        this.A06 = interfaceC15070pN;
        this.A00 = context;
        this.A02 = abstractC018607g;
        this.A01 = c07t;
        this.A05 = obk;
    }
}
