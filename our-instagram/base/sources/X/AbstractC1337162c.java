package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.62c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1337162c extends AbstractC1337262d {
    public final JPb A00;
    public final C25348BJr A01;

    @Override // X.AbstractC66422zJ
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final void bind(C3OO c3oo, C62a c62a) {
        InterfaceC30931Dil interfaceC30931Dil;
        C38321qM c38321qM;
        String id;
        Integer num;
        String str;
        C14360o3.A0B(c62a, 0);
        C14360o3.A0B(c3oo, 1);
        A03(c3oo, c62a);
        C120985dq c120985dq = c62a.A00;
        C25348BJr c25348BJr = this.A01;
        View view = c3oo.itemView;
        C14360o3.A06(view);
        C37644Ghd C09 = this.A00.C09(c120985dq);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        C14360o3.A0B(C09, 2);
        C37554GgA c37554GgA = c25348BJr.A00;
        if (c37554GgA != null && c120985dq.A0G.CdW()) {
            AbstractC37552Gg8 abstractC37552Gg8 = c37554GgA.A01.A0A;
            int A0C = abstractC37552Gg8.A0C(c120985dq);
            int i = A0C;
            do {
                i--;
                if (-1 < i) {
                    if (abstractC37552Gg8.A0F(i).A01 == EnumC129395t1.A02 || abstractC37552Gg8.A0F(i).A01 == EnumC129395t1.A03) {
                        break;
                    }
                } else {
                    break;
                }
            } while (abstractC37552Gg8.A0F(i).A01 != EnumC129395t1.A0A);
            c37554GgA.A00.EUw(c120985dq, (A0C - i) - 1);
            int i2 = A0C;
            while (true) {
                i2--;
                if (-1 < i2) {
                    if (abstractC37552Gg8.A0F(i2).A01 == EnumC129395t1.A0A) {
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 >= 0 && valueOf != null) {
                InterfaceC31077DlK interfaceC31077DlK = c37554GgA.A00;
                interfaceC31077DlK.EUy(c120985dq, (A0C - i2) - 1);
                interfaceC31077DlK.EWw(c120985dq, abstractC37552Gg8.A0F(i2).A03().A00);
            }
            if (c120985dq.A0G()) {
                int A00 = C37554GgA.A00(c37554GgA, C05F.A1F, A0C);
                Integer valueOf2 = Integer.valueOf(A00);
                if (A00 >= 0 && valueOf2 != null) {
                    c37554GgA.A00.EV1(c120985dq, (A0C - A00) - 1);
                }
                int A002 = C37554GgA.A00(c37554GgA, C05F.A15, A0C);
                Integer valueOf3 = Integer.valueOf(A002);
                if (A002 >= 0 && valueOf3 != null) {
                    c37554GgA.A00.EV0(c120985dq, (A0C - A002) - 1);
                }
                int i3 = A0C;
                while (true) {
                    i3--;
                    if (-1 < i3) {
                        if (abstractC37552Gg8.A0F(i3).A01 == EnumC129395t1.A0B) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                Integer valueOf4 = Integer.valueOf(i3);
                if (i3 >= 0 && valueOf4 != null) {
                    c37554GgA.A00.EUz(c120985dq, (A0C - i3) - 1);
                }
                int i4 = A0C;
                while (true) {
                    i4--;
                    if (i4 > 0) {
                        EnumC129395t1 enumC129395t1 = abstractC37552Gg8.A0F(i4).A01;
                        EnumC129395t1 enumC129395t12 = EnumC129395t1.A02;
                        if (enumC129395t1 == enumC129395t12 && abstractC37552Gg8.A0F(i4 - 1).A01 == enumC129395t12) {
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                Integer valueOf5 = Integer.valueOf(i4);
                if (i4 >= 0 && valueOf5 != null) {
                    c37554GgA.A00.EUx(c120985dq, (A0C - i4) - 1);
                }
            }
        }
        switch (c120985dq.A01.ordinal()) {
            case 0:
                interfaceC30931Dil = c25348BJr.A0G;
                break;
            case 1:
            case 2:
                interfaceC30931Dil = c25348BJr.A08;
                break;
            case 3:
                interfaceC30931Dil = c25348BJr.A0E;
                break;
            case 4:
                interfaceC30931Dil = c25348BJr.A0D;
                break;
            case 5:
            case Process.SIGTERM /* 15 */:
                interfaceC30931Dil = c25348BJr.A0H;
                break;
            case 6:
                interfaceC30931Dil = c25348BJr.A0I;
                break;
            case 7:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                interfaceC30931Dil = c25348BJr.A02;
                break;
            case 8:
                interfaceC30931Dil = c25348BJr.A0B;
                break;
            case 9:
                interfaceC30931Dil = c25348BJr.A0F;
                break;
        }
        interfaceC30931Dil.ED3(view, c120985dq, C09, c25348BJr.A04, bindingAdapterPosition);
        UserSession userSession = c25348BJr.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36330436867146609L)) {
            InterfaceC60442pS interfaceC60442pS = c25348BJr.A06;
            IJO ijo = new IJO(userSession, interfaceC60442pS, AbstractC75423a9.A02(c120985dq, interfaceC60442pS));
            boolean z = ijo.A04;
            if (z) {
                c38321qM = c120985dq.A06().A0K;
            } else {
                c38321qM = c120985dq.A02;
            }
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                UserSession userSession2 = ijo.A00;
                String A33 = c38321qM.A33();
                if (A33 == null) {
                    A33 = c38321qM.CAR();
                }
                C4E9 c4e9 = ijo.A02;
                C4E5 c4e5 = ijo.A03;
                if (z) {
                    num = C05F.A09;
                } else {
                    num = C05F.A0D;
                }
                switch (num.intValue()) {
                    case 17:
                        str = "reels_ads";
                        break;
                    case 18:
                        str = "reels_netego";
                        break;
                    case Process.SIGSTOP /* 19 */:
                        str = "reels_multi_ads";
                        break;
                    default:
                        str = "reels_organic";
                        break;
                }
                c4e9.A00(null, new J2O(c38321qM, ijo, AbstractC41071vF.A07(userSession2, c38321qM), A33, bindingAdapterPosition), new BFT(view, c4e5, str, ijo.A01.getModuleName(), id));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
    
        if (X.C903540u.A00.A01(r8, r3.A02) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(X.C3OO r17, X.C62a r18) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1337162c.A03(X.3OO, X.62a):void");
    }

    public AbstractC1337162c(JPb jPb, C25348BJr c25348BJr) {
        this.A01 = c25348BJr;
        this.A00 = jPb;
    }
}
