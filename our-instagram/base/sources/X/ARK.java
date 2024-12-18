package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ARK implements View.OnClickListener {
    public final /* synthetic */ C9BS A00;
    public final /* synthetic */ C8QA A01;

    public ARK(C9BS c9bs, C8QA c8qa) {
        this.A01 = c8qa;
        this.A00 = c9bs;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-578011294);
        C8QA c8qa = this.A01;
        if (c8qa.A01) {
            InterfaceC16620sF interfaceC16620sF = c8qa.A04;
            C14360o3.A0A(view);
            interfaceC16620sF.invoke(view, this.A00.A00);
        }
        C0f9.A0C(-947068218, A05);
    }
}
