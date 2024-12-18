package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tuf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65822Tuf extends C2WC implements InterfaceC50822Vd {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Rect A04;
    public C3F1 A05;
    public AbstractC61802rh A06;
    public C68690VaQ A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public final U46 A0C;
    public final AbstractC65828Tul A0D;
    public final long A0E;
    public static final InterfaceC77833eB A0F = new C65813TuW();
    public static final InterfaceC77833eB A0M = new C65821Tue();
    public static final InterfaceC77833eB A0Q = new C65817Tua();
    public static final InterfaceC77833eB A0R = new C65814TuX();
    public static final InterfaceC77833eB A0K = new C65816TuZ();
    public static final InterfaceC77833eB A0J = new C65818Tub();
    public static final InterfaceC77833eB A0L = new C65815TuY();
    public static final InterfaceC77833eB A0G = new C65820Tud();
    public static final InterfaceC77833eB A0O = new C65819Tuc();
    public static final InterfaceC77833eB A0H = new C65811TuU();
    public static final InterfaceC77833eB A0P = new C65809TuS();
    public static final InterfaceC77833eB A0I = new C65812TuV();
    public static final InterfaceC77833eB A0N = new C65810TuT();

    @Override // X.C2WC
    public final boolean A0E() {
        return true;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    public C65822Tuf(U46 u46, AbstractC65828Tul abstractC65828Tul, long j) {
        super(C05F.A01);
        this.A00 = 0;
        this.A02 = 0;
        this.A0B = true;
        this.A0A = true;
        this.A0E = j;
        this.A0D = abstractC65828Tul;
        this.A0C = u46;
        C77843eC[] c77843eCArr = {AbstractC78283eu.A00(A0M, this), AbstractC78283eu.A00(A0F, this), AbstractC78283eu.A00(A0Q, this), AbstractC78283eu.A00(A0R, this), AbstractC78283eu.A00(A0K, this), AbstractC78283eu.A00(A0J, this), AbstractC78283eu.A00(A0L, this), AbstractC78283eu.A00(A0G, this), AbstractC78283eu.A00(A0O, this), AbstractC78283eu.A00(A0H, this), AbstractC78283eu.A00(A0P, this), AbstractC78283eu.A00(A0I, this), AbstractC78283eu.A00(A0N, this)};
        int i = 0;
        do {
            A0D(c77843eCArr[i]);
            i++;
        } while (i < 13);
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A0E;
    }

    public final void A0J(C1I4 c1i4) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList(4);
            this.A09 = list;
        }
        list.add(c1i4);
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return new C131785xE(context);
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ int E4c() {
        return 3;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ Object BeR() {
        return getClass();
    }
}
