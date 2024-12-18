package X;

import java.util.Iterator;

/* renamed from: X.17f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C224317f implements InterfaceC224417g {
    public final int A00;
    public final CharSequence A01;
    public final InterfaceC16620sF A02;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C225517r(this);
    }

    public C224317f(CharSequence charSequence, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A01 = charSequence;
        this.A00 = i;
        this.A02 = interfaceC16620sF;
    }
}
