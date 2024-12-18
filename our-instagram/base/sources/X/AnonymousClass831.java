package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State;
import com.instagram.reels.common.ui.StoryTypeSelectorView;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Arrays;

/* renamed from: X.831, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass831 implements AnonymousClass832 {
    public static final C55942hf A0p = C55942hf.A03(2.0d, 20.0d);
    public View A01;
    public AnonymousClass835 A02;
    public View A03;
    public View A04;
    public View A05;
    public FrameLayout A06;
    public AnonymousClass835 A07;
    public AnonymousClass835 A08;
    public C172407m9 A09;
    public C184698Hk A0A;
    public C8GA A0B;
    public C8G3 A0C;
    public C217949kS A0D;
    public ColourWheelView A0E;
    public final int A0F;
    public final int A0G;
    public final Activity A0H;
    public final View A0I;
    public final View A0J;
    public final ViewGroup A0K;
    public final ViewGroup A0L;
    public final ViewGroup A0M;
    public final C2GS A0N;
    public final AnonymousClass835 A0O;
    public final AnonymousClass835 A0P;
    public final C23031Ai A0Q;
    public final boolean A0R;
    public final View A0T;
    public final View A0U;
    public final View A0V;
    public final ViewGroup A0W;
    public final ViewGroup A0X;
    public final ViewGroup A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final ViewStub A0c;
    public final ViewStub A0d;
    public final ViewStub A0e;
    public final ViewStub A0f;
    public final ImageView A0g;
    public final C55982hj A0h;
    public final UserSession A0i;
    public final InterfaceC56392iX A0j;
    public final AnonymousClass835 A0k;
    public final AnonymousClass835 A0l;
    public final AnonymousClass835 A0m;
    public final ShutterButton A0n;
    public final boolean A0o;
    public final Rect A0S = new Rect();
    public int A00 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r6 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
    
        if (r6 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r3 = this;
            r2 = 0
            if (r5 == 0) goto L12
            if (r4 != 0) goto L8
            r1 = 1
            if (r6 != 0) goto L9
        L8:
            r1 = 0
        L9:
            X.7m9 r0 = r3.A09
            X.835[] r0 = new X.AnonymousClass835[]{r0}
            X.AbstractC191198dI.A00(r0, r1)
        L12:
            if (r4 != 0) goto L17
            r1 = 1
            if (r6 != 0) goto L18
        L17:
            r1 = 0
        L18:
            X.835 r0 = r3.A07
            X.835[] r0 = new X.AnonymousClass835[]{r0}
            X.AbstractC191198dI.A00(r0, r1)
            android.view.View r1 = r3.A0V
            if (r1 == 0) goto L2c
            r0 = 4
            if (r4 == 0) goto L29
            r0 = 0
        L29:
            r1.setVisibility(r0)
        L2c:
            if (r8 == 0) goto L37
            android.view.ViewGroup r1 = r3.A0K
            r0 = 0
            if (r4 == 0) goto L34
            r0 = 4
        L34:
            r1.setVisibility(r0)
        L37:
            if (r7 == 0) goto L41
            android.view.ViewGroup r0 = r3.A0M
            if (r4 == 0) goto L3e
            r2 = 4
        L3e:
            r0.setVisibility(r2)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass831.A01(boolean, boolean, boolean, boolean, boolean):void");
    }

    private void A02(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((AnonymousClass834) this.A0m).EhF(z3, false);
        ((AnonymousClass834) this.A0P).EhF(z2, false);
        ViewGroup viewGroup = this.A0L;
        int i = 8;
        if (z4) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        A00(z5, 1.0f);
        AnonymousClass835 anonymousClass835 = this.A02;
        if (anonymousClass835 != null && ((AnonymousClass834) anonymousClass835).getView().getVisibility() == 0) {
            CMi();
        }
        C8G3 c8g3 = this.A0C;
        if (c8g3 != null) {
            c8g3.EhF(false, false);
        }
        C8GA c8ga = this.A0B;
        if (c8ga != null) {
            c8ga.EhF(false, false);
        }
        AnonymousClass835[] anonymousClass835Arr = {this.A09};
        if (z) {
            AbstractC191198dI.A00(anonymousClass835Arr, false);
        } else {
            AbstractC191198dI.A01((AnonymousClass835[]) Arrays.copyOf(anonymousClass835Arr, 1), false, false);
        }
        AbstractC191198dI.A00(new AnonymousClass835[]{this.A07}, false);
    }

    private boolean A03(View view, int i, int i2, boolean z) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        Rect rect = this.A0S;
        if (z) {
            view.getHitRect(rect);
        } else {
            view.getGlobalVisibleRect(rect);
        }
        return rect.contains(i, i2);
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        A01(true, true, false, true, true);
        return null;
    }

    @Override // X.AnonymousClass832
    public final void CMW() {
        FCn(false, false, false, false, false, true, false, true, true, false, true, false, false, false, false, true, true, true, false, false, false);
        EkM(false);
    }

    @Override // X.AnonymousClass832
    public final void FCp(boolean z) {
        View[] viewArr = {this.A0J};
        if (z) {
            AbstractC125325le.A04(null, viewArr, true);
        } else {
            AbstractC125325le.A05(viewArr, true);
        }
    }

    @Override // X.AnonymousClass832
    public final void FCs() {
        A02(false, false, false, false, false);
    }

    @Override // X.AnonymousClass832
    public final void FCt(boolean z, boolean z2, boolean z3) {
        A02(z, true, z2, true, true);
    }

    @Override // X.AnonymousClass832
    public final void FCu() {
        A02(false, false, false, false, false);
    }

    @Override // X.AnonymousClass832
    public final void FCw(boolean z, boolean z2, boolean z3, boolean z4) {
        A01(false, z, z2, z3, z4);
    }

    @Override // X.AnonymousClass832
    public final void FCx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        A02(z, false, z4, z5, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r0.A00 != 3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass831(android.view.View r20, X.C81J r21) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass831.<init>(android.view.View, X.81J):void");
    }

    private void A00(boolean z, final float f) {
        ViewStub viewStub = this.A0b;
        if (viewStub != null) {
            View view = this.A01;
            if (view == null) {
                view = viewStub.inflate();
                this.A01 = view;
            }
            if (z) {
                AbstractC125325le.A04(new InterfaceC125355lh() { // from class: X.Amb
                    @Override // X.InterfaceC125355lh
                    public final void onFinish() {
                        AnonymousClass831 anonymousClass831 = AnonymousClass831.this;
                        float f2 = f;
                        View view2 = anonymousClass831.A01;
                        if (view2 != null) {
                            view2.setAlpha(f2);
                        }
                    }
                }, new View[]{view}, true);
            } else {
                AbstractC125325le.A03(view, null, 8, false);
            }
        }
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        Boolean bool;
        PreCaptureButtonManagerIntf$State preCaptureButtonManagerIntf$State = (PreCaptureButtonManagerIntf$State) parcelable;
        if (preCaptureButtonManagerIntf$State != null && (bool = preCaptureButtonManagerIntf$State.A00) != null) {
            EkM(bool.booleanValue());
        }
    }

    @Override // X.AnonymousClass832
    public final void APR() {
        AnonymousClass835 anonymousClass835 = this.A0P;
        anonymousClass835.EPa(0.5f);
        anonymousClass835.setEnabled(false);
        A00(true, 0.5f);
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 Acp() {
        return this.A0k;
    }

    @Override // X.AnonymousClass832
    @Deprecated
    public final ViewGroup AhT() {
        return this.A0K;
    }

    @Override // X.AnonymousClass832
    public final void AhV(Rect rect) {
        this.A0K.getHitRect(rect);
    }

    @Override // X.AnonymousClass832
    public final View AoH() {
        View view = this.A03;
        if (view == null) {
            View inflate = ((ViewStub) this.A0I.requireViewById(R.id.clips_edit_button_stub)).inflate();
            this.A03 = inflate;
            return inflate;
        }
        return view;
    }

    @Override // X.AnonymousClass832
    public final View AoS() {
        if (this.A04 == null) {
            View view = this.A0I;
            View inflate = ((ViewStub) view.requireViewById(R.id.clips_next_button_stub)).inflate();
            this.A04 = inflate;
            TextView textView = (TextView) inflate;
            textView.setText(2131955580);
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            Drawable drawable2 = compoundDrawablesRelative[2];
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
            Resources resources = view.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            int i = (resources.getDisplayMetrics().widthPixels / 2) - (dimensionPixelSize * 2);
            textView.setTextSize(AbstractC13880nE.A02(view.getContext(), AbstractC202928yA.A00(textView.getPaint(), textView.getText().toString(), 1, (int) textView.getTextSize(), i - dimensionPixelSize)));
        }
        return this.A04;
    }

    @Override // X.AnonymousClass832
    public final C184698Hk ApM() {
        View inflate;
        C184698Hk c184698Hk = this.A0A;
        if (c184698Hk == null) {
            if (this.A0R) {
                ColourWheelView ApR = ApR();
                ApR.getClass();
                inflate = ApR.requireViewById(R.id.color_picker_button);
            } else {
                inflate = ((ViewStub) this.A0I.requireViewById(R.id.color_picker_stub_bottom)).inflate();
            }
            Context context = inflate.getContext();
            C14360o3.A0B(context, 0);
            C184698Hk c184698Hk2 = new C184698Hk(inflate, AbstractC13880nE.A04(context, 34), AbstractC13880nE.A04(context, 2), AbstractC13880nE.A04(context, 2));
            this.A0A = c184698Hk2;
            return c184698Hk2;
        }
        return c184698Hk;
    }

    @Override // X.AnonymousClass832
    public final ColourWheelView ApR() {
        if (!this.A0R) {
            return null;
        }
        ColourWheelView colourWheelView = this.A0E;
        if (colourWheelView != null) {
            return colourWheelView;
        }
        ViewStub viewStub = this.A0a;
        viewStub.getClass();
        ColourWheelView colourWheelView2 = (ColourWheelView) viewStub.inflate();
        this.A0E = colourWheelView2;
        return colourWheelView2;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 B6y() {
        return this.A0O;
    }

    @Override // X.AnonymousClass832
    public final StoryTypeSelectorView B8l() {
        return (StoryTypeSelectorView) this.A0j.getView();
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 B9P() {
        return this.A0P;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 BEH() {
        if (this.A07 == null) {
            AnonymousClass834 anonymousClass834 = new AnonymousClass834(this.A0c.inflate());
            this.A07 = anonymousClass834;
            if (this.A0o) {
                Context context = this.A0I.getContext();
                anonymousClass834.EW1(context.getDrawable(R.drawable.instagram_arrow_back_24));
                this.A07.ERh(context.getColor(AbstractC53242c7.A07(context)));
            }
        }
        return this.A07;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 BPO() {
        AnonymousClass835 anonymousClass835 = this.A02;
        if (anonymousClass835 == null) {
            AnonymousClass834 anonymousClass834 = new AnonymousClass834(this.A0d.inflate());
            this.A02 = anonymousClass834;
            return anonymousClass834;
        }
        return anonymousClass835;
    }

    @Override // X.AnonymousClass832
    public final C8GA BVS() {
        C8GA c8ga = this.A0B;
        if (c8ga == null) {
            C8GA c8ga2 = new C8GA((ImageView) ((ViewStub) this.A0I.requireViewById(R.id.music_asset_button_stub)).inflate());
            this.A0B = c8ga2;
            return c8ga2;
        }
        return c8ga;
    }

    @Override // X.AnonymousClass832
    public final C8G3 BVl() {
        C8G3 c8g3 = this.A0C;
        if (c8g3 == null) {
            C8G3 c8g32 = new C8G3((ImageView) ((ViewStub) this.A0I.requireViewById(R.id.music_snippet_button_stub)).inflate());
            this.A0C = c8g32;
            return c8g32;
        }
        return c8g3;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 BmT() {
        return this.A0l;
    }

    @Override // X.AnonymousClass832
    public final C2GT Bq0() {
        return this.A0N;
    }

    @Override // X.AnonymousClass832
    public final ViewGroup BrT() {
        return this.A0Y;
    }

    @Override // X.AnonymousClass832
    public final C172407m9 Bu0() {
        C172407m9 c172407m9 = this.A09;
        if (c172407m9 == null) {
            C172407m9 c172407m92 = new C172407m9((ImageView) this.A0e.inflate());
            this.A09 = c172407m92;
            return c172407m92;
        }
        return c172407m9;
    }

    @Override // X.AnonymousClass832
    public final C217949kS Bug() {
        return this.A0D;
    }

    @Override // X.AnonymousClass832
    public final FrameLayout Bun() {
        ViewStub viewStub = (ViewStub) this.A0I.findViewById(R.id.shopping_camera_purchase_pill_stub);
        if (viewStub != null) {
            this.A06 = (FrameLayout) viewStub.inflate();
        }
        return this.A06;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 C4f() {
        return this.A0m;
    }

    @Override // X.AnonymousClass832
    public final AnonymousClass835 C4g() {
        AnonymousClass835 anonymousClass835 = this.A08;
        if (anonymousClass835 == null) {
            AnonymousClass834 anonymousClass834 = new AnonymousClass834(this.A0f.inflate());
            this.A08 = anonymousClass834;
            return anonymousClass834;
        }
        return anonymousClass835;
    }

    @Override // X.AnonymousClass832
    public final int C9U() {
        return this.A0G;
    }

    @Override // X.AnonymousClass832
    public final void CMN(boolean z) {
        AbstractC125325le.A05(new View[]{this.A0K}, z);
        AbstractC125325le.A05(new View[]{this.A0X}, z);
    }

    @Override // X.AnonymousClass832
    public final void CMP() {
        AbstractC125325le.A05(new View[]{this.A0W}, false);
    }

    @Override // X.AnonymousClass832
    public final void CMR() {
        AbstractC125325le.A05(new View[]{this.A0Z}, false);
    }

    @Override // X.AnonymousClass832
    public final void CMS() {
        AbstractC125325le.A05(new View[]{this.A0I}, false);
    }

    @Override // X.AnonymousClass832
    public final void CMe() {
        this.A0T.setVisibility(8);
        this.A0U.setVisibility(8);
    }

    @Override // X.AnonymousClass832
    public final void CMf() {
        this.A0T.setVisibility(8);
    }

    @Override // X.AnonymousClass832
    public final void CMi() {
        this.A0h.A06(0.0d);
    }

    @Override // X.AnonymousClass832
    public final void CMz() {
        AnonymousClass835 anonymousClass835 = this.A08;
        anonymousClass835.getClass();
        ((AnonymousClass834) anonymousClass835).EhF(false, false);
    }

    @Override // X.AnonymousClass832
    public final void CN2() {
        AbstractC125325le.A05(new View[]{this.A0M}, false);
    }

    @Override // X.AnonymousClass832
    public final boolean CQl() {
        if (this.A0K.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass832
    public final boolean CRC() {
        if (this.A0W.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass832
    public final boolean Cao() {
        if (this.A0Z.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass832
    public final boolean CcC() {
        if (this.A0I.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass832
    public final void EQP(int i) {
        this.A0K.setTranslationY(Math.min(0, 0));
    }

    @Override // X.AnonymousClass832
    public final void EW4(boolean z) {
        View view = this.A0I;
        int i = 4;
        if (z) {
            i = 0;
        }
        AbstractC56932jR.A04(view, i);
    }

    @Override // X.AnonymousClass832
    public final void EeM(int i) {
        this.A0n.setShutterButtonSingularColor(i);
    }

    @Override // X.AnonymousClass832
    public final void EeN(Drawable drawable) {
        this.A0n.setFormatIcon(drawable);
    }

    @Override // X.AnonymousClass832
    public final void EkM(final boolean z) {
        this.A0K.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.8jR
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewGroup viewGroup = AnonymousClass831.this.A0K;
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View findViewById = viewGroup.findViewById(R.id.ar_effect_picker_pager);
                if (findViewById != null) {
                    int i = 8;
                    if (z) {
                        i = 0;
                    }
                    findViewById.setVisibility(i);
                }
            }
        });
    }

    @Override // X.AnonymousClass832
    public final void EkU(boolean z) {
        AbstractC125325le.A04(null, new View[]{this.A0K}, z);
        AbstractC125325le.A04(null, new View[]{this.A0X}, z);
    }

    @Override // X.AnonymousClass832
    public final void EkY() {
        AbstractC125325le.A04(null, new View[]{this.A0W}, false);
    }

    @Override // X.AnonymousClass832
    public final void Ekb() {
        final View view = this.A03;
        if (view != null) {
            final Resources resources = view.getResources();
            view.postDelayed(new Runnable() { // from class: X.Axs
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass831 anonymousClass831 = this;
                    View view2 = view;
                    Resources resources2 = resources;
                    int i = -((view2.getMeasuredHeight() / 2) + AbstractC166997dE.A08(resources2));
                    C5SU c5su = new C5SU(anonymousClass831.A0H, new C23964Ajy(resources2.getString(2131955483), resources2.getString(2131955484)));
                    c5su.A04(view2, 0, i, true);
                    c5su.A02();
                    c5su.A01 = resources2.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                    AbstractC166997dE.A1P(c5su);
                }
            }, 200L);
        }
    }

    @Override // X.AnonymousClass832
    public final void Ekc() {
        AbstractC125325le.A04(null, new View[]{this.A0Z}, false);
    }

    @Override // X.AnonymousClass832
    public final void Ekh() {
        AbstractC125325le.A04(null, new View[]{this.A0I}, false);
    }

    @Override // X.AnonymousClass832
    public final void El4() {
        if (!this.A0o) {
            this.A0T.setVisibility(0);
            this.A0U.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass832
    public final void El7() {
        this.A0h.A03();
        if (this.A02 != null) {
            C23031Ai c23031Ai = this.A0Q;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A3q;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!((Boolean) interfaceC16530ry.CES(c23031Ai, c0yrArr[49])).booleanValue()) {
                AnonymousClass835 anonymousClass835 = this.A02;
                Activity activity = this.A0H;
                C5SU c5su = new C5SU(activity, new C149686oL(activity.getString(2131965803)));
                c5su.A01();
                AnonymousClass834 anonymousClass834 = (AnonymousClass834) anonymousClass835;
                anonymousClass834.getView().post(new RunnableC24624AvK(anonymousClass834, c5su));
                interfaceC16530ry.Egi(c23031Ai, true, c0yrArr[49]);
            }
        }
    }

    @Override // X.AnonymousClass832
    public final void Elj() {
        AnonymousClass835 anonymousClass835 = this.A08;
        anonymousClass835.getClass();
        ((AnonymousClass834) anonymousClass835).EhF(true, false);
    }

    @Override // X.AnonymousClass832
    public final void Elt() {
        AbstractC125325le.A04(null, new View[]{this.A0M}, false);
    }

    @Override // X.AnonymousClass832
    public final void FCo(boolean z, boolean z2, boolean z3) {
        AnonymousClass835 anonymousClass835 = this.A0P;
        if (anonymousClass835 != null) {
            ((AnonymousClass834) anonymousClass835).EhF(z2, false);
        }
        ((AnonymousClass834) this.A0k).EhF(z, false);
        ApM().EhF(z3, false);
    }

    @Override // X.AnonymousClass832
    public final void FCq(float f) {
        this.A0K.setTranslationY(f);
    }

    @Override // X.AnonymousClass832
    public final void FCr(boolean z, boolean z2) {
        if (z) {
            EkU(z2);
        } else {
            CMN(z2);
        }
    }

    @Override // X.AnonymousClass832
    @Deprecated
    public final void FCv(boolean z, boolean z2, boolean z3, boolean z4) {
        if (C2B0.A00(C05F.A0Q)) {
            C18950wb.A00("updateUiForStatesTransitionToPostCapture", 17640711, false).report();
        } else {
            A01(true, z, z2, z3, z4);
        }
    }

    @Override // X.AnonymousClass832
    public final void AAw(C22P c22p, UserSession userSession, C55U c55u, boolean z) {
        boolean A02 = C8YW.A02(c22p, userSession, c55u, z);
        ViewStub viewStub = this.A0e;
        int i = 8388613;
        int i2 = 8388611;
        if (A02) {
            i2 = 8388613;
        }
        AbstractC13880nE.A0X(viewStub, i2 | 48);
        ViewStub viewStub2 = this.A0c;
        if (A02) {
            i = 8388611;
        }
        AbstractC13880nE.A0X(viewStub2, i | 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (A03(r5.A0U, r6, r7, false) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (A03(r5.A0M, r6, r7, true) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r0 = r5.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r0.AJh(r6, r7, r3) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r0 = r5.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r0.AJh(r6, r7, r3) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (A03(r5.A0K, r6, r7, !r3) == false) goto L20;
     */
    @Override // X.AnonymousClass832
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJh(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            boolean r3 = X.AbstractC13440mV.A07()
            r2 = 1
            r1 = 0
            if (r8 == 0) goto L3e
            android.view.View r0 = r5.A05
            if (r0 != 0) goto L17
            android.view.ViewGroup r4 = r5.A0Y
            r0 = 2131435223(0x7f0b1ed7, float:1.8492282E38)
            android.view.View r0 = r4.findViewById(r0)
            r5.A05 = r0
        L17:
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L3d
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r5.A0n
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L3d
            android.view.View r0 = r5.A0T
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L3d
            android.widget.ImageView r0 = r5.A0g
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L3d
            android.view.View r0 = r5.A0U
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 == 0) goto L48
        L3d:
            return r2
        L3e:
            r1 = r3 ^ 1
            android.view.ViewGroup r0 = r5.A0K
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L3d
        L48:
            android.view.ViewGroup r0 = r5.A0M
            boolean r0 = r5.A03(r0, r6, r7, r2)
            if (r0 != 0) goto L3d
            X.835 r0 = r5.A07
            if (r0 == 0) goto L5a
            boolean r0 = r0.AJh(r6, r7, r3)
            if (r0 != 0) goto L3d
        L5a:
            X.7m9 r0 = r5.A09
            if (r0 == 0) goto L65
            boolean r0 = r0.AJh(r6, r7, r3)
            if (r0 == 0) goto L65
            return r2
        L65:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass831.AJh(int, int, boolean):boolean");
    }

    @Override // X.AnonymousClass832
    public final void CN1() {
        CN2();
        AbstractC191198dI.A00(new AnonymousClass835[]{this.A09}, false);
        AbstractC191198dI.A00(new AnonymousClass835[]{this.A07}, false);
    }

    @Override // X.AnonymousClass832
    public final void Els() {
        Elt();
        AbstractC191198dI.A00(new AnonymousClass835[]{this.A09}, true);
        AbstractC191198dI.A00(new AnonymousClass835[]{this.A07}, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    @Override // X.AnonymousClass832
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FCn(boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass831.FCn(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
