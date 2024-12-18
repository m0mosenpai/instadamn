package X;

import android.content.DialogInterface;

/* renamed from: X.FiN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35346FiN implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ G3O A01;
    public final /* synthetic */ InterfaceC83733oI A02;
    public final /* synthetic */ String A03;

    public DialogInterfaceOnClickListenerC35346FiN(G3O g3o, InterfaceC83733oI interfaceC83733oI, String str, int i) {
        this.A01 = g3o;
        this.A00 = i;
        this.A02 = interfaceC83733oI;
        this.A03 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C142846ck A0d = AbstractC31172DnG.A0d(this.A01.A03);
        int i2 = this.A00;
        String A0f = AbstractC31177DnL.A0f(this.A02);
        String str = this.A03;
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A0d);
            AbstractC31174DnI.A1I(A0I, "dismiss_translation_dialog");
            A0I.A0o("channel_translation_education");
            AbstractC31177DnL.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "thread_view", A0f, str, i2));
        }
    }
}
