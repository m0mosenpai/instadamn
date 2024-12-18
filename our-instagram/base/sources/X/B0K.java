package X;

import com.instagram.common.gallery.RemoteMedia;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class B0K implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j;
        Long l;
        Long l2;
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) obj;
        long j2 = 0;
        if (interfaceC66482zP instanceof C195598kz) {
            j = ((C195598kz) interfaceC66482zP).A01.A00.A0C;
        } else if (interfaceC66482zP instanceof C195608l0) {
            RemoteMedia remoteMedia = ((C195608l0) interfaceC66482zP).A03.A04;
            if (remoteMedia != null && (l = remoteMedia.A05) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
        } else {
            throw AbstractC166987dD.A12("Unsupported Media View Model");
        }
        Long valueOf = Long.valueOf(j * 1000);
        InterfaceC66482zP interfaceC66482zP2 = (InterfaceC66482zP) obj2;
        if (interfaceC66482zP2 instanceof C195598kz) {
            j2 = ((C195598kz) interfaceC66482zP2).A01.A00.A0C;
        } else if (interfaceC66482zP2 instanceof C195608l0) {
            RemoteMedia remoteMedia2 = ((C195608l0) interfaceC66482zP2).A03.A04;
            if (remoteMedia2 != null && (l2 = remoteMedia2.A05) != null) {
                j2 = l2.longValue();
            }
        } else {
            throw AbstractC166987dD.A12("Unsupported Media View Model");
        }
        return C2BS.A00(valueOf, Long.valueOf(j2 * 1000));
    }
}
