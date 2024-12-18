package X;

import java.util.Map;

/* renamed from: X.Tca, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65045Tca extends C0YY implements InterfaceC16660sJ {
    public static final C65045Tca A00 = new C65045Tca();

    public C65045Tca() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(entry);
        A0x.append("|    ");
        A0x.append(AbstractC31172DnG.A17(entry));
        A0x.append(" = ");
        return AbstractC166997dE.A0v(entry.getValue(), A0x);
    }
}
