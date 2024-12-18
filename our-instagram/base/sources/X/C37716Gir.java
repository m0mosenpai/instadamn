package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gir, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37716Gir extends AbstractC37623GhI implements C38Y {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final AbstractC59962oe A04;
    public final ClipsViewerConfig A05;
    public final UserSession A06;
    public final C44496Jm2 A07;
    public final InterfaceC60442pS A08;
    public final C37604Ggz A09;
    public final IG5 A0A;
    public final InterfaceC16820sZ A0B;

    public C37716Gir(Context context, AbstractC59962oe abstractC59962oe, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C44496Jm2 c44496Jm2, InterfaceC60442pS interfaceC60442pS, C37604Ggz c37604Ggz, IG5 ig5, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c37604Ggz, 6);
        this.A04 = abstractC59962oe;
        this.A06 = userSession;
        this.A02 = context;
        this.A08 = interfaceC60442pS;
        this.A05 = clipsViewerConfig;
        this.A09 = c37604Ggz;
        this.A0A = ig5;
        this.A0B = interfaceC16820sZ;
        this.A07 = c44496Jm2;
        this.A03 = abstractC59962oe.requireActivity();
        this.A00 = true;
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final void DrY(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        ClipsViewerConfig clipsViewerConfig = this.A05;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        C14360o3.A0B(clipsViewerSource, 0);
        for (EnumC37736GjB enumC37736GjB : EnumC37736GjB.values()) {
            if (enumC37736GjB.A02 == clipsViewerSource) {
                if (enumC37736GjB != EnumC37736GjB.A08 && !this.A01 && !AbstractC166997dE.A1Z(clipsViewerConfig.A0U, false)) {
                    boolean A0K = C14360o3.A0K(clipsViewerConfig.A00, AbstractC43591JPw.A00(320));
                    Context context = this.A02;
                    int i2 = 2131955530;
                    if (A0K) {
                        i2 = 2131955563;
                    }
                    String A0u = AbstractC25227BEk.A0u(context, i2);
                    C146106i8 A0K2 = AbstractC31171DnF.A0K();
                    AbstractC25226BEj.A1N(context, A0K2, 2131955531);
                    A0K2.A02();
                    A0K2.A04 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                    A0K2.A0D(A0u);
                    A0K2.A0A = new C49493Lu6(i, 1, c120985dq, this);
                    A0K2.A0L = true;
                    A0K2.A02 = context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama);
                    A0K2.A0R = true;
                    A0K2.A0J = true;
                    A0K2.A06();
                    AbstractC25233BEq.A1F(A0K2);
                    this.A01 = true;
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        C120985dq A09;
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null && (A09 = c37556GgC.A09(i)) != null) {
            C37644Ghd C09 = C37546Gg2.A03(this.A0B).C09(A09);
            if (A09.A02 != null) {
                AbstractC37677GiE.A00(A09, C09, this.A06);
            }
        }
    }
}
