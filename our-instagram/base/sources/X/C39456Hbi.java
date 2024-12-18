package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.Hbi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39456Hbi extends PJX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C39456Hbi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        switch (this.A00) {
            case 1:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A03;
                if (onDismissListener == null) {
                    return;
                }
                onDismissListener.onDismiss((DialogInterface) this.A01);
                return;
            case 2:
                C37605Gh0 c37605Gh0 = (C37605Gh0) this.A02;
                if (C18U.A06(C06090Tz.A05, c37605Gh0.A07, 36330179169305319L) && "report_button".equals("hide_button")) {
                    C37605Gh0.A0I(c37605Gh0, "report_button", null);
                }
                c37605Gh0.A0A.Cvx();
                return;
            default:
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        switch (this.A00) {
            case 0:
                ((C05A) this.A01).Egh(new C9BK(new H76("showReportCommentBottomSheet_request_error")));
                return;
            case 1:
            default:
                return;
            case 2:
                C37605Gh0.A0I((C37605Gh0) this.A02, "report_button", null);
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        if (2 - this.A00 == 0) {
            C37605Gh0.A08((C75113Zb) this.A03, (C37605Gh0) this.A02, "report_button", str);
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        EnumC75193Zm enumC75193Zm;
        switch (this.A00) {
            case 0:
                MediaCommentListRepository mediaCommentListRepository = ((C28355CfF) this.A03).A01;
                C51760Mtj c51760Mtj = (C51760Mtj) this.A02;
                mediaCommentListRepository.A0S((java.util.Set) c51760Mtj.A01, (java.util.Set) c51760Mtj.A02);
                if (C1VN.A00 == null) {
                    return;
                }
                ((C05A) this.A01).Egh(new C206339Bq("2533754420104857", 2));
                return;
            case 1:
                if ("ig_false_news".equals(str)) {
                    enumC75193Zm = EnumC75193Zm.A0H;
                } else {
                    enumC75193Zm = EnumC75193Zm.A0G;
                }
                ((InterfaceC43428JGs) this.A02).DKc(enumC75193Zm);
                return;
            default:
                C37605Gh0 c37605Gh0 = (C37605Gh0) this.A02;
                C37605Gh0.A08((C75113Zb) this.A03, c37605Gh0, "report_button", AbstractC41569IaI.A00(c37605Gh0.A07, str, AbstractC167007dF.A1X(this.A01, EnumC39619HeT.A05)));
                return;
        }
    }
}
