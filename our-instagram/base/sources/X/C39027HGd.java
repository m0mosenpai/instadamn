package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.HGd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39027HGd extends C1P1 {
    public final long A00;
    public final /* synthetic */ InterfaceC1116050z A01;
    public final /* synthetic */ C1OP A02;
    public final /* synthetic */ C111354zy A03;

    public C39027HGd(InterfaceC1116050z interfaceC1116050z, C1OP c1op, C111354zy c111354zy) {
        this.A03 = c111354zy;
        this.A02 = c1op;
        this.A01 = interfaceC1116050z;
        this.A00 = AbstractC166987dD.A0x(c111354zy.A02).getLong("last_stories_tray_background_request_timestamp", -1L);
    }

    private final void A00(boolean z) {
        C77383dO c77383dO = C77383dO.A00;
        C111354zy c111354zy = this.A03;
        c77383dO.A00(c111354zy.A01, c111354zy.A02, C05F.A01, this.A02.A06, this.A00, z);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(810364395);
        C3LZ c3lz = (C3LZ) obj;
        int A0N = AbstractC167017dG.A0N(c3lz, -1472930443);
        C3NO F7f = c3lz.F7f();
        C111354zy c111354zy = this.A03;
        UserSession userSession = c111354zy.A02;
        C1DS.A00(userSession);
        List list = F7f.A0J;
        if (list != null && !list.isEmpty()) {
            ReelStore A032 = ReelStore.A03(userSession);
            C1OP c1op = this.A02;
            A032.A0Z(F7f.A04, c1op, AbstractC166987dD.A10(userSession), AbstractC73333Qj.A01(userSession, F7f), AbstractC73333Qj.A00(userSession, F7f), -1, c3lz.CR4(), AbstractC73333Qj.A02(F7f));
            A00(true);
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            String A01 = AbstractC25631Mt.A01(c1op.A04);
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K("last_stories_tray_fetch_reason", A01);
            ARD.apply();
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E7G(AbstractC111324zv.A00(4816), currentTimeMillis);
            ARD2.apply();
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.E7G("last_stories_tray_background_request_timestamp", currentTimeMillis);
            ARD3.apply();
        }
        List A0U = ReelStore.A03(userSession).A0U(true);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; A1E.size() < 5 && i < A0U.size(); i++) {
            if (!((Reel) A0U.get(i)).A1P && !((Reel) A0U.get(i)).A1a && !((Reel) A0U.get(i)).A0d() && !((Reel) A0U.get(i)).A0p() && !((Reel) A0U.get(i)).A0j() && !((Reel) A0U.get(i)).A1Y) {
                Object obj2 = A0U.get(i);
                C14360o3.A07(obj2);
                A1E.add(obj2);
            }
        }
        InterfaceC1116050z interfaceC1116050z = this.A01;
        c111354zy.A03.clear();
        c111354zy.A04.clear();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        int size = A1E.size();
        for (int i2 = 0; i2 < size; i2++) {
            Reel reel = (Reel) A1E.get(i2);
            if (reel.A0z(userSession)) {
                A1E2.add(reel);
            } else {
                A1E3.add(reel);
            }
        }
        if (A1E3.isEmpty()) {
            C111354zy.A01(interfaceC1116050z, c111354zy, A1E2);
        } else {
            HashSet hashSet = new HashSet(AbstractC92144Au.A02(new C64285T7u(13, JDR.A00), A1E3));
            Integer num = null;
            C82043lQ c82043lQ = new C82043lQ(userSession, C3G5.A04, new HY9(interfaceC1116050z, c111354zy, A1E2), AbstractC111324zv.A00(2961), null, hashSet);
            if (AbstractC82073lT.A05(userSession)) {
                num = C05F.A00;
            }
            c82043lQ.A07(new C1ET(num));
        }
        C0f9.A0A(-984985446, A0N);
        C0f9.A0A(-972608806, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1397475553);
        this.A01.AVi(AbstractC111324zv.A00(2961));
        A00(false);
        C0f9.A0A(-2054684750, A03);
    }
}
