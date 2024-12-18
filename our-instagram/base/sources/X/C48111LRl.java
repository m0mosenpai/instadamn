package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.LRl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48111LRl implements InterfaceC50414MNq {
    public final /* synthetic */ KFE A00;
    public final /* synthetic */ C47955LGq A01;

    public C48111LRl(KFE kfe, C47955LGq c47955LGq) {
        this.A01 = c47955LGq;
        this.A00 = kfe;
    }

    @Override // X.InterfaceC50414MNq
    public final void DJ9(C65888Tvs c65888Tvs) {
        C47955LGq c47955LGq = this.A01;
        int i = -16777216;
        if (c65888Tvs != null) {
            ArrayList A1F = AbstractC166987dD.A1F(Collections.unmodifiableList(c65888Tvs.A02));
            C01T.A1D(A1F, M7Z.A00);
            Iterator it = A1F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C65890Tvu c65890Tvu = (C65890Tvu) it.next();
                float[] A01 = c65890Tvu.A01();
                C14360o3.A07(A01);
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
        c47955LGq.A02 = valueOf;
        KFE kfe = this.A00;
        if (kfe != null) {
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if (kfe.A0N.isResumed() && kfe.A03 == EnumC46213Kcp.A09) {
                    kfe.A0Q.setTintColor(intValue);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
