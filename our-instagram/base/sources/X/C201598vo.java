package X;

/* renamed from: X.8vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201598vo implements InterfaceC179087xK, InterfaceC179167xS {
    public int A00;
    public int A01;
    public InterfaceC180227zC A02;
    public C81A A03;
    public boolean A04;
    public final InterfaceC201588vn A05;
    public final C201278vB A06;
    public final C201528vh A07;
    public final C201608vp A08;

    public C201598vo(InterfaceC201588vn interfaceC201588vn) {
        this.A05 = interfaceC201588vn;
        this.A06 = new C201278vB();
        this.A08 = new C201608vp(true);
        this.A07 = new C201528vh();
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C14360o3.A0B(interfaceC180227zC, 0);
        this.A02 = interfaceC180227zC;
        C81A c81a = this.A03;
        if (c81a != null) {
            c81a.Dr7(interfaceC180227zC.BiH());
        }
        this.A08.A00 = interfaceC180227zC.BiH();
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C81A c81a = this.A03;
        if (c81a != null) {
            c81a.DrA();
        }
        this.A08.DrA();
        this.A02 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                C81A c81a = this.A03;
                C81A c81a2 = ((C201598vo) obj).A03;
                if (c81a != c81a2) {
                    if (c81a != null && c81a.equals(c81a2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C81A c81a = this.A03;
        if (c81a == null) {
            return 0;
        }
        return c81a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlLegacyRenderer(");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C201598vo() {
        this(new C201578vm());
    }
}
