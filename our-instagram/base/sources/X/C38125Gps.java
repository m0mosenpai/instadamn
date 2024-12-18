package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Gps, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38125Gps extends AbstractC60592pi {
    public boolean A00;
    public final AbstractC153666vb A01;
    public final UserSession A02;
    public final C65823Tug A03;
    public final JIG A04;
    public final C37794Gk9 A05;
    public final AbstractC38087GpG A06;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.5R5] */
    public C38125Gps(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C65823Tug c65823Tug, AbstractC38087GpG abstractC38087GpG, JIG jig) {
        AbstractC167007dF.A1F(userSession, 2, abstractC38087GpG);
        this.A02 = userSession;
        this.A06 = abstractC38087GpG;
        this.A03 = c65823Tug;
        this.A04 = jig;
        C37794Gk9 c37794Gk9 = new C37794Gk9(0, interfaceC11380iw, this);
        this.A05 = c37794Gk9;
        AbstractC153666vb abstractC153666vb = new AbstractC153666vb(context, abstractC018607g, new Object(), interfaceC11380iw, userSession);
        this.A01 = abstractC153666vb;
        abstractC153666vb.A03(c37794Gk9);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A00 = false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A00 = true;
    }

    public static final C127935qM A00(C38125Gps c38125Gps) {
        Iterator A04 = c38125Gps.A06.A04();
        C14360o3.A07(A04);
        while (A04.hasNext()) {
            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) A04.next();
            if (interfaceC66482zP instanceof C127935qM) {
                C127935qM c127935qM = (C127935qM) interfaceC66482zP;
                if (c127935qM.A01.A01() == EnumC132895zE.A04) {
                    return c127935qM;
                }
            }
        }
        return null;
    }
}
