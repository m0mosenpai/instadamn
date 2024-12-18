package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Onm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55661Onm implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C55661Onm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40701ud c40701ud, Object obj, int i) {
        c40701ud.ATV(new C55661Onm(obj, i), interfaceC48192Ji, c1Dk);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C2JL c2jl;
        switch (this.A00) {
            case 0:
                c2jl = ((C51398Mn5) this.A01).A04;
                if (c2jl == null) {
                    C14360o3.A0F("deletionCallback");
                    throw C00O.createAndThrow();
                }
                c2jl.onFailure(th);
                return;
            case 1:
                BrandedContentProjectRepository brandedContentProjectRepository = (BrandedContentProjectRepository) this.A01;
                LL0.A03(brandedContentProjectRepository, brandedContentProjectRepository.A00, C05F.A0c, null, null, null, null, null, th, null);
                brandedContentProjectRepository.A01.Egh(new C51758Mth(null, 1, 9, true));
                return;
            case 2:
            case 6:
            default:
                c2jl = (C2JL) this.A01;
                c2jl.onFailure(th);
                return;
            case 3:
                AbstractC25651Mw.A00((AbstractC12990ll) this.A01).E4s(new C55984OtH(C05F.A0C));
                return;
            case 4:
                ((InterfaceC58044PoU) this.A01).DFf();
                return;
            case 5:
                C54527O7e c54527O7e = (C54527O7e) this.A01;
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A0H = "create_order_send_failure";
                AbstractC25226BEj.A1N(c54527O7e.A00.A01, A0j, 2131956969);
                A0j.A06();
                AbstractC25233BEq.A1F(A0j);
                return;
            case 7:
                AbstractC62502sp abstractC62502sp = (AbstractC62502sp) this.A01;
                C14360o3.A0A(th);
                abstractC62502sp.onFailure(th);
                return;
            case 8:
                AbstractC25225BEi.A1U(this.A01, th);
                return;
            case 9:
                C50576MUh c50576MUh = (C50576MUh) this.A01;
                C05A c05a = c50576MUh.A04;
                do {
                } while (!c05a.AIi(c05a.getValue(), new MU9(th, 0)));
                c50576MUh.A00 = true;
                return;
            case 10:
                C55815OqQ c55815OqQ = (C55815OqQ) this.A01;
                C14360o3.A0A(th);
                C53M A00 = C55815OqQ.A00(c55815OqQ);
                if (A00 != null) {
                    A00.EWZ(false);
                }
                C14360o3.A0B(th, 1);
                C53M A002 = C55815OqQ.A00(c55815OqQ);
                if (A002 == null) {
                    return;
                }
                A002.DGu(false, true, th.getMessage());
                return;
            case 11:
                ((InterfaceC58072Pox) this.A01).DFf();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((InterfaceC58074Poz) this.A01).DFf();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((InterfaceC58073Poy) this.A01).DFf();
                return;
            case 14:
                OWU.A00(((C56810PJc) this.A01).A01, C05F.A0Y);
                return;
        }
    }
}
