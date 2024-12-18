package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.LuD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49500LuD implements InterfaceC58191Pqx, InterfaceC65982ya {
    public Context A00;
    public UserSession A01;
    public C47Z A02;
    public C65972yZ A03;
    public final Integer A04;
    public final HashSet A05;

    public C49500LuD(Context context, UserSession userSession, C65972yZ c65972yZ, C47Z c47z, Integer num) {
        C14360o3.A0B(num, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c47z;
        this.A03 = c65972yZ;
        this.A04 = num;
        this.A05 = AbstractC166987dD.A1H();
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c47z;
    }

    @Override // X.InterfaceC58191Pqx
    public final void DhE() {
        A00(this, true);
    }

    @Override // X.InterfaceC58191Pqx
    public final void EDp(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A05.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A05.remove(c3o0);
    }

    public static final void A00(C49500LuD c49500LuD, boolean z) {
        C115435Kd c115435Kd;
        String str;
        if (z && (c115435Kd = c49500LuD.A02.A6I) != null && (str = c115435Kd.A02) != null && AbstractC001900j.A0a(str, AbstractC111324zv.A00(3812), false)) {
            C193328hC A0I = AbstractC31171DnF.A0I(c49500LuD.A00);
            A0I.A0A(2131969484);
            A0I.A09(2131969483);
            DialogInterfaceOnClickListenerC48023LMs.A02(A0I, c49500LuD, 58, 2131969466);
            A0I.A0s(true);
            A0I.A0t(true);
            AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC48023LMs.A00(c49500LuD, 59), A0I, 2131969480);
            return;
        }
        C40131tg c40131tg = C40121td.A0G;
        Context context = c49500LuD.A00;
        C40121td A01 = c40131tg.A01(context, c49500LuD.A01);
        C47Z c47z = c49500LuD.A02;
        C150856qj.A02(context);
        A01.A08(c47z);
        C1CM c1cm = new C1CM(context);
        if (c1cm.A07(false) || !c1cm.A05()) {
            return;
        }
        C9GR.A07(context, 2131969462);
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return this.A02.A1G;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A02.A03();
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        C47Z c47z = this.A02;
        EnumC915447k enumC915447k = c47z.A6J;
        EnumC915447k enumC915447k2 = EnumC915447k.A02;
        if (enumC915447k == enumC915447k2 && c47z.A0m()) {
            return C05F.A00;
        }
        if (c47z.A1f == enumC915447k2) {
            Integer num = this.A04;
            if (num == C05F.A00) {
                return C05F.A0C;
            }
            Integer num2 = C05F.A01;
            if (num == num2) {
                return num2;
            }
        }
        if (c47z.A3D != null) {
            return C05F.A0N;
        }
        return C05F.A0Y;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        int i;
        int i2;
        if (this.A04 == C05F.A01) {
            C47Z c47z = this.A02;
            if (AbstractC166987dD.A1b(c47z.A4T)) {
                int size = c47z.A4T.size() + 1;
                Context context = this.A00;
                Integer valueOf = Integer.valueOf(size);
                return new C47981LJa(AbstractC31177DnL.A0b(context, valueOf, 2131971364), AbstractC31177DnL.A0b(context, valueOf, 2131971366));
            }
            i = 2131971363;
            i2 = 2131971365;
        } else {
            i = 2131969851;
            i2 = 2131969848;
        }
        return new C47981LJa(i, i2);
    }

    @Override // X.InterfaceC58191Pqx
    public final /* synthetic */ Drawable C7z() {
        return null;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        C47Z c47z = this.A02;
        if (c47z.A0t()) {
            c47z = (C47Z) AbstractC166987dD.A16(c47z.A0K());
        }
        String str = c47z.A33;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        Iterator A13 = AbstractC166997dE.A13(this.A05);
        while (A13.hasNext()) {
            ((C3O0) AbstractC166997dE.A0l(A13)).A0B(this);
        }
    }
}
