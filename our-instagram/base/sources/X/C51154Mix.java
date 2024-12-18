package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mix, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51154Mix extends C2UU {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final List A04;
    public final FragmentActivity A05;
    public final UserSession A06;

    public C51154Mix(FragmentActivity fragmentActivity, UserSession userSession, List list) {
        C14360o3.A0B(userSession, 3);
        this.A05 = fragmentActivity;
        this.A04 = list;
        this.A06 = userSession;
        this.A02 = "$0.00";
        this.A01 = "";
        this.A00 = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r12, int r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51154Mix.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                return new C51355MmG(this.A06, this.A05, AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.user_pay_earnings_row_v2, false));
            }
            throw AbstractC31175DnJ.A0U("Invalid View Type: ", i);
        }
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.user_pay_earnings_header, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A06;
        FragmentActivity fragmentActivity = this.A05;
        C14360o3.A0A(inflate);
        return new C51352MmD(userSession, fragmentActivity, inflate);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1816948989);
        int size = this.A04.size() + 1;
        C0f9.A0A(1768290070, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(890820749);
        boolean A1Q = AbstractC25230BEn.A1Q(i);
        C0f9.A0A(-2023166054, A03);
        return A1Q ? 1 : 0;
    }
}
