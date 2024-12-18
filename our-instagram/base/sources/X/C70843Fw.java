package X;

/* renamed from: X.3Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70843Fw {
    public Long A00;
    public Long A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC19630xq A04;
    public final InterfaceC16820sZ A05;
    public final C70853Fx A06;
    public final C17060sy A07;

    public C70843Fw(InterfaceC19630xq interfaceC19630xq, C70853Fx c70853Fx, C17060sy c17060sy, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c17060sy, 1);
        C14360o3.A0B(interfaceC19630xq, 2);
        C14360o3.A0B(interfaceC16820sZ, 4);
        this.A07 = c17060sy;
        this.A04 = interfaceC19630xq;
        this.A06 = c70853Fx;
        this.A05 = interfaceC16820sZ;
    }

    public final long A00() {
        Long l = this.A00;
        if (l != null && A01()) {
            return l.longValue() - ((Number) this.A05.invoke()).longValue();
        }
        return 300L;
    }

    public final boolean A01() {
        Long l = this.A00;
        if (l != null) {
            if (((Number) this.A05.invoke()).longValue() <= l.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A02(C41181vS c41181vS) {
        if (C14360o3.A0K(c41181vS.A0k, "election:rollcall_v2") && !this.A03) {
            return true;
        }
        return false;
    }
}
