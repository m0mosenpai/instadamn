package X;

/* renamed from: X.1UX, reason: invalid class name */
/* loaded from: classes.dex */
public class C1UX extends AbstractC23681Dy implements InterfaceC23631Dt {
    public final InterfaceC23621Ds A00;

    public C1UX(InterfaceC23621Ds interfaceC23621Ds, C12W c12w) {
        super(c12w, true, true);
        this.A00 = interfaceC23621Ds;
    }

    @Override // X.AnonymousClass198
    public final boolean A0S() {
        return true;
    }

    @Override // X.AnonymousClass198
    public void A0J(Object obj) {
        InterfaceC23621Ds A02 = C1E2.A02(this.A00);
        if (obj instanceof C1JW) {
            Throwable th = ((C1JW) obj).A00;
            C14360o3.A0B(th, 0);
            obj = new C09540e5(th);
        }
        C1E6.A00(obj, A02);
    }

    @Override // X.AbstractC23681Dy
    public void A0X(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (obj instanceof C1JW) {
            Throwable th = ((C1JW) obj).A00;
            C14360o3.A0B(th, 0);
            obj = new C09540e5(th);
        }
        interfaceC23621Ds.resumeWith(obj);
    }

    @Override // X.InterfaceC23631Dt
    public final InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }
}
