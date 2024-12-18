package X;

import com.facebook.common.mindeputils.ILogPart;
import java.util.concurrent.Callable;

/* renamed from: X.0RY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RY extends C0i0 {
    public static final C03740Ip A05 = new C03740Ip(C0RY.class, new Class[]{Integer.TYPE, Boolean.TYPE, Callable.class, ILogPart.class}, 7);
    public Callable A00;
    public boolean A01;
    public boolean A02;
    public ILogPart A03;
    public ILogPart A04;

    public C0RY(ILogPart iLogPart) {
        this(105, false, null, iLogPart);
    }

    @Override // X.C0i0
    public final String A03() {
        boolean booleanValue;
        if (this.A02) {
            booleanValue = this.A01;
        } else {
            Callable callable = this.A00;
            if (callable != null) {
                try {
                    Boolean bool = (Boolean) callable.call();
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                        this.A01 = booleanValue;
                        this.A02 = true;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            booleanValue = false;
        }
        if (booleanValue) {
            ILogPart iLogPart = this.A04;
            if (iLogPart == null) {
                return "<Log Err: No If LogFrag>";
            }
            return C0i0.A00((C0i0) iLogPart, true);
        }
        return "";
    }

    @Override // X.C0i0, X.InterfaceC03680Ii
    public final void recycle() {
        ILogPart iLogPart = this.A04;
        this.A04 = null;
        C03740Ip.A03(iLogPart, true);
        super.recycle();
    }

    public void newInitWith(int i, boolean z, Callable callable, ILogPart iLogPart) {
        this.A04 = (ILogPart) C0J8.A00(iLogPart);
        this.A03 = null;
        boolean z2 = true;
        switch (i) {
            case 103:
                this.A01 = z;
                this.A02 = true;
                if (callable != null) {
                    z2 = false;
                }
                C0J8.A06(z2);
                this.A00 = null;
                return;
            case 104:
                this.A01 = false;
                this.A02 = false;
                this.A00 = (Callable) C0J8.A00(callable);
                return;
            case 105:
                this.A01 = false;
                this.A02 = false;
                if (callable != null) {
                    z2 = false;
                }
                C0J8.A06(z2);
                this.A00 = null;
                return;
            default:
                throw new IllegalArgumentException(String.format("ConditionalLogFragment type %d not understood", Integer.valueOf(i)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0RY(boolean r3, java.lang.String r4, java.lang.Object... r5) {
        /*
            r2 = this;
            X.0Ip r1 = X.C0RP.A02
            X.0Io r0 = r1.A03
            if (r0 == 0) goto L11
            r0 = 0
            X.0Ii r0 = X.C03740Ip.A01(r1, r4, r5, r0, r0)
        Lb:
            X.0i0 r0 = (X.C0i0) r0
            r2.<init>(r3, r0)
            return
        L11:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5}
            X.0Ii r0 = X.C03740Ip.A02(r1, r0)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RY.<init>(boolean, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0RY(java.util.concurrent.Callable r3, java.lang.String r4, java.lang.Object... r5) {
        /*
            r2 = this;
            X.0Ip r1 = X.C0RP.A02
            X.0Io r0 = r1.A03
            if (r0 == 0) goto L11
            r0 = 0
            X.0Ii r0 = X.C03740Ip.A01(r1, r4, r5, r0, r0)
        Lb:
            X.0i0 r0 = (X.C0i0) r0
            r2.<init>(r3, r0)
            return
        L11:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5}
            X.0Ii r0 = X.C03740Ip.A02(r1, r0)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RY.<init>(java.util.concurrent.Callable, java.lang.String, java.lang.Object[]):void");
    }

    public C0RY(int i, boolean z, Callable callable, ILogPart iLogPart) {
        this();
        newInitWith(i, z, callable, iLogPart);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0RY(java.lang.String r3, java.lang.Object... r4) {
        /*
            r2 = this;
            X.0Ip r1 = X.C0RP.A02
            X.0Io r0 = r1.A03
            if (r0 == 0) goto L11
            r0 = 0
            X.0Ii r0 = X.C03740Ip.A01(r1, r3, r4, r0, r0)
        Lb:
            X.0i0 r0 = (X.C0i0) r0
            r2.<init>(r0)
            return
        L11:
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4}
            X.0Ii r0 = X.C03740Ip.A02(r1, r0)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RY.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public C0RY(Callable callable, ILogPart iLogPart) {
        this(104, false, callable, iLogPart);
    }

    public C0RY(boolean z, ILogPart iLogPart) {
        this(103, z, null, iLogPart);
    }

    public C0RY() {
        super(false, true);
        this.A04 = null;
        this.A03 = null;
    }
}
