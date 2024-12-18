package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.MBz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50125MBz extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50125MBz(UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = 10;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        int i;
        Object obj3;
        String str3;
        String str4;
        Object obj4;
        int i2;
        switch (this.A03) {
            case 0:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 0;
                break;
            case 1:
                str4 = this.A04;
                obj3 = this.A02;
                obj4 = this.A01;
                str3 = this.A05;
                i2 = 1;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 2:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 2;
                break;
            case 3:
                return new C50125MBz(this.A02, this.A05, this.A04, interfaceC23621Ds, 3);
            case 4:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 4;
                break;
            case 5:
                obj3 = this.A02;
                str3 = this.A05;
                str4 = this.A04;
                obj4 = this.A01;
                i2 = 5;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 6:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 6;
                break;
            case 7:
                obj3 = this.A02;
                obj4 = this.A01;
                str3 = this.A05;
                str4 = this.A04;
                i2 = 7;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 8:
                obj3 = this.A02;
                obj4 = this.A01;
                str4 = this.A04;
                str3 = this.A05;
                i2 = 8;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 9:
                obj4 = this.A01;
                obj3 = this.A02;
                str3 = this.A05;
                str4 = this.A04;
                i2 = 9;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 10:
                C50125MBz c50125MBz = new C50125MBz((UserSession) this.A01, this.A04, this.A05, interfaceC23621Ds, this.A00);
                c50125MBz.A02 = obj;
                return c50125MBz;
            case 11:
                obj3 = this.A02;
                obj4 = this.A01;
                str4 = this.A04;
                str3 = this.A05;
                i2 = 11;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj4 = this.A01;
                str3 = this.A05;
                str4 = this.A04;
                obj3 = this.A02;
                i2 = 12;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 13;
                break;
            case 14:
                obj3 = this.A02;
                str3 = this.A05;
                str4 = this.A04;
                obj4 = this.A01;
                i2 = 14;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case Process.SIGTERM /* 15 */:
                obj3 = this.A02;
                str3 = this.A05;
                str4 = this.A04;
                obj4 = this.A01;
                i2 = 15;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 16:
                obj2 = this.A02;
                str2 = this.A05;
                str = this.A04;
                i = 16;
                break;
            case 17:
                obj2 = this.A02;
                str = this.A04;
                str2 = this.A05;
                i = 17;
                break;
            case 18:
                obj3 = this.A02;
                str4 = this.A04;
                str3 = this.A05;
                obj4 = this.A01;
                i2 = 18;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case Process.SIGSTOP /* 19 */:
                obj3 = this.A02;
                str4 = this.A04;
                str3 = this.A05;
                obj4 = this.A01;
                i2 = 19;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 20:
                obj3 = this.A02;
                str4 = this.A04;
                str3 = this.A05;
                obj4 = this.A01;
                i2 = 20;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            case 21:
                obj3 = this.A02;
                str3 = this.A05;
                str4 = this.A04;
                obj4 = this.A01;
                i2 = 21;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
            default:
                obj3 = this.A02;
                obj4 = this.A01;
                str3 = this.A05;
                str4 = this.A04;
                i2 = 22;
                return new C50125MBz(obj3, obj4, str3, str4, interfaceC23621Ds, i2);
        }
        C50125MBz c50125MBz2 = new C50125MBz(obj2, str2, str, interfaceC23621Ds, i);
        c50125MBz2.A01 = obj;
        return c50125MBz2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0932 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0857  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50125MBz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50125MBz) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50125MBz(Object obj, Object obj2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50125MBz(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A04 = str2;
    }
}
