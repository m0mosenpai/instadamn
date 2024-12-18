package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Izo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42998Izo implements InterfaceC115345Ji {
    public final EnumC64222vh A00;

    @Override // X.InterfaceC115345Ji
    public final List EMu(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
            if (c9c7.A04 == AnonymousClass317.A05 && c9c7.A05 == this.A00) {
                A12.add(obj);
            }
        }
        return A12;
    }

    public C42998Izo(EnumC64222vh enumC64222vh) {
        this.A00 = enumC64222vh;
    }
}
