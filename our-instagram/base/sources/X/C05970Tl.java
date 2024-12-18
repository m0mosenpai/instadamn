package X;

import java.util.ListIterator;

/* renamed from: X.0Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05970Tl extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C00M A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05970Tl(C00M c00m) {
        super(1);
        this.A00 = c00m;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        AnonymousClass002 anonymousClass002 = (AnonymousClass002) obj;
        C14360o3.A0B(anonymousClass002, 0);
        C00M c00m = this.A00;
        C01U c01u = c00m.A05;
        ListIterator<E> listIterator = c01u.listIterator(c01u.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                if (((C00H) obj2).A01) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C00H c00h = (C00H) obj2;
        if (c00m.A00 != null) {
            C00M.A00(c00m);
        }
        c00m.A00 = c00h;
        if (c00h != null) {
            c00h.A03(anonymousClass002);
        }
        return C0eB.A00;
    }
}
