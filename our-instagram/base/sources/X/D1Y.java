package X;

import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* loaded from: classes5.dex */
public final class D1Y implements Runnable {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ C25562BRz A01;

    public D1Y(C51762Yz c51762Yz, C25562BRz c25562BRz) {
        this.A00 = c51762Yz;
        this.A01 = c25562BRz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C51762Yz c51762Yz = this.A00;
        if (!AbstractC25229BEm.A1W(c51762Yz)) {
            C25562BRz c25562BRz = this.A01;
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = c25562BRz.A07;
            C39G c39g = c25562BRz.A0A;
            InterfaceC904941j interfaceC904941j = c25562BRz.A05;
            Integer num = null;
            if (interfaceC904941j != null) {
                str = interfaceC904941j.Am2();
                num = interfaceC904941j.Am9();
            } else {
                str = null;
            }
            c39g.ElH(notesPogThoughtBubbleUiState, num, str);
            c51762Yz.A00();
        }
    }
}
