package X;

import java.util.Iterator;

/* renamed from: X.8Nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186238Nr extends AbstractC52922bZ {
    public final C8OJ A00;
    public final C1810281e A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;
    public final InterfaceC15070pN A04;
    public final C0UO A05;

    public C186238Nr(C8OJ c8oj, C1810281e c1810281e) {
        C14360o3.A0B(c1810281e, 1);
        C14360o3.A0B(c8oj, 2);
        this.A01 = c1810281e;
        this.A00 = c8oj;
        C008002u A00 = C10E.A00(C8OL.A00);
        this.A03 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        AnonymousClass057 A002 = C10M.A00(C05F.A00, 0, 0);
        this.A02 = A002;
        this.A04 = new C06160Ug(null, A002);
    }

    public static final void A01(C186238Nr c186238Nr, int i) {
        C8OJ c8oj = c186238Nr.A00;
        c8oj.A00 = i;
        C37669Gi2 A02 = c186238Nr.A02(i);
        if (A02 != null) {
            C8OK c8ok = (C8OK) A02.A01;
            C14360o3.A0B(c8ok, 0);
            c8oj.A01 = c8ok;
        }
        C05A c05a = c186238Nr.A03;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C218369l8(i)));
    }

    public final C37669Gi2 A02(int i) {
        Object obj;
        Iterator it = this.A00.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C37669Gi2) obj).A00 == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C37669Gi2) obj;
    }

    public static final void A00(AbstractC223759uK abstractC223759uK, C186238Nr c186238Nr) {
        AbstractC23641Du.A05(C12L.A00.A04, new C25023B5e(abstractC223759uK, c186238Nr, null, 18), AbstractC141776au.A00(c186238Nr));
    }
}
