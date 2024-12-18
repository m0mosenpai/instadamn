package X;

import android.content.Context;

/* renamed from: X.SMi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62694SMi {
    public C62761SPt A00;
    public final Context A01;
    public final C07X A02;
    public final C2GS A03;
    public final C5G6 A04;
    public final InterfaceC58362lv A05;

    public final C2GS A00() {
        String str;
        C62761SPt c62761SPt = this.A00;
        if (c62761SPt == null) {
            C2J7 c2j7 = C2J8.A04;
            if (C2J8.A06 != null) {
                c62761SPt = c2j7.A02();
                this.A00 = c62761SPt;
                if (c62761SPt == null) {
                    str = "w3cAppRepo";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c62761SPt.A00 = this.A04;
            } else {
                C2GS c2gs = this.A03;
                C63406Sjd.A0E(c2gs, C16930sl.A00, new Throwable("Failed to initialize W3C Repo"));
                return c2gs;
            }
        }
        str = "w3cAppRepo";
        if (c62761SPt != null) {
            C58252li A00 = c62761SPt.A00();
            InterfaceC58362lv interfaceC58362lv = this.A05;
            A00.A08(interfaceC58362lv);
            C62761SPt c62761SPt2 = this.A00;
            if (c62761SPt2 != null) {
                c62761SPt2.A00().A06(this.A02, interfaceC58362lv);
                return this.A03;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C62694SMi(Context context, C07X c07x, C5G6 c5g6) {
        AbstractC167017dG.A1Q(c5g6, context);
        this.A04 = c5g6;
        this.A02 = c07x;
        this.A01 = context;
        this.A03 = AbstractC58318PtA.A0J();
        this.A05 = new C63627SqZ(this, 50);
        C2J7 c2j7 = C2J8.A04;
        if (C2J8.A06 != null) {
            C62761SPt A02 = c2j7.A02();
            this.A00 = A02;
            if (A02 == null) {
                C14360o3.A0F("w3cAppRepo");
                throw C00O.createAndThrow();
            }
            A02.A00 = this.A04;
        }
    }
}
