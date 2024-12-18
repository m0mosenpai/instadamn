package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass840;
import X.C0eB;
import X.C15370ps;
import X.C1810981l;
import X.C1828989k;
import X.C199008r1;
import X.C5JK;
import X.C84B;
import X.C8FR;
import X.C8LJ;
import X.C8MF;
import X.C8ZN;
import X.C8r2;
import X.C9JS;
import X.EnumC76383bi;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1", f = "ClipsCreationDraftViewModel.kt", i = {0}, l = {806, 855}, m = "invokeSuspend", n = {"mutation"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ ACRType A02;
    public final /* synthetic */ C1810981l A03;
    public final /* synthetic */ C8LJ A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ AnonymousClass840 A06;
    public final /* synthetic */ C8FR A07;
    public final /* synthetic */ C8MF A08;
    public final /* synthetic */ C199008r1 A09;
    public final /* synthetic */ C8r2 A0A;
    public final /* synthetic */ ClipsCreationDraftViewModel A0B;
    public final /* synthetic */ C5JK A0C;
    public final /* synthetic */ C8ZN A0D;
    public final /* synthetic */ C1828989k A0E;
    public final /* synthetic */ EnumC76383bi A0F;
    public final /* synthetic */ AudioOverlayTrack A0G;
    public final /* synthetic */ Boolean A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ List A0O;
    public final /* synthetic */ InterfaceC16820sZ A0P;
    public final /* synthetic */ InterfaceC16820sZ A0Q;
    public final /* synthetic */ InterfaceC16820sZ A0R;
    public final /* synthetic */ InterfaceC16820sZ A0S;
    public final /* synthetic */ InterfaceC16820sZ A0T;
    public final /* synthetic */ InterfaceC16820sZ A0U;
    public final /* synthetic */ InterfaceC16820sZ A0V;
    public final /* synthetic */ InterfaceC16820sZ A0W;
    public final /* synthetic */ InterfaceC16820sZ A0X;
    public final /* synthetic */ InterfaceC16820sZ A0Y;
    public final /* synthetic */ InterfaceC16820sZ A0Z;
    public final /* synthetic */ InterfaceC16660sJ A0a;
    public final /* synthetic */ boolean A0b;
    public final /* synthetic */ boolean A0c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1(ACRType aCRType, C1810981l c1810981l, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8FR c8fr, C8MF c8mf, C199008r1 c199008r1, C8r2 c8r2, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, C8ZN c8zn, C1828989k c1828989k, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A0B = clipsCreationDraftViewModel;
        this.A0C = c5jk;
        this.A0D = c8zn;
        this.A03 = c1810981l;
        this.A0E = c1828989k;
        this.A0W = interfaceC16820sZ;
        this.A0A = c8r2;
        this.A0G = audioOverlayTrack;
        this.A0c = z;
        this.A0J = str;
        this.A0X = interfaceC16820sZ2;
        this.A0R = interfaceC16820sZ3;
        this.A0K = str2;
        this.A0V = interfaceC16820sZ4;
        this.A09 = c199008r1;
        this.A0U = interfaceC16820sZ5;
        this.A06 = anonymousClass840;
        this.A0Y = interfaceC16820sZ6;
        this.A04 = c8lj;
        this.A07 = c8fr;
        this.A08 = c8mf;
        this.A05 = targetViewSizeProvider;
        this.A0I = str3;
        this.A0T = interfaceC16820sZ7;
        this.A0a = interfaceC16660sJ;
        this.A0Q = interfaceC16820sZ8;
        this.A0S = interfaceC16820sZ9;
        this.A0Z = interfaceC16820sZ10;
        this.A0P = interfaceC16820sZ11;
        this.A02 = aCRType;
        this.A0b = z2;
        this.A0F = enumC76383bi;
        this.A0M = str4;
        this.A0L = str5;
        this.A0N = str6;
        this.A0H = bool;
        this.A0O = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A0B;
        C5JK c5jk = this.A0C;
        C8ZN c8zn = this.A0D;
        C1810981l c1810981l = this.A03;
        C1828989k c1828989k = this.A0E;
        InterfaceC16820sZ interfaceC16820sZ = this.A0W;
        C8r2 c8r2 = this.A0A;
        AudioOverlayTrack audioOverlayTrack = this.A0G;
        boolean z = this.A0c;
        String str = this.A0J;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A0X;
        InterfaceC16820sZ interfaceC16820sZ3 = this.A0R;
        String str2 = this.A0K;
        InterfaceC16820sZ interfaceC16820sZ4 = this.A0V;
        C199008r1 c199008r1 = this.A09;
        InterfaceC16820sZ interfaceC16820sZ5 = this.A0U;
        AnonymousClass840 anonymousClass840 = this.A06;
        InterfaceC16820sZ interfaceC16820sZ6 = this.A0Y;
        C8LJ c8lj = this.A04;
        C8FR c8fr = this.A07;
        C8MF c8mf = this.A08;
        TargetViewSizeProvider targetViewSizeProvider = this.A05;
        String str3 = this.A0I;
        InterfaceC16820sZ interfaceC16820sZ7 = this.A0T;
        InterfaceC16660sJ interfaceC16660sJ = this.A0a;
        InterfaceC16820sZ interfaceC16820sZ8 = this.A0Q;
        InterfaceC16820sZ interfaceC16820sZ9 = this.A0S;
        InterfaceC16820sZ interfaceC16820sZ10 = this.A0Z;
        InterfaceC16820sZ interfaceC16820sZ11 = this.A0P;
        ACRType aCRType = this.A02;
        boolean z2 = this.A0b;
        return new ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, clipsCreationDraftViewModel, c5jk, c8zn, c1828989k, this.A0F, audioOverlayTrack, this.A0H, str, str2, str3, this.A0M, this.A0L, this.A0N, this.A0O, interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, z, z2);
    }

    @DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1$1", f = "ClipsCreationDraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public final /* synthetic */ ACRType A00;
        public final /* synthetic */ C1810981l A01;
        public final /* synthetic */ C8LJ A02;
        public final /* synthetic */ TargetViewSizeProvider A03;
        public final /* synthetic */ AnonymousClass840 A04;
        public final /* synthetic */ C8FR A05;
        public final /* synthetic */ C8MF A06;
        public final /* synthetic */ C199008r1 A07;
        public final /* synthetic */ C8r2 A08;
        public final /* synthetic */ ClipsCreationDraftViewModel A09;
        public final /* synthetic */ C8ZN A0A;
        public final /* synthetic */ C1828989k A0B;
        public final /* synthetic */ EnumC76383bi A0C;
        public final /* synthetic */ AudioOverlayTrack A0D;
        public final /* synthetic */ Boolean A0E;
        public final /* synthetic */ String A0F;
        public final /* synthetic */ String A0G;
        public final /* synthetic */ String A0H;
        public final /* synthetic */ String A0I;
        public final /* synthetic */ String A0J;
        public final /* synthetic */ String A0K;
        public final /* synthetic */ List A0L;
        public final /* synthetic */ InterfaceC16820sZ A0M;
        public final /* synthetic */ InterfaceC16820sZ A0N;
        public final /* synthetic */ InterfaceC16820sZ A0O;
        public final /* synthetic */ InterfaceC16820sZ A0P;
        public final /* synthetic */ InterfaceC16820sZ A0Q;
        public final /* synthetic */ InterfaceC16820sZ A0R;
        public final /* synthetic */ InterfaceC16820sZ A0S;
        public final /* synthetic */ InterfaceC16820sZ A0T;
        public final /* synthetic */ InterfaceC16820sZ A0U;
        public final /* synthetic */ InterfaceC16820sZ A0V;
        public final /* synthetic */ InterfaceC16820sZ A0W;
        public final /* synthetic */ InterfaceC16660sJ A0X;
        public final /* synthetic */ C15370ps A0Y;
        public final /* synthetic */ boolean A0Z;
        public final /* synthetic */ boolean A0a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ACRType aCRType, C1810981l c1810981l, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8FR c8fr, C8MF c8mf, C199008r1 c199008r1, C8r2 c8r2, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C8ZN c8zn, C1828989k c1828989k, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, boolean z, boolean z2) {
            super(2, interfaceC23621Ds);
            this.A0Y = c15370ps;
            this.A0A = c8zn;
            this.A09 = clipsCreationDraftViewModel;
            this.A01 = c1810981l;
            this.A0B = c1828989k;
            this.A0T = interfaceC16820sZ;
            this.A08 = c8r2;
            this.A0D = audioOverlayTrack;
            this.A0a = z;
            this.A0G = str;
            this.A0U = interfaceC16820sZ2;
            this.A0O = interfaceC16820sZ3;
            this.A0H = str2;
            this.A0S = interfaceC16820sZ4;
            this.A07 = c199008r1;
            this.A0R = interfaceC16820sZ5;
            this.A04 = anonymousClass840;
            this.A0V = interfaceC16820sZ6;
            this.A02 = c8lj;
            this.A05 = c8fr;
            this.A06 = c8mf;
            this.A03 = targetViewSizeProvider;
            this.A0F = str3;
            this.A0Q = interfaceC16820sZ7;
            this.A0X = interfaceC16660sJ;
            this.A0N = interfaceC16820sZ8;
            this.A0P = interfaceC16820sZ9;
            this.A0W = interfaceC16820sZ10;
            this.A0M = interfaceC16820sZ11;
            this.A00 = aCRType;
            this.A0Z = z2;
            this.A0C = enumC76383bi;
            this.A0J = str4;
            this.A0I = str5;
            this.A0K = str6;
            this.A0E = bool;
            this.A0L = list;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            C15370ps c15370ps = this.A0Y;
            C8ZN c8zn = this.A0A;
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A09;
            C1810981l c1810981l = this.A01;
            C1828989k c1828989k = this.A0B;
            InterfaceC16820sZ interfaceC16820sZ = this.A0T;
            C8r2 c8r2 = this.A08;
            AudioOverlayTrack audioOverlayTrack = this.A0D;
            boolean z = this.A0a;
            String str = this.A0G;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0U;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A0O;
            String str2 = this.A0H;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A0S;
            C199008r1 c199008r1 = this.A07;
            InterfaceC16820sZ interfaceC16820sZ5 = this.A0R;
            AnonymousClass840 anonymousClass840 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ6 = this.A0V;
            C8LJ c8lj = this.A02;
            C8FR c8fr = this.A05;
            C8MF c8mf = this.A06;
            TargetViewSizeProvider targetViewSizeProvider = this.A03;
            String str3 = this.A0F;
            InterfaceC16820sZ interfaceC16820sZ7 = this.A0Q;
            InterfaceC16660sJ interfaceC16660sJ = this.A0X;
            InterfaceC16820sZ interfaceC16820sZ8 = this.A0N;
            InterfaceC16820sZ interfaceC16820sZ9 = this.A0P;
            InterfaceC16820sZ interfaceC16820sZ10 = this.A0W;
            InterfaceC16820sZ interfaceC16820sZ11 = this.A0M;
            ACRType aCRType = this.A00;
            boolean z2 = this.A0Z;
            return new AnonymousClass1(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, clipsCreationDraftViewModel, c8zn, c1828989k, this.A0C, audioOverlayTrack, this.A0E, str, str2, str3, this.A0J, this.A0I, this.A0K, this.A0L, interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, c15370ps, z, z2);
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            AbstractC09560e7.A00(obj);
            C15370ps c15370ps = this.A0Y;
            C8ZN c8zn = this.A0A;
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A09;
            Context context = clipsCreationDraftViewModel.A04;
            UserSession userSession = clipsCreationDraftViewModel.A0D;
            ClipsCreationViewModel clipsCreationViewModel = clipsCreationDraftViewModel.A0E;
            C84B c84b = (C84B) clipsCreationViewModel.A0G.A02();
            String str = clipsCreationViewModel.A0S;
            C1810981l c1810981l = this.A01;
            Integer A0A = c1810981l.A0A();
            Set set = (Set) c1810981l.A09.A00;
            C9JS A00 = this.A0B.A00();
            ClipsTemplateModel clipsTemplateModel = clipsCreationDraftViewModel.A0F.A05;
            InterfaceC16820sZ interfaceC16820sZ = this.A0T;
            C8r2 c8r2 = this.A08;
            AudioOverlayTrack audioOverlayTrack = this.A0D;
            boolean z = this.A0a;
            String str2 = this.A0G;
            List list = (List) this.A0U.invoke();
            List list2 = (List) this.A0O.invoke();
            String str3 = this.A0H;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0S;
            C199008r1 c199008r1 = this.A07;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A0R;
            AnonymousClass840 anonymousClass840 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A0V;
            C8LJ c8lj = this.A02;
            C8FR c8fr = this.A05;
            C8MF c8mf = this.A06;
            TargetViewSizeProvider targetViewSizeProvider = this.A03;
            String str4 = this.A0F;
            InterfaceC16820sZ interfaceC16820sZ5 = this.A0Q;
            InterfaceC16660sJ interfaceC16660sJ = this.A0X;
            InterfaceC16820sZ interfaceC16820sZ6 = this.A0N;
            InterfaceC16820sZ interfaceC16820sZ7 = this.A0P;
            InterfaceC16820sZ interfaceC16820sZ8 = this.A0W;
            InterfaceC16820sZ interfaceC16820sZ9 = this.A0M;
            ACRType aCRType = this.A00;
            boolean z2 = this.A0Z;
            c15370ps.A00 = c8zn.A00(context, aCRType, clipsTemplateModel, userSession, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, A00, c84b, this.A0C, audioOverlayTrack, this.A0E, A0A, str, str2, str3, str4, this.A0J, this.A0I, this.A0K, list, list2, this.A0L, set, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16660sJ, z, z2, false, false);
            return C0eB.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011b A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ps, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
