package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.Inr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42267Inr implements InterfaceC41501vz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass420 A01;
    public final /* synthetic */ C38321qM A02;

    public C42267Inr(Context context, AnonymousClass420 anonymousClass420, C38321qM c38321qM) {
        this.A01 = anonymousClass420;
        this.A00 = context;
        this.A02 = c38321qM;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        IL2 il2;
        Integer num;
        Context context;
        int i;
        int A03 = C0f9.A03(-2026806485);
        C42241InR c42241InR = (C42241InR) obj;
        int A0N = AbstractC167017dG.A0N(c42241InR, -130055729);
        AnonymousClass420 anonymousClass420 = this.A01;
        InterfaceC41501vz interfaceC41501vz = anonymousClass420.A00;
        if (interfaceC41501vz != null) {
            anonymousClass420.A02.A02(interfaceC41501vz, C42241InR.class);
        }
        switch (c42241InR.A00.intValue()) {
            case 0:
                il2 = new IL2(this.A00);
                num = C05F.A0u;
                il2.A00(null, anonymousClass420.A03, null, num);
                break;
            case 1:
            case 6:
            case 7:
            default:
                context = this.A00;
                i = 2131969147;
                IQU.A00(context, i);
                break;
            case 2:
                il2 = new IL2(this.A00);
                num = C05F.A0Y;
                il2.A00(null, anonymousClass420.A03, null, num);
                break;
            case 3:
                il2 = new IL2(this.A00);
                num = C05F.A0j;
                il2.A00(null, anonymousClass420.A03, null, num);
                break;
            case 4:
                il2 = new IL2(this.A00);
                num = C05F.A0N;
                il2.A00(null, anonymousClass420.A03, null, num);
                break;
            case 5:
                context = this.A00;
                i = 2131969146;
                IQU.A00(context, i);
                break;
            case 8:
                User A14 = AbstractC25226BEj.A14(this.A02);
                if (A14 != null) {
                    String A0r = AbstractC166997dE.A0r(this.A00.getResources(), A14.getUsername(), 2131969106);
                    C14360o3.A07(A0r);
                    EnumC141996bI enumC141996bI = EnumC141996bI.A05;
                    C146106i8 A0X = AbstractC31173DnH.A0X(A0r);
                    A0X.A0C = enumC141996bI;
                    AbstractC31178DnM.A1S(A0X);
                    break;
                }
                break;
        }
        C1DW.A00(anonymousClass420.A03).A03(this.A02);
        C0f9.A0A(-1783011962, A0N);
        C0f9.A0A(1854593188, A03);
    }
}
