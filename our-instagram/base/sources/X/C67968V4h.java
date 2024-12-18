package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.V4h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67968V4h extends AbstractC60592pi {
    public FragmentActivity A00;
    public FRW A01;
    public PromoteData A02;
    public W6E A03;
    public PromoteState A04;
    public final C70399WUb A05;
    public final XDH A06;

    /* JADX WARN: Multi-variable type inference failed */
    public C67968V4h(XDH xdh) {
        C14360o3.A0B(xdh, 1);
        this.A06 = xdh;
        FragmentActivity requireActivity = xdh.requireActivity();
        this.A00 = requireActivity;
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(13));
        this.A02 = ((InterfaceC72021XFj) requireActivity).BiY();
        C1UC c1uc = this.A00;
        C14360o3.A0C(c1uc, AbstractC43591JPw.A00(433));
        this.A04 = ((XFZ) c1uc).Bia();
        this.A03 = xdh.Avi();
        FragmentActivity fragmentActivity = this.A00;
        C14360o3.A0C(fragmentActivity, AbstractC43591JPw.A00(21));
        C56352iT AYT = ((C2d4) fragmentActivity).AYT();
        if (AYT != null) {
            this.A01 = new FRW(fragmentActivity, AYT);
            this.A05 = C70399WUb.A00(this.A02.A0y);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0187, code lost:
    
        if (r2 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67968V4h.A00():boolean");
    }
}
