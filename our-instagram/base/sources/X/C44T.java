package X;

import java.io.Closeable;

/* renamed from: X.44T, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44T extends C44U {
    public C222015v A03() {
        return ((C44S) this).A09;
    }

    public AbstractC911344p A04(C16L c16l) {
        C44S c44s = (C44S) this;
        C44S.A01("p", c16l);
        C912845h c912845h = c44s.A00;
        if (c16l.A10() == null && c16l.A1J() == null) {
            return null;
        }
        AbstractC911344p abstractC911344p = (AbstractC911344p) c44s.A0A(c16l, c912845h, c44s.A05.A09(AbstractC911344p.class));
        if (abstractC911344p != null) {
            return abstractC911344p;
        }
        return C60603RBu.A00;
    }

    public Object A05(C16L c16l, TIZ tiz) {
        C44S c44s = (C44S) this;
        C44S.A01("p", c16l);
        return c44s.A0A(c16l, c44s.A00, c44s.A05.A07(null, C910844k.A09, tiz.A00));
    }

    public void A06(AnonymousClass182 anonymousClass182, Object obj) {
        C44S c44s = (C44S) this;
        C44S.A01("g", anonymousClass182);
        C45R c45r = c44s.A01;
        if (c45r.A0C(EnumC912645f.INDENT_OUTPUT) && anonymousClass182.A00 == null) {
            AnonymousClass162 anonymousClass162 = c45r.A05;
            if (anonymousClass162 instanceof AnonymousClass163) {
                anonymousClass162 = ((AnonymousClass163) anonymousClass162).AMQ();
            }
            anonymousClass182.A00 = anonymousClass162;
        }
        if (c45r.A0C(EnumC912645f.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                c44s.A09(c45r).A0X(anonymousClass182, obj);
                if (c45r.A0C(EnumC912645f.FLUSH_AFTER_WRITE_VALUE)) {
                    anonymousClass182.flush();
                }
                closeable.close();
                return;
            } catch (Exception e) {
                C914045z.A0B(null, closeable, e);
                throw C00O.createAndThrow();
            }
        }
        c44s.A09(c45r).A0X(anonymousClass182, obj);
        if (c45r.A0C(EnumC912645f.FLUSH_AFTER_WRITE_VALUE)) {
            anonymousClass182.flush();
        }
    }
}
