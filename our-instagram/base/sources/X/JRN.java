package X;

/* loaded from: classes8.dex */
public final class JRN implements C6D4 {
    public final C44045JdW A00;

    @Override // X.C6D4
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 8) {
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            C46h c46h = (C46h) obj2;
            AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) obj3;
            boolean A1a = AbstractC166987dD.A1a(obj4);
            boolean A1a2 = AbstractC166987dD.A1a(obj5);
            boolean A1a3 = AbstractC166987dD.A1a(obj6);
            boolean A1a4 = AbstractC166987dD.A1a(obj7);
            C3o9 c3o9 = (C3o9) obj8;
            AbstractC167017dG.A1N(c46h, abstractC46972Dl);
            C14360o3.A0B(c3o9, 6);
            return new JRO(abstractC46972Dl, (InterfaceC50517MRu) c46h.A04(), c3o9, A1a, A1a2, A1a3, A1a4);
        }
        throw AbstractC25230BEn.A0n("Array of size 8 expected but got ", length);
    }

    public JRN(C44045JdW c44045JdW) {
        this.A00 = c44045JdW;
    }
}
