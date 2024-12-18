package X;

import android.view.View;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CIS {
    public static final void A00(View view, C5Tl c5Tl, Modifier modifier, C5Hc c5Hc, int i, int i2, boolean z, boolean z2) {
        C1333560c c1333560c;
        long j;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(1803156279);
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1U = AbstractC25226BEj.A1U(i2 & 8, z);
        boolean A1U2 = AbstractC25226BEj.A1U(i2 & 16, z2);
        if (C0fH.A02()) {
            C0fH.A01(1510480117, "com.instagram.direct.fragment.sharesheet.view.ExternalShareRow (ExternalShareRow.kt:47)");
        }
        InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, AbstractC25225BEi.A02(((i >> 6) & 14) >> 3));
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, modifier2);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A02, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        C6GM c6gm = C6GM.A00;
        c5Tl.Eno(-65427727);
        if (!A1U) {
            AbstractC28389Cfs.A00(c5Tl);
        }
        C117505Tk.A0L(c117505Tk, false);
        if (A1U) {
            c1333560c = new C1333560c(24.0f, 0.0f, 24.0f, 0.0f);
            j = AbstractC25227BEk.A0g(c5Tl, -65420012).A0B;
        } else {
            c1333560c = new C1333560c(16.0f, 16.0f, 16.0f, 16.0f);
            j = AbstractC25227BEk.A0g(c5Tl, -65418499).A0C;
        }
        C117505Tk.A0L(c117505Tk, false);
        Object A0q = AbstractC25227BEk.A0q(c5Tl, -65416691);
        Object obj = A0q;
        if (A0q == C5UI.A00) {
            ArrayList A0q2 = AbstractC167017dG.A0q(c5Hc);
            Iterator it = c5Hc.iterator();
            while (it.hasNext()) {
                Class<?> cls = it.next().getClass();
                Map map = C0YZ.A03;
                C14360o3.A0B(cls, 1);
                AbstractC166997dE.A1R(AbstractC13230m9.A01(cls), true, A0q2);
            }
            C09530e4[] c09530e4Arr = (C09530e4[]) A0q2.toArray(new C09530e4[0]);
            C09530e4[] c09530e4Arr2 = (C09530e4[]) Arrays.copyOf(c09530e4Arr, c09530e4Arr.length);
            C64770TTe c64770TTe = new C64770TTe();
            c64770TTe.putAll(AbstractC06930Yk.A0D(c09530e4Arr2));
            c5Tl.FBy(c64770TTe);
            obj = c64770TTe;
        }
        C117505Tk.A0L(c117505Tk, false);
        C6IS.A02(AbstractC118255Wn.A01(20.0f), c1333560c, C6IE.A00(c5Tl, 0, 0, 0, 3), c5Tl, null, null, new DI1(obj, view, c5Hc, c6gm, j, A1U2), 12607488, 105);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-84307218);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV2(view, c5Hc, modifier2, i, i2, 3, A1U2, A1U);
        }
    }
}
