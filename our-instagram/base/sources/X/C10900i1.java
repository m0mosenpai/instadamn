package X;

/* renamed from: X.0i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10900i1 extends AbstractC03460Gz {
    public static final C03740Ip A04 = new C03740Ip(C10900i1.class, new Class[]{Class.class}, 35);
    public Object A00;
    public Throwable A01;
    public boolean A02;
    public boolean A03;

    private void A00() {
    }

    @Override // X.InterfaceC03680Ii
    public final void recycle() {
        this.A03 = false;
        this.A01 = null;
        Object obj = this.A00;
        this.A00 = null;
        C03740Ip.A03(obj, false);
    }

    public C10900i1(Class cls) {
        this();
        A00();
    }

    @Override // X.AbstractC03460Gz
    public final void A02(int i, int i2, Object obj, Object obj2) {
    }

    public C10900i1() {
        super(false);
    }
}
