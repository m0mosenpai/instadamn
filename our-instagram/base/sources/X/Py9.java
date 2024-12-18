package X;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class Py9 implements InterfaceC65377TjA {
    public static final InterfaceC65235TgR A06 = new C58525Pwt(0);
    public final InterfaceC65235TgR A00;
    public final InterfaceC65377TjA A01;
    public final Integer A02;
    public final Pattern A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC65377TjA
    public final List ANE(C62577SHc c62577SHc) {
        C14360o3.A0B(c62577SHc, 0);
        return this.A01.ANE(c62577SHc);
    }

    public Py9(InterfaceC65235TgR interfaceC65235TgR, InterfaceC65377TjA interfaceC65377TjA, Integer num, Pattern pattern, boolean z, boolean z2) {
        this.A02 = num;
        this.A03 = pattern;
        this.A01 = interfaceC65377TjA;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = interfaceC65235TgR;
    }
}
