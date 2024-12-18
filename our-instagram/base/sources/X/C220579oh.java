package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.9oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220579oh extends C1I2 implements InterfaceC60682pr {
    public final Context A00;
    public final ViewGroup A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C3FQ A04;
    public final C3A9 A05;

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        return this.A04;
    }

    public C220579oh(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, final InterfaceC152956uP interfaceC152956uP, C3FQ c3fq) {
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = viewGroup;
        this.A02 = interfaceC11380iw;
        this.A04 = c3fq;
        this.A05 = new C3A9(interfaceC152956uP, this, new C3CI(this, interfaceC152956uP) { // from class: X.9o5
            public final C220579oh A00;
            public final java.util.Set A01 = AbstractC166987dD.A1H();
            public final InterfaceC152956uP A02;

            @Override // X.C36Z
            public final Class CAO() {
                return C153126ug.class;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00ca A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[SYNTHETIC] */
            @Override // X.C3CI, X.C36Z
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void CtJ(java.lang.Object r17, int r18) {
                /*
                    Method dump skipped, instructions count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C220199o5.CtJ(java.lang.Object, int):void");
            }

            @Override // X.C36Z
            public final void FDm(C3AB c3ab, int i) {
                InterfaceC152956uP interfaceC152956uP2 = this.A02;
                Object item = interfaceC152956uP2.getItem(i);
                item.getClass();
                c3ab.FDo(AbstractC166997dE.A0u(item), item, interfaceC152956uP2.BQs(AbstractC166997dE.A0u(item)).A00);
            }

            {
                this.A02 = interfaceC152956uP;
                this.A00 = this;
            }
        });
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-671901714);
        this.A05.A01();
        C0f9.A0A(-666209798, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(2083369194, C0f9.A03(-1239860671));
    }
}
