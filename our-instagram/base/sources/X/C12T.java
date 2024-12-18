package X;

/* renamed from: X.12T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C12T extends C12U implements C12X {
    public static final C12Z A00 = new AbstractC212312a() { // from class: X.12Z
        {
            C212512c c212512c = C12X.A00;
            C212612d c212612d = C212612d.A00;
        }
    };

    public boolean A02(C12W c12w) {
        return true;
    }

    public abstract void A05(Runnable runnable, C12W c12w);

    @Override // X.C12U, X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        C12V c12v;
        C14360o3.A0B(interfaceC212412b, 1);
        if (interfaceC212412b instanceof AbstractC212312a) {
            AbstractC212312a abstractC212312a = (AbstractC212312a) interfaceC212412b;
            InterfaceC212412b key = getKey();
            C14360o3.A0B(key, 0);
            if ((key == abstractC212312a || abstractC212312a.A00 == key) && (c12v = (C12V) abstractC212312a.A01.invoke(this)) != null) {
                return c12v;
            }
        } else if (C12X.A00 == interfaceC212412b) {
            return this;
        }
        return null;
    }

    @Override // X.C12U, X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        C12W c12w = this;
        C14360o3.A0B(interfaceC212412b, 1);
        if (interfaceC212412b instanceof AbstractC212312a) {
            AbstractC212312a abstractC212312a = (AbstractC212312a) interfaceC212412b;
            InterfaceC212412b key = getKey();
            C14360o3.A0B(key, 0);
            if ((key == abstractC212312a || abstractC212312a.A00 == key) && abstractC212312a.A01.invoke(this) != null) {
                c12w = AnonymousClass191.A00;
            }
            return c12w;
        }
        if (C12X.A00 == interfaceC212412b) {
            c12w = AnonymousClass191.A00;
        }
        return c12w;
    }

    public C12T() {
        super(C12X.A00);
    }

    public C12T A03(int i) {
        AbstractC214112t.A00(i);
        return new C214212u(this, i);
    }

    public String toString() {
        return AnonymousClass001.A0T(getClass().getSimpleName(), Integer.toHexString(System.identityHashCode(this)), '@');
    }

    public void A04(Runnable runnable, C12W c12w) {
        A05(runnable, c12w);
    }
}
