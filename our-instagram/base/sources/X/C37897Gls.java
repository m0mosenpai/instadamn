package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.Gls, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37897Gls extends AbstractC37623GhI implements C38Y, JHZ {
    public View A00;
    public View A01;
    public InterfaceC41501vz A02;
    public IgdsMediaButton A03;
    public C59952od A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final AbstractC39459Hbl A08;
    public final C37604Ggz A09;
    public final C37546Gg2 A0A;

    public C37897Gls(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, C37604Ggz c37604Ggz) {
        C14360o3.A0B(context, 1);
        AbstractC25234BEr.A1R(userSession, c37546Gg2, abstractC39459Hbl, interfaceC11380iw, c37604Ggz);
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = c37546Gg2;
        this.A08 = abstractC39459Hbl;
        this.A06 = interfaceC11380iw;
        this.A09 = c37604Ggz;
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
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    public static final C120985dq A00(C37897Gls c37897Gls) {
        int A03;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c37897Gls).A02;
        if (c37556GgC == null || (A03 = c37556GgC.A03()) < 0) {
            return null;
        }
        AbstractC37552Gg8 abstractC37552Gg8 = c37897Gls.A0A.A0A;
        if (A03 >= abstractC37552Gg8.A0B()) {
            return null;
        }
        return abstractC37552Gg8.A0F(A03);
    }

    public static final void A02(C37897Gls c37897Gls) {
        C38321qM c38321qM;
        IgdsMediaButton igdsMediaButton;
        Resources resources;
        int i;
        C37759GjY c37759GjY = C37759GjY.A00;
        UserSession userSession = c37897Gls.A07;
        C120985dq A00 = A00(c37897Gls);
        if (A00 != null) {
            c38321qM = A00.A02;
        } else {
            c38321qM = null;
        }
        if (c37759GjY.A02(userSession, c38321qM)) {
            View view = c37897Gls.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (A01(c37897Gls) != null) {
                boolean A1b = AbstractC31177DnL.A1b(A01(c37897Gls));
                View view2 = c37897Gls.A01;
                if (A1b) {
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                    igdsMediaButton = c37897Gls.A03;
                    if (igdsMediaButton != null) {
                        resources = c37897Gls.A05.getResources();
                        i = 2131956183;
                    } else {
                        return;
                    }
                } else {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    igdsMediaButton = c37897Gls.A03;
                    if (igdsMediaButton == null) {
                        return;
                    }
                    resources = c37897Gls.A05.getResources();
                    i = 2131956182;
                }
                igdsMediaButton.setLabel(resources.getString(i));
                return;
            }
        }
        View view3 = c37897Gls.A00;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    public static final Boolean A01(C37897Gls c37897Gls) {
        C38321qM c38321qM;
        C120985dq A00 = A00(c37897Gls);
        if (A00 != null) {
            c38321qM = A00.A02;
        } else {
            c38321qM = null;
        }
        PromptStickerModel A002 = C37759GjY.A00(c38321qM);
        if (A002 == null) {
            return null;
        }
        return Boolean.valueOf(A002.A0K());
    }

    @Override // X.JHZ
    public final void onDataSetChanged() {
        A02(this);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC41501vz interfaceC41501vz = this.A02;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz, C57452kK.class);
        }
    }

    @Override // X.JHZ
    public final void DNJ(C120985dq c120985dq, int i) {
        A02(this);
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A02(this);
    }
}
