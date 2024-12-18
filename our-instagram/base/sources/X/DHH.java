package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class DHH extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHH(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object invoke;
        String str;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                Object tag = AbstractC25228BEl.A0R(obj).getTag();
                C14360o3.A0C(tag, AbstractC43591JPw.A00(46));
                C143556du c143556du = (C143556du) tag;
                C145996hw c145996hw = (C145996hw) this.A01;
                InterfaceC1118853a interfaceC1118853a = c145996hw.A01;
                C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
                if (c41551w4 != null) {
                    if (C14360o3.A0K(c143556du.A09, c41551w4) && !c41551w4.A0E(c145996hw.A00)) {
                        C41181vS AuU = interfaceC1118853a.AuU();
                        if (AuU != null) {
                            C38321qM c38321qM = AuU.A0b;
                            if (c38321qM != null) {
                                List C2L = c38321qM.A0C.C2L();
                                C14360o3.A0C(C2L, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.api.schemas.StoryStorefrontTappableObject>");
                                C15500q5.A02(C2L).clear();
                                C6ZG.A00(AuU, c143556du.A1S);
                                break;
                            } else {
                                throw AbstractC166987dD.A12("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                break;
            case 1:
                InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) obj;
                C14360o3.A0B(interfaceC38901rP, 0);
                String pk = interfaceC38901rP.getPk();
                C84923qg c84923qg = ((C38266GsB) this.A01).A02;
                if (c84923qg != null) {
                    str = c84923qg.A0G;
                } else {
                    str = null;
                }
                return Boolean.valueOf(C14360o3.A0K(pk, str));
            case 2:
                C14360o3.A0B(obj, 0);
                ((AbstractCollection) this.A01).add(obj);
                break;
            case 3:
                C0eP c0eP = (C0eP) obj;
                C14360o3.A0B(c0eP, 0);
                return ((InterfaceC16620sF) this.A01).invoke(Integer.valueOf(c0eP.A00), c0eP.A01);
            case 4:
                AbstractC25225BEi.A1U(this.A01, obj);
                return obj;
            case 5:
                return ((C117325Sr) this.A01).A09(AbstractC166987dD.A0H(obj));
            case 6:
                return Boolean.valueOf(((Collection) this.A01).contains(obj));
            case 7:
                ((Future) this.A01).cancel(false);
                break;
            case 8:
                ((SKc) this.A01).A00();
                break;
            case 9:
                C14360o3.A0B(obj, 0);
                return new C30713DfB(33, obj, this.A01);
            case 10:
                List list = (List) this.A01;
                if (!list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        obj = ((InterfaceC16660sJ) listIterator.previous()).invoke(obj);
                    }
                    return obj;
                }
                return obj;
            case 11:
                C14360o3.A0B(obj, 0);
                return DRY.A00(obj, this.A01, 48);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(obj, 0);
                PVr pVr = (PVr) this.A01;
                synchronized (pVr.A01) {
                    invoke = pVr.A03.AyR().invoke(obj);
                }
                return invoke;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(obj, 0);
                PVr pVr2 = (PVr) this.A01;
                synchronized (pVr2.A01) {
                    pVr2.A03.Bmz().invoke(obj);
                    break;
                }
            default:
                C14360o3.A0B(obj, 0);
                PVr pVr3 = (PVr) this.A01;
                synchronized (pVr3.A01) {
                    interfaceC16820sZ = (InterfaceC16820sZ) pVr3.A03.C3O().invoke(obj);
                }
                return interfaceC16820sZ;
        }
        return C0eB.A00;
    }
}
