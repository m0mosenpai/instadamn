package X;

import android.content.Context;

/* renamed from: X.Vna, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69451Vna {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public WGO A05;
    public WUU A06;
    public C69758Vuv A07;
    public C69541Vr5 A08;
    public C68967Vf5 A09;
    public final Context A0A;
    public final C68662VZy A0B;

    public C69451Vna(Context context, C69737VuX c69737VuX, C69527Vqr c69527Vqr, C69758Vuv c69758Vuv, C68967Vf5 c68967Vf5, java.util.Set set, java.util.Set set2, InterfaceC08830cm interfaceC08830cm) {
        this.A0A = context;
        this.A0B = new C68662VZy(interfaceC08830cm);
        this.A07 = c69758Vuv;
        this.A09 = c68967Vf5;
        WUU wuu = new WUU(c69527Vqr);
        this.A06 = wuu;
        C69541Vr5 c69541Vr5 = new C69541Vr5();
        this.A08 = c69541Vr5;
        c69541Vr5.A01.add(wuu);
        C69541Vr5 c69541Vr52 = this.A08;
        c69541Vr52.A00.add(this.A06);
        for (Object obj : set2) {
            if (obj != null) {
                this.A08.A01.add(obj);
            }
        }
        for (Object obj2 : set) {
            if (obj2 != null) {
                this.A08.A00.add(obj2);
            }
        }
        this.A00 = 50;
        this.A01 = 1;
        this.A02 = 10000;
        this.A03 = 3;
        this.A04 = 86400000L;
        C68662VZy c68662VZy = this.A0B;
        this.A05 = new WGO(this.A0A, this, c68662VZy, this.A08, this.A06, c69737VuX, this.A07, this.A09);
    }
}
