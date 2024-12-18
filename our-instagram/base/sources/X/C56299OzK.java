package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OzK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56299OzK implements InterfaceC58200Pr6 {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ NI7 A01;

    @Override // X.InterfaceC58200Pr6
    public final void DQc(Integer num, int i, int i2) {
        C14360o3.A0B(num, 2);
        NI7 ni7 = this.A01;
        if (ni7.A0G.A0E() instanceof C187558Sy) {
            NIW niw = ni7.A0H;
            niw.A0F();
            if (num.intValue() == 1) {
                int i3 = ni7.A05;
                C55228Oey c55228Oey = ((AbstractC50863Mdu) niw).A01;
                c55228Oey.A0R(i3, MSZ.A07(c55228Oey), false);
                niw.A0I(i3);
                String A0N = niw.A0N();
                Integer[] numArr = ni7.A0B.A02;
                niw.A0U(i3, MSW.A07(numArr, 0), MSW.A07(numArr, 1), false, true, true);
                if (A0N != null) {
                    NI7.A05(ni7, A0N);
                }
                C22C A01 = AnonymousClass229.A01(ni7.A09);
                ClipsCreationViewModel clipsCreationViewModel = ni7.A0F;
                int A02 = clipsCreationViewModel.A0K.A02(false);
                Integer valueOf = Integer.valueOf(A02);
                boolean A0m = clipsCreationViewModel.A0m();
                if (A01.A0J() != null) {
                    if (valueOf != null) {
                        C22C.A06(EnumC50631MWs.A0I, A01, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG", A02, A0m);
                    } else {
                        C22C.A0C(A01, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG");
                    }
                }
            }
        }
        ni7.A0I.A0V(C16930sl.A00);
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQe(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void Dn4(int i, int i2) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void Dn5() {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void Dn6(int i, int i2, float f) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DsH(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void Du4(MotionEvent motionEvent, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvp(Integer num, int i, int i2) {
        int i3;
        boolean z;
        C09530e4 c09530e4;
        EnumC50631MWs enumC50631MWs;
        String str;
        C09530e4 c09530e42;
        C14360o3.A0B(num, 2);
        NI7 ni7 = this.A01;
        ni7.A0I.A0V(C16930sl.A00);
        ni7.A02 = false;
        NIW niw = ni7.A0H;
        String A0N = niw.A0N();
        AudioOverlayTrack A03 = niw.A04.A0K.A03(A0N);
        C55098Ob9 c55098Ob9 = ni7.A0B;
        Integer[] numArr = c55098Ob9.A02;
        int A07 = MSW.A07(numArr, 0);
        int i4 = 0;
        if (A03 != null) {
            if (num == C05F.A00) {
                i4 = A07 - A03.A04;
            }
            i3 = A03.A03 + i4;
        } else {
            i3 = 0;
        }
        Integer num2 = C05F.A00;
        if ((num == num2 && (c09530e42 = c55098Ob9.A00) != null && A07 == AbstractC25230BEn.A0F(c09530e42)) || (num == C05F.A01 && (c09530e4 = c55098Ob9.A00) != null && MSW.A07(numArr, 1) == AbstractC25229BEm.A0A(c09530e4))) {
            z = true;
        } else {
            z = false;
        }
        niw.A0U(ni7.A05, MSW.A07(numArr, 0), MSW.A07(numArr, 1), false, AbstractC167007dF.A1X(num, num2), false);
        if (A0N != null) {
            NI7.A05(ni7, A0N);
        }
        NI7.A03(ni7, i3);
        C22C A01 = AnonymousClass229.A01(ni7.A09);
        ClipsCreationViewModel clipsCreationViewModel = ni7.A0F;
        int A02 = clipsCreationViewModel.A0K.A02(false);
        boolean A0m = clipsCreationViewModel.A0m();
        EnumC114925Hg A0J = A01.A0J();
        if (z) {
            if (A0J != null) {
                enumC50631MWs = EnumC50631MWs.A0I;
                str = "TIMELINE_AUDIO_TRIM_UNCHANGED";
            } else {
                return;
            }
        } else {
            if (A0J == null) {
                return;
            }
            enumC50631MWs = EnumC50631MWs.A0I;
            str = "TIMELINE_AUDIO_TRIM_SUCCESS";
        }
        C22C.A07(enumC50631MWs, A01, str, A02, A0m);
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvr(Integer num, float f, int i, int i2) {
        C14360o3.A0B(num, 2);
        NI7 ni7 = this.A01;
        ni7.A0B.A03(num, C57523Pfx.A00(ni7, 27), new C57256Pbe(11, num, ni7), f, i, i2, true);
    }

    public C56299OzK(RecyclerView recyclerView, NI7 ni7) {
        this.A00 = recyclerView;
        this.A01 = ni7;
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQW(int i) {
        NI7 ni7 = this.A01;
        List<O7N> list = ni7.A0D.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (O7N o7n : list) {
                if ((o7n instanceof C52422NHs) && ((C52422NHs) o7n).A04.A0A == C05F.A0j) {
                    return;
                }
            }
        }
        if (ni7.A0R()) {
            ni7.A0D();
            C187358Sd c187358Sd = ni7.A0G;
            NIW niw = ni7.A0H;
            C55228Oey c55228Oey = ((AbstractC50863Mdu) niw).A01;
            c187358Sd.A0G(new C8Sx(MSZ.A07(c55228Oey)) { // from class: X.8Sy
                public final int A00;

                {
                    super(0);
                    this.A00 = r2;
                }

                public final boolean equals(Object obj) {
                    return this == obj || ((obj instanceof C187558Sy) && this.A00 == ((C187558Sy) obj).A00);
                }

                public final int hashCode() {
                    return this.A00;
                }

                public final String toString() {
                    return AnonymousClass001.A0I("AudioDragState(selectedIndex=", ')', this.A00);
                }
            });
            if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C) && ni7.A05 != MSZ.A06(c55228Oey)) {
                niw.A0H();
            }
            int i2 = ni7.A05;
            c55228Oey.A0R(i2, (i - 2) / 2, true);
            niw.A0I(i2);
            NI7.A02(ni7);
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQd(int i, int i2, float f) {
        NI7 ni7 = this.A01;
        if (ni7.A0G.A0E() instanceof C187558Sy) {
            ni7.A0B.A05(C57337Pcx.A00, C57523Pfx.A00(ni7, 26), f, i, i2);
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvt(Integer num) {
        NI7 ni7 = this.A01;
        C51832Mva A0G = ((AbstractC50863Mdu) ni7.A0H).A01.A0G();
        if (A0G != null) {
            ni7.A0B.A00 = AbstractC167007dF.A0o(Integer.valueOf(A0G.A04), A0G.A03);
        }
        ni7.A02 = true;
        NI7.A02(ni7);
        C22C A01 = AnonymousClass229.A01(ni7.A09);
        ClipsCreationViewModel clipsCreationViewModel = ni7.A0F;
        int A02 = clipsCreationViewModel.A0K.A02(false);
        boolean A0m = clipsCreationViewModel.A0m();
        if (A01.A0J() != null) {
            C22C.A07(EnumC50631MWs.A0I, A01, "TIMELINE_AUDIO_TRIM", A02, A0m);
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void EME(int i) {
        int i2 = -i;
        this.A00.scrollBy(i2, 0);
        NI7 ni7 = this.A01;
        ni7.A0I.A0R(ni7.A0C, i2, ni7.A05);
    }

    @Override // X.InterfaceC58200Pr6
    public final void CyP(int i) {
        EME(i);
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQX(MotionEvent motionEvent, int i) {
        DQW(i);
    }
}
