package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class TER implements InterfaceC65445TkH, Cloneable {
    public final void A01(byte[] bArr) {
        int length = bArr.length;
        AbstractC60877RXa abstractC60877RXa = (AbstractC60877RXa) this;
        C63271SgV A00 = C63271SgV.A00();
        abstractC60877RXa.A04();
        try {
            SYX.A02.A00(abstractC60877RXa.A00.getClass()).CpQ(new C62906SWn(A00), abstractC60877RXa.A00, bArr, 0, length);
        } catch (C4L5 e) {
            throw e;
        } catch (IOException e2) {
            throw AbstractC58318PtA.A0e("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C4L5.A02();
        }
    }

    public static void A00(Iterable iterable, List list) {
        Charset charset = SVB.A04;
        iterable.getClass();
        if (iterable instanceof InterfaceC65687Ts9) {
            List CCQ = ((InterfaceC65687Ts9) iterable).CCQ();
            InterfaceC65687Ts9 interfaceC65687Ts9 = (InterfaceC65687Ts9) list;
            int size = list.size();
            for (Object obj : CCQ) {
                if (obj == null) {
                    String A0c = AnonymousClass001.A0c("Element at index ", " is null.", AbstractC31172DnG.A03(interfaceC65687Ts9, size));
                    int size2 = interfaceC65687Ts9.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC65687Ts9.remove(size2);
                        }
                    }
                    throw AbstractC166987dD.A15(A0c);
                }
                if (obj instanceof AbstractC64538TIu) {
                    interfaceC65687Ts9.A7g((AbstractC64538TIu) obj);
                } else {
                    interfaceC65687Ts9.add(obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC65288ThL) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(AbstractC58318PtA.A09((Collection) iterable, list.size()));
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String A0c2 = AnonymousClass001.A0c("Element at index ", " is null.", AbstractC31172DnG.A03(list, size3));
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw AbstractC166987dD.A15(A0c2);
            }
            list.add(obj2);
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw C00O.createAndThrow();
    }
}
