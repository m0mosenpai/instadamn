package X;

import android.os.Parcelable;
import com.facebook.pando.Summary;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.OqQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55815OqQ implements C2JL {
    public static final /* synthetic */ C0YR[] A0A = {new AnonymousClass019(C55815OqQ.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
    public int A00;
    public int A01;
    public boolean A02;
    public final C1DV A03;
    public final UserSession A04;
    public final C37494GfC A05;
    public final AnonymousClass700 A06;
    public final AnonymousClass501 A07;
    public final boolean A08;
    public final InterfaceC16130rD A09;

    public C55815OqQ(C1DV c1dv, UserSession userSession, C53M c53m, C37494GfC c37494GfC, AnonymousClass700 anonymousClass700, AnonymousClass501 anonymousClass501) {
        C14360o3.A0B(c1dv, 4);
        this.A07 = anonymousClass501;
        this.A06 = anonymousClass700;
        this.A03 = c1dv;
        this.A04 = userSession;
        this.A05 = c37494GfC;
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 36316370849960242L);
        this.A09 = new PV0(AbstractC25225BEi.A16(c53m), 0);
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailDeferStreamingRequestGraphQLCallback.onFailure", 764794429);
        }
        try {
            C11T.A02(new PRC(this, th));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-827044021);
            }
        } catch (Throwable th2) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1682648010);
            }
            throw th2;
        }
    }

    public static final C53M A00(C55815OqQ c55815OqQ) {
        return (C53M) c55815OqQ.A09.CES(c55815OqQ, A0A[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        AnonymousClass435 anonymousClass435;
        int i2;
        C2JS c2js;
        C128125qg c128125qg;
        User user;
        String A0c;
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailDeferStreamingRequestGraphQLCallback.onSuccess", -1477180052);
        }
        try {
            C37494GfC c37494GfC = this.A05;
            c37494GfC.A0E(AnonymousClass001.A0c("fetch_user_on_data_flush", "_bg", this.A00));
            C2045893s c2045893s = null;
            if ((anonymousClass436 instanceof AnonymousClass435) && (anonymousClass435 = (AnonymousClass435) anonymousClass436) != null) {
                Summary summary = anonymousClass435.A00;
                long j = summary.requestStartTime;
                if (j > 0) {
                    c37494GfC.A0H("fetch_user_request_start", j);
                }
                long j2 = summary.networkStartTime;
                if (j2 > 0) {
                    c37494GfC.A0H("fetch_user_network_start", j2);
                }
                long j3 = summary.networkEndTime;
                if (j3 > 0) {
                    int i3 = this.A00;
                    if (i3 == 0) {
                        A0c = "fetch_user_network_end";
                    } else {
                        A0c = AnonymousClass001.A0c("fetch_user_network_flush", "_end", i3);
                    }
                    c37494GfC.A0H(A0c, j3);
                }
                long j4 = summary.networkResponseStartTime;
                if (j4 > 0) {
                    c37494GfC.A0H("fetch_user_network_response_start", j4);
                }
                long j5 = summary.parseStartTime;
                if (j5 > 0) {
                    c37494GfC.A0H(AnonymousClass001.A0c("fetch_user_parse_flush", "_start", this.A00), j5);
                }
                long j6 = summary.parseEndTime;
                if (j6 > 0) {
                    c37494GfC.A0H(AnonymousClass001.A0c("fetch_user_parse_flush", "_end", this.A00), j6);
                }
                C2JT c2jt = (C2JT) anonymousClass435.A01;
                if (c2jt instanceof C60172Qv8) {
                    i2 = 0;
                    c2js = (C60171Qv7) ((C60172Qv8) c2jt).getRequiredTreeField(0, "xdt_users__info(entry_point:$entry_point,from_module:$from_module,user_id:$user_id)", C60171Qv7.class, 958712321);
                } else if (c2jt instanceof C60170Qv6) {
                    i2 = 0;
                    c2js = (C60169Qv5) ((C60170Qv6) c2jt).getRequiredTreeField(0, "xdt_api__v1__username__info(entry_point:$entry_point,from_module:$from_module,username:$username)", C60169Qv5.class, 851208549);
                } else {
                    c2045893s = null;
                }
                C60181QvH c60181QvH = (C60181QvH) c2js.reinterpretRequired(i2, C60181QvH.class, -294452885);
                C14360o3.A0A(c60181QvH);
                c37494GfC.A0E(AnonymousClass001.A0c("graphql_model_conversion_flush", "_start", this.A00));
                boolean A06 = C18U.A06(C06090Tz.A05, this.A04, 36316370849894705L);
                C1DV c1dv = this.A03;
                if (A06) {
                    C52635NQi c52635NQi = (C52635NQi) c60181QvH.reinterpret(C52635NQi.class);
                    C1DY A0S = MSZ.A0S(c1dv);
                    ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c52635NQi.getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict != null) {
                        Parcelable.Creator creator = User.CREATOR;
                        user = AbstractC38851rI.A01(A0S, immutablePandoUserDict);
                    } else {
                        user = null;
                    }
                    c52635NQi.A00 = user;
                    c128125qg = c52635NQi;
                } else {
                    c128125qg = ((C52635NQi) c60181QvH.reinterpret(C52635NQi.class)).A0q(MSZ.A0S(c1dv));
                }
                C14360o3.A0A(c128125qg);
                c37494GfC.A0E(AnonymousClass001.A0c("graphql_model_conversion_flush", "_end", this.A00));
                c2045893s = new C2045893s();
                c2045893s.A04 = c128125qg;
                c2045893s.mStatus = "ok";
                AnonymousClass435 anonymousClass4352 = anonymousClass435;
                C14360o3.A0B(anonymousClass4352, 1);
                c2045893s.A01 = anonymousClass4352.Ajf();
                c2045893s.A00 = anonymousClass4352.AjZ();
            }
            this.A00++;
            if (c2045893s == null) {
                if (Systrace.A0E(1L)) {
                    i = 461142977;
                } else {
                    return;
                }
            } else {
                C11T.A02(new RunnableC57042PSh(anonymousClass436, c2045893s, this));
                if (!Systrace.A0E(1L)) {
                    return;
                } else {
                    i = 2034957721;
                }
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-690668211);
            }
            throw th;
        }
    }
}
