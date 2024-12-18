package X;

import com.facebook.cvat.ctsmartcreation.common.CTRangeD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PTv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57082PTv implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ InterfaceC57792PkJ A04;
    public final /* synthetic */ C50866Mdx A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ InterfaceC16620sF A07;

    public RunnableC57082PTv(InterfaceC57792PkJ interfaceC57792PkJ, C50866Mdx c50866Mdx, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, float f, int i, int i2, int i3) {
        this.A04 = interfaceC57792PkJ;
        this.A06 = interfaceC16660sJ;
        this.A01 = i;
        this.A05 = c50866Mdx;
        this.A07 = interfaceC16620sF;
        this.A00 = f;
        this.A03 = i2;
        this.A02 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ;
        int i;
        Zbh zbh = this.A04;
        if (zbh != null) {
            InterfaceC16620sF interfaceC16620sF = this.A07;
            i = this.A01;
            interfaceC16660sJ = this.A06;
            float f = this.A00;
            int i2 = this.A03;
            int i3 = this.A02;
            List<CTRangeD> A00 = zbh.A00();
            ArrayList A0q = AbstractC167017dG.A0q(A00);
            for (CTRangeD cTRangeD : A00) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Integer valueOf = Integer.valueOf((int) timeUnit.convert(C1H4.A02(cTRangeD.start * 1000.0d), timeUnit));
                Integer valueOf2 = Integer.valueOf((int) timeUnit.convert(C1H4.A02(cTRangeD.end * 1000.0d), timeUnit));
                AbstractC166997dE.A1R(Integer.valueOf(C17s.A03((int) Math.ceil(valueOf.floatValue() / f), i2, i3)), Integer.valueOf(C17s.A03((int) Math.ceil(valueOf2.floatValue() / f), i2, i3)), A0q);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0q.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C09530e4 c09530e4 = (C09530e4) next;
                Number number = (Number) c09530e4.A01;
                int intValue = number.intValue();
                Number number2 = (Number) c09530e4.A00;
                if (intValue - number2.intValue() > 100 && (number2.intValue() != i2 || number.intValue() != i3)) {
                    A1E.add(next);
                }
            }
            if (AbstractC25226BEj.A1b(A1E)) {
                interfaceC16620sF.invoke(Integer.valueOf(i), A1E);
                this.A05.A00 = null;
            }
        } else {
            interfaceC16660sJ = this.A06;
            i = this.A01;
        }
        AbstractC43592JPx.A19(i, interfaceC16660sJ);
        this.A05.A00 = null;
    }
}
