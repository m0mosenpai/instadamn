package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LmZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49047LmZ implements InterfaceC164907Zd {
    public final List A00;

    @Override // X.InterfaceC164907Zd
    public final boolean AFt(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (((InterfaceC164907Zd) it.next()).AFt(directMessageIdentifier)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIu(DirectMessageIdentifier directMessageIdentifier, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(directMessageIdentifier, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (((InterfaceC164907Zd) it.next()).CIu(directMessageIdentifier, interfaceC16820sZ)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIv(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (((InterfaceC164907Zd) it.next()).CIv(directMessageIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public C49047LmZ(List list) {
        this.A00 = list;
    }
}
