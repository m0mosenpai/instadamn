package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SYw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62954SYw {
    public final C02Q A00;
    public final C61687Rs1 A01;
    public final List A02;
    public final java.util.Set A03;
    public static final C61687Rs1 A05 = new Object();
    public static final InterfaceC65477Tku A04 = new Object();

    public final synchronized InterfaceC65477Tku A00(Class cls, Class cls2) {
        InterfaceC65477Tku interfaceC65477Tku;
        try {
            ArrayList A1E = AbstractC166987dD.A1E();
            boolean z = false;
            for (SFW sfw : this.A02) {
                java.util.Set set = this.A03;
                if (set.contains(sfw)) {
                    z = true;
                } else if (sfw.A02.isAssignableFrom(cls) && sfw.A01.isAssignableFrom(cls2)) {
                    set.add(sfw);
                    InterfaceC65477Tku AEQ = sfw.A00.AEQ(this);
                    Rs8.A00(AEQ);
                    A1E.add(AEQ);
                    set.remove(sfw);
                }
            }
            if (A1E.size() > 1) {
                interfaceC65477Tku = new C63819SuD(this.A00, A1E);
            } else if (A1E.size() == 1) {
                interfaceC65477Tku = (InterfaceC65477Tku) A1E.get(0);
            } else if (z) {
                interfaceC65477Tku = A04;
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Failed to find any ModelLoaders for model: ");
                A1C.append(cls);
                throw new RuntimeException(AbstractC167017dG.A0n(cls2, " and data: ", A1C));
            }
        } catch (Throwable th) {
            this.A03.clear();
            throw th;
        }
        return interfaceC65477Tku;
    }

    public C62954SYw(C02Q c02q) {
        C61687Rs1 c61687Rs1 = A05;
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1H();
        this.A00 = c02q;
        this.A01 = c61687Rs1;
    }
}
