package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.BgD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26084BgD extends C0T6 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C26084BgD) && ((C26084BgD) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d3, code lost:
    
        if (r3.A01 == r4.A01) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r1 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if (r3.A02 != r4.A02) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (X.C14360o3.A0K(r3.A02, r4.A02) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00aa, code lost:
    
        r1 = r3.A03;
        r0 = r4.A03;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26084BgD.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0G;
        Object obj;
        String str;
        int A02;
        int A0J;
        Object obj2;
        int i;
        switch (this.A00) {
            case 0:
                A0J = AbstractC166997dE.A0J(this.A03, this.A01 * 31);
                obj2 = this.A02;
                if (obj2 == null) {
                    i = 0;
                    break;
                }
                i = obj2.hashCode();
                break;
            case 1:
                A0J = AbstractC166997dE.A0J(this.A02, this.A01 * 31);
                obj2 = this.A03;
                i = obj2.hashCode();
                break;
            case 2:
                A0G = AbstractC166987dD.A0G(this.A03);
                obj = this.A02;
                A02 = obj.hashCode();
                A0J = (A0G + A02) * 31;
                i = this.A01;
                break;
            case 3:
                A0G = AbstractC166987dD.A0G(this.A02);
                obj = this.A03;
                if (obj == null) {
                    A02 = 0;
                    A0J = (A0G + A02) * 31;
                    i = this.A01;
                    break;
                }
                A02 = obj.hashCode();
                A0J = (A0G + A02) * 31;
                i = this.A01;
            case 4:
                A0G = F2U.A00((Integer) this.A02) * 31;
                int A0H = AbstractC166987dD.A0H(this.A03);
                switch (A0H) {
                    case 1:
                        str = "SINGLE_RECIPIENT";
                        break;
                    case 2:
                        str = "CLIPS_PREVIEW_SHARE_MULTI_RECIPIENT";
                        break;
                    case 3:
                        str = "CLIPS_PREVIEW_SHARE_SINGLE_RECIPIENT";
                        break;
                    case 4:
                        str = "ADD_TO_CHANNEL_ENTRY";
                        break;
                    default:
                        str = "MULTI_RECIPIENT";
                        break;
                }
                A02 = AbstractC25226BEj.A02(str, A0H);
                A0J = (A0G + A02) * 31;
                i = this.A01;
                break;
            case 5:
                A0J = (AbstractC166987dD.A0G(this.A03) + this.A01) * 31;
                obj2 = this.A02;
                i = obj2.hashCode();
                break;
            case 6:
            default:
                A0G = this.A02.hashCode() * 31;
                obj = this.A03;
                A02 = obj.hashCode();
                A0J = (A0G + A02) * 31;
                i = this.A01;
                break;
            case 7:
                A0G = AbstractC166987dD.A0G(this.A03);
                obj = this.A02;
                A02 = obj.hashCode();
                A0J = (A0G + A02) * 31;
                i = this.A01;
                break;
        }
        return A0J + i;
    }

    public static final C26084BgD A00(C51759Mti c51759Mti, List list, int i) {
        AbstractC167017dG.A1N(c51759Mti, list);
        return new C26084BgD(c51759Mti, list, i);
    }

    public C26084BgD(EnumC27404C7h enumC27404C7h, C5Hc c5Hc, int i) {
        this.A00 = 2;
        C14360o3.A0B(c5Hc, 1);
        this.A03 = c5Hc;
        this.A02 = enumC27404C7h;
        this.A01 = i;
    }

    public C26084BgD(InterfaceC30819Dgu interfaceC30819Dgu, C6R c6r, int i) {
        this.A00 = 3;
        C14360o3.A0B(c6r, 1);
        this.A02 = c6r;
        this.A03 = interfaceC30819Dgu;
        this.A01 = i;
    }

    public C26084BgD(List list, List list2, int i) {
        this.A00 = 7;
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = i;
    }

    public C26084BgD(User user, C5Hc c5Hc, int i) {
        this.A00 = 8;
        AbstractC167017dG.A1P(user, c5Hc);
        this.A02 = user;
        this.A03 = c5Hc;
        this.A01 = i;
    }

    public C26084BgD(Integer num, Integer num2, int i) {
        this.A00 = 4;
        AbstractC167017dG.A1P(num, num2);
        this.A02 = num;
        this.A03 = num2;
        this.A01 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26084BgD(int i, int i2) {
        this((InterfaceC30819Dgu) null, (i2 & 1) != 0 ? C6R.A03 : null, (i2 & 4) != 0 ? 2131957021 : i);
        this.A00 = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26084BgD(int i, Integer num) {
        this((i & 1) != 0 ? C05F.A01 : num, (i & 2) != 0 ? C05F.A00 : null, 0);
        this.A00 = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26084BgD() {
        this(new C51759Mti((C26014Bf2) null, (Integer) null, (DefaultConstructorMarker) null, 3, 5), C16930sl.A00, 0);
        this.A00 = 6;
    }

    public C26084BgD(C51759Mti c51759Mti, List list, int i) {
        this.A00 = 6;
        this.A02 = c51759Mti;
        this.A03 = list;
        this.A01 = i;
    }

    public C26084BgD(MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i) {
        this.A00 = 5;
        this.A03 = interfaceC50520MRx;
        this.A01 = i;
        this.A02 = messagingUser;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26084BgD(EnumC27404C7h enumC27404C7h, int i) {
        this(enumC27404C7h, AbstractC133095zb.A04(EnumC27404C7h.A07, EnumC27404C7h.A06), i);
        this.A00 = 2;
    }

    public C26084BgD(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }
}
