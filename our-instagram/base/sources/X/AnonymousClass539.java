package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* renamed from: X.539, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass539 extends C0YY implements InterfaceC16820sZ {
    public static final AnonymousClass539 A00 = new AnonymousClass539();

    public AnonymousClass539() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        EnumEntries enumEntries = AnonymousClass538.A02;
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(enumEntries, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (Object obj : enumEntries) {
            linkedHashMap.put(((AnonymousClass538) obj).A00, obj);
        }
        return linkedHashMap;
    }
}
