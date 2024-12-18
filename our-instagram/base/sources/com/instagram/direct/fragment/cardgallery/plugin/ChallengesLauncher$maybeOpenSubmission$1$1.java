package com.instagram.direct.fragment.cardgallery.plugin;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC31171DnF;
import X.AbstractC34777FUb;
import X.AbstractC86593tX;
import X.AnonymousClass988;
import X.C05F;
import X.C09530e4;
import X.C0eB;
import X.C158797Aq;
import X.C2EY;
import X.C35169FfL;
import X.C3NX;
import X.C3NY;
import X.C76S;
import X.C76T;
import X.C7IH;
import X.E6B;
import X.InterfaceC164957Zk;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.cardgallery.plugin.ChallengesLauncher$maybeOpenSubmission$1$1", f = "ChallengesLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChallengesLauncher$maybeOpenSubmission$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesLauncher$maybeOpenSubmission$1$1(Context context, UserSession userSession, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(2, interfaceC23621Ds);
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ChallengesLauncher$maybeOpenSubmission$1$1 challengesLauncher$maybeOpenSubmission$1$1 = new ChallengesLauncher$maybeOpenSubmission$1$1(this.A01, this.A02, this.A05, this.A03, this.A04, interfaceC23621Ds, this.A07, this.A06);
        challengesLauncher$maybeOpenSubmission$1$1.A00 = obj;
        return challengesLauncher$maybeOpenSubmission$1$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChallengesLauncher$maybeOpenSubmission$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C09530e4 c09530e4;
        C35169FfL c35169FfL;
        ImmutableList immutableList;
        AbstractC09560e7.A00(obj);
        C3NY c3ny = (C3NY) this.A00;
        if ((c3ny instanceof C3NX) && (c09530e4 = (C09530e4) ((C3NX) c3ny).A00) != null && (c35169FfL = (C35169FfL) c09530e4.A00) != null && (immutableList = (ImmutableList) c09530e4.A01) != null) {
            AnonymousClass988 anonymousClass988 = (AnonymousClass988) this.A07.invoke();
            InterfaceC164957Zk interfaceC164957Zk = (InterfaceC164957Zk) this.A06.invoke();
            Context context = this.A01;
            UserSession userSession = this.A02;
            C76T A00 = C76S.A00(context, userSession);
            String str = this.A05;
            C158797Aq A03 = A00.A03(userSession, c35169FfL, new DirectThreadKey(str, null), null, null, this.A03, "challenges", false, false);
            String str2 = this.A04;
            Resources A0M = AbstractC166997dE.A0M(context);
            String A05 = c35169FfL.A05();
            String str3 = userSession.userId;
            C7IH c7ih = AbstractC86593tX.A07(context, anonymousClass988, false).A04;
            boolean A1W = AbstractC31171DnF.A1W(userSession, c35169FfL.A07());
            C2EY c2ey = C2EY.A0a;
            new Integer(29);
            A03.A00 = AbstractC34777FUb.A01(A0M, immutableList, userSession, anonymousClass988, c7ih, c2ey, new Long(AbstractC166987dD.A0L(c35169FfL.A01())), A05, "challenges", str, str3, str2, A1W);
            interfaceC164957Zk.CrH(null, new E6B(new RectF(), 0.0f), C05F.A0C, AbstractC166987dD.A1J(A03), 0, false, true);
        }
        return C0eB.A00;
    }
}
