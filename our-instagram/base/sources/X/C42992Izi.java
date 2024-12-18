package X;

/* renamed from: X.Izi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42992Izi implements InterfaceC64212vg {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C42992Izi(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(c120985dq, obj2, enumC64262vl);
        C40971v4 A06 = c120985dq.A06();
        String str = A06.A0S;
        String str2 = this.A01;
        String id = A06.A0K.getId();
        if (id == null) {
            id = "UNKNOWN";
        }
        return new C82573mL(enumC64262vl, str, str2, id, this.A00, AbstractC111324zv.A00(1026), "", f, 0, -1, -1, -1, -1, -1, -1, -1, j, j2);
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return AbstractC82563mK.A01(AbstractC25226BEj.A0y(AbstractC37301Gc2.A0A(obj)));
    }
}
