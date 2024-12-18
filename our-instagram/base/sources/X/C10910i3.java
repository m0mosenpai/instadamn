package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.0i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10910i3 extends AbstractC03460Gz implements IVerboseDebuggable {
    public static final C03740Ip A02 = new C03740Ip(C10910i3.class, new Class[]{Throwable.class, EnumC03620Ia.class}, 10);
    public EnumC03620Ia A00;
    public Throwable A01;

    @Override // X.InterfaceC03680Ii
    public final void recycle() {
        this.A01 = null;
        this.A00 = EnumC03620Ia.A06;
    }

    @Override // X.AbstractC03460Gz
    public final void A02(int i, int i2, Object obj, Object obj2) {
        A00((Throwable) obj, (EnumC03620Ia) obj2);
    }

    public final String toString() {
        Throwable th = this.A01;
        C0J8.A03(th, "This class has been cleaned or is not inited");
        if (th == null) {
            return "Error! No Throwable Given!!!";
        }
        return AnonymousClass001.A0u("Err ", th.getClass().getName(), ": ", th.getMessage());
    }

    public C10910i3(Throwable th, EnumC03620Ia enumC03620Ia) {
        this();
        A00(th, enumC03620Ia);
    }

    private void A00(Throwable th, EnumC03620Ia enumC03620Ia) {
        th.getClass();
        this.A01 = th;
        enumC03620Ia.getClass();
        this.A00 = enumC03620Ia;
    }

    public C10910i3() {
        super(true);
        this.A01 = null;
        EnumC03620Ia enumC03620Ia = EnumC03620Ia.A06;
        this.A00 = enumC03620Ia;
        this.A01 = null;
        this.A00 = enumC03620Ia;
    }
}
