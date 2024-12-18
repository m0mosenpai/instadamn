package X;

import android.app.Activity;

/* renamed from: X.GsH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38272GsH extends AbstractC18730w0 {
    public static final C38272GsH A00;
    public static final IEN A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.GsH, java.lang.Object, X.0lX] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = new IEN();
        AbstractC12860lY.A07(obj);
    }

    public static final void A00(C38688GzT c38688GzT) {
        IEN ien = A01;
        Object obj = ien.A01.get(c38688GzT.A02);
        if (obj != null) {
            ((java.util.Set) obj).add(c38688GzT);
            Object obj2 = ien.A00.get(AbstractC166987dD.A1L(c38688GzT.A01, c38688GzT.A03));
            if (obj2 != null) {
                ((java.util.Set) obj2).add(c38688GzT);
                return;
            }
            throw AbstractC166987dD.A12("Required value was null.");
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }

    public static final void A01(Hd0 hd0) {
        for (C6K c6k : AbstractC31171DnF.A0n(AbstractC38273GsI.A01)) {
            IEN ien = A01;
            C14360o3.A0B(c6k, 1);
            Object obj = ien.A00.get(new C09530e4(hd0, c6k));
            if (obj != null) {
                AbstractC18560vj.A03(AnonymousClass194.A03(AbstractC38273GsI.A00(c6k), (C19L) AbstractC38273GsI.A00.getValue()), AbstractC011604e.A01(AbstractC38273GsI.A00(c6k), new C50540MSt(new C11950ju(obj, 1), 16)));
            } else {
                throw AbstractC25227BEk.A0n();
            }
        }
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        A01(Hd0.A02);
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        A01(Hd0.A03);
    }
}
