package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.VsL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69618VsL {
    public C66237U5h A00;
    public C66237U5h A01;
    public XCT A02;
    public Map A03;
    public Map A04;
    public final String A05;

    public C69618VsL(String str) {
        this.A05 = str;
    }

    public final void A00(Context context, InterfaceC62872tQ interfaceC62872tQ) {
        AbstractC167017dG.A1N(context, interfaceC62872tQ);
        String str = this.A05;
        Map map = this.A04;
        C69099Vhp c69099Vhp = new C69099Vhp(context, this, interfaceC62872tQ);
        if (interfaceC62872tQ instanceof C62862tP) {
            C62862tP c62862tP = (C62862tP) interfaceC62872tQ;
            AbstractC12990ll abstractC12990ll = c62862tP.A06;
            C14360o3.A07(abstractC12990ll);
            C1GL c1gl = c62862tP.A07;
            AbstractC192798gL A05 = C192108fB.A05(abstractC12990ll, str, map);
            A05.A00(new C67905V1u(c69099Vhp, 0));
            c1gl.schedule(A05);
            return;
        }
        throw new IllegalArgumentException("Host instance must be an instance of IgBloksHost");
    }
}
