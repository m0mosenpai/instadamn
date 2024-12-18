package X;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class PQU implements Runnable {
    public final /* synthetic */ P18 A00;
    public final /* synthetic */ ArrayList A01;

    public PQU(P18 p18, ArrayList arrayList) {
        this.A00 = p18;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P18 p18 = this.A00;
        C50821Mcw c50821Mcw = p18.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("geoGatingRow");
            throw C00O.createAndThrow();
        }
        c50821Mcw.setInlineSubtitle(P18.A00(p18, this.A01, false));
    }
}
