package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.K8b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45388K8b extends AnonymousClass935 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45388K8b(UserSession userSession, Object obj, Object obj2, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        if (this.A00 != 0) {
            super.A03(userSession, obj);
            return;
        }
        int A03 = C0f9.A03(1448849284);
        int A032 = C0f9.A03(-702102356);
        C32324ELs c32324ELs = (C32324ELs) this.A01;
        c32324ELs.A04.getClass();
        C162337Ov.A08((EnumC33498ErX) this.A02, c32324ELs, c32324ELs.A04);
        C0f9.A0A(1140285317, A032);
        C0f9.A0A(-385446786, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        if (1 - this.A00 != 0) {
            super.A05(userSession, obj);
            return;
        }
        int A03 = C0f9.A03(1550233951);
        int A032 = C0f9.A03(-1079696256);
        ((InterfaceC50423MOd) this.A01).Dsq(true, true, false);
        ((C48748LhG) this.A02).A00 = true;
        C0f9.A0A(1118664170, A032);
        C0f9.A0A(-261353406, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03;
        boolean z;
        String str;
        int i;
        Object obj2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1142706767);
                C43707JUs c43707JUs = (C43707JUs) obj;
                int A032 = C0f9.A03(304175356);
                C32324ELs c32324ELs = (C32324ELs) this.A01;
                c32324ELs.A04.getClass();
                C83403nh c83403nh = c43707JUs.A00;
                if (c83403nh == null || (c83403nh.A10 == C2EY.A0G && !c43707JUs.CLR())) {
                    z = true;
                } else {
                    z = false;
                }
                UserSession userSession2 = c32324ELs.A04;
                String str2 = c32324ELs.A0M;
                EnumC33498ErX enumC33498ErX = (EnumC33498ErX) this.A02;
                String str3 = c43707JUs.A1E;
                if (z) {
                    str = "new";
                } else {
                    str = "existing";
                }
                C162337Ov.A09(enumC33498ErX, c32324ELs, userSession2, str2, null, str3, str);
                c32324ELs.A0C.getClass();
                c32324ELs.A0C.FBa(c43707JUs, c43707JUs.A0q, c43707JUs, true);
                C0f9.A0A(-1121038419, A032);
                i = -1401125308;
                break;
            case 1:
                A03 = C0f9.A03(87161523);
                int A033 = C0f9.A03(-1745754903);
                ((InterfaceC50423MOd) this.A01).Dsq(true, true, false);
                ((C48748LhG) this.A02).A00 = true;
                C0f9.A0A(61179230, A033);
                i = -1143664638;
                break;
            default:
                A03 = C0f9.A03(-1516954579);
                K8E k8e = (K8E) obj;
                int A0G = AbstractC25231BEo.A0G(k8e, -1711862990);
                HashMap A1G = AbstractC166987dD.A1G();
                int i2 = 0;
                while (true) {
                    List list = (List) this.A01;
                    if (i2 < list.size() && i2 < k8e.A00.size()) {
                        if (i2 == 2) {
                            obj2 = C2057398y.A00;
                        } else {
                            obj2 = ((Pair) list.get(i2)).first;
                        }
                        A1G.put(obj2, k8e.A00.get(i2));
                        i2++;
                    }
                }
                C46922Dg c46922Dg = ((InboxNetworkSource) this.A02).A09;
                C42201xA c42201xA = c46922Dg.A07;
                Map map = (Map) c42201xA.A0W();
                if (map == null) {
                    map = AbstractC166987dD.A1G();
                }
                map.putAll(A1G);
                c42201xA.accept(map);
                Number A0W = AbstractC31171DnF.A0W(C125575m3.A00, A1G);
                if (A0W != null) {
                    c46922Dg.A00.A02 = A0W.intValue();
                    c46922Dg.A08.accept(A0W);
                }
                C0f9.A0A(1281576171, A0G);
                i = -75471069;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(-1104268733);
        ((InterfaceC50423MOd) this.A01).Dsq(false, false, true);
        C0f9.A0A(-138192342, A03);
    }
}
