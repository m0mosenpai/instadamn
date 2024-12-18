package X;

/* renamed from: X.FvC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36014FvC implements InterfaceC57927PmX {
    public final int A00;

    public C36014FvC(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC57927PmX
    public final InterfaceC40801un E3V(C16L c16l) {
        InterfaceC40801un parseFromJson;
        switch (this.A00) {
            case 0:
                return FY3.parseFromJson(c16l);
            case 1:
                C14360o3.A0B(c16l, 0);
                parseFromJson = F0P.parseFromJson(c16l);
                C14360o3.A07(parseFromJson);
                return parseFromJson;
            default:
                C14360o3.A0B(c16l, 0);
                parseFromJson = FY3.parseFromJson(c16l);
                C14360o3.A07(parseFromJson);
                return parseFromJson;
        }
    }
}
