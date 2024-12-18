package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187128Rf implements C82M {
    public Integer A00;
    public String A01;
    public final C1810981l A02;
    public final C8LJ A03;
    public final C8RZ A04;
    public final C8LZ A05;
    public final C185948Mo A06;
    public final C8NU A07;
    public final TargetViewSizeProvider A08;
    public final AnonymousClass840 A09;
    public final C81J A0A;
    public final C8FR A0B;
    public final C8JU A0C;
    public final ClipsCreationDraftViewModel A0D;
    public final C150286pc A0E;
    public final C1828989k A0F;
    public final AbstractC59962oe A0G;
    public final C1815283f A0H;
    public final C183688Ct A0I;
    public final C8HI A0J;
    public final C1812682c A0K;
    public final C8LC A0L;
    public final ClipsCreationViewModel A0M;

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    private EnumC198268pb A00() {
        C1815783k c1815783k;
        C81J c81j = this.A0A;
        UserSession userSession = c81j.A0S;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36323161192934446L) || ((c1815783k = c81j.A0u) != null && c1815783k.A0G)) {
            return this.A09.A02.A02();
        }
        return this.A09.A02.A01();
    }

    public static void A01(final C187128Rf c187128Rf) {
        if (c187128Rf.A09.A02.A01.A07() && c187128Rf.A00().equals(EnumC198268pb.A07) && (c187128Rf.A02.A08.A00 instanceof C81V)) {
            Context A01 = AbstractC53172bz.A01(c187128Rf.A0G.requireContext());
            C81J c81j = c187128Rf.A0A;
            C50674MYs c50674MYs = new C50674MYs(A01, c81j.A0S);
            EnumC60792q3 enumC60792q3 = EnumC60792q3.A03;
            C14360o3.A0B(enumC60792q3, 0);
            c50674MYs.A02 = enumC60792q3;
            c50674MYs.A03(new View.OnClickListener() { // from class: X.AQH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C187128Rf c187128Rf2 = C187128Rf.this;
                    C187128Rf.A03(c187128Rf2, AbstractC166997dE.A0b(), new C9H6(c187128Rf2, 2));
                }
            }, 2131972719);
            c50674MYs.A03(new View.OnClickListener() { // from class: X.AQI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C187128Rf.A02(C187128Rf.this);
                }
            }, 2131972777);
            c50674MYs.A01(new View.OnClickListener() { // from class: X.AQ8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, 2131954754);
            new C31727DwY(c50674MYs).A05(c81j.A05);
            return;
        }
        A04(c187128Rf, true);
    }

    public static void A02(C187128Rf c187128Rf) {
        boolean z;
        if (c187128Rf.A09.A02.A01.A07() && c187128Rf.A00().equals(EnumC198268pb.A07)) {
            Context requireContext = c187128Rf.A0G.requireContext();
            MusicOverlayStickerModel A0T = c187128Rf.A0I.A0T();
            C24031AlO c24031AlO = new C24031AlO(c187128Rf);
            ClipsAudioStore clipsAudioStore = c187128Rf.A0M.A0K;
            if (!clipsAudioStore.A0E()) {
                List list = (List) clipsAudioStore.A0G.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                        if (audioOverlayTrack == null || audioOverlayTrack.A0E != null) {
                        }
                    }
                }
                z = false;
                AbstractC35084Fcv.A01(requireContext, A0T, c24031AlO, z);
                return;
            }
            z = true;
            AbstractC35084Fcv.A01(requireContext, A0T, c24031AlO, z);
            return;
        }
        throw new IllegalStateException("Current captured media is not of valid type CapturedMediaType.Video");
    }

    public static void A03(final C187128Rf c187128Rf, Boolean bool, InterfaceC16660sJ interfaceC16660sJ) {
        EnumC76383bi enumC76383bi;
        String str;
        Boolean bool2;
        C8ZN c8zn;
        AnonymousClass840 anonymousClass840 = c187128Rf.A09;
        C1816783z c1816783z = anonymousClass840.A02;
        EnumC198268pb A01 = c1816783z.A01();
        if (A01 != EnumC198268pb.A04 && A01 != EnumC198268pb.A07) {
            return;
        }
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = c187128Rf.A0D;
        boolean booleanValue = bool.booleanValue();
        C81J c81j = c187128Rf.A0A;
        C5JK A0N = c81j.A0N();
        C1810981l c1810981l = c187128Rf.A02;
        C1828989k c1828989k = c187128Rf.A0F;
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.B2d
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C187128Rf.this.A07.A02();
            }
        };
        C8r2 A00 = c187128Rf.A07.A00();
        C8JU c8ju = c187128Rf.A0C;
        AudioOverlayTrack Bsq = c8ju.Bsq();
        boolean FDT = c8ju.FDT();
        String AoU = c8ju.AoU();
        C24965B2n c24965B2n = new C24965B2n(c8ju);
        C24966B2o c24966B2o = new C24966B2o(c8ju);
        String ASy = c8ju.ASy();
        InterfaceC16820sZ interfaceC16820sZ2 = new InterfaceC16820sZ() { // from class: X.B2p
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C187128Rf.this.A04.A0D(false);
                return null;
            }
        };
        C199008r1 A04 = c187128Rf.A04.A04();
        InterfaceC16820sZ interfaceC16820sZ3 = new InterfaceC16820sZ() { // from class: X.B2q
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C187128Rf.this.A04.A05();
            }
        };
        InterfaceC16820sZ interfaceC16820sZ4 = new InterfaceC16820sZ() { // from class: X.B2r
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C150286pc c150286pc = C187128Rf.this.A0E;
                c150286pc.getClass();
                if (c150286pc.get() == null) {
                    return null;
                }
                return ((C191478dz) c150286pc.get()).A0I;
            }
        };
        C8LJ c8lj = c187128Rf.A03;
        C8FR c8fr = c187128Rf.A0B;
        C185948Mo c185948Mo = c187128Rf.A06;
        TargetViewSizeProvider targetViewSizeProvider = c187128Rf.A08;
        String str2 = c81j.A2D;
        UserSession userSession = c81j.A0S;
        C14360o3.A0B(userSession, 1);
        String A02 = AbstractC178007vZ.A02(userSession, str2, C16930sl.A00);
        C24970B2s c24970B2s = new C24970B2s(c81j);
        InterfaceC16660sJ interfaceC16660sJ2 = new InterfaceC16660sJ() { // from class: X.B3c
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                C187128Rf.this.A01 = (String) obj;
                return C0eB.A00;
            }
        };
        InterfaceC16820sZ interfaceC16820sZ5 = new InterfaceC16820sZ() { // from class: X.B2e
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C81J c81j2 = C187128Rf.this.A0A;
                return new C9C9(c81j2.A2J, c81j2.A2K, 2);
            }
        };
        C24957B2f c24957B2f = new C24957B2f(c81j);
        C24963B2l c24963B2l = new C24963B2l(c81j);
        C24964B2m c24964B2m = new C24964B2m(c81j);
        ACRType aCRType = c1816783z.A01.A01;
        boolean z = false;
        if (c81j.A0k != null) {
            z = true;
        }
        if (!c81j.A3O && !c81j.A3p) {
            PendingRecipient pendingRecipient = c81j.A1S;
            if (pendingRecipient != null && pendingRecipient.A0Y) {
                enumC76383bi = EnumC76383bi.A0C;
            } else {
                enumC76383bi = null;
            }
        } else {
            enumC76383bi = EnumC76383bi.A07;
        }
        String str3 = c81j.A2V;
        String str4 = c81j.A2T;
        C9LQ c9lq = c81j.A13;
        if (c9lq != null) {
            str = c9lq.A0D;
        } else {
            str = null;
        }
        if (c81j.A3p) {
            bool2 = false;
        } else {
            bool2 = null;
        }
        ArrayList arrayList = new ArrayList();
        PendingRecipient pendingRecipient2 = c81j.A1S;
        if (pendingRecipient2 == null) {
            Parcelable.Creator creator = PendingRecipient.CREATOR;
            pendingRecipient2 = new PendingRecipient(C17060sy.A01.A01(c81j.A0S));
        }
        arrayList.add(pendingRecipient2);
        C14360o3.A0B(A0N, 1);
        C14360o3.A0B(c1810981l, 2);
        C14360o3.A0B(AoU, 8);
        C14360o3.A0B(c8lj, 17);
        C14360o3.A0B(c8fr, 18);
        C14360o3.A0B(c185948Mo, 19);
        C14360o3.A0B(targetViewSizeProvider, 20);
        InterfaceC16820sZ interfaceC16820sZ6 = clipsCreationDraftViewModel.A0O;
        if (interfaceC16820sZ6 == null || (c8zn = (C8ZN) interfaceC16820sZ6.invoke()) == null) {
            return;
        }
        C141796aw A002 = AbstractC141776au.A00(clipsCreationDraftViewModel);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(aCRType, c1810981l, c8lj, targetViewSizeProvider, anonymousClass840, c8fr, c185948Mo, A04, A00, clipsCreationDraftViewModel, A0N, c8zn, c1828989k, enumC76383bi, Bsq, bool2, AoU, ASy, A02, str3, str4, str, arrayList, null, interfaceC16820sZ, c24965B2n, c24966B2o, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, c24970B2s, interfaceC16820sZ5, c24957B2f, c24963B2l, c24964B2m, interfaceC16660sJ, interfaceC16660sJ2, booleanValue, FDT, z, false), A002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (r3.hasNext() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r9 = (android.graphics.drawable.Drawable) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if ((r9 instanceof X.C210399Se) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r9 = (X.C210399Se) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (r9 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r5.remove(r9);
        r8 = r9.getIntrinsicWidth();
        r3 = r9.getIntrinsicHeight();
        r12 = new X.C195868lW(r9.A0B, r8, r3, 0);
        r2 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r11 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        r12.A0F = r2;
        r12.A1C = r11;
        r0.A03 = new X.C199758sR(r8, r3);
        r0.A0D = X.C185948Mo.A03(r0, r12);
        r11 = r0.A0o;
        r11.A0A(r8, r3, r12.A09, false);
        r11 = r11.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r11 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r10 = ((X.C8NW) r10.get()).A1l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (r10.getInteractiveDrawables().size() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        r10 = r10.A0V(android.graphics.drawable.Drawable.class);
        r14 = r10.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if (r14.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        r12 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if ((r12 instanceof X.C202658xj) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        if ((r12 instanceof X.C216259hi) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        if (r10.get(r12) == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r12 = (X.C202278x7) r10.get(r12);
        r2 = r12.A06;
        r13 = r11.A08;
        r13.A01 = r2;
        r13.A00 = r12.A05;
        r11.A04(r12.A01);
        r11.A05(r12.A02);
        r11.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        if (r4.A03() == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r4.A03().A0I == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        r10 = r4.A03().A0I.A02;
        r0.A0C = X.C9OA.A01(X.AHL.A00(X.C05F.A0N, X.C05F.A00, X.AbstractC224629vn.A00(((java.lang.Number) r10.get(0)).intValue()), X.AbstractC224629vn.A00(((java.lang.Number) r10.get(1)).intValue()), r8, r3, r9.A03.A02, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        if (r3 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r9, 36323161192934446L) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r5 = new java.util.LinkedHashMap(((X.C8NW) r10.get()).A1A());
        r3 = r5.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0048, code lost:
    
        if (r2.A0G != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C187128Rf r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187128Rf.A04(X.8Rf, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b2, code lost:
    
        if (r16 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (r6 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.C187128Rf r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187128Rf.A05(X.8Rf, boolean, boolean):void");
    }

    public final void A06() {
        if (Build.VERSION.SDK_INT < 33) {
            C81J c81j = this.A0A;
            Activity activity = c81j.A05;
            String A00 = AbstractC43591JPw.A00(2);
            if (!AbstractC23451Ch.A07(activity, A00)) {
                AbstractC23451Ch.A04(c81j.A05, new InterfaceC23471Cj() { // from class: X.AdQ
                    @Override // X.InterfaceC23471Cj
                    public final void DYE(Map map) {
                        C187128Rf c187128Rf = C187128Rf.this;
                        Integer num = c187128Rf.A00;
                        num.getClass();
                        if (num.equals(C05F.A00)) {
                            String A002 = AbstractC43591JPw.A00(2);
                            if (EnumC172127lh.A04.equals(map.get(A002))) {
                                C9GR.A0F(c187128Rf.A0A.A05, MSV.A00(1562), 2131972727);
                            } else {
                                if (!EnumC172127lh.A05.equals(map.get(A002))) {
                                    return;
                                }
                                C187128Rf.A01(c187128Rf);
                            }
                        }
                    }
                }, A00);
                this.A00 = C05F.A00;
                return;
            }
        }
        A01(this);
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    public C187128Rf(C1815283f c1815283f, C1810981l c1810981l, C8LJ c8lj, C8RZ c8rz, C8LZ c8lz, C183688Ct c183688Ct, C185948Mo c185948Mo, C8NU c8nu, TargetViewSizeProvider targetViewSizeProvider, C8HI c8hi, AnonymousClass840 anonymousClass840, C81J c81j, C1812682c c1812682c, C8FR c8fr, C8LC c8lc, C8JU c8ju, ClipsCreationViewModel clipsCreationViewModel, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C150286pc c150286pc, C1828989k c1828989k) {
        this.A0A = c81j;
        c81j.A0M.getClass();
        this.A0G = c81j.A0M;
        this.A09 = anonymousClass840;
        this.A02 = c1810981l;
        this.A0I = c183688Ct;
        this.A0M = clipsCreationViewModel;
        this.A0D = clipsCreationDraftViewModel;
        this.A0F = c1828989k;
        this.A07 = c8nu;
        this.A0C = c8ju;
        this.A05 = c8lz;
        this.A06 = c185948Mo;
        this.A0J = c8hi;
        this.A0B = c8fr;
        this.A0H = c1815283f;
        this.A0L = c8lc;
        this.A0K = c1812682c;
        this.A04 = c8rz;
        this.A0E = c150286pc;
        this.A03 = c8lj;
        this.A08 = targetViewSizeProvider;
    }
}
