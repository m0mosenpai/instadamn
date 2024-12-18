package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.uigraph.UiGraph;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CtB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29144CtB implements InterfaceC25751Nh {
    public final Map A00;
    public final UiGraph A01;

    public C29144CtB(UiGraph uiGraph) {
        C14360o3.A0B(uiGraph, 1);
        this.A01 = uiGraph;
        this.A00 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC25751Nh
    public final void A7h(C59562nz c59562nz) {
        C14360o3.A0B(c59562nz, 0);
        this.A00.put(((ImageCacheKey) c59562nz.A0L.AjX()).A03, c59562nz);
    }

    @Override // X.InterfaceC25751Nh
    public final void AHX(C27819COi c27819COi) {
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            c27819COi.A00.A0P.remove(((ImageCacheKey) ((C59562nz) AbstractC166987dD.A1K(A15).getValue()).A0L.AjX()).A03);
        }
        map.clear();
    }

    @Override // X.InterfaceC25751Nh
    public final C59562nz BE1() {
        String str;
        UiGraph uiGraph = this.A01;
        C3AW c3aw = new C3AW(null, null);
        C30185DRq A02 = C30185DRq.A02(this, 23);
        String str2 = C26771Rh.A00().A00;
        C14360o3.A07(str2);
        C93144Fq A022 = uiGraph.A02(c3aw, str2, A02);
        boolean z = true;
        if (A022 == null || !A022.hasNext()) {
            z = false;
        }
        Object obj = null;
        if (z) {
            Map map = this.A00;
            InterfaceC59502nt interfaceC59502nt = ((C43121yf) C93144Fq.A00(A022, false).A00).A01.A00;
            if (interfaceC59502nt != null) {
                str = interfaceC59502nt.AjY();
            } else {
                str = null;
            }
            C59562nz c59562nz = (C59562nz) map.get(str);
            if (c59562nz == null) {
                Iterator A16 = AbstractC166997dE.A16(map);
                if (A16.hasNext()) {
                    obj = A16.next();
                    if (A16.hasNext()) {
                        int A0C = ((C59562nz) obj).A0C();
                        do {
                            Object next = A16.next();
                            int A0C2 = ((C59562nz) next).A0C();
                            if (A0C < A0C2) {
                                obj = next;
                                A0C = A0C2;
                            }
                        } while (A16.hasNext());
                    }
                }
            } else {
                return c59562nz;
            }
        } else {
            Iterator A162 = AbstractC166997dE.A16(this.A00);
            if (A162.hasNext()) {
                obj = A162.next();
                if (A162.hasNext()) {
                    int A0C3 = ((C59562nz) obj).A0C();
                    do {
                        Object next2 = A162.next();
                        int A0C4 = ((C59562nz) next2).A0C();
                        if (A0C3 < A0C4) {
                            obj = next2;
                            A0C3 = A0C4;
                        }
                    } while (A162.hasNext());
                }
            }
        }
        return (C59562nz) obj;
    }

    @Override // X.InterfaceC25751Nh
    public final boolean EEl(C59562nz c59562nz) {
        return AbstractC167007dF.A1W(this.A00.remove(((ImageCacheKey) c59562nz.A0L.AjX()).A03));
    }

    @Override // X.InterfaceC25751Nh
    public final void F8D(InterfaceC25751Nh interfaceC25751Nh) {
        Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                interfaceC25751Nh.A7h((C59562nz) A16.next());
            }
        }
    }

    @Override // X.InterfaceC25751Nh
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }
}
