package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class BA1 extends C0YY implements InterfaceC16660sJ {
    public static final BA1 A00 = new BA1();

    public BA1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        return Boolean.valueOf(C14360o3.A0K(entry.getKey(), "media_id"));
    }
}
