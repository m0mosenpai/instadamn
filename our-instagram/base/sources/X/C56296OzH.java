package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.OzH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56296OzH implements InterfaceC58185Pqq {
    public final int A00;
    public final Object A01;

    public C56296OzH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void CvN() {
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void Dik() {
        if (2 - this.A00 == 0) {
            NI5 ni5 = (NI5) this.A01;
            if (ni5.A0M()) {
                ni5.A08.removeCallbacks(ni5.A0L);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC58185Pqq
    public final void Dt6(int i) {
        C187358Sd c187358Sd;
        AbstractC187378Sf c8t4;
        NIX nix;
        int i2;
        int i3;
        EnumC53185Nfh enumC53185Nfh;
        EnumC53185Nfh enumC53185Nfh2;
        String str;
        Boolean bool;
        Long A0n;
        C84B c84b;
        Integer A0G;
        AbstractC187378Sf c8tf;
        C84B A0N;
        C115475Kh A0V;
        switch (this.A00) {
            case 0:
                NI7 ni7 = (NI7) this.A01;
                if (!ni7.A0R()) {
                    return;
                }
                NIW niw = ni7.A0H;
                int i4 = ni7.A05;
                C52422NHs A00 = ni7.A0D.A00(i);
                if (A00 != null) {
                    C51832Mva c51832Mva = A00.A04;
                    Integer num = c51832Mva.A0A;
                    if (num == C05F.A0j) {
                        c187358Sd = niw.A06;
                        if (!(c187358Sd.A0E() instanceof C8TC) && !(c187358Sd.A0E() instanceof C8T9)) {
                            niw.A05.A0F(C56286Oyx.A00);
                            C22C A01 = AnonymousClass229.A01(((AbstractC50863Mdu) niw).A00);
                            ClipsCreationViewModel clipsCreationViewModel = niw.A04;
                            int A02 = clipsCreationViewModel.A0K.A02(false);
                            boolean A0m = clipsCreationViewModel.A0m();
                            if (A01.A0J() == null) {
                                return;
                            }
                            C22C.A06(EnumC50631MWs.A0I, A01, "TIMELINE_GHOST_ADD_AUDIO_TAP", A02, A0m);
                            return;
                        }
                    } else {
                        if (num != C05F.A00) {
                            return;
                        }
                        C55228Oey c55228Oey = ((AbstractC50863Mdu) niw).A01;
                        int indexOf = c55228Oey.A0I(i4).indexOf(c51832Mva);
                        if (c51832Mva.A0D) {
                            c55228Oey.A0S(i4, indexOf, false);
                            niw.A0I(i4);
                            c187358Sd = niw.A06;
                        } else {
                            EnumC53185Nfh enumC53185Nfh3 = c51832Mva.A09;
                            if (enumC53185Nfh3 == EnumC53185Nfh.A06) {
                                c187358Sd = niw.A06;
                                c8t4 = new C8T3(indexOf, i4);
                            } else {
                                if (enumC53185Nfh3 != EnumC53185Nfh.A0A) {
                                    return;
                                }
                                c187358Sd = niw.A06;
                                c8t4 = new C8T4(indexOf, i4);
                            }
                            c187358Sd.A0G(c8t4);
                            return;
                        }
                    }
                } else {
                    c187358Sd = niw.A06;
                    if (!(c187358Sd.A0E() instanceof C8T3) && !(c187358Sd.A0E() instanceof C8T4)) {
                        return;
                    } else {
                        niw.A0H();
                    }
                }
                c8t4 = MSX.A0M();
                c187358Sd.A0G(c8t4);
                return;
            case 1:
                NI6 ni6 = (NI6) this.A01;
                if (!ni6.A0Q()) {
                    return;
                }
                boolean z = ni6.A0K;
                if (!z ? !(i == 0 || i % 2 != 0) : i == 1) {
                    if (ni6.A0C.A09) {
                        return;
                    }
                    if (z) {
                        nix = ni6.A0J;
                        i3 = ni6.A01;
                        C55228Oey c55228Oey2 = ((AbstractC50863Mdu) nix).A01;
                        C09530e4 c09530e4 = c55228Oey2.A04;
                        i2 = c55228Oey2.A00;
                        boolean z2 = ((C51831MvZ) AbstractC25225BEi.A13(c55228Oey2.A09.getValue(), i3)).A05;
                        if (!z2) {
                            C22C A012 = AnonymousClass229.A01(((AbstractC50863Mdu) nix).A00);
                            if (A012.A0J() != null) {
                                C22C.A05(EnumC50631MWs.A0I, A012, null, null, "TIMELINE_ELEMENT_SELECT", "STICKER");
                            }
                        }
                        if (!c55228Oey2.A0V(i3)) {
                            return;
                        }
                        c55228Oey2.A0U(i3, !z2);
                        nix.A0T(i3);
                        if (!C14360o3.A0K(c09530e4, C55228Oey.A0C)) {
                            nix.A0I(AbstractC25230BEn.A0F(c09530e4));
                            return;
                        } else if (i2 == -1) {
                            return;
                        }
                    } else {
                        int i5 = (i - 2) / 2;
                        nix = ni6.A0J;
                        int i6 = ni6.A01;
                        C55228Oey c55228Oey3 = ((AbstractC50863Mdu) nix).A01;
                        if (c55228Oey3.A0H(i6, i5).A0A == C05F.A15) {
                            ni6.A0G.A0F(Oz1.A00);
                            C22C A013 = AnonymousClass229.A01(ni6.A0A);
                            if (A013.A0J() == null) {
                                return;
                            }
                            C22C.A0C(A013, "TIMELINE_GHOST_ADD_TEXT_TAP");
                            return;
                        }
                        int i7 = ni6.A01;
                        C09530e4 c09530e42 = c55228Oey3.A04;
                        i2 = c55228Oey3.A00;
                        boolean z3 = c55228Oey3.A0H(i7, i5).A0D;
                        Integer num2 = null;
                        if (!z3) {
                            if (c55228Oey3.A0W(i7, i5)) {
                                enumC53185Nfh = c55228Oey3.A0H(i7, i5).A09;
                            } else {
                                enumC53185Nfh = null;
                            }
                            boolean A1X = AbstractC167007dF.A1X(enumC53185Nfh, EnumC53185Nfh.A09);
                            if (c55228Oey3.A0W(i7, i5)) {
                                enumC53185Nfh2 = c55228Oey3.A0H(i7, i5).A09;
                            } else {
                                enumC53185Nfh2 = null;
                            }
                            boolean A1X2 = AbstractC167007dF.A1X(enumC53185Nfh2, EnumC53185Nfh.A06);
                            C22C A014 = AnonymousClass229.A01(((AbstractC50863Mdu) nix).A00);
                            if (A1X) {
                                str = "TEXT";
                            } else {
                                str = "STICKER";
                            }
                            if (A1X2) {
                                ClipsCreationViewModel clipsCreationViewModel2 = nix.A08;
                                num2 = Integer.valueOf(clipsCreationViewModel2.A0K.A02(false));
                                bool = Boolean.valueOf(clipsCreationViewModel2.A0m());
                            } else {
                                bool = null;
                            }
                            if (A014.A0J() != null) {
                                if (num2 == null) {
                                    A0n = null;
                                } else {
                                    A0n = AbstractC25229BEm.A0n(num2);
                                }
                                C22C.A05(EnumC50631MWs.A0I, A014, bool, A0n, "TIMELINE_ELEMENT_SELECT", str);
                            }
                        }
                        if (!c55228Oey3.A0W(i7, i5)) {
                            return;
                        }
                        c55228Oey3.A0S(i7, i5, !z3);
                        nix.A0I(i7);
                        if (!C14360o3.A0K(c09530e42, C55228Oey.A0C) && !C14360o3.A0K(c09530e42, AbstractC167007dF.A0o(Integer.valueOf(i7), i5))) {
                            nix.A0I(AbstractC25230BEn.A0F(c09530e42));
                        }
                        i3 = -1;
                    }
                    if (i2 == i3) {
                        return;
                    }
                    nix.A0T(i2);
                    return;
                }
                c187358Sd = ni6.A0H;
                if (c187358Sd.A0E() instanceof C187528Su) {
                    return;
                }
                c8t4 = MSX.A0M();
                c187358Sd.A0G(c8t4);
                return;
            default:
                NI5 ni5 = (NI5) this.A01;
                if (ni5.A0Q()) {
                    C50868Mdz c50868Mdz = ni5.A0K;
                    int i8 = (i / 2) - 1;
                    if (i != 0) {
                        ClipsCreationViewModel clipsCreationViewModel3 = c50868Mdz.A0E;
                        if (clipsCreationViewModel3.A0s()) {
                            c84b = new C84B(C16930sl.A00, false);
                        } else {
                            Object A022 = clipsCreationViewModel3.A0G.A02();
                            if (A022 != null) {
                                c84b = (C84B) A022;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        if (i != ((MSW.A06(c84b) * 2) + 3) - 1 && ((A0G = c50868Mdz.A0G()) == null || i8 != A0G.intValue())) {
                            C187358Sd c187358Sd2 = c50868Mdz.A0F;
                            if ((c187358Sd2.A0E() instanceof C187528Su) && ((A0N = MSY.A0N(clipsCreationViewModel3)) == null || (A0V = MSW.A0V(A0N, i8)) == null || !A0V.A0G.A0K)) {
                                c8tf = new C187528Su(i8);
                            } else {
                                c8tf = new C8TF(i8);
                            }
                            c187358Sd2.A0G(c8tf);
                            AnonymousClass229.A01(c50868Mdz.A0C).A0U();
                            return;
                        }
                    }
                    c187358Sd = c50868Mdz.A0F;
                    c8t4 = MSX.A0M();
                    c187358Sd.A0G(c8t4);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void Du0() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                NI6 ni6 = (NI6) this.A01;
                if (!ni6.A0Q()) {
                    return;
                }
                boolean z = ni6.A0H.A0E() instanceof C187568Sz;
                NIX nix = ni6.A0J;
                if (z) {
                    nix.A0Q();
                } else {
                    nix.A0R();
                }
                ni6.A0C.A09 = false;
                return;
            default:
                NI5 ni5 = (NI5) this.A01;
                if (ni5.A0M()) {
                    ni5.A08.removeCallbacks(ni5.A0L);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void Du3(int i) {
        if (2 - this.A00 == 0) {
            NI5 ni5 = (NI5) this.A01;
            if (ni5.A0M()) {
                ni5.A00 = i;
                ni5.A08.postDelayed(ni5.A0L, 100L);
            }
        }
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void DvS(int i) {
        C3OO A0V;
        C211029Uz c211029Uz;
        if (2 - this.A00 == 0) {
            NI5 ni5 = (NI5) this.A01;
            if (ni5.A0Q() && (A0V = ni5.A0A.A0V(i)) != null && (A0V instanceof C211029Uz) && (c211029Uz = (C211029Uz) A0V) != null && c211029Uz.A03) {
                C22C A01 = AnonymousClass229.A01(ni5.A0B);
                if (A01.A0J() != null) {
                    C22C.A09(EnumC50631MWs.A0I, A01, "TIMELINE_EDIT_CLIP_TRANSITION", ((C22F) A01).A04.A0W);
                }
                ni5.A0J.A0G(new C187538Sv(i));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        if ((r1 instanceof X.C8T6) != false) goto L26;
     */
    @Override // X.InterfaceC58185Pqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Eil(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L8
            r4 = 0
        L7:
            return r4
        L8:
            java.lang.Object r5 = r6.A01
            X.NI5 r5 = (X.NI5) r5
            X.8Sd r2 = r5.A0J
            X.8Sf r1 = r2.A0E()
            boolean r0 = r1 instanceof X.C187368Se
            if (r0 == 0) goto L1d
            r0 = r1
            X.8Se r0 = (X.C187368Se) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L3e
        L1d:
            boolean r0 = r1 instanceof X.C187538Sv
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8TG
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8TF
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8T3
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8T4
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8TE
            if (r0 != 0) goto L3e
            boolean r0 = r1 instanceof X.C8T5
            if (r0 != 0) goto L3e
            boolean r1 = r1 instanceof X.C8T6
            r0 = 0
            if (r1 == 0) goto L3f
        L3e:
            r0 = 1
        L3f:
            r4 = 0
            if (r0 == 0) goto L7
            X.8Sf r0 = r2.A0E()
            boolean r0 = r0 instanceof X.C8TF
            if (r0 != 0) goto L7
            X.8Sf r0 = r2.A0E()
            boolean r0 = r0 instanceof X.C187538Sv
            if (r0 != 0) goto L7
            r4 = 1
            if (r7 <= 0) goto L7
            int r0 = r7 / 2
            int r3 = r0 + (-1)
            android.content.Context r2 = r5.A07
            r0 = 44
            float r1 = X.AbstractC13880nE.A04(r2, r0)
            float r0 = X.OZQ.A00
            float r0 = X.AbstractC50522MSa.A00(r2, r0)
            float r1 = r1 / r0
            int r1 = (int) r1
            X.Mdz r0 = r5.A0K
            java.lang.Boolean r0 = r0.A0F(r3, r1)
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            r4 = r0 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56296OzH.Eil(int):boolean");
    }

    @Override // X.InterfaceC58185Pqq
    public final /* synthetic */ void Dt4(int i) {
    }
}
