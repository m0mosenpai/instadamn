package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2Z4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z4 implements Iterator, InterfaceC15590qF {
    public String A00;
    public boolean A01;
    public final /* synthetic */ C51742Yx A02;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C2Z4(C51742Yx c51742Yx) {
        this.A02 = c51742Yx;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.A00;
        if (str == null && !this.A01) {
            str = this.A02.A00.readLine();
            this.A00 = str;
            if (str == null) {
                this.A01 = true;
            }
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            String str = this.A00;
            this.A00 = null;
            C14360o3.A0A(str);
            return str;
        }
        throw new NoSuchElementException();
    }
}
