package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.zero.headers.IGZeroHeadersPing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class PYo extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05 = 0;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYo(IGZeroHeadersPing iGZeroHeadersPing, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, OM1 om1, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = c15370ps;
        this.A07 = om1;
        this.A08 = iGZeroHeadersPing;
        this.A09 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A05 != 0) {
            return new PYo((IGZeroHeadersPing) this.A08, interfaceC23621Ds, (C15370ps) this.A06, (OM1) this.A07, this.A09);
        }
        C55069OaP c55069OaP = (C55069OaP) this.A08;
        return new PYo((C51653Mrk) this.A07, c55069OaP, (OMg) this.A01, interfaceC23621Ds, (InterfaceC24901Jp) this.A06, this.A04, this.A09);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C55598Omc c55598Omc;
        AtomicBoolean A17;
        Integer num;
        if (this.A05 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C15370ps c15370ps = (C15370ps) this.A06;
                OM1 om1 = (OM1) this.A07;
                IGZeroHeadersPing iGZeroHeadersPing = (IGZeroHeadersPing) this.A08;
                boolean z = this.A09;
                this.A01 = c15370ps;
                this.A02 = om1;
                this.A03 = iGZeroHeadersPing;
                this.A04 = z;
                this.A00 = 1;
                C89563yw A0r = JQ0.A0r(this);
                String str = om1.A03;
                String A10 = AbstractC166997dE.A10(Locale.ROOT, om1.A02);
                if (!A10.equals("GET") && A10.equals("POST")) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0N;
                }
                Map map = om1.A04;
                String str2 = om1.A01;
                C55813OqO c55813OqO = new C55813OqO(iGZeroHeadersPing, A0r, z);
                C14360o3.A0B(num, 1);
                ArrayList A0k = MSY.A0k(map);
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    A0k.add(new C23781El(AbstractC31172DnG.A17(A1K), (String) A1K.getValue()));
                }
                C26371Ps c26371Ps = new C26371Ps((C1JP) null);
                c26371Ps.A01 = num;
                List list = c26371Ps.A06;
                list.clear();
                list.addAll(A0k);
                c26371Ps.A00 = new TFO(str2);
                c26371Ps.A02 = str;
                c26371Ps.A05 = false;
                C1QW A00 = c26371Ps.A00();
                C1QX A0J = MSY.A0J();
                A0J.A03 = C1Ef.OffScreen;
                A0J.A07 = C05F.A01;
                A0J.A0A = "HEADERS_PING";
                InterfaceC27191Tt A02 = C1C6.A00().A02(new C55932OsO(c55813OqO), A00, A0J.A00());
                C14360o3.A07(A02);
                c15370ps.A00 = A02;
                obj = A0r.A00();
                if (obj == c1jx) {
                    return c1jx;
                }
            }
            return obj;
        }
        C1JX c1jx2 = C1JX.A02;
        String str3 = "cdlProviderHolder";
        if (this.A00 != 0) {
            A17 = (AtomicBoolean) this.A03;
            c55598Omc = (C55598Omc) this.A02;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C55069OaP c55069OaP = (C55069OaP) this.A08;
            O1H o1h = c55069OaP.A00;
            if (o1h == null) {
                str3 = "avatarEmbodimentSupport";
            } else {
                QuickPerformanceLogger quickPerformanceLogger = c55069OaP.A07;
                if (quickPerformanceLogger == null) {
                    str3 = "quickPerformanceLogger";
                } else {
                    c55598Omc = C55598Omc.A09;
                    if (c55598Omc == null) {
                        c55598Omc = new C55598Omc(o1h, quickPerformanceLogger);
                        C55598Omc.A09 = c55598Omc;
                    }
                    A17 = AbstractC166997dE.A17();
                    C51653Mrk c51653Mrk = (C51653Mrk) this.A07;
                    if (!c51653Mrk.A0G) {
                        OMg oMg = (OMg) this.A01;
                        if (oMg != null) {
                            oMg.A02("INIT_CDL_HOLDER");
                        }
                        CommonCdlProviderHolder commonCdlProviderHolder = c55069OaP.A02;
                        if (commonCdlProviderHolder != null) {
                            boolean z2 = this.A04;
                            this.A02 = c55598Omc;
                            this.A03 = A17;
                            this.A00 = 1;
                            if (commonCdlProviderHolder.A00(c51653Mrk, oMg, this, z2) == c1jx2) {
                                return c1jx2;
                            }
                        }
                    } else {
                        InterfaceC58098PpN interfaceC58098PpN = c55069OaP.A01;
                        if (interfaceC58098PpN == null) {
                            str3 = "aleProviderHolder";
                        } else {
                            WeakReference weakReference = c55598Omc.A01;
                            if (weakReference == null || weakReference.get() == null) {
                                interfaceC58098PpN.ED4(c55598Omc);
                                interfaceC58098PpN.CNy(c51653Mrk);
                            }
                            C55069OaP.A00(c55598Omc, (OMg) this.A01, A17, (InterfaceC24901Jp) this.A06);
                            return C0eB.A00;
                        }
                    }
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        OMg oMg2 = (OMg) this.A01;
        if (oMg2 != null) {
            oMg2.A01("INIT_CDL_HOLDER");
        }
        C55069OaP c55069OaP2 = (C55069OaP) this.A08;
        IgCdlProviderBuilder igCdlProviderBuilder = c55069OaP2.A04;
        if (igCdlProviderBuilder == null) {
            str3 = "cdlProviderBuilder";
        } else {
            igCdlProviderBuilder.A02(this.A09);
            CommonCdlProviderHolder commonCdlProviderHolder2 = c55069OaP2.A02;
            if (commonCdlProviderHolder2 != null) {
                InterfaceC58017Po2 interfaceC58017Po2 = commonCdlProviderHolder2.cdlProviderInstance;
                if (interfaceC58017Po2 != null) {
                    c55598Omc.A02 = AbstractC25225BEi.A16(interfaceC58017Po2);
                    if (((CdlProviderImpl) interfaceC58017Po2).A00 != null) {
                        if (oMg2 != null) {
                            oMg2.A00("CDL_BRIDGE_ALREADY_INITIALIZED");
                        }
                        C55069OaP.A00(c55598Omc, oMg2, A17, (InterfaceC24901Jp) this.A06);
                    } else {
                        C57100PUn c57100PUn = new C57100PUn(c55598Omc, c55069OaP2, oMg2, A17, (InterfaceC24901Jp) this.A06);
                        CommonCdlProviderHolder commonCdlProviderHolder3 = c55069OaP2.A02;
                        if (commonCdlProviderHolder3 != null) {
                            commonCdlProviderHolder3.A04.add(c57100PUn);
                        }
                    }
                    return C0eB.A00;
                }
                throw new RuntimeException("initCdlHolder not called");
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYo) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYo(C51653Mrk c51653Mrk, C55069OaP c55069OaP, OMg oMg, InterfaceC23621Ds interfaceC23621Ds, InterfaceC24901Jp interfaceC24901Jp, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A08 = c55069OaP;
        this.A07 = c51653Mrk;
        this.A01 = oMg;
        this.A04 = z;
        this.A09 = z2;
        this.A06 = interfaceC24901Jp;
    }
}
