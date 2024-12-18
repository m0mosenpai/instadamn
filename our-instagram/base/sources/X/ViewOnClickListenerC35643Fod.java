package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fod, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35643Fod implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C31446Drq A05;
    public final /* synthetic */ InterfaceC132405yL A06;
    public final /* synthetic */ DirectShareTarget A07;
    public final /* synthetic */ String A08;

    public ViewOnClickListenerC35643Fod(C31446Drq c31446Drq, InterfaceC132405yL interfaceC132405yL, DirectShareTarget directShareTarget, String str, int i, int i2, int i3, int i4, int i5) {
        this.A06 = interfaceC132405yL;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = directShareTarget;
        this.A08 = str;
        this.A02 = i5;
        this.A05 = c31446Drq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2133933219);
        InterfaceC132405yL interfaceC132405yL = this.A06;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A04;
        int i4 = this.A03;
        interfaceC132405yL.Dld(this.A05, this.A07, this.A08, i, i2, i3, i4, this.A02);
        C0f9.A0C(1918726869, A05);
    }
}
