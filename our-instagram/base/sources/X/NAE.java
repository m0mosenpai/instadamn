package X;

import com.facebook.systrace.Systrace;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NAE extends C1P1 {
    public static final /* synthetic */ C0YR[] A04 = {new AnonymousClass019(NAE.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
    public final C1DV A00;
    public final C37494GfC A01;
    public final AnonymousClass700 A02;
    public final InterfaceC16130rD A03;

    public NAE(C1DV c1dv, C53M c53m, C37494GfC c37494GfC, AnonymousClass700 anonymousClass700) {
        C14360o3.A0B(c1dv, 3);
        this.A02 = anonymousClass700;
        this.A00 = c1dv;
        this.A01 = c37494GfC;
        this.A03 = new PV0(AbstractC25225BEi.A16(c53m), 1);
    }

    public static final C53M A00(NAE nae) {
        return (C53M) nae.A03.CES(nae, A04[0]);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        String str;
        AnonymousClass435 anonymousClass435;
        int A03 = C0f9.A03(11056262);
        C14360o3.A0B(abstractC115105If, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailRequestGraphQLCallback.onFail", 677330244);
        }
        try {
            C53M A00 = A00(this);
            if (A00 != null) {
                A00.CmM();
            }
            C53M A002 = A00(this);
            boolean z = false;
            if (A002 != null && A002.isValid()) {
                C53M A003 = A00(this);
                if (A003 != null) {
                    A003.EWZ(false);
                }
                boolean z2 = abstractC115105If instanceof C115115Ig;
                if (!z2 || ((anonymousClass435 = (AnonymousClass435) ((C115115Ig) abstractC115105If).A00) != null && anonymousClass435.mStatusCode == 404)) {
                    z = true;
                }
                C53M A004 = A00(this);
                if (A004 != null) {
                    Throwable A01 = abstractC115105If.A01();
                    if (A01 != null) {
                        str = A01.getMessage();
                    } else {
                        str = null;
                    }
                    A004.DGu(z2, z, str);
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1136380224);
                }
                i = 767685188;
            } else {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-401888460);
                }
                i = -1564536695;
            }
            C0f9.A0A(i, A03);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-931231581);
            }
            C0f9.A0A(-1317926523, A03);
            throw th;
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        C60171Qv7 c60171Qv7;
        C60181QvH c60181QvH;
        String A1A;
        Long A0j;
        int A03 = C0f9.A03(480708613);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(-2015742019);
        C14360o3.A0B(anonymousClass435, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailRequestGraphQLCallback.onSuccessInBackground", -228193867);
        }
        try {
            C37494GfC c37494GfC = this.A01;
            c37494GfC.A0E("fetch_user_on_data_bg");
            C53M A00 = A00(this);
            if (A00 != null && A00.isValid()) {
                C60172Qv8 c60172Qv8 = (C60172Qv8) anonymousClass435.A01;
                if (c60172Qv8 != null && (c60171Qv7 = (C60171Qv7) c60172Qv8.getRequiredTreeField(0, "xdt_users__info(entry_point:$entry_point,from_module:$from_module,user_id:$user_id)", C60171Qv7.class, 958712321)) != null && (c60181QvH = (C60181QvH) c60171Qv7.reinterpretRequired(0, C60181QvH.class, -294452885)) != null) {
                    c37494GfC.A0E("graphql_model_conversion_start");
                    C128125qg A0q = ((C52635NQi) c60181QvH.reinterpret(C52635NQi.class)).A0q(MSZ.A0S(this.A00));
                    c37494GfC.A0E("graphql_model_conversion_end");
                    C2045893s c2045893s = new C2045893s();
                    c2045893s.A04 = A0q;
                    c2045893s.mStatus = "ok";
                    AnonymousClass435 anonymousClass4352 = anonymousClass435;
                    C14360o3.A0B(anonymousClass4352, 1);
                    c2045893s.A01 = anonymousClass4352.Ajf();
                    c2045893s.A00 = anonymousClass4352.AjZ();
                    Map map = anonymousClass435.A00.trackedResponseHeaders;
                    if (map != null && (A1A = AbstractC166987dD.A1A("X-IG-Request-Elapsed-Time-MS", map)) != null && (A0j = AbstractC166997dE.A0j(A1A)) != null) {
                        c2045893s.mServerElapsedTime = A0j.longValue();
                    }
                    C11T.A02(new PRD(c2045893s, this));
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1702162339);
                    }
                    i = 614665408;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-2074983061);
                }
                i = 2042553249;
            }
            C0f9.A0A(i, A032);
            C0f9.A0A(-698833891, A03);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1307166163);
            }
            C0f9.A0A(-1859371247, A032);
            throw th;
        }
    }
}
