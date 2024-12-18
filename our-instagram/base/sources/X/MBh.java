package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class MBh extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBh(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str3;
        int i;
        switch (this.A02) {
            case 0:
                obj4 = this.A04;
                str2 = this.A07;
                str = this.A06;
                str3 = this.A08;
                obj2 = this.A05;
                obj3 = this.A01;
                obj5 = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A05;
                str = this.A06;
                str2 = this.A07;
                obj3 = this.A01;
                obj4 = this.A04;
                obj5 = this.A03;
                str3 = this.A08;
                i = 1;
                break;
            default:
                MBh mBh = new MBh((FragmentActivity) this.A03, (LI9) this.A05, (User) this.A04, this.A08, this.A06, this.A07, interfaceC23621Ds);
                mBh.A01 = obj;
                return mBh;
        }
        return new MBh(obj4, obj2, obj3, obj5, str2, str, str3, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0083 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBh) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBh(FragmentActivity fragmentActivity, LI9 li9, User user, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 2;
        this.A05 = li9;
        this.A04 = user;
        this.A03 = fragmentActivity;
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
    }
}
