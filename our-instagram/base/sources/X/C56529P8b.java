package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P8b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56529P8b implements InterfaceC140686Xw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C3G2 A03;
    public final /* synthetic */ C38E A04;
    public final /* synthetic */ C3M4 A05;
    public final /* synthetic */ InterfaceC58290Psi A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;
    public final /* synthetic */ List A09;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    public C56529P8b(FragmentActivity fragmentActivity, Reel reel, C3G2 c3g2, C38E c38e, C3M4 c3m4, InterfaceC58290Psi interfaceC58290Psi, ArrayList arrayList, ArrayList arrayList2, List list, int i) {
        this.A04 = c38e;
        this.A09 = list;
        this.A02 = reel;
        this.A07 = arrayList;
        this.A08 = arrayList2;
        this.A03 = c3g2;
        this.A00 = i;
        this.A05 = c3m4;
        this.A01 = fragmentActivity;
        this.A06 = interfaceC58290Psi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6ab] */
    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        int i;
        C38E c38e = this.A04;
        Fragment B8M = c38e.A0L.B8M();
        if (B8M != null && !B8M.isAdded()) {
            onCancel();
            return;
        }
        if (c38e.A0D != null) {
            c38e.A0D = null;
        }
        if (c38e.A04 == null) {
            UserSession userSession = c38e.A0K;
            MSW.A1X(userSession);
            c38e.A04 = new C143536ds(userSession);
        }
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        List list = this.A09;
        Reel reel = this.A02;
        String id = reel.getId();
        UserSession userSession2 = c38e.A0K;
        obj.A02(userSession2, id, list);
        obj.A09(this.A07);
        obj.A0A(this.A08);
        obj.A03(this.A03);
        if (list.contains(reel)) {
            i = list.indexOf(reel);
        } else {
            i = 0;
        }
        obj.A00 = i;
        obj.A04(Integer.valueOf(this.A00));
        obj.A01(userSession2);
        obj.A05(this.A05.A0x);
        obj.A06(c38e.A04.A02);
        obj.A03 = c38e.A03;
        obj.A0K = c38e.A0B;
        obj.A06 = c38e.A08;
        String str2 = c38e.A0C;
        if (str2 != null) {
            obj.A0N = str2;
        }
        AbstractC140596Xn abstractC140596Xn = c38e.A05;
        if (abstractC140596Xn != null) {
            obj.A07(abstractC140596Xn.A03);
        }
        Bundle A00 = obj.A00();
        FragmentActivity fragmentActivity = this.A01;
        C6XJ.A01(fragmentActivity, A00, userSession2).A0C(fragmentActivity);
        this.A06.ElQ();
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        this.A06.ElQ();
    }
}
