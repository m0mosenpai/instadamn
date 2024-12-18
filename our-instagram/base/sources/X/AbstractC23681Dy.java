package X;

/* renamed from: X.1Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23681Dy extends AnonymousClass198 implements AnonymousClass195, InterfaceC23621Ds, C19L {
    public final C12W A00;

    public void A0Y(Object obj) {
    }

    public void A0Z(boolean z, Throwable th) {
    }

    @Override // X.AnonymousClass198
    public final void A0K(Object obj) {
        if (obj instanceof C1JW) {
            C1JW c1jw = (C1JW) obj;
            Throwable th = c1jw.A00;
            boolean z = false;
            if (C1JW.A01.get(c1jw) != 0) {
                z = true;
            }
            A0Z(z, th);
            return;
        }
        A0Y(obj);
    }

    @Override // X.AnonymousClass198
    public final void A0N(Throwable th) {
        CLX.A00(this.A00, th);
    }

    @Override // X.C19L
    public final C12W Arv() {
        return this.A00;
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A00;
    }

    public AbstractC23681Dy(C12W c12w, boolean z, boolean z2) {
        C19A c19a;
        if (z2) {
            c19a = AnonymousClass199.A00;
        } else {
            c19a = AnonymousClass199.A01;
        }
        this._state$volatile = c19a;
        if (z) {
            A0P((AnonymousClass195) c12w.get(AnonymousClass195.A00));
        }
        this.A00 = c12w.plus(this);
    }

    @Override // X.AnonymousClass198
    public final String A0F() {
        return AnonymousClass001.A0R(getClass().getSimpleName(), " was cancelled");
    }

    @Override // X.AnonymousClass198
    public String A0G() {
        return getClass().getSimpleName();
    }

    public final void A0W(Integer num, Object obj, InterfaceC16620sF interfaceC16620sF) {
        Object invoke;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 1) {
                        throw new RuntimeException();
                    }
                    return;
                }
                try {
                    C12W c12w = this.A00;
                    Object A00 = C1E8.A00(null, c12w);
                    try {
                        if (!(interfaceC16620sF instanceof C1Dr)) {
                            invoke = C1E2.A00(obj, this, interfaceC16620sF);
                        } else {
                            C15500q5.A06(interfaceC16620sF, 2);
                            invoke = interfaceC16620sF.invoke(obj, this);
                        }
                        if (invoke != C1JX.A02) {
                            resumeWith(invoke);
                            return;
                        }
                        return;
                    } finally {
                        C1E8.A01(A00, c12w);
                    }
                } catch (Throwable th) {
                    resumeWith(new C09540e5(th));
                    return;
                }
            }
            C14360o3.A0B(interfaceC16620sF, 0);
            C1E2.A02(C1E2.A01(obj, this, interfaceC16620sF)).resumeWith(C0eB.A00);
            return;
        }
        C1E1.A00(obj, this, interfaceC16620sF);
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        Throwable A00 = C09550e6.A00(obj);
        if (A00 != null) {
            obj = new C1JW(false, A00);
        }
        Object A0D = A0D(obj);
        if (A0D != AnonymousClass199.A04) {
            A0X(A0D);
        }
    }

    public void A0X(Object obj) {
        A0J(obj);
    }
}
