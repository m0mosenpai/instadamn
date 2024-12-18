package X;

import java.util.LinkedHashMap;

/* renamed from: X.543, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass543 extends C0YY implements InterfaceC16820sZ {
    public static final AnonymousClass543 A00 = new AnonymousClass543();

    public AnonymousClass543() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass541[] values = AnonymousClass541.values();
        int A0L = AbstractC16850sd.A0L(values.length);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass541 anonymousClass541 : values) {
            linkedHashMap.put(Integer.valueOf(anonymousClass541.A00), anonymousClass541);
        }
        return linkedHashMap;
    }
}
