package X;

import android.database.Observable;

/* renamed from: X.1pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37951pc {
    public C39831t7 A00;
    public boolean A01;
    public final C37971pe A02;
    public final InterfaceC11590jI A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37951pc(InterfaceC11590jI interfaceC11590jI, String str) {
        this();
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A03 = interfaceC11590jI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.Observable, X.1pe] */
    public C37951pc() {
        this.A02 = new Observable();
    }
}
