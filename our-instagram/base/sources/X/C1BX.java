package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1BX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1BX {
    public static final C1BY A03 = new Object();
    public static final Map A04 = new HashMap();
    public boolean A00;
    public final InterfaceC12870lZ A01 = new InterfaceC12870lZ() { // from class: X.1Bb
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            int A032 = C0f9.A03(636611880);
            C1BX.this.A09();
            if (((Boolean) AbstractC15930qn.A02.A0G.invoke()).booleanValue()) {
                C218914p.A06(this);
            }
            C0f9.A0A(-1994981080, A032);
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            C0f9.A0A(-1336250060, C0f9.A03(506995352));
        }
    };
    public final String A02;

    public abstract float A02(String str, float f);

    public abstract int A03();

    public abstract long A04(String str, long j);

    public abstract java.util.Set A05();

    public abstract java.util.Set A06(String str, java.util.Set set);

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A(String str);

    public abstract void A0B(String str, float f);

    public abstract void A0C(String str, long j);

    public abstract void A0D(String str, java.util.Set set);

    public abstract void A0E(String str, boolean z);

    public abstract boolean A0F(String str);

    public abstract boolean A0G(String str, boolean z);

    public static final synchronized C1BX A00(InterfaceC62772tG interfaceC62772tG) {
        C1BX A01;
        synchronized (C1BX.class) {
            A01 = A03.A01(interfaceC62772tG);
        }
        return A01;
    }

    public static final synchronized C1BX A01(String str) {
        C1BX A02;
        synchronized (C1BX.class) {
            A02 = A03.A02(str);
        }
        return A02;
    }

    public final void A07() {
        if (((Boolean) AbstractC15930qn.A02.A0G.invoke()).booleanValue() && !this.A00) {
            this.A00 = true;
            C1BX c1bx = (C1BX) A04.get(this.A02);
            if (c1bx != null) {
                C218914p.A03(EnumC220415e.A03, c1bx.A01);
            }
        }
    }

    public C1BX(String str) {
        this.A02 = str;
    }
}
