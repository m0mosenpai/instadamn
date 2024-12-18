package X;

import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.uigraph.UiGraph;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9G6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G6 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G6(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                List singletonList = Collections.singletonList(this.A03);
                C14360o3.A07(singletonList);
                new RunnableC1120553u((C49142Nl) this.A01, new C1120453t((C2L1) this.A02, C05F.A01, this.A04, singletonList, null)).run();
                return C0eB.A00;
            case 1:
                UiGraph uiGraph = (UiGraph) this.A03;
                Map map = uiGraph.A04;
                String str = this.A04;
                if (map.containsKey(str)) {
                    UiGraph.A00(uiGraph, new C207429Fv(str, uiGraph, 23), true);
                } else {
                    C3ZE c3ze = new C3ZE(uiGraph.A02, uiGraph.A03, (InterfaceC16660sJ) this.A02);
                    synchronized (map) {
                        map.put(str, c3ze);
                    }
                    uiGraph.A09.F8m(str);
                }
                Object obj = this.A01;
                C14360o3.A0B(obj, 1);
                UiGraph.A00(uiGraph, new C9G2(uiGraph, obj, str, 8), true);
                return C0eB.A00;
            case 2:
                List BQP = ((C3W0) this.A01).BQP();
                if (BQP != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = BQP.iterator();
                    while (it.hasNext()) {
                        List Boc = ((InterfaceC74423Vy) it.next()).Boc();
                        if (Boc == null) {
                            Boc = C16930sl.A00;
                        }
                        AnonymousClass016.A16(Boc, arrayList);
                    }
                    C14510oO c14510oO = (C14510oO) this.A02;
                    C1CJ c1cj = (C1CJ) this.A03;
                    String str2 = this.A04;
                    int i = 0;
                    for (Object obj2 : arrayList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            InterfaceC74403Vw interfaceC74403Vw = (InterfaceC74403Vw) obj2;
                            ExtendedImageUrl BGU = interfaceC74403Vw.BGU();
                            if (BGU != null) {
                                boolean z = false;
                                if (i == 0) {
                                    z = true;
                                }
                                c14510oO.A00 = C1CJ.A00(BGU, c1cj, str2, null, z);
                            }
                            C38321qM CEv = interfaceC74403Vw.CEv();
                            if (CEv != null) {
                                c14510oO.A00 = C1CJ.A01(CEv, c1cj, str2, i);
                            }
                            i = i2;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                return C0eB.A00;
            default:
                C3W0 c3w0 = (C3W0) this.A01;
                List BGh = c3w0.BGh();
                int i3 = 0;
                if (BGh != null) {
                    C14510oO c14510oO2 = (C14510oO) this.A02;
                    C1CJ c1cj2 = (C1CJ) this.A03;
                    String str3 = this.A04;
                    int i4 = 0;
                    for (Object obj3 : BGh) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            ImageUrlBase imageUrlBase = (ImageUrlBase) obj3;
                            boolean z2 = false;
                            if (i4 == 0) {
                                z2 = true;
                            }
                            c14510oO2.A00 = C1CJ.A00(imageUrlBase, c1cj2, str3, null, z2);
                            i4 = i5;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                List CF9 = c3w0.CF9();
                if (CF9 != null) {
                    C14510oO c14510oO3 = (C14510oO) this.A02;
                    C1CJ c1cj3 = (C1CJ) this.A03;
                    String str4 = this.A04;
                    for (Object obj4 : CF9) {
                        int i6 = i3 + 1;
                        if (i3 >= 0) {
                            c14510oO3.A00 = C1CJ.A01((C38321qM) obj4, c1cj3, str4, i3);
                            i3 = i6;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                return C0eB.A00;
        }
    }
}
