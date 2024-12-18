package X;

import java.util.Iterator;

/* renamed from: X.TIx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64541TIx implements Iterable, InterfaceC15590qF {
    public final char A00;
    public final char A01;
    public final int A02 = 1;

    public AbstractC64541TIx(char c, char c2) {
        this.A00 = c;
        this.A01 = (char) C17x.A00(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C64948TaO(this.A00, this.A01);
    }
}
