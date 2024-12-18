package X;

import android.widget.CompoundButton;
import java.util.HashMap;

/* renamed from: X.FqK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35737FqK implements CompoundButton.OnCheckedChangeListener {
    public E70 A00;
    public final C18920wW A01;
    public final C41761wQ A02;
    public final InterfaceC37169GZg A03;
    public final C2056398n A04;

    public C35737FqK(C18920wW c18920wW, C41761wQ c41761wQ, InterfaceC37169GZg interfaceC37169GZg, C2056398n c2056398n) {
        C14360o3.A0B(c41761wQ, 1);
        this.A02 = c41761wQ;
        this.A03 = interfaceC37169GZg;
        this.A04 = c2056398n;
        this.A01 = c18920wW;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C42221xC APY;
        InterfaceC42241xE interfaceC42241xE;
        E70 e70 = this.A00;
        if (e70 != null) {
            C41761wQ c41761wQ = this.A02;
            C7TQ C78 = this.A03.C78();
            InterfaceC83733oI interfaceC83733oI = e70.A0L;
            if (z) {
                APY = C78.ARs(interfaceC83733oI);
                interfaceC42241xE = GKA.A00;
            } else {
                APY = C78.APY(interfaceC83733oI);
                interfaceC42241xE = GKB.A00;
            }
            c41761wQ.A02(APY, interfaceC42241xE);
            InterfaceC19630xq interfaceC19630xq = this.A04.A00;
            if (interfaceC19630xq.getInt("thread_translation_tooltip_impression", 0) < 3) {
                AbstractC167007dF.A18(interfaceC19630xq, "thread_translation_tooltip_impression", 3);
            }
            String str = E70.A01(e70).A00;
            if (str != null) {
                C18920wW c18920wW = this.A01;
                boolean A0C = e70.A0C();
                C14360o3.A0B(c18920wW, 0);
                HashMap A0g = AbstractC31179DnN.A0g(str, A0C);
                A0g.put("enabled_status", String.valueOf(z));
                F37.A00(c18920wW, "thread_details_translations_button_toggled", A0g);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
