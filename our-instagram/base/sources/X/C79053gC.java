package X;

import com.facebook.litho.BaseMountingView;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;

/* renamed from: X.3gC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79053gC extends C2X7 implements C2X8 {
    @Override // X.C2X8
    public final void ADI(RenderTreeNode renderTreeNode, C79073gE c79073gE, int i) {
    }

    @Override // X.C2X8
    public final void CzR(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void D0L(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2, boolean z) {
    }

    @Override // X.C2X8
    public final void DTt(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void Dw7(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final boolean Ek6(C2WC c2wc, C2WC c2wc2, C79073gE c79073gE, Object obj, Object obj2) {
        return false;
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return null;
    }

    @Override // X.C2X8
    public final void Dwh(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        if (obj instanceof C2X1) {
            ArrayList arrayList = new ArrayList();
            ((C2X1) obj).Ctl(arrayList);
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                Object obj3 = arrayList.get(size);
                C14360o3.A07(obj3);
                ((BaseMountingView) obj3).A0X();
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }
}
