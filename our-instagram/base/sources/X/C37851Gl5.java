package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.Gl5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37851Gl5 extends AbstractC37623GhI implements C38Y {
    public int A00;
    public View A01;
    public View A02;
    public IgdsMediaButton A03;
    public C59952od A04;
    public boolean A05;
    public final FragmentActivity A06;
    public final C22P A07;
    public final ClipsViewerSource A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final InterfaceC43589JPu A0B;
    public final C37546Gg2 A0C;
    public final IG5 A0D;
    public final Boolean A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final SearchContext A0J;
    public final Integer A0K;
    public final boolean A0L;

    public C37851Gl5(FragmentActivity fragmentActivity, C22P c22p, ClipsViewerSource clipsViewerSource, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, C37546Gg2 c37546Gg2, IG5 ig5, Boolean bool, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        AbstractC25229BEm.A1I(c22p, 4, c37546Gg2);
        AbstractC25233BEq.A0y(7, interfaceC11380iw, userSession, interfaceC43589JPu);
        AbstractC25229BEm.A1M(ig5, 10, clipsViewerSource);
        C14360o3.A0B(fragmentActivity, 14);
        this.A0F = str;
        this.A0E = bool;
        this.A07 = c22p;
        this.A0J = searchContext;
        this.A0C = c37546Gg2;
        this.A09 = interfaceC11380iw;
        this.A0A = userSession;
        this.A0B = interfaceC43589JPu;
        this.A0D = ig5;
        this.A0G = str2;
        this.A0H = str3;
        this.A08 = clipsViewerSource;
        this.A06 = fragmentActivity;
        this.A0L = z;
        this.A0K = num;
        this.A0I = z2;
        this.A00 = -1;
    }

    public static final boolean A01(C120985dq c120985dq) {
        EnumC129395t1 enumC129395t1;
        EnumC129395t1 enumC129395t12;
        if (c120985dq != null) {
            enumC129395t1 = c120985dq.A01;
        } else {
            enumC129395t1 = null;
        }
        if (enumC129395t1 != EnumC129395t1.A0H) {
            if (c120985dq != null) {
                enumC129395t12 = c120985dq.A01;
            } else {
                enumC129395t12 = null;
            }
            if (enumC129395t12 != EnumC129395t1.A08 && !C76493bt.A0B(c120985dq)) {
                if ((c120985dq != null ? c120985dq.A01 : null) != EnumC129395t1.A09) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r2.getContentDescription() == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.C120985dq r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto L3a
            X.1qM r0 = r4.A02
            if (r0 == 0) goto L3a
            X.3xC r0 = r0.A1Q()
            if (r0 == 0) goto L3a
            com.instagram.api.schemas.MusicInfo r0 = r0.A00
            com.instagram.music.common.model.MusicConsumptionModel r0 = r0.BVa()
            if (r0 == 0) goto L3a
            java.lang.Boolean r0 = r0.AbG()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r1)
        L1d:
            r0 = r0 ^ 1
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r3.A03
            if (r2 == 0) goto L33
            if (r0 == 0) goto L2e
            if (r5 == 0) goto L2e
            java.lang.CharSequence r1 = r2.getContentDescription()
            r0 = 0
            if (r1 != 0) goto L30
        L2e:
            r0 = 8
        L30:
            r2.setVisibility(r0)
        L33:
            r3.A0B()
            A00(r3)
            return
        L3a:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37851Gl5.A0D(X.5dq, boolean):void");
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C37851Gl5 r5) {
        /*
            com.instagram.clips.intf.ClipsViewerSource r0 = r5.A08
            int r0 = r0.ordinal()
            r3 = 8
            r2 = 0
            switch(r0) {
                case 3: goto L59;
                case 5: goto L4e;
                case 8: goto L64;
                case 11: goto L64;
                case 13: goto L64;
                case 26: goto L64;
                case 46: goto L7a;
                case 56: goto L6f;
                case 67: goto L64;
                case 79: goto L4e;
                case 81: goto L64;
                case 131: goto L94;
                case 133: goto L4e;
                case 138: goto L85;
                default: goto Lc;
            }
        Lc:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A03
            if (r0 == 0) goto L13
            r0.setVisibility(r3)
        L13:
            r1 = r2
            r4 = r2
        L15:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r5.A03
            if (r3 == 0) goto L30
            if (r1 == 0) goto L4c
            int r1 = r1.intValue()
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L4c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.getString(r1)
        L2d:
            r3.setLabel(r0)
        L30:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r5.A03
            if (r3 == 0) goto L4b
            if (r4 == 0) goto L48
            int r1 = r4.intValue()
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L48
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L48
            java.lang.String r2 = r0.getString(r1)
        L48:
            r3.setContentDescription(r2)
        L4b:
            return
        L4c:
            r0 = r2
            goto L2d
        L4e:
            r0 = 2131976418(0x7f1360e2, float:1.9589956E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956185(0x7f1311d9, float:1.9548919E38)
            goto L8f
        L59:
            r0 = 2131976422(0x7f1360e6, float:1.9589964E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956186(0x7f1311da, float:1.954892E38)
            goto L8f
        L64:
            r0 = 2131956189(0x7f1311dd, float:1.9548927E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956188(0x7f1311dc, float:1.9548925E38)
            goto L8f
        L6f:
            r0 = 2131972157(0x7f13503d, float:1.9581314E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956187(0x7f1311db, float:1.9548923E38)
            goto L8f
        L7a:
            r0 = 2131976426(0x7f1360ea, float:1.9589972E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131976427(0x7f1360eb, float:1.9589974E38)
            goto L8f
        L85:
            r0 = 2131956152(0x7f1311b8, float:1.9548852E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956153(0x7f1311b9, float:1.9548854E38)
        L8f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L15
        L94:
            java.lang.Integer r1 = r5.A0K
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto Lc
            r0 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4 = r1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37851Gl5.A00(X.Gl5):void");
    }

    public final void A0C() {
        C37556GgC c37556GgC;
        Integer valueOf;
        C37556GgC c37556GgC2;
        Integer valueOf2;
        C37556GgC c37556GgC3;
        Integer valueOf3;
        if (!this.A0I) {
            if (this.A00 != -1 && (c37556GgC3 = super.A02) != null && (valueOf3 = Integer.valueOf(c37556GgC3.A03())) != null && valueOf3.intValue() >= this.A00) {
                AbstractC167007dF.A0x(this.A02);
                return;
            }
            C120985dq A0B = A0B();
            boolean A01 = A01(A0B);
            if (A01 && ((!this.A0L || (c37556GgC2 = super.A02) == null || (valueOf2 = Integer.valueOf(c37556GgC2.A03())) == null || valueOf2.intValue() != 0) && (!this.A05 || (c37556GgC = super.A02) == null || (valueOf = Integer.valueOf(c37556GgC.A03())) == null || valueOf.intValue() != 0))) {
                AbstractC167007dF.A0w(this.A02);
            } else {
                AbstractC167007dF.A0x(this.A02);
            }
            A0D(A0B, A01);
        }
    }

    public final C120985dq A0B() {
        int intValue;
        Integer A0l = AbstractC25233BEq.A0l(this);
        if (A0l == null || (intValue = A0l.intValue()) < 0) {
            return null;
        }
        AbstractC37552Gg8 abstractC37552Gg8 = this.A0C.A0A;
        if (intValue >= abstractC37552Gg8.A0B()) {
            return null;
        }
        return abstractC37552Gg8.A0F(intValue);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A0C();
    }
}
