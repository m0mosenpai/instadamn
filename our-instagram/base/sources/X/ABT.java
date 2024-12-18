package X;

import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ABT {
    public int A01;
    public int A00 = 0;
    public List A02 = new LinkedList();
    public List A03 = new LinkedList();

    public final synchronized void A00() {
        this.A02.clear();
        this.A03.clear();
        this.A01 = 0;
    }
}
