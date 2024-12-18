package com.instagram.direct.fragment.channels.discovery.base;

import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC32730Eaw;
import X.AbstractC52922bZ;
import X.AnonymousClass195;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C12L;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C32099E8x;
import X.C32100E8y;
import X.C32728Eat;
import X.C32729Eau;
import X.C37055GUl;
import X.C44Q;
import X.C4GR;
import X.EnumC09460dv;
import X.EnumC33329EoO;
import X.EnumC33356Eop;
import X.EnumC33424Epv;
import X.FIU;
import X.GSR;
import X.GSS;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.InterfaceC66482zP;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ChannelDiscoveryViewModel extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public AnonymousClass195 A03;
    public final UserSession A04;
    public final EnumC33329EoO A05;
    public final boolean A09;
    public final InterfaceC09390do A06 = C37055GUl.A00(this, EnumC09460dv.A02, 26);
    public final C05A A08 = AbstractC31171DnF.A0o();
    public final C05A A07 = AbstractC25225BEi.A1H(EnumC33356Eop.A02);
    public final C05A A0A = AbstractC25227BEk.A0z();
    public boolean A02 = true;

    public ChannelDiscoveryViewModel(UserSession userSession, EnumC33329EoO enumC33329EoO, boolean z) {
        this.A04 = userSession;
        this.A05 = enumC33329EoO;
        this.A09 = z;
    }

    public static final C32099E8x A01(C32099E8x c32099E8x) {
        String str = c32099E8x.A08;
        ImageUrl imageUrl = c32099E8x.A02;
        ImageUrl imageUrl2 = c32099E8x.A01;
        String str2 = c32099E8x.A07;
        String str3 = c32099E8x.A04;
        boolean z = c32099E8x.A0A;
        return new C32099E8x(imageUrl, imageUrl2, c32099E8x.A03, str, str2, str3, c32099E8x.A05, c32099E8x.A06, c32099E8x.A00, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0217, code lost:
    
        if (r3 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r32, X.EnumC33424Epv r33, X.InterfaceC23621Ds r34) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel.A02(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel, X.Epv, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r0 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r10, X.EnumC33424Epv r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 12
            boolean r0 = X.MAK.A01(r12, r3)
            if (r0 == 0) goto Lcf
            r8 = r12
            X.MAK r8 = (X.MAK) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcf
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r0 = r8.A03
            X.1JX r7 = X.C1JX.A02
            int r1 = r8.A00
            r9 = 1
            if (r1 == 0) goto L9e
            if (r1 != r9) goto Ldb
            java.lang.Object r11 = r8.A02
            X.Epv r11 = (X.EnumC33424Epv) r11
            java.lang.Object r10 = r8.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r10 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r10
            X.AbstractC09560e7.A00(r0)
        L2c:
            r7 = r0
            X.3NY r7 = (X.C3NY) r7
            boolean r0 = r7 instanceof X.C3NX
            if (r0 == 0) goto L74
            X.3NX r7 = (X.C3NX) r7
            java.lang.Object r0 = r7.A00
            X.EAi r0 = (X.C32135EAi) r0
            X.Gak r5 = r0.A00
            if (r5 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            r0 = r5
            X.E7b r0 = (X.E7b) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r0)
            r3 = 0
            java.util.Iterator r2 = r0.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r2.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L69
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L69:
            X.44Q r0 = (X.C44Q) r0
            X.2zP r0 = r10.A08(r0, r11, r3)
            r4.add(r0)
            r3 = r1
            goto L53
        L74:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 != 0) goto L91
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7d:
            X.05A r3 = r10.A0A
            X.E7b r5 = (X.E7b) r5
            java.lang.Long r2 = r5.A00
            java.lang.String r1 = r5.A01
            X.FIU r0 = new X.FIU
            r0.<init>(r1, r2)
            r3.Egh(r0)
            X.3NX r7 = X.AbstractC25225BEi.A0z(r4)
        L91:
            boolean r0 = r7 instanceof X.C3NX
            if (r0 != 0) goto Lcc
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 == 0) goto Ld6
            X.8jk r7 = X.AbstractC25227BEk.A0h()
            return r7
        L9e:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r6 = r10.A04
            r5 = 20
            int r4 = r11.A00
            X.05A r3 = r10.A0A
            java.lang.Object r1 = r3.getValue()
            X.FIU r1 = (X.FIU) r1
            r0 = 0
            if (r1 == 0) goto Lcd
            java.lang.String r2 = r1.A01
        Lb4:
            java.lang.Object r1 = r3.getValue()
            X.FIU r1 = (X.FIU) r1
            if (r1 == 0) goto Lbe
            java.lang.Long r0 = r1.A00
        Lbe:
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A03(r6, r0, r2, r5, r4)
            X.AbstractC31172DnG.A1V(r10, r11, r8, r9)
            r0 = -5
            java.lang.Object r0 = r1.A00(r0, r8)
            if (r0 != r7) goto L2c
        Lcc:
            return r7
        Lcd:
            r2 = r0
            goto Lb4
        Lcf:
            X.MAK r8 = new X.MAK
            r8.<init>(r10, r12, r3)
            goto L16
        Ld6:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ldb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel.A03(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel, X.Epv, X.1Ds):java.lang.Object");
    }

    public static final Object A04(ChannelDiscoveryViewModel channelDiscoveryViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        C05A c05a;
        if (channelDiscoveryViewModel instanceof AbstractC32730Eaw) {
            c05a = ((AbstractC32730Eaw) channelDiscoveryViewModel).A00;
        } else {
            c05a = ((C32728Eat) channelDiscoveryViewModel).A00;
        }
        EnumC33424Epv enumC33424Epv = (EnumC33424Epv) c05a.getValue();
        EnumC33329EoO enumC33329EoO = channelDiscoveryViewModel.A05;
        if (enumC33329EoO == EnumC33329EoO.A03 && c05a.getValue() == EnumC33424Epv.A06) {
            enumC33424Epv = EnumC33424Epv.A08;
        }
        if (c05a.getValue() == EnumC33424Epv.A06 && channelDiscoveryViewModel.A01 && enumC33329EoO == EnumC33329EoO.A02) {
            enumC33424Epv = EnumC33424Epv.A07;
        }
        if (C18U.A06(C06090Tz.A05, channelDiscoveryViewModel.A04, 36319377333820807L)) {
            return A02(channelDiscoveryViewModel, enumC33424Epv, interfaceC23621Ds);
        }
        return A03(channelDiscoveryViewModel, enumC33424Epv, interfaceC23621Ds);
    }

    public final InterfaceC66482zP A08(C44Q c44q, EnumC33424Epv enumC33424Epv, int i) {
        SimpleImageUrl simpleImageUrl;
        InterfaceC66482zP c32100E8y;
        InterfaceC66482zP c32100E8y2;
        if (this instanceof AbstractC32730Eaw) {
            AbstractC32730Eaw abstractC32730Eaw = (AbstractC32730Eaw) this;
            if (abstractC32730Eaw instanceof C32729Eau) {
                C32729Eau c32729Eau = (C32729Eau) abstractC32730Eaw;
                C14360o3.A0B(c44q, 0);
                int A05 = AbstractC25227BEk.A05(enumC33424Epv, 1);
                String title = c44q.getTitle();
                if (A05 == 2) {
                    String BAX = c44q.BAX();
                    if (BAX == null) {
                        BAX = "";
                    }
                    SimpleImageUrl A0t = AbstractC25225BEi.A0t(BAX);
                    String C7K = c44q.C7K();
                    String At6 = c44q.At6();
                    if (At6 == null) {
                        At6 = "";
                    }
                    boolean A1a = AbstractC31177DnL.A1a(c44q.CS4());
                    boolean A1a2 = AbstractC31177DnL.A1a(c44q.Buv());
                    c32100E8y2 = new C32099E8x(A0t, null, c44q.C7h(), title, C7K, At6, c44q.BJP(), c44q.ByH(), A00(c32729Eau.A00, i), A1a, A1a2);
                } else {
                    String subtitle = c44q.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    String BAX2 = c44q.BAX();
                    if (BAX2 == null) {
                        BAX2 = "";
                    }
                    String C7K2 = c44q.C7K();
                    String At62 = c44q.At6();
                    if (At62 == null) {
                        At62 = "";
                    }
                    c32100E8y2 = new C32100E8y(enumC33424Epv, c44q.C7h(), title, subtitle, BAX2, C7K2, At62, c44q.ByU(), AbstractC31177DnL.A03(c44q.BYF()), A00(c32729Eau.A01, i), AbstractC31177DnL.A1a(c44q.CS4()));
                }
                return c32100E8y2;
            }
            C14360o3.A0B(c44q, 0);
            int A052 = AbstractC25227BEk.A05(enumC33424Epv, 1);
            String title2 = c44q.getTitle();
            if (A052 == 2) {
                String BAX3 = c44q.BAX();
                if (BAX3 == null) {
                    BAX3 = "";
                }
                SimpleImageUrl A0t2 = AbstractC25225BEi.A0t(BAX3);
                String C7K3 = c44q.C7K();
                String At63 = c44q.At6();
                if (At63 == null) {
                    At63 = "";
                }
                boolean A1a3 = AbstractC31177DnL.A1a(c44q.CS4());
                boolean A1a4 = AbstractC31177DnL.A1a(c44q.Buv());
                c32100E8y = new C32099E8x(A0t2, null, c44q.C7h(), title2, C7K3, At63, c44q.BJP(), c44q.ByH(), A00(abstractC32730Eaw.A08, i), A1a3, A1a4);
            } else {
                String subtitle2 = c44q.getSubtitle();
                if (subtitle2 == null) {
                    subtitle2 = "";
                }
                String BAX4 = c44q.BAX();
                if (BAX4 == null) {
                    BAX4 = "";
                }
                String C7K4 = c44q.C7K();
                String At64 = c44q.At6();
                if (At64 == null) {
                    At64 = "";
                }
                c32100E8y = new C32100E8y(enumC33424Epv, c44q.C7h(), title2, subtitle2, BAX4, C7K4, At64, c44q.ByU(), AbstractC31177DnL.A03(c44q.BYF()), A00(abstractC32730Eaw.A08, i), AbstractC31177DnL.A1a(c44q.CS4()));
            }
            return c32100E8y;
        }
        boolean A1a5 = AbstractC167017dG.A1a(c44q, enumC33424Epv);
        String title3 = c44q.getTitle();
        String BAX5 = c44q.BAX();
        if (BAX5 == null) {
            BAX5 = "";
        }
        SimpleImageUrl A0t3 = AbstractC25225BEi.A0t(BAX5);
        Integer C7h = c44q.C7h();
        if (C7h != null && C4GR.A01(C7h.intValue()) == A1a5) {
            String BAW = c44q.BAW();
            if (BAW == null) {
                BAW = "";
            }
            simpleImageUrl = AbstractC25225BEi.A0t(BAW);
        } else {
            simpleImageUrl = null;
        }
        String C7K5 = c44q.C7K();
        String At65 = c44q.At6();
        if (At65 == null) {
            At65 = "";
        }
        boolean A1a6 = AbstractC31177DnL.A1a(c44q.CS4());
        boolean A1a7 = AbstractC31177DnL.A1a(c44q.Buv());
        return new C32099E8x(A0t3, simpleImageUrl, c44q.C7h(), title3, C7K5, At65, c44q.BJP(), c44q.ByH(), A00(this.A08, i), A1a6, A1a7);
    }

    public final C05A A09() {
        if (this instanceof ChannelDirectoryInboxViewModel) {
            C05A c05a = ((ChannelDirectoryInboxViewModel) this).A07;
            C14360o3.A0C(c05a, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.collections.List<com.instagram.common.recyclerview.model.RecyclerViewModel<*, *>>>");
            return c05a;
        }
        if (this instanceof C32729Eau) {
            return ((C32729Eau) this).A00;
        }
        return this.A08;
    }

    public final C0UO A0A() {
        if (this instanceof ChannelDirectoryInboxViewModel) {
            return ((ChannelDirectoryInboxViewModel) this).A08;
        }
        if (this instanceof C32729Eau) {
            return ((C32729Eau) this).A02;
        }
        return ((C32728Eat) this).A01;
    }

    public final void A0B() {
        C05A c05a = this.A07;
        Object value = c05a.getValue();
        EnumC33356Eop enumC33356Eop = EnumC33356Eop.A04;
        if (value != enumC33356Eop && A0D()) {
            c05a.Egh(enumC33356Eop);
            AnonymousClass195 anonymousClass195 = this.A03;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A03 = AbstractC23641Du.A04(AbstractC25231BEo.A0e(C12L.A00), new GSR(this, null, 2), AbstractC141776au.A00(this));
        }
    }

    public final void A0C(String str) {
        if (this.A09) {
            C05A A09 = A09();
            Iterable<Object> A0w = AbstractC31172DnG.A0w(A09);
            ArrayList A0q = AbstractC167017dG.A0q(A0w);
            for (Object obj : A0w) {
                if (obj instanceof C32099E8x) {
                    C32099E8x c32099E8x = (C32099E8x) obj;
                    if (C14360o3.A0K(c32099E8x.A07, str)) {
                        obj = A01(c32099E8x);
                    }
                }
                A0q.add(obj);
            }
            A09.Egh(A0q);
        }
    }

    public final boolean A0D() {
        FIU fiu = (FIU) this.A0A.getValue();
        if (fiu != null) {
            if (fiu.A01 != null) {
                Long l = fiu.A00;
                if (l != null && l.longValue() == -1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public void A0E() {
        this.A07.Egh(EnumC33356Eop.A02);
        this.A08.Egh(C16930sl.A00);
        this.A0A.Egh(null);
        AnonymousClass195 anonymousClass195 = this.A03;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A03 = AbstractC25226BEj.A1L(new GSS(this, null, 14), AbstractC141776au.A00(this));
    }

    public static int A00(C05A c05a, int i) {
        return ((List) c05a.getValue()).size() + i;
    }

    public void A0F(String str) {
        C05A A09 = A09();
        Iterable A0w = AbstractC31172DnG.A0w(A09);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0w) {
            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) obj;
            if (!(interfaceC66482zP instanceof C32099E8x) || !C14360o3.A0K(((C32099E8x) interfaceC66482zP).A07, str)) {
                A1E.add(obj);
            }
        }
        A09.Egh(A1E);
    }
}
