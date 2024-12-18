package X;

/* renamed from: X.Dri, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31438Dri implements InterfaceC62702t9 {
    public final int A00;
    public final String A01;

    public C31438Dri(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        StringBuilder A1C;
        Integer num;
        String str;
        Object obj;
        Integer num2;
        Object obj2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c59062n7, 0);
                return AnonymousClass001.A0R(((C38321qM) c59062n7.A03).getId(), this.A01);
            case 1:
                C14360o3.A0B(c59062n7, 0);
                A1C = AbstractC166987dD.A1C();
                A1C.append(this.A01);
                C09530e4 c09530e4 = (C09530e4) c59062n7.A03;
                if (c09530e4 != null && (obj = c09530e4.A00) != null) {
                    num = Integer.valueOf(obj.hashCode());
                } else {
                    num = null;
                }
                A1C.append(num);
                str = "_recommended_account_card_";
                A1C.append(str);
                return AbstractC166997dE.A0x(c59062n7.A05, A1C);
            default:
                C14360o3.A0B(c59062n7, 0);
                A1C = AbstractC166987dD.A1C();
                A1C.append(this.A01);
                C09530e4 c09530e42 = (C09530e4) c59062n7.A03;
                if (c09530e42 != null && (obj2 = c09530e42.A00) != null) {
                    num2 = Integer.valueOf(obj2.hashCode());
                } else {
                    num2 = null;
                }
                A1C.append(num2);
                str = "_recommended_user_";
                A1C.append(str);
                return AbstractC166997dE.A0x(c59062n7.A05, A1C);
        }
    }
}
