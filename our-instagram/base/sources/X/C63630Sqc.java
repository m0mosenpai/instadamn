package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.Sqc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63630Sqc implements InterfaceC52932ba {
    public QuickPerformanceLogger A00;
    public C2GC A01;
    public SGD A02;
    public C62580SHf A03;
    public SE5 A04;
    public SE6 A05;
    public SE7 A06;
    public SMF A07;
    public SMF A08;
    public SE9 A09;
    public SMH A0A;
    public SW8 A0B;
    public final UserSession A0C;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        if (cls == REG.class) {
            return new REG(this.A01, this.A05, this.A0C);
        }
        if (cls != Q8L.class && cls != Q8N.class && cls != Q8O.class && cls != Q8P.class) {
            if (cls == REI.class) {
                return new REI(this.A01, this.A07, this.A0A, "FBPAY_HUB", new EnumC61116RfW[]{EnumC61116RfW.CREDIT_CARD, EnumC61116RfW.PAYPAL, EnumC61116RfW.DIRECT_DEBIT, EnumC61116RfW.SHOP_PAY}, false, false, true);
            }
            if (cls == RE7.class) {
                return new REI(this.A01, this.A07, null, "IAB_AUTOFILL", new EnumC61116RfW[]{EnumC61116RfW.CREDIT_CARD}, true, true, false);
            }
            if (cls == REC.class) {
                return new REC();
            }
            if (cls != REB.class) {
                if (cls == REL.class) {
                    return new REL(this.A01, this.A03);
                }
                if (cls == RED.class) {
                    return new RED(this.A01, this.A06);
                }
                if (cls == Q8b.class) {
                    return new Q8b(this.A01, this.A04);
                }
                if (cls == REE.class) {
                    return new REE(this.A01, this.A03);
                }
                if (cls == REH.class) {
                    return new REH(this.A01, this.A07);
                }
                if (cls == Q8W.class) {
                    return new Q8W(this.A00, this.A01);
                }
                if (cls == Q8a.class) {
                    return new Q8a(this.A01);
                }
                if (cls == REK.class) {
                    SE9 se9 = this.A09;
                    return new REK(this.A00, this.A01, se9);
                }
                if (cls == REF.class) {
                    return new REF(this.A01, this.A02);
                }
                if (cls == REM.class) {
                    return new REM(this.A01, this.A08, this.A0A);
                }
                if (cls != Q8M.class) {
                    if (cls == REJ.class) {
                        return new REJ(this.A01, this.A0A);
                    }
                    if (cls == Q8U.class) {
                        return new Q8U(this.A0B);
                    }
                    if (cls == Q8R.class) {
                        return new Q8R();
                    }
                    throw AbstractC31175DnJ.A0V(cls.getName(), " cannot be created");
                }
            }
        }
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }

    public C63630Sqc(QuickPerformanceLogger quickPerformanceLogger, C2GC c2gc, SGD sgd, C62580SHf c62580SHf, SE5 se5, SE6 se6, SE7 se7, SMF smf, SE9 se9, SMH smh, UserSession userSession, SW8 sw8) {
        this.A01 = c2gc;
        this.A00 = quickPerformanceLogger;
        this.A07 = smf;
        this.A03 = c62580SHf;
        this.A06 = se7;
        this.A04 = se5;
        this.A09 = se9;
        this.A05 = se6;
        this.A02 = sgd;
        this.A0A = smh;
        this.A08 = smf;
        this.A0B = sw8;
        this.A0C = userSession;
    }
}
