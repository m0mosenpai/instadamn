package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0E4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E4 {
    public int A00;
    public ArrayList A01;
    public List A02;

    public final synchronized void A00() {
        this.A00--;
    }

    public C0E4() {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A02 = Collections.unmodifiableList(arrayList);
    }
}
