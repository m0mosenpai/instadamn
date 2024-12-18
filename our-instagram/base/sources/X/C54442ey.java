package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54442ey extends C0YY implements InterfaceC16820sZ {
    public static final C54442ey A00 = new C54442ey();

    public C54442ey() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list = AbstractC54422ew.A00;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC54222eY) obj).A03) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC54222eY) it.next()).A02);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String upperCase = ((EnumC54222eY) it2.next()).A02.toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            arrayList3.add(upperCase);
        }
        return AbstractC001800i.A0k(AbstractC001800i.A0S(arrayList3, arrayList2));
    }
}
