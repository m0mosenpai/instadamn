package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.1Ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25621Ms extends AbstractC23721Ec {
    public C1OL A00;
    public InterfaceC25601Mq A01;
    public InterfaceC25601Mq A02;
    public String A03;
    public final C24471Hq A04;
    public final AbstractC12990ll A05;
    public final int A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25621Ms(AbstractC12990ll abstractC12990ll) {
        this(abstractC12990ll, -2);
        C14360o3.A0B(abstractC12990ll, 1);
    }

    public final void A0Q(InterfaceC25601Mq interfaceC25601Mq) {
        C14360o3.A0B(interfaceC25601Mq, 0);
        this.A02 = interfaceC25601Mq;
    }

    public final void A0R(Class cls, Class cls2) {
        A0P(null, cls, cls2, false);
    }

    public final void A0S(Class cls, Class cls2) {
        A0P(null, cls, cls2, false);
    }

    public static final C25591Mp A00(C222015v c222015v, C25621Ms c25621Ms, Class cls, Class cls2, boolean z) {
        if (c222015v == null) {
            AbstractC12990ll abstractC12990ll = c25621Ms.A05;
            if (abstractC12990ll instanceof UserSession) {
                c222015v = new C07510aQ((UserSession) abstractC12990ll);
            } else {
                C52073N1y c52073N1y = C52073N1y.A00;
                c222015v = AbstractC221915u.A00;
                C14360o3.A08(c222015v);
            }
        }
        if (InterfaceC55612h1.class.isAssignableFrom(cls)) {
            return new C25581Mo(c222015v, cls2);
        }
        return new C25591Mp(c222015v, C1EY.A01, cls2, z);
    }

    public final C1ON A0N() {
        String str = this.A0E;
        if (str != null) {
            C1OK c1ok = null;
            final C1OL c1ol = this.A00;
            if (c1ol == null) {
                c1ok = new C1OK();
                c1ol = c1ok.A00;
            }
            int i = this.A06;
            final InterfaceC25601Mq interfaceC25601Mq = this.A02;
            if (interfaceC25601Mq != null) {
                final InterfaceC25601Mq interfaceC25601Mq2 = this.A01;
                C24491Hs c24491Hs = AbstractC24481Hr.A06;
                if (i == -2) {
                    i = 431;
                }
                C24511Hu A00 = c24491Hs.A00(new Callable() { // from class: X.1OM
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        InterfaceC25601Mq interfaceC25601Mq3;
                        Object c3nx;
                        Object obj;
                        C25621Ms c25621Ms = C25621Ms.this;
                        C26461Qb A0O = c25621Ms.A0O();
                        C3JY c3jy = (C3JY) new C26561Ql(c1ol).then(A0O);
                        c25621Ms.A04.A01(c3jy, A0O.A02);
                        C24471Hq.A00(c3jy);
                        if (c3jy.A02 >= 400) {
                            InterfaceC25601Mq interfaceC25601Mq4 = interfaceC25601Mq2;
                            if (interfaceC25601Mq4 == null) {
                                interfaceC25601Mq4 = interfaceC25601Mq;
                            }
                            c3nx = new C194848jk(interfaceC25601Mq4.then(c3jy));
                        } else {
                            String str2 = c25621Ms.A03;
                            if (str2 != null) {
                                InterfaceC25601Mq interfaceC25601Mq5 = interfaceC25601Mq;
                                C006802i c006802i = C006802i.A0p;
                                C14360o3.A07(c006802i);
                                interfaceC25601Mq3 = new C48531LdU(c006802i, interfaceC25601Mq5, str2);
                            } else {
                                interfaceC25601Mq3 = interfaceC25601Mq;
                            }
                            c3nx = new C3NX(interfaceC25601Mq3.then(c3jy));
                        }
                        AbstractC12990ll abstractC12990ll = c25621Ms.A05;
                        if (c3nx instanceof C3NX) {
                            obj = ((C3NX) c3nx).A00;
                        } else if (c3nx instanceof C194848jk) {
                            obj = (InterfaceC40821up) ((C194848jk) c3nx).A00;
                        } else {
                            throw new RuntimeException();
                        }
                        AbstractC72533Na.A00((InterfaceC40821up) obj, abstractC12990ll, c25621Ms.A0E);
                        return c3nx;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("HttpEngine");
                        sb.append(C25621Ms.this);
                        return sb.toString();
                    }
                }, i, 2, C20150ym.A07(AbstractC20100yh.A00(36310778803650850L)), true);
                if (c1ok == null) {
                    return new C1ON(null, A00, "IgApi", str);
                }
                return new C1ON(c1ok, A00, "IgApi", str);
            }
            throw new IllegalStateException("Parser class is not specified for API request");
        }
        throw new IllegalStateException("path must be set on a request");
    }

    public final C26461Qb A0O() {
        if (this.A0E != null) {
            C1QZ A02 = A02();
            return new C26461Qb(A02.A00, A02.A01);
        }
        throw new IllegalStateException("Path cannot be null");
    }

    @Override // X.AbstractC23721Ec
    public final String toString() {
        return AnonymousClass001.A0R("IgApi ", this.A0E);
    }

    public final void A0P(C222015v c222015v, Class cls, Class cls2, boolean z) {
        this.A02 = A00(c222015v, this, cls, cls2, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25621Ms(AbstractC12990ll abstractC12990ll, int i) {
        super(abstractC12990ll);
        C14360o3.A0B(abstractC12990ll, 1);
        this.A05 = abstractC12990ll;
        this.A06 = i;
        this.A04 = new C24471Hq(abstractC12990ll);
    }
}
