package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.JVy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC43739JVy implements View.OnClickListener {
    public final /* synthetic */ C9C0 A00;
    public final /* synthetic */ C7SC A01;

    public ViewOnClickListenerC43739JVy(C9C0 c9c0, C7SC c7sc) {
        this.A01 = c7sc;
        this.A00 = c9c0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(634579560);
        InterfaceC165507ad interfaceC165507ad = this.A01.A04;
        if (!interfaceC165507ad.CQu()) {
            ((InterfaceC165177a6) interfaceC165507ad).Ehw((MessageIdentifier) this.A00.A03, C05F.A0j);
        }
        C0f9.A0C(-647298811, A05);
    }
}
