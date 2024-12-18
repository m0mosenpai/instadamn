package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class EPN extends EPQ {
    public final /* synthetic */ FM2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPN(C012804r c012804r, FM2 fm2, Integer num, String str, int i) {
        super(c012804r, Integer.valueOf(i), num, str);
        this.A00 = fm2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        FM2 fm2 = this.A00;
        C63397SjR A0y = AbstractC25228BEl.A0y(fm2.A00, fm2.A02, C2Fb.A1W, "https://help.instagram.com/654906392080948");
        A0y.A0S = "igd_xac_thread_will_be_read_only_composer";
        A0y.A0A();
    }
}
