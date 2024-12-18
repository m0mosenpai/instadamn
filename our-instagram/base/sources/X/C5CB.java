package X;

import java.util.List;

/* renamed from: X.5CB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CB extends C0YY implements InterfaceC16660sJ {
    public static final C5CB A00 = new C5CB();

    public C5CB() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        C5C7 c5c7 = C5C9.A01;
        List list4 = null;
        if (!C14360o3.A0K(obj2, false) && obj2 != null) {
            list = (List) c5c7.EKR(obj2);
        } else {
            list = null;
        }
        Object obj3 = list3.get(2);
        if (!C14360o3.A0K(obj3, false) && obj3 != null) {
            list2 = (List) c5c7.EKR(obj3);
        } else {
            list2 = null;
        }
        Object obj4 = list3.get(0);
        if (obj4 != null) {
            str = (String) obj4;
        } else {
            str = null;
        }
        C14360o3.A0A(str);
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
        } else {
            list = null;
        }
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
        } else {
            list2 = null;
        }
        Object obj5 = list3.get(3);
        if (!C14360o3.A0K(obj5, false) && obj5 != null) {
            list4 = (List) c5c7.EKR(obj5);
        }
        return new C5C8(str, list, list2, list4);
    }
}
