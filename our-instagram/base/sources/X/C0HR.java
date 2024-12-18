package X;

import android.app.Application;

/* renamed from: X.0HR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HR implements C0OH {
    public final long A00;
    public final C04140Kg A01;
    public final Application A02;
    public final C04230Kp A03;
    public final C02S A04;
    public final InterfaceC08830cm A05;
    public final boolean A06;

    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C15280pi c15280pi;
        C15300pk c15300pk;
        C15280pi c15280pi2;
        C15280pi c15280pi3;
        C15300pk c15300pk2;
        C15280pi c15280pi4 = new C15280pi(this, 10);
        C15300pk c15300pk3 = null;
        if (C0M4.A00()) {
            c15300pk3 = new C15300pk(32);
            c15280pi = new C15280pi(this, 7);
            c15300pk = new C15300pk(33);
            c15280pi2 = new C15280pi(this, 8);
            c15280pi3 = new C15280pi(this, 9);
            c15300pk2 = new C15300pk(34);
        } else {
            c15280pi = null;
            c15300pk = null;
            c15280pi2 = null;
            c15280pi3 = null;
            c15300pk2 = null;
        }
        Application application = this.A02;
        C04230Kp c04230Kp = this.A03;
        InterfaceC08830cm interfaceC08830cm = this.A05;
        C04140Kg c04140Kg = this.A01;
        boolean z = this.A06;
        boolean z2 = !C20150ym.A07(AbstractC20100yh.A00(36313119559124773L));
        int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36594594536097579L));
        boolean z3 = !C20150ym.A07(AbstractC20100yh.A00(36313119558993699L));
        int A012 = (int) C20150ym.A01(AbstractC20100yh.A00(36594594536032042L));
        boolean z4 = !C20150ym.A07(AbstractC20100yh.A00(36313119559517991L));
        int A013 = (int) C20150ym.A01(AbstractC20100yh.A00(36594594536163116L));
        C0NA c0na = new C0NA(C05F.A14);
        c0na.A00 = new C15170pX(c04140Kg, interfaceC08830cm, A01, A012, A013, 0, z2, z3, z4, z);
        Integer num = C05F.A00;
        c0na.A02 = num;
        c0na.A04 = true;
        c0na.A03 = false;
        c0na.A01 = new C15190pZ(application, c04230Kp, 6);
        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
        c0na.A02(c0m6, c15280pi4);
        c0na.A02(c0m6, c15300pk3);
        c0na.A02(c0m6, c15280pi);
        c0na.A02(c0m6, c15300pk);
        c0na.A02(c0m6, c15280pi2);
        c0na.A02(c0m6, c15280pi3);
        c0nm.A00(c0na.A00());
        C0NA c0na2 = new C0NA(C05F.A0L);
        c0na2.A00 = new C15280pi(interfaceC08830cm, 1);
        c0na2.A02 = num;
        c0na2.A04 = true;
        c0na2.A03 = false;
        c0na2.A01 = new C15190pZ(application, c04230Kp, 5);
        c0na2.A02(c0m6, c15280pi4);
        c0na2.A02(c0m6, c15300pk3);
        c0na2.A02(c0m6, c15280pi);
        c0na2.A02(c0m6, c15300pk);
        c0na2.A02(c0m6, c15280pi3);
        c0nm.A00(c0na2.A00());
        C0NA c0na3 = new C0NA(C05F.A0Z);
        c0na3.A00 = new C15190pZ(application, interfaceC08830cm, 3);
        c0na3.A02 = num;
        c0na3.A04 = true;
        c0na3.A03 = false;
        c0na3.A01 = new C15190pZ(application, c04230Kp, 4);
        c0na3.A02(c0m6, c15280pi4);
        c0na3.A02(c0m6, c15300pk3);
        c0na3.A02(c0m6, c15280pi);
        c0na3.A02(c0m6, c15300pk);
        c0na3.A02(c0m6, c15280pi3);
        c0na3.A02(c0m6, c15300pk2);
        c0nm.A00(c0na3.A00());
        boolean z5 = !C20150ym.A07(AbstractC20100yh.A00(36313119559059236L));
        int A014 = (int) C20150ym.A01(AbstractC20100yh.A00(36594594535966505L));
        C0NA c0na4 = new C0NA(C05F.A0j);
        c0na4.A00 = new C15270ph(interfaceC08830cm, A014, 1, z5);
        c0na4.A02 = num;
        c0na4.A04 = true;
        c0na4.A03 = false;
        c0na4.A01 = new C15190pZ(application, c04230Kp, 2);
        c0na4.A02(c0m6, c15280pi4);
        c0na4.A02(c0m6, c15280pi);
        c0na4.A02(c0m6, c15280pi3);
        c0nm.A00(c0na4.A00());
        return c0nm;
    }

    public C0HR(Application application, C04140Kg c04140Kg, C04230Kp c04230Kp, C02S c02s, InterfaceC08830cm interfaceC08830cm, long j, boolean z) {
        this.A02 = application;
        this.A04 = c02s;
        this.A03 = c04230Kp;
        this.A05 = interfaceC08830cm;
        this.A06 = z;
        this.A01 = c04140Kg;
        this.A00 = j;
    }
}
