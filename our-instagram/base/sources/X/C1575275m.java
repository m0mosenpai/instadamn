package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.75m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575275m implements InterfaceC165087Zx {
    public C1I4 A00;
    public boolean A01;
    public final ArrayList A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final C2d4 A06;
    public final UserSession A07;
    public final C163867Va A08;
    public final C7W6 A09;
    public final InterfaceC164927Zh A0A;

    public C1575275m(C2d4 c2d4, UserSession userSession, C163867Va c163867Va, C7W6 c7w6, InterfaceC164927Zh interfaceC164927Zh, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(c163867Va, 2);
        C14360o3.A0B(interfaceC16820sZ, 3);
        C14360o3.A0B(c2d4, 4);
        C14360o3.A0B(interfaceC164927Zh, 6);
        C14360o3.A0B(c7w6, 7);
        this.A07 = userSession;
        this.A08 = c163867Va;
        this.A04 = interfaceC16820sZ;
        this.A06 = c2d4;
        this.A05 = interfaceC16820sZ2;
        this.A0A = interfaceC164927Zh;
        this.A09 = c7w6;
        this.A03 = C1XM.A00(new C206949Dz(this, 40));
        this.A02 = new ArrayList();
    }

    @Override // X.InterfaceC165087Zx
    public final boolean CSr() {
        return this.A01;
    }

    @Override // X.InterfaceC165087Zx
    public final void Czy(View view) {
        if (view != null && this.A01) {
            this.A02.add(LC2.A01(view, (RecyclerView) this.A03.getValue(), true));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 == X.C2EY.A19) goto L14;
     */
    @Override // X.InterfaceC165087Zx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ElB(android.view.View r13, X.C83403nh r14, com.instagram.model.direct.messageid.MessageIdentifier r15, long r16) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575275m.ElB(android.view.View, X.3nh, com.instagram.model.direct.messageid.MessageIdentifier, long):void");
    }
}
