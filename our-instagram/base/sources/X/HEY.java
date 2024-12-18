package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEY extends C2US {
    public final InterfaceC09390do A00;
    public final HFS A01;
    public final HF1 A02;
    public final C42882Ixw A03;
    public final C152996uT A04;
    public final C38U A05;
    public final InterfaceC62602sz A06;
    public final C65842yM A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HEY(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38N c38n, C42882Ixw c42882Ixw, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC25233BEq.A0x(2, userSession, c38u, interfaceC62602sz);
        C14360o3.A0B(c42882Ixw, 6);
        this.A05 = c38u;
        this.A06 = interfaceC62602sz;
        this.A03 = c42882Ixw;
        C152996uT c152996uT = new C152996uT(context);
        this.A04 = c152996uT;
        C65842yM c65842yM = new C65842yM(context);
        this.A07 = c65842yM;
        HFS hfs = new HFS(interfaceC60442pS, userSession, null, c38n);
        this.A01 = hfs;
        HF1 hf1 = new HF1(userSession, interfaceC60442pS);
        this.A02 = hf1;
        this.A00 = AbstractC09440dt.A01(new C57252Pba(39, interfaceC60442pS, userSession));
        init(c152996uT, c65842yM, hfs, hf1);
    }

    public static void A00(HCV hcv) {
        ((HEY) hcv.A06.getValue()).A01();
    }

    public final void A02(List list) {
        InterfaceC09390do interfaceC09390do = this.A00;
        C42748Ivm c42748Ivm = (C42748Ivm) interfaceC09390do.getValue();
        c42748Ivm.A04.clear();
        c42748Ivm.A05.clear();
        InterfaceC61752rc interfaceC61752rc = c42748Ivm.A00;
        if (interfaceC61752rc != null) {
            interfaceC61752rc.DNz();
        }
        ((C42748Ivm) interfaceC09390do.getValue()).A03(list);
        ((C42748Ivm) interfaceC09390do.getValue()).A02();
        A01();
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(((C42748Ivm) this.A00.getValue()).A01.size());
    }

    public final void A01() {
        clear();
        if (!isEmpty()) {
            for (Object obj : ((C42748Ivm) this.A00.getValue()).A01) {
                if (obj instanceof C38321qM) {
                    addModel(obj, new C41129IIu(0, 0, 0, AbstractC76283bY.A00((C38321qM) obj), true), this.A01);
                }
            }
        } else {
            C42882Ixw c42882Ixw = this.A03;
            addModel(c42882Ixw.Afz(), c42882Ixw.A00, this.A04);
        }
        InterfaceC62602sz interfaceC62602sz = this.A06;
        if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG()) {
            addModel(interfaceC62602sz, this.A07);
        }
        notifyDataSetChangedSmart();
    }
}
