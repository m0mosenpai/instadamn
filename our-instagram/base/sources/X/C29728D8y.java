package X;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import com.facebook.dsp.core.OpacityData;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.D8y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29728D8y extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29728D8y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A07 = obj3;
        this.A01 = i;
        this.A06 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Map A0E;
        if (this.A00 != 0) {
            TimeInterpolator timeInterpolator = BXA.A09;
            boolean CSM = ((InterfaceC30923Dia) this.A05).CSM();
            EnumC25700BXk enumC25700BXk = (EnumC25700BXk) this.A03;
            C26449BmW c26449BmW = (C26449BmW) this.A07;
            int i = c26449BmW.A00;
            int i2 = this.A01;
            float A07 = AbstractC25228BEl.A07((C76223bS) this.A06, c26449BmW.A01);
            C09530e4 c09530e4 = (C09530e4) this.A04;
            EnumC191908em enumC191908em = (EnumC191908em) this.A02;
            EnumC27390C6t enumC27390C6t = (EnumC27390C6t) c09530e4.A00;
            boolean A1a = AbstractC167017dG.A1a(enumC191908em, enumC27390C6t);
            OpacityData E2H = XPC.A00(enumC191908em).E2H(enumC27390C6t);
            EnumC27390C6t enumC27390C6t2 = (EnumC27390C6t) c09530e4.A01;
            C14360o3.A0B(enumC27390C6t2, A1a ? 1 : 0);
            C27881CQs A00 = C27881CQs.A00(E2H.A00, XPC.A00(enumC191908em).E2H(enumC27390C6t2).A00);
            C14360o3.A0B(enumC27390C6t, A1a ? 1 : 0);
            return new BXA(A00, C27881CQs.A00(XPC.A00(enumC191908em).E2H(enumC27390C6t).A01, XPC.A00(enumC191908em).E2H(enumC27390C6t2).A01), enumC25700BXk, A07, i, i2, CSM);
        }
        C15370ps c15370ps = (C15370ps) this.A05;
        ContentResolver contentResolver = ((Context) this.A02).getContentResolver();
        C14360o3.A07(contentResolver);
        C15100pQ c15100pQ = (C15100pQ) this.A07;
        ArrayList A01 = C8a1.A01(contentResolver, (EnumC188968Ym) this.A06, (List) this.A04, 50, c15100pQ.A00, this.A01, 0, -1L, -1L, false, false);
        c15370ps.A00 = A01;
        C188998Yp c188998Yp = (C188998Yp) this.A03;
        ArrayList A0i = AbstractC167007dF.A0i(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0i.add(String.valueOf(((Medium) it.next()).A05));
        }
        C189268a2 c189268a2 = new C189268a2(c188998Yp.A00);
        try {
            try {
                InterfaceC37481ol CHx = c189268a2.A00.CHx();
                C14360o3.A0B(CHx, 1);
                List A002 = A10.A00(CHx, A0i);
                int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A002, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                A0E = AbstractC25225BEi.A18(A0L);
                for (Object obj : A002) {
                    String str = ((C189328a9) obj).A0L;
                    if (str != null) {
                        A0E.put(str, obj);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            } catch (Exception e) {
                C0K8.A0F(AbstractC111324zv.A00(1637), "getMetadataMap failed", e);
                A0E = AbstractC06930Yk.A0E();
            }
            c189268a2.A00.close();
            Iterator it2 = ((Iterable) c15370ps.A00).iterator();
            while (it2.hasNext()) {
                C188998Yp.A00((Medium) it2.next(), A0E);
            }
            c15100pQ.A00 += ((List) c15370ps.A00).size();
            ((List) c15370ps.A00).size();
            return C0eB.A00;
        } catch (Throwable th) {
            c189268a2.A00.close();
            throw th;
        }
    }
}
