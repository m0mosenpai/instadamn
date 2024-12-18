package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import com.instagram.creation.base.ui.ConstrainedSurfaceView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.MaS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50727MaS implements InterfaceC58195Pr1, InterfaceC185668Ll {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final View A04;
    public final UserSession A05;
    public final MediaSession A06;
    public final MXB A07;
    public final C81N A08;
    public final AnonymousClass840 A09;
    public final InterfaceC58288Psg A0A;
    public final InterfaceC197218ns A0B;
    public final FilterGroupModel A0C;
    public final boolean A0D;

    @Override // X.InterfaceC58195Pr1
    public final String BkZ() {
        return null;
    }

    @Override // X.InterfaceC58195Pr1
    public final boolean Cff() {
        return false;
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr3(int i, int i2) {
    }

    @Override // X.InterfaceC58195Pr1
    public final boolean E48(InterfaceC58030PoG interfaceC58030PoG) {
        AnonymousClass841 A00 = this.A09.A00();
        Context context = this.A04.getContext();
        UserSession userSession = this.A05;
        MediaSession mediaSession = this.A06;
        MXB mxb = this.A07;
        MediaCaptureConfig mediaCaptureConfig = ((MX5) A00).A01.A09;
        int BRV = mediaSession.BRV();
        P07 p07 = new P07(context, userSession, interfaceC58030PoG, mediaSession, mxb, A00, (InterfaceC189678am) AbstractC13320mI.A01(context, InterfaceC189678am.class), mediaCaptureConfig, (InterfaceC189598ae) AbstractC13320mI.A01(context, InterfaceC189598ae.class), null, BRV);
        p07.A01 = false;
        return this.A0B.Co2(p07, this.A0C, new EnumC53116NeT[]{EnumC53116NeT.A03}, true);
    }

    @Override // X.InterfaceC58195Pr1
    public final void EZa() {
        this.A00 = true;
    }

    @Override // X.InterfaceC58195Pr1
    public final void Ag8(C51272Mkv c51272Mkv, int i, int i2) {
        this.A0B.AQ1(this.A0C, new C50260MHp(c51272Mkv, 22), i, i2);
    }

    @Override // X.InterfaceC58195Pr1
    public final Bitmap AzJ(int i, int i2) {
        Bitmap bitmap;
        MultiListenerTextureView multiListenerTextureView = this.A08.A0D;
        if (multiListenerTextureView == null || (bitmap = multiListenerTextureView.getBitmap(i, i2)) == null) {
            Bitmap createBitmap = Bitmap.createBitmap(i / 4, i2 / 4, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            return createBitmap;
        }
        return bitmap;
    }

    @Override // X.InterfaceC58195Pr1
    public final void CoJ() {
        if (this.A00) {
            if (this.A02) {
                this.A00 = false;
                this.A0A.AQ8(this.A0C);
            } else {
                this.A01 = true;
            }
        }
    }

    @Override // X.InterfaceC58195Pr1
    public final void CoV() {
        if (this.A0D && this.A00) {
            this.A0A.Efd(this.A0C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36326695950628904L) == false) goto L8;
     */
    @Override // X.InterfaceC185668Ll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dr6(android.view.Surface r7, int r8, int r9) {
        /*
            r6 = this;
            X.Psg r5 = r6.A0A
            r5.CO0(r8, r9)
            com.instagram.common.session.UserSession r4 = r6.A05
            boolean r1 = X.C2J9.A03(r4)
            r3 = 0
            boolean r0 = r6.A01
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L1f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326695950628904(0x810ef000003828, double:3.036487022816839E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L28
        L1f:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r6.A0C
            r5.AQ8(r0)
            r6.A00 = r3
            r6.A01 = r3
        L28:
            r0 = 1
            r6.A02 = r0
            return
        L2c:
            if (r0 != 0) goto L1f
            boolean r0 = r6.A0D
            if (r0 == 0) goto L1f
            r5.EGV()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50727MaS.Dr6(android.view.Surface, int, int):void");
    }

    @Override // X.InterfaceC185668Ll
    public final void DrA() {
        this.A0A.AP4();
        this.A01 = true;
    }

    @Override // X.InterfaceC58195Pr1
    public final void Ee2() {
        this.A0A.Ee2();
    }

    @Override // X.InterfaceC58195Pr1
    public final void cleanup() {
        ((ViewGroup) this.A04.findViewById(R.id.album_filter_view_container)).removeView(this.A08.A05());
    }

    @Override // X.InterfaceC58195Pr1
    public final boolean isVisible() {
        return this.A04.getLocalVisibleRect(this.A03);
    }

    public C50727MaS(View view, UserSession userSession, MediaSession mediaSession, MXB mxb, AnonymousClass840 anonymousClass840, InterfaceC197218ns interfaceC197218ns, FilterGroupModel filterGroupModel) {
        C81N c81n;
        InterfaceC58288Psg oyH;
        AbstractC167017dG.A1Q(userSession, interfaceC197218ns);
        C14360o3.A0B(anonymousClass840, 5);
        this.A05 = userSession;
        this.A04 = view;
        this.A0B = interfaceC197218ns;
        this.A0C = filterGroupModel;
        this.A09 = anonymousClass840;
        this.A06 = mediaSession;
        this.A07 = mxb;
        boolean CVj = interfaceC197218ns.CVj();
        Context context = view.getContext();
        if (CVj) {
            C14360o3.A07(context);
            c81n = new C81N(new ConstrainedSurfaceView(context));
        } else {
            C14360o3.A07(context);
            c81n = new C81N(new ConstrainedMultiListenerTextureView(context));
        }
        this.A08 = c81n;
        this.A03 = AbstractC166987dD.A0U();
        c81n.A08(this);
        c81n.A07(anonymousClass840.A00().AB3());
        AbstractC31173DnH.A0F(view, R.id.album_filter_view_container).addView(c81n.A05(), 0);
        interfaceC197218ns.EEI();
        if (C2J9.A03(userSession)) {
            oyH = new OyI(c81n, interfaceC197218ns);
        } else if (C2J9.A00) {
            oyH = new MaU(userSession, c81n, anonymousClass840, interfaceC197218ns);
        } else {
            oyH = new OyH(c81n.A06(), interfaceC197218ns);
        }
        this.A0A = oyH;
        this.A0D = C18U.A06(C06090Tz.A06, userSession, 36323023753849710L);
        if (C2J9.A03(userSession)) {
            c81n.A07(0.0f);
        }
    }
}
