package X;

import com.instagram.arlink.ui.GridPatternView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.LRk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48110LRk implements InterfaceC50414MNq {
    public final /* synthetic */ GridPatternView A00;

    public C48110LRk(GridPatternView gridPatternView) {
        this.A00 = gridPatternView;
    }

    @Override // X.InterfaceC50414MNq
    public final void DJ9(C65888Tvs c65888Tvs) {
        GridPatternView gridPatternView = this.A00;
        int i = -16777216;
        if (c65888Tvs != null) {
            ArrayList A1F = AbstractC166987dD.A1F(Collections.unmodifiableList(c65888Tvs.A02));
            Collections.sort(A1F, new JUD(3));
            Iterator it = A1F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C65890Tvu c65890Tvu = (C65890Tvu) it.next();
                float[] A01 = c65890Tvu.A01();
                float f = A01[2];
                if (f < 0.4f) {
                    i = c65890Tvu.A05;
                    break;
                } else if (f < 0.5f) {
                    A01[2] = 0.4f;
                    i = AbstractC56842jH.A07(A01);
                    break;
                }
            }
        }
        Integer valueOf = Integer.valueOf(i);
        gridPatternView.A03 = valueOf;
        InterfaceC50394MMw interfaceC50394MMw = gridPatternView.A02;
        if (interfaceC50394MMw != null) {
            int intValue = valueOf.intValue();
            KFE kfe = (KFE) interfaceC50394MMw;
            kfe.A01 = intValue;
            if (kfe.A0N.isResumed() && kfe.A03 == EnumC46213Kcp.A08) {
                kfe.A0Q.setTintColor(intValue);
            }
        }
    }
}
