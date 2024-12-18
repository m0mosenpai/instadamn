package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.N8n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52198N8n extends C2US {
    public int A00;
    public boolean A01;
    public final C31699Dw4 A02;
    public final C34707FQs A03;
    public final Context A04;
    public final FBC A05;
    public final C32427EQc A06;
    public final C65960TxC A07;
    public final XB6 A08;
    public final XB8 A09;
    public final C54619OAu A0A;
    public final C31545DtV A0B;
    public final ERQ A0C;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FQs] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.FBC] */
    public C52198N8n(Context context, C65960TxC c65960TxC, XB6 xb6, XB8 xb8, C54619OAu c54619OAu, GYT gyt) {
        AbstractC167017dG.A1P(context, c65960TxC);
        AbstractC167017dG.A1T(xb6, xb8);
        this.A04 = context;
        this.A07 = c65960TxC;
        this.A0A = c54619OAu;
        this.A08 = xb6;
        this.A09 = xb8;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A0B = c31545DtV;
        C32427EQc c32427EQc = new C32427EQc(context);
        this.A06 = c32427EQc;
        ERQ erq = new ERQ(context, gyt);
        this.A0C = erq;
        this.A02 = new C31699Dw4();
        this.A03 = new Object();
        this.A05 = new Object();
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(c54619OAu.A00, c54619OAu.A02, c54619OAu.A01));
        AbstractC37301Gc2.A1S(c31545DtV, c32427EQc, erq, A1F);
        init(A1F);
    }

    public final void A00() {
        A02();
        updateListView();
    }

    public final void A01() {
        A02();
        notifyDataSetChanged();
    }

    public final void A02() {
        InterfaceC65642y0 interfaceC65642y0;
        clear();
        C65956Tx8 c65956Tx8 = this.A07.A01;
        List list = c65956Tx8.A00;
        if (list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Object obj2 = c65956Tx8.A01.get(i);
                C54619OAu c54619OAu = this.A0A;
                C14360o3.A0B(obj, 0);
                if (C51760Mtj.A04(obj, 48)) {
                    interfaceC65642y0 = c54619OAu.A02;
                } else if (obj instanceof C65741TtG) {
                    interfaceC65642y0 = c54619OAu.A00;
                } else if (C51760Mtj.A04(obj, 47)) {
                    interfaceC65642y0 = c54619OAu.A01;
                } else {
                    throw AbstractC167007dF.A0c("No BinderGroup associate with ", obj.getClass().getCanonicalName());
                }
                C14360o3.A0C(interfaceC65642y0, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<out kotlin.Any, kotlin.Any>");
                addModel(obj, obj2, interfaceC65642y0);
            }
        } else if (this.A00 == 0 && !this.A01 && !this.A08.CZT()) {
            addModel(AbstractC167007dF.A0f(this.A04, this.A09.E6U(), 2131968595), this.A0B);
            return;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2; i3++) {
            addModel(this.A05, this.A06);
        }
        if (!this.A01) {
            return;
        }
        addModel(this.A02, this.A03, this.A0C);
    }
}
