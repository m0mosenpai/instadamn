package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.GAw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36572GAw implements InterfaceC37217GaS {
    public LayoutTransition A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public IgdsBottomButtonLayout A0C;
    public IgdsSwitch A0D;
    public C34968Fas A0E;
    public ProgressButton A0F;
    public final InterfaceC11380iw A0G;
    public final UserSession A0H;
    public final FRR A0I;
    public final InterfaceC37264GbH A0J;

    public C36572GAw(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FRR frr, InterfaceC37264GbH interfaceC37264GbH) {
        C14360o3.A0B(userSession, 1);
        this.A0H = userSession;
        this.A0G = interfaceC11380iw;
        this.A0J = interfaceC37264GbH;
        this.A0I = frr;
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void CxX(Context context, Object obj) {
        View view = this.A06;
        if (view == null) {
            C14360o3.A0F("progressSpinner");
            throw C00O.createAndThrow();
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    @Override // X.InterfaceC37217GaS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void E0T(android.content.Context r11, android.view.View r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36572GAw.E0T(android.content.Context, android.view.View, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @Override // X.InterfaceC37217GaS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void FAR(android.content.Context r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.FO2 r9 = (X.FO2) r9
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            android.graphics.Bitmap r0 = r9.A00
            java.lang.String r6 = "importFromFacebookOrChangePhotoButton"
            java.lang.String r2 = "progressButton"
            if (r0 != 0) goto L43
            r5 = 2131952346(0x7f1302da, float:1.9541132E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r7.A0C
            java.lang.String r4 = "launchIgCaptureFlow"
            java.lang.String r3 = "launchFacebookProfilePictureImport"
            if (r0 == 0) goto L8f
            com.instagram.common.session.UserSession r0 = r7.A0H
            boolean r0 = X.C14640oc.A0I(r0)
            if (r0 == 0) goto L8f
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A0C
            if (r2 == 0) goto L30
            java.lang.String r1 = r8.getString(r5)
            android.view.View$OnClickListener r0 = r7.A04
            if (r0 == 0) goto Lad
            r2.setPrimaryAction(r1, r0)
        L30:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A0C
            if (r2 == 0) goto L42
            r0 = 2131964344(0x7f1331b8, float:1.9565467E38)
            java.lang.String r1 = r8.getString(r0)
            android.view.View$OnClickListener r0 = r7.A03
            if (r0 == 0) goto Lb1
            r2.setSecondaryAction(r1, r0)
        L42:
            return
        L43:
            int r1 = r9.A07
            r0 = -1
            if (r1 != r0) goto L4b
            r1 = 2131968535(0x7f134217, float:1.9573967E38)
        L4b:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r7.A0C
            java.lang.String r4 = "changePicture"
            java.lang.String r3 = "completeCaptureListener"
            if (r0 == 0) goto L76
            com.instagram.common.session.UserSession r0 = r7.A0H
            boolean r0 = X.C14640oc.A0I(r0)
            if (r0 == 0) goto L76
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A0C
            if (r2 == 0) goto L6a
            java.lang.String r1 = r8.getString(r1)
            android.view.View$OnClickListener r0 = r7.A02
            if (r0 == 0) goto Lb1
            r2.setPrimaryAction(r1, r0)
        L6a:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r7.A0C
            if (r1 == 0) goto L42
            android.view.View$OnClickListener r0 = r7.A01
            if (r0 == 0) goto Lad
            r1.setSecondaryActionOnClickListener(r0)
            return
        L76:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r7.A0F
            if (r0 == 0) goto Lb5
            r0.setText(r1)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r7.A0F
            if (r1 == 0) goto Lb5
            android.view.View$OnClickListener r0 = r7.A02
            if (r0 == 0) goto Lb1
            X.C0fQ.A00(r0, r1)
            android.widget.TextView r1 = r7.A08
            if (r1 == 0) goto Lb9
            android.view.View$OnClickListener r0 = r7.A01
            goto La7
        L8f:
            android.widget.TextView r1 = r7.A08
            if (r1 == 0) goto Lb9
            android.view.View$OnClickListener r0 = r7.A03
            if (r0 == 0) goto Lb1
            X.C0fQ.A00(r0, r1)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r7.A0F
            if (r0 == 0) goto Lb5
            r0.setText(r5)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r7.A0F
            if (r1 == 0) goto Lb5
            android.view.View$OnClickListener r0 = r7.A04
        La7:
            if (r0 == 0) goto Lad
            X.C0fQ.A00(r0, r1)
            return
        Lad:
            X.C14360o3.A0F(r4)
            goto Lbc
        Lb1:
            X.C14360o3.A0F(r3)
            goto Lbc
        Lb5:
            X.C14360o3.A0F(r2)
            goto Lbc
        Lb9:
            X.C14360o3.A0F(r6)
        Lbc:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36572GAw.FAR(android.content.Context, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    @Override // X.InterfaceC37217GaS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void FBq(android.content.Context r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.FO2 r9 = (X.FO2) r9
            r2 = 0
            r6 = 1
            X.C14360o3.A0B(r9, r6)
            android.view.ViewGroup r1 = r7.A07
            if (r1 != 0) goto L15
            java.lang.String r5 = "rootView"
        Ld:
            X.C14360o3.A0F(r5)
        L10:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L15:
            android.animation.LayoutTransition r0 = r7.A00
            if (r0 != 0) goto L1f
            java.lang.String r4 = "layoutTransition"
        L1b:
            X.C14360o3.A0F(r4)
            goto L10
        L1f:
            r1.setLayoutTransition(r0)
            android.graphics.Bitmap r1 = r9.A00
            r3 = 8
            if (r1 != 0) goto L32
            android.view.View r0 = r7.A06
            if (r0 != 0) goto L2f
            java.lang.String r4 = "progressSpinner"
            goto L1b
        L2f:
            r0.setVisibility(r3)
        L32:
            java.lang.String r4 = "shareSwitch"
            java.lang.String r5 = "profilePictureShareSwitchContainer"
            if (r1 == 0) goto Lc0
            boolean r0 = r9.A03
            if (r0 != 0) goto L44
            boolean r0 = r9.A02
            if (r0 != 0) goto L44
            X.GbH r0 = r7.A0J
            if (r0 == 0) goto Lc0
        L44:
            android.view.View r1 = r7.A05
            if (r1 == 0) goto Ld
            r0 = 0
            r1.setAlpha(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r7.A0D
            if (r0 == 0) goto L1b
            r0.setChecked(r6)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto Ld
            r0.setVisibility(r2)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto Ld
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L71:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto Ld
            int r0 = r0.getVisibility()
            java.lang.String r5 = "viewSwitcher"
            if (r0 == r3) goto La8
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r7.A0D
            if (r0 == 0) goto L1b
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto La8
            X.Fas r2 = r7.A0E
            if (r2 == 0) goto Ld
            android.transition.Scene r1 = r2.A02
            java.lang.String r4 = "postPicturePreviewScene"
            if (r1 == 0) goto L1b
            java.lang.Runnable r0 = r2.A07
            r1.setEnterAction(r0)
            java.lang.String r5 = "sceneRoot"
            android.view.ViewGroup r0 = r2.A05
            if (r0 == 0) goto Ld
            android.transition.Scene r1 = r2.A02
        L9e:
            if (r1 == 0) goto L1b
            android.transition.Transition r0 = r2.A03
            if (r0 != 0) goto Lc8
            java.lang.String r4 = "immediateTransition"
            goto L1b
        La8:
            X.Fas r2 = r7.A0E
            if (r2 == 0) goto Ld
            android.transition.Scene r1 = r2.A01
            java.lang.String r4 = "avatarBoxScene"
            if (r1 == 0) goto L1b
            java.lang.Runnable r0 = r2.A06
            r1.setEnterAction(r0)
            java.lang.String r5 = "sceneRoot"
            android.view.ViewGroup r0 = r2.A05
            if (r0 == 0) goto Ld
            android.transition.Scene r1 = r2.A01
            goto L9e
        Lc0:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto Ld
            r0.setVisibility(r3)
            goto L71
        Lc8:
            android.transition.TransitionManager.go(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36572GAw.FBq(android.content.Context, java.lang.Object):void");
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void FCd(Context context, UserSession userSession, Object obj) {
        TextView textView;
        int i;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i2;
        FO2 fo2 = (FO2) obj;
        AbstractC167017dG.A1P(fo2, userSession);
        if (fo2.A00 == null) {
            TextView textView2 = this.A0B;
            if (textView2 != null) {
                textView2.setText(2131952349);
                TextView textView3 = this.A0A;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    if (fo2.A04) {
                        TextView textView4 = this.A09;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        C14360o3.A0F("skipButton");
                    }
                    if (this.A0C != null && C14640oc.A0I(this.A0H)) {
                        igdsBottomButtonLayout = this.A0C;
                        if (igdsBottomButtonLayout != null) {
                            i2 = 2131964344;
                            igdsBottomButtonLayout.setSecondaryActionText(context.getString(i2));
                            return;
                        }
                        return;
                    }
                    textView = this.A08;
                    if (textView != null) {
                        i = 2131964344;
                        textView.setText(i);
                        return;
                    }
                    C14360o3.A0F("importFromFacebookOrChangePhotoButton");
                }
                C14360o3.A0F("subTitleText");
            }
            C14360o3.A0F("titleText");
        } else {
            TextView textView5 = this.A0B;
            if (textView5 != null) {
                textView5.setText(2131970225);
                TextView textView6 = this.A0A;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                    TextView textView7 = this.A09;
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                        if (this.A0C != null && C14640oc.A0I(userSession)) {
                            igdsBottomButtonLayout = this.A0C;
                            if (igdsBottomButtonLayout == null) {
                                return;
                            }
                            i2 = 2131955024;
                            igdsBottomButtonLayout.setSecondaryActionText(context.getString(i2));
                            return;
                        }
                        textView = this.A08;
                        if (textView != null) {
                            i = 2131955024;
                            textView.setText(i);
                            return;
                        }
                        C14360o3.A0F("importFromFacebookOrChangePhotoButton");
                    }
                    C14360o3.A0F("skipButton");
                }
                C14360o3.A0F("subTitleText");
            }
            C14360o3.A0F("titleText");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void D9w(Context context, Object obj) {
    }
}
