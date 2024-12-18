package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77313dH {
    public static final void A00(C76223bS c76223bS, final InterfaceC16820sZ interfaceC16820sZ, final Object[] objArr) {
        C14360o3.A0B(objArr, 1);
        List list = c76223bS.A04;
        if (list == null) {
            list = new ArrayList();
        }
        c76223bS.A04 = list;
        final String A0G = AnonymousClass001.A0G(c76223bS.A05.A08(), ':', list.size());
        list.add(new C2Wo(A0G, interfaceC16820sZ, objArr) { // from class: X.3dI
            public C79353gg A00;
            public boolean A01;
            public final String A02;
            public final InterfaceC16820sZ A03;
            public final Object[] A04;

            {
                C14360o3.A0B(A0G, 1);
                this.A04 = objArr;
                this.A03 = interfaceC16820sZ;
                this.A02 = A0G;
            }

            @Override // X.C2Wo
            public final boolean Ek0(C2Wo c2Wo) {
                C14360o3.A0B(c2Wo, 0);
                return !AbstractC78713fd.A02(this.A04, ((C77323dI) c2Wo).A04);
            }

            @Override // X.C2Wo
            public final boolean FDM() {
                return false;
            }

            @Override // X.C2Wo
            public final void ACu() {
                if (!this.A01) {
                    this.A00 = (C79353gg) this.A03.invoke();
                    this.A01 = true;
                    return;
                }
                throw new IllegalStateException("Attach should only be called when detached!");
            }

            @Override // X.C2Wo
            public final String CCd() {
                return this.A02;
            }

            @Override // X.C2Wo
            public final void detach() {
                if (this.A01) {
                    C79353gg c79353gg = this.A00;
                    if (c79353gg != null) {
                        c79353gg.A00.invoke();
                    }
                    this.A01 = false;
                    return;
                }
                throw new IllegalStateException("Detach should only be called when attached!");
            }
        });
    }
}
