package X;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.SWf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62899SWf {
    public final int A00;
    public final C62666SLc A01;
    public final List A02;
    public final Random A03 = new Random();

    public static final EnumC46177KcF A00(String str, List list) {
        if (str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC46177KcF enumC46177KcF = (EnumC46177KcF) ((InterfaceC16660sJ) it.next()).invoke(str);
                if (enumC46177KcF != null) {
                    return enumC46177KcF;
                }
            }
        }
        return null;
    }

    public C62899SWf(C62666SLc c62666SLc, List list, int i) {
        this.A02 = list;
        this.A01 = c62666SLc;
        this.A00 = i;
    }
}
