package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Taw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64971Taw extends C0YY implements InterfaceC16820sZ {
    public static final C64971Taw A00 = new C64971Taw();

    public C64971Taw() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        InterfaceC09390do interfaceC09390do = C63376Sin.A0C;
        A0Z.put("ml-cc-csc", AbstractC58321PtD.A15("password", AbstractC58322PtE.A12(A0Z, "ml-cc-exp", AbstractC58321PtD.A15("birthdate|dob|invaliddate", AbstractC58322PtE.A12(A0Z, "ml-cc-exp-year", AbstractC58321PtD.A15("cardmonthyear", AbstractC58322PtE.A12(A0Z, "ml-cc-exp-month", AbstractC58321PtD.A15("cardmonthyear", (java.util.Set) interfaceC09390do.getValue()), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)));
        return A0Z.buildOrThrow();
    }
}
