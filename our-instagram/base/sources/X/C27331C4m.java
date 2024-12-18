package X;

import android.content.Context;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* renamed from: X.C4m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27331C4m extends AbstractC28375Cfd {
    public static boolean A0B;
    public static final CLB A0C = new Object();
    public C25855BcA A00;
    public C25874BcZ A01;
    public WriteWithAICreationViewModel A02;
    public Integer A03;
    public InterfaceC16660sJ A04;
    public final C28274CdJ A05;
    public final C28353CfD A06;
    public final C28483Chb A07;
    public final C27978CVa A08;
    public final InterfaceC09390do A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27331C4m(Context context, FoaUserSession foaUserSession, C27978CVa c27978CVa, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, foaUserSession);
        C14360o3.A0B(foaUserSession, 2);
        this.A08 = c27978CVa;
        this.A04 = interfaceC16660sJ;
        this.A03 = C05F.A0C;
        C28280CdP c28280CdP = c27978CVa.A01;
        this.A06 = new C28353CfD(foaUserSession, c28280CdP);
        this.A07 = new C28483Chb(c28280CdP);
        this.A05 = AbstractC86593tX.A0B("IMPLEMENTATION").A00;
        this.A0A = AbstractC86593tX.A0B("IMPLEMENTATION").A04;
        this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, DH2.A01(context, foaUserSession, this, 28));
    }

    public static final C28371CfX A00(C27331C4m c27331C4m) {
        return new C28371CfX(new CdsBottomSheetDimmingBehaviour.FixedAlpha(0.5f), U6H.A0B, c27331C4m.A03, C05F.A01, C29905DGt.A01(c27331C4m, 35), 48, true);
    }

    public static final String A01(C27331C4m c27331C4m) {
        C27339C4u c27339C4u;
        String str;
        WriteWithAICreationViewModel writeWithAICreationViewModel = c27331C4m.A02;
        if (writeWithAICreationViewModel == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        CAU cau = ((CWJ) writeWithAICreationViewModel.A0D.getValue()).A01;
        if (!(cau instanceof C27339C4u) || (c27339C4u = (C27339C4u) cau) == null || (str = c27339C4u.A00) == null) {
            return "";
        }
        return str;
    }

    public static final String A02(C27331C4m c27331C4m) {
        C27339C4u c27339C4u;
        String str;
        WriteWithAICreationViewModel writeWithAICreationViewModel = c27331C4m.A02;
        if (writeWithAICreationViewModel == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        CAU cau = ((CWJ) writeWithAICreationViewModel.A0D.getValue()).A01;
        if (!(cau instanceof C27339C4u) || (c27339C4u = (C27339C4u) cau) == null || (str = c27339C4u.A01) == null) {
            return "";
        }
        return str;
    }
}
