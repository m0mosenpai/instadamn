package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.creation.persistence.CreationDatabase_Impl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public final class NIW extends AbstractC50863Mdu {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final ClipsCreationViewModel A04;
    public final C187418Sj A05;
    public final C187358Sd A06;
    public final C2PX A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;
    public final InterfaceC19390xP A0C;
    public final C05A A0D;
    public final InterfaceC15070pN A0E;
    public final C1818484t A0F;
    public final C05A A0G;
    public final C0UO A0H;

    public NIW(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        super(application, userSession, new B5y(clipsCreationViewModel, 11), z);
        C2PX c2px;
        this.A04 = clipsCreationViewModel;
        this.A06 = c187358Sd;
        this.A05 = c187418Sj;
        this.A03 = i;
        this.A09 = interfaceC16820sZ;
        this.A08 = str;
        this.A01 = i / 2;
        this.A00 = i / 2;
        this.A0E = super.A03;
        C49242Of c49242Of = CreationDatabase.A00;
        IgRoomDatabase A0p = MSW.A0p(userSession, CreationDatabase.class);
        if (A0p == null) {
            synchronized (c49242Of) {
                A0p = MSW.A0p(userSession, CreationDatabase.class);
                A0p = A0p == null ? AbstractC50522MSa.A0c(AbstractC43594JPz.A0K(userSession, c49242Of, CreationDatabase.class), userSession, c49242Of) : A0p;
            }
        }
        CreationDatabase_Impl creationDatabase_Impl = (CreationDatabase_Impl) ((CreationDatabase) A0p);
        if (creationDatabase_Impl.A00 != null) {
            c2px = creationDatabase_Impl.A00;
        } else {
            synchronized (creationDatabase_Impl) {
                if (creationDatabase_Impl.A00 == null) {
                    creationDatabase_Impl.A00 = new C2PX(creationDatabase_Impl);
                }
                c2px = creationDatabase_Impl.A00;
            }
        }
        this.A07 = c2px;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0G = A0o;
        this.A0H = A0o;
        C008002u A00 = C10E.A00(null);
        this.A0D = A00;
        this.A0B = new C43817JZf(A00, 10);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0A = A12;
        this.A0C = AbstractC07080Za.A03(A12);
        this.A0F = clipsCreationViewModel.A0Q;
        AbstractC23641Du.A05(C12L.A00.CPG(480314591, 3), new PYX(this, null, 26), AbstractC141776au.A00(this));
    }

    public final void A0Q(AbstractC187378Sf abstractC187378Sf) {
        C55228Oey c55228Oey;
        int i;
        int i2;
        C14360o3.A0B(abstractC187378Sf, 0);
        if ((abstractC187378Sf instanceof C187548Sw) && C14360o3.A0K(this.A08, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            C55228Oey c55228Oey2 = super.A01;
            C187548Sw c187548Sw = (C187548Sw) abstractC187378Sf;
            int i3 = c187548Sw.A01;
            c55228Oey2.A0Q(i3, c187548Sw.A00, true);
            A0I(i3);
            return;
        }
        if ((abstractC187378Sf instanceof C8T3) && C14360o3.A0K(this.A08, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            if (!(abstractC187378Sf instanceof C8Sx)) {
                return;
            }
            c55228Oey = super.A01;
            C8T3 c8t3 = (C8T3) abstractC187378Sf;
            i = c8t3.A01;
            i2 = c8t3.A00;
        } else if ((abstractC187378Sf instanceof C8T4) && C14360o3.A0K(this.A08, "voice_over")) {
            if (!(abstractC187378Sf instanceof C8Sx)) {
                return;
            }
            c55228Oey = super.A01;
            C8T4 c8t4 = (C8T4) abstractC187378Sf;
            i = c8t4.A01;
            i2 = c8t4.A00;
        } else {
            if ((abstractC187378Sf instanceof C187558Sy) || (abstractC187378Sf instanceof C8T8) || (abstractC187378Sf instanceof C8TB)) {
                return;
            }
            A0H();
            return;
        }
        c55228Oey.A0Q(i, i2, false);
        A0J(i, i2);
    }

    public final void A0R(List list) {
        C8T4 c8t4;
        C14360o3.A0B(list, 0);
        C55228Oey c55228Oey = super.A01;
        Context A0G = MSZ.A0G(this);
        int A04 = MSW.A04(this.A04);
        C55228Oey.A07(c55228Oey);
        C05A c05a = c55228Oey.A08;
        do {
        } while (!MSZ.A1Z(c05a));
        Iterator it = list.iterator();
        loop1: while (true) {
            boolean z = true;
            while (it.hasNext()) {
                C24239Ap6 c24239Ap6 = (C24239Ap6) it.next();
                C14360o3.A0B(c24239Ap6, 1);
                int i = c24239Ap6.A01;
                int i2 = c24239Ap6.A00;
                if (i >= 0 && i <= i2) {
                    if (MSZ.A09(c05a) == 0) {
                        c55228Oey.A0N();
                    }
                    int A09 = MSZ.A09(c05a) - 1;
                    if (C55228Oey.A00(C55228Oey.A04(A0G, c24239Ap6, A04), c55228Oey, A09, false) == -1) {
                        c55228Oey.A0N();
                        if (C55228Oey.A00(C55228Oey.A04(A0G, c24239Ap6, A04), c55228Oey, A09 + 1, false) == -1) {
                            continue;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
        }
        AbstractC187378Sf A0E = this.A06.A0E();
        if ((A0E instanceof C8T4) && (c8t4 = (C8T4) A0E) != null) {
            c55228Oey.A0S(c8t4.A01, c8t4.A00, true);
        }
        A0G();
    }

    public static final void A00(NIW niw, AudioOverlayTrack audioOverlayTrack, String str, List list) {
        AbstractC187378Sf A0E;
        AbstractC187378Sf A0E2;
        C8T3 c8t3;
        C187548Sw c187548Sw;
        int i;
        Object value;
        String str2;
        C55228Oey c55228Oey = ((AbstractC50863Mdu) niw).A01;
        if (C14360o3.A0K(str, c55228Oey.A02)) {
            Context A0G = MSZ.A0G(niw);
            int A04 = MSW.A04(niw.A04);
            C14360o3.A0B(audioOverlayTrack, 1);
            C05A c05a = c55228Oey.A08;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            boolean z = false;
            for (Object obj : AbstractC31172DnG.A0w(c05a)) {
                int i5 = i2 + 1;
                if (i2 >= 0) {
                    Iterator it = ((AbstractCollection) obj).iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            C51832Mva c51832Mva = (C51832Mva) next;
                            C51676Ms7 c51676Ms7 = c51832Mva.A08;
                            if (c51676Ms7 != null) {
                                str2 = c51676Ms7.A08;
                            } else {
                                str2 = null;
                            }
                            if (C14360o3.A0K(str2, audioOverlayTrack.A0D)) {
                                z = c51832Mva.A0D;
                                i4 = i6;
                                i3 = i2;
                            }
                            i6 = i7;
                        }
                    }
                    i2 = i5;
                }
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (i3 == -1 || i4 == -1) {
                int i8 = audioOverlayTrack.A04;
                int i9 = A04;
                int i10 = audioOverlayTrack.A01;
                if (i10 != 0) {
                    i9 = i10;
                }
                if (i8 < 0 || i8 >= i9 || (i3 = c55228Oey.A0F(C55228Oey.A02(A0G, c55228Oey, audioOverlayTrack, list, A04, false))) == -1) {
                    return;
                }
                C187358Sd c187358Sd = niw.A06;
                A0E = c187358Sd.A0E();
                if ((A0E instanceof C187548Sw) && (c187548Sw = (C187548Sw) A0E) != null && i3 == (i = c187548Sw.A01)) {
                    c55228Oey.A0Q(i, c187548Sw.A00, true);
                }
                A0E2 = c187358Sd.A0E();
                if ((A0E2 instanceof C8T3) && (c8t3 = (C8T3) A0E2) != null) {
                    c55228Oey.A0S(c8t3.A01, c8t3.A00, true);
                }
                niw.A0I(i3);
            }
            do {
                value = c05a.getValue();
                ((AbstractList) ((AbstractList) c05a.getValue()).get(i3)).set(i4, C55228Oey.A02(A0G, c55228Oey, audioOverlayTrack, list, A04, z));
            } while (!c05a.AIi(value, value));
            C187358Sd c187358Sd2 = niw.A06;
            A0E = c187358Sd2.A0E();
            if (A0E instanceof C187548Sw) {
                c55228Oey.A0Q(i, c187548Sw.A00, true);
            }
            A0E2 = c187358Sd2.A0E();
            if (A0E2 instanceof C8T3) {
                c55228Oey.A0S(c8t3.A01, c8t3.A00, true);
            }
            niw.A0I(i3);
        }
    }

    public final C51832Mva A0M(int i, int i2) {
        List list = (List) AbstractC001800i.A0O(MSW.A1B(super.A01.A0A), i);
        if (list != null) {
            return (C51832Mva) AbstractC001800i.A0O(list, i2);
        }
        return null;
    }

    public final String A0N() {
        C51676Ms7 c51676Ms7;
        C51832Mva A0G = super.A01.A0G();
        if (A0G != null) {
            int ordinal = A0G.A09.ordinal();
            if (ordinal != 6) {
                if (ordinal != 5 || (c51676Ms7 = A0G.A08) == null) {
                    return null;
                }
                return c51676Ms7.A08;
            }
            return A0G.A0B;
        }
        return null;
    }

    public final void A0P(int i, int i2, boolean z) {
        Iterator it = super.A01.A0K(null, i, i2, z, true, false, this.A04.A0K.A0F()).iterator();
        while (it.hasNext()) {
            A0I(AbstractC167007dF.A0B(it));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r20 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0U(int r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        /*
            r14 = this;
            r12 = r18
            r2 = r20
            if (r18 == 0) goto L9
            r0 = 1
            if (r20 == 0) goto La
        L9:
            r0 = 0
        La:
            r7 = r14
            r14.A02 = r0
            X.Oey r4 = r14.A01
            int r3 = X.MSZ.A07(r4)
            boolean r0 = r4.A0W(r15, r3)
            r11 = 0
            if (r0 == 0) goto L9b
            r5 = 1
            r9 = r16
            r10 = r17
            r13 = r19
            if (r18 != 0) goto L73
            java.lang.String r1 = r14.A08
            java.lang.String r0 = "voice_over"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L59
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r14.A04
            X.84t r1 = r0.A0Q
            if (r20 == 0) goto L56
            X.8eM r0 = X.EnumC191648eM.A0l
        L35:
            r1.A01(r0)
            if (r19 == 0) goto L3d
            if (r20 != 0) goto L3d
            r11 = 1
        L3d:
            X.Mva r0 = r4.A0H(r15, r3)
            java.lang.String r0 = r0.A0B
            r14.A0S(r11, r0)
        L46:
            r11 = 0
            X.6aw r0 = X.AbstractC141776au.A00(r14)
            r8 = 0
            X.PXk r6 = new X.PXk
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AbstractC166987dD.A1Z(r6, r0)
            return r5
        L56:
            X.8eM r0 = X.EnumC191648eM.A0n
            goto L35
        L59:
            java.lang.String r0 = "audio"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r14.A04
            X.84t r1 = r0.A0Q
            if (r20 == 0) goto L70
            X.8eM r0 = X.EnumC191648eM.A06
        L69:
            r1.A01(r0)
            r14.A0T(r2, r11)
            goto L46
        L70:
            X.8eM r0 = X.EnumC191648eM.A0A
            goto L69
        L73:
            java.util.List r2 = r4.A0J(r15, r3, r9, r10)
            java.util.Iterator r1 = r2.iterator()
        L7b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L89
            int r0 = X.AbstractC167007dF.A0B(r1)
            r14.A0I(r0)
            goto L7b
        L89:
            X.6aw r0 = X.AbstractC141776au.A00(r14)
            r8 = 0
            X.PXk r6 = new X.PXk
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AbstractC166987dD.A1Z(r6, r0)
            boolean r5 = X.AbstractC166987dD.A1b(r2)
            return r5
        L9b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIW.A0U(int, int, int, boolean, boolean, boolean):boolean");
    }

    public final void A0O(int i) {
        String str;
        AudioOverlayTrack A01;
        C51676Ms7 c51676Ms7;
        Integer valueOf = Integer.valueOf(i);
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        C51832Mva A0G = super.A01.A0G();
        if (A0G != null && (c51676Ms7 = A0G.A08) != null) {
            str = c51676Ms7.A08;
        } else {
            str = null;
        }
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        clipsCreationViewModel.A0E();
        clipsAudioStore.A02 = true;
        AudioOverlayTrack A03 = clipsAudioStore.A03(str);
        if ((A03 != null || (A03 = (AudioOverlayTrack) ((AbstractC193598he) clipsAudioStore.A0Y.getValue()).A01) != null) && (A01 = ClipsAudioStore.A01(new C206259Bi((Boolean) null, valueOf, (Integer) null, (Integer) null, 8), clipsAudioStore, A03)) != null) {
            clipsAudioStore.A09(new C8ZT(A01), A03);
        }
    }

    public final void A0S(boolean z, String str) {
        int intValue;
        Integer num;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A1J = AbstractC25226BEj.A1J(super.A01.A0A.getValue());
        while (A1J.hasNext()) {
            Iterator A1J2 = AbstractC25226BEj.A1J(A1J.next());
            while (A1J2.hasNext()) {
                C51832Mva c51832Mva = (C51832Mva) A1J2.next();
                if (z && C14360o3.A0K(str, c51832Mva.A0B)) {
                    Iterator A1J3 = AbstractC25226BEj.A1J(this.A04.A0K.A0S.getValue());
                    while (A1J3.hasNext()) {
                        C24239Ap6 c24239Ap6 = (C24239Ap6) A1J3.next();
                        if (C14360o3.A0K(c24239Ap6.A06, str)) {
                            num = Integer.valueOf((c24239Ap6.A05 + c51832Mva.A05) - c24239Ap6.A03);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                num = null;
                AbstractC166997dE.A1R(c51832Mva.A0B, new C51760Mtj(num, Integer.valueOf(c51832Mva.A05), Integer.valueOf(c51832Mva.A02), 15), A1E);
            }
        }
        ClipsAudioStore clipsAudioStore = this.A04.A0K;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C09530e4 A17 = AbstractC43592JPx.A17(it);
            Object obj = A17.A00;
            List list = clipsAudioStore.A0C;
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (C14360o3.A0K(((C24239Ap6) it2.next()).A06, obj)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null && (intValue = valueOf.intValue()) < list.size()) {
                C24239Ap6 c24239Ap62 = (C24239Ap6) list.get(intValue);
                C51760Mtj c51760Mtj = (C51760Mtj) A17.A01;
                Number number = (Number) c51760Mtj.A02;
                Number number2 = (Number) c51760Mtj.A00;
                Number number3 = (Number) c51760Mtj.A01;
                C24239Ap6 A00 = c24239Ap62.A00();
                C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.voiceover.ClipsVoiceoverSegment");
                if (number != null) {
                    A00.A03 = number.intValue();
                }
                if (number2 != null) {
                    A00.A02 = number2.intValue();
                }
                if (number3 != null) {
                    A00.A05 = number3.intValue();
                }
                A1E2.add(A00);
            }
        }
        List list2 = clipsAudioStore.A0C;
        list2.clear();
        list2.addAll(A1E2);
        clipsAudioStore.A0S.Egh(C9O3.A00(list2, ClipsAudioStore.A00(clipsAudioStore)));
    }

    public final void A0T(boolean z, boolean z2) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A1J = AbstractC25226BEj.A1J(super.A01.A0A.getValue());
        while (A1J.hasNext()) {
            Iterator A1J2 = AbstractC25226BEj.A1J(A1J.next());
            while (A1J2.hasNext()) {
                C51832Mva c51832Mva = (C51832Mva) A1J2.next();
                int i = c51832Mva.A02;
                if (i == MSW.A04(this.A04)) {
                    i = 0;
                }
                if (c51832Mva.A0A != C05F.A0j) {
                    C51676Ms7 c51676Ms7 = c51832Mva.A08;
                    if (c51676Ms7 != null && (str = c51676Ms7.A08) != null) {
                        int i2 = c51832Mva.A05;
                        Integer num = null;
                        if (z || z2) {
                            num = Integer.valueOf(c51676Ms7.A04);
                        }
                        AbstractC166997dE.A1R(str, new C206259Bi((Boolean) null, num, Integer.valueOf(i2), Integer.valueOf(i), 8), A1E);
                    }
                } else {
                    return;
                }
            }
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        clipsCreationViewModel.A0E();
        clipsAudioStore.A0D(A1E);
    }
}
