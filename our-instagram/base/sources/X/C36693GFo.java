package X;

/* renamed from: X.GFo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36693GFo implements InterfaceC169327h6 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C36693GFo(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        if (this.A00 != 0) {
            C14360o3.A0B(str, 0);
            return AbstractC35238FgX.A03(((GFg) this.A01).A03, this.A02, str, this.A03);
        }
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
        String str2 = this.A03;
        String str3 = this.A02;
        C25621Ms A0N = AbstractC31173DnH.A0N(abstractC12990ll);
        A0N.A0B("direct_v2/direct_invite_category/");
        A0N.A0F = str2;
        A0N.A0S(C32215EDo.class, C34783FUi.class);
        return AbstractC31172DnG.A0T(A0N, "category", str3);
    }
}
