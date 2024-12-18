package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0NM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NM {
    public int A00;
    public long A01;
    public C17470ti A04;
    public InterfaceC08830cm A06;
    public InterfaceC08830cm A07;
    public InterfaceC08830cm A08;
    public InterfaceC08830cm A09;
    public InterfaceC08830cm A0A;
    public InterfaceC08830cm A0B;
    public InterfaceC08830cm A0C;
    public InterfaceC08830cm A0D;
    public InterfaceC08830cm A0E;
    public InterfaceC08830cm A0F;
    public boolean A0I;
    public boolean A0K;
    public final Application A0L;
    public String A05 = null;
    public long A02 = 0;
    public long A03 = 0;
    public final List A0M = new ArrayList();
    public final List A0N = new ArrayList();
    public final List A0O = new ArrayList();
    public final List A0P = new ArrayList();
    public boolean A0G = false;
    public boolean A0J = false;
    public boolean A0H = false;

    public final void A00(C0NC c0nc) {
        List list;
        if (c0nc != null) {
            int intValue = c0nc.CHb().intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            list = this.A0P;
                        } else {
                            return;
                        }
                    } else {
                        list = this.A0O;
                    }
                } else {
                    list = this.A0N;
                }
            } else {
                list = this.A0M;
            }
            list.add(c0nc);
        }
    }

    public C0NM(Application application) {
        this.A0L = application;
    }
}
