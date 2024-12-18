package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.Lhr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48784Lhr implements MRR {
    public final C159737El A00;
    public final C160557Hp A01;
    public final Context A02;
    public final Handler A03;
    public final UserSession A04;
    public final InterfaceC159877Ez A05;
    public final C163997Vo A06;
    public final EnumC46186KcO A07;
    public final C2EE A08;
    public final C7FV A09;
    public final C7F2 A0A;
    public final C35152Feu A0B;
    public final C3DN A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16620sF A0E;

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
        AnonymousClass442 anonymousClass442;
        L51 l51;
        C14360o3.A0B(c148286ly, 0);
        this.A0E.invoke(str, c45058Jwn);
        this.A0D.invoke();
        C160557Hp c160557Hp = this.A01;
        if (c160557Hp != null && (l51 = c160557Hp.A09) != null) {
            anonymousClass442 = l51.A02.A01;
        } else {
            anonymousClass442 = null;
        }
        C35152Feu c35152Feu = this.A0B;
        if (c35152Feu != null && c35152Feu.A02()) {
            AbstractC46995KqE.A00(c35152Feu.A01, false, false);
        }
        this.A06.A05(c148286ly, this.A07, anonymousClass442);
        this.A0C.A0B();
        C159737El c159737El = this.A00;
        c159737El.A1I(0.0f);
        C159737El.A0m(c159737El, true);
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
        C14360o3.A0B(c148286ly, 0);
        AnonymousClass983 anonymousClass983 = this.A06.A00;
        C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
        Context context = anonymousClass983.A02;
        if (context == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        C7IT.A00(A0J, "sendCutoutSticker", new MIL(14, context, A0J, c148286ly, anonymousClass983.A10, null));
        this.A0C.A0B();
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        C14360o3.A0B(c45026JwH, 0);
        this.A0E.invoke(str, c45058Jwn);
        this.A0D.invoke();
        EnumC46186KcO enumC46186KcO = this.A07;
        if (enumC46186KcO == EnumC46186KcO.A08) {
            this.A00.A0b.A05(null);
        }
        this.A05.DNq(enumC46186KcO, c45026JwH);
    }

    @Override // X.MRR
    public final void DUW(JIN jin) {
        C14360o3.A0B(jin, 0);
        AnonymousClass983 anonymousClass983 = this.A06.A00;
        C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
        Context context = anonymousClass983.A02;
        if (context == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        C7IT.A00(A0J, "sendMusicticker", new C50372MLz(38, jin, A0J, anonymousClass983.A10, context));
        this.A0C.A0B();
    }

    @Override // X.MRR
    public final void Dp9(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker, String str) {
        AnonymousClass442 anonymousClass442;
        L51 l51;
        C14360o3.A0B(directStoreSticker, 0);
        this.A0E.invoke(str, c45058Jwn);
        C163997Vo c163997Vo = this.A06;
        C160557Hp c160557Hp = this.A01;
        if (c160557Hp != null && (l51 = c160557Hp.A09) != null) {
            anonymousClass442 = l51.A02.A01;
        } else {
            anonymousClass442 = null;
        }
        c163997Vo.A07(anonymousClass442, directStoreSticker);
        this.A0C.A0B();
        C159737El c159737El = this.A00;
        c159737El.A1I(0.0f);
        C159737El.A0m(c159737El, true);
    }

    @Override // X.MRR
    public final void DwN(String str) {
        C14360o3.A0B(str, 0);
        this.A09.A01(this.A08, str);
    }

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        return this.A06.A00();
    }

    @Override // X.MRR
    public final void Cvn() {
        this.A0A.A00 = C05F.A0C;
        this.A0C.A0B();
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
        this.A0E.invoke(str, c45058Jwn);
        C7IT A0J = AnonymousClass983.A01(this.A06.A00).A0J();
        C50359MLl c50359MLl = new C50359MLl(A0J, 20);
        C7X1 c7x1 = A0J.A01;
        DirectThreadKey A02 = JRE.A02(((C7U0) AbstractC31172DnG.A0y(c7x1.A01)).C7r().Afi());
        if (A02 == null) {
            A0J.A08.invoke("sendLike");
        } else {
            c7x1.A00();
            c50359MLl.invoke(A02);
            c7x1.A01(null, 100);
        }
        this.A0C.A0B();
        this.A00.A1I(0.0f);
    }

    @Override // X.MRR
    public final void DQH() {
        this.A0A.A00 = C05F.A01;
        this.A0C.A0B();
    }

    @Override // X.MRR
    public final void Dvf() {
        this.A03.post(new M1W(this));
        this.A06.A01();
    }

    @Override // X.MRR
    public final void DwO(String str) {
        Activity activity;
        Context context = this.A02;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            UserSession userSession = this.A04;
            if (AbstractC159377Cx.A00(userSession)) {
                C2EE c2ee = this.A08;
                if (c2ee != null) {
                    C28214CcD.A00(new C28214CcD(activity, userSession, c2ee.BKb(), c2ee.BSH(), c2ee.CWO()), EnumC53326Ni5.A0R, null, null, null, str, 252);
                } else {
                    return;
                }
            } else {
                C7FV c7fv = this.A09;
                C2EE c2ee2 = this.A08;
                if (c7fv.A02(activity, c2ee2)) {
                    c7fv.A00(context, c2ee2);
                }
            }
        }
        this.A0C.A0B();
    }

    @Override // X.MRR
    public final void Ekm() {
        this.A0A.A00 = C05F.A00;
        this.A0C.A0B();
        this.A00.A1I(0.0f);
    }

    public C48784Lhr(Context context, Handler handler, UserSession userSession, InterfaceC159877Ez interfaceC159877Ez, C163997Vo c163997Vo, EnumC46186KcO enumC46186KcO, C2EE c2ee, C159737El c159737El, C160557Hp c160557Hp, C7FV c7fv, C7F2 c7f2, C35152Feu c35152Feu, C3DN c3dn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        AbstractC37302Gc3.A1U(handler, enumC46186KcO);
        AbstractC25229BEm.A1O(interfaceC16620sF, 14, interfaceC16820sZ);
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = handler;
        this.A07 = enumC46186KcO;
        this.A08 = c2ee;
        this.A0C = c3dn;
        this.A0A = c7f2;
        this.A05 = interfaceC159877Ez;
        this.A09 = c7fv;
        this.A0B = c35152Feu;
        this.A06 = c163997Vo;
        this.A01 = c160557Hp;
        this.A00 = c159737El;
        this.A0E = interfaceC16620sF;
        this.A0D = interfaceC16820sZ;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
        AbstractC167017dG.A1O(c148286ly, enumC46186KcO);
        UserSession userSession = this.A04;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36599181561171413L);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7D("ai_sticker_nux_seen_count", A07);
        A0w.apply();
        this.A06.A04(c148286ly, enumC46186KcO);
        this.A0C.A0B();
        this.A00.A1I(0.0f);
    }
}
