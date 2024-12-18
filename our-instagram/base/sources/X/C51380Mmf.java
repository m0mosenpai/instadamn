package X;

import android.app.Activity;
import android.content.Context;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.UUID;

/* renamed from: X.Mmf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51380Mmf extends C3OO implements InterfaceC58295Psn {
    public int A00;
    public OHM A01;
    public C51906Mwo A02;
    public Float A03;
    public boolean A04;
    public final ViewGroup A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final PJO A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final Handler A0F;
    public final OT1 A0G;
    public final C55095Ob6 A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.OOO, java.lang.Object] */
    public C51380Mmf(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55095Ob6 c55095Ob6) {
        super(viewGroup);
        AbstractC167027dH.A0a(1, viewGroup, interfaceC11380iw, userSession, c55095Ob6);
        this.A05 = viewGroup;
        this.A06 = interfaceC11380iw;
        this.A07 = userSession;
        this.A0H = c55095Ob6;
        this.A0F = AbstractC167007dF.A0J();
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        this.A0G = new OT1(A0L);
        if (C37051o3.A00 == null) {
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        Activity activity = (Activity) A0L;
        C14360o3.A0B(activity, 0);
        PJO pjo = new PJO(activity, A0L, userSession, new Object());
        pjo.A00 = new C56203OxC(this);
        this.A08 = pjo;
        this.A0E = C57520Pfu.A00(this, 18);
        this.A09 = C57520Pfu.A00(this, 13);
        this.A0D = C57520Pfu.A00(this, 17);
        this.A0A = C57520Pfu.A00(this, 14);
        this.A0C = C57520Pfu.A00(this, 16);
        this.A0B = C57520Pfu.A00(this, 15);
    }

    @Override // X.InterfaceC58295Psn
    public final void E4Z(InterfaceC58104PpT interfaceC58104PpT, Boolean bool, Integer num) {
        C51906Mwo c51906Mwo;
        C14360o3.A0B(interfaceC58104PpT, 0);
        if (interfaceC58104PpT.Cff() && (c51906Mwo = this.A02) != null && c51906Mwo.A0O) {
            if (((C51379Mme) this.A0D.getValue()).A0D == null) {
                this.A0F.postDelayed(new PTN(interfaceC58104PpT, this, bool, num), 100L);
                return;
            }
            A01(interfaceC58104PpT, bool, num, 0);
            C5TA c5ta = this.A08.A01;
            if (c5ta == null) {
                return;
            }
            c5ta.A0B("resume", false);
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void EEA() {
    }

    @Override // X.InterfaceC58295Psn
    public final void EM0(float f) {
    }

    @Override // X.InterfaceC58295Psn
    public final void EZd() {
    }

    @Override // X.InterfaceC58295Psn
    public final void Eok(String str) {
        PJO pjo = this.A08;
        C5TA c5ta = pjo.A01;
        if (c5ta != null) {
            c5ta.A0C(str, true);
        }
        AbstractC50522MSa.A1W(pjo.A04);
        PJO.A00(pjo);
        this.A00 = 0;
        this.A0F.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51906Mwo c51906Mwo = (C51906Mwo) interfaceC57856PlM;
        C14360o3.A0B(c51906Mwo, 0);
        this.A02 = c51906Mwo;
        if (c51906Mwo.A0O) {
            ViewGroup viewGroup = this.A05;
            viewGroup.setVisibility(0);
            ((PCI) this.A0E.getValue()).ADV(c51906Mwo);
            ((PCH) this.A09.getValue()).ADV(c51906Mwo);
            float f = 0.0f;
            float f2 = 0.78f;
            if (c51906Mwo.A0S) {
                f = 0.1f;
                f2 = 0.68f;
            }
            InterfaceC09390do interfaceC09390do = this.A0D;
            ((C51379Mme) interfaceC09390do.getValue()).ADV(c51906Mwo);
            ((PCQ) this.A0A.getValue()).ADV(c51906Mwo);
            Float f3 = this.A03;
            float f4 = c51906Mwo.A00;
            boolean A0I = C14360o3.A0I(f3, f4);
            this.A03 = Float.valueOf(f4);
            viewGroup.post(new PTM(this, f, f2, A0I));
            Integer num = c51906Mwo.A09;
            if (num != null) {
                int i = this.A00;
                int intValue = num.intValue();
                if (i != intValue) {
                    A00(c51906Mwo.A05, this, null, num, c51906Mwo.A0V);
                    this.A00 = intValue;
                }
            }
            if (!c51906Mwo.A0b) {
                AbstractC86533tR.A00((C86013sY) ((C51379Mme) interfaceC09390do.getValue()).A0H.getValue());
                return;
            }
            return;
        }
        this.A05.setVisibility(8);
    }

    @Override // X.InterfaceC58295Psn
    public final PJO AmJ() {
        C51265Mko A00;
        PCQ pcq = (PCQ) this.A0A.getValue();
        Integer num = pcq.A02;
        if (num == null || (A00 = PCQ.A00(pcq, num.intValue())) == null) {
            return null;
        }
        return A00.A00.A05;
    }

    @Override // X.InterfaceC58295Psn
    public final PJO CFL() {
        return this.A08;
    }

    @Override // X.InterfaceC58295Psn
    public final void CNT() {
        this.A0D.getValue();
    }

    @Override // X.InterfaceC58295Psn
    public final void CNU() {
        C51379Mme c51379Mme = (C51379Mme) this.A0D.getValue();
        View view = c51379Mme.A05;
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            MSX.A14(AbstractC43594JPz.A0H(view).setStartDelay(0L).setInterpolator(new AccelerateDecelerateInterpolator()), new PO0(c51379Mme));
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.InterfaceC58295Psn
    public final void E3m() {
        C5TA c5ta = this.A08.A01;
        if (c5ta != null) {
            c5ta.A09("server_paused_video");
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void EEE() {
        ((PCQ) this.A0A.getValue()).A02();
    }

    @Override // X.InterfaceC58295Psn
    public final void EKq() {
        C5TA c5ta = this.A08.A01;
        if (c5ta != null) {
            c5ta.A0B("resume", false);
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void ESh(int i) {
        int i2;
        InterfaceC58142Pq7 interfaceC58142Pq7;
        PJO pjo = this.A08;
        C5TA c5ta = pjo.A01;
        if (c5ta != null) {
            int Azm = c5ta.A06.Azm();
            if (Azm > 0 && i >= Azm) {
                i2 = i % Azm;
            } else {
                i2 = i;
            }
            c5ta.A04(i2, false);
            if (c5ta.A01 && (interfaceC58142Pq7 = pjo.A00) != null) {
                interfaceC58142Pq7.Dbw(i, Azm);
            }
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void Eh4(OHM ohm) {
        this.A01 = ohm;
        ((PCI) this.A0E.getValue()).A01 = ohm;
        ((PCH) this.A09.getValue()).A00 = ohm;
        C51379Mme c51379Mme = (C51379Mme) this.A0D.getValue();
        c51379Mme.A01 = ohm;
        c51379Mme.A0C.A0A(new C56390P2b(1, c51379Mme, ohm), R.id.listener_id_for_cowatch_content_load);
        PCQ pcq = (PCQ) this.A0A.getValue();
        pcq.A00 = ohm;
        ((C51117MiM) pcq.A06.getValue()).A01 = pcq.A00;
    }

    @Override // X.InterfaceC58295Psn
    public final void ElK() {
        PCI pci = (PCI) this.A0E.getValue();
        if (pci.A00 == null) {
            pci.A0C.post(new PO1(pci));
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void F7q() {
        PJO AmJ;
        C51906Mwo c51906Mwo = this.A02;
        if (c51906Mwo != null) {
            if (c51906Mwo.A0J == null) {
                AmJ = this.A08;
            } else {
                AmJ = AmJ();
                if (AmJ == null) {
                    return;
                }
            }
            C5TA c5ta = AmJ.A01;
            if (c5ta != null) {
                c5ta.A03(-1);
            }
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void FCg() {
        C5TA c5ta = this.A08.A01;
        if (c5ta == null || !c5ta.A01) {
            this.A0H.A03();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void onDestroy() {
        PJO pjo = this.A08;
        C5TA c5ta = pjo.A01;
        if (c5ta != null) {
            c5ta.A0A("hide");
        }
        pjo.A01 = null;
        PJO.A00(pjo);
        this.A0F.removeCallbacksAndMessages(null);
    }

    public static final void A00(InterfaceC58104PpT interfaceC58104PpT, C51380Mmf c51380Mmf, Boolean bool, Integer num, boolean z) {
        C51906Mwo c51906Mwo;
        int i;
        C5TA c5ta;
        if (interfaceC58104PpT.Cff() && (c51906Mwo = c51380Mmf.A02) != null && c51906Mwo.A0O) {
            if (((C51379Mme) c51380Mmf.A0D.getValue()).A0D == null) {
                c51380Mmf.A0F.postDelayed(new RunnableC57067PTg(interfaceC58104PpT, c51380Mmf, bool, num, z), 100L);
                return;
            }
            PJO pjo = c51380Mmf.A08;
            C5TA c5ta2 = pjo.A01;
            if (c5ta2 != null) {
                i = c5ta2.A06.getCurrentPositionMs();
            } else {
                i = 0;
            }
            c51380Mmf.A01(interfaceC58104PpT, bool, num, i);
            if (z || (c5ta = pjo.A01) == null) {
                return;
            }
            c5ta.A0B("resume", false);
        }
    }

    private final void A01(InterfaceC58104PpT interfaceC58104PpT, Boolean bool, Integer num, int i) {
        boolean z;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A07.userId);
        A1C.append('_');
        String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), A1C);
        PJO pjo = this.A08;
        MediaFrameLayout mediaFrameLayout = ((C51379Mme) this.A0D.getValue()).A0D;
        String moduleName = this.A06.getModuleName();
        C46088Kam A00 = AbstractC47100Krv.A00(A0v);
        OT1 ot1 = this.A0G;
        try {
            z = AcousticEchoCanceler.isAvailable();
        } catch (NullPointerException unused) {
            z = false;
        }
        pjo.A01(interfaceC58104PpT, mediaFrameLayout, A00, bool, num, moduleName, i, z, ot1.A00.isSpeakerphoneOn(), false);
    }
}
