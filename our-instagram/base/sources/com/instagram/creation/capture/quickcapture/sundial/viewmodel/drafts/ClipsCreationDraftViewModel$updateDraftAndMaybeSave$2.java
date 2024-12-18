package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AnonymousClass840;
import X.BC2;
import X.C0eB;
import X.C128175qm;
import X.C12L;
import X.C14090nZ;
import X.C15370ps;
import X.C1810981l;
import X.C1828989k;
import X.C199008r1;
import X.C1JX;
import X.C5JK;
import X.C84B;
import X.C8FR;
import X.C8LJ;
import X.C8MF;
import X.C8ZN;
import X.C8r2;
import X.C9JS;
import X.EnumC50651MXr;
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
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2", f = "ClipsCreationDraftViewModel.kt", i = {0}, l = {916, 966, 968}, m = "invokeSuspend", n = {"mutation"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2 extends AbstractC23611Dp implements InterfaceC16620sF {
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
    public final /* synthetic */ InterfaceC16660sJ A0b;
    public final /* synthetic */ boolean A0c;
    public final /* synthetic */ boolean A0d;
    public final /* synthetic */ boolean A0e;
    public final /* synthetic */ boolean A0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(ACRType aCRType, C1810981l c1810981l, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8FR c8fr, C8MF c8mf, C199008r1 c199008r1, C8r2 c8r2, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, C8ZN c8zn, C1828989k c1828989k, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, interfaceC23621Ds);
        this.A0B = clipsCreationDraftViewModel;
        this.A0C = c5jk;
        this.A0e = z;
        this.A0a = interfaceC16660sJ;
        this.A0D = c8zn;
        this.A03 = c1810981l;
        this.A0E = c1828989k;
        this.A0W = interfaceC16820sZ;
        this.A0A = c8r2;
        this.A0G = audioOverlayTrack;
        this.A0f = z2;
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
        this.A0b = interfaceC16660sJ2;
        this.A0Q = interfaceC16820sZ8;
        this.A0S = interfaceC16820sZ9;
        this.A0Z = interfaceC16820sZ10;
        this.A0P = interfaceC16820sZ11;
        this.A02 = aCRType;
        this.A0d = z3;
        this.A0F = enumC76383bi;
        this.A0M = str4;
        this.A0L = str5;
        this.A0c = z4;
        this.A0N = str6;
        this.A0H = bool;
        this.A0O = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A0B;
        C5JK c5jk = this.A0C;
        boolean z = this.A0e;
        InterfaceC16660sJ interfaceC16660sJ = this.A0a;
        C8ZN c8zn = this.A0D;
        C1810981l c1810981l = this.A03;
        C1828989k c1828989k = this.A0E;
        InterfaceC16820sZ interfaceC16820sZ = this.A0W;
        C8r2 c8r2 = this.A0A;
        AudioOverlayTrack audioOverlayTrack = this.A0G;
        boolean z2 = this.A0f;
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
        InterfaceC16660sJ interfaceC16660sJ2 = this.A0b;
        InterfaceC16820sZ interfaceC16820sZ8 = this.A0Q;
        InterfaceC16820sZ interfaceC16820sZ9 = this.A0S;
        InterfaceC16820sZ interfaceC16820sZ10 = this.A0Z;
        InterfaceC16820sZ interfaceC16820sZ11 = this.A0P;
        ACRType aCRType = this.A02;
        boolean z3 = this.A0d;
        EnumC76383bi enumC76383bi = this.A0F;
        String str4 = this.A0M;
        String str5 = this.A0L;
        boolean z4 = this.A0c;
        return new ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, clipsCreationDraftViewModel, c5jk, c8zn, c1828989k, enumC76383bi, audioOverlayTrack, this.A0H, str, str2, str3, str4, str5, this.A0N, this.A0O, interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, interfaceC16660sJ2, z, z2, z3, z4);
    }

    @DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2$1", f = "ClipsCreationDraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2$1, reason: invalid class name */
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
        public final /* synthetic */ boolean A0b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ACRType aCRType, C1810981l c1810981l, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8FR c8fr, C8MF c8mf, C199008r1 c199008r1, C8r2 c8r2, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C8ZN c8zn, C1828989k c1828989k, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, boolean z, boolean z2, boolean z3) {
            super(2, interfaceC23621Ds);
            this.A0Y = c15370ps;
            this.A0A = c8zn;
            this.A09 = clipsCreationDraftViewModel;
            this.A01 = c1810981l;
            this.A0B = c1828989k;
            this.A0T = interfaceC16820sZ;
            this.A08 = c8r2;
            this.A0D = audioOverlayTrack;
            this.A0b = z;
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
            this.A0a = z2;
            this.A0C = enumC76383bi;
            this.A0J = str4;
            this.A0I = str5;
            this.A0Z = z3;
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
            boolean z = this.A0b;
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
            boolean z2 = this.A0a;
            EnumC76383bi enumC76383bi = this.A0C;
            String str4 = this.A0J;
            String str5 = this.A0I;
            boolean z3 = this.A0Z;
            return new AnonymousClass1(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, clipsCreationDraftViewModel, c8zn, c1828989k, enumC76383bi, audioOverlayTrack, this.A0E, str, str2, str3, str4, str5, this.A0K, this.A0L, interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, c15370ps, z, z2, z3);
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
            boolean z = this.A0b;
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
            boolean z2 = this.A0a;
            EnumC76383bi enumC76383bi = this.A0C;
            String str5 = this.A0J;
            String str6 = this.A0I;
            boolean z3 = this.A0Z;
            c15370ps.A00 = c8zn.A00(context, aCRType, clipsTemplateModel, userSession, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, A00, c84b, enumC76383bi, audioOverlayTrack, this.A0E, A0A, str, str2, str3, str4, str5, str6, this.A0K, list, list2, this.A0L, set, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16660sJ, z, z2, true, z3);
            return C0eB.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ps, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        EnumC50651MXr enumC50651MXr;
        C15370ps c15370ps;
        Object A0G;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            C15370ps c15370ps2 = (C15370ps) this.A01;
            AbstractC09560e7.A00(obj);
            c15370ps = c15370ps2;
        } else {
            AbstractC09560e7.A00(obj);
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A0B;
            if (ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel) == null) {
                clipsCreationDraftViewModel.A0G.A0P(this.A0C, clipsCreationDraftViewModel.A01);
            }
            C128175qm A00 = ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel);
            if (A00 != null) {
                enumC50651MXr = A00.A0G;
            } else {
                enumC50651MXr = null;
            }
            if (enumC50651MXr == EnumC50651MXr.A02) {
                clipsCreationDraftViewModel.A02 = true;
            }
            ?? obj2 = new Object();
            C14090nZ CPG = C12L.A00.CPG(480314591, 3);
            C8ZN c8zn = this.A0D;
            C1810981l c1810981l = this.A03;
            C1828989k c1828989k = this.A0E;
            InterfaceC16820sZ interfaceC16820sZ = this.A0W;
            C8r2 c8r2 = this.A0A;
            AudioOverlayTrack audioOverlayTrack = this.A0G;
            boolean z = this.A0f;
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
            InterfaceC16660sJ interfaceC16660sJ = this.A0b;
            InterfaceC16820sZ interfaceC16820sZ8 = this.A0Q;
            InterfaceC16820sZ interfaceC16820sZ9 = this.A0S;
            InterfaceC16820sZ interfaceC16820sZ10 = this.A0Z;
            InterfaceC16820sZ interfaceC16820sZ11 = this.A0P;
            ACRType aCRType = this.A02;
            boolean z2 = this.A0d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c8mf, c199008r1, c8r2, clipsCreationDraftViewModel, c8zn, c1828989k, this.A0F, audioOverlayTrack, this.A0H, str, str2, str3, this.A0M, this.A0L, this.A0N, this.A0O, null, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, obj2, z, z2, this.A0c);
            this.A01 = obj2;
            this.A00 = 1;
            c15370ps = obj2;
            if (AbstractC23641Du.A00(this, CPG, anonymousClass1) == c1jx) {
                return c1jx;
            }
        }
        boolean z3 = this.A0e;
        ClipsDraftRepository clipsDraftRepository = this.A0B.A0G;
        BC2 bc2 = (BC2) c15370ps.A00;
        if (z3) {
            InterfaceC16660sJ interfaceC16660sJ2 = this.A0a;
            this.A01 = null;
            this.A00 = 2;
            A0G = clipsDraftRepository.A0F(bc2, null, this, interfaceC16660sJ2, false, false);
        } else {
            this.A01 = null;
            this.A00 = 3;
            A0G = clipsDraftRepository.A0G(bc2, this, false);
        }
        if (A0G == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
