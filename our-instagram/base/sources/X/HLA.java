package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HLA extends AbstractC154286wd {
    public final boolean A00;
    public final /* synthetic */ C38934HCh A01;

    public HLA(C38934HCh c38934HCh, boolean z) {
        this.A01 = c38934HCh;
        this.A00 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-642477963);
        C65823Tug c65823Tug = this.A01.A03;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        c65823Tug.A0E.update();
        C0f9.A0A(1238276166, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1073867104);
        C65823Tug c65823Tug = this.A01.A03;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        C65823Tug.A00(c65823Tug, false, true);
        C0f9.A0A(1843614354, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(252785477, C0f9.A03(-1884007041));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A03 = C0f9.A03(-1166330792);
        HBB hbb = (HBB) obj;
        int A0N = AbstractC167017dG.A0N(hbb, 59287692);
        List list2 = hbb.A04;
        C38934HCh c38934HCh = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(c38934HCh.A0M);
        C14360o3.A0B(A0r, 1);
        if (list2 != null && !list2.isEmpty()) {
            list = C127895qI.A06(A0r, null, list2);
        } else {
            list = C16930sl.A00;
        }
        C51755Mte c51755Mte = hbb.A00;
        boolean z = this.A00;
        C38934HCh.A00(c51755Mte, c38934HCh, list, z);
        if (z) {
            C65823Tug c65823Tug = c38934HCh.A03;
            if (c65823Tug == null) {
                AbstractC37300Gc1.A0a();
                throw C00O.createAndThrow();
            }
            c65823Tug.A02();
            c38934HCh.A0D = hbb.A03;
            if (hbb.A01 != EnumC127875qG.A05 && c38934HCh.mView != null) {
                C11T.A02(new J3S(c38934HCh));
            }
        }
        C0f9.A0A(1623775515, A0N);
        C0f9.A0A(1802979657, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-203896358);
        C0f9.A0A(1527082455, C0f9.A03(869803717));
        C0f9.A0A(2051791710, A03);
    }
}
