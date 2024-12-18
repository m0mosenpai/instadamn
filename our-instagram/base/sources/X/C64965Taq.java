package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Taq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64965Taq extends C0YY implements InterfaceC16820sZ {
    public static final C64965Taq A00 = new C64965Taq();

    public C64965Taq() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put("tel", AbstractC58321PtD.A15("\\bphone[_\\-\\s]?country[_\\-\\s]?select\\b", (java.util.Set) C63376Sin.A0C.getValue()));
        return A0Z.buildOrThrow();
    }
}
