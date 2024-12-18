package X;

import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.CAg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27462CAg {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        c5Tl.Enr(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                z2 = true;
            }
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
            Object A0k = AbstractC25235BEs.A0k(c5Tl, -971159753);
            Object obj = C5UI.A00;
            if (A0k == obj) {
                A0k = new C44439Jl3(A00, z2);
                c5Tl.FBy(A0k);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Enp(-971159481);
            boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z2, c5Tl.AH4(A0k));
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = AbstractC25229BEm.A0x(c5Tl, A0k, 0, z2);
            }
            C5UX.A05(c5Tl, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
            c5Tl.Enp(-2068013981);
            InterfaceC20340zA interfaceC20340zA = (InterfaceC20340zA) c5Tl.AJX(AbstractC27735CLc.A00);
            c5Tl.Enp(1680121597);
            if (interfaceC20340zA == null) {
                Object AJX = c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
                C14360o3.A0B(AJX, 0);
                interfaceC20340zA = (InterfaceC20340zA) AbstractC224517h.A01(AbstractC224517h.A06(C29944DIi.A00, AbstractC224717j.A0C(AJX, C29943DIh.A00)));
            }
            C117505Tk.A0L(c117505Tk, false);
            if (interfaceC20340zA == null) {
                Object A0K = AbstractC25228BEl.A0K(c5Tl);
                while (true) {
                    if (A0K instanceof ContextWrapper) {
                        if (A0K instanceof InterfaceC20340zA) {
                            break;
                        } else {
                            A0K = ((ContextWrapper) A0K).getBaseContext();
                        }
                    } else {
                        A0K = null;
                        break;
                    }
                }
                interfaceC20340zA = (InterfaceC20340zA) A0K;
            }
            C117505Tk.A0L(c117505Tk, false);
            if (interfaceC20340zA != null) {
                C00M onBackPressedDispatcher = interfaceC20340zA.getOnBackPressedDispatcher();
                Object AJX2 = c5Tl.AJX(C5VN.A00);
                c5Tl.Enp(-971159120);
                boolean A1a = AbstractC25232BEp.A1a(c5Tl, AJX2, A0k, c5Tl.AH4(onBackPressedDispatcher));
                Object EEc2 = c5Tl.EEc();
                if (A1a || EEc2 == obj) {
                    EEc2 = new DHZ(0, A0k, AJX2, onBackPressedDispatcher);
                    c5Tl.FBy(EEc2);
                }
                C5UX.A01(c5Tl, AJX2, onBackPressedDispatcher, AbstractC25225BEi.A1B(c117505Tk, EEc2, false));
            } else {
                throw AbstractC166987dD.A14("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30215DSu(interfaceC16820sZ, i, i2, 0, z2);
        }
    }
}
