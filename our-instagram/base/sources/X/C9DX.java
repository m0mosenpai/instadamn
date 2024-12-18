package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import java.util.List;

/* renamed from: X.9DX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DX extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 0;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DX(Activity activity, C18920wW c18920wW, UserSession userSession, C84923qg c84923qg, C38321qM c38321qM, InterfaceC171787l8 interfaceC171787l8, C24205AoS c24205AoS, Integer num, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c38321qM;
        this.A09 = c84923qg;
        this.A01 = list;
        this.A04 = num;
        this.A0A = userSession;
        this.A0B = z;
        this.A05 = c18920wW;
        this.A02 = interfaceC171787l8;
        this.A07 = activity;
        this.A08 = c24205AoS;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A06 != 0) {
            C38321qM c38321qM = (C38321qM) this.A03;
            C84923qg c84923qg = (C84923qg) this.A09;
            List list = (List) this.A01;
            Integer num = (Integer) this.A04;
            UserSession userSession = (UserSession) this.A0A;
            boolean z = this.A0B;
            return new C9DX((Activity) this.A07, (C18920wW) this.A05, userSession, c84923qg, c38321qM, (InterfaceC171787l8) this.A02, (C24205AoS) this.A08, num, list, interfaceC23621Ds, z);
        }
        return new C9DX((C9CB) this.A08, (IGSlotFetcher) this.A0A, (C918349l) this.A09, interfaceC23621Ds, (InterfaceC16660sJ) this.A07, this.A0B);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DX) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DX(C9CB c9cb, IGSlotFetcher iGSlotFetcher, C918349l c918349l, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A08 = c9cb;
        this.A0A = iGSlotFetcher;
        this.A09 = c918349l;
        this.A0B = z;
        this.A07 = interfaceC16660sJ;
    }
}
