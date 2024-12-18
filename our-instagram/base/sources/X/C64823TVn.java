package X;

import android.content.Context;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.TVn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64823TVn implements InterfaceC08830cm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C2GE A01;
    public final /* synthetic */ InterfaceC08830cm A02;

    public C64823TVn(Context context, C2GE c2ge, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = context;
        this.A02 = interfaceC08830cm;
        this.A01 = c2ge;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = this.A00;
        SharedPreferencesC19650xs sharedPreferencesC19650xs = new SharedPreferencesC19650xs(C1AT.A00(C1AV.A1O, "0"));
        InterfaceC08830cm interfaceC08830cm = this.A02;
        C63346Si2 A00 = C63346Si2.A00(context, sharedPreferencesC19650xs, (C58443PvM) interfaceC08830cm.get(), new SCT(interfaceC08830cm), "0");
        C62522SEy c62522SEy = new C62522SEy("0", interfaceC08830cm);
        return new C63174SeZ(this.A01, A00, (C58443PvM) interfaceC08830cm.get(), c62522SEy, EndToEnd.isRunningEndToEndTest());
    }
}
