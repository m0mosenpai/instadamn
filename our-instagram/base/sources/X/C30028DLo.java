package X;

import java.util.List;

/* renamed from: X.DLo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30028DLo extends C0YY implements InterfaceC16660sJ {
    public static final C30028DLo A00 = new C30028DLo();

    public C30028DLo() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        C14360o3.A0B(obj, 0);
        List list3 = (List) obj;
        Object A0t = AbstractC25227BEk.A0t(list3);
        C5C7 c5c7 = AbstractC28160Cb7.A00;
        if (!C14360o3.A0K(A0t, false) && A0t != null) {
            list = (List) c5c7.EKR(A0t);
        } else {
            list = null;
        }
        Object obj2 = list3.get(2);
        if (!C14360o3.A0K(obj2, false) && obj2 != null) {
            list2 = (List) c5c7.EKR(obj2);
        } else {
            list2 = null;
        }
        Object obj3 = list3.get(0);
        if (obj3 != null) {
            str = (String) obj3;
        } else {
            str = null;
        }
        C14360o3.A0A(str);
        if (list == null) {
            list = C16930sl.A00;
        }
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        return AbstractC25230BEn.A0U(new C5C8(list, list2, str));
    }
}
