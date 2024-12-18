package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5TY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5TY implements C5TZ {
    public Object A00;
    public final Object A01;
    public final List A02 = new ArrayList();

    @Override // X.C5TZ
    public final void F9y() {
        List list = this.A02;
        if (!(!list.isEmpty())) {
            SQP.A01("empty stack");
            throw C00O.createAndThrow();
        }
        this.A00 = list.remove(list.size() - 1);
    }

    public C5TY(Object obj) {
        this.A01 = obj;
        this.A00 = obj;
    }
}
