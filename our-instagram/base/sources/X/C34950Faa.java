package X;

/* renamed from: X.Faa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34950Faa {
    public static int A03 = 2;
    public EZR A00;
    public final AbstractC59962oe A01;
    public final AbstractC12990ll A02;

    public static void A00(C34950Faa c34950Faa) {
        AbstractC37391oc abstractC37391oc = AbstractC37391oc.$redex_init_class;
        AbstractC37401od abstractC37401od = AbstractC37401od.$redex_init_class;
        if (!AbstractC37391oc.A00()) {
            C16030qx c16030qx = C16030qx.A02;
            AbstractC59962oe abstractC59962oe = c34950Faa.A01;
            String replaceAll = c16030qx.A05(abstractC59962oe.getContext()).replaceAll("-", "");
            C25621Ms A0N = AbstractC31173DnH.A0N(c34950Faa.A02);
            A0N.A0B("si/fetch_headers/");
            A0N.A9s("challenge_type", "signup");
            A0N.A9s("guid", replaceAll);
            C1ON A0S = AbstractC31172DnG.A0S(A0N, ED8.class, C34830FWl.class);
            A0S.A00 = new C32492ESs(c34950Faa);
            abstractC59962oe.schedule(A0S);
        }
    }

    public C34950Faa(AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC59962oe;
        this.A02 = abstractC12990ll;
    }
}
