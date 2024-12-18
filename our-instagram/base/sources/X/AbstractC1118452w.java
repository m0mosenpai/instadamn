package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.52w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1118452w {
    public static final void A00(UserSession userSession, final InterfaceC1118352v interfaceC1118352v) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A03();
        c25621Ms.A0B("bfad3e85bc_cheap/");
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.52x
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-1003484271);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                InterfaceC1118352v.this.DFf();
                C0f9.A0A(329095404, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-370569210);
                int A032 = C0f9.A03(-356710053);
                C14360o3.A0B(obj, 0);
                super.onSuccess(obj);
                InterfaceC1118352v.this.onSuccess();
                C0f9.A0A(-2011770407, A032);
                C0f9.A0A(1766515788, A03);
            }
        };
        C1GJ.A03(A0N);
    }
}
