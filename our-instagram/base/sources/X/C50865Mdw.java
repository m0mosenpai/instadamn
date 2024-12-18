package X;

import android.app.Application;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mdw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50865Mdw extends C193578hc {
    public ImmutableList A00;
    public AudioFilterType A01;
    public Integer A02;
    public final UserSession A03;
    public final C185278Js A04;
    public final C50864Mdv A05;
    public final C87D A06;
    public final C8NF A07;
    public final ClipsCreationViewModel A08;
    public final C187358Sd A09;
    public final C8NL A0A;
    public final NIX A0B;
    public final C183298Bb A0C;
    public final InterfaceC19390xP A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C0UO A0G;
    public final C50868Mdz A0H;
    public final InterfaceC19390xP A0I;
    public final InterfaceC19390xP A0J;
    public final InterfaceC19390xP A0K;
    public final InterfaceC19390xP A0L;
    public final InterfaceC19390xP A0M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50865Mdw(Application application, UserSession userSession, C185278Js c185278Js, C50864Mdv c50864Mdv, C87D c87d, C8NF c8nf, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C8NL c8nl, C50868Mdz c50868Mdz, NIX nix, C183298Bb c183298Bb) {
        super(application);
        C14360o3.A0B(application, 1);
        AbstractC25234BEr.A1R(userSession, c50868Mdz, c187358Sd, c8nf, clipsCreationViewModel);
        C14360o3.A0B(c183298Bb, 7);
        AbstractC25234BEr.A0l(8, c87d, c185278Js, nix, c8nl);
        C14360o3.A0B(c50864Mdv, 12);
        this.A03 = userSession;
        this.A0H = c50868Mdz;
        this.A09 = c187358Sd;
        this.A07 = c8nf;
        this.A08 = clipsCreationViewModel;
        this.A0C = c183298Bb;
        this.A06 = c87d;
        this.A04 = c185278Js;
        this.A0B = nix;
        this.A0A = c8nl;
        this.A05 = c50864Mdv;
        C008002u A00 = C10E.A00(null);
        this.A0E = A00;
        this.A0G = A00;
        C008002u A002 = C10E.A00(c187358Sd.A0E());
        this.A0F = A002;
        MV5 A003 = MV5.A00(this, AbstractC43593JPy.A16(c8nf.A08, A002, 16), 0);
        this.A0K = A003;
        MV5 A004 = MV5.A00(this, A002, 1);
        this.A0L = A004;
        C15150pV A16 = AbstractC43593JPy.A16(AbstractC43593JPy.A16(A002, c8nl.A07, 14), c8nl.A05, 15);
        this.A0J = A16;
        C15150pV A162 = AbstractC43593JPy.A16(c185278Js.A0G, A002, 13);
        this.A0I = A162;
        C15150pV A163 = AbstractC43593JPy.A16(A002, c50864Mdv.A01, 17);
        this.A0M = A163;
        this.A0D = AnonymousClass111.A04(A003, A004, A16, A162, A163);
    }

    public static final ImmutableList A00(AbstractC187378Sf abstractC187378Sf, C50865Mdw c50865Mdw) {
        ImmutableList of;
        C8TB c8tb;
        if ((abstractC187378Sf instanceof C8TB) && (c8tb = (C8TB) abstractC187378Sf) != null) {
            int i = c8tb.A00;
            if (Integer.valueOf(i) != null) {
                if (i == -1) {
                    List A0N = c50865Mdw.A08.A0N();
                    ArrayList A0q = AbstractC167017dG.A0q(A0N);
                    Iterator it = A0N.iterator();
                    while (it.hasNext()) {
                        MSX.A1Q(A0q, ((AudioOverlayTrack) it.next()).A00);
                    }
                    C87D c87d = c50865Mdw.A06;
                    Float valueOf = Float.valueOf(c87d.A0E());
                    ClipsAudioStore clipsAudioStore = c87d.A01;
                    ArrayList A1N = AbstractC16960so.A1N(valueOf, Float.valueOf(MSY.A00(clipsAudioStore.A0n)), Float.valueOf(MSY.A00(clipsAudioStore.A0g)), Float.valueOf(MSY.A00(clipsAudioStore.A0i)));
                    A1N.addAll(A0q);
                    return AbstractC31173DnH.A0L(A1N);
                }
                Float A0H = c50865Mdw.A08.A0H(i);
                if (A0H != null) {
                    of = ImmutableList.of((Object) A0H);
                    C14360o3.A07(of);
                    return of;
                }
            }
        }
        of = ImmutableList.of();
        C14360o3.A07(of);
        return of;
    }

    public final void A0E() {
        AbstractC187378Sf A0M;
        int i;
        int i2;
        int i3;
        C05A c05a = this.A0E;
        Object value = c05a.getValue();
        EnumC53115NeS enumC53115NeS = EnumC53115NeS.A03;
        if (value != enumC53115NeS) {
            c05a.Egh(enumC53115NeS);
            C187358Sd c187358Sd = this.A09;
            AbstractC187378Sf A0E = c187358Sd.A0E();
            if (A0E instanceof C8TA) {
                C8NF c8nf = this.A07;
                List list = c8nf.A06;
                synchronized (list) {
                    UserSession userSession = c8nf.A02;
                    C55105ObK A00 = C50713MaC.A00(userSession);
                    synchronized (A00) {
                    }
                    list.clear();
                    c8nf.A01 = false;
                    Application A0D = c8nf.A0D();
                    List list2 = c8nf.A04;
                    ArrayList A0q = AbstractC167017dG.A0q(list2);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A0q.add(new O7H(C56221OxU.A00, AbstractC167007dF.A0B(it)));
                    }
                    A00.A06(A0D, A0q);
                    C50713MaC.A01(userSession, MSZ.A0G(c8nf));
                }
            } else {
                if (A0E instanceof C8TC) {
                    C8TC c8tc = (C8TC) A0E;
                    A0M = new C8TE(c8tc.A01, c8tc.A00, c8tc.A02);
                } else {
                    if (A0E instanceof C8T4) {
                        C8T4 c8t4 = (C8T4) A0E;
                        i = c8t4.A00;
                        i2 = c8t4.A01;
                    } else {
                        if (!(A0E instanceof C52415NHl)) {
                            if (A0E instanceof C8TB) {
                                C8TB c8tb = (C8TB) A0E;
                                C51737MtK c51737MtK = c8tb.A01;
                                if (c51737MtK != null) {
                                    A0M = new C8T3(c51737MtK.A00, c51737MtK.A01);
                                } else {
                                    i3 = c8tb.A00;
                                    if (i3 == -1) {
                                        C51737MtK c51737MtK2 = c8tb.A03;
                                        if (c51737MtK2 != null) {
                                            i2 = c51737MtK2.A01;
                                            i = c51737MtK2.A00;
                                        }
                                    }
                                    A0M = new C8TF(i3);
                                }
                            } else {
                                if (A0E instanceof C8T3) {
                                    return;
                                }
                                if (A0E instanceof C187478Sp) {
                                    i3 = ((C187478Sp) A0E).A00;
                                } else if (A0E instanceof C8T8) {
                                    C8T8 c8t8 = (C8T8) A0E;
                                    int i4 = c8t8.A00;
                                    if (i4 == -1) {
                                        return;
                                    } else {
                                        A0M = new C8T3(i4, c8t8.A01);
                                    }
                                } else if (A0E instanceof C52409NHf) {
                                    C52409NHf c52409NHf = (C52409NHf) A0E;
                                    Integer num = c52409NHf.A02;
                                    if (num == C05F.A00) {
                                        i3 = c52409NHf.A00;
                                    } else {
                                        if (num != C05F.A0C) {
                                            return;
                                        }
                                        i = c52409NHf.A00;
                                        i2 = c52409NHf.A01;
                                    }
                                }
                                A0M = new C8TF(i3);
                            }
                        }
                        if (C18U.A06(C06090Tz.A05, this.A03, 36327116857620791L)) {
                            A0M = new C52416NHm(-1);
                        } else {
                            A0M = MSX.A0M();
                        }
                    }
                    A0M = new C8T4(i, i2);
                }
                c187358Sd.A0G(A0M);
            }
            A0M = MSX.A0M();
            c187358Sd.A0G(A0M);
        }
    }
}
