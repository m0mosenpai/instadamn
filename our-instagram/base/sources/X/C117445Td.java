package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117445Td implements Iterable, InterfaceC15590qF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C18750w2 A04;
    public HashMap A06;
    public boolean A07;
    public int[] A08 = new int[0];
    public Object[] A09 = new Object[0];
    public ArrayList A05 = new ArrayList();

    public final C117555Tq A00() {
        if (!this.A07) {
            this.A01++;
            return new C117555Tq(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final C117565Tr A01() {
        String str;
        if (!(!this.A07)) {
            str = "Cannot start a writer when another writer is pending";
        } else {
            if (this.A01 <= 0) {
                this.A07 = true;
                this.A03++;
                return new C117565Tr(this);
            }
            str = "Cannot start a writer when a reader is pending";
        }
        C5UC.A03(str);
        throw C00O.createAndThrow();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new YJ2(this, 0, this.A00);
    }
}
