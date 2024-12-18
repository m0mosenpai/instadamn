package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.FoW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35637FoW implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC37215GaQ A02;
    public final /* synthetic */ GXk A03;
    public final /* synthetic */ FOC A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ CharSequence[] A06;

    public ViewOnClickListenerC35637FoW(Context context, InterfaceC37215GaQ interfaceC37215GaQ, GXk gXk, FOC foc, String str, CharSequence[] charSequenceArr, int i) {
        this.A03 = gXk;
        this.A01 = context;
        this.A06 = charSequenceArr;
        this.A05 = str;
        this.A02 = interfaceC37215GaQ;
        this.A04 = foc;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(792353839);
        GXk gXk = this.A03;
        C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
        A0I.A0f(DialogInterfaceOnClickListenerC35453FkA.A00(this, 29), this.A06);
        AbstractC31175DnJ.A1O(A0I);
        gXk.AM3(A0I);
        AbstractC166987dD.A1W(A0I);
        C0f9.A0C(-201780210, A05);
    }
}
