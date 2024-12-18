package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.8LD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LD implements InterfaceC1829489p, InterfaceC1829589q, InterfaceC1821886c, C8LE, InterfaceC60152ox, C88F {
    public static boolean A0e;
    public int A00;
    public int A01;
    public GestureDetector A02;
    public View.OnTouchListener A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public C202968yE A08;
    public C202848y2 A09;
    public C194918js A0A;
    public AM2 A0B;
    public C188668Xg A0C;
    public ConstrainedEditText A0D;
    public C6RB A0F;
    public ColourWheelView A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public CameraConfiguration A0O;
    public final Context A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final ViewStub A0T;
    public final UserSession A0U;
    public final C3I9 A0V;
    public final TargetViewSizeProvider A0W;
    public final C88D A0X;
    public final C1814382v A0Y;
    public final InterfaceC1810081c A0Z;
    public final C81L A0a;
    public final DirectCameraViewModel A0b;
    public final InteractiveDrawableContainer A0c;
    public final AnonymousClass878 A0d;
    public TextColorScheme A0E = TextColorScheme.A08;
    public boolean A0L = true;

    @Override // X.InterfaceC1829589q
    public final boolean CLU() {
        return true;
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

    @Override // X.C8LE
    public final /* synthetic */ void D60(int i) {
    }

    @Override // X.C8LE
    public final /* synthetic */ void D61(int i) {
    }

    @Override // X.C8LE
    public final void D62() {
        this.A0K = false;
    }

    @Override // X.C8LE
    public final void D64() {
        this.A0K = true;
        this.A0Y.A00().FCp(false);
        C88D c88d = this.A0X;
        AnonymousClass880 anonymousClass880 = c88d.A0J;
        if (anonymousClass880.A00().isVisible()) {
            AbstractC125325le.A05(new View[]{anonymousClass880.A00().getView()}, true);
            C8TS c8ts = c88d.A01;
            if (c8ts.A00.A0W(C81W.A0C)) {
                c8ts.A02.A0G.A0B(true);
            }
            C57012jc c57012jc = c88d.A0D;
            if (c57012jc.A04()) {
                AbstractC125325le.A05(new View[]{c57012jc.A01()}, true);
            }
        }
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

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    @Override // X.InterfaceC1829589q
    public final void EJm() {
    }

    private void A00() {
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            Editable text = constrainedEditText.getText();
            C14360o3.A0B(text, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.toString());
            C4GL.A04(spannableStringBuilder, text, (Class[]) Arrays.copyOf(new Class[]{C6S0.class, C202908y8.class, C190868ci.class, C202918y9.class, C190888ck.class, C202938yB.class}, 6));
            C6RB c6rb = this.A0F;
            c6rb.getClass();
            c6rb.A0B(this.A0D.getLineSpacingExtra(), this.A0D.getLineSpacingMultiplier());
            C6RB c6rb2 = this.A0F;
            c6rb2.getClass();
            c6rb2.A0L(spannableStringBuilder);
            C6RB c6rb3 = this.A0F;
            c6rb3.getClass();
            A01(c6rb3, this);
            A07(this);
            A0A(this);
            ConstrainedEditText constrainedEditText2 = this.A0D;
            if (constrainedEditText2 != null) {
                Editable text2 = constrainedEditText2.getText();
                C14360o3.A0A(text2);
                AbstractC190978ct.A03(text2);
                constrainedEditText2.invalidate();
            }
            A0E(this);
            if (this.A0D != null && this.A0F != null) {
                C194918js c194918js = this.A0A;
                c194918js.getClass();
                c194918js.A07();
                Context context = this.A0P;
                C14360o3.A0B(context, 1);
                int A00 = AbstractC188878Yd.A00(context) - (context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height) * 2);
                this.A0c.A0m(this.A0F, Math.min(1.0f, A00 / r5.A06));
            }
            A0G(this);
            C6RB c6rb4 = this.A0F;
            c6rb4.getClass();
            c6rb4.setVisible(true, false);
            C6RB c6rb5 = this.A0F;
            c6rb5.getClass();
            c6rb5.invalidateSelf();
        }
    }

    public static void A02(AGv aGv, C8LD c8ld) {
        int i;
        int i2;
        int i3;
        int i4;
        AM2 am2 = c8ld.A0B;
        if (am2 != null) {
            C8DV c8dv = am2.A01;
            if (c8dv == null) {
                i = 0;
            } else {
                i = c8dv.A00;
            }
            aGv.A01 = i;
            if (c8dv == null) {
                AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null when adding background metadata");
                return;
            }
            int i5 = c8dv.A00;
            if (i5 != -1 && (i4 = c8dv.A01) == i5) {
                aGv.A03 = i4;
                aGv.A02 = am2.A00;
            } else {
                c8dv.A01();
                C23031Ai c23031Ai = am2.A0E;
                String str = am2.A03.A09;
                C14360o3.A0B(str, 0);
                InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D(AnonymousClass001.A0R("text_to_camera_custom_text_color_scheme_index_", str), -1);
                ARD.apply();
                String str2 = am2.A03.A09;
                C8DV c8dv2 = am2.A01;
                if (c8dv2 == null) {
                    i2 = 0;
                } else {
                    i2 = c8dv2.A00;
                }
                C14360o3.A0B(str2, 0);
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7D(AnonymousClass001.A0R("text_to_camera_gradient_background_index_", str2), i2);
                ARD2.apply();
                c8dv = am2.A01;
                if (c8dv == null) {
                    i3 = 0;
                } else {
                    i3 = c8dv.A00;
                }
                aGv.A01 = i3;
            }
            aGv.A0A = c8dv.A05;
        }
    }

    public static void A03(C8LD c8ld) {
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        if (constrainedEditText != null && constrainedEditText.hasFocus()) {
            c8ld.A0D.clearFocus();
        }
    }

    public static void A04(C8LD c8ld) {
        if (c8ld.A0F == null) {
            C194918js c194918js = c8ld.A0A;
            c194918js.getClass();
            C190888ck A07 = c194918js.A07();
            Context context = c8ld.A0P;
            C190958cr c190958cr = A07.A06;
            C6RB c6rb = new C6RB(context, c190958cr.A00(context));
            c6rb.A0I(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z));
            c6rb.A09();
            TextColorScheme textColorScheme = c8ld.A0E;
            C14360o3.A0B(context, 1);
            Editable A00 = AbstractC23116AHf.A00(c6rb.A0F);
            if (A00 != null) {
                TextColors ALM = InterfaceC190908cm.A01.ALM(textColorScheme.A02);
                int alpha = Color.alpha(-1);
                C190868ci c190868ci = (C190868ci) C4GL.A00(A00, C190868ci.class);
                if (c190868ci == null) {
                    C190868ci c190868ci2 = new C190868ci(context, ALM);
                    c190868ci2.A03 = Integer.valueOf(alpha);
                    AbstractC167017dG.A15(A00, c190868ci2);
                } else {
                    c190868ci.A00(ALM);
                }
                c6rb.A0L(A00);
                c6rb.invalidateSelf();
            }
            c8ld.A0F = c6rb;
            c8ld.A00();
            c8ld.A0c.A0J(c6rb, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) "TextModeComposerController", (String) null, (List) null, -1.0f, c190958cr.A02, -1.0f, -1.0f, -1.0f, 0, true, false, true, false, false, false, true, true, true, true, true, true, false, false), false, false, false);
            A07(c8ld);
        } else {
            c8ld.A00();
            BEd A002 = InteractiveDrawableContainer.A00(c8ld.A0F, c8ld.A0c);
            if (A002 != null) {
                A002.Cp4(true);
            }
        }
        A05(c8ld);
    }

    public static void A05(C8LD c8ld) {
        A0H(c8ld, C05F.A0C);
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        if (constrainedEditText != null) {
            AbstractC13880nE.A0O(constrainedEditText);
        }
        if (!c8ld.A0M && c8ld.A0Z.CRB(EnumC1810181d.A08) && A0I(c8ld) && c8ld.A0b == null) {
            A06(c8ld);
        }
    }

    public static void A06(C8LD c8ld) {
        EnumC114925Hg enumC114925Hg = EnumC114925Hg.STORY;
        CameraConfiguration cameraConfiguration = c8ld.A0O;
        if (cameraConfiguration != null) {
            enumC114925Hg = cameraConfiguration.A03.A00;
        }
        AnonymousClass229.A01(c8ld.A0U).A0y(enumC114925Hg, AnonymousClass249.OTHER, EnumC50631MWs.A06, null, null);
        C188668Xg c188668Xg = c8ld.A0C;
        AbstractC197108nf.A00(c188668Xg.A07);
        c188668Xg.A06.A04();
    }

    public static void A07(C8LD c8ld) {
        if (c8ld.A0D != null && c8ld.A0F != null) {
            C202968yE c202968yE = c8ld.A08;
            c202968yE.getClass();
            Integer num = c202968yE.A00;
            AbstractC209689Pe.A0A(c8ld.A0F);
            C6RB c6rb = c8ld.A0F;
            c6rb.A0K(AbstractC209689Pe.A00(c6rb, num));
            Rect bounds = c8ld.A0F.getBounds();
            float exactCenterY = bounds.exactCenterY();
            float width = bounds.width();
            float f = 0.0f;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        f = (c8ld.A0c.getRight() - c8ld.A0D.getPaddingRight()) - (width / 2.0f);
                    }
                } else {
                    InteractiveDrawableContainer interactiveDrawableContainer = c8ld.A0c;
                    f = (interactiveDrawableContainer.getLeft() / 2) + (interactiveDrawableContainer.getRight() / 2);
                }
            } else {
                f = c8ld.A0c.getLeft() + c8ld.A0D.getPaddingLeft() + (width / 2.0f);
            }
            AHh.A02(InteractiveDrawableContainer.A00(c8ld.A0F, c8ld.A0c), f, exactCenterY);
        }
    }

    public static void A08(C8LD c8ld) {
        C202968yE c202968yE = c8ld.A08;
        c202968yE.getClass();
        AbstractC125325le.A04(null, new View[]{c202968yE.A01}, false);
    }

    public static void A09(C8LD c8ld) {
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        if (constrainedEditText != null) {
            C6RB c6rb = c8ld.A0F;
            if (c6rb != null) {
                Spannable spannable = c6rb.A0F;
                constrainedEditText.setText(spannable);
                c8ld.A0D.setSelection(spannable.length());
                return;
            }
            constrainedEditText.setText("");
        }
    }

    public static void A0A(C8LD c8ld) {
        Spannable text;
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        if (constrainedEditText != null) {
            Context context = c8ld.A0P;
            C6RB c6rb = c8ld.A0F;
            if (c6rb != null) {
                text = c6rb.A0F;
            } else {
                text = constrainedEditText.getText();
            }
            AbstractC190858ch.A01(context, text, c8ld.A0D.getSelectionStart(), c8ld.A0D.getSelectionEnd(), c8ld.A0E.A02);
        }
    }

    public static void A0B(C8LD c8ld) {
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        constrainedEditText.getClass();
        C194918js c194918js = c8ld.A0A;
        c194918js.getClass();
        C202848y2 c202848y2 = c8ld.A09;
        c202848y2.getClass();
        ViewGroup viewGroup = c8ld.A06;
        viewGroup.getClass();
        AbstractC209689Pe.A04(viewGroup, c202848y2, c194918js, constrainedEditText, false, false);
    }

    public static void A0C(C8LD c8ld) {
        if (c8ld.A0D != null) {
            C202968yE c202968yE = c8ld.A08;
            c202968yE.getClass();
            Integer num = c202968yE.A00;
            int intValue = num.intValue();
            int i = 3;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        i = 5;
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0R("Unknown alignment: ", AbstractC23070AFc.A00(num)));
                    }
                } else {
                    i = 1;
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c8ld.A0D.getLayoutParams();
            int i2 = i | 16;
            layoutParams.gravity = i2;
            c8ld.A0D.setLayoutParams(layoutParams);
            if (c8ld.A0D.getText().length() == 0) {
                c8ld.A0D.setGravity(8388627);
            } else {
                c8ld.A0D.setGravity(i2);
            }
        }
    }

    public static void A0D(C8LD c8ld) {
        CharSequence charSequence;
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        if (constrainedEditText != null) {
            if (constrainedEditText.hasFocus()) {
                charSequence = c8ld.A0H;
            } else {
                charSequence = c8ld.A0I;
            }
            constrainedEditText.setHint(charSequence);
            AbstractC23116AHf.A01(c8ld.A0D, c8ld.A0E);
            C194918js c194918js = c8ld.A0A;
            c194918js.getClass();
            AbstractC23116AHf.A02(c8ld.A0D, c194918js.A07());
        }
    }

    public static void A0E(C8LD c8ld) {
        if (c8ld.A0D != null && c8ld.A0F != null) {
            C194918js c194918js = c8ld.A0A;
            c194918js.getClass();
            C190888ck A07 = c194918js.A07();
            Editable text = c8ld.A0D.getText();
            float textSize = c8ld.A0D.getTextSize();
            C6RB c6rb = c8ld.A0F;
            Context context = c8ld.A0P;
            c6rb.A0C(AHV.A00(context, text, A07, c6rb, textSize), AHV.A01(context, text, A07, c8ld.A0F, textSize));
        }
    }

    public static void A0F(C8LD c8ld) {
        if (c8ld.A0D != null) {
            C194918js c194918js = c8ld.A0A;
            c194918js.getClass();
            C190958cr c190958cr = c194918js.A07().A06;
            Context context = c8ld.A0P;
            int A00 = c190958cr.A00(context);
            C14360o3.A0B(context, 1);
            int A01 = (int) (((1.0f - c190958cr.A03) * AbstractC188878Yd.A01(context)) / 2.0f);
            ConstrainedEditText constrainedEditText = c8ld.A0D;
            constrainedEditText.setPadding(A01, constrainedEditText.getPaddingTop(), A01, c8ld.A0D.getPaddingBottom());
            C6RB c6rb = c8ld.A0F;
            if (c6rb != null) {
                c6rb.A0E(A00);
                A07(c8ld);
            }
        }
    }

    public static void A0G(C8LD c8ld) {
        C194918js c194918js;
        if (c8ld.A0D != null && (c194918js = c8ld.A0A) != null) {
            C190888ck A07 = c194918js.A07();
            int length = c8ld.A0D.getText().length();
            C190958cr c190958cr = A07.A06;
            Context context = c8ld.A0P;
            C14360o3.A0B(context, 0);
            Resources resources = context.getResources();
            if (length == 0) {
                c8ld.A0D.setTextSize(0, resources.getDimensionPixelSize(c190958cr.A06));
                return;
            }
            float dimensionPixelSize = resources.getDimensionPixelSize(c190958cr.A05);
            c8ld.A0D.setTextSize(0, dimensionPixelSize);
            C6RB c6rb = c8ld.A0F;
            if (c6rb == null) {
                return;
            }
            c6rb.A0A(dimensionPixelSize);
            A01(c8ld.A0F, c8ld);
            A07(c8ld);
        }
    }

    public static void A0H(final C8LD c8ld, Integer num) {
        List list;
        Integer num2 = c8ld.A0J;
        if (num2 != num) {
            c8ld.A0J = num;
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        InteractiveDrawableContainer interactiveDrawableContainer = c8ld.A0c;
                        boolean z = c8ld.A0a.A02;
                        interactiveDrawableContainer.A0S = z;
                        if (!z) {
                            AbstractC125325le.A04(new InterfaceC125355lh() { // from class: X.AmL
                                @Override // X.InterfaceC125355lh
                                public final void onFinish() {
                                    ConstrainedEditText constrainedEditText = C8LD.this.A0D;
                                    constrainedEditText.getClass();
                                    AbstractC13880nE.A0R(constrainedEditText);
                                }
                            }, new View[]{c8ld.A0D}, true);
                        } else {
                            ConstrainedEditText constrainedEditText = c8ld.A0D;
                            if (constrainedEditText != null) {
                                constrainedEditText.setAlpha(1.0f);
                            }
                        }
                        TextView textView = c8ld.A07;
                        textView.getClass();
                        AbstractC125325le A01 = AbstractC125325le.A01(textView, 0);
                        A01.A0G();
                        A01.A04 = 0;
                        A01.A0M(0.0f, 1.0f);
                        A01.A0F(true).A0H();
                        C194918js c194918js = c8ld.A0A;
                        c194918js.getClass();
                        if (c194918js.A0F) {
                            View[] viewArr = {c194918js.A08};
                            C55942hf c55942hf = C150956qv.A02;
                            AbstractC125325le.A04(null, viewArr, false);
                        }
                        c194918js.A09();
                        A0A(c8ld);
                    }
                } else {
                    c8ld.A0V.A9e(c8ld);
                    InteractiveDrawableContainer interactiveDrawableContainer2 = c8ld.A0c;
                    interactiveDrawableContainer2.A0v(c8ld);
                    interactiveDrawableContainer2.A0S = true;
                    ConstrainedEditText constrainedEditText2 = c8ld.A0D;
                    constrainedEditText2.getClass();
                    constrainedEditText2.setFocusableInTouchMode(true);
                    boolean A0I = A0I(c8ld);
                    View[] viewArr2 = {c8ld.A04};
                    if (A0I) {
                        AbstractC125325le.A05(viewArr2, false);
                    } else {
                        AbstractC125325le.A04(null, viewArr2, false);
                    }
                    A0D(c8ld);
                    AbstractC125325le.A04(null, new View[]{c8ld.A0D}, false);
                    AbstractC125325le.A05(new View[]{c8ld.A07}, false);
                    c8ld.A0P(false, false);
                    C188668Xg c188668Xg = c8ld.A0C;
                    C150956qv.A08(new View[]{c188668Xg.A00}, true);
                    AbstractC125325le.A04(null, new View[]{c188668Xg.A09}, false);
                    C188668Xg.A00(c188668Xg);
                    C6RB c6rb = c8ld.A0F;
                    if (c6rb != null) {
                        interactiveDrawableContainer2.A0q(c6rb, c8ld.A0a.A03);
                        c8ld.A0F.setVisible(true, false);
                    }
                    boolean z2 = c8ld.A0a.A02;
                    C88D c88d = c8ld.A0X;
                    if (!z2) {
                        C88M c88m = c88d.A0H;
                        if (c88m.isEmpty()) {
                            boolean z3 = false;
                            if (c88d.A01.A03.A1t.getInteractiveDrawables().size() > 0) {
                                z3 = true;
                            }
                            c88d.A03 = z3;
                            if (!z3 && c88d.A0N) {
                                list = c88d.A00.A04(false);
                            } else {
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(c88d.A00.A03());
                                list = arrayList;
                            }
                            C88X c88x = ((C88E) c88d).A00;
                            if (c88x != null) {
                                C88Z c88z = c88x.A04;
                                if (c88z == null) {
                                    c88z = C88Z.A0G;
                                }
                                if (c88z == C88Z.A0I || c88z == C88Z.A09 || c88z == C88Z.A0d) {
                                    list.add(0, c88x);
                                }
                            }
                            C88R c88r = c88d.A0F;
                            if (c88r.A01 == null) {
                                View view = c88r.A07;
                                View inflate = ((ViewStub) view.requireViewById(R.id.active_canvas_element_view_stub)).inflate();
                                c88r.A01 = inflate;
                                c88r.A00 = inflate.requireViewById(R.id.active_canvas_element_view);
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view.requireViewById(R.id.loading_mask_overlay);
                                c88r.A04 = touchInterceptorFrameLayout;
                                touchInterceptorFrameLayout.setOnTouchListener(new ATD(c88r));
                                GradientSpinner gradientSpinner = (GradientSpinner) c88r.A04.requireViewById(R.id.loading_mask_overlay_gradient);
                                gradientSpinner.setGradientColors(R.style.ViewerLoadingGradientStyle);
                                gradientSpinner.A06();
                                View A012 = c88r.A08.A01();
                                c88r.A02 = (ImageView) A012.requireViewById(R.id.active_canvas_element_dice_view);
                                AnonymousClass693 A00 = C68U.A00(c88r.A06, R.raw.canvas_dice_animation);
                                if (A00 != null) {
                                    A00.ABF(true);
                                }
                                c88r.A02.setImageDrawable(A00);
                                C0fQ.A00(new ARM(A00, c88r), c88r.A02);
                                IgTextView igTextView = (IgTextView) A012.requireViewById(R.id.active_canvas_element_see_all_view);
                                c88r.A03 = igTextView;
                                C0fQ.A00(new AQG(c88r), igTextView);
                                ImageView imageView = c88r.A02;
                                int A0D = AbstractC13880nE.A0D(imageView);
                                int i = c88r.A05;
                                AbstractC13880nE.A0f(imageView, A0D + i);
                                IgTextView igTextView2 = c88r.A03;
                                AbstractC13880nE.A0f(igTextView2, AbstractC13880nE.A0D(igTextView2) + i);
                                View view2 = c88r.A00;
                                view2.post(new RunnableC24625AvL(view2, c88r));
                                C88T c88t = c88r.A09;
                                View view3 = c88r.A01;
                                c88t.A01 = view3.findViewById(R.id.active_canvas_element_view);
                                C57012jc c57012jc = new C57012jc((ViewStub) view3.findViewById(R.id.active_canvas_element_text_view_with_header_stub));
                                c88t.A06 = c57012jc;
                                c57012jc.A02 = new C23711Aek(c88t);
                                c88t.A05 = new C57012jc((ViewStub) view3.findViewById(R.id.active_canvas_element_background_view_stub));
                                c88t.A04 = new C57012jc((ViewStub) view3.findViewById(R.id.canvas_text_view_suggestions_recycler_view_stub));
                                View A013 = c88t.A06.A01();
                                SearchEditText searchEditText = (SearchEditText) A013.requireViewById(R.id.canvas_text_view_input_text);
                                c88t.A07 = searchEditText;
                                searchEditText.setAllowTextSelection(true);
                                c88t.A03 = (IgTextView) A013.requireViewById(R.id.canvas_text_view_error);
                                c88t.A0D.A03(c88t.A06.A01());
                            }
                            c88d.A0J.A00().EVD(false);
                            c88m.A06(list);
                        }
                        c88d.A05 = true;
                        AnonymousClass880 anonymousClass880 = c88d.A0J;
                        anonymousClass880.A00().AJ8(c88m, c88d.A0I);
                        anonymousClass880.A00().EVD(true);
                        anonymousClass880.A00().show();
                        C0fA.A00(c88m, 1459048036);
                        C57012jc c57012jc2 = c88d.A0D;
                        if (c57012jc2.A04()) {
                            AbstractC125325le.A04(null, new View[]{c57012jc2.A01()}, true);
                        }
                        UserSession userSession = c88d.A0C;
                        C14360o3.A06(userSession);
                        C448524p c448524p = AnonymousClass229.A01(userSession).A0D;
                        C18920wW c18920wW = c448524p.A01;
                        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
                        C22M c22m = c448524p.A04;
                        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A06;
                        c22m.A0C = enumC50631MWs;
                        if (c448524p.A0P() && A002.isSampled()) {
                            A002.AAP("legacy_falco_event_name", "IG_CAMERA_START_CREATE_MODE_SESSION");
                            A002.AAP("entity", "CREATE_MODE");
                            String str = c22m.A0L;
                            if (str == null) {
                                str = "";
                            }
                            A002.AAP("camera_session_id", str);
                            int i2 = 2;
                            if (c22m.A01 != 2) {
                                i2 = 1;
                            }
                            A002.A8p("camera_position", Integer.valueOf(i2));
                            A002.A8R(c448524p.A0I(), "capture_type");
                            A002.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            A002.A8p("event_type", 2);
                            A002.A8R(c22m.A0A, "media_type");
                            A002.AAP("module", C22F.A08.getModuleName());
                            A002.A8R(enumC50631MWs, "surface");
                            A002.AAP("nav_chain", C1QM.A00.A02.A00);
                            A002.AAQ(AbstractC449424y.A07(c448524p.A00, c448524p.A03), "system_info");
                            A002.AAP("device_fold_orientation", AbstractC82673mV.A00);
                            A002.AAP("device_fold_state", AbstractC82683mW.A00);
                            A002.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                            A002.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                            A002.Cht();
                        }
                    } else {
                        c88d.A07(true);
                        if (num2 != C05F.A0N) {
                            c8ld.A0K();
                        }
                    }
                }
            } else {
                if (c8ld.A01 == 0) {
                    c8ld.A0V.EFx(c8ld);
                }
                InteractiveDrawableContainer interactiveDrawableContainer3 = c8ld.A0c;
                interactiveDrawableContainer3.A0w(c8ld);
                if (num2 != C05F.A00) {
                    if (c8ld.A0F != null && !c8ld.A0Z.CRB(EnumC1810181d.A0j)) {
                        interactiveDrawableContainer3.A0q(c8ld.A0F, false);
                        c8ld.A0F.setVisible(false, false);
                    }
                    C188668Xg c188668Xg2 = c8ld.A0C;
                    View[] viewArr3 = {c188668Xg2.A00};
                    C55942hf c55942hf2 = C150956qv.A02;
                    AbstractC125325le.A04(null, viewArr3, true);
                    if (c188668Xg2.A07.Cap()) {
                        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c188668Xg2.A08;
                        if ((viewOnTouchListenerC1829389o == null || viewOnTouchListenerC1829389o.A03 == null) && !c188668Xg2.A0A && !c188668Xg2.A03.CLU()) {
                            C150956qv.A08(new View[]{c188668Xg2.A09}, false);
                        }
                        C188668Xg.A00(c188668Xg2);
                    }
                }
                C194918js c194918js2 = c8ld.A0A;
                c194918js2.getClass();
                if (c194918js2.A0F) {
                    C150956qv.A08(new View[]{c194918js2.A08}, false);
                }
            }
            AM2 am2 = c8ld.A0B;
            if (am2 != null) {
                boolean z4 = true;
                if (intValue != 1) {
                    if (intValue == 2) {
                        if (!am2.A0D.A04 || am2.A04) {
                            z4 = false;
                        }
                        AM2.A02(am2, z4);
                        am2.A04 = false;
                        return;
                    }
                    return;
                }
                if (am2.A0D.A04) {
                    am2.A08.A06(0.0d);
                } else {
                    am2.A07.setVisibility(8);
                    am2.A0A.setVisibility(8);
                }
            }
        }
    }

    public static boolean A0I(C8LD c8ld) {
        ConstrainedEditText constrainedEditText;
        if (c8ld.A0J == C05F.A00 || (constrainedEditText = c8ld.A0D) == null) {
            return false;
        }
        Editable text = constrainedEditText.getText();
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text.toString().trim())) {
            return false;
        }
        return true;
    }

    public final AGv A0J(boolean z, boolean z2) {
        AGv aGv = new AGv(this.A0P);
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            aGv.A04 = constrainedEditText.getText();
            aGv.A05 = Layout.Alignment.ALIGN_CENTER;
            aGv.A00 = 0.0f;
            C194918js c194918js = this.A0A;
            c194918js.getClass();
            aGv.A07 = c194918js.A07();
        }
        aGv.A0E = z2;
        aGv.A0D = z;
        A0L(aGv);
        A02(aGv, this);
        return aGv;
    }

    public final void A0K() {
        ConstrainedEditText constrainedEditText;
        if (!this.A0L && !this.A0a.A02) {
            return;
        }
        C6RB c6rb = this.A0F;
        if (c6rb != null) {
            c6rb.setVisible(false, false);
        }
        AbstractC125325le.A04(null, new View[]{this.A04}, false);
        if (this.A0a.A02 && (constrainedEditText = this.A0D) != null) {
            constrainedEditText.setAlpha(0.0f);
        }
        ConstrainedEditText constrainedEditText2 = this.A0D;
        constrainedEditText2.getClass();
        constrainedEditText2.requestFocus();
        ConstrainedEditText constrainedEditText3 = this.A0D;
        constrainedEditText3.getClass();
        AbstractC13880nE.A0R(constrainedEditText3);
    }

    public final void A0L(AGv aGv) {
        boolean z;
        boolean z2;
        C88D c88d = this.A0X;
        C88X A01 = c88d.A0H.A01();
        if (A01 != null) {
            if (c88d.A09()) {
                C88Z c88z = A01.A04;
                if (c88z == null) {
                    c88z = C88Z.A0G;
                }
                aGv.A06 = c88z;
                ACt A012 = c88d.A01(A01);
                if (A012 instanceof C218089kg) {
                    C218089kg c218089kg = (C218089kg) A012;
                    z2 = true;
                    aGv.A0D = true;
                    aGv.A09 = ((JM1) c218089kg.A04.get(c218089kg.A00)).C5f();
                    aGv.A0E = false;
                } else {
                    if (!(A012 instanceof C217999kX)) {
                        if (A012 instanceof C218109ki) {
                            aGv.A0E = false;
                            z2 = true;
                            aGv.A0D = true;
                        } else if (!(A012 instanceof C218099kh) && !(A012 instanceof C218079kf)) {
                            if (!(A012 instanceof C218049kc)) {
                                if (A012 instanceof C218059kd) {
                                    z = C218059kd.A02((C218059kd) A012);
                                    aGv.A0D = z;
                                    return;
                                } else {
                                    if (!(A012 instanceof C218069ke)) {
                                        return;
                                    }
                                    aGv.A0E = false;
                                    aGv.A0F = false;
                                    return;
                                }
                            }
                            z = true;
                            aGv.A0D = z;
                            return;
                        }
                    }
                    aGv.A0E = false;
                    aGv.A0C = false;
                    z = true;
                    aGv.A0D = z;
                    return;
                }
                aGv.A0C = z2;
                return;
            }
            if (!C88E.A00(A01)) {
                return;
            }
            C88Z c88z2 = A01.A04;
            if (c88z2 == null) {
                c88z2 = C88Z.A0G;
            }
            aGv.A06 = c88z2;
        }
    }

    public final void A0N(boolean z) {
        Integer num;
        if (this.A0J != C05F.A00) {
            if (z) {
                if (!this.A0X.A09()) {
                    AbstractC125325le.A04(null, new View[]{this.A05, this.A0D}, this.A0a.A04);
                }
                ColourWheelView colourWheelView = this.A0G;
                if (colourWheelView != null) {
                    colourWheelView.postDelayed(new Runnable() { // from class: X.As6
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8LD c8ld = C8LD.this;
                            if (!C8LD.A0e) {
                                C18720vz c18720vz = AbstractC12960li.A00;
                                if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("has_used_create_mode_colour_wheel", false) && AbstractC19730y1.A00(c18720vz).A00.getInt("create_mode_colour_wheel_tooltip_impressions", 0) < 1) {
                                    C149686oL c149686oL = new C149686oL(2131954788);
                                    ColourWheelView colourWheelView2 = c8ld.A0G;
                                    colourWheelView2.getClass();
                                    C5SU c5su = new C5SU(colourWheelView2.getContext(), (ViewGroup) c8ld.A0R, c149686oL);
                                    c5su.A03(c8ld.A0G);
                                    c5su.A02();
                                    c5su.A04 = new C220459oV(c8ld, 3);
                                    c5su.A00().A07(c8ld.A0U);
                                }
                            }
                        }
                    }, 1000L);
                }
                num = C05F.A0C;
            } else {
                boolean z2 = this.A0a.A04;
                AbstractC125325le.A05(new View[]{this.A0D, this.A05}, z2);
                AbstractC125325le.A04(null, new View[]{this.A0Q}, z2);
                A03(this);
                num = C05F.A01;
            }
            A0H(this, num);
        }
    }

    public final void A0O(boolean z) {
        if (this.A0J != C05F.A00) {
            View[] viewArr = {this.A0D};
            if (z) {
                AbstractC125325le.A04(null, viewArr, false);
            } else {
                AbstractC125325le.A05(viewArr, false);
            }
        }
    }

    public final void A0P(boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (this.A0J != C05F.A00 && (viewGroup = this.A06) != null) {
            View[] viewArr = {viewGroup};
            if (z) {
                AbstractC125325le.A04(null, viewArr, z2);
            } else {
                AbstractC125325le.A05(viewArr, z2);
            }
        }
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        Integer num = this.A0J;
        if (num == C05F.A01 || num == C05F.A00 || obj != EnumC1810181d.A0j) {
            return true;
        }
        if (obj2 instanceof C188068Ux) {
            this.A0N = ((C188068Ux) obj2).A00;
        } else if (!(obj2 instanceof C188058Uw)) {
            if (!(obj2 instanceof C8UR)) {
                return true;
            }
            this.A0C.A01();
            return true;
        }
        return false;
    }

    @Override // X.C8LE
    public final void D63() {
        this.A0Y.A00().FCp(true);
        C88D c88d = this.A0X;
        AnonymousClass880 anonymousClass880 = c88d.A0J;
        if (anonymousClass880.A00().isVisible()) {
            AbstractC125325le.A04(null, new View[]{anonymousClass880.A00().getView()}, true);
            C8TS c8ts = c88d.A01;
            if (c8ts.A00.A0W(C81W.A0C)) {
                c8ts.A02.A0G.A0C(true);
            }
            C57012jc c57012jc = c88d.A0D;
            if (c57012jc.A04()) {
                AbstractC125325le.A04(null, new View[]{c57012jc.A01()}, true);
            }
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int i2;
        this.A01 = i;
        int i3 = 0;
        boolean z2 = false;
        if (i == 0) {
            z2 = true;
        }
        ConstrainedEditText constrainedEditText = this.A0D;
        if (constrainedEditText != null) {
            constrainedEditText.DOK(i, z);
            ConstrainedEditText constrainedEditText2 = this.A0D;
            C194918js c194918js = this.A0A;
            c194918js.getClass();
            int height = c194918js.A08.getHeight();
            if (z2) {
                i2 = this.A00;
            } else {
                i2 = 0;
            }
            constrainedEditText2.A01 = height;
            constrainedEditText2.A00 = i2;
            ConstrainedEditText.A00(constrainedEditText2);
            if (i > 0) {
                View view = this.A04;
                view.getClass();
                if (view.getVisibility() == 0 && this.A0D.getVisibility() == 0) {
                    if (this.A0a.A02) {
                        this.A0D.setAlpha(1.0f);
                    }
                    this.A0D.requestFocus();
                }
            }
        }
        if (z) {
            i3 = -i;
        }
        float f = i3;
        C188668Xg c188668Xg = this.A0C;
        C8TN c8tn = c188668Xg.A02;
        boolean z3 = true;
        boolean z4 = false;
        if (f != 0.0f) {
            z4 = true;
        }
        c8tn.A01 = z4;
        InterfaceC1810081c interfaceC1810081c = c8tn.A0N;
        if (interfaceC1810081c.AuH() == EnumC1810381f.A03 && interfaceC1810081c.AuG() != EnumC1810181d.A0j) {
            C8TN.A06(c8tn);
        }
        C184418Gf c184418Gf = c188668Xg.A05;
        if (f == 0.0f) {
            z3 = false;
        }
        c184418Gf.A01.Egh(Boolean.valueOf(z3));
        if (z2 && this.A0J == C05F.A01) {
            this.A0V.EFx(this);
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        if (drawable instanceof C6RB) {
            this.A0F = (C6RB) drawable;
            A09(this);
            A0K();
            return;
        }
        C88D c88d = this.A0X;
        if (!c88d.A09()) {
            return;
        }
        C88X A01 = c88d.A0H.A01();
        A01.getClass();
        ACt A012 = c88d.A01(A01);
        if (!(A012 instanceof C218009kY)) {
            return;
        }
        C218009kY c218009kY = (C218009kY) A012;
        C14360o3.A0B(drawable, 0);
        if (!(drawable instanceof C202438xN) || ((C202438xN) drawable).A09.A00.A02 != null) {
            return;
        }
        UserSession userSession = c218009kY.A08;
        AbstractC55215Oed.A03(c218009kY.A07, userSession, "CREATE_MODE_NULLSTATE");
        AbstractC226449z1.A00(c218009kY.A06, userSession).A00().A03(c218009kY.A05, c218009kY.A0A);
    }

    @Override // X.InterfaceC1829489p
    public final void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        ConstrainedEditText constrainedEditText;
        if (this.A0a.A02 && (constrainedEditText = this.A0D) != null && constrainedEditText.hasFocus()) {
            A03(this);
            return;
        }
        if (drawable == null) {
            this.A0F = null;
            A09(this);
            A0K();
            return;
        }
        if (drawable instanceof C6RB) {
            Dmk(drawable, i, f, f2);
            return;
        }
        C88D c88d = this.A0X;
        if (!c88d.A09()) {
            return;
        }
        C88X A01 = c88d.A0H.A01();
        A01.getClass();
        ACt A012 = c88d.A01(A01);
        if (A012 instanceof C218089kg) {
            C218089kg c218089kg = (C218089kg) A012;
            if (!drawable.equals(c218089kg.A02)) {
                return;
            }
            c218089kg.A00 = (c218089kg.A00 + 1) % c218089kg.A04.size();
            c218089kg.A0A();
            return;
        }
        if (A012 instanceof C218049kc) {
            C218049kc c218049kc = (C218049kc) A012;
            if (drawable != c218049kc.A03) {
                return;
            }
            int size = (c218049kc.A00 + 1) % c218049kc.A04.size();
            c218049kc.A00 = size;
            C218049kc.A00(C5GJ.CREATE_MODE_TAP_TO_CYCLE_SELECTION, c218049kc, size);
            return;
        }
        if (A012 instanceof C218059kd) {
            C218059kd c218059kd = (C218059kd) A012;
            C5GJ c5gj = C5GJ.CREATE_MODE_TAP_TO_CYCLE_SELECTION;
            c218059kd.A00 = (c218059kd.A00 + 1) % c218059kd.A06.size();
            C218059kd.A00(c5gj, c218059kd);
            return;
        }
        if (!(A012 instanceof C218119kj)) {
            return;
        }
        C218119kj c218119kj = (C218119kj) A012;
        if (!c218119kj.A02) {
            return;
        }
        C5GJ c5gj2 = C5GJ.CREATE_MODE_TAP_TO_CYCLE_SELECTION;
        int size2 = (c218119kj.A00 + 1) % c218119kj.A01.size();
        c218119kj.A00 = size2;
        C218119kj.A00(c5gj2, c218119kj, (AlC) c218119kj.A01.get(size2));
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvM(Object obj) {
        this.A0C.A01();
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvQ(Object obj) {
        if (obj == EnumC1810181d.A0j) {
            if (!this.A0N && this.A0J != C05F.A0j) {
                C188668Xg c188668Xg = this.A0C;
                CharSequence charSequence = this.A0I;
                TextColorScheme textColorScheme = this.A0E;
                View.OnTouchListener onTouchListener = this.A03;
                C190398bx c190398bx = (C190398bx) ((C8NW) c188668Xg.A03.A1h.get()).A1d.get();
                ConstrainedEditText constrainedEditText = c190398bx.A1j;
                AbstractC125325le.A04(null, new View[]{constrainedEditText}, true);
                constrainedEditText.setHint(charSequence);
                constrainedEditText.setOnTouchListener(onTouchListener);
                C150286pc c150286pc = c190398bx.A1g;
                AbstractC23116AHf.A02(constrainedEditText, ((C194918js) c150286pc.get()).A07());
                AbstractC23116AHf.A01(constrainedEditText, textColorScheme);
                AbstractC209689Pe.A07(constrainedEditText, ((C194918js) c150286pc.get()).A07(), c190398bx.A0L, ((C194918js) c150286pc.get()).A07().A06.A00 * 24.0f);
            } else {
                this.A0C.A01();
            }
            this.A0Z.E4u(new Object());
        }
    }

    @Override // X.InterfaceC1829589q
    public final void EGp(Canvas canvas, int i, boolean z, boolean z2) {
        this.A0c.draw(canvas);
    }

    @Override // X.InterfaceC1829589q
    public final boolean isVisible() {
        Integer num = this.A0J;
        if (num != C05F.A0C && num != C05F.A0N) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        Integer num = this.A0J;
        if (num != C05F.A01 && num != C05F.A00) {
            A03(this);
            this.A0d.onPause();
        }
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        Integer num = this.A0J;
        if (num != C05F.A01 && num != C05F.A00) {
            this.A0d.onResume();
        }
    }

    public C8LD(View view, View view2, ViewStub viewStub, UserSession userSession, C3I9 c3i9, CameraConfiguration cameraConfiguration, TargetViewSizeProvider targetViewSizeProvider, C88D c88d, C1814382v c1814382v, InterfaceC1810081c interfaceC1810081c, C81L c81l, DirectCameraViewModel directCameraViewModel, AnonymousClass878 anonymousClass878, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A0Z = interfaceC1810081c;
        this.A0d = anonymousClass878;
        this.A0Y = c1814382v;
        this.A0P = view.getContext();
        this.A0R = view;
        this.A0c = interactiveDrawableContainer;
        this.A0S = view2;
        this.A0T = viewStub;
        this.A0V = c3i9;
        this.A0U = userSession;
        this.A0a = c81l;
        this.A0b = directCameraViewModel;
        this.A0X = c88d;
        this.A0Q = view.findViewById(R.id.camera_shutter_button_container);
        this.A0W = targetViewSizeProvider;
        this.A0O = cameraConfiguration;
        A0H(this, C05F.A00);
    }

    public static void A01(Drawable drawable, C8LD c8ld) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        InteractiveDrawableContainer interactiveDrawableContainer = c8ld.A0c;
        int width = (interactiveDrawableContainer.getWidth() / 2) - (intrinsicWidth / 2);
        int height = (interactiveDrawableContainer.getHeight() / 2) - (intrinsicHeight / 2);
        drawable.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
    }

    public final void A0M(final InterfaceC25189BCm interfaceC25189BCm) {
        A03(this);
        if (!this.A0M) {
            this.A0M = true;
            if (this.A0J != C05F.A00) {
                A0H(this, C05F.A0Y);
            }
            AbstractC13880nE.A0q(this.A0R, new Runnable() { // from class: X.Aw9
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
                
                    if (r4.A05() != false) goto L72;
                 */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[ADDED_TO_REGION] */
                /* JADX WARN: Type inference failed for: r8v2, types: [X.0v1, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 539
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC24668Aw9.run():void");
                }
            });
        }
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLZ(boolean z, boolean z2) {
        return true;
    }
}
