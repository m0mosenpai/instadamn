package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

/* renamed from: X.PJz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56829PJz implements InterfaceC31002Dk1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56829PJz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC31002Dk1
    public final void onFailure(Throwable th) {
        if (1 - this.A00 == 0) {
            AbstractC166987dD.A1Y(this.A01);
        }
    }

    @Override // X.InterfaceC31002Dk1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC53765NqH.A00((Context) this.A01, C6BQ.A06((C6FQ) this.A02), true);
                return;
            case 1:
                OM3 om3 = (OM3) obj;
                C14360o3.A0B(om3, 0);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                String str = om3.A03;
                C09530e4 A1L = AbstractC166987dD.A1L(TraceFieldType.RequestID, om3.A01);
                C09530e4 A1L2 = AbstractC166987dD.A1L("response_id", om3.A02);
                C09530e4 A1L3 = AbstractC166987dD.A1L("bottomsheet_session_id", om3.A00);
                String str2 = om3.A04;
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC16620sF.invoke(str, AbstractC167017dG.A0u("user_interactions_id", str2, A1L, A1L2, A1L3));
                return;
            default:
                OLN oln = (OLN) obj;
                C14360o3.A0B(oln, 0);
                List list = oln.A00;
                if (!list.isEmpty()) {
                    C8XE c8xe = (C8XE) AbstractC001800i.A0I(list);
                    C52692NTd c52692NTd = (C52692NTd) this.A02;
                    String str3 = c8xe.A05;
                    c52692NTd.A04 = str3;
                    C55177Odh c55177Odh = c52692NTd.A0H;
                    C88X c88x = (C88X) this.A01;
                    c55177Odh.A03(new C56705PEx(c88x, str3, false));
                    c52692NTd.A01 = c88x;
                    return;
                }
                return;
        }
    }
}
