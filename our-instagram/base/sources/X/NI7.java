package X;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NI7 extends OXZ {
    public List A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final LinearLayout A07;
    public final RecyclerView A08;
    public final UserSession A09;
    public final IgFrameLayout A0A;
    public final C55098Ob9 A0B;
    public final EnumC53170NfR A0C;
    public final C51164Mj7 A0D;
    public final OJs A0E;
    public final ClipsCreationViewModel A0F;
    public final C187358Sd A0G;
    public final NIW A0H;
    public final C50868Mdz A0I;
    public final boolean A0J;
    public final ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 A0K;
    public final boolean A0L;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        if (r35 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (X.AbstractC13620mo.A02(r24) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (r35 == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1, X.3Fe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NI7(final android.content.Context r24, android.widget.LinearLayout r25, com.instagram.common.session.UserSession r26, X.C89P r27, X.C187358Sd r28, X.NIW r29, X.C50868Mdz r30, int r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI7.<init>(android.content.Context, android.widget.LinearLayout, com.instagram.common.session.UserSession, X.89P, X.8Sd, X.NIW, X.Mdz, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r13.A03 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2 < r14.size()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI7.A0Q(java.util.List):void");
    }

    public static void A00(NI7 ni7) {
        RecyclerView recyclerView = ni7.A08;
        if (recyclerView != null) {
            OJs oJs = ni7.A0E;
            oJs.A08.smoothScrollBy(0, 0);
            recyclerView.A15(oJs.A05);
        }
    }

    public static final void A01(NI7 ni7) {
        InterfaceC58035PoL interfaceC58035PoL;
        RecyclerView recyclerView = ni7.A08;
        if (recyclerView != null && !recyclerView.A1D()) {
            int i = 0;
            for (Object obj : ni7.A0D.A01) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                O7N o7n = (O7N) obj;
                if (o7n instanceof C52422NHs) {
                    C51832Mva c51832Mva = ((C52422NHs) o7n).A04;
                    if (c51832Mva.A0A == C05F.A0j) {
                        C51676Ms7 c51676Ms7 = c51832Mva.A08;
                        if (c51676Ms7 != null) {
                            int i3 = ((OXZ) ni7).A00;
                            int i4 = ni7.A04 / 2;
                            int i5 = 0;
                            if (i3 > i4) {
                                i5 = i3 - i4;
                            }
                            c51676Ms7.A00 = i5;
                        }
                        Object A0V = recyclerView.A0V(i);
                        if ((A0V instanceof InterfaceC58035PoL) && (interfaceC58035PoL = (InterfaceC58035PoL) A0V) != null) {
                            int i6 = ((OXZ) ni7).A00;
                            int i7 = ni7.A04 / 2;
                            int i8 = 0;
                            if (i6 > i7) {
                                i8 = i6 - i7;
                            }
                            interfaceC58035PoL.FCe(i8);
                        }
                    }
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r2 >= r5.A0D.A01.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.NI7 r5) {
        /*
            X.Ob9 r4 = r5.A0B
            r4.A02()
            X.Mdz r0 = r5.A0I
            java.util.ArrayList r3 = r0.A0H()
            X.NIW r0 = r5.A0H
            X.Oey r0 = r0.A01
            int r0 = X.MSZ.A07(r0)
            int r0 = r0 * 2
            int r2 = r0 + 2
            if (r2 < 0) goto L24
            X.Mj7 r0 = r5.A0D
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            if (r2 < r1) goto L25
        L24:
            r0 = 0
        L25:
            r1 = 0
            if (r0 == 0) goto L3e
            X.Mj7 r0 = r5.A0D
            X.NHs r0 = r0.A00(r2)
            if (r0 == 0) goto L3e
            X.Mva r2 = r0.A04
            int r0 = r2.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A02
            java.util.List r1 = X.AbstractC43594JPz.A11(r1, r0)
        L3e:
            r4.A04(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI7.A02(X.NI7):void");
    }

    public static final void A03(NI7 ni7, int i) {
        C51676Ms7 c51676Ms7;
        int i2;
        int i3;
        float f;
        int i4 = i;
        NIW niw = ni7.A0H;
        C51832Mva A0G = ((AbstractC50863Mdu) niw).A01.A0G();
        if (A0G != null && (c51676Ms7 = A0G.A08) != null) {
            UserSession userSession = ni7.A09;
            String str = c51676Ms7.A08;
            C14360o3.A0B(str, 1);
            ClipsCreationViewModel clipsCreationViewModel = niw.A04;
            AudioOverlayTrack A03 = clipsCreationViewModel.A0K.A03(str);
            if (A03 != null) {
                C57625Phb c57625Phb = C57625Phb.A00;
                C14360o3.A0B(c57625Phb, 3);
                MusicAssetModel musicAssetModel = A03.A08;
                if (musicAssetModel != null) {
                    i2 = musicAssetModel.A00;
                } else {
                    i2 = A03.A02;
                }
                int A04 = MSW.A04(clipsCreationViewModel);
                int i5 = A03.A01;
                int i6 = A03.A04;
                if (i5 == 0) {
                    i3 = A04 - i6;
                } else {
                    i3 = i5 - i6;
                }
                float f2 = i3;
                EnumC185288Jt enumC185288Jt = A03.A05;
                if (enumC185288Jt != null) {
                    f = enumC185288Jt.A01;
                } else {
                    f = 1.0f;
                }
                int i7 = i2 - ((int) (f2 * f));
                if (i4 > i7) {
                    i4 = i7;
                }
                String str2 = A03.A0B;
                String str3 = A03.A0A;
                String str4 = A03.A0E;
                MusicBrowseCategory musicBrowseCategory = A03.A09;
                MusicAssetModel musicAssetModel2 = A03.A08;
                AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(enumC185288Jt, A03.A06, A03.A07, musicAssetModel2, musicBrowseCategory, str2, str3, str4, A03.A0C, A03.A00, i4, i2 - i4, i6, i5);
                String str5 = A03.A0D;
                C14360o3.A0B(str5, 0);
                audioOverlayTrack.A0D = str5;
                niw.A0D.Egh(audioOverlayTrack);
                new OJI(MSZ.A0G(niw), userSession, new C56269Oye(niw, audioOverlayTrack, A03, c57625Phb), audioOverlayTrack).A00();
            }
        }
    }

    public static final void A04(NI7 ni7, int i, int i2) {
        AbstractC51365MmQ abstractC51365MmQ;
        RecyclerView recyclerView = ni7.A08;
        C3OO c3oo = null;
        if (recyclerView != null) {
            c3oo = recyclerView.A0V((MSZ.A07(((AbstractC50863Mdu) ni7.A0H).A01) * 2) + 2);
        }
        if ((c3oo instanceof NIF) && (abstractC51365MmQ = (AbstractC51365MmQ) c3oo) != null) {
            C50809McW c50809McW = abstractC51365MmQ.A01;
            c50809McW.A0H = i;
            c50809McW.A0G = i2;
        }
    }

    public static final void A05(NI7 ni7, String str) {
        AbstractC187378Sf c8t3;
        C51676Ms7 c51676Ms7;
        NIW niw = ni7.A0H;
        Iterator A1J = AbstractC25226BEj.A1J(((AbstractC50863Mdu) niw).A01.A0A.getValue());
        int i = 0;
        while (A1J.hasNext()) {
            Object next = A1J.next();
            int i2 = i + 1;
            if (i >= 0) {
                Iterator A1J2 = AbstractC25226BEj.A1J(next);
                int i3 = 0;
                while (A1J2.hasNext()) {
                    Object next2 = A1J2.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C51832Mva c51832Mva = (C51832Mva) next2;
                        int ordinal = c51832Mva.A09.ordinal();
                        String str2 = null;
                        if (ordinal != 6) {
                            if (ordinal == 5 && (c51676Ms7 = c51832Mva.A08) != null) {
                                str2 = c51676Ms7.A08;
                            }
                        } else {
                            str2 = c51832Mva.A0B;
                        }
                        if (C14360o3.A0K(str2, str)) {
                            niw.A0J(i, i3);
                            Integer valueOf = Integer.valueOf(i);
                            Integer valueOf2 = Integer.valueOf(i3);
                            boolean z = ni7.A0L;
                            C187358Sd c187358Sd = ni7.A0G;
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (z) {
                                c8t3 = new C8T4(intValue2, intValue);
                            } else {
                                c8t3 = new C8T3(intValue2, intValue);
                            }
                            c187358Sd.A0G(c8t3);
                            return;
                        }
                        i3 = i4;
                    }
                }
                i = i2;
            }
            AbstractC16960so.A1U();
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.AbstractC187378Sf r16) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI7.A0O(X.8Sf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(java.lang.Integer r10, float r11, float r12) {
        /*
            r9 = this;
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 r0 = r9.A0K
            int r5 = r0.A1a()
            r4 = 0
            r3 = 0
        L8:
            if (r3 >= r5) goto L8f
            X.Mj7 r7 = r9.A0D
            android.content.Context r2 = r9.A06
            r1 = 0
            if (r3 == 0) goto L40
            int r0 = r7.getItemCount()
            r6 = 1
            int r0 = r0 - r6
            if (r3 == r0) goto L40
            java.util.List r0 = r7.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            r8 = 0
            int r0 = r3 % 2
            if (r0 != 0) goto L7e
            r8 = 1
            X.NHs r0 = r7.A00(r3)
            if (r0 == 0) goto L8d
            X.Mva r0 = r0.A04
            int r6 = r0.A05
        L31:
            if (r8 == 0) goto L54
            X.NHs r0 = r7.A00(r3)
            if (r0 == 0) goto L7c
            X.Mva r0 = r0.A04
            int r0 = r0.A02
        L3d:
            int r0 = r0 - r6
            if (r0 >= r1) goto L41
        L40:
            r0 = 0
        L41:
            float r1 = X.AbstractC50522MSa.A00(r2, r12)
            float r6 = (float) r0
            float r1 = r1 * r6
            int r1 = (int) r1
            float r0 = X.AbstractC50522MSa.A00(r2, r11)
            float r0 = r0 * r6
            int r0 = (int) r0
            int r1 = r1 - r0
            float r0 = (float) r1
            float r4 = r4 - r0
            int r3 = r3 + 1
            goto L8
        L54:
            java.util.List r0 = r7.A01
            int r0 = r0.size()
            int r0 = r0 + (-2)
            if (r3 != r0) goto L6f
            int r0 = r3 + (-3)
            X.NHs r0 = r7.A00(r0)
            if (r0 == 0) goto L7c
            X.Mva r0 = r0.A04
            X.Ms7 r0 = r0.A08
            if (r0 == 0) goto L7c
            int r0 = r0.A02
            goto L3d
        L6f:
            int r0 = r3 + 1
            X.NHs r0 = r7.A00(r0)
            if (r0 == 0) goto L7c
            X.Mva r0 = r0.A04
            int r0 = r0.A05
            goto L3d
        L7c:
            r0 = 0
            goto L3d
        L7e:
            if (r3 == r6) goto L8d
            int r0 = r3 + (-1)
            X.NHs r0 = r7.A00(r0)
            if (r0 == 0) goto L8d
            X.Mva r0 = r0.A04
            int r6 = r0.A02
            goto L31
        L8d:
            r6 = 0
            goto L31
        L8f:
            if (r10 == 0) goto Lac
            android.content.Context r3 = r9.A06
            int r0 = r10.intValue()
            float r2 = X.AbstractC50522MSa.A00(r3, r12)
            float r1 = (float) r0
            float r2 = r2 * r1
            float r0 = X.AbstractC50522MSa.A00(r3, r11)
            float r0 = r0 * r1
            float r2 = r2 - r0
            float r4 = r4 + r2
            float r0 = X.AbstractC50522MSa.A00(r3, r12)
            float r0 = r0 * r1
            int r0 = (int) r0
            r9.A00 = r0
        Lac:
            X.NIW r1 = r9.A0H
            int r0 = r9.A05
            r1.A0I(r0)
            A01(r9)
            r9.A0G(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI7.A0P(java.lang.Integer, float, float):void");
    }

    public final boolean A0R() {
        AbstractC187378Sf A0E = this.A0G.A0E();
        if ((A0E instanceof C187508Ss) || (A0E instanceof C187528Su) || (A0E instanceof C187558Sy) || (A0E instanceof C187568Sz) || (A0E instanceof C187548Sw) || (A0E instanceof C187518St) || (A0E instanceof C8TB) || (A0E instanceof C187538Sv) || this.A02) {
            return false;
        }
        return true;
    }

    public static void A06(Iterator it, int i) {
        IgFrameLayout igFrameLayout;
        NI7 ni7 = (NI7) it.next();
        if (ni7.A0J && (igFrameLayout = ni7.A0A) != null) {
            igFrameLayout.setVisibility(i);
        }
    }

    public final void A0N() {
        int i;
        A00(this);
        OJs oJs = this.A0E;
        synchronized (oJs) {
            i = oJs.A01;
        }
        this.A0H.A0O(i);
        synchronized (oJs) {
            oJs.A08.post(new PQ8(oJs, oJs.A01));
        }
        C187358Sd c187358Sd = this.A0G;
        int i2 = -1;
        if (this.A0J) {
            i2 = 2;
        }
        c187358Sd.A0G(new C8T3(i2, 0));
    }
}
