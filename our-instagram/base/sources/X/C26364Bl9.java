package X;

import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;
import java.util.ArrayList;

/* renamed from: X.Bl9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26364Bl9 extends AbstractC51572Yf {
    public final PromptSheetAIViewModel A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Cloneable c26544Bo3;
        C14360o3.A0B(c76223bS, 0);
        CA2 ca2 = (CA2) AbstractC25525BQn.A00(c76223bS, this.A00.A06);
        if (ca2 instanceof C27323C4e) {
            c26544Bo3 = new AbstractC51572Yf();
        } else if (ca2 instanceof C27321C4c) {
            c26544Bo3 = new C26301Bk8(this.A01);
        } else if (ca2 instanceof C27322C4d) {
            c26544Bo3 = new C26544Bo3(this.A02, ((C27322C4d) ca2).A00);
        } else {
            throw B4Z.A00();
        }
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        A1E.add(c26544Bo3);
        return new C2WF(null, null, null, A1E, false);
    }

    public C26364Bl9(PromptSheetAIViewModel promptSheetAIViewModel, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = promptSheetAIViewModel;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }
}
