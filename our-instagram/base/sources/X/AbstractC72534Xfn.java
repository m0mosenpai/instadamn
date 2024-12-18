package X;

import java.util.List;

/* renamed from: X.Xfn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72534Xfn {
    public static InterfaceC185788Ly A00(List list) {
        int width;
        int height;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) list.get(i);
            if (AbstractC72536Xfp.A00(interfaceC185788Ly)) {
                width = interfaceC185788Ly.getHeight();
                height = interfaceC185788Ly.getWidth();
            } else {
                width = interfaceC185788Ly.getWidth();
                height = interfaceC185788Ly.getHeight();
            }
            if (width > 1 && height > 1) {
                return interfaceC185788Ly;
            }
        }
        return null;
    }
}
