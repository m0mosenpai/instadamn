package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class MJ6 extends C0YY implements InterfaceC16660sJ {
    public static final MJ6 A00 = new MJ6();

    public MJ6() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(entry);
        A0x.append("'<cls>");
        A0x.append(((Class) entry.getKey()).getName());
        A0x.append("</cls>':");
        return AbstractC166997dE.A0v(entry.getValue(), A0x);
    }
}
