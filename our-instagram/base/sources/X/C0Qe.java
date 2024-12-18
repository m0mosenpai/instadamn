package X;

import com.instagram.preferences.device.AppRestartLoggerPrefs;

/* renamed from: X.0Qe, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Qe extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Qe(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = 3;
    }

    public static void A00(C0Qe c0Qe) {
        c0Qe.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C0Qe) && ((C0Qe) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A01 = obj;
                A00(this);
                return ((AppRestartLoggerPrefs) this.A02).A02(this, null);
            case 1:
                this.A02 = obj;
                A00(this);
                return ((C14980pD) this.A01).emit(null, this);
            case 2:
            default:
                this.A01 = obj;
                A00(this);
                return ((C14980pD) this.A02).emit(null, this);
            case 3:
                this.A02 = obj;
                A00(this);
                return AnonymousClass042.A00(null, this, null);
            case 4:
            case 5:
                this.A01 = obj;
                A00(this);
                return ((C14960pB) this.A02).emit(null, this);
            case 6:
                this.A01 = obj;
                A00(this);
                return ((C14960pB) this.A02).A00(0, this);
            case 7:
                this.A01 = obj;
                A00(this);
                return ((C0UL) this.A02).collect(null, this);
            case 8:
                this.A01 = obj;
                A00(this);
                return ((C14890p3) this.A02).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Qe(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Qe(C14980pD c14980pD, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = 1;
        this.A01 = c14980pD;
    }
}
