package X;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6X3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6X3 extends AbstractC140596Xn {
    public int A00;
    public C3F1 A01;
    public final LinearLayoutManager A02;
    public final RecyclerView A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C3G2 A06;
    public final InterfaceC69543Ao A07;
    public final boolean A08;
    public final Context A09;

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r3 > r1.A1b()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC72953Ov A00(com.instagram.model.reels.Reel r3, X.C6X3 r4) {
        /*
            X.3Ao r0 = r4.A07
            r0.getClass()
            int r3 = r0.CNP(r3)
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.A02
            r1.getClass()
            int r0 = r1.A1a()
            if (r3 < r0) goto L1b
            int r1 = r1.A1b()
            r0 = 1
            if (r3 <= r1) goto L1c
        L1b:
            r0 = 0
        L1c:
            r2 = 0
            if (r0 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            X.3OO r1 = r0.A0V(r3)
            boolean r0 = r1 instanceof X.InterfaceC72953Ov
            if (r0 == 0) goto L2c
            r2 = r1
            X.3Ov r2 = (X.InterfaceC72953Ov) r2
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6X3.A00(com.instagram.model.reels.Reel, X.6X3):X.3Ov");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        if (AbstractC50102Ry.A00(super.A00, reel)) {
            super.A00 = null;
        } else {
            InterfaceC69543Ao interfaceC69543Ao = this.A07;
            interfaceC69543Ao.getClass();
            C3OO A0V = this.A03.A0V(interfaceC69543Ao.CNP(reel));
            if (A0V != 0 && (A0V instanceof C3Ow) && A0V.itemView.isAttachedToWindow()) {
                return C6PN.A04(((C3Ow) A0V).Ahl());
            }
        }
        return C6PN.A00();
    }

    public C6X3(Activity activity, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G2 c3g2, InterfaceC63982vJ interfaceC63982vJ, boolean z) {
        super(activity, interfaceC63982vJ);
        this.A05 = userSession;
        this.A09 = recyclerView.getContext();
        this.A04 = interfaceC11380iw;
        this.A03 = recyclerView;
        this.A06 = c3g2;
        this.A07 = (InterfaceC69543Ao) recyclerView.A0A;
        this.A02 = (LinearLayoutManager) recyclerView.A0D;
        this.A00 = -1;
        this.A08 = z;
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        super.A0A(reel, c41181vS);
        InterfaceC72953Ov A00 = A00(reel, this);
        if (A00 != null) {
            A00.EkR(this.A04);
        }
        this.A00 = -1;
        Context context = this.A09;
        UserSession userSession = this.A05;
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ = ComponentCallbacks2C142736cZ.A09;
        if (componentCallbacks2C142736cZ == null) {
            componentCallbacks2C142736cZ = new ComponentCallbacks2C142736cZ(context, userSession);
            context.registerComponentCallbacks(componentCallbacks2C142736cZ);
            ComponentCallbacks2C142736cZ.A09 = componentCallbacks2C142736cZ;
        }
        componentCallbacks2C142736cZ.A00();
    }
}
