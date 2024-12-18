package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Ih5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41867Ih5 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41867Ih5(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(130420710);
        AnonymousClass308 anonymousClass308 = this.A00;
        String moduleName = anonymousClass308.A0X.getModuleName();
        AnonymousClass308.A03(anonymousClass308, EnumC75193Zm.A0N, false);
        C1M1 c1m1 = anonymousClass308.A0a;
        if (c1m1 != null) {
            C41771Ien.A04(anonymousClass308, anonymousClass308.E6Q(anonymousClass308.A07()).A00(), anonymousClass308.A0T, anonymousClass308.A07(), null, null, "sfplt_in_grid", c1m1.getSessionId(), null, null, null, null, anonymousClass308.A01, false);
        }
        if (moduleName.equals("explore_popular")) {
            if (C18U.A06(C06090Tz.A05, anonymousClass308.A0T, 36315627820027340L)) {
                C146106i8 A0K = AbstractC31171DnF.A0K();
                Context context = anonymousClass308.A0P;
                AbstractC25226BEj.A1N(context, A0K, 2131967888);
                A0K.A0I = context.getString(2131967887);
                AbstractC31175DnJ.A0l(context, A0K, 2131967886);
                A0K.A0A(new C42690Iul(anonymousClass308, 1));
                A0K.A07(R.drawable.instagram_eye_off_pano_outline_32);
                A0K.A02();
                A0K.A0L = true;
                A0K.A06();
                AbstractC31178DnM.A1S(A0K);
                C0f9.A0C(-1036266155, A05);
            }
        }
        C9GR.A06(anonymousClass308.A0P, 2131973183);
        C0f9.A0C(-1036266155, A05);
    }
}
