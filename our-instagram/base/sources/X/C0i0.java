package X;

import com.facebook.common.mindeputils.ILogPart;

/* renamed from: X.0i0, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0i0 extends AbstractC03460Gz implements ILogPart {
    public boolean A00;
    public Exception A01;
    public String A02;
    public boolean A03;

    @Override // X.AbstractC03460Gz
    public void A02(int i, int i2, Object obj, Object obj2) {
    }

    public abstract String A03();

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return A00(this, true);
    }

    @Override // X.InterfaceC03680Ii
    public void recycle() {
        this.A03 = false;
        this.A02 = null;
        this.A01 = null;
    }

    public final String toString() {
        try {
            return A00(this, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String A00(C0i0 c0i0, boolean z) {
        String format;
        boolean z2;
        if (c0i0.A03) {
            Exception exc = c0i0.A01;
            if (!z || exc == null) {
                String str = c0i0.A02;
                if (str == null) {
                    return "<NULL>";
                }
                return str;
            }
            throw exc;
        }
        Exception e = null;
        try {
            format = c0i0.A03();
            z2 = true;
        } catch (Exception e2) {
            e = e2;
            Class<?> cls = c0i0.getClass();
            String name = cls.getName();
            String A0R = AnonymousClass001.A0R("ToStr_", cls.getSimpleName());
            Object[] objArr = {name};
            if (A0R == null) {
                A0R = "MinLogError";
            }
            C03720In.A01(6, A0R, String.format("Failed getting string from %s", objArr), e, 0);
            format = String.format("<Error calling %s >", name);
            z2 = false;
        }
        if (z2 && format == null) {
            throw new IllegalStateException(String.format("%s.toStr() cannot return null", c0i0.getClass()));
        }
        if (c0i0.A00) {
            c0i0.A01 = e;
            c0i0.A02 = format;
            c0i0.A03 = true;
        }
        if (!z) {
            return format;
        }
        if (e != null) {
            throw e;
        }
        return format;
    }

    public C0i0(boolean z, boolean z2) {
        super(z2);
        this.A02 = null;
        this.A01 = null;
        this.A03 = false;
        this.A00 = z;
    }
}
