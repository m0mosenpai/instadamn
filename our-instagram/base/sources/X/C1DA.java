package X;

import android.os.Parcelable;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoConsistencyStackJNI;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPublishPostProcessorProvider;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.pando.consistency.impl.IgPandoPublishPostProcessor;
import com.instagram.pando.consistency.impl.IgPandoPublishPostProcessorProvider;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1DA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DA extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C1D8 A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Executor A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DA(C1D8 c1d8, UserSession userSession, Executor executor, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.A03 = c1d8;
        this.A05 = executor;
        this.A01 = i;
        this.A09 = z;
        this.A02 = i2;
        this.A07 = z2;
        this.A00 = i3;
        this.A08 = z3;
        this.A06 = z4;
        this.A04 = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C1D8 c1d8 = this.A03;
        PandoConsistencyStackJNI create = PandoConsistencyStackJNI.create(c1d8.A04, c1d8.A03, c1d8.A05, c1d8.A01, c1d8.A00, c1d8.A02, c1d8.A06);
        if (create == null) {
            create = PandoConsistencyStackJNI.create(false, false, false, 0, 0, 0, false);
        }
        PandoConsistencyServiceJNI create2 = PandoConsistencyServiceJNI.create(create, this.A05, this.A01, this.A09, this.A02, this.A07, this.A00, this.A08, this.A06);
        final UserSession userSession = this.A04;
        C1DP c1dp = IgPandoPublishPostProcessorProvider.Companion;
        final C1DY c1dy = new C1DY((C1DV) C1DS.A00(userSession), 2, true);
        create2.setPublishPostProcessor(new PandoPublishPostProcessorProvider(IgPandoPublishPostProcessorProvider.initHybridData(new IgPandoPublishPostProcessor(c1dy, userSession) { // from class: X.1DZ
            public final C1DY A00;
            public final UserSession A01;

            @Override // com.instagram.pando.consistency.impl.IgPandoPublishPostProcessor
            public final void processMedia(ImmutablePandoMediaDict immutablePandoMediaDict) {
                C14360o3.A0B(immutablePandoMediaDict, 0);
                String A0j = immutablePandoMediaDict.A0j(356255459);
                if (A0j == null && (A0j = immutablePandoMediaDict.getId()) == null) {
                    return;
                }
                C1DY c1dy2 = this.A00;
                C1DV c1dv = c1dy2.A00;
                if (c1dv.AXG(A0j, new C0YZ(C38321qM.class)) == null) {
                    return;
                }
                UserSession userSession2 = this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36327164104161621L) && C18U.A06(c06090Tz, userSession2, 36327164104030547L)) {
                    return;
                }
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                C84483pr c84483pr = new C84483pr(immutablePandoMediaDict);
                String strongId = c84483pr.getStrongId();
                if (strongId == null) {
                    strongId = c84483pr.getId();
                }
                c84483pr.EVu(strongId);
                c1dy2.A00(new C38321qM(c1dv, c84483pr).A1f(new C1DY(c1dv, 6, false)));
            }

            @Override // com.instagram.pando.consistency.impl.IgPandoPublishPostProcessor
            public final void processUser(ImmutablePandoUserDict immutablePandoUserDict) {
                User A0H;
                C14360o3.A0B(immutablePandoUserDict, 0);
                String A0j = immutablePandoUserDict.A0j(356255459);
                if (A0j == null && (A0j = immutablePandoUserDict.A0e()) == null && (A0j = immutablePandoUserDict.A0j(3579)) == null && (A0j = immutablePandoUserDict.A0j(-147132913)) == null) {
                    return;
                }
                C1DY c1dy2 = this.A00;
                C1DV c1dv = c1dy2.A00;
                if (c1dv.AXG(A0j, new C0YZ(User.class)) == null) {
                    return;
                }
                UserSession userSession2 = this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36322882020584163L)) {
                    Parcelable.Creator creator = User.CREATOR;
                    A0H = new User(new C39891tD(immutablePandoUserDict));
                } else {
                    if (C18U.A06(c06090Tz, userSession2, 36327164104161621L) && C18U.A06(c06090Tz, userSession2, 36327164103965010L)) {
                        return;
                    }
                    Parcelable.Creator creator2 = User.CREATOR;
                    A0H = new User(new C39891tD(immutablePandoUserDict)).A0H(new C1DY(c1dv, 6, false));
                }
                c1dy2.A00(A0H);
            }

            @Override // com.instagram.pando.consistency.impl.IgPandoPublishPostProcessor
            public final void onStart() {
                this.A00.A01.clear();
            }

            {
                this.A01 = userSession;
                this.A00 = c1dy;
            }
        })));
        return new PandoGraphQLConsistencyJNI(create2);
    }
}
