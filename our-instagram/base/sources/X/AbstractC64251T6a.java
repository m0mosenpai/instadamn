package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.T6a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64251T6a implements InterfaceC65665Tqv {
    public int zza = 0;

    public abstract int A0I(InterfaceC65591TnW interfaceC65591TnW);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(Iterable iterable, List list) {
        Charset charset = AbstractC63328Shc.A02;
        if (iterable instanceof InterfaceC65685Ts7) {
            List FGW = ((InterfaceC65685Ts7) iterable).FGW();
            InterfaceC65685Ts7 interfaceC65685Ts7 = (InterfaceC65685Ts7) list;
            int size = list.size();
            for (Object obj : FGW) {
                if (obj == null) {
                    String A0c = AnonymousClass001.A0c("Element at index ", " is null.", AbstractC31172DnG.A03(interfaceC65685Ts7, size));
                    int size2 = interfaceC65685Ts7.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC65685Ts7.remove(size2);
                        }
                    }
                    throw AbstractC166987dD.A15(A0c);
                }
                if (obj instanceof AbstractC64539TIv) {
                    interfaceC65685Ts7.FGd((AbstractC64539TIv) obj);
                } else {
                    interfaceC65685Ts7.add(obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC65263Tgt)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(AbstractC58318PtA.A09(iterable, list.size()));
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
            return;
        }
        list.addAll(iterable);
    }

    public final byte[] A0J() {
        try {
            int FGP = FGP();
            byte[] bArr = new byte[FGP];
            ROC A05 = ROC.A05(bArr, FGP);
            FH0(A05);
            A05.A09();
            return bArr;
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0g("Serializing ", MSY.A0h(this), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
