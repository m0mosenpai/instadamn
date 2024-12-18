package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EUV extends C1P1 {
    public final UserSession A00;
    public final FI4 A01;
    public final InterfaceC37205GaG A02;
    public final String A03;

    public EUV(UserSession userSession, FI4 fi4, InterfaceC37205GaG interfaceC37205GaG, String str) {
        this.A03 = str;
        this.A00 = userSession;
        this.A01 = fi4;
        this.A02 = interfaceC37205GaG;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1896239449);
        C168027ex c168027ex = (C168027ex) abstractC115105If.A00();
        InterfaceC37205GaG interfaceC37205GaG = this.A02;
        if (c168027ex != null) {
            num = Integer.valueOf(c168027ex.getStatusCode());
        } else {
            num = null;
        }
        interfaceC37205GaG.DFj(num);
        AbstractC166547cQ.A01.remove(this.A03);
        C0f9.A0A(1858185433, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1672524734);
        super.onFinish();
        this.A02.onFinish();
        C0f9.A0A(-1104199959, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-483073678);
        super.onStart();
        AbstractC166547cQ.A01.put(this.A03, AbstractC31173DnH.A0g());
        this.A02.onStart();
        C0f9.A0A(-52523083, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(1400184251);
        C168027ex c168027ex = (C168027ex) obj;
        int A032 = C0f9.A03(92870165);
        C14360o3.A0B(c168027ex, 0);
        List items = c168027ex.getItems();
        if (items.isEmpty()) {
            C0w9.A03("restrict_error", "Member change api returned success with no users.");
            this.A02.DFj(Integer.valueOf(c168027ex.getStatusCode()));
            AbstractC166547cQ.A01.remove(this.A03);
            i = -1874482064;
        } else {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                AnonymousClass189.A00(this.A00).A01(A15, false, false);
                FI4 fi4 = this.A01;
                boolean z = fi4 instanceof C33314Eo9;
                C14360o3.A0B(A15, 0);
                if (z) {
                    C166217bp c166217bp = fi4.A00;
                    java.util.Set set = c166217bp.A02;
                    if (!AbstractC31175DnJ.A1Y(A15, set)) {
                        set.add(A15.getId());
                        c166217bp.A01.push(A15);
                        c166217bp.A00();
                    }
                } else {
                    fi4.A00.A01(A15);
                }
            }
            this.A02.onSuccess();
            AbstractC166547cQ.A01.remove(this.A03);
            i = 1114094252;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-48012699, A03);
    }
}
