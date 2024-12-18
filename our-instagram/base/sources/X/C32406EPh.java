package X;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32406EPh extends C7E1 {
    public Context A00;
    public C84613qA A01;
    public InterfaceC02900Bo A02;
    public java.util.Set A03;
    public final EQT A04;
    public final ERE A05;
    public final List A06;
    public final List A07;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2xz, java.lang.Object, X.EQT] */
    public C32406EPh(Context context, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, C32280EJr c32280EJr) {
        InterfaceC02900Bo A00 = C0BQ.A00(c07270a1);
        C84613qA A002 = C84613qA.A00(c07270a1);
        ERE ere = new ERE(interfaceC11380iw, c32280EJr);
        ?? obj = new Object();
        this.A07 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1H();
        this.A00 = context;
        this.A02 = A00;
        this.A01 = A002;
        this.A05 = ere;
        this.A04 = obj;
        A0A(AbstractC166987dD.A1F(Arrays.asList(ere, obj)));
    }

    public static void A00(C32406EPh c32406EPh) {
        EnumC33339EoY enumC33339EoY;
        c32406EPh.A06();
        for (Object obj : c32406EPh.A07) {
            if (c32406EPh.A03.contains(obj)) {
                enumC33339EoY = EnumC33339EoY.A04;
            } else {
                enumC33339EoY = EnumC33339EoY.A03;
            }
            c32406EPh.A09(c32406EPh.A05, obj, enumC33339EoY);
        }
        List list = c32406EPh.A06;
        if (!list.isEmpty()) {
            c32406EPh.A08(c32406EPh.A04, c32406EPh.A00.getString(2131967903));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c32406EPh.A09(c32406EPh.A05, it.next(), EnumC33339EoY.A02);
        }
        c32406EPh.A07();
    }
}
