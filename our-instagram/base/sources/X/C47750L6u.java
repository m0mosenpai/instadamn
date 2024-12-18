package X;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.L6u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47750L6u {
    public int A00;
    public final List A01 = new LinkedList();

    public final List A00() {
        Iterable iterable;
        List list = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof InterfaceC66482zP) {
                iterable = AbstractC166987dD.A1J(obj);
            } else {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.recyclerview.model.RecyclerViewModel<*, *>>");
                iterable = (Iterable) obj;
            }
            AnonymousClass016.A16(iterable, A1E);
        }
        return A1E;
    }
}
