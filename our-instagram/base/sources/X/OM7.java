package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class OM7 {
    public int A00;
    public ConstrainedTextureView A01;
    public C56236Oxj A02;
    public C9KJ A03;
    public Integer A04;
    public final Context A05;
    public final ViewGroup A06;
    public final UserSession A07;
    public final AnonymousClass841 A08;
    public final View A09;
    public final C9KK A0A;
    public final FilterGroupModel A0B;

    public final void A01() {
        A02(null);
        C9KJ c9kj = this.A03;
        c9kj.A04();
        c9kj.A03();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, X.AGr] */
    public OM7(Context context, View view, UserSession userSession, AnonymousClass841 anonymousClass841, C9KK c9kk, FilterGroupModel filterGroupModel) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = c9kk;
        this.A0B = filterGroupModel;
        this.A08 = anonymousClass841;
        this.A09 = view;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.creation_image_container);
        this.A06 = A0C;
        ?? obj = new Object();
        obj.A01(A0C.findViewById(R.id.play_button));
        obj.A01 = A0C.findViewById(R.id.seek_frame_indicator);
        this.A03 = new C9KJ(context, userSession, obj, "feed", false, A1V);
        A02(null);
        if (filterGroupModel != null && C18U.A06(C06090Tz.A05, userSession, 36328465477156396L)) {
            GridLinesView gridLinesView = (GridLinesView) AbstractC166997dE.A0R(this.A06, R.id.straighten_grid_overlay_3);
            Context context2 = this.A05;
            gridLinesView.setInnerStrokeColor(context2.getColor(R.color.grey_5));
            UserSession userSession2 = this.A07;
            AnonymousClass841 anonymousClass8412 = this.A08;
            C56236Oxj c56236Oxj = new C56236Oxj(context2.getResources(), userSession2, anonymousClass8412, this, 0.0f, AbstractC43841Ja4.A04(context2));
            this.A02 = c56236Oxj;
            P1F p1f = new P1F();
            VideoSession A04 = ((MX5) anonymousClass8412).A01.A04();
            A04.getClass();
            String str = A04.A0H;
            C14360o3.A07(str);
            c56236Oxj.A0I = A1V;
            c56236Oxj.A01 = A0C;
            c56236Oxj.A0A = filterGroupModel;
            c56236Oxj.A08 = A0R.A00(filterGroupModel, "AdjustController_prepareCropTransform()");
            c56236Oxj.A09 = p1f;
            c56236Oxj.A07 = null;
            c56236Oxj.A0D = str;
            C56236Oxj c56236Oxj2 = this.A02;
            if (c56236Oxj2 != null) {
                c56236Oxj2.A0B = C25A.A00(userSession2).A03(anonymousClass8412.E3z());
            }
            A0C.setOnTouchListener(new ViewOnTouchListenerC55487Okg(0, this, gridLinesView));
        } else {
            C0fQ.A00(this.A03, A00());
        }
        ((InterfaceC189598ae) AbstractC13320mI.A01(context, InterfaceC189598ae.class)).EDa(new RunnableC56890PMj(this));
    }

    public final ConstrainedTextureView A00() {
        ConstrainedTextureView constrainedTextureView = this.A01;
        if (constrainedTextureView != null) {
            return constrainedTextureView;
        }
        C14360o3.A0F("previewTextureView");
        throw C00O.createAndThrow();
    }

    public final void A02(InterfaceC25193BCq interfaceC25193BCq) {
        if (this.A01 != null) {
            this.A06.removeView(A00());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        C9KK c9kk = this.A0A;
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(this.A05);
        c9kk.A03 = constrainedTextureView;
        this.A01 = constrainedTextureView;
        this.A06.addView(A00(), 0, layoutParams);
        A00().setAspectRatio(this.A08.ACq());
        if (interfaceC25193BCq == null) {
            interfaceC25193BCq = this.A03;
        }
        c9kk.A07 = interfaceC25193BCq;
        A00().setSurfaceTextureListener(c9kk);
        if (this.A0B != null) {
            if (C18U.A06(C06090Tz.A05, this.A07, 36328465477156396L)) {
                return;
            }
        }
        C0fQ.A00(this.A03, A00());
    }
}
