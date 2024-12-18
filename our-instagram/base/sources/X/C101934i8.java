package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101934i8 implements InterfaceC101944i9, InterfaceC673031v, InterfaceC101974iC {
    public final AnonymousClass320 A00;
    public final UserSession A01;
    public final InterfaceC114805Gn A02;
    public final InterfaceC671231d A03;
    public final C1PY A04;
    public final InterfaceC671531g A05;
    public final AtomicReference A06;
    public final AtomicReference A07;
    public final AtomicReference A08;
    public final AtomicReference A09;

    public C101934i8(UserSession userSession, InterfaceC114805Gn interfaceC114805Gn, AnonymousClass320 anonymousClass320, InterfaceC671231d interfaceC671231d, C1PY c1py, InterfaceC671531g interfaceC671531g) {
        C14360o3.A0B(c1py, 4);
        this.A01 = userSession;
        this.A00 = anonymousClass320;
        this.A02 = interfaceC114805Gn;
        this.A04 = c1py;
        this.A03 = interfaceC671231d;
        this.A05 = interfaceC671531g;
        this.A08 = new AtomicReference(new ArrayList());
        this.A07 = new AtomicReference(new ArrayList());
        this.A09 = new AtomicReference(new HashMap());
        this.A06 = new AtomicReference(new HashMap());
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blu(String str) {
        C14360o3.A0B(str, 0);
        Map map = (Map) this.A06.get();
        if (map != null) {
            return (C41551w4) map.get(str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final int CNR(C41551w4 c41551w4) {
        C14360o3.A0B(c41551w4, 0);
        List list = (List) this.A08.get();
        if (list != null) {
            return list.indexOf(c41551w4);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC673031v
    public final void DKk(C1PZ c1pz) {
    }

    @Override // X.InterfaceC673031v
    public final void DM9(Integer num) {
    }

    @Override // X.InterfaceC673031v
    public final boolean DMA(C1PZ c1pz) {
        return true;
    }

    @Override // X.InterfaceC673031v
    public final void Dgp() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012c A[LOOP:1: B:9:0x0054->B:27:0x012c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101934i8.A00():void");
    }

    @Override // X.InterfaceC101964iB
    public final List AZa() {
        List list = (List) this.A08.get();
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101954iA
    public final List AaH() {
        List list = (List) this.A07.get();
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Bg4(C41551w4 c41551w4) {
        List list = (List) this.A08.get();
        if (list != null) {
            int indexOf = list.indexOf(c41551w4) - 1;
            if (indexOf < list.size() && indexOf >= 0) {
                return (C41551w4) list.get(indexOf);
            }
            return null;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blt(int i) {
        List list = (List) this.A08.get();
        if (list != null) {
            if (i < list.size() && i >= 0) {
                return (C41551w4) list.get(i);
            }
            return null;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blv(String str) {
        Map map = (Map) this.A09.get();
        if (map != null) {
            return (C41551w4) map.get(str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final int CNP(Reel reel) {
        Object obj;
        List list = (List) this.A08.get();
        if (list != null) {
            Iterator it = AbstractC16960so.A1S(list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((C41551w4) list.get(((Number) obj).intValue())).A0H.getId(), reel.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Number number = (Number) obj;
            if (number != null) {
                return number.intValue();
            }
            return -1;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101944i9
    public final boolean CXI(C41551w4 c41551w4) {
        Object obj;
        List list = (List) this.A08.get();
        if (list != null) {
            int size = list.size();
            if (size > 0) {
                int i = size - 1;
                if (i < list.size() && i >= 0) {
                    obj = list.get(i);
                } else {
                    obj = null;
                }
                if (c41551w4.equals(obj)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC101974iC
    public final void DZa(int i, int i2) {
        if (i2 > i) {
            A00();
        }
    }

    @Override // X.InterfaceC673031v
    public final /* bridge */ /* synthetic */ void D7f(Object obj) {
        A00();
    }
}
