package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.TVt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64829TVt implements InterfaceC08830cm {
    public final InterfaceC08830cm A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC08830cm A08;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = (Context) this.A03.get();
        InterfaceC65396TjT interfaceC65396TjT = (InterfaceC65396TjT) this.A00.get();
        InterfaceC65676Tr6 interfaceC65676Tr6 = (InterfaceC65676Tr6) this.A04.get();
        InterfaceC65399TjW interfaceC65399TjW = (InterfaceC65399TjW) this.A08.get();
        Executor executor = (Executor) this.A05.get();
        return new SJH(context, interfaceC65396TjT, interfaceC65399TjW, (InterfaceC65400TjX) this.A01.get(), interfaceC65676Tr6, (InterfaceC65242TgY) this.A06.get(), (InterfaceC65401TjY) this.A02.get(), (InterfaceC65401TjY) this.A07.get(), executor);
    }

    public C64829TVt(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6, InterfaceC08830cm interfaceC08830cm7, InterfaceC08830cm interfaceC08830cm8, InterfaceC08830cm interfaceC08830cm9) {
        this.A03 = interfaceC08830cm;
        this.A00 = interfaceC08830cm2;
        this.A04 = interfaceC08830cm3;
        this.A08 = interfaceC08830cm4;
        this.A05 = interfaceC08830cm5;
        this.A06 = interfaceC08830cm6;
        this.A02 = interfaceC08830cm7;
        this.A07 = interfaceC08830cm8;
        this.A01 = interfaceC08830cm9;
    }
}
