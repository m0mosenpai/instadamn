package X;

import com.instagram.clips.intf.ClipsViewerSource;
import java.util.HashMap;

/* renamed from: X.Io8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42284Io8 implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final C41712Idi A0C = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public ClipsViewerSource A07;
    public UQH A08;
    public UQH A09;
    public String A0A;
    public final HashMap A0B = AbstractC166987dD.A1G();
    public ClipsViewerSource A06 = ClipsViewerSource.A2Z;

    private final void A00() {
        this.A04 = 0L;
        this.A05 = 0L;
        this.A03 = 0;
        this.A0B.clear();
        this.A09 = null;
        this.A08 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A07 = null;
    }

    public C42284Io8() {
        C218914p.A05(this);
    }

    public final void A01(C120985dq c120985dq, Long l, int i) {
        Long l2;
        Float CF6;
        String id = c120985dq.getId();
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (CF6 = c38321qM.A0C.CF6()) != null) {
            l2 = Long.valueOf(CF6.floatValue() * 1000.0f);
        } else {
            l2 = null;
        }
        boolean A0G = c120985dq.A0G();
        boolean A0F = c120985dq.A0F();
        boolean A04 = AbstractC37655Gho.A04(c120985dq);
        EnumC129395t1 enumC129395t1 = c120985dq.A01;
        UQH uqh = new UQH(id, l, enumC129395t1.name(), l2, A0G, A0F, A04);
        if (this.A09 == null && i == 0) {
            this.A09 = uqh;
        }
        if (i > this.A00) {
            this.A02++;
            this.A08 = uqh;
            this.A00 = i;
        }
        if (AbstractC37647Ghg.A01(enumC129395t1)) {
            HashMap hashMap = this.A0B;
            UQH uqh2 = (UQH) AbstractC37301Gc2.A0f(c120985dq, hashMap);
            if (uqh2 != null) {
                Long l3 = null;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l4 = uqh2.A00;
                    if (l4 != null) {
                        l3 = Long.valueOf(l4.longValue() + longValue);
                    }
                    uqh2.A00 = l3;
                    return;
                }
            }
            hashMap.put(c120985dq.getId(), uqh);
            return;
        }
        if (enumC129395t1 != EnumC129395t1.A0G) {
            return;
        }
        this.A03++;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1192590109);
        A00();
        C0f9.A0A(1141088998, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1505476335);
        A00();
        C0f9.A0A(-2025563562, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00();
        C218914p.A06(this);
    }
}
