package X;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class B0U implements Comparator {
    public static final B0U A00 = new B0U();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC93104Fm interfaceC93104Fm = (InterfaceC93104Fm) obj;
        InterfaceC93104Fm interfaceC93104Fm2 = (InterfaceC93104Fm) obj2;
        AbstractC167017dG.A1N(interfaceC93104Fm, interfaceC93104Fm2);
        return interfaceC93104Fm.getZIndex() - interfaceC93104Fm2.getZIndex();
    }
}
