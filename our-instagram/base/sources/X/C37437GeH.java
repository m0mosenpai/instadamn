package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GeH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37437GeH extends AnonymousClass346 {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C37437GeH(UserSession userSession, String str, String str2, String str3) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        AbstractC167017dG.A1R(obj, obj2);
        if ((obj instanceof C38321qM) && (obj2 instanceof C75113Zb) && ((C38321qM) obj).CdW()) {
            C75113Zb c75113Zb = (C75113Zb) obj2;
            String str = c75113Zb.A1H;
            if (str != null) {
                String str2 = this.A01;
                if (!str.equals(str2)) {
                    C0f5 AEp = C18950wb.A01.AEp("action appender host_profile_id_delivered_to overwrite", 817896121);
                    AEp.ABW("module_name", this.A02);
                    AEp.ABW(AbstractC111324zv.A00(2813), str2);
                    AEp.ABW(AbstractC111324zv.A00(2750), c75113Zb.A1H);
                    AEp.report();
                }
            }
            c75113Zb.A1J = this.A03;
            c75113Zb.A1H = this.A01;
        }
    }
}
