package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;

/* renamed from: X.Im1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42153Im1 implements InterfaceC30988Djn {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final C37526Gfi A03;
    public final String A04;
    public final C57112jm A08;
    public final C64272vm A09;
    public final C1M1 A0A;
    public final IJN A0B;
    public final InterfaceC09390do A06 = J8Z.A00(this, 15);
    public final InterfaceC09390do A05 = J8Z.A00(this, 14);
    public final InterfaceC09390do A07 = J8Z.A00(this, 16);

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        String str;
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        String A1E = AbstractC25226BEj.A1E(c120985dq);
        String id = AbstractC25226BEj.A0y(c120985dq).getId();
        Integer A0B = c120985dq.A0B();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ad_id:");
        A1C.append(A1E);
        A1C.append(":media_id:");
        A1C.append(id);
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AbstractC167017dG.A0n(A0B, ":ad_id:", A1C));
        A00.A00((AbstractC64162vb) this.A06.getValue());
        A00.A00((AbstractC64412w0) this.A07.getValue());
        A00.A00((C42384Ipl) this.A05.getValue());
        A00.A00(this.A09);
        this.A08.A05(view, A00.A01());
        if (C18U.A06(C06090Tz.A05, this.A00, 36324565646979313L)) {
            IJN ijn = this.A0B;
            String id2 = AbstractC25226BEj.A0y(c120985dq).getId();
            if (id2 != null) {
                WeakHashMap weakHashMap = ijn.A04;
                if (weakHashMap.containsKey(view) && (str = (String) weakHashMap.get(view)) != null) {
                    ijn.A02.A01(str, null);
                }
                weakHashMap.put(view, id2);
                C4E9 c4e9 = ijn.A02;
                c120985dq.A06();
                c4e9.A00(null, new J2I(c120985dq), new BFT(view, ijn.A03, AbstractC111324zv.A00(1220), ijn.A01.getModuleName(), id2));
            }
        }
    }

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A08.A04(view);
        if (C18U.A06(C06090Tz.A05, this.A00, 36324565646979313L)) {
            IJN ijn = this.A0B;
            WeakHashMap weakHashMap = ijn.A04;
            String str = (String) weakHashMap.get(view);
            if (str != null) {
                ijn.A02.A01(str, view);
            }
            weakHashMap.remove(view);
        }
    }

    public C42153Im1(UserSession userSession, C57112jm c57112jm, C30W c30w, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, C37526Gfi c37526Gfi, String str) {
        this.A08 = c57112jm;
        this.A00 = userSession;
        this.A0A = c1m1;
        this.A04 = str;
        this.A02 = interfaceC60442pS;
        this.A01 = c30w;
        this.A03 = c37526Gfi;
        this.A09 = new C64272vm(userSession, new C64252vk(userSession, new C42992Izi(c1m1.getSessionId(), interfaceC60442pS.getModuleName()), new C64232vi(), EnumC64222vh.A03), EnumC64262vl.A05);
        this.A0B = new IJN(userSession, interfaceC60442pS);
    }
}
