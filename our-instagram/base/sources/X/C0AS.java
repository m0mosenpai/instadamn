package X;

/* renamed from: X.0AS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AS extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0AS(InterfaceC19630xq interfaceC19630xq, int i) {
        super(2);
        this.A00 = i;
        this.A01 = interfaceC19630xq;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object string;
        String str;
        String str2 = (String) obj;
        if (this.A00 != 0) {
            java.util.Set set = (java.util.Set) obj2;
            C14360o3.A0B(str2, 0);
            C14360o3.A0B(set, 1);
            string = ((InterfaceC19630xq) this.A01).getStringSet(str2, set);
            str = "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>";
        } else {
            String str3 = (String) obj2;
            C14360o3.A0B(str2, 0);
            C14360o3.A0B(str3, 1);
            string = ((InterfaceC19630xq) this.A01).getString(str2, str3);
            str = "null cannot be cast to non-null type kotlin.String";
        }
        C14360o3.A0C(string, str);
        return string;
    }
}
