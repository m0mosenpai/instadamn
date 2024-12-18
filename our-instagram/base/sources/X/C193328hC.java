package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.8hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193328hC {
    public static final InterfaceC11380iw A0d = new C19270xB("dialog_builder_module");
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public View A02;
    public C58652mO A03;
    public AbstractC12990ll A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public DialogInterface.OnCancelListener A0A;
    public DialogInterface.OnClickListener A0B;
    public DialogInterface.OnClickListener A0C;
    public DialogInterface.OnClickListener A0D;
    public DialogInterface.OnDismissListener A0E;
    public DialogInterface.OnShowListener A0F;
    public CharSequence A0G;
    public Integer A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public CharSequence[] A0N;
    public final int A0O;
    public final Dialog A0P;
    public final Context A0Q;
    public final Handler A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewGroup A0V;
    public final ViewStub A0W;
    public final FrameLayout A0X;
    public final ListView A0Y;
    public final IgdsHeadline A0Z;
    public final TextView A0a;
    public final TextView A0b;
    public final TextView A0c;

    public static final void A01(IgImageView igImageView, C193328hC c193328hC, int i, int i2, int i3) {
        float f = i;
        float f2 = i2;
        float f3 = 0.0f;
        if (f > 0.0f) {
            f3 = f2 / f;
        }
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        int dimensionPixelSize = c193328hC.A0Q.getResources().getDimensionPixelSize(i3);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = C1H4.A01(dimensionPixelSize * f3);
        igImageView.setLayoutParams(layoutParams);
    }

    public final void A03() {
        A0H(null, 2131954754);
    }

    public final void A04() {
        A0t(true);
    }

    public final void A06() {
        A0I(null, 2131954754);
    }

    public final void A07() {
        A0J(null, 2131968948);
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A08(int i) {
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        IgdsHeadline.A01(igdsHeadline, null).setImageDrawable(igdsHeadline.getContext().getDrawable(i));
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    public final void A0B(int i, int i2) {
        Context context = this.A0Q;
        String string = context.getString(i);
        C14360o3.A07(string);
        A0V(null, EnumC193348hE.A04, string, context.getString(i2), true);
    }

    public final void A0O(final DialogInterface.OnClickListener onClickListener, View view, TextView textView, EnumC193348hE enumC193348hE, String str, String str2, final int i, final boolean z) {
        Context context;
        int A0H;
        Context context2;
        int A0H2;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(textView, 1);
        view.setVisibility(0);
        textView.setText(str);
        AbstractC56952jT.A04(textView, C05F.A01);
        if (str2 != null) {
            textView.setContentDescription(str2);
        }
        if (enumC193348hE == EnumC193348hE.A02) {
            context2 = this.A0Q;
            A0H2 = C1QI.A01(context2);
        } else {
            if (enumC193348hE == EnumC193348hE.A03) {
                context = this.A0Q;
                A0H = C1QI.A01(context);
            } else if (enumC193348hE == EnumC193348hE.A05) {
                context2 = this.A0Q;
                A0H2 = AbstractC53242c7.A0H(context2, R.attr.igds_color_error_or_destructive);
            } else {
                if (enumC193348hE == EnumC193348hE.A06) {
                    int i2 = R.attr.igds_color_error_or_destructive;
                    context = this.A0Q;
                    Object systemService = context.getSystemService("accessibility");
                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    if (AbstractC56862jK.A02((AccessibilityManager) systemService, true) && C1H6.A03()) {
                        i2 = R.attr.igds_color_gradient_pink;
                    }
                    A0H = AbstractC53242c7.A0H(context, i2);
                }
                C0fQ.A00(new View.OnClickListener() { // from class: X.8hF
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int A05 = C0f9.A05(775255881);
                        DialogInterface.OnClickListener onClickListener2 = onClickListener;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this.A0P, i);
                        }
                        if (z) {
                            Dialog dialog = this.A0P;
                            if (dialog.isShowing()) {
                                try {
                                    dialog.dismiss();
                                } catch (Exception e) {
                                    C18950wb c18950wb = C18950wb.A01;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("NPE in Dismiss dialog=");
                                    sb.append(dialog);
                                    C0f5 AEp = c18950wb.AEp(sb.toString(), 245701013);
                                    AEp.ERI(e);
                                    AEp.report();
                                }
                            }
                        }
                        C0f9.A0C(-671618541, A05);
                    }
                }, view);
            }
            textView.setTextColor(context.getColor(A0H));
            textView.setTypeface(textView.getTypeface(), 1);
            C0fQ.A00(new View.OnClickListener() { // from class: X.8hF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int A05 = C0f9.A05(775255881);
                    DialogInterface.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this.A0P, i);
                    }
                    if (z) {
                        Dialog dialog = this.A0P;
                        if (dialog.isShowing()) {
                            try {
                                dialog.dismiss();
                            } catch (Exception e) {
                                C18950wb c18950wb = C18950wb.A01;
                                StringBuilder sb = new StringBuilder();
                                sb.append("NPE in Dismiss dialog=");
                                sb.append(dialog);
                                C0f5 AEp = c18950wb.AEp(sb.toString(), 245701013);
                                AEp.ERI(e);
                                AEp.report();
                            }
                        }
                    }
                    C0f9.A0C(-671618541, A05);
                }
            }, view);
        }
        textView.setTextColor(context2.getColor(A0H2));
        C0fQ.A00(new View.OnClickListener() { // from class: X.8hF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(775255881);
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(this.A0P, i);
                }
                if (z) {
                    Dialog dialog = this.A0P;
                    if (dialog.isShowing()) {
                        try {
                            dialog.dismiss();
                        } catch (Exception e) {
                            C18950wb c18950wb = C18950wb.A01;
                            StringBuilder sb = new StringBuilder();
                            sb.append("NPE in Dismiss dialog=");
                            sb.append(dialog);
                            C0f5 AEp = c18950wb.AEp(sb.toString(), 245701013);
                            AEp.ERI(e);
                            AEp.report();
                        }
                    }
                }
                C0f9.A0C(-671618541, A05);
            }
        }, view);
    }

    public final void A0Q(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0V(onClickListener, enumC193348hE, string, null, true);
    }

    public final void A0S(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0W(onClickListener, enumC193348hE, string, null, true);
    }

    public final void A0T(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, int i, int i2) {
        Context context = this.A0Q;
        String string = context.getString(i);
        C14360o3.A07(string);
        A0W(onClickListener, enumC193348hE, string, context.getString(i2), true);
    }

    public final void A0U(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, String str2, boolean z) {
        this.A0J = str;
        this.A0B = onClickListener;
        if (enumC193348hE == EnumC193348hE.A05 || enumC193348hE == EnumC193348hE.A06) {
            this.A0H = C05F.A01;
        }
        A0O(onClickListener, this.A0S, this.A0a, enumC193348hE, str, str2, -1, z);
    }

    public final void A0V(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, String str2, boolean z) {
        C14360o3.A0B(enumC193348hE, 4);
        this.A0K = str;
        this.A0C = onClickListener;
        A0O(onClickListener, this.A0T, this.A0b, enumC193348hE, str, str2, -2, z);
    }

    public final void A0W(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC193348hE, 4);
        this.A0L = str;
        this.A0D = onClickListener;
        if (enumC193348hE == EnumC193348hE.A05 || enumC193348hE == EnumC193348hE.A06) {
            this.A0I = C05F.A01;
        }
        A0O(onClickListener, this.A0U, this.A0c, enumC193348hE, str, str2, -1, z);
    }

    public final void A0X(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC193348hE, 3);
        A0U(onClickListener, enumC193348hE, str, null, z);
    }

    public final void A0Y(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC193348hE, 3);
        A0V(onClickListener, enumC193348hE, str, null, z);
    }

    public final void A0Z(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC193348hE, 3);
        A0W(onClickListener, enumC193348hE, str, null, z);
    }

    public final void A0a(final DialogInterface.OnClickListener onClickListener, CharSequence charSequence, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(charSequence, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        AbstractC010103p.A07(this.A0Z);
        Context context = this.A0Q;
        final int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_link));
        AnonymousClass773.A05(spannableStringBuilder, new AnonymousClass522(onClickListener, this, color) { // from class: X.9q7
            public final /* synthetic */ DialogInterface.OnClickListener A00;
            public final /* synthetic */ C193328hC A01;

            @Override // X.AnonymousClass522, android.text.style.ClickableSpan
            public final void onClick(View view) {
                C14360o3.A0B(view, 0);
                this.A00.onClick(this.A01.A0P, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(Integer.valueOf(color));
            }
        }, str);
        A0r(spannableStringBuilder);
    }

    public final void A0b(DialogInterface.OnClickListener onClickListener, String str) {
        C14360o3.A0B(str, 0);
        A0X(onClickListener, EnumC193348hE.A04, str, true);
    }

    public final void A0c(DialogInterface.OnClickListener onClickListener, String str) {
        C14360o3.A0B(str, 0);
        A0V(onClickListener, EnumC193348hE.A04, str, null, true);
    }

    public final void A0d(DialogInterface.OnClickListener onClickListener, String str) {
        C14360o3.A0B(str, 0);
        A0W(onClickListener, EnumC193348hE.A03, str, null, true);
    }

    @Deprecated(message = "Dialogs with more than three options should consider using an ActionSheet instead.")
    public final void A0f(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        C14360o3.A0B(charSequenceArr, 0);
        Context context = this.A0Q;
        EPV epv = new EPV(context, this.A04, A0d);
        epv.shouldCenterText = this.A06;
        this.A00 = onClickListener;
        ArrayList arrayList = new ArrayList();
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            CharSequence charSequence = charSequenceArr[i];
            if (charSequence == null) {
                charSequence = "";
            }
            arrayList.add(new GHY(context, new ViewOnClickListenerC23234ARs(this, i), charSequence));
        }
        epv.addDialogMenuItems(arrayList);
        ListView listView = this.A0Y;
        listView.setAdapter((ListAdapter) epv);
        listView.setVisibility(0);
        this.A0N = charSequenceArr;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0i(Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        this.A08 = true;
        C23692AeR c23692AeR = new C23692AeR(this);
        if (bitmap != null) {
            this.A0Z.setImageBitmap(bitmap, c23692AeR);
        } else {
            if (AbstractC81033jX.A03(imageUrl)) {
                return;
            }
            this.A0Z.setImageURL(imageUrl, interfaceC11380iw, c23692AeR);
        }
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0j(Drawable drawable) {
        this.A08 = true;
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPromoDialog", imports = {}))
    public final void A0k(Drawable drawable) {
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        IgdsHeadline.A00(igdsHeadline).setImageDrawable(drawable);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    public final void A0l(View view) {
        ViewGroup viewGroup = this.A0V;
        viewGroup.setVisibility(0);
        viewGroup.addView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "")
    public final void A0m(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(fragment, 1);
        this.A04 = abstractC12990ll;
        A0n((InterfaceC59992oh) fragment);
    }

    public final void A0n(InterfaceC59992oh interfaceC59992oh) {
        C14360o3.A0B(interfaceC59992oh, 0);
        interfaceC59992oh.registerLifecycleListener(new AbstractC60592pi() { // from class: X.9gZ
            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onDestroy() {
                C193328hC c193328hC = C193328hC.this;
                c193328hC.A0P.dismiss();
                c193328hC.A00 = null;
            }
        });
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0o(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        CircularImageView A01 = IgdsHeadline.A01(igdsHeadline, null);
        if (interfaceC11380iw == null) {
            interfaceC11380iw = igdsHeadline;
        }
        A01.setUrl(imageUrl, interfaceC11380iw);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0p(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A08 = true;
        IgImageView A00 = A00();
        Object parent = A00.getParent();
        C14360o3.A0C(parent, AbstractC111324zv.A00(2));
        A00.A0I = new C23704Aed(this, ((View) parent).getWidth());
        A00.setUrl(imageUrl, interfaceC11380iw);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0q(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        this.A08 = true;
        this.A0Z.setImageURL(imageUrl, interfaceC11380iw, new C23693AeS(this));
    }

    public final void A0t(boolean z) {
        this.A0M = true;
        this.A0P.setCanceledOnTouchOutside(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "See constructor that passes in an activity instead.")
    public C193328hC(Context context) {
        this(context, C2U8.A03 ? R.style.IigDialog : R.style.IigDialogDeprecated);
        if (context != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final IgImageView A00() {
        ViewStub viewStub = this.A0W;
        viewStub.setLayoutResource(R.layout.dialog_image);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ((ViewGroup.LayoutParams) marginLayoutParams).width = -1;
        ((ViewGroup.LayoutParams) marginLayoutParams).height = -2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        viewStub.setLayoutParams(marginLayoutParams);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(21));
        return (IgImageView) inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r3 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog A02() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193328hC.A02():android.app.Dialog");
    }

    public final void A09(int i) {
        A0r(this.A0Q.getString(i));
    }

    public final void A0A(int i) {
        this.A05 = this.A0Q.getString(i);
    }

    public final void A0C(DialogInterface.OnCancelListener onCancelListener) {
        this.A0A = onCancelListener;
        this.A0P.setOnCancelListener(onCancelListener);
    }

    public final void A0E(DialogInterface.OnClickListener onClickListener) {
        A0Q(onClickListener, EnumC193348hE.A04, 2131954754);
    }

    public final void A0G(DialogInterface.OnClickListener onClickListener) {
        A0R(onClickListener, EnumC193348hE.A06, 2131957640);
    }

    public final void A0H(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0b(onClickListener, string);
    }

    public final void A0I(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0c(onClickListener, string);
    }

    public final void A0J(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0d(onClickListener, string);
    }

    public final void A0K(DialogInterface.OnClickListener onClickListener, int i) {
        A0R(onClickListener, EnumC193348hE.A03, i);
    }

    public final void A0L(DialogInterface.OnClickListener onClickListener, int i) {
        A0R(onClickListener, EnumC193348hE.A06, i);
    }

    public final void A0M(DialogInterface.OnClickListener onClickListener, int i) {
        A0S(onClickListener, EnumC193348hE.A06, i);
    }

    public final void A0N(DialogInterface.OnClickListener onClickListener, int i, boolean z) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0X(onClickListener, EnumC193348hE.A04, string, z);
    }

    public final void A0P(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, int i) {
        String string = this.A0Q.getString(i);
        C14360o3.A07(string);
        A0X(onClickListener, enumC193348hE, string, true);
    }

    public final void A0e(DialogInterface.OnClickListener onClickListener, String str) {
        A0Z(onClickListener, EnumC193348hE.A04, str, true);
    }

    public final void A0g(DialogInterface.OnDismissListener onDismissListener) {
        this.A0E = onDismissListener;
        this.A0P.setOnDismissListener(onDismissListener);
    }

    public final void A0h(final DialogInterface.OnShowListener onShowListener) {
        this.A0F = onShowListener;
        this.A0P.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.8hD
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                WindowManager windowManager;
                C193328hC c193328hC = this;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = c193328hC.A0P.getWindow();
                if (window != null) {
                    layoutParams.copyFrom(window.getAttributes());
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    int height = (int) (window.getDecorView().getHeight() / Resources.getSystem().getDisplayMetrics().density);
                    Context context = c193328hC.A0Q;
                    if (context instanceof Activity) {
                        windowManager = ((Activity) context).getWindowManager();
                    } else {
                        Object systemService = context.getSystemService("window");
                        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        windowManager = (WindowManager) systemService;
                    }
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    int i = ((int) (displayMetrics.heightPixels / Resources.getSystem().getDisplayMetrics().density)) - 120;
                    if (height > i) {
                        ((ViewGroup.LayoutParams) layoutParams).height = (int) (i * Resources.getSystem().getDisplayMetrics().density);
                    }
                    window.setAttributes(layoutParams);
                    C58652mO c58652mO = c193328hC.A03;
                    if (c58652mO != null) {
                        c193328hC.A0R.postDelayed(new RunnableC24473Ass(c58652mO), 1000L);
                    }
                    DialogInterface.OnShowListener onShowListener2 = onShowListener;
                    if (onShowListener2 != null) {
                        onShowListener2.onShow(dialogInterface);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    public final void A0r(CharSequence charSequence) {
        if (charSequence != null) {
            this.A0G = charSequence;
            this.A0Z.setBody(charSequence);
        }
        this.A0Z.setVisibility(0);
        this.A09 = true;
    }

    public final void A0s(boolean z) {
        this.A0P.setCancelable(z);
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPromoDialog", imports = {}))
    public final void A05() {
        this.A08 = true;
        IgImageView A00 = A00();
        Context context = this.A0Q;
        Drawable drawable = context.getResources().getDrawable(R.drawable.clips_introduce_remix_camera_nux);
        if (drawable instanceof C3PR) {
            ((C3PR) drawable).A01(new C23699AeY(A00, this));
        } else {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.clips_introduce_remix_camera_nux);
            if (decodeResource != null) {
                A00.setImageDrawable(new C9Rz(decodeResource, null, this.A0O, 3));
            }
        }
        A00.setScaleType(ImageView.ScaleType.FIT_START);
        A00.setVisibility(0);
        this.A09 = true;
    }

    public final void A0D(DialogInterface.OnClickListener onClickListener) {
        A0I(onClickListener, 2131954754);
    }

    public final void A0F(DialogInterface.OnClickListener onClickListener) {
        A0J(onClickListener, 2131968948);
    }

    @Deprecated(message = "")
    public final void A0R(DialogInterface.OnClickListener onClickListener, EnumC193348hE enumC193348hE, int i) {
        A0S(onClickListener, enumC193348hE, i);
    }

    @Deprecated(message = "See constructor that passes in an activity instead.")
    public C193328hC(Context context, int i) {
        View inflate;
        this.A0Q = context;
        this.A0L = "";
        Integer num = C05F.A00;
        this.A0I = num;
        this.A0H = num;
        this.A0P = new Dialog(context, i);
        try {
            inflate = LayoutInflater.from(context).inflate(R.layout.igds_dialog_layout, (ViewGroup) null, false);
            this.A02 = inflate;
        } catch (InflateException e) {
            AbstractC53172bz.A03(this.A0Q, e);
            this.A0Q.getTheme().applyStyle(AbstractC53172bz.A00(), true);
            inflate = LayoutInflater.from(this.A0Q).inflate(R.layout.igds_dialog_layout, (ViewGroup) null, false);
            this.A02 = inflate;
        }
        this.A0P.setContentView(inflate);
        IgdsHeadline igdsHeadline = (IgdsHeadline) this.A02.requireViewById(R.id.panorama_dialog_headline);
        this.A0Z = igdsHeadline;
        igdsHeadline.setFocusable(false);
        this.A0V = (ViewGroup) this.A02.requireViewById(R.id.dialog_custom_header_view);
        this.A0X = (FrameLayout) this.A02.requireViewById(R.id.dialog_custom_subtitle_view);
        this.A0W = (ViewStub) this.A02.requireViewById(R.id.dialog_image_holder);
        this.A0U = this.A02.requireViewById(R.id.primary_button_row);
        this.A0S = this.A02.requireViewById(R.id.auxiliary_button_row);
        this.A0T = this.A02.requireViewById(R.id.negative_button_row);
        this.A0c = (TextView) this.A02.requireViewById(R.id.primary_button);
        this.A0a = (TextView) this.A02.requireViewById(R.id.auxiliary_button);
        this.A0b = (TextView) this.A02.requireViewById(R.id.negative_button);
        ListView listView = (ListView) this.A02.requireViewById(android.R.id.list);
        this.A0Y = listView;
        this.A0R = new Handler();
        listView.setVisibility(8);
        listView.setBackground(null);
        listView.setLayoutDirection(3);
        this.A0O = AbstractC53242c7.A0G(this.A0Q, R.attr.dialogCornerRadius);
        A0h(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C193328hC(Activity activity) {
        this(activity, R.style.IigDialog);
        if (activity != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
