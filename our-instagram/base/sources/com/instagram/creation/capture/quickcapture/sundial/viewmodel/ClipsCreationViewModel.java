package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.AHU;
import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC09440dt;
import X.AbstractC115485Ki;
import X.AbstractC12120kG;
import X.AbstractC141776au;
import X.AbstractC16960so;
import X.AbstractC183338Bg;
import X.AbstractC193598he;
import X.AbstractC226869zi;
import X.AbstractC23641Du;
import X.AbstractC55154OdI;
import X.AbstractC58232lf;
import X.AnonymousClass001;
import X.AnonymousClass057;
import X.AnonymousClass111;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.AnonymousClass825;
import X.AnonymousClass826;
import X.AnonymousClass827;
import X.AnonymousClass848;
import X.C00O;
import X.C013404z;
import X.C01L;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C06160Ug;
import X.C09530e4;
import X.C0UO;
import X.C0eM;
import X.C10E;
import X.C10M;
import X.C10Q;
import X.C115475Kh;
import X.C115525Km;
import X.C128175qm;
import X.C12L;
import X.C141796aw;
import X.C14360o3;
import X.C15430py;
import X.C16930sl;
import X.C1816984b;
import X.C1817884n;
import X.C1818184q;
import X.C1818384s;
import X.C1818484t;
import X.C183348Bh;
import X.C183558Ce;
import X.C185368Kc;
import X.C187148Rh;
import X.C18U;
import X.C190178bb;
import X.C193578hc;
import X.C193588hd;
import X.C193658hl;
import X.C194808jg;
import X.C19L;
import X.C206169Az;
import X.C219499mx;
import X.C24239Ap6;
import X.C2GS;
import X.C2GT;
import X.C36A;
import X.C49602Pt;
import X.C52435NIf;
import X.C56305OzQ;
import X.C58252li;
import X.C5JK;
import X.C5RO;
import X.C5RR;
import X.C74P;
import X.C84A;
import X.C84B;
import X.C84C;
import X.C84D;
import X.C84F;
import X.C84G;
import X.C84R;
import X.C84S;
import X.C8KC;
import X.C8OT;
import X.C8ZT;
import X.C9C2;
import X.C9D3;
import X.C9DE;
import X.C9DZ;
import X.C9EL;
import X.C9M8;
import X.C9M9;
import X.C9O3;
import X.C9ZW;
import X.EnumC189548aZ;
import X.EnumC191648eM;
import X.EnumC192868gS;
import X.EnumC222609s1;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC115495Kj;
import X.InterfaceC15070pN;
import X.InterfaceC16820sZ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.MSV;
import X.PY3;
import X.PZJ;
import android.app.Application;
import android.graphics.drawable.Drawable;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.api.schemas.CreationToolEnum;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ClipsCreationViewModel extends C193578hc implements AnonymousClass848 {
    public CreationToolEnum A00;
    public C187148Rh A01;
    public C183558Ce A02;
    public C5JK A03;
    public AudioOverlayTrack A04;
    public Integer A05;
    public InterfaceC16820sZ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2GT A0A;
    public final C2GT A0B;
    public final C2GT A0C;
    public final C2GT A0D;
    public final C2GT A0E;
    public final C58252li A0F;
    public final C58252li A0G;
    public final C2GS A0H;
    public final C2GS A0I;
    public final UserSession A0J;
    public final ClipsAudioStore A0K;
    public final C84R A0L;
    public final C84S A0M;
    public final C1817884n A0N;
    public final C84G A0O;
    public final C1816984b A0P;
    public final C1818484t A0Q;
    public final C49602Pt A0R;
    public final String A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC19390xP A0U;
    public final InterfaceC06180Ui A0V;
    public final InterfaceC06180Ui A0W;
    public final InterfaceC06180Ui A0X;
    public final InterfaceC06180Ui A0Y;
    public final C05A A0Z;
    public final InterfaceC15070pN A0a;
    public final InterfaceC15070pN A0b;
    public final C0UO A0c;
    public final C84D A0d;
    public final C84A A0e;
    public final AnonymousClass825 A0f;
    public final InterfaceC19390xP A0g;
    public final InterfaceC19390xP A0h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsCreationViewModel(Application application, UserSession userSession, C84A c84a, AnonymousClass825 anonymousClass825, C49602Pt c49602Pt) {
        super(application);
        C14360o3.A0B(anonymousClass825, 3);
        C14360o3.A0B(c49602Pt, 4);
        C14360o3.A0B(c84a, 5);
        this.A0J = userSession;
        this.A0f = anonymousClass825;
        this.A0R = c49602Pt;
        this.A0e = c84a;
        C58252li c58252li = new C58252li();
        c58252li.A0B(new C84B(C16930sl.A00, false));
        this.A0G = c58252li;
        C58252li c58252li2 = new C58252li();
        this.A0F = c58252li2;
        this.A0I = new C2GS();
        this.A0H = new C2GS();
        this.A03 = C5JK.A05;
        Integer num = C05F.A00;
        this.A0W = C10M.A00(num, 0, 0);
        this.A06 = C84C.A00;
        this.A0Z = C10E.A00(null);
        this.A05 = C05F.A0C;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0V = A00;
        this.A0U = A00;
        String obj = UUID.randomUUID().toString();
        this.A0S = obj;
        this.A0d = new C84D(userSession);
        C84F A002 = c84a.A00(obj);
        C84G c84g = A002.A05;
        this.A0O = c84g;
        this.A0c = c84g.A03;
        ClipsAudioStore clipsAudioStore = A002.A01;
        this.A0K = clipsAudioStore;
        this.A0M = A002.A03;
        C1816984b c1816984b = A002.A06;
        this.A0P = c1816984b;
        this.A0L = A002.A02;
        C1817884n c1817884n = A002.A04;
        this.A0N = c1817884n;
        C2GT c2gt = c84g.A00;
        c58252li.A0E(c2gt, new C1818184q(new C9EL(this, 2)));
        c58252li2.A0E(c2gt, new C1818184q(new C9EL(this, 3)));
        this.A0E = clipsAudioStore.A07;
        C0UO c0uo = c1816984b.A05;
        this.A0h = c0uo;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0Y = A003;
        AnonymousClass057 A004 = C10M.A00(num, 0, 0);
        this.A0X = A004;
        C013404z A04 = AnonymousClass111.A04(A004, c0uo);
        this.A0g = A04;
        this.A0a = new C06160Ug(null, A003);
        final C15430py c15430py = new C15430py(C10Q.A03(new C9DE(this, null, 1), A003, A04));
        InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP() { // from class: X.84r
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsCreationViewModel$special$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A0A = AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP);
        this.A0C = AbstractC58232lf.A00(anonymousClass191, c0uo);
        this.A0D = AbstractC58232lf.A00(anonymousClass191, c1816984b.A06);
        this.A0T = AbstractC09440dt.A01(C1818384s.A00);
        this.A0Q = new C1818484t(this);
        C06160Ug c06160Ug = new C06160Ug(null, c1817884n.A09);
        this.A0b = c06160Ug;
        C1817884n c1817884n2 = this.A0N;
        final C013404z A042 = AnonymousClass111.A04(c1817884n2.A05, c1817884n2.A06, c1817884n2.A07, c1817884n2.A08, c06160Ug);
        this.A0B = AbstractC58232lf.A00(anonymousClass191, new InterfaceC19390xP() { // from class: X.84u
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsCreationViewModel$special$$inlined$map$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
    }

    public final void A0V(C9C2 c9c2, String str) {
        Object obj;
        C14360o3.A0B(str, 0);
        C1817884n c1817884n = this.A0N;
        Iterator it = c1817884n.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C5RO) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C5RO c5ro = (C5RO) obj;
        if (c5ro != null) {
            C56305OzQ c56305OzQ = new C56305OzQ(c5ro);
            c5ro.EgI(c9c2);
            c1817884n.A09.F8m(new C09530e4(c56305OzQ, c5ro));
        }
    }

    public final void A0W(UserSession userSession, VoiceOption voiceOption, String str, String str2, int i) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(voiceOption, 4);
        ClipsAudioStore clipsAudioStore = this.A0K;
        AnonymousClass195 anonymousClass195 = clipsAudioStore.A01;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19L c19l = clipsAudioStore.A0E;
        clipsAudioStore.A01 = AbstractC23641Du.A04(AnonymousClass191.A00, new PY3(clipsAudioStore, userSession, voiceOption, str, str2, null, null, i, 0), c19l);
    }

    public final void A0b(AbstractC193598he abstractC193598he, boolean z) {
        EnumC191648eM enumC191648eM;
        AudioOverlayTrack audioOverlayTrack;
        if (z && abstractC193598he.A00 != 0) {
            String str = null;
            if (A0n()) {
                AbstractC193598he abstractC193598he2 = (AbstractC193598he) this.A0K.A06.A02();
                if (abstractC193598he2 != null && (audioOverlayTrack = (AudioOverlayTrack) abstractC193598he2.A00()) != null) {
                    str = audioOverlayTrack.A0A;
                }
                if (!C14360o3.A0K(str, ((AudioOverlayTrack) abstractC193598he.A00()).A0A)) {
                    enumC191648eM = EnumC191648eM.A09;
                }
            } else {
                enumC191648eM = EnumC191648eM.A04;
            }
            A03(enumC191648eM, this, true);
        }
        A02(abstractC193598he, null, false);
    }

    public final void A0c(C5RO c5ro) {
        C14360o3.A0B(c5ro, 0);
        C1817884n c1817884n = this.A0N;
        List list = c1817884n.A02;
        list.remove(c5ro);
        c1817884n.A0C.Egh(new ArrayList(list));
        if (c5ro instanceof Drawable) {
            c1817884n.A06.F8m(c5ro);
        }
    }

    public final void A0f(C5RR c5rr) {
        C14360o3.A0B(c5rr, 0);
        C1817884n c1817884n = this.A0N;
        List list = c1817884n.A01;
        list.remove(c5rr);
        c1817884n.A0B.Egh(list);
        if (c5rr instanceof Drawable) {
            c1817884n.A06.F8m(c5rr);
        }
    }

    public final void A0h(String str) {
        C14360o3.A0B(str, 0);
        this.A0Q.A01(EnumC191648eM.A0m);
        ClipsAudioStore clipsAudioStore = this.A0K;
        List list = clipsAudioStore.A0C;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C24239Ap6) it.next()).A06, str)) {
                it.remove();
            }
        }
        clipsAudioStore.A0S.Egh(C9O3.A00(list, ClipsAudioStore.A00(clipsAudioStore)));
    }

    public final void A0i(List list) {
        C05A c05a = this.A0O.A02;
        C84B c84b = (C84B) c05a.getValue();
        C14360o3.A0B(c84b, 0);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.pushList>");
        A05.addAll(list);
        C84B c84b2 = new C84B(AbstractC001800i.A0a(A05), c84b.A03);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            c84b2 = AHU.A00(c84b2, (c84b2.A01.size() - i) - 2);
            i = i2;
        }
        c05a.Egh(c84b2);
    }

    public final void A0j(List list) {
        C14360o3.A0B(list, 0);
        C84G c84g = this.A0O;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C115525Km c115525Km = ((C115475Kh) obj).A0G;
            if (c115525Km.A05 != 0 && c115525Km.A09 != 0) {
                arrayList.add(obj);
            }
        }
        c84g.A02(arrayList);
    }

    public final void A0k(List list, boolean z) {
        C14360o3.A0B(list, 0);
        if (z) {
            A03(EnumC191648eM.A0f, this, true);
        }
        C05A c05a = this.A0O.A02;
        C84B c84b = (C84B) c05a.getValue();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            C84B c84b2 = (C84B) c05a.getValue();
            Object obj = c09530e4.A00;
            AbstractC115485Ki A06 = ((AbstractC115485Ki) c84b2.A03(((Number) obj).intValue())).A06();
            if (A06 instanceof C115475Kh) {
                ((C115475Kh) A06).A0A = (C206169Az) c09530e4.A01;
            } else if (A06 instanceof C52435NIf) {
                ((C52435NIf) A06).A01 = (C206169Az) c09530e4.A01;
            }
            arrayList.add(new C09530e4(obj, A06));
        }
        c05a.Egh(AbstractC55154OdI.A03(c84b, arrayList));
    }

    public static final C84B A00(ClipsCreationViewModel clipsCreationViewModel) {
        Object A02 = clipsCreationViewModel.A0G.A02();
        C14360o3.A0A(A02);
        return (C84B) A02;
    }

    public static final void A01(AbstractC193598he abstractC193598he, ClipsCreationViewModel clipsCreationViewModel) {
        boolean z;
        if (!(abstractC193598he instanceof C8ZT) && !abstractC193598he.A01()) {
            if (abstractC193598he instanceof C193588hd) {
                z = false;
            } else {
                return;
            }
        } else {
            z = true;
        }
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        clipsAudioStore.A06(f);
    }

    private final void A02(AbstractC193598he abstractC193598he, AudioOverlayTrack audioOverlayTrack, boolean z) {
        UserSession userSession = this.A0J;
        if (C36A.A08(userSession)) {
            C18U.A06(C06090Tz.A05, userSession, 36321353011307857L);
        }
        if (this.A0L.A01 != null && C9M8.A00(abstractC193598he)) {
            if (z && (abstractC193598he.A00 == 3 || abstractC193598he.A01())) {
                this.A0K.A09(abstractC193598he, audioOverlayTrack);
            } else {
                this.A0K.A08(abstractC193598he);
            }
        }
    }

    public static final void A03(EnumC191648eM enumC191648eM, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        C183558Ce c183558Ce;
        if (!clipsCreationViewModel.A09 && (c183558Ce = clipsCreationViewModel.A02) != null) {
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = c183558Ce.A00;
            C128175qm A01 = ClipsCreationDraftViewModel.A01(clipsCreationDraftViewModel);
            if (A01 == null) {
                AbstractC12120kG.A07("ClipsCreationDraftViewModel", "Draft Snapshot is null when saving Undo snapshot", null);
                return;
            }
            C193658hl c193658hl = clipsCreationDraftViewModel.A0G.A04;
            c193658hl.A01(enumC191648eM, A01);
            if (!z) {
                return;
            }
            c193658hl.A00.clear();
            c193658hl.A02.Egh(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (r6 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9, X.C128175qm r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.5qm):void");
    }

    public static final boolean A05(ClipsCreationViewModel clipsCreationViewModel, int i, int i2, int i3) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        C115475Kh c115475Kh3;
        C115475Kh c115475Kh4;
        C183348Bh A00;
        long A06;
        C84G c84g = clipsCreationViewModel.A0O;
        UserSession userSession = clipsCreationViewModel.A0J;
        C05A c05a = c84g.A02;
        if (i >= ((C84B) c05a.getValue()).A01.size()) {
            A00 = AbstractC183338Bg.A00(userSession);
            String A02 = AnonymousClass001.A02(i, ((C84B) c05a.getValue()).A01.size(), "invalid index: ", " >= ");
            C14360o3.A0B(A02, 0);
            A06 = A00.A0K.A07(A02, "", 613293953, A00.A0B);
        } else {
            AbstractC115485Ki A062 = ((AbstractC115485Ki) ((C84B) c05a.getValue()).A03(i)).A06();
            if (A062 instanceof C115475Kh) {
                C115475Kh c115475Kh5 = (C115475Kh) A062;
                if (i2 == c115475Kh5.A09 && i3 == c115475Kh5.A08) {
                    A00 = AbstractC183338Bg.A00(userSession);
                    long j = A00.A0B;
                    if (j == 613293953) {
                        return false;
                    }
                    A06 = A00.A0K.A06(CancelReason.LOGIC_CONSTRAINT, "trim times unchanged", 613293953, j);
                } else {
                    if (i3 - i2 < 100) {
                        i3 = Math.min(i2 + 100, c115475Kh5.A0B());
                    }
                    if (i3 - i2 < 100) {
                        i2 = Math.max(0, i3 - 100);
                    }
                    c115475Kh5.A09 = i2;
                    c115475Kh5.A08 = i3;
                    while (!AbstractC226869zi.A00(c115475Kh5, false, false)) {
                        int i4 = i - 1;
                        InterfaceC115495Kj A04 = ((C84B) c05a.getValue()).A04(i4);
                        if ((A04 instanceof C115475Kh) && (c115475Kh4 = (C115475Kh) A04) != null) {
                            c115475Kh = C115475Kh.A00(null, null, c115475Kh4, null, 0.0f, 0, 0, 0, 0, Integer.MAX_VALUE);
                        } else {
                            c115475Kh = null;
                        }
                        int i5 = i + 1;
                        InterfaceC115495Kj A042 = ((C84B) c05a.getValue()).A04(i5);
                        if ((A042 instanceof C115475Kh) && (c115475Kh3 = (C115475Kh) A042) != null) {
                            c115475Kh2 = C115475Kh.A00(null, null, c115475Kh3, null, 0.0f, 0, 0, 0, 0, Integer.MAX_VALUE);
                        } else {
                            c115475Kh2 = null;
                        }
                        if (c115475Kh == null && c115475Kh5.A0M != null) {
                            c115475Kh5.A0M = null;
                        } else if (c115475Kh2 == null && c115475Kh5.A0N != null) {
                            c115475Kh5.A0N = null;
                        } else if (c115475Kh5.A0M != null) {
                            c115475Kh5.A0M = null;
                            if (c115475Kh != null) {
                                c115475Kh.A0N = null;
                                c84g.A01(c115475Kh, i4);
                            }
                        } else {
                            c115475Kh5.A0N = null;
                            if (c115475Kh2 != null) {
                                c115475Kh2.A0M = null;
                                c84g.A01(c115475Kh2, i5);
                            }
                        }
                    }
                }
            } else if (A062 instanceof C52435NIf) {
                ((C52435NIf) A062).A00 = Math.max(i3 - i2, 100);
            }
            c84g.A01(A062, i);
            C183348Bh A002 = AbstractC183338Bg.A00(userSession);
            long j2 = A002.A0B;
            if (j2 != 613293953) {
                A002.A0B = A002.A0K.A02(613293953, j2);
            }
            C115475Kh c115475Kh6 = (C115475Kh) A00(clipsCreationViewModel).A04(i);
            if (c115475Kh6 != null) {
                C49602Pt c49602Pt = clipsCreationViewModel.A0R;
                if (c49602Pt.A02()) {
                    C84D.A01(c115475Kh6, c49602Pt);
                    return true;
                }
                return true;
            }
            return true;
        }
        A00.A0B = A06;
        return false;
    }

    public final int A0E() {
        EnumC189548aZ enumC189548aZ;
        if (this.A03 == C5JK.A06) {
            if (A00(this).A01.size() == 1) {
                return Math.max(((C115475Kh) A00(this).A03(0)).A0G.A04, A0F());
            }
            AnonymousClass825 anonymousClass825 = this.A0f;
            AnonymousClass826 A00 = AnonymousClass827.A00(this.A0J);
            C14360o3.A0B(A00, 0);
            anonymousClass825.A05.A0B(A00);
        } else {
            C185368Kc c185368Kc = this.A0L.A00;
            if (c185368Kc != null && ((enumC189548aZ = c185368Kc.A03) == null || enumC189548aZ == EnumC189548aZ.A06)) {
                C14360o3.A0A(c185368Kc);
                return c185368Kc.A01;
            }
        }
        return A0F();
    }

    public final int A0F() {
        int i;
        Integer valueOf;
        AnonymousClass826 anonymousClass826 = (AnonymousClass826) this.A0f.A05.A02();
        if (anonymousClass826 != null && (valueOf = Integer.valueOf((i = anonymousClass826.A01))) != null) {
            InterfaceC09390do interfaceC09390do = this.A0T;
            if (!C14360o3.A0K(((C2GT) interfaceC09390do.getValue()).A02(), valueOf)) {
                ((C2GT) interfaceC09390do.getValue()).A0B(valueOf);
            }
            return i;
        }
        AbstractC12120kG.A07("ClipsCreationViewModel", "max total recording duration is NULL", null);
        return 0;
    }

    public final C84B A0G() {
        C84B c84b = (C84B) this.A0O.A03.getValue();
        List list = c84b.A02;
        boolean z = c84b.A03;
        C14360o3.A0B(list, 0);
        return new C84B(list, z);
    }

    public final Float A0H(int i) {
        C115475Kh c115475Kh;
        C84B c84b = (C84B) this.A0G.A02();
        if (c84b != null && (c115475Kh = (C115475Kh) c84b.A04(i)) != null) {
            return Float.valueOf(c115475Kh.A01);
        }
        return null;
    }

    public final Integer A0I(int i) {
        C115475Kh c115475Kh;
        C84B c84b = (C84B) this.A0G.A02();
        if (c84b != null && (c115475Kh = (C115475Kh) c84b.A04(i)) != null) {
            return Integer.valueOf(c115475Kh.A08 - c115475Kh.A09);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[LOOP:0: B:11:0x0042->B:12:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0J(X.EnumC222609s1 r16, java.io.File r17, java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20, int r21, int r22, int r23) {
        /*
            r15 = this;
            r6 = r20
            r5 = r18
            r9 = r16
            r14 = r21
            r1 = r22
            r2 = r23
            boolean r0 = r6 instanceof X.B56
            if (r0 == 0) goto L7e
            r7 = r6
            X.B56 r7 = (X.B56) r7
            int r4 = r7.A03
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L7e
            int r4 = r4 - r3
            r7.A03 = r4
        L1e:
            java.lang.Object r4 = r7.A07
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A03
            r3 = 1
            if (r0 == 0) goto L60
            if (r0 != r3) goto La3
            int r2 = r7.A02
            int r1 = r7.A01
            int r14 = r7.A00
            java.lang.Object r9 = r7.A06
            X.9s1 r9 = (X.EnumC222609s1) r9
            java.lang.Object r5 = r7.A05
            java.lang.String r5 = (java.lang.String) r5
            X.AbstractC09560e7.A00(r4)
        L3a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r2 / r14
            r7 = 0
        L42:
            if (r7 >= r6) goto L84
            int r0 = r7 * r14
            int r13 = r1 + r0
            r0 = 45
            java.lang.String r11 = X.AnonymousClass001.A0G(r5, r0, r7)
            X.8ZT r10 = new X.8ZT
            r10.<init>(r4)
            r12 = 1065353216(0x3f800000, float:1.0)
            X.9ZW r8 = new X.9ZW
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r8)
            int r7 = r7 + 1
            goto L42
        L60:
            X.AbstractC09560e7.A00(r4)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r15.A0K
            r7.A04 = r15
            r7.A05 = r5
            r7.A06 = r9
            r7.A00 = r14
            r7.A01 = r1
            r7.A02 = r2
            r7.A03 = r3
            r4 = r17
            r3 = r19
            java.lang.Object r4 = r0.A04(r4, r3, r5, r7)
            if (r4 != r6) goto L3a
            return r6
        L7e:
            X.B56 r7 = new X.B56
            r7.<init>(r15, r6)
            goto L1e
        L84:
            int r2 = r2 % r14
            if (r2 <= 0) goto La2
            int r0 = r6 * r14
            int r1 = r1 + r0
            r0 = 45
            java.lang.String r7 = X.AnonymousClass001.A0G(r5, r0, r6)
            X.8ZT r6 = new X.8ZT
            r6.<init>(r4)
            r8 = 1065353216(0x3f800000, float:1.0)
            X.9ZW r4 = new X.9ZW
            r5 = r9
            r9 = r1
            r10 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.add(r4)
        La2:
            return r3
        La3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A0J(X.9s1, java.io.File, java.lang.String, java.lang.String, X.1Ds, int, int, int):java.lang.Object");
    }

    public final String A0L() {
        MusicAssetModel musicAssetModel;
        int i;
        ClipsAudioStore clipsAudioStore = this.A0K;
        int i2 = A00(this).A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List list = (List) clipsAudioStore.A0G.getValue();
        if (list != null) {
            ArrayList<AudioOverlayTrack> arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((AbstractC193598he) it.next()).A01;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            for (AudioOverlayTrack audioOverlayTrack : arrayList) {
                if (audioOverlayTrack.A0E == null && (musicAssetModel = audioOverlayTrack.A08) != null) {
                    int i3 = audioOverlayTrack.A01;
                    if (i3 == 0) {
                        i3 = i2;
                    }
                    String str = musicAssetModel.A0E;
                    C14360o3.A07(str);
                    Number number = (Number) linkedHashMap.get(musicAssetModel.A0E);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 0;
                    }
                    linkedHashMap.put(str, Integer.valueOf(i + (i3 - audioOverlayTrack.A04)));
                    String str2 = musicAssetModel.A0E;
                    C14360o3.A07(str2);
                    String str3 = musicAssetModel.A0I;
                    C14360o3.A07(str3);
                    linkedHashMap2.put(str2, str3);
                }
            }
        }
        for (Object obj2 : linkedHashMap.keySet()) {
            Number number2 = (Number) linkedHashMap.get(obj2);
            if (number2 != null && number2.intValue() > 90000) {
                return (String) linkedHashMap2.get(obj2);
            }
        }
        return null;
    }

    public final List A0N() {
        List list = (List) this.A0K.A0V.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((AbstractC193598he) it.next()).A01;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final void A0O() {
        C05A c05a = this.A0O.A02;
        C14360o3.A0B(c05a.getValue(), 0);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 0);
        c05a.Egh(new C84B(c16930sl, false));
        this.A0L.A04.clear();
    }

    public final void A0P() {
        Object value;
        ArrayList arrayList;
        ClipsAudioStore clipsAudioStore = this.A0K;
        EnumC222609s1 enumC222609s1 = EnumC222609s1.A03;
        C05A c05a = clipsAudioStore.A0P;
        do {
            value = c05a.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (((C9ZW) obj).A03 != enumC222609s1) {
                    arrayList.add(obj);
                }
            }
        } while (!c05a.AIi(value, arrayList));
    }

    public final void A0Q() {
        ClipsAudioStore clipsAudioStore = this.A0K;
        int i = A00(this).A00;
        ArrayList arrayList = new ArrayList();
        List<C24239Ap6> list = clipsAudioStore.A0C;
        for (C24239Ap6 c24239Ap6 : list) {
            int min = Math.min(i - 100, c24239Ap6.A03);
            int min2 = Math.min(i, c24239Ap6.A02);
            Integer valueOf = Integer.valueOf(min);
            Integer valueOf2 = Integer.valueOf(min2);
            C24239Ap6 A00 = c24239Ap6.A00();
            C14360o3.A0C(A00, MSV.A00(529));
            if (valueOf != null) {
                A00.A03 = valueOf.intValue();
            }
            if (valueOf2 != null) {
                A00.A02 = valueOf2.intValue();
            }
            arrayList.add(A00);
        }
        list.clear();
        list.addAll(arrayList);
        clipsAudioStore.A0S.Egh(C9O3.A00(list, i));
    }

    public final void A0R(int i) {
        C05A c05a = this.A0O.A02;
        AbstractC115485Ki A06 = ((AbstractC115485Ki) ((C84B) c05a.getValue()).A03(i)).A06();
        if (A06 instanceof C115475Kh) {
            C115475Kh c115475Kh = (C115475Kh) A06;
            C115525Km c115525Km = c115475Kh.A0G;
            int i2 = c115525Km.A03;
            int i3 = c115525Km.A02;
            int i4 = c115525Km.A04;
            int i5 = i4 - i3;
            int i6 = i4 - i2;
            String str = c115525Km.A0F;
            String str2 = c115525Km.A0G;
            String str3 = c115525Km.A0E;
            long j = c115525Km.A0A;
            int i7 = c115525Km.A09;
            int i8 = c115525Km.A05;
            int i9 = c115525Km.A01;
            int i10 = c115525Km.A07;
            String str4 = c115525Km.A0D;
            int i11 = c115525Km.A00;
            int i12 = c115525Km.A08;
            String str5 = c115525Km.A0H;
            int i13 = c115525Km.A06;
            MediaUploadMetadata mediaUploadMetadata = c115525Km.A0B;
            boolean z = c115525Km.A0K;
            String str6 = c115525Km.A0I;
            List list = c115525Km.A0J;
            Boolean bool = c115525Km.A0C;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(mediaUploadMetadata, 16);
            C115525Km c115525Km2 = new C115525Km(mediaUploadMetadata, bool, str, str2, str3, str4, str5, str6, list, i7, i8, i9, i10, i11, i12, i4, i5, i6, i13, j, z);
            c115475Kh.A0G = c115525Km2;
            int i14 = c115475Kh.A09;
            int i15 = c115475Kh.A08;
            int i16 = c115525Km2.A04;
            c115475Kh.A09 = i16 - i15;
            c115475Kh.A08 = i16 - i14;
            c115475Kh.A00 = -c115475Kh.A00;
        }
        c05a.Egh(AbstractC55154OdI.A02(A06, (C84B) c05a.getValue(), i));
    }

    public final void A0S(int i, int i2) {
        String str;
        String str2;
        String str3;
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        C115475Kh c115475Kh3;
        C115475Kh c115475Kh4;
        if (i != i2) {
            C05A c05a = this.A0O.A02;
            InterfaceC115495Kj A04 = ((C84B) c05a.getValue()).A04(i);
            String str4 = null;
            if ((A04 instanceof C115475Kh) && (c115475Kh4 = (C115475Kh) A04) != null) {
                str = c115475Kh4.A0M;
            } else {
                str = null;
            }
            InterfaceC115495Kj A042 = ((C84B) c05a.getValue()).A04(i);
            if ((A042 instanceof C115475Kh) && (c115475Kh3 = (C115475Kh) A042) != null) {
                str2 = c115475Kh3.A0N;
            } else {
                str2 = null;
            }
            InterfaceC115495Kj A043 = ((C84B) c05a.getValue()).A04(i2);
            if ((A043 instanceof C115475Kh) && (c115475Kh2 = (C115475Kh) A043) != null) {
                str3 = c115475Kh2.A0M;
            } else {
                str3 = null;
            }
            InterfaceC115495Kj A044 = ((C84B) c05a.getValue()).A04(i2);
            if ((A044 instanceof C115475Kh) && (c115475Kh = (C115475Kh) A044) != null) {
                str4 = c115475Kh.A0N;
            }
            C84B c84b = (C84B) c05a.getValue();
            C14360o3.A0B(c84b, 0);
            ArrayList A05 = c84b.A05();
            C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.moveSegment>");
            A05.add(i2, A05.remove(i));
            c05a.Egh(AHU.A01(AHU.A01(AHU.A01(AHU.A01(new C84B(AbstractC001800i.A0a(A05), c84b.A03), str, i - 1), str2, i), str3, i2 - 1), str4, i2));
        }
    }

    public final void A0T(int i, String str) {
        C84G c84g = this.A0O;
        if (!C14360o3.A0K(c84g.A00(i), str)) {
            C05A c05a = c84g.A02;
            c05a.Egh(AHU.A01((C84B) c05a.getValue(), str, i));
        }
    }

    public final void A0U(int i, boolean z) {
        C183558Ce c183558Ce;
        A03(EnumC191648eM.A0b, this, true);
        C84G c84g = this.A0O;
        if (i >= 0) {
            C05A c05a = c84g.A02;
            if (((C84B) c05a.getValue()).A01.size() > i) {
                C84B c84b = (C84B) c05a.getValue();
                C14360o3.A0B(c84b, 0);
                if (!c84b.A01.isEmpty()) {
                    ArrayList A05 = c84b.A05();
                    C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.remove>");
                    Object remove = A05.remove(i);
                    C14360o3.A07(remove);
                    C84B c84b2 = new C84B(AbstractC001800i.A0a(A05), c84b.A03);
                    AHU.A00(c84b2, i - 1);
                    AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) remove;
                    c05a.Egh(c84b2);
                    if (abstractC115485Ki.A00 != C05F.A01) {
                        AbstractC12120kG.A07("ClipsCreationViewModel", "IgPhotoSegment not supported in ClipsCreationViewModel", null);
                        return;
                    }
                    this.A0L.A04.remove(abstractC115485Ki);
                    if (!z || (c183558Ce = this.A02) == null) {
                        return;
                    }
                    Boolean bool = (Boolean) c183558Ce.A00.A05.A02();
                    if (bool != null && bool.booleanValue()) {
                        return;
                    }
                    if (!C18U.A06(C06090Tz.A05, this.A0J, 36326975123503321L)) {
                        return;
                    }
                    AbstractC23641Du.A05(C12L.A00.CPG(480314591, 3), new PZJ(this, abstractC115485Ki, null, 44), AbstractC141776au.A00(this));
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final void A0Z(AbstractC193598he abstractC193598he, AudioOverlayTrack audioOverlayTrack, boolean z) {
        EnumC191648eM enumC191648eM;
        AudioOverlayTrack audioOverlayTrack2 = (AudioOverlayTrack) abstractC193598he.A01;
        if (audioOverlayTrack2 != null) {
            int i = audioOverlayTrack2.A02 + audioOverlayTrack2.A04;
            if ((audioOverlayTrack2.A01 == 0 && A00(this).A00 > i) || audioOverlayTrack2.A01 > i) {
                audioOverlayTrack2.A01 = i;
            }
        }
        if (z && abstractC193598he.A00 != 0) {
            if (audioOverlayTrack != null && !C14360o3.A0K(((AudioOverlayTrack) abstractC193598he.A00()).A0A, audioOverlayTrack.A0A)) {
                enumC191648eM = EnumC191648eM.A09;
            } else {
                enumC191648eM = EnumC191648eM.A04;
            }
            A03(enumC191648eM, this, true);
        }
        A02(abstractC193598he, audioOverlayTrack, true);
    }

    public final void A0a(AbstractC193598he abstractC193598he, List list, boolean z) {
        this.A0O.A02(list);
        if (C9M8.A00(abstractC193598he)) {
            A01(abstractC193598he, this);
            this.A0K.A08(abstractC193598he);
        }
        if (z) {
            Set set = this.A0L.A04;
            set.clear();
            set.addAll(list);
        }
    }

    public final void A0d(C115475Kh c115475Kh, Integer num) {
        C05A c05a;
        C84B A00;
        int intValue;
        C84G c84g = this.A0O;
        if (((C84B) c84g.A03.getValue()).A01.size() != 0) {
            A03(EnumC191648eM.A0Y, this, true);
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            c05a = c84g.A02;
            if (intValue < ((C84B) c05a.getValue()).A01.size()) {
                A00 = AHU.A00(AHU.A00(AbstractC55154OdI.A01(c115475Kh, (C84B) c05a.getValue(), intValue), intValue - 1), intValue + 1);
                c05a.Egh(A00);
            }
        }
        c05a = c84g.A02;
        A00 = AbstractC55154OdI.A00(c115475Kh, (C84B) c05a.getValue());
        AHU.A00(A00, A00.A01.size() - 2);
        c05a.Egh(A00);
    }

    public final void A0e(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ArrayList arrayList;
        AbstractC193598he abstractC193598he;
        ClipsAudioStore clipsAudioStore = this.A0K;
        clipsAudioStore.A02 = true;
        C05A c05a = clipsAudioStore.A0G;
        Collection collection = (Collection) c05a.getValue();
        if (collection != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = new ArrayList();
        }
        if (audioOverlayTrack == null) {
            clipsAudioStore.A05();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C14360o3.A0K(((AbstractC193598he) next).A01, audioOverlayTrack)) {
                arrayList2.add(next);
            }
        }
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            if (z) {
                abstractC193598he = C219499mx.A00;
            } else {
                abstractC193598he = C193588hd.A00;
            }
            arrayList.add(abstractC193598he);
        }
        c05a.Egh(arrayList);
    }

    public final void A0g(String str) {
        C05A c05a = this.A0O.A02;
        C84B c84b = (C84B) c05a.getValue();
        List list = c84b.A02;
        boolean z = c84b.A03;
        C14360o3.A0B(list, 0);
        C84B c84b2 = new C84B(list, z);
        int size = ((C84B) c05a.getValue()).A01.size();
        for (int i = -1; i < size; i++) {
            c84b2 = AHU.A01(c84b2, str, i);
        }
        c05a.Egh(c84b2);
    }

    public final boolean A0l() {
        if (AnonymousClass827.A00(this.A0J).A01 - A00(this).A00 <= 100) {
            return false;
        }
        return true;
    }

    public final boolean A0m() {
        OriginalAudioSubtype originalAudioSubtype;
        MusicAssetModel musicAssetModel;
        List list = (List) this.A0K.A0V.getValue();
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                if (audioOverlayTrack != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
                    originalAudioSubtype = musicAssetModel.A01;
                } else {
                    originalAudioSubtype = null;
                }
                if (originalAudioSubtype == OriginalAudioSubtype.A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0n() {
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A0K.A06.A02();
        if (abstractC193598he == null || abstractC193598he.A00 != 3) {
            return false;
        }
        return true;
    }

    public final boolean A0o() {
        C74P c74p;
        String str;
        C194808jg c194808jg;
        List list = this.A0N.A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Drawable Afg = ((C5RO) it.next()).Afg();
            Drawable drawable = null;
            if ((Afg instanceof C194808jg) && (c194808jg = (C194808jg) Afg) != null) {
                drawable = c194808jg.A04();
            }
            if ((drawable instanceof C8OT) && (c74p = (C74P) drawable) != null && ((str = c74p.A0E) == null || str.length() == 0)) {
                String str2 = c74p.A0l;
                if (str2 == null || str2.length() == 0) {
                    if (c74p.A0Y != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A0p() {
        List list = (List) this.A0K.A0V.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                if (audioOverlayTrack != null && audioOverlayTrack.A01()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0q() {
        int i;
        List list = (List) this.A0K.A0V.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC193598he) obj).A01 != null) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i >= C18U.A01(C06090Tz.A06, this.A0J, 36602827988407115L)) {
            return true;
        }
        return false;
    }

    public final boolean A0r() {
        C1817884n c1817884n = this.A0N;
        if ((!((Collection) c1817884n.A0D.getValue()).isEmpty()) || (!((Collection) c1817884n.A0E.getValue()).isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean A0s() {
        C84B c84b = (C84B) this.A0F.A02();
        if (c84b != null && !c84b.A01.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0t() {
        if (this.A03 != C5JK.A06) {
            return false;
        }
        int i = AnonymousClass827.A00(this.A0J).A01;
        int i2 = A00(this).A00;
        if (i2 < 0 || i2 > i) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass848
    public final void AI1() {
        C1817884n c1817884n = this.A0N;
        List list = c1817884n.A02;
        ArrayList A0U = AbstractC001800i.A0U(list);
        List list2 = c1817884n.A01;
        ArrayList A0U2 = AbstractC001800i.A0U(list2);
        List list3 = c1817884n.A00;
        ArrayList A0U3 = AbstractC001800i.A0U(list3);
        list.clear();
        list2.clear();
        list3.clear();
        c1817884n.A0C.Egh(new ArrayList());
        C05A c05a = c1817884n.A0B;
        C16930sl c16930sl = C16930sl.A00;
        c05a.Egh(c16930sl);
        c1817884n.A0A.Egh(c16930sl);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Drawable) {
                c1817884n.A06.F8m(next);
            }
        }
        Iterator it2 = A0U2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof Drawable) {
                c1817884n.A06.F8m(next2);
            }
        }
        Iterator it3 = A0U3.iterator();
        while (it3.hasNext()) {
            c1817884n.A04.F8m(it3.next());
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A06.invoke();
        C84A c84a = this.A0e;
        String str = this.A0S;
        C14360o3.A0B(str, 0);
        C84F c84f = (C84F) c84a.A00.remove(str);
        if (c84f != null) {
            c84f.A00();
        }
    }

    public final String A0K() {
        String A0L = A0L();
        C141796aw A00 = AbstractC141776au.A00(this);
        C9DZ c9dz = new C9DZ(this, A0L, null, 1);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dz, A00);
        return A0L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.9nP, java.lang.Object, X.5Ks] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.5Ks, X.9nQ] */
    public final List A0M() {
        C01L A1I = C0eM.A1I();
        ClipsAudioStore clipsAudioStore = this.A0K;
        EnumC192868gS enumC192868gS = (EnumC192868gS) clipsAudioStore.A0c.getValue();
        if (enumC192868gS != null) {
            Integer num = C05F.A00;
            ?? obj = new Object();
            obj.A00 = num;
            obj.A00 = enumC192868gS;
            A1I.add(obj);
        }
        C190178bb c190178bb = (C190178bb) clipsAudioStore.A0b.getValue();
        if (c190178bb != null) {
            Integer num2 = C05F.A01;
            ?? obj2 = new Object();
            obj2.A00 = num2;
            obj2.A00 = c190178bb;
            A1I.add(obj2);
        }
        return C0eM.A1J(A1I);
    }

    public final void A0X(C8KC c8kc) {
        C141796aw A00 = AbstractC141776au.A00(this);
        C9D3 c9d3 = new C9D3(this, c8kc, (InterfaceC23621Ds) null, 39);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A00);
    }

    public final void A0Y(AbstractC193598he abstractC193598he) {
        if (C9M8.A00(abstractC193598he)) {
            ClipsAudioStore clipsAudioStore = this.A0K;
            if (C9M9.A00(abstractC193598he)) {
                clipsAudioStore.A0M.Egh(abstractC193598he);
            }
        }
    }

    public final boolean A0u() {
        if (!A0t() && this.A03 == C5JK.A06) {
            return true;
        }
        return false;
    }
}
