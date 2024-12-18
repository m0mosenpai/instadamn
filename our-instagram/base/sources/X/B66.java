package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B66 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C8SF A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ InterfaceC16660sJ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B66(Activity activity, Context context, C8SF c8sf, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, float f, float f2) {
        super(0);
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = activity;
        this.A01 = f;
        this.A00 = f2;
        this.A04 = c8sf;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A03;
        C66392zG A00 = C66362zD.A00(context);
        final UserSession userSession = this.A05;
        final Activity activity = this.A02;
        final float f = this.A01;
        final float f2 = this.A00;
        final C8SF c8sf = this.A04;
        final InterfaceC16660sJ interfaceC16660sJ = this.A06;
        A00.A01(new AbstractC66412zI(activity, context, c8sf, userSession, interfaceC16660sJ, f, f2) { // from class: X.9gq
            public final float A00;
            public final float A01;
            public final Activity A02;
            public final C8SF A03;
            public final UserSession A04;
            public final C210089Qx A05;
            public final InterfaceC16660sJ A06;

            {
                C14360o3.A0B(interfaceC16660sJ, 7);
                this.A04 = userSession;
                this.A02 = activity;
                this.A01 = f;
                this.A00 = f2;
                this.A03 = c8sf;
                this.A06 = interfaceC16660sJ;
                C210089Qx c210089Qx = new C210089Qx(context, f, f2);
                C210099Qy c210099Qy = c210089Qx.A00;
                float f3 = c210099Qy.A00;
                float f4 = c210099Qy.A01;
                int i = (int) f4;
                EnumC172837mv enumC172837mv = EnumC172837mv.A0I;
                ArrayList A1M = AbstractC16960so.A1M(new C22918A8o(f4, f3, 0.0f, 0.0f));
                ArrayList A1E = AbstractC166987dD.A1E();
                C56302iJ c56302iJ = new C56302iJ(i, (int) f3);
                AbstractC166997dE.A1M(c56302iJ);
                C210089Qx.A02(c210089Qx, enumC172837mv, A1M, A1E, new C56302iJ[]{c56302iJ});
                c210089Qx.A07();
                c210089Qx.A06();
                c210089Qx.A09();
                c210089Qx.A05();
                c210089Qx.A08();
                this.A05 = c210089Qx;
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01b9 -> B:38:0x0114). Please report as a decompilation issue!!! */
            @Override // X.AbstractC66422zJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r28, X.C3OO r29) {
                /*
                    Method dump skipped, instructions count: 476
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C215749gq.bind(X.2zP, X.3OO):void");
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C23634AdT.class;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                AbstractC167017dG.A1N(viewGroup, layoutInflater);
                UserSession userSession2 = this.A04;
                InterfaceC16660sJ interfaceC16660sJ2 = this.A06;
                AbstractC167007dF.A1E(userSession2, 0, interfaceC16660sJ2);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate = layoutInflater.inflate(R.layout.gallery_grid_formats_thumbnail, viewGroup, false);
                C14360o3.A07(inflate);
                return new C9V7(inflate, userSession2, interfaceC16660sJ2);
            }
        });
        A00.A09 = true;
        return A00.A00();
    }
}
