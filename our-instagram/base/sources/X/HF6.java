package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* loaded from: classes7.dex */
public final class HF6 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final GenericSurveyFragment A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HF6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, GenericSurveyFragment genericSurveyFragment) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = genericSurveyFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r0 = -135031263(0xfffffffff7f39621, float:-9.88104E33)
            int r2 = X.AbstractC25231BEo.A0G(r13, r0)
            r1 = 2
            X.C14360o3.A0B(r14, r1)
            if (r12 != 0) goto Lc2
            com.instagram.common.session.UserSession r0 = r11.A01
            java.lang.Object r6 = r13.getTag()
            if (r6 == 0) goto Lba
            X.IJa r6 = (X.C41135IJa) r6
            X.1qM r14 = (X.C38321qM) r14
            X.0iw r7 = r11.A00
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = r11.A02
            r10 = 0
            boolean r3 = X.AbstractC167007dF.A1R(r10, r0, r6)
            X.AbstractC25233BEq.A0w(r1, r14, r7, r5)
            com.instagram.feed.widget.IgProgressImageView r4 = r6.A04
            android.content.Context r9 = r4.getContext()
            com.instagram.user.model.User r1 = r14.A2E(r0)
            if (r1 == 0) goto Lb5
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            X.AbstractC31173DnH.A1T(r7, r0, r1)
            android.widget.TextView r8 = r6.A02
            X.AbstractC31173DnH.A1F(r8, r1)
            r4.setAdjustViewBounds(r3)
            X.C14360o3.A0A(r9)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r14.A1q(r9)
            if (r0 == 0) goto L4a
            r4.setUrl(r0, r7)
        L4a:
            boolean r0 = r14.A5M()
            if (r0 == 0) goto L9f
            X.0do r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131237334(0x7f0819d6, float:1.8090916E38)
        L5b:
            r3.setImageResource(r0)
        L5e:
            android.widget.TextView r7 = r6.A01
            boolean r0 = r14.CdW()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            if (r0 == 0) goto L8e
            r7.setVisibility(r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131957634(0x7f131782, float:1.9551857E38)
            X.AbstractC31173DnH.A19(r1, r7, r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.C14360o3.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
        L80:
            r1.gravity = r0
            r0 = 15
            X.ViewOnClickListenerC42029Ijy.A00(r4, r5, r6, r14, r0)
            r0 = 2069380761(0x7b583e99, float:1.12280575E36)
            X.C0f9.A0A(r0, r2)
            return
        L8e:
            r0 = 8
            r7.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.C14360o3.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 16
            goto L80
        L9f:
            boolean r1 = r14.Cff()
            X.0do r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r1 == 0) goto Lb1
            r0 = 2131237314(0x7f0819c2, float:1.8090875E38)
            goto L5b
        Lb1:
            X.AbstractC13880nE.A0P(r3)
            goto L5e
        Lb5:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            throw r1
        Lba:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = 116318244(0x6eee024, float:8.9854995E-35)
            goto Lcb
        Lc2:
            java.lang.String r0 = "View type unhandled"
            java.lang.UnsupportedOperationException r1 = X.AbstractC166987dD.A1D(r0)
            r0 = 1039208076(0x3df10e8c, float:0.11770353)
        Lcb:
            X.C0f9.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HF6.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 760225488);
        if (i == 0) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.feed_preview_content_view, false);
            A0C.setTag(new C41135IJa(A0C));
            C0f9.A0A(-1490544750, A0G);
            return A0C;
        }
        UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
        C0f9.A0A(1688248671, A0G);
        throw A1D;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
