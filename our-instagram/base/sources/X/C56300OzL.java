package X;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OzL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56300OzL implements InterfaceC58200Pr6 {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ NI6 A01;

    @Override // X.InterfaceC58200Pr6
    public final void DQc(Integer num, int i, int i2) {
        C14360o3.A0B(num, 2);
        NI6 ni6 = this.A01;
        C51165Mj8 c51165Mj8 = ni6.A0C;
        c51165Mj8.A07 = false;
        c51165Mj8.A09 = false;
        NIX nix = ni6.A0J;
        nix.A0F();
        if (ni6.A0H.A0E() instanceof C8T0) {
            int A00 = (((C8T0) r1).A00() - 2) / 2;
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (!ni6.A03) {
                        if (ni6.A0K) {
                            int i3 = ni6.A01;
                            ((AbstractC50863Mdu) nix).A01.A0T(i3, false);
                            nix.A0T(i3);
                            nix.A0P();
                        } else {
                            int i4 = ni6.A01;
                            ((AbstractC50863Mdu) nix).A01.A0R(i4, A00, false);
                            nix.A0I(i4);
                            nix.A0Q();
                        }
                    } else {
                        c51165Mj8.A07 = true;
                        c51165Mj8.A09 = true;
                        ni6.A03 = false;
                    }
                }
            } else {
                int i5 = ni6.A01;
                C55228Oey c55228Oey = ((AbstractC50863Mdu) nix).A01;
                c55228Oey.A0R(i5, A00, false);
                nix.A0I(i5);
                int i6 = ni6.A01;
                Integer[] numArr = ni6.A0B.A02;
                nix.A0Y(i6, MSW.A07(numArr, 0), MSW.A07(numArr, 1), false, true);
                c55228Oey.A0G();
                C22C A01 = AnonymousClass229.A01(ni6.A0A);
                if (A01.A0J() != null) {
                    C22C.A0C(A01, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG");
                }
            }
        }
        ni6.A0I.A0V(C16930sl.A00);
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQe(MotionEvent motionEvent) {
        OFW ofw;
        View A0d;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj;
        NI6 ni6 = this.A01;
        ni6.A0C.A07 = false;
        AbstractC187378Sf A0E = ni6.A0H.A0E();
        if (A0E instanceof C8T0) {
            ofw = ni6.A0F;
            A00(ni6, ofw);
            A0d = ni6.A0D.A0d(((C8T0) A0E).A00());
        } else {
            if (!ni6.A0K || !(A0E instanceof C8T1)) {
                return;
            }
            ofw = ni6.A0F;
            A00(ni6, ofw);
            A0d = ni6.A0D.A0d(1);
        }
        if (A0d != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ClipData newPlainText = ClipData.newPlainText("original_row", String.valueOf(ni6.A01));
            C14360o3.A0A(newPlainText);
            C14360o3.A0B(newPlainText, 3);
            ofw.A01 = A0d;
            int[] iArr = new int[2];
            A0d.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            ofw.A04.getLocationInWindow(iArr2);
            View view = ofw.A06;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    ((ViewGroup.LayoutParams) marginLayoutParams).width = A0d.getWidth();
                    ((ViewGroup.LayoutParams) marginLayoutParams).height = A0d.getHeight();
                }
            } else {
                marginLayoutParams = null;
            }
            if (view != null) {
                view.setLayoutParams(marginLayoutParams);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(iArr[0] - iArr2[0]);
                marginLayoutParams.topMargin = iArr[1] - iArr2[1];
            }
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = ofw.A03;
            if (view2 != null) {
                obj = view2.getLayoutParams();
            } else {
                obj = null;
            }
            if ((obj instanceof FrameLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) obj) != null) {
                ((ViewGroup.LayoutParams) marginLayoutParams2).width = A0d.getWidth();
                ((ViewGroup.LayoutParams) marginLayoutParams2).height = A0d.getHeight();
                marginLayoutParams2.setMarginStart(iArr[0] - iArr2[0]);
                marginLayoutParams2.topMargin = iArr[1] - iArr2[1];
            }
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams2);
            }
            C50786Mbw c50786Mbw = new C50786Mbw(A0d, view, ofw, x, y);
            if (view != null) {
                view.startDragAndDrop(newPlainText, c50786Mbw, A0d, 512);
            }
        }
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
    public final void Dvp(Integer num, int i, int i2) {
        C14360o3.A0B(num, 2);
        NI6 ni6 = this.A01;
        ni6.A0C.A0A = false;
        ni6.A00 = -1;
        NIX nix = ni6.A0J;
        nix.A0F();
        int i3 = ni6.A01;
        Integer[] numArr = ni6.A0B.A02;
        nix.A0Y(i3, MSW.A07(numArr, 0), MSW.A07(numArr, 1), false, AbstractC167007dF.A1X(num, C05F.A00));
        EnumC53185Nfh enumC53185Nfh = EnumC53185Nfh.A09;
        C51832Mva A0G = ((AbstractC50863Mdu) nix).A01.A0G();
        String str = "TEXT";
        if (A0G != null) {
            C22C A01 = AnonymousClass229.A01(ni6.A0A);
            EnumC53185Nfh enumC53185Nfh2 = A0G.A09;
            String str2 = "STICKER";
            if (enumC53185Nfh2 == enumC53185Nfh) {
                str2 = "TEXT";
            }
            A01.A1n(str2);
            enumC53185Nfh = enumC53185Nfh2;
        }
        ni6.A0I.A0V(C16930sl.A00);
        C9RL A00 = C9OT.A00(ni6.A0A);
        if (enumC53185Nfh != enumC53185Nfh) {
            str = "STICKER";
        }
        C51710Msf.A00(A00, str, "TRIM");
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvr(Integer num, float f, int i, int i2) {
        C14360o3.A0B(num, 2);
        NI6 ni6 = this.A01;
        C55228Oey c55228Oey = ((AbstractC50863Mdu) ni6.A0J).A01;
        if (MSZ.A06(c55228Oey) == ni6.A01) {
            ni6.A00 = (MSZ.A07(c55228Oey) * 2) + 2;
        }
        ni6.A0B.A03(num, new C57521Pfv(ni6, 6), new C57256Pbe(16, num, ni6), f, i, i2, true);
    }

    public C56300OzL(RecyclerView recyclerView, NI6 ni6) {
        this.A00 = recyclerView;
        this.A01 = ni6;
    }

    public static void A00(NI6 ni6, OFW ofw) {
        LinearLayout linearLayout = ni6.A08;
        ArrayList A1N = AbstractC16960so.A1N(linearLayout);
        List list = ofw.A0B;
        list.clear();
        list.addAll(A1N);
        ArrayList A1N2 = AbstractC16960so.A1N(linearLayout);
        List list2 = ofw.A0A;
        list2.clear();
        list2.addAll(A1N2);
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQW(int i) {
        NI6.A02(this.A01, i);
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQX(MotionEvent motionEvent, int i) {
        NI6.A02(this.A01, i);
    }

    @Override // X.InterfaceC58200Pr6
    public final void DQd(int i, int i2, float f) {
        NI6 ni6 = this.A01;
        if (ni6.A0H.A0E() instanceof C8T0) {
            ni6.A0B.A05(C57339Pcz.A00, new C57521Pfv(ni6, 5), f, i, i2);
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void DsH(MotionEvent motionEvent) {
        NI6 ni6 = this.A01;
        if (!(ni6.A0H.A0E() instanceof C187548Sw) && !ni6.A0C.A09) {
            ni6.A0J.A0R();
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void Du4(MotionEvent motionEvent, boolean z, boolean z2) {
        NI6 ni6 = this.A01;
        if (!(ni6.A0H.A0E() instanceof C187548Sw) && ni6.A0J.A0L()) {
            ni6.A03 = true;
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvt(Integer num) {
        EnumC191648eM enumC191648eM;
        NI6 ni6 = this.A01;
        NIX nix = ni6.A0J;
        C55228Oey c55228Oey = ((AbstractC50863Mdu) nix).A01;
        C51832Mva A0G = c55228Oey.A0G();
        if (A0G != null) {
            EnumC53185Nfh enumC53185Nfh = A0G.A09;
            EnumC53185Nfh enumC53185Nfh2 = EnumC53185Nfh.A09;
            C1818484t c1818484t = nix.A07;
            if (enumC53185Nfh == enumC53185Nfh2) {
                enumC191648eM = EnumC191648eM.A0U;
            } else {
                enumC191648eM = EnumC191648eM.A0V;
            }
            c1818484t.A01(enumC191648eM);
        }
        nix.A0E.Egh(EnumC53130Nej.A04);
        ni6.A0C.A0A = true;
        if (MSZ.A06(c55228Oey) == ni6.A01) {
            ni6.A00 = (MSZ.A07(c55228Oey) * 2) + 2;
        }
        NI6.A01(ni6);
    }

    @Override // X.InterfaceC58200Pr6
    public final void EME(int i) {
        int i2 = -i;
        this.A00.scrollBy(i2, 0);
        NI6 ni6 = this.A01;
        ni6.A0I.A0R(ni6.A0E, i2, ni6.A08());
    }

    @Override // X.InterfaceC58200Pr6
    public final void CyP(int i) {
        EME(i);
    }
}
