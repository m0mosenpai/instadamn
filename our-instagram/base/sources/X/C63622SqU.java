package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SqU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63622SqU implements InterfaceC58362lv {
    public final /* synthetic */ SMG A00;
    public final /* synthetic */ SJB A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ C15370ps A05;

    public C63622SqU(SMG smg, SJB sjb, Map map, Map map2, Map map3, C15370ps c15370ps) {
        this.A01 = sjb;
        this.A03 = map;
        this.A05 = c15370ps;
        this.A00 = smg;
        this.A04 = map2;
        this.A02 = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ?? r6;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        List list = (List) c63406Sjd.A01;
        if (list != null) {
            r6 = AbstractC166987dD.A1E();
            for (Object obj2 : list) {
                C63406Sjd A0S = AbstractC58318PtA.A0S(((SF7) obj2).A00);
                if (A0S != null && A0S.A01 != null) {
                    r6.add(obj2);
                }
            }
        } else {
            r6 = C16930sl.A00;
        }
        List A0a = AbstractC001800i.A0a(this.A03.keySet());
        ArrayList A0q = AbstractC167017dG.A0q(r6);
        Iterator it = r6.iterator();
        while (it.hasNext()) {
            A0q.add(((SF7) it.next()).A01);
        }
        java.util.Set A02 = AnonymousClass090.A02(AbstractC001800i.A0k(A0q), AbstractC001800i.A0k(A0a));
        if (C63406Sjd.A0J(c63406Sjd) && A02.isEmpty()) {
            Map map = this.A02;
            Map map2 = this.A04;
            for (SF7 sf7 : r6) {
                Object obj3 = map.get(sf7.A01);
                if (obj3 != null) {
                    Object A022 = sf7.A00.A02();
                    C14360o3.A0C(A022, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.String>");
                    map2.put(obj3, C63406Sjd.A08((C63406Sjd) A022));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        } else {
            this.A05.A00 = new RkC(AbstractC001800i.A0a(A02));
        }
        this.A00.A00((Throwable) this.A05.A00, this.A04);
    }
}
