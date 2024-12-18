package com.instagram.common.uigraph;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC23641Du;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C05F;
import X.C09530e4;
import X.C0f6;
import X.C10M;
import X.C12L;
import X.C14120nc;
import X.C14360o3;
import X.C16930sl;
import X.C19K;
import X.C19L;
import X.C206209Bd;
import X.C206639Cu;
import X.C27086BxB;
import X.C3AW;
import X.C3ZE;
import X.C42411xV;
import X.C42681xw;
import X.C50525MSe;
import X.C5H0;
import X.C93124Fo;
import X.C93144Fq;
import X.C9D3;
import X.C9E0;
import X.C9G2;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC101954iA;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC42441xY;
import X.InterfaceC42451xZ;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class UiGraph implements InterfaceC42441xY, InterfaceC42451xZ {
    public C42411xV A00;
    public C42411xV A01;
    public final C50525MSe A02;
    public final C0f6 A03;
    public final Map A04;
    public final InterfaceC09390do A05;
    public final InterfaceC16660sJ A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC06180Ui A09;
    public final InterfaceC06180Ui A0A;
    public final C19L A0B;

    public UiGraph(C50525MSe c50525MSe, C0f6 c0f6, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        C14360o3.A0B(interfaceC16660sJ2, 2);
        C14360o3.A0B(interfaceC16660sJ3, 3);
        C14360o3.A0B(c0f6, 5);
        this.A07 = interfaceC16660sJ;
        this.A06 = interfaceC16660sJ2;
        this.A08 = interfaceC16660sJ3;
        this.A02 = c50525MSe;
        this.A03 = c0f6;
        Integer num = C05F.A00;
        this.A0A = C10M.A00(num, 0, 0);
        this.A09 = C10M.A00(C05F.A01, 50, 0);
        this.A05 = AbstractC09440dt.A01(new C9E0(this, 20));
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(936667133, 1));
        this.A0B = A02;
        if (c50525MSe.A02) {
            AbstractC23641Du.A03(num, AnonymousClass191.A00, new C206639Cu(this, null, 14), A02);
        }
        synchronized (C42681xw.class) {
        }
        this.A04 = new LinkedHashMap();
    }

    public final C93144Fq A02(C3AW c3aw, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C27086BxB c27086BxB;
        List list;
        C14360o3.A0B(str, 0);
        C3ZE c3ze = (C3ZE) this.A04.get(str);
        if (c3ze != null) {
            C50525MSe c50525MSe = c3ze.A00;
            C0f6 c0f6 = c3ze.A01;
            C5H0 c5h0 = c3ze.A02;
            if (c5h0 != null) {
                InterfaceC101954iA interfaceC101954iA = (InterfaceC101954iA) c5h0.A01.get();
                if (interfaceC101954iA != null) {
                    list = interfaceC101954iA.AaH();
                } else {
                    list = C16930sl.A00;
                }
                c27086BxB = new C27086BxB(list);
            } else {
                c27086BxB = null;
            }
            C206209Bd c206209Bd = new C206209Bd(c50525MSe, c0f6, c27086BxB);
            Iterable BWV = c3ze.A03.BWV(c206209Bd, null, 0);
            if (!AbstractC001800i.A0t(BWV)) {
                List list2 = c3ze.A04;
                synchronized (list2) {
                    if ((!list2.isEmpty()) && (!((Collection) list2.get(0)).isEmpty())) {
                        BWV = Collections.singletonList(new C09530e4(((List) list2.get(0)).get(0), 1));
                        C14360o3.A07(BWV);
                    } else {
                        BWV = C16930sl.A00;
                    }
                }
            }
            return new C93144Fq(c206209Bd, c5h0, new C93124Fo(), c3aw, BWV, interfaceC16660sJ);
        }
        return null;
    }

    @Override // X.InterfaceC42441xY
    public final void DLO(Object obj, String str) {
        C14360o3.A0B(str, 1);
        A01(new C9G2(this, obj, str, 9));
    }

    @Override // X.InterfaceC42441xY
    public final void DLQ(Object obj, String str) {
        C14360o3.A0B(str, 1);
        A01(new C9G2(this, obj, str, 10));
    }

    public static final void A00(UiGraph uiGraph, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C50525MSe c50525MSe = uiGraph.A02;
        if (c50525MSe.A01 && (c50525MSe.A02 || !z)) {
            uiGraph.A01(interfaceC16820sZ);
        } else {
            interfaceC16820sZ.invoke();
        }
    }

    private final void A01(final InterfaceC16820sZ interfaceC16820sZ) {
        if (this.A02.A02) {
            C19L c19l = this.A0B;
            C9D3 c9d3 = new C9D3(this, interfaceC16820sZ, (InterfaceC23621Ds) null, 26);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
            return;
        }
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3Qa
            {
                super(936667133, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC16820sZ.this.invoke();
            }
        });
    }

    @Override // X.InterfaceC42451xZ
    public final void Dyz(Object obj, String str) {
        A01(new C9G2(this, obj, str, 11));
    }

    @Override // X.InterfaceC42451xZ
    public final void Dz2(Object obj, String str) {
        A01(new C9G2(this, obj, str, 12));
    }
}
