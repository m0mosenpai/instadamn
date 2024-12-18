package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC09440dt;
import X.AbstractC141776au;
import X.AbstractC183338Bg;
import X.AbstractC193598he;
import X.AbstractC23641Du;
import X.AbstractC46690Kl9;
import X.AbstractC52922bZ;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0eB;
import X.C10E;
import X.C128175qm;
import X.C12L;
import X.C141796aw;
import X.C14360o3;
import X.C1828989k;
import X.C183558Ce;
import X.C183568Cf;
import X.C183578Cg;
import X.C187398Sh;
import X.C193618hh;
import X.C19K;
import X.C19L;
import X.C1JX;
import X.C206649Cv;
import X.C22P;
import X.C23580Aca;
import X.C23890Ahj;
import X.C23896Ahp;
import X.C2GS;
import X.C2GT;
import X.C57160PZe;
import X.C58252li;
import X.C5JK;
import X.C75F;
import X.C75M;
import X.C89P;
import X.C8A8;
import X.C8Ch;
import X.C8ZT;
import X.C9BW;
import X.C9DH;
import X.C9ES;
import X.C9JS;
import X.EnumC50651MXr;
import X.EnumC76383bi;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC58362lv;
import X.O02;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ClipsCreationDraftViewModel extends AbstractC52922bZ implements C75F {
    public C128175qm A00;
    public EnumC76383bi A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C2GT A05;
    public final C58252li A06;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final UserSession A0D;
    public final ClipsCreationViewModel A0E;
    public final C89P A0F;
    public final ClipsDraftRepository A0G;
    public final C193618hh A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC16820sZ A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C183558Ce A0S;
    public final C1828989k A0T;
    public final C19L A0U;

    public ClipsCreationDraftViewModel(Context context, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C89P c89p, ClipsDraftRepository clipsDraftRepository, C1828989k c1828989k, C193618hh c193618hh, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(clipsDraftRepository, 2);
        C14360o3.A0B(clipsCreationViewModel, 3);
        C14360o3.A0B(c193618hh, 4);
        C14360o3.A0B(c89p, 5);
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(c1828989k, 8);
        this.A04 = context;
        this.A0G = clipsDraftRepository;
        this.A0E = clipsCreationViewModel;
        this.A0H = c193618hh;
        this.A0F = c89p;
        this.A0D = userSession;
        this.A0O = interfaceC16820sZ;
        this.A0T = c1828989k;
        this.A0J = AbstractC09440dt.A01(new C9ES(this, 40));
        C58252li c58252li = new C58252li();
        this.A06 = c58252li;
        this.A0C = new C2GS();
        this.A0B = new C2GS();
        this.A08 = new C2GS();
        this.A09 = new C2GS();
        C2GS c2gs = new C2GS();
        this.A07 = c2gs;
        this.A0P = C10E.A00(null);
        this.A0R = new C008002u(new C8A8(false));
        this.A0Q = new C008002u(new C8A8(false));
        this.A0N = AbstractC09440dt.A01(new C9ES(this, 44));
        C19K A02 = AnonymousClass194.A02(C12L.A00.A04);
        this.A0U = A02;
        this.A0L = AbstractC09440dt.A01(new C9ES(this, 42));
        this.A0I = AbstractC09440dt.A01(new C9ES(this, 39));
        this.A0K = AbstractC09440dt.A01(new C9ES(this, 41));
        this.A0M = AbstractC09440dt.A01(new C9ES(this, 43));
        C183558Ce c183558Ce = new C183558Ce(this);
        this.A0S = c183558Ce;
        this.A05 = C75M.A01(c2gs, C183568Cf.A00);
        this.A0A = new C2GS();
        clipsCreationViewModel.A06 = new C9ES(this, 38);
        C206649Cv c206649Cv = new C206649Cv(this, null, 1);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c206649Cv, A02);
        AbstractC23641Du.A03(num, anonymousClass191, new C206649Cv(this, null, 2), A02);
        AbstractC23641Du.A03(num, anonymousClass191, new C206649Cv(this, null, 3), AbstractC141776au.A00(this));
        clipsCreationViewModel.A0I.A09((InterfaceC58362lv) this.A0M.getValue());
        ((C2GT) clipsCreationViewModel.A0T.getValue()).A09((InterfaceC58362lv) this.A0K.getValue());
        clipsCreationViewModel.A02 = c183558Ce;
        c58252li.A0E(this.A0G.A02, new C8Ch(new C183578Cg(this)));
    }

    public final C128175qm A09(String str) {
        if (str == null) {
            return null;
        }
        C128175qm A00 = A00(this);
        if (C14360o3.A0K(A00 != null ? A00.A0T : null, str)) {
            return A00(this);
        }
        return this.A0H.A00(str);
    }

    public final void A0D(FragmentActivity fragmentActivity, C22P c22p, InterfaceC16820sZ interfaceC16820sZ) {
        C9BW c9bw;
        C128175qm c128175qm;
        C9JS c9js;
        C14360o3.A0B(c22p, 0);
        C8A8 c8a8 = (C8A8) this.A0C.A02();
        if (c8a8 != null && (c9bw = (C9BW) c8a8.A01) != null && (c128175qm = (C128175qm) c9bw.A00) != null && (c9js = c128175qm.A0E) != null) {
            AbstractC46690Kl9.A00(this.A0D, new C23890Ahj(fragmentActivity, c22p, c9js, this), c9js.A09);
        } else {
            interfaceC16820sZ.invoke();
            A0B();
        }
    }

    public final void A0E(C5JK c5jk) {
        C14360o3.A0B(c5jk, 0);
        this.A01 = null;
        this.A0G.A0L();
        if (!A0G()) {
            A0F(c5jk, null, false);
        }
    }

    public final void A0F(C5JK c5jk, PendingRecipient pendingRecipient, boolean z) {
        AbstractC193598he abstractC193598he;
        int i;
        C14360o3.A0B(c5jk, 0);
        if (z || (abstractC193598he = (AbstractC193598he) this.A0G.A02.A02()) == null || (i = abstractC193598he.A00) == 0 || i == 1 || ((C128175qm) abstractC193598he.A00()).A0H != c5jk) {
            C141796aw A00 = AbstractC141776au.A00(this);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DH(this, pendingRecipient, c5jk, null, 35), A00);
        }
    }

    public static final C128175qm A00(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        AbstractC193598he abstractC193598he = (AbstractC193598he) clipsCreationDraftViewModel.A0G.A02.A02();
        if (abstractC193598he != null && abstractC193598he.A00 == 3) {
            return (C128175qm) abstractC193598he.A00();
        }
        return null;
    }

    public static final C128175qm A01(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        C2GS c2gs = clipsCreationDraftViewModel.A0G.A02;
        if (c2gs.A02() != null && c2gs.A02() != null) {
            Object A02 = c2gs.A02();
            C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.model.Resource<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.models.ClipsDraft>");
            if (((AbstractC193598he) A02).A00 == 3) {
                Object A022 = c2gs.A02();
                C14360o3.A0C(A022, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.model.Resource<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.models.ClipsDraft>");
                return (C128175qm) ((AbstractC193598he) A022).A00();
            }
            return null;
        }
        return null;
    }

    public static final Object A02(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        Object A07;
        if (c128175qm.A0G == EnumC50651MXr.A02) {
            if (c128175qm.A0v.isEmpty()) {
                A07 = clipsCreationDraftViewModel.A0G.A0C(c128175qm, interfaceC23621Ds);
                if (A07 != C1JX.A02) {
                    A07 = C0eB.A00;
                }
            } else {
                AbstractC183338Bg.A00(clipsCreationDraftViewModel.A0D).A0Q(false, false);
                A07 = clipsCreationDraftViewModel.A07(c128175qm, interfaceC23621Ds, false);
            }
            if (A07 == C1JX.A02) {
                return A07;
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r15, X.C128175qm r16, X.InterfaceC23621Ds r17, X.InterfaceC16660sJ r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A03(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.5qm, X.1Ds, X.0sJ, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8, X.C5JK r9, com.instagram.pendingmedia.model.recipients.PendingRecipient r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.5JK, com.instagram.pendingmedia.model.recipients.PendingRecipient, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r12, X.C5JK r13, com.instagram.pendingmedia.model.recipients.PendingRecipient r14, X.InterfaceC23621Ds r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.5JK, com.instagram.pendingmedia.model.recipients.PendingRecipient, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7, X.C5JK r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 14
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L9d
            r6 = r9
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L47
            if (r0 == r3) goto L69
            if (r0 != r4) goto La4
            X.AbstractC09560e7.A00(r1)
        L2a:
            X.0eB r5 = X.C0eB.A00
            return r5
        L2d:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r7.A0G()
            if (r0 != 0) goto L2a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0G
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r2
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = r0.A05
            java.lang.Object r1 = r0.A04(r8, r6)
            if (r1 != r5) goto L52
            return r5
        L47:
            java.lang.Object r8 = r6.A02
            X.5JK r8 = (X.C5JK) r8
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            X.AbstractC09560e7.A00(r1)
        L52:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L2a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0G
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r3
            java.lang.Object r1 = r0.A0E(r8, r6)
            if (r1 != r5) goto L72
            return r5
        L69:
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            X.AbstractC09560e7.A00(r1)
        L72:
            X.5qm r1 = (X.C128175qm) r1
            r2 = 0
            if (r1 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "handleNewRemix: unsaved draft is null, clips creation type "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsCreationDraftViewModel"
            X.AbstractC12120kG.A06(r0, r1, r2)
            goto L2a
        L8e:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0G
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r4
            java.lang.Object r0 = r0.A0C(r1, r6)
            if (r0 != r5) goto L2a
            return r5
        L9d:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r7, r9, r3)
            goto L16
        La4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.5JK, X.1Ds):java.lang.Object");
    }

    private final Object A07(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Object A0A;
        int i = O02.A00[c128175qm.A0G.ordinal()];
        if (i != 1) {
            if (i == 2) {
                A0A = this.A0G.A0B(c128175qm, new C23896Ahp(this, c128175qm), interfaceC23621Ds, z);
            } else {
                throw new RuntimeException();
            }
        } else {
            A0A = this.A0G.A0A(new C23580Aca(this), c128175qm, interfaceC23621Ds);
        }
        if (A0A != C1JX.A02) {
            return C0eB.A00;
        }
        return A0A;
    }

    public static final String A08(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, PendingRecipient pendingRecipient) {
        AbstractC193598he abstractC193598he;
        List list;
        ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0G;
        C9JS A00 = clipsCreationDraftViewModel.A0T.A00();
        ClipsAudioStore clipsAudioStore = clipsCreationDraftViewModel.A0E.A0K;
        C2GT c2gt = clipsAudioStore.A06;
        AudioOverlayTrack audioOverlayTrack = null;
        if (((c2gt.A02() instanceof C8ZT) || (c2gt.A02() instanceof C187398Sh)) && (abstractC193598he = (AbstractC193598he) c2gt.A02()) != null) {
            audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A00();
        }
        List list2 = (List) clipsAudioStore.A0V.getValue();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC193598he) it.next()).A01);
            }
            list = AbstractC001800i.A0X(arrayList);
        } else {
            list = null;
        }
        return clipsDraftRepository.A0I(A00, c5jk, clipsCreationDraftViewModel.A01, audioOverlayTrack, pendingRecipient, list);
    }

    public final void A0B() {
        C9BW c9bw;
        C8A8 c8a8 = (C8A8) this.A0C.A02();
        if (c8a8 != null && (c9bw = (C9BW) c8a8.A01) != null) {
            this.A0G.A0N((C128175qm) c9bw.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A0G() {
        return C14360o3.A0K(this.A05.A02(), true);
    }

    @Override // X.C75F
    public final Object CCu(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A0G.A0E(c5jk, interfaceC23621Ds);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        AnonymousClass194.A05(null, this.A0U);
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        clipsCreationViewModel.A0I.A08((InterfaceC58362lv) this.A0M.getValue());
        ((C2GT) clipsCreationViewModel.A0T.getValue()).A08((InterfaceC58362lv) this.A0K.getValue());
    }

    public final void A0A() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57160PZe(this, null, 30), A00);
    }

    public final void A0C() {
        if (A00(this) != null) {
            this.A01 = null;
            this.A0G.A0L();
        }
        C5JK c5jk = C5JK.A05;
        if (A00(this) == null) {
            A08(this, c5jk, null);
        }
    }
}
