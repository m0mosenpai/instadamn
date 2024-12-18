package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5K0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K0 implements InterfaceC115345Ji {
    public final EnumC64222vh A00;

    @Override // X.InterfaceC115345Ji
    public final List EMu(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
            if (c9c7.A04 == AnonymousClass317.A0J && c9c7.A05 == this.A00) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public C5K0(EnumC64222vh enumC64222vh) {
        this.A00 = enumC64222vh;
    }
}
