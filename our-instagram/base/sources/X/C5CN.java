package X;

import java.util.List;

/* renamed from: X.5CN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CN extends C0YY implements InterfaceC16660sJ {
    public static final C5CN A00 = new C5CN();

    public C5CN() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C28222CcS c28222CcS = null;
        if (obj2 != null) {
            str = (String) obj2;
        } else {
            str = null;
        }
        C14360o3.A0A(str);
        Object obj3 = list.get(1);
        C5C7 c5c7 = C5C9.A0F;
        if (!C14360o3.A0K(obj3, false) && obj3 != null) {
            c28222CcS = (C28222CcS) c5c7.EKR(obj3);
        }
        return new Bb5(c28222CcS, str);
    }
}
