package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.HIv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39097HIv extends C4F4 {
    public final List A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C39097HIv() {
        this(null, 0 == true ? 1 : 0, 1);
    }

    public C39097HIv(boolean z) {
        E90 e90;
        if (z) {
            e90 = new E90(null, null, null, false, false);
        } else {
            e90 = null;
        }
        this.A00 = AbstractC166987dD.A1J(new C33165EkC(e90));
    }

    public final C33165EkC A00() {
        Object obj;
        C33165EkC c33165EkC;
        Iterator it = this.A00.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(obj instanceof C33165EkC));
        if ((obj instanceof C33165EkC) && (c33165EkC = (C33165EkC) obj) != null) {
            return c33165EkC;
        }
        throw AbstractC166987dD.A12("Expected product grid component");
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39097HIv c39097HIv = (C39097HIv) obj;
        C14360o3.A0B(c39097HIv, 0);
        return C14360o3.A0K(this.A00, c39097HIv.A00);
    }

    public /* synthetic */ C39097HIv(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = AbstractC166987dD.A1J(new C33165EkC(null));
    }
}
