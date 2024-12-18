package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.MAo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50115MAo extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50115MAo(Object obj, Object obj2, Object obj3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        Object obj4;
        int i;
        switch (this.A00) {
            case 0:
                obj4 = this.A02;
                obj2 = this.A03;
                str2 = this.A05;
                str = this.A04;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj4 = this.A02;
                obj2 = this.A03;
                str2 = this.A05;
                str = this.A04;
                obj3 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                str2 = this.A05;
                obj3 = this.A01;
                str = this.A04;
                obj4 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A03;
                str = this.A04;
                str2 = this.A05;
                obj3 = this.A01;
                obj4 = this.A02;
                i = 3;
                break;
            default:
                obj2 = this.A03;
                str2 = this.A05;
                obj4 = this.A02;
                obj3 = this.A01;
                str = this.A04;
                i = 4;
                break;
        }
        return new C50115MAo(obj4, obj2, obj3, str2, str, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C102884kP c102884kP;
        InterfaceC103384lE interfaceC103384lE;
        C6FX A0s;
        int i;
        Object A0n;
        switch (this.A00) {
            case 0:
                AbstractC09560e7.A00(obj);
                c102884kP = (C102884kP) this.A02;
                interfaceC103384lE = (InterfaceC103384lE) this.A03;
                A0s = AbstractC25225BEi.A0s();
                A0s.A01(this.A05);
                i = 1;
                A0n = AbstractC167007dF.A0n("error_details", this.A04);
                A0s.A03(A0n, i);
                C6FP.A03((C6FG) this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                c102884kP = (C102884kP) this.A02;
                interfaceC103384lE = (InterfaceC103384lE) this.A03;
                A0s = AbstractC25225BEi.A0s();
                A0s.A01(this.A05);
                i = 1;
                A0n = this.A04;
                A0s.A03(A0n, i);
                C6FP.A03((C6FG) this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
                break;
            case 2:
                AbstractC09560e7.A00(obj);
                C41761wQ A0S = AbstractC31174DnI.A0S();
                C6JY c6jy = C6JW.A00((UserSession) this.A03, "XmaShareSenderHelper").A00;
                String str = this.A05;
                C44999Jvp c44999Jvp = (C44999Jvp) this.A01;
                String str2 = c44999Jvp.A03;
                String str3 = c44999Jvp.A07;
                String str4 = c44999Jvp.A06;
                byte[] bArr = c44999Jvp.A09;
                String str5 = c44999Jvp.A04;
                int i2 = c44999Jvp.A00;
                int i3 = c44999Jvp.A01;
                String str6 = c44999Jvp.A05;
                String str7 = c44999Jvp.A02;
                A0S.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, AbstractC140946Yw.A03((InterfaceC83713oG) this.A02)).A0L(new C48383Lax(c44999Jvp.A08, bArr, c6jy, str5, str6, str3, str4, str2, str, this.A04, str7, i2, i3, 0)), "instagram_xma_external_link_client_send"), C49784Lyr.A00);
                break;
            case 3:
                AbstractC09560e7.A00(obj);
                C31814DyY c31814DyY = (C31814DyY) this.A03;
                FHE fhe = (FHE) c31814DyY.A02.getValue();
                String str8 = this.A04;
                String str9 = this.A05;
                AbstractC167017dG.A1N(str8, str9);
                C25621Ms A0M = AbstractC31177DnL.A0M(fhe.A00);
                A0M.A0B("discover/recommended_accounts_for_category/");
                A0M.A0H("category_id", str8);
                A0M.A0H("target_id", str9);
                C1ON A0e = AbstractC25227BEk.A0e(A0M, C32132EAf.class, C34744FSj.class);
                A0e.A00 = new C31702Dw7(c31814DyY, 15);
                C1GJ.A00((Context) this.A01, (AbstractC018607g) this.A02, A0e);
                break;
            default:
                AbstractC09560e7.A00(obj);
                C27886CQx c27886CQx = ((C27267C1k) this.A03).A00;
                String str10 = this.A05;
                User user = (User) this.A02;
                C38321qM c38321qM = (C38321qM) this.A01;
                String str11 = this.A04;
                C14360o3.A0B(str10, 0);
                AbstractC167027dH.A13(user, c38321qM, str11);
                InterfaceC36901nn A00 = C36911no.A00();
                UserSession userSession = c27886CQx.A00;
                JX0 E6g = A00.E6g(userSession);
                DirectShareTarget directShareTarget = new DirectShareTarget(user);
                E6g.A01(directShareTarget).END(null, null, c38321qM, directShareTarget, str10, "spins_reply", MSV.A00(64), str11, null, C35143Fek.A00.A01(userSession, directShareTarget));
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50115MAo) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
