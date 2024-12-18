package com.instagram.creation.capture.quickcapture.sundial;

import X.AbstractC001800i;
import X.AbstractC009903n;
import X.AbstractC09440dt;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12120kG;
import X.AbstractC13880nE;
import X.AbstractC141776au;
import X.AbstractC183338Bg;
import X.AbstractC18560vj;
import X.AbstractC187378Sf;
import X.AbstractC187448Sm;
import X.AbstractC223919ua;
import X.AbstractC23641Du;
import X.AbstractC50863Mdu;
import X.AbstractC57302k5;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass229;
import X.AnonymousClass825;
import X.AnonymousClass840;
import X.AnonymousClass846;
import X.C00O;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C06K;
import X.C07Y;
import X.C09530e4;
import X.C0fJ;
import X.C141796aw;
import X.C14360o3;
import X.C151846sU;
import X.C15340po;
import X.C1810981l;
import X.C1816783z;
import X.C183348Bh;
import X.C184108Ez;
import X.C187338Sb;
import X.C187348Sc;
import X.C187358Sd;
import X.C187368Se;
import X.C187408Si;
import X.C187418Sj;
import X.C187438Sl;
import X.C187468So;
import X.C187478Sp;
import X.C187508Ss;
import X.C187518St;
import X.C187528Su;
import X.C187538Sv;
import X.C187548Sw;
import X.C187558Sy;
import X.C187568Sz;
import X.C189478aR;
import X.C18U;
import X.C193328hC;
import X.C194808jg;
import X.C202718xp;
import X.C206169Az;
import X.C206629Ct;
import X.C206639Cu;
import X.C206899Du;
import X.C207189Ex;
import X.C219479mv;
import X.C219569n4;
import X.C219579n5;
import X.C219599n7;
import X.C219639nB;
import X.C219649nC;
import X.C22C;
import X.C22F;
import X.C23671Ae6;
import X.C23878AhX;
import X.C24060Alw;
import X.C24H;
import X.C3DY;
import X.C51756Mtf;
import X.C51831MvZ;
import X.C51832Mva;
import X.C52133N5h;
import X.C52942bb;
import X.C55982hj;
import X.C56288Oyz;
import X.C57012jc;
import X.C5JK;
import X.C5RM;
import X.C5RO;
import X.C5RU;
import X.C6RB;
import X.C70569Wd3;
import X.C74P;
import X.C84B;
import X.C86V;
import X.C87C;
import X.C87D;
import X.C87G;
import X.C87H;
import X.C89O;
import X.C89P;
import X.C8A8;
import X.C8BD;
import X.C8BN;
import X.C8D5;
import X.C8D6;
import X.C8NK;
import X.C8NL;
import X.C8PE;
import X.C8PF;
import X.C8SW;
import X.C8SY;
import X.C8T1;
import X.C8T3;
import X.C8T4;
import X.C8T5;
import X.C8T6;
import X.C8T7;
import X.C8T8;
import X.C8TA;
import X.C8TB;
import X.C8TC;
import X.C8TD;
import X.C8TE;
import X.C8TF;
import X.C8TG;
import X.C9BF;
import X.C9D0;
import X.C9ES;
import X.C9ZF;
import X.DialogInterfaceOnClickListenerC23159ANy;
import X.DialogInterfaceOnClickListenerC23160ANz;
import X.EnumC114925Hg;
import X.EnumC1810181d;
import X.EnumC1828289c;
import X.EnumC187428Sk;
import X.EnumC187458Sn;
import X.EnumC189158Zj;
import X.EnumC222689s9;
import X.EnumC222759sG;
import X.EnumC222949sZ;
import X.EnumC50631MWs;
import X.InterfaceC08830cm;
import X.InterfaceC09390do;
import X.InterfaceC110214xq;
import X.InterfaceC143326dX;
import X.InterfaceC1810081c;
import X.InterfaceC1829489p;
import X.InterfaceC57817Pkj;
import X.InterfaceC58362lv;
import X.InterfaceC60082oq;
import X.InterfaceC60442pS;
import X.InterfaceC60602pj;
import X.MBT;
import X.NIX;
import X.Oz0;
import X.Oz1;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ClipsTimelineEditorDrawerController implements InterfaceC60442pS, InterfaceC60602pj, InterfaceC1829489p, InterfaceC60082oq, C8BD {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgImageView A05;
    public EnumC222689s9 A06;
    public InterfaceC143326dX A07;
    public EnumC187428Sk A08;
    public EnumC187428Sk A09;
    public EnumC222759sG A0A;
    public C84B A0B;
    public C189478aR A0C;
    public C70569Wd3 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public ViewGroup A0P;
    public ComposeView A0Q;
    public IgSimpleImageView A0R;
    public IgSimpleImageView A0S;
    public IgSimpleImageView A0T;
    public IgdsMediaButton A0U;
    public IgdsMediaButton A0V;
    public final Context A0W;
    public final ViewGroup A0X;
    public final FragmentActivity A0Y;
    public final C24H A0Z;
    public final UserSession A0a;
    public final TargetViewSizeProvider A0b;
    public final AnonymousClass840 A0c;
    public final C1816783z A0d;
    public final C8SY A0e;
    public final InterfaceC1810081c A0f;
    public final ClipsAudioMixingDrawerController A0g;
    public final C187438Sl A0h;
    public final C183348Bh A0i;
    public final C87D A0j;
    public final ClipsCreationViewModel A0k;
    public final C8D6 A0l;
    public final C8PF A0m;
    public final C89P A0n;
    public final C187418Sj A0o;
    public final C187358Sd A0p;
    public final C8NL A0q;
    public final C5JK A0r;
    public final C187338Sb A0s;
    public final AnonymousClass825 A0t;
    public final C87H A0u;
    public final List A0v;
    public final Set A0w;
    public final InterfaceC08830cm A0x;
    public final InterfaceC08830cm A0y;
    public final InterfaceC09390do A0z;
    public final InterfaceC09390do A10;
    public final InterfaceC09390do A11;
    public final InterfaceC09390do A12;
    public final AbstractC10360h2 A13;
    public final C1810981l A14;
    public final ClipsAssetHubViewModel A15;
    public final C8SW A16;
    public final C187418Sj A17;
    public final C187418Sj A18;
    public final C184108Ez A19;
    public final ClipsCreationDraftViewModel A1A;
    public final InteractiveDrawableContainer A1B;
    public final InterfaceC09390do A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public C57012jc drawerContainerViewStubHolder;
    public View postCaptureVideoContainer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.EnumC222689s9 r26, X.EnumC222759sG r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Integer r30, java.lang.String r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0J(X.9s9, X.9sG, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        if (r40 < r4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r40 >= X.EnumC187458Sn.A04.A00) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0307, code lost:
    
        if ((r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x031b, code lost:
    
        if (r9 == false) goto L171;
     */
    @Override // X.InterfaceC60082oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DCP(X.C70569Wd3 r38, float r39, float r40, float r41) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DCP(X.Wd3, float, float, float):void");
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dep(Drawable drawable, int i, boolean z) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x006f, code lost:
    
        if (r7 == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    @Override // X.InterfaceC60082oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DmT(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DmT(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        Fragment fragment;
        C14360o3.A0B(drawable, 1);
        if (drawable instanceof C5RM) {
            drawable = ((C5RM) drawable).A0A;
        }
        C70569Wd3 c70569Wd3 = this.A0D;
        if (c70569Wd3 != null) {
            fragment = c70569Wd3.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof C52133N5h) {
            if (((drawable instanceof C6RB) || (drawable instanceof C5RU)) && !(drawable instanceof C202718xp)) {
                FrameLayout frameLayout = this.A01;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                C70569Wd3 c70569Wd32 = this.A0D;
                if (c70569Wd32 != null) {
                    c70569Wd32.A0G.A02 = 0.0f;
                }
                A0D(this, EnumC187428Sk.A07);
            }
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    @Override // X.InterfaceC60082oq
    public final boolean Eis(MotionEvent motionEvent) {
        InteractiveDrawableContainer interactiveDrawableContainer;
        C70569Wd3 c70569Wd3;
        Matrix matrix;
        C14360o3.A0B(motionEvent, 0);
        InterfaceC1810081c interfaceC1810081c = this.A0f;
        if ((!interfaceC1810081c.CRB(EnumC1810181d.A0j) && (!interfaceC1810081c.CRB(EnumC1810181d.A09) || !((Boolean) this.A0z.getValue()).booleanValue())) || this.A0q.A0G() || (interactiveDrawableContainer = this.A1B) == null || (c70569Wd3 = this.A0D) == null || (matrix = c70569Wd3.A0A.getMatrix()) == null) {
            return false;
        }
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        matrix2.mapPoints(fArr);
        if (motionEvent.getAction() == 0) {
            InteractiveDrawableContainer.A0E(interactiveDrawableContainer, fArr[0], fArr[1], false);
        }
        if (interactiveDrawableContainer.A0C == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_timeline_editor_drawer_controller";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final float A00(Context context, EnumC187428Sk enumC187428Sk) {
        Integer num = enumC187428Sk.A02;
        if (num != null) {
            int intValue = num.intValue();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(intValue, typedValue, true);
            if (typedValue.type == 4) {
                float f = typedValue.getFloat();
                if (Float.valueOf(f) != null) {
                    return f;
                }
            }
        }
        return enumC187428Sk.A01;
    }

    public static final int A01(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, AbstractC187378Sf abstractC187378Sf) {
        Float f;
        float f2;
        if (!(abstractC187378Sf instanceof C187538Sv) && (!(clipsTimelineEditorDrawerController.A0p.A0E() instanceof C187508Ss) || clipsTimelineEditorDrawerController.A08 != EnumC187428Sk.A09)) {
            InterfaceC57817Pkj A02 = clipsTimelineEditorDrawerController.A02();
            if ((clipsTimelineEditorDrawerController.A08 != EnumC187428Sk.A07 || (!(A02 instanceof Oz0) && !C9BF.A00(A02, 0) && !(A02 instanceof C56288Oyz) && !C9BF.A00(A02, 4) && !C9BF.A00(A02, 3) && !(A02 instanceof C23878AhX))) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187528Su) && !(abstractC187378Sf instanceof C187478Sp) && !(abstractC187378Sf instanceof C187548Sw) && !(abstractC187378Sf instanceof C8T7) && !clipsTimelineEditorDrawerController.A0L && !clipsTimelineEditorDrawerController.A0I) {
                C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
                if (c70569Wd3 != null) {
                    C55982hj c55982hj = c70569Wd3.A0G.A03;
                    if (c55982hj == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = (float) c55982hj.A01;
                    }
                    f = Float.valueOf(f2);
                } else {
                    f = null;
                }
                if (!C14360o3.A0I(f, 0.0f)) {
                    return 0;
                }
            }
        }
        return 8;
    }

    private final InterfaceC57817Pkj A02() {
        C8A8 c8a8 = (C8A8) this.A0o.A00.A02();
        if (c8a8 != null) {
            return (InterfaceC57817Pkj) c8a8.A01;
        }
        return null;
    }

    public static final ClipsTimelineEditorConfig A03(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        int i = 2;
        if (clipsTimelineEditorDrawerController.A0n.A04 != null) {
            i = 0;
        }
        return new ClipsTimelineEditorConfig(C18U.A06(C06090Tz.A06, clipsTimelineEditorDrawerController.A0a, 36318136080799705L), false, clipsTimelineEditorDrawerController.A1D, i);
    }

    private final void A04(View view) {
        ViewGroup viewGroup;
        if (view != null) {
            view.setVisibility(8);
            if (view.getParent() != null && (viewGroup = this.A0P) != null) {
                viewGroup.removeView(view);
            }
        }
    }

    public static final void A05(C8BN c8bn, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, String str, C09530e4 c09530e4, boolean z, boolean z2, boolean z3) {
        clipsTimelineEditorDrawerController.A08 = EnumC187428Sk.A06;
        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = clipsTimelineEditorDrawerController.A02;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
        if (c70569Wd3 != null) {
            ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = clipsTimelineEditorDrawerController.A0g;
            clipsAudioMixingDrawerController.A04 = c70569Wd3;
            clipsAudioMixingDrawerController.A00 = c70569Wd3.A01;
            clipsAudioMixingDrawerController.A03(c8bn, null, str, c09530e4, z, z2, z3, false);
            return;
        }
        AbstractC12120kG.A07(AbstractC111324zv.A00(298), AnonymousClass001.A1D("Launching music browser with null fragmentDrawerController, isStackedTimeline ", clipsTimelineEditorDrawerController.A0L()), null);
    }

    public static final void A06(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        C84B c84b = clipsTimelineEditorDrawerController.A0B;
        if (c84b == null) {
            C14360o3.A0F("segmentStore");
            throw C00O.createAndThrow();
        }
        if (c84b.A03) {
            clipsTimelineEditorDrawerController.A0d.A01.A0O = true;
            C05A c05a = clipsTimelineEditorDrawerController.A0k.A0O.A02;
            C84B c84b2 = (C84B) c05a.getValue();
            C14360o3.A0B(c84b2, 0);
            List list = c84b2.A02;
            C14360o3.A0B(list, 0);
            c05a.Egh(new C84B(list, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r3.getValue() != X.EnumC189158Zj.A03) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        r3.Egh(X.EnumC189158Zj.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r3.getValue() == X.EnumC189158Zj.A06) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r6) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A07(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController):void");
    }

    public static final void A08(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        C84B c84b = clipsTimelineEditorDrawerController.A0B;
        if (c84b == null) {
            C14360o3.A0F("segmentStore");
            throw C00O.createAndThrow();
        }
        if (c84b.A03 || clipsTimelineEditorDrawerController.A0k.A0u()) {
            ClipsCreationViewModel clipsCreationViewModel = clipsTimelineEditorDrawerController.A0k;
            clipsCreationViewModel.A0j(clipsTimelineEditorDrawerController.A0v);
            C05A c05a = clipsCreationViewModel.A0O.A02;
            C84B c84b2 = (C84B) c05a.getValue();
            C14360o3.A0B(c84b2, 0);
            List list = c84b2.A02;
            C14360o3.A0B(list, 0);
            c05a.Egh(new C84B(list, false));
        }
    }

    public static final void A09(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        Fragment fragment;
        C51756Mtf c51756Mtf;
        Drawable drawable;
        Drawable drawable2;
        C74P c74p;
        C194808jg c194808jg;
        C5RM c5rm;
        C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
        Drawable drawable3 = null;
        if (c70569Wd3 != null) {
            fragment = c70569Wd3.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof ClipsStackedTimelineFragment) {
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment;
            C187358Sd c187358Sd = clipsStackedTimelineFragment.A0d;
            Object obj = null;
            if (c187358Sd != null) {
                if (!(c187358Sd.A0E() instanceof C8TE)) {
                    C187358Sd c187358Sd2 = clipsStackedTimelineFragment.A0d;
                    if (c187358Sd2 != null) {
                        if (!(c187358Sd2.A0E() instanceof C8T5)) {
                            C187358Sd c187358Sd3 = clipsStackedTimelineFragment.A0d;
                            if (c187358Sd3 != null) {
                                if (c187358Sd3.A0E() instanceof C8T6) {
                                    NIX nix = clipsStackedTimelineFragment.A0i;
                                    if (nix != null) {
                                        C51831MvZ A0M = nix.A0M();
                                        if (A0M != null) {
                                            obj = A0M.A00;
                                        }
                                        if ((obj instanceof Drawable) && (drawable = (Drawable) obj) != null) {
                                            if (!(drawable instanceof C5RM) && (c5rm = (C5RM) drawable) != null) {
                                                drawable2 = c5rm.A0A;
                                            } else {
                                                drawable2 = null;
                                            }
                                            if ((drawable2 instanceof C194808jg) && (c194808jg = (C194808jg) drawable2) != null) {
                                                drawable3 = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
                                            }
                                            if (!(drawable3 instanceof C74P) && (c74p = (C74P) drawable3) != null && c74p.isLoading()) {
                                                c74p.A9I(new C23671Ae6(drawable, clipsTimelineEditorDrawerController, c74p));
                                                return;
                                            } else {
                                                clipsTimelineEditorDrawerController.A0l.A02(drawable);
                                                return;
                                            }
                                        }
                                    }
                                    C14360o3.A0F("timedElementsViewModel");
                                    throw C00O.createAndThrow();
                                }
                                C8D6 c8d6 = clipsTimelineEditorDrawerController.A0l;
                                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(c8d6, null, 49), AbstractC141776au.A00(c8d6));
                                return;
                            }
                        }
                    }
                }
                NIX nix2 = clipsStackedTimelineFragment.A0i;
                if (nix2 != null) {
                    C51832Mva A0G = ((AbstractC50863Mdu) nix2).A01.A0G();
                    if (A0G != null && (c51756Mtf = A0G.A06) != null) {
                        obj = (C5RO) c51756Mtf.A00;
                    }
                    if (obj instanceof Drawable) {
                        if (!(drawable instanceof C5RM)) {
                        }
                        drawable2 = null;
                        if (drawable2 instanceof C194808jg) {
                            drawable3 = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
                        }
                        if (!(drawable3 instanceof C74P)) {
                        }
                        clipsTimelineEditorDrawerController.A0l.A02(drawable);
                        return;
                    }
                    C8D6 c8d62 = clipsTimelineEditorDrawerController.A0l;
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(c8d62, null, 49), AbstractC141776au.A00(c8d62));
                    return;
                }
                C14360o3.A0F("timedElementsViewModel");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("clipsTimelineEditorViewModel");
            throw C00O.createAndThrow();
        }
    }

    public static final void A0A(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        Fragment fragment;
        C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
        if (c70569Wd3 != null) {
            fragment = c70569Wd3.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof C52133N5h) {
            InterfaceC1810081c interfaceC1810081c = clipsTimelineEditorDrawerController.A0f;
            if (interfaceC1810081c.CRB(EnumC1810181d.A09)) {
                interfaceC1810081c.E4u(new Object());
                return;
            }
        }
        if (!(fragment instanceof ClipsStackedTimelineFragment)) {
            return;
        }
        InterfaceC1810081c interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
        if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
            return;
        }
        interfaceC1810081c2.E4u(new Object());
    }

    public static final void A0B(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        if (clipsTimelineEditorDrawerController.A1E) {
            ClipsAssetHubViewModel clipsAssetHubViewModel = clipsTimelineEditorDrawerController.A15;
            C141796aw A00 = AbstractC141776au.A00(clipsAssetHubViewModel);
            AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(clipsAssetHubViewModel, null, 45), A00);
            return;
        }
        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C189478aR c189478aR = clipsTimelineEditorDrawerController.A0C;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
        A0G(clipsTimelineEditorDrawerController, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6cX, java.lang.Object] */
    public static final void A0C(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        Context context = clipsTimelineEditorDrawerController.A0W;
        boolean CRB = clipsTimelineEditorDrawerController.A0f.CRB(EnumC1810181d.A09);
        int i = R.drawable.instagram_chevron_left_pano_filled_24;
        if (CRB) {
            i = R.drawable.instagram_chevron_down_pano_filled_24;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setColorFilter(C3DY.A00(context.getColor(R.color.design_dark_default_color_on_background)));
        }
        IgdsMediaButton igdsMediaButton = clipsTimelineEditorDrawerController.A0U;
        if (igdsMediaButton != 0) {
            ?? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton.setStartAddOn(obj, context.getResources().getString(2131955974));
        }
    }

    public static final void A0D(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, EnumC187428Sk enumC187428Sk) {
        ClipsStackedTimelineFragment clipsStackedTimelineFragment;
        C70569Wd3 c70569Wd3;
        Integer num;
        C8NL c8nl = clipsTimelineEditorDrawerController.A0q;
        FragmentActivity fragmentActivity = clipsTimelineEditorDrawerController.A0Y;
        Context applicationContext = fragmentActivity.getApplicationContext();
        C14360o3.A07(applicationContext);
        float A00 = A00(applicationContext, enumC187428Sk);
        C9ZF A002 = C8NL.A00(c8nl);
        if (A002 != null && A002.A05.A00) {
            EnumC222949sZ enumC222949sZ = EnumC222949sZ.A07;
            int i = A002.A02;
            C206169Az c206169Az = A002.A03;
            float f = A002.A01;
            C206169Az c206169Az2 = A002.A04;
            C14360o3.A0B(c206169Az, 2);
            C14360o3.A0B(c206169Az2, 5);
            C8NL.A04(new C9ZF(c206169Az, c206169Az2, enumC222949sZ, A00, f, i), c8nl);
        }
        if (A0I(clipsTimelineEditorDrawerController)) {
            EnumC187428Sk enumC187428Sk2 = clipsTimelineEditorDrawerController.A08;
            float f2 = enumC187428Sk2.A00;
            float f3 = EnumC187428Sk.A0B.A00;
            if (f2 >= f3 && enumC187428Sk.A00 >= f3) {
                c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
                if (c70569Wd3 != null) {
                    num = C05F.A00;
                    c70569Wd3.A07 = num;
                }
            } else {
                boolean z = false;
                if (enumC187428Sk2 != EnumC187428Sk.A06) {
                    z = true;
                }
                clipsTimelineEditorDrawerController.A0F = z;
                c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
                if (c70569Wd3 != null) {
                    num = C05F.A01;
                    c70569Wd3.A07 = num;
                }
            }
        }
        clipsTimelineEditorDrawerController.A08 = enumC187428Sk;
        C70569Wd3 c70569Wd32 = clipsTimelineEditorDrawerController.A0D;
        if (c70569Wd32 != null) {
            c70569Wd32.A0G.A03(true, enumC187428Sk.A00);
        }
        C14360o3.A07(fragmentActivity.getApplicationContext());
        if (A00(r0, enumC187428Sk) >= 1.0d) {
            C70569Wd3 c70569Wd33 = clipsTimelineEditorDrawerController.A0D;
            Fragment fragment = null;
            if (c70569Wd33 != null) {
                fragment = c70569Wd33.A0E.A0O(R.id.fragment_container);
            }
            if ((fragment instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment) != null && !clipsTimelineEditorDrawerController.EjE()) {
                clipsStackedTimelineFragment.A0R();
            }
        }
    }

    public static final void A0E(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, AbstractC187378Sf abstractC187378Sf, boolean z) {
        if (!(abstractC187378Sf instanceof C187508Ss) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187528Su) && !(abstractC187378Sf instanceof C187478Sp) && !(abstractC187378Sf instanceof C187538Sv) && !(abstractC187378Sf instanceof C187548Sw) && !(abstractC187378Sf instanceof C187558Sy) && !(abstractC187378Sf instanceof C187568Sz) && !(abstractC187378Sf instanceof C8T1)) {
            boolean z2 = false;
            if (!(abstractC187378Sf instanceof C8T3) && !(abstractC187378Sf instanceof C8T4) && !(abstractC187378Sf instanceof C8T5) && !(abstractC187378Sf instanceof C8T6)) {
                if (!(abstractC187378Sf instanceof C8T7) && !(abstractC187378Sf instanceof C8T8) && !(abstractC187378Sf instanceof C8TA) && !(abstractC187378Sf instanceof C8TB) && !(abstractC187378Sf instanceof C8TC) && !(abstractC187378Sf instanceof C8TD)) {
                    if (!(abstractC187378Sf instanceof C8TE) && !(abstractC187378Sf instanceof C8TF)) {
                        if (abstractC187378Sf instanceof C8TG) {
                            z2 = !z;
                        } else {
                            return;
                        }
                    }
                }
                clipsTimelineEditorDrawerController.A0H(z2);
                return;
            }
            clipsTimelineEditorDrawerController.A0H(true);
            return;
        }
        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A02;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02f1, code lost:
    
        if (r7 != true) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04b6, code lost:
    
        if (r31 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05ba, code lost:
    
        if (r11 != false) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb  */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.6cX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(final com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r27, java.lang.Integer r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0F(com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController, java.lang.Integer, boolean, boolean, boolean):void");
    }

    public static final void A0G(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, boolean z, boolean z2, boolean z3) {
        C70569Wd3 c70569Wd3;
        C06K c06k;
        C05A c05a;
        EnumC1828289c enumC1828289c;
        Medium medium;
        C89P c89p = clipsTimelineEditorDrawerController.A0n;
        if (c89p.A04 != null) {
            if (z) {
                EnumC222689s9 enumC222689s9 = clipsTimelineEditorDrawerController.A06;
                if (enumC222689s9 == EnumC222689s9.A04) {
                    c89p.A0I.A00();
                    C89P.A01(c89p);
                } else if (enumC222689s9 == EnumC222689s9.A02) {
                    if (c89p.A0I()) {
                        c89p.A08 = new C84B(((C84B) clipsTimelineEditorDrawerController.A0k.A0c.getValue()).A05(), false);
                    }
                    clipsTimelineEditorDrawerController.A06 = EnumC222689s9.A03;
                }
                C70569Wd3 c70569Wd32 = clipsTimelineEditorDrawerController.A0D;
                if (c70569Wd32 != null) {
                    c70569Wd32.A05(false);
                }
                C70569Wd3 c70569Wd33 = clipsTimelineEditorDrawerController.A0D;
                if (c70569Wd33 != null) {
                    c70569Wd33.A06(false);
                    return;
                }
                return;
            }
            C84B c84b = (C84B) clipsTimelineEditorDrawerController.A0k.A0G.A02();
            if (c84b != null && c84b.A01.isEmpty()) {
                clipsTimelineEditorDrawerController.A0f.E4u(new Object());
            }
            if (c89p.A0E) {
                c89p.A0G(true);
                if (C18U.A06(C06090Tz.A05, c89p.A0K, 36322108925683714L) && (medium = c89p.A06) != null) {
                    c89p.A0M.A02(medium);
                }
                c89p.A0Q.Egh(EnumC189158Zj.A05);
                c89p.A0E = false;
                c89p.A0S.Egh(EnumC1828289c.A04);
                if (!c89p.A0H()) {
                    return;
                }
                c05a = c89p.A0P;
                enumC1828289c = null;
            } else {
                C05A c05a2 = c89p.A0Q;
                if (c05a2.getValue() != EnumC189158Zj.A05 && c89p.A0K()) {
                    c89p.A0I.A00();
                    C89P.A01(c89p);
                    return;
                } else {
                    c05a2.Egh(EnumC189158Zj.A02);
                    c05a = c89p.A0S;
                    enumC1828289c = EnumC1828289c.A06;
                }
            }
            c05a.Egh(enumC1828289c);
            return;
        }
        C70569Wd3 c70569Wd34 = clipsTimelineEditorDrawerController.A0D;
        if (z3) {
            if (c70569Wd34 != null && (c06k = c70569Wd34.A0D) != null) {
                c70569Wd34.A0E.A0p(c06k);
            }
        } else if (c70569Wd34 != null) {
            c70569Wd34.A05(z2);
        }
        if (z2 || (c70569Wd3 = clipsTimelineEditorDrawerController.A0D) == null) {
            return;
        }
        c70569Wd3.A06(z3);
    }

    public static final boolean A0I(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        return ((Boolean) clipsTimelineEditorDrawerController.A1C.getValue()).booleanValue();
    }

    public final void A0K(boolean z) {
        InterfaceC143326dX interfaceC143326dX = this.A07;
        if (z) {
            if (interfaceC143326dX != null) {
                interfaceC143326dX.DWb(this);
                return;
            }
        } else if (interfaceC143326dX != null) {
            interfaceC143326dX.D5W(this);
            return;
        }
        C14360o3.A0F("postCaptureControllerManager");
        throw C00O.createAndThrow();
    }

    public final boolean A0L() {
        if (!this.A0k.A0u()) {
            if (this.A0n.A04 == null || this.A06 == EnumC222689s9.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final boolean ABG() {
        AbstractC187378Sf A0E = this.A0p.A0E();
        if (!(A0E instanceof C187508Ss) && !(A0E instanceof C187538Sv) && !(A0E instanceof C187548Sw) && !(A0E instanceof C187518St) && !(A0E instanceof C187528Su) && !(A0E instanceof C8T7)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final boolean CWB() {
        return this.A0q.A0G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r2 != null) goto L19;
     */
    @Override // X.InterfaceC60082oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DBx() {
        /*
            r3 = this;
            X.8Sk r1 = r3.A08
            X.8Sk r2 = X.EnumC187428Sk.A09
            if (r1 != r2) goto L4d
            X.Wd3 r1 = r3.A0D
            if (r1 == 0) goto L18
            X.8Sk r0 = X.EnumC187428Sk.A0C
            float r0 = r0.A00
        Le:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            r1.A01 = r0
        L18:
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L40
            boolean r0 = A0I(r3)
            if (r0 == 0) goto L40
            X.Wd3 r2 = r3.A0D
            if (r2 == 0) goto L4b
            java.lang.Integer r1 = r2.A07
        L2a:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L48
            if (r2 == 0) goto L40
            java.lang.Integer r0 = X.C05F.A00
            r2.A07 = r0
        L34:
            X.8Sk r0 = X.EnumC187428Sk.A0B
            float r0 = r0.A00
            X.WnF r1 = r2.A0G
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A04 = r0
        L40:
            X.8Sk r0 = r3.A08
            r3.A09 = r0
            r0 = 1
            r3.A0J = r0
            return
        L48:
            if (r2 == 0) goto L40
            goto L34
        L4b:
            r1 = 0
            goto L2a
        L4d:
            X.8Sk r0 = X.EnumC187428Sk.A0B
            if (r1 != r0) goto L18
            X.Wd3 r1 = r3.A0D
            if (r1 == 0) goto L18
            float r0 = r2.A00
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.DBx():void");
    }

    @Override // X.InterfaceC60082oq
    public final void DCM() {
        C8D6 c8d6;
        AbstractC223919ua c219579n5;
        C5RM c5rm;
        C8A8 c8a8;
        ViewGroup viewGroup = this.A0P;
        if (viewGroup != null) {
            viewGroup.removeView(this.A0O);
        }
        if (A0L() && (c8a8 = (C8A8) this.A0j.A00.A02()) != null && C14360o3.A0K(c8a8.A01, true)) {
            this.A0g.DCM();
            return;
        }
        if (A0L()) {
            EnumC187428Sk enumC187428Sk = this.A08;
            if (enumC187428Sk == EnumC187428Sk.A07) {
                InterfaceC57817Pkj A02 = A02();
                if (!(A02 instanceof Oz0) && !(A02 instanceof Oz1)) {
                    if (C9BF.A00(A02, 0)) {
                        c8d6 = this.A0l;
                        c219579n5 = new C219599n7((Drawable) ((C9BF) A02).A01);
                    } else if (A02 instanceof C56288Oyz) {
                        c8d6 = this.A0l;
                        c219579n5 = new C219569n4(-1, -1);
                    } else if (!C9BF.A00(A02, 4) && !C9BF.A00(A02, 3)) {
                        if (A02 instanceof C23878AhX) {
                            this.A0u.A03();
                            c8d6 = this.A0l;
                            c219579n5 = C219649nC.A00;
                        } else if (this.A0w.contains(this.A0f.AuG())) {
                            return;
                        }
                    } else {
                        c8d6 = this.A0l;
                        Drawable A00 = c8d6.A00();
                        if ((A00 instanceof C5RM) && (c5rm = (C5RM) A00) != null) {
                            this.A0u.A08(c5rm.A01, c5rm.A00);
                        }
                        this.A0u.A03();
                        c219579n5 = C219639nB.A00;
                    }
                } else {
                    c8d6 = this.A0l;
                    c219579n5 = new C219579n5(-1, -1);
                }
                c8d6.A03(c219579n5);
                return;
            }
            if (enumC187428Sk != EnumC187428Sk.A0A) {
                if (this.A0E) {
                    this.A0E = false;
                } else {
                    C22C A01 = AnonymousClass229.A01(this.A0a);
                    if (A01.A0J() != null) {
                        C22C.A09(EnumC50631MWs.A0I, A01, "TIMELINE_EDIT_CLIPS_DRAG_DONE", ((C22F) A01).A04.A0W);
                    }
                }
            }
            C8D6 c8d62 = this.A0l;
            C141796aw A002 = AbstractC141776au.A00(c8d62);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(c8d62, null, 49), A002);
        } else {
            boolean z = this.A0G;
            C22C A012 = AnonymousClass229.A01(this.A0a);
            EnumC114925Hg A0J = A012.A0J();
            if (z) {
                if (A0J != null) {
                    C22C.A0C(A012, "TIMELINE_EDIT_CLIPS_TAP_DONE");
                }
                this.A0G = false;
            } else if (A0J != null) {
                C22C.A09(EnumC50631MWs.A0I, A012, "TIMELINE_EDIT_CLIPS_DRAG_DONE", ((C22F) A012).A04.A0W);
            }
            this.A0p.A0G(new C187368Se(false));
        }
        EnumC187428Sk enumC187428Sk2 = this.A08;
        if (enumC187428Sk2 != EnumC187428Sk.A05 && enumC187428Sk2 != EnumC187428Sk.A0A) {
            ClipsCreationViewModel clipsCreationViewModel = this.A0k;
            C84B c84b = (C84B) clipsCreationViewModel.A0G.A02();
            if (c84b == null || !c84b.A01.isEmpty()) {
                C87H c87h = this.A0u;
                c87h.A03();
                if (!C18U.A06(C06090Tz.A05, this.A0a, 36320012981641115L)) {
                    c87h.A06(0);
                }
                c87h.A09(clipsCreationViewModel.A0C);
            }
        }
        C84B c84b2 = this.A0B;
        if (c84b2 == null) {
            C14360o3.A0F("segmentStore");
            throw C00O.createAndThrow();
        }
        if (c84b2.A03) {
            C193328hC c193328hC = new C193328hC(this.A0W);
            c193328hC.A0A(2131955499);
            c193328hC.A09(2131955498);
            c193328hC.A0K(new DialogInterfaceOnClickListenerC23159ANy(this), 2131972699);
            c193328hC.A0H(new DialogInterfaceOnClickListenerC23160ANz(this), 2131960921);
            c193328hC.A0s(false);
            C0fJ.A00(c193328hC.A02());
            return;
        }
        A07(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001b. Please report as an issue. */
    @Override // X.InterfaceC60082oq
    public final void DCN() {
        Fragment fragment;
        View view;
        C187358Sd c187358Sd;
        AbstractC187378Sf abstractC187378Sf;
        C70569Wd3 c70569Wd3 = this.A0D;
        if (c70569Wd3 != null) {
            fragment = c70569Wd3.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof ClipsStackedTimelineFragment) {
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment;
            EnumC222759sG enumC222759sG = clipsStackedTimelineFragment.A0R;
            if (enumC222759sG == null) {
                return;
            }
            switch (enumC222759sG.ordinal()) {
                case 0:
                    clipsStackedTimelineFragment.A0T();
                    return;
                case 1:
                    clipsStackedTimelineFragment.A0U();
                    return;
                case 2:
                    c187358Sd = clipsStackedTimelineFragment.A0d;
                    if (c187358Sd != null) {
                        abstractC187378Sf = C219479mv.A00;
                        c187358Sd.A0G(abstractC187378Sf);
                        return;
                    }
                    C14360o3.A0F("clipsTimelineEditorViewModel");
                    throw C00O.createAndThrow();
                case 3:
                    ClipsStackedTimelineFragment.A08(clipsStackedTimelineFragment);
                    return;
                case 4:
                    c187358Sd = clipsStackedTimelineFragment.A0d;
                    if (c187358Sd != null) {
                        abstractC187378Sf = C8TA.A00;
                        c187358Sd.A0G(abstractC187378Sf);
                        return;
                    }
                    C14360o3.A0F("clipsTimelineEditorViewModel");
                    throw C00O.createAndThrow();
                case 5:
                    c187358Sd = clipsStackedTimelineFragment.A0d;
                    if (c187358Sd != null) {
                        abstractC187378Sf = new C8TF(0);
                        c187358Sd.A0G(abstractC187378Sf);
                        return;
                    }
                    C14360o3.A0F("clipsTimelineEditorViewModel");
                    throw C00O.createAndThrow();
                default:
                    return;
            }
        }
        if (!(fragment instanceof C52133N5h) || (view = this.A0O) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.InterfaceC60082oq
    public final void DhK() {
        Fragment fragment;
        C70569Wd3 c70569Wd3 = this.A0D;
        if (c70569Wd3 != null) {
            fragment = c70569Wd3.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof ClipsStackedTimelineFragment) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.A01;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
    }

    @Override // X.InterfaceC60082oq
    public final boolean EiT() {
        return this.A0K;
    }

    @Override // X.InterfaceC60082oq
    public final boolean EjE() {
        int ordinal = this.A08.ordinal();
        if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r3 == X.EnumC187428Sk.A0C) goto L44;
     */
    @Override // X.C8BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.onBackPressed():boolean");
    }

    private final void A0H(boolean z) {
        C8A8 c8a8;
        if ((!A0L() || (c8a8 = (C8A8) this.A0j.A00.A02()) == null || !C14360o3.A0K(c8a8.A01, true)) && !this.A0K) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.A02;
            if (frameLayout2 != null) {
                frameLayout2.setEnabled(z);
            }
            FrameLayout frameLayout3 = this.A02;
            if (frameLayout3 != null) {
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                frameLayout3.setAlpha(f);
            }
        }
    }

    @Override // X.InterfaceC60082oq
    public final void DBz() {
        Integer num;
        C22C A01;
        EnumC50631MWs enumC50631MWs;
        boolean z;
        String str;
        if (A0L()) {
            C70569Wd3 c70569Wd3 = this.A0D;
            if (c70569Wd3 != null) {
                num = c70569Wd3.A07;
            } else {
                num = null;
            }
            if (num == C05F.A00 && c70569Wd3 != null) {
                c70569Wd3.A0G.A04 = Float.valueOf(0.0f);
            }
            this.A0J = false;
            EnumC187428Sk enumC187428Sk = this.A08;
            EnumC187428Sk enumC187428Sk2 = this.A09;
            if (enumC187428Sk != enumC187428Sk2) {
                if (enumC187428Sk2 == EnumC187428Sk.A08) {
                    A0G(this, false, true, false);
                    return;
                }
                if (c70569Wd3 != null) {
                    c70569Wd3.A01 = enumC187428Sk2.A00;
                }
                A0D(this, enumC187428Sk2);
                EnumC187428Sk enumC187428Sk3 = this.A09;
                if (enumC187428Sk3 == EnumC187428Sk.A09) {
                    A01 = AnonymousClass229.A01(this.A0a);
                    if (A01.A0J() == null) {
                        return;
                    }
                    enumC50631MWs = EnumC50631MWs.A0I;
                    z = true;
                    str = "TIMELINE_INCREASE_PREVIEW_SIZE_DRAG";
                } else {
                    if (enumC187428Sk3 != EnumC187428Sk.A0C) {
                        return;
                    }
                    A01 = AnonymousClass229.A01(this.A0a);
                    if (A01.A0J() == null) {
                        return;
                    }
                    enumC50631MWs = EnumC50631MWs.A0I;
                    z = true;
                    str = "TIMELINE_DECREASE_PREVIEW_SIZE_DRAG";
                }
                C22C.A08(enumC50631MWs, A01, str, z);
                return;
            }
            A0D(this, enumC187428Sk);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        ClipsTimelineEditorDrawerControllerLifecycleUtil.cleanupReferences(this);
    }

    public ClipsTimelineEditorDrawerController(View view, ViewGroup viewGroup, Fragment fragment, C24H c24h, InterfaceC110214xq interfaceC110214xq, UserSession userSession, C57012jc c57012jc, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8SY c8sy, C8SW c8sw, InterfaceC1810081c interfaceC1810081c, ClipsAudioMixingDrawerController clipsAudioMixingDrawerController, C184108Ez c184108Ez, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, AnonymousClass825 anonymousClass825, InteractiveDrawableContainer interactiveDrawableContainer, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, boolean z, boolean z2, boolean z3) {
        AbstractC10360h2 supportFragmentManager;
        float A00;
        float A002;
        float f;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragment, 5);
        C14360o3.A0B(anonymousClass825, 8);
        C14360o3.A0B(c1810981l, 9);
        C14360o3.A0B(c5jk, 13);
        C14360o3.A0B(targetViewSizeProvider, 17);
        C14360o3.A0B(c184108Ez, 19);
        C14360o3.A0B(viewGroup, 24);
        this.A0a = userSession;
        this.A0f = interfaceC1810081c;
        this.drawerContainerViewStubHolder = c57012jc;
        this.postCaptureVideoContainer = view;
        this.A0c = anonymousClass840;
        this.A0e = c8sy;
        this.A0t = anonymousClass825;
        this.A14 = c1810981l;
        this.A0g = clipsAudioMixingDrawerController;
        this.A0x = interfaceC08830cm;
        this.A0y = interfaceC08830cm2;
        this.A0r = c5jk;
        this.A1F = z;
        this.A0Z = c24h;
        this.A0b = targetViewSizeProvider;
        this.A1A = clipsCreationDraftViewModel;
        this.A19 = c184108Ez;
        this.A1B = interactiveDrawableContainer;
        this.A16 = c8sw;
        this.A1E = z2;
        this.A1D = z3;
        this.A0X = viewGroup;
        FragmentActivity requireActivity = fragment.requireActivity();
        this.A0Y = requireActivity;
        this.A0W = fragment.requireContext();
        this.A0s = new C187338Sb(fragment, userSession);
        C87H A003 = ((C87G) new C52942bb(requireActivity).A00(C87G.class)).A00("post_capture");
        this.A0u = A003;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0k = clipsCreationViewModel;
        this.A0p = (C187358Sd) new C52942bb(new C187348Sc(requireActivity, clipsCreationViewModel.A0C, A003.A0G, userSession), requireActivity).A00(C187358Sd.class);
        C187418Sj c187418Sj = (C187418Sj) new C52942bb(new C187408Si(requireActivity, userSession), requireActivity).A00(C187418Sj.class);
        this.A18 = c187418Sj;
        this.A0o = c187418Sj;
        this.A17 = c187418Sj;
        this.A0n = (C89P) new C52942bb(new C89O(requireActivity, userSession), requireActivity).A00(C89P.class);
        this.A0j = (C87D) new C52942bb(new C87C(userSession, requireActivity), requireActivity).A00(C87D.class);
        Application application = requireActivity.getApplication();
        C14360o3.A07(application);
        this.A15 = (ClipsAssetHubViewModel) new C52942bb(new C86V(application, userSession), requireActivity).A00(ClipsAssetHubViewModel.class);
        this.A0q = (C8NL) new C52942bb(new C8NK(requireActivity, userSession, clipsCreationViewModel), requireActivity).A00(C8NL.class);
        this.A0m = (C8PF) new C52942bb(new C8PE(), requireActivity).A00(C8PF.class);
        this.A10 = AbstractC09440dt.A01(new C9ES(this, 28));
        this.A12 = AbstractC09440dt.A01(new C9ES(fragment, 30));
        this.A0l = (C8D6) new C52942bb(new C8D5(requireActivity, userSession), fragment).A00(C8D6.class);
        this.A0v = new ArrayList();
        if (C18U.A06(C06090Tz.A05, userSession, 36327297246902767L)) {
            supportFragmentManager = fragment.getChildFragmentManager();
        } else {
            supportFragmentManager = requireActivity.getSupportFragmentManager();
        }
        C14360o3.A0A(supportFragmentManager);
        this.A13 = supportFragmentManager;
        EnumC187428Sk enumC187428Sk = EnumC187428Sk.A0C;
        this.A08 = enumC187428Sk;
        this.A09 = enumC187428Sk;
        this.A0z = AbstractC09440dt.A01(new C9ES(this, 26));
        this.A1C = AbstractC09440dt.A01(new C9ES(this, 27));
        this.A0i = AbstractC183338Bg.A00(userSession);
        this.A0d = anonymousClass840.A02;
        this.A0h = new C187438Sl(this);
        this.A11 = AbstractC09440dt.A01(new C9ES(this, 29));
        EnumC1810181d[] enumC1810181dArr = {EnumC1810181d.A03, EnumC1810181d.A0F, EnumC1810181d.A0A, EnumC1810181d.A0d, EnumC1810181d.A0o, EnumC1810181d.A0u, EnumC1810181d.A13, EnumC1810181d.A14, EnumC1810181d.A15, EnumC1810181d.A1G};
        C14360o3.A0B(enumC1810181dArr, 0);
        this.A0w = AbstractC009903n.A0K(enumC1810181dArr);
        for (EnumC187428Sk enumC187428Sk2 : EnumC187428Sk.values()) {
            EnumC187428Sk enumC187428Sk3 = EnumC187428Sk.A0B;
            FragmentActivity fragmentActivity = this.A0Y;
            if (enumC187428Sk2 == enumC187428Sk3) {
                Context context = this.A0W;
                UserSession userSession2 = this.A0a;
                int i = fragmentActivity.getResources().getDisplayMetrics().heightPixels;
                float dimension = context.getResources().getDimension(R.dimen.ad4ad_button_bottom_margin);
                float dimension2 = context.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material) + AbstractC13880nE.A04(context, 44);
                float dimension3 = context.getResources().getDimension(R.dimen.ad4ad_button_bottom_margin) + AbstractC13880nE.A04(context, 44);
                if (C18U.A06(C06090Tz.A06, userSession2, 36327237116901799L)) {
                    f = context.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material) + context.getResources().getDimension(R.dimen.account_group_management_clickable_width);
                } else {
                    f = 0.0f;
                }
                A002 = (((dimension2 + dimension3) + dimension) + f) / i;
            } else {
                Context applicationContext = fragmentActivity.getApplicationContext();
                C14360o3.A07(applicationContext);
                A002 = AbstractC187448Sm.A00(this.A0Y, A00(applicationContext, enumC187428Sk2));
            }
            enumC187428Sk2.A00 = A002;
        }
        for (EnumC187458Sn enumC187458Sn : EnumC187458Sn.values()) {
            if (enumC187458Sn.ordinal() == 3) {
                float f2 = EnumC187428Sk.A09.A00;
                float f3 = EnumC187428Sk.A0B.A00;
                A00 = ((f2 - f3) / 4.0f) + f3;
            } else {
                A00 = AbstractC187448Sm.A00(this.A0Y, enumC187458Sn.A01);
            }
            enumC187458Sn.A00 = A00;
        }
        if (((Boolean) this.A0z.getValue()).booleanValue() || A0I(this)) {
            this.A0f.A82(new C24060Alw(this));
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A1B;
            if (interactiveDrawableContainer2 != null) {
                interactiveDrawableContainer2.A0v(this);
            }
        }
        this.A0k.A0G.A06(fragment, new C187468So(new C207189Ex(8, this, interfaceC110214xq)));
        this.A0k.A0C.A06(fragment, new C187468So(new C206899Du(this, 47)));
        AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(new C9D0(this, null, 34), this.A0p.A0A));
        C24H c24h2 = this.A0Z;
        if (c24h2 != null) {
            this.A0n.A03 = c24h2;
        }
        this.A0n.A0H.A06(fragment, new C187468So(new C206899Du(this, 48)));
        this.A0o.A00.A06(fragment, new C151846sU(new InterfaceC58362lv() { // from class: X.8TH
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                EnumC187428Sk enumC187428Sk4;
                InterfaceC1810081c interfaceC1810081c2;
                Object obj2;
                C8D6 c8d6;
                AbstractC223919ua abstractC223919ua;
                C191478dz c191478dz;
                int i2;
                C191478dz c191478dz2;
                boolean z4;
                InterfaceC57817Pkj interfaceC57817Pkj = (InterfaceC57817Pkj) obj;
                C14360o3.A0B(interfaceC57817Pkj, 0);
                ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = ClipsTimelineEditorDrawerController.this;
                if (C9BF.A00(interfaceC57817Pkj, 1)) {
                    if (clipsTimelineEditorDrawerController.A0k.A0l()) {
                        clipsTimelineEditorDrawerController.A0E = true;
                        C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
                        if (c70569Wd3 != null) {
                            c70569Wd3.A0G.A02 = 0.0f;
                        }
                        ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, EnumC187428Sk.A05);
                        ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                        z4 = false;
                        ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, z4, false);
                    }
                    clipsTimelineEditorDrawerController.A0o.A0F(C23877AhW.A00);
                    Context context2 = clipsTimelineEditorDrawerController.A0W;
                    C41451vu c41451vu = C41451vu.A01;
                    C146106i8 c146106i8 = new C146106i8();
                    c146106i8.A0D = context2.getString(2131955750);
                    String string = context2.getString(2131955751);
                    C14360o3.A07(string);
                    c146106i8.A0G = string;
                    c146106i8.A0A(new C23956Ajq());
                    c146106i8.A01();
                    c41451vu.E4s(new C3KD(c146106i8.A00()));
                    return;
                }
                if (interfaceC57817Pkj.equals(C23876AhV.A00)) {
                    ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                } else {
                    Fragment fragment2 = null;
                    C09530e4 c09530e4 = null;
                    if (interfaceC57817Pkj instanceof C56289Oz9) {
                        InterfaceC1810081c interfaceC1810081c3 = clipsTimelineEditorDrawerController.A0f;
                        if (interfaceC1810081c3.CRB(EnumC1810181d.A09)) {
                            if (clipsTimelineEditorDrawerController.A0d.A01.A04() != null) {
                                ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                                C183348Bh A004 = AbstractC183338Bg.A00(clipsTimelineEditorDrawerController.A0a);
                                C22P c22p = clipsTimelineEditorDrawerController.A0c.A01;
                                C84B c84b = clipsTimelineEditorDrawerController.A0B;
                                if (c84b == null) {
                                    C14360o3.A0F("segmentStore");
                                    throw C00O.createAndThrow();
                                }
                                int size = c84b.A01.size();
                                AHF A01 = A004.A0J.A01("stackedtimeline", 838614012);
                                String name = c22p.name();
                                C14360o3.A0B(name, 1);
                                A01.A04.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, name);
                                A01.A05("num_segments", size);
                                A004.A07 = A01.A01();
                                interfaceC1810081c3.E4u(new Object());
                                InterfaceC09390do interfaceC09390do = clipsTimelineEditorDrawerController.A12;
                                ((C6WQ) interfaceC09390do.getValue()).A00(clipsTimelineEditorDrawerController.A0W.getString(2131969964));
                                C0fJ.A00((Dialog) interfaceC09390do.getValue());
                                return;
                            }
                            AbstractC12120kG.A07(AbstractC111324zv.A00(298), "Attempting to open sharesheet with no active captured video.", null);
                            AKk.A02(clipsTimelineEditorDrawerController.A0W, C05F.A1I, "Capture session has no active captured media when navigating to share sheet", 2131974293);
                            return;
                        }
                        if (!interfaceC1810081c3.CRB(EnumC1810181d.A0j) || (c191478dz2 = (C191478dz) clipsTimelineEditorDrawerController.A0x.get()) == null) {
                            return;
                        }
                        c191478dz2.A0J();
                        return;
                    }
                    if (interfaceC57817Pkj instanceof C56285Oyw) {
                        C87J c87j = (C87J) clipsTimelineEditorDrawerController.A0u.A0G.A02();
                        int i3 = 0;
                        if (c87j != null) {
                            i2 = c87j.CFM();
                        } else {
                            i2 = 0;
                        }
                        ClipsCreationViewModel clipsCreationViewModel2 = clipsTimelineEditorDrawerController.A0k;
                        if (ClipsCreationViewModel.A00(clipsCreationViewModel2).A00 - i2 > 90000) {
                            i3 = 90000 + i2;
                        }
                        if (clipsCreationViewModel2.A0n()) {
                            c09530e4 = new C09530e4(Integer.valueOf(i2), Integer.valueOf(i3));
                        }
                        AnonymousClass229.A01(clipsTimelineEditorDrawerController.A0a).A03.A07("clips_stacked_timeline_audio_button");
                        ClipsTimelineEditorDrawerController.A05(C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION, clipsTimelineEditorDrawerController, null, c09530e4, false, false, false);
                        return;
                    }
                    if (interfaceC57817Pkj instanceof C56286Oyx) {
                        ClipsTimelineEditorDrawerController.A05(C8BN.TIMELINE_AUDIO_GHOST_TRACK, clipsTimelineEditorDrawerController, null, null, true, false, false);
                        return;
                    }
                    if (interfaceC57817Pkj instanceof C211949aL) {
                        AnonymousClass229.A01(clipsTimelineEditorDrawerController.A0a).A03.A07("clips_stacked_timeline_audio_replace_button");
                        ClipsTimelineEditorDrawerController.A05(C8BN.TIMELINE_AUDIO_REPLACE, clipsTimelineEditorDrawerController, ((C211949aL) interfaceC57817Pkj).A01, null, false, false, false);
                        return;
                    }
                    if (interfaceC57817Pkj instanceof Oz7) {
                        ClipsTimelineEditorDrawerController.A05(C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION, clipsTimelineEditorDrawerController, null, null, false, true, false);
                        return;
                    }
                    if (interfaceC57817Pkj instanceof Oz2) {
                        enumC187428Sk4 = EnumC187428Sk.A0C;
                    } else {
                        if (interfaceC57817Pkj instanceof C56287Oyy) {
                            if (clipsTimelineEditorDrawerController.A0k.A0l()) {
                                clipsTimelineEditorDrawerController.A0s.A00(EnumC50631MWs.A0I, clipsTimelineEditorDrawerController.A0b, null, null, true);
                                return;
                            }
                            clipsTimelineEditorDrawerController.A0o.A0F(C23877AhW.A00);
                            Context context22 = clipsTimelineEditorDrawerController.A0W;
                            C41451vu c41451vu2 = C41451vu.A01;
                            C146106i8 c146106i82 = new C146106i8();
                            c146106i82.A0D = context22.getString(2131955750);
                            String string2 = context22.getString(2131955751);
                            C14360o3.A07(string2);
                            c146106i82.A0G = string2;
                            c146106i82.A0A(new C23956Ajq());
                            c146106i82.A01();
                            c41451vu2.E4s(new C3KD(c146106i82.A00()));
                            return;
                        }
                        if (interfaceC57817Pkj.equals(C23879AhY.A00)) {
                            AbstractC187378Sf A0E = clipsTimelineEditorDrawerController.A0p.A0E();
                            if (!(A0E instanceof C52410NHg)) {
                                return;
                            }
                            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                            clipsTimelineEditorDrawerController.A0n.A0A = Integer.valueOf(((C52410NHg) A0E).A00);
                        } else {
                            if (interfaceC57817Pkj.equals(C23880AhZ.A00)) {
                                interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                obj2 = new Object();
                            } else if (!(interfaceC57817Pkj instanceof Oz0) && !(interfaceC57817Pkj instanceof Oz1) && !C9BF.A00(interfaceC57817Pkj, 0) && !(interfaceC57817Pkj instanceof C56288Oyz) && !C9BF.A00(interfaceC57817Pkj, 4) && !C9BF.A00(interfaceC57817Pkj, 3) && !(interfaceC57817Pkj instanceof C23878AhX)) {
                                if (interfaceC57817Pkj instanceof Oz3) {
                                    interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                    if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                        return;
                                    } else {
                                        obj2 = new Object();
                                    }
                                } else {
                                    if (interfaceC57817Pkj instanceof Oz6) {
                                        if (!clipsTimelineEditorDrawerController.A0f.CRB(EnumC1810181d.A0j) || (c191478dz = (C191478dz) clipsTimelineEditorDrawerController.A0x.get()) == null) {
                                            return;
                                        }
                                        c191478dz.A0H();
                                        return;
                                    }
                                    if (interfaceC57817Pkj instanceof Oz8) {
                                        clipsTimelineEditorDrawerController.A0J(EnumC222689s9.A03, null, false, false, null, null, false, false);
                                        return;
                                    }
                                    if (C9BF.A00(interfaceC57817Pkj, 2)) {
                                        c8d6 = clipsTimelineEditorDrawerController.A0l;
                                        abstractC223919ua = new C219609n8((Drawable) ((C9BF) interfaceC57817Pkj).A01);
                                    } else if (interfaceC57817Pkj instanceof C51825MvT) {
                                        c8d6 = clipsTimelineEditorDrawerController.A0l;
                                        C51825MvT c51825MvT = (C51825MvT) interfaceC57817Pkj;
                                        abstractC223919ua = new C219619n9(c51825MvT.A02, c51825MvT.A00);
                                    } else {
                                        if (interfaceC57817Pkj instanceof C211939aK) {
                                            C70569Wd3 c70569Wd32 = clipsTimelineEditorDrawerController.A0D;
                                            if (c70569Wd32 != null) {
                                                c70569Wd32.A0G.A02 = 0.0f;
                                            }
                                            ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, EnumC187428Sk.A0A);
                                            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                                            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true, false);
                                            C70569Wd3 c70569Wd33 = clipsTimelineEditorDrawerController.A0D;
                                            if (c70569Wd33 == null) {
                                                return;
                                            }
                                            c70569Wd33.A07(true);
                                            return;
                                        }
                                        if (interfaceC57817Pkj instanceof C211929aJ) {
                                            Integer valueOf = Integer.valueOf(((C211929aJ) interfaceC57817Pkj).A00);
                                            clipsTimelineEditorDrawerController.A0s.A00(EnumC50631MWs.A0I, clipsTimelineEditorDrawerController.A0b, new C24103Amo(clipsTimelineEditorDrawerController), valueOf, true);
                                            return;
                                        }
                                        if (C9BF.A00(interfaceC57817Pkj, 5)) {
                                            c8d6 = clipsTimelineEditorDrawerController.A0l;
                                            abstractC223919ua = C219699nH.A00;
                                        } else if (interfaceC57817Pkj instanceof C56294OzF) {
                                            interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                            if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                                return;
                                            } else {
                                                obj2 = new Object();
                                            }
                                        } else if (interfaceC57817Pkj instanceof C56295OzG) {
                                            interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                            if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                                return;
                                            } else {
                                                obj2 = new Object();
                                            }
                                        } else if (interfaceC57817Pkj instanceof C56291OzB) {
                                            interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                            if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                                return;
                                            } else {
                                                obj2 = new Object();
                                            }
                                        } else if (interfaceC57817Pkj instanceof Oz4) {
                                            interfaceC1810081c2 = clipsTimelineEditorDrawerController.A0f;
                                            if (!interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                                return;
                                            } else {
                                                obj2 = new Object();
                                            }
                                        } else {
                                            if (!(interfaceC57817Pkj instanceof C56292OzD) || !clipsTimelineEditorDrawerController.A0f.CRB(EnumC1810181d.A09)) {
                                                return;
                                            }
                                            C70569Wd3 c70569Wd34 = clipsTimelineEditorDrawerController.A0D;
                                            if (c70569Wd34 != null) {
                                                fragment2 = c70569Wd34.A0E.A0O(R.id.fragment_container);
                                            }
                                            if (!(fragment2 instanceof ClipsStackedTimelineFragment)) {
                                                return;
                                            } else {
                                                enumC187428Sk4 = EnumC187428Sk.A0B;
                                            }
                                        }
                                    }
                                    c8d6.A03(abstractC223919ua);
                                    return;
                                }
                            } else {
                                FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
                                if (frameLayout != null) {
                                    frameLayout.setVisibility(8);
                                }
                                C70569Wd3 c70569Wd35 = clipsTimelineEditorDrawerController.A0D;
                                if (c70569Wd35 != null) {
                                    c70569Wd35.A0G.A02 = 0.0f;
                                }
                                enumC187428Sk4 = EnumC187428Sk.A07;
                            }
                            interfaceC1810081c2.E4u(obj2);
                            return;
                        }
                    }
                    ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, enumC187428Sk4);
                    return;
                }
                z4 = true;
                ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, z4, false);
            }
        }));
        AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(new C206629Ct(this, null, 19), this.A15.A09));
        AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(new C9D0(this, null, 35), this.A0n.A0O));
        AbstractC18560vj.A03(AbstractC57302k5.A00(fragment.getLifecycle()), new C15340po(new C9D0(this, null, 36), this.A19.A01));
        AbstractC18560vj.A03(AbstractC57302k5.A00(fragment.getLifecycle()), new C15340po(new C9D0(this, null, 33), this.A17.A02));
    }
}
