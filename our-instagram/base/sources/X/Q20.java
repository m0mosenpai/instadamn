package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Q20 extends ContextWrapper {
    public static final TIV A0A = new TIV();
    public QBW A00;
    public final int A01;
    public final SAU A02;
    public final C63182Seh A03;
    public final C63361SiK A04;
    public final InterfaceC65610To1 A05;
    public final List A06;
    public final Map A07;
    public final SAS A08;
    public final C61692Rs7 A09;

    public Q20(Context context, SAS sas, SAU sau, C63182Seh c63182Seh, C63361SiK c63361SiK, C61692Rs7 c61692Rs7, InterfaceC65610To1 interfaceC65610To1, List list, Map map) {
        super(context.getApplicationContext());
        this.A04 = c63361SiK;
        this.A09 = c61692Rs7;
        this.A08 = sas;
        this.A06 = list;
        this.A07 = map;
        this.A03 = c63182Seh;
        this.A02 = sau;
        this.A01 = 4;
        this.A05 = new C63886SvK(interfaceC65610To1);
    }
}
