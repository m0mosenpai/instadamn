package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;

/* renamed from: X.Acu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23600Acu implements C1NJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewOnTouchListenerC1829389o A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        float A04;
        C14360o3.A0B(c73033Pe, 1);
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = this.A01;
        if (ViewOnTouchListenerC1829389o.A05(viewOnTouchListenerC1829389o)) {
            Bitmap bitmap = c73033Pe.A01;
            Float f = null;
            if (viewOnTouchListenerC1829389o.A0U) {
                try {
                    Context context = this.A00;
                    C14360o3.A0A(context);
                    f = Float.valueOf(AbstractC13880nE.A04(context, context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height)));
                } catch (Resources.NotFoundException unused) {
                    AbstractC166987dD.A1T(C18950wb.A01, "Resource.NotFoundException when getting R.dimen.intermediate_viewer_selfie_reply_media_corner_radius", 20134884);
                }
            }
            Context context2 = this.A00;
            AbstractC167007dF.A1C(context2);
            C8FY c8fy = new C8FY(context2.getResources(), bitmap);
            if (f != null) {
                A04 = f.floatValue();
            } else {
                A04 = AbstractC13880nE.A04(context2, 12);
            }
            c8fy.A02(A04);
            this.A02.invoke(c8fy);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C23600Acu(Context context, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = viewOnTouchListenerC1829389o;
        this.A00 = context;
        this.A02 = interfaceC16660sJ;
    }
}
