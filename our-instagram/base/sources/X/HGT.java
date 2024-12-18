package X;

import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HGT extends C1P1 {
    public C6WQ A00;
    public final C1P1 A01;
    public final C38321qM A02;
    public final boolean A03 = true;
    public final /* synthetic */ C41138IJd A04;

    public HGT(C1P1 c1p1, C38321qM c38321qM, C41138IJd c41138IJd) {
        this.A04 = c41138IJd;
        this.A01 = c1p1;
        this.A02 = c38321qM;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Object A00;
        int A03 = C0f9.A03(-1003183454);
        C9GR.A0E(this.A04.A00.requireContext(), AbstractC111324zv.A00(1224));
        C1P1 c1p1 = this.A01;
        if (c1p1 != null && (A00 = abstractC115105If.A00()) != null) {
            c1p1.onFail(new C115115Ig(A00));
        }
        C0f9.A0A(-1582258687, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1005499666);
        C6WQ c6wq = this.A00;
        if (c6wq != null) {
            c6wq.hide();
        }
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onFinish();
        }
        C0f9.A0A(422988433, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(798968843);
        Context requireContext = this.A04.A00.requireContext();
        C6WQ c6wq = new C6WQ(requireContext);
        this.A00 = c6wq;
        c6wq.A00(requireContext.getString(2131972339));
        C0fJ.A00(this.A00);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onStart();
        }
        C0f9.A0A(1900112987, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object A00;
        String str;
        User BSW;
        int A03 = C0f9.A03(-490503288);
        int A032 = C0f9.A03(-2025112368);
        super.onSuccess(obj);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C38321qM c38321qM = this.A02;
        C41138IJd c41138IJd = this.A04;
        UserSession userSession = c41138IJd.A03;
        C08730cb c08730cb = C17060sy.A01;
        c38321qM.A47(userSession, c08730cb.A01(userSession));
        if (this.A03) {
            User A01 = c08730cb.A01(userSession);
            InterfaceC111164zd BhM = c38321qM.A0C.BhM();
            if (BhM != 0) {
                InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                BhM.CIr();
                List CIr = BhM.CIr();
                ArrayList<ProductTagDictIntf> arrayList = null;
                if (CIr != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj2 : CIr) {
                        ProductDetailsProductItemDictIntf Bgl = ((ProductTagDictIntf) obj2).Bgl();
                        if (Bgl != null && (BSW = Bgl.BSW()) != null) {
                            str = AbstractC76433bn.A00(BSW);
                        } else {
                            str = null;
                        }
                        AbstractC25232BEp.A1Q(str, A01.getId(), obj2, A1E);
                    }
                    arrayList = A1E;
                }
                ArrayList arrayList2 = null;
                AbstractC37302Gc3.A0n();
                if (BhM instanceof HP0) {
                    if (arrayList != null) {
                        arrayList2 = AbstractC166987dD.A1E();
                        for (ProductTagDictIntf productTagDictIntf : arrayList) {
                            if (productTagDictIntf != null) {
                                arrayList2.add(productTagDictIntf.F7o());
                            }
                        }
                    }
                    TreeJNI treeJNI = (TreeJNI) BhM;
                    A00 = AbstractC25234BEr.A0P(treeJNI, AbstractC167007dF.A0n("in", arrayList2)).applyToTree(treeJNI);
                    C14360o3.A07(A00);
                } else {
                    A00 = HnD.A00(arrayList);
                }
                interfaceC38831rF.Ebd((InterfaceC111164zd) A00);
            }
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(c41138IJd.A00.requireContext(), A0K, 2131972182);
            AbstractC25233BEq.A1F(A0K);
        }
        C37091o7.A00().Cor(c41138IJd.A00.requireContext(), c41138IJd.A02, userSession, EnumC39589Hdz.A0R, 1);
        c38321qM.AEH(userSession);
        C0f9.A0A(-259545970, A032);
        C0f9.A0A(634746545, A03);
    }
}
