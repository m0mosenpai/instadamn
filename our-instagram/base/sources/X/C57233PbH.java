package X;

import java.util.List;

/* renamed from: X.PbH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57233PbH extends C03E implements InterfaceC16600sD {
    public C57233PbH(Object obj) {
        super(4, obj, C52B.class, "exampleProvider", "exampleProvider(Ljava/lang/String;DLjava/util/List;J)Lcom/instagram/casper/IgSignalsCasperProductModelExample;", 0);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        double A00 = MSW.A00(obj2);
        List list = (List) obj3;
        long A0N = AbstractC166987dD.A0N(obj4);
        AbstractC167017dG.A1O(str, list);
        return new C52C(str, list, A00, A0N);
    }
}
