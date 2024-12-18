package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class B5b extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5b(C28224CcU c28224CcU, EnumC193878i8 enumC193878i8, C8CS c8cs, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c28224CcU;
        this.A07 = z;
        this.A01 = c8cs;
        this.A05 = interfaceC16660sJ;
        this.A06 = str;
        this.A04 = enumC193878i8;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            C19L c19l = (C19L) this.A04;
            boolean z = this.A07;
            return new B5b((Activity) this.A03, (UserSession) this.A05, this.A06, interfaceC23621Ds, c19l, z);
        }
        C28224CcU c28224CcU = (C28224CcU) this.A03;
        boolean z2 = this.A07;
        C8CS c8cs = (C8CS) this.A01;
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
        return new B5b(c28224CcU, (EnumC193878i8) this.A04, c8cs, this.A06, interfaceC23621Ds, interfaceC16660sJ, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5b) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5b(Activity activity, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, C19L c19l, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c19l;
        this.A07 = z;
        this.A06 = str;
        this.A03 = activity;
        this.A05 = userSession;
    }
}
