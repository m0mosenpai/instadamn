package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ghb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37642Ghb extends AbstractC52922bZ implements InterfaceC31152Dmw {
    public C05A A00;
    public Integer A01;
    public List A02;
    public final Map A03;
    public final int A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final Map A07;

    @Override // X.InterfaceC31152Dmw
    public final void FAC(int i) {
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onCompletion() {
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public static final void A00(C37642Ghb c37642Ghb) {
        C39440HbS c39440HbS;
        Map map = c37642Ghb.A03;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            C5TA c5ta = ((J28) A16.next()).A01;
            if (c5ta != null) {
                c5ta.A09("paused_for_replay");
            }
        }
        Object value = c37642Ghb.A00.getValue();
        if (value != null && (c39440HbS = (C39440HbS) c37642Ghb.A07.get(value)) != null) {
            Object obj = map.get(value);
            if (obj == null) {
                UserSession userSession = c37642Ghb.A05;
                obj = new J28(AbstractC25225BEi.A0F(userSession), c37642Ghb.A06, userSession, c37642Ghb);
                map.put(value, obj);
            }
            ((J28) obj).A02(c39440HbS, true);
        }
    }

    @Override // X.InterfaceC31152Dmw
    public final void COR(C120985dq c120985dq, C37658Ghr c37658Ghr, int i) {
        Object obj;
        if (c37658Ghr != null && c120985dq.A01 == EnumC129395t1.A0A) {
            List A01 = C42159Im7.A01(c120985dq);
            ArrayList A0i = AbstractC167007dF.A0i(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                A0i.add(((C40971v4) it.next()).A0K);
            }
            IntentAwareAdsInfoIntf A00 = C42159Im7.A00(c120985dq);
            List list = c37658Ghr.A0C;
            if (list.size() <= A0i.size()) {
                this.A02 = new ArrayList(A0i);
                ArrayList A0i2 = AbstractC167007dF.A0i(list);
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    InterfaceC43456JHu interfaceC43456JHu = (InterfaceC43456JHu) obj2;
                    C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(A0i, i2);
                    if (c38321qM != null) {
                        obj = this.A07.put(c38321qM, new C39440HbS(c38321qM, new C39437HbP(A00, this.A05, this.A06, Integer.valueOf(i2)), interfaceC43456JHu, i, true));
                    } else {
                        obj = null;
                    }
                    A0i2.add(obj);
                    i2 = i3;
                }
                C41711wL.A01(this.A05).A0C(A0i.size());
                A00(this);
                return;
            }
        }
        AbstractC12120kG.A07("ClipsMultiAdsMegacardVideoPlayerViewModel", "failed to resume multiple players", null);
    }

    @Override // X.InterfaceC31152Dmw
    public final void EEB() {
        Map map = this.A03;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            ((J28) A16.next()).A01();
        }
        map.clear();
        this.A07.clear();
        this.A02.clear();
        C41711wL.A01(this.A05).A0C(this.A04);
    }

    @Override // X.InterfaceC31152Dmw
    public final void FAB(C38321qM c38321qM, String str, int i) {
        if (c38321qM != null) {
            this.A00.Egh(c38321qM);
            this.A01 = Integer.valueOf(i);
        }
    }

    public C37642Ghb(UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        this.A05 = userSession;
        this.A06 = interfaceC60442pS;
        this.A04 = i;
        this.A03 = AbstractC166987dD.A1I();
        this.A07 = AbstractC166987dD.A1I();
        this.A02 = AbstractC166987dD.A1E();
        this.A00 = C10E.A00(null);
        AbstractC166987dD.A1Z(new PXT(this, null, 16), AbstractC141776au.A00(this));
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        J28 j28;
        if (C14360o3.A0K(AbstractC37301Gc2.A0h(c38321qM), AbstractC37301Gc2.A0h((C38321qM) this.A00.getValue())) && (j28 = (J28) this.A03.get(c38321qM)) != null) {
            J28.A00(j28);
        }
    }

    @Override // X.InterfaceC31152Dmw
    public final Integer AYv(boolean z) {
        return this.A01;
    }
}
