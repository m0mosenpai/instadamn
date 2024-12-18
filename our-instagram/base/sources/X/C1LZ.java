package X;

import android.content.Context;

/* renamed from: X.1LZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LZ {
    public static volatile C1LZ A0H;
    public static volatile C1LY A0I;
    public final Context A00;
    public final InterfaceC103274l2 A01;
    public final AbstractC103154kq A02;
    public final C103234ky A03;
    public final C103134ko A04;
    public final AbstractC103184kt A05;
    public final C103354lA A06;
    public final C102934kU A07;
    public final C103104kl A08;
    public final C103164kr A09;
    public final InterfaceC103124kn A0A;
    public final InterfaceC103074ki A0B;
    public final C103344l9 A0C;
    public final C1LG A0D;
    public final C103194ku A0E;
    public final C102934kU A0F;
    public final C102934kU A0G;

    public static C1LZ A00() {
        if (A0H == null) {
            synchronized (C1LZ.class) {
                if (A0H == null) {
                    C1LY c1ly = A0I;
                    if (c1ly != null) {
                        A0H = (C1LZ) c1ly.get();
                        C103344l9 c103344l9 = A0H.A0C;
                        synchronized (C103364lB.class) {
                            try {
                                C103364lB.A01 = c103344l9;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Can't find bloks instance. Is it initialized?");
                    }
                }
            }
        }
        return A0H;
    }

    public final C191848eg A01() {
        C102934kU c102934kU = this.A0F;
        if (c102934kU != null) {
            return (C191848eg) c102934kU.A00();
        }
        throw new IllegalStateException("Unexpectedly attempting to perform a fetch/prefetch. Please ensure that your app provides a fetch action");
    }

    public final W3Y A02() {
        C102934kU c102934kU = this.A0G;
        if (c102934kU != null) {
            return (W3Y) c102934kU.A00();
        }
        throw new IllegalStateException("Unexpectedly attempting to perform a native navigation. Please ensure that your app implements a navigation action");
    }

    public final C1LG A03() {
        return this.A0D;
    }

    public C1LZ(Context context, InterfaceC103274l2 interfaceC103274l2, AbstractC103154kq abstractC103154kq, C103344l9 c103344l9, C103234ky c103234ky, C103134ko c103134ko, C1LG c1lg, AbstractC103184kt abstractC103184kt, C103194ku c103194ku, C103354lA c103354lA, C1LY c1ly, C1LY c1ly2, C1LY c1ly3, C103104kl c103104kl, C103164kr c103164kr, InterfaceC103124kn interfaceC103124kn, InterfaceC103074ki interfaceC103074ki) {
        C102934kU c102934kU;
        C102934kU c102934kU2;
        this.A00 = context;
        this.A0B = interfaceC103074ki;
        this.A03 = c103234ky;
        this.A06 = c103354lA;
        this.A04 = c103134ko;
        this.A0A = interfaceC103124kn;
        this.A08 = c103104kl;
        this.A02 = abstractC103154kq;
        this.A09 = c103164kr;
        this.A05 = abstractC103184kt;
        this.A0D = c1lg;
        this.A0E = c103194ku;
        this.A01 = interfaceC103274l2;
        this.A0C = c103344l9;
        if (c1ly != null) {
            c102934kU = new C102934kU(c1ly);
        } else {
            c102934kU = null;
        }
        this.A0F = c102934kU;
        if (c1ly2 != null) {
            c102934kU2 = new C102934kU(c1ly2);
        } else {
            c102934kU2 = null;
        }
        this.A0G = c102934kU2;
        this.A07 = c1ly3 != null ? new C102934kU(c1ly3) : null;
    }
}
