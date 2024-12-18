package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* renamed from: X.7qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175257qz {
    public static final C175267r0 A0H = new Object() { // from class: X.7r0
    };
    public CameraDevice A00;
    public C175297r3 A01;
    public C175307r4 A02;
    public C175287r2 A03;
    public C176697tR A04;
    public C176787ta A05;
    public InterfaceC174657pz A06;
    public AbstractC176767tY A07;
    public InterfaceC177027ty A08;
    public InterfaceC177027ty A09;
    public InterfaceC177027ty A0A;
    public boolean A0B;
    public final C175277r1 A0C;
    public final C175267r0 A0D;
    public final C175237qx A0E;
    public final C175227qw A0F;
    public volatile boolean A0G;

    public C175257qz(C175237qx c175237qx, C175227qw c175227qw) {
        C175267r0 c175267r0 = A0H;
        this.A0F = c175227qw;
        this.A0E = c175237qx;
        this.A0C = new C175277r1(c175227qw);
        this.A0D = c175267r0;
    }

    public final C176877tj A00(int i) {
        AbstractC176767tY abstractC176767tY;
        C176777tZ c176777tZ;
        List list;
        Object obj;
        C176787ta c176787ta;
        C176807tc c176807tc;
        if (i != 32) {
            if (i != 35) {
                if (i != 37) {
                    if ((i == 256 || i == 4101) && (c176787ta = this.A05) != null) {
                        c176807tc = AbstractC176797tb.A0k;
                        obj = c176787ta.A02(c176807tc);
                    }
                } else {
                    abstractC176767tY = this.A07;
                    if (abstractC176767tY != null) {
                        c176777tZ = AbstractC176767tY.A15;
                        list = (List) abstractC176767tY.A01(c176777tZ);
                        if (list != null && !list.isEmpty()) {
                            obj = list.get(0);
                        }
                    }
                }
                return null;
            }
            c176787ta = this.A05;
            if (c176787ta != null) {
                c176807tc = AbstractC176797tb.A10;
                obj = c176787ta.A02(c176807tc);
            }
            return null;
            return (C176877tj) obj;
        }
        abstractC176767tY = this.A07;
        if (abstractC176767tY != null) {
            c176777tZ = AbstractC176767tY.A16;
            list = (List) abstractC176767tY.A01(c176777tZ);
            if (list != null) {
                obj = list.get(0);
                return (C176877tj) obj;
            }
        }
        return null;
    }

    public final void A01(final InterfaceC196578mn interfaceC196578mn, final Exception exc) {
        this.A0F.A05(new Runnable() { // from class: X.AuR
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC196578mn.this.DEF(exc);
            }
        }, this.A0E.A03);
    }
}
