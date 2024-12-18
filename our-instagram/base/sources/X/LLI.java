package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.qrcode.AutosizingGradientTextView;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

/* loaded from: classes8.dex */
public final class LLI {
    public View A00;
    public AutosizingGradientTextView A01;
    public AutosizingGradientTextView A02;
    public EnumC46212Kco A03;
    public final Context A04;
    public final Typeface A05;
    public final InterfaceC11380iw A06;
    public final C18920wW A07;
    public final ImageUrl A08;
    public final C47356Kw5 A09;
    public final MPL A0A;
    public final C44359Jiy A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final Long A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;
    public final boolean A0K;

    public LLI(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, C47356Kw5 c47356Kw5, MPL mpl, CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A04 = context;
        this.A07 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A06 = interfaceC11380iw;
        str2 = str2 == null ? "0" : str2;
        Long A0d = AbstractC167007dF.A0d();
        try {
            A0d = AbstractC166997dE.A0j(str2);
        } catch (NumberFormatException e) {
            C0K8.A0L("QRCodeDialogController", "failed to parse entity id: %s", e, str2);
        }
        this.A0E = A0d;
        this.A0G = str3;
        this.A08 = imageUrl;
        this.A0D = charSequence;
        this.A0C = charSequence2;
        this.A03 = EnumC46212Kco.A06;
        int A02 = AbstractC43593JPy.A02(context, 200);
        this.A0J = A02;
        Rect rect = new Rect(0, 0, A02, A02);
        this.A05 = AbstractC167017dG.A0S(this.A04);
        this.A0I = z;
        this.A0K = z2;
        this.A0A = mpl;
        this.A09 = c47356Kw5;
        this.A0H = imageUrl != null;
        try {
            android.net.Uri parse = android.net.Uri.parse(str4);
            Uri.Builder builder = new Uri.Builder();
            Iterator it = JQ0.A0o(builder, parse).iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                builder.appendQueryParameter(A1B, parse.getQueryParameter(A1B));
            }
            str4 = builder.build().toString();
        } catch (RuntimeException unused) {
            C0w9.A03("QRCodeDialogParseError", AnonymousClass001.A0R("failed url: ", str4));
        }
        this.A0F = str4;
        Integer num = C05F.A01;
        int i = this.A0J;
        int[] iArr = this.A03.A02;
        float f = i;
        LinearGradient linearGradient = new LinearGradient(0.0f, f, f, 0.0f, iArr[0], iArr[A1V ? 1 : 0], Shader.TileMode.CLAMP);
        C44359Jiy c44359Jiy = new C44359Jiy();
        c44359Jiy.invalidateSelf();
        c44359Jiy.A01 = num;
        C44359Jiy.A00(c44359Jiy);
        c44359Jiy.A07.setShader(linearGradient);
        c44359Jiy.invalidateSelf();
        c44359Jiy.setBounds(rect);
        c44359Jiy.A02 = str4;
        C44359Jiy.A00(c44359Jiy);
        this.A0B = c44359Jiy;
    }

    private final Bitmap A00() {
        View view = this.A00;
        if (view == null) {
            return null;
        }
        boolean z = this.A0H;
        int i = R.id.qr_code_background;
        if (z) {
            i = R.id.qr_code_layout;
        }
        View A0S = AbstractC166997dE.A0S(view, i);
        Bitmap A0F = AbstractC167007dF.A0F(A0S.getWidth(), A0S.getHeight());
        Canvas A06 = AbstractC43592JPx.A06(A0F);
        A06.translate(-A0S.getLeft(), -A0S.getTop());
        if (z) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.message);
            CharSequence text = A0N.getText();
            int currentTextColor = A0N.getCurrentTextColor();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, this.A03.A02);
            gradientDrawable.setDither(true);
            A0S.setBackgroundDrawable(gradientDrawable);
            EnumEntries enumEntries = EnumC46212Kco.A03;
            Iterator<E> it = enumEntries.iterator();
            while (it.hasNext()) {
                AbstractC167007dF.A0x(view.requireViewById(((EnumC46212Kco) it.next()).A01));
            }
            A0N.setText(2131971196);
            A0N.setTextColor(-1);
            A0S.draw(A06);
            A0S.setBackgroundDrawable(null);
            Iterator<E> it2 = enumEntries.iterator();
            while (it2.hasNext()) {
                View requireViewById = view.requireViewById(((EnumC46212Kco) it2.next()).A01);
                if (requireViewById != null) {
                    requireViewById.setVisibility(0);
                }
            }
            A0N.setText(text);
            A0N.setTextColor(currentTextColor);
            return A0F;
        }
        A0S.setVisibility(4);
        view.draw(A06);
        A0S.setVisibility(0);
        return A0F;
    }

    public static final void A01(View view, EnumC46212Kco enumC46212Kco, LLI lli) {
        lli.A03 = enumC46212Kco;
        for (EnumC46212Kco enumC46212Kco2 : EnumC46212Kco.A03) {
            View requireViewById = view.requireViewById(enumC46212Kco2.A01);
            if (requireViewById != null) {
                requireViewById.setSelected(AbstractC167007dF.A1X(enumC46212Kco2, lli.A03));
            }
        }
        int[] iArr = enumC46212Kco.A02;
        C44359Jiy c44359Jiy = lli.A0B;
        float f = lli.A0J;
        c44359Jiy.A07.setShader(new LinearGradient(0.0f, f, f, 0.0f, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        c44359Jiy.invalidateSelf();
        AutosizingGradientTextView autosizingGradientTextView = lli.A02;
        if (autosizingGradientTextView != null && !lli.A0H) {
            autosizingGradientTextView.setGradient(iArr);
        }
        AutosizingGradientTextView autosizingGradientTextView2 = lli.A01;
        if (autosizingGradientTextView2 != null && !lli.A0H) {
            autosizingGradientTextView2.setGradient(iArr);
        }
    }

    public static final void A03(LLI lli) {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = lli.A04;
            if (!AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C48291LYp c48291LYp = new C48291LYp(7, new CallableC44082Je7(lli, 6), lli);
                if (context instanceof Activity) {
                    AbstractC43592JPx.A1C((Activity) context, c48291LYp, "android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                }
                return;
            }
        }
        A02(lli);
    }

    public final void A05() {
        int i;
        int i2;
        String str;
        ImageUrl imageUrl;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A07, "ig_qr_code_impression");
        Long l = this.A0E;
        if (l != null && A0f.isSampled()) {
            long longValue = l.longValue();
            if (this.A0I) {
                longValue = 0;
            }
            A0f.A9K("entity_id", Long.valueOf(longValue));
            A0f.AAP(CacheBehaviorLogger.SOURCE, this.A06.getModuleName());
            A0f.Cht();
        }
        boolean z = this.A0H;
        int i3 = R.layout.qr_code_dialog_header_layout;
        if (z) {
            i3 = R.layout.qr_code_dialog_bc_header_layout;
        }
        Context context = this.A04;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) null);
        this.A00 = inflate;
        if (inflate != null) {
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.message);
            String str2 = this.A0G;
            if (str2 != null) {
                A0N.setText(str2);
                A0N.setVisibility(0);
            } else {
                A0N.setVisibility(8);
            }
            AbstractC31176DnK.A0D(inflate, R.id.qr_code).setImageDrawable(this.A0B);
            AvatarView avatarView = (AvatarView) inflate.findViewById(R.id.avatar);
            if (avatarView != null && (imageUrl = this.A08) != null) {
                avatarView.setAvatarUrl(imageUrl);
                avatarView.setStrokeWidth(AbstractC166997dE.A0D(context.getResources()));
                avatarView.setStrokeColor(AbstractC166997dE.A03(context));
            }
            for (EnumC46212Kco enumC46212Kco : EnumC46212Kco.A03) {
                ImageView A0I = AbstractC31173DnH.A0I(inflate, enumC46212Kco.A01);
                C44352Jir c44352Jir = new C44352Jir(inflate.getContext());
                c44352Jir.A00 = enumC46212Kco.A02;
                c44352Jir.invalidateSelf();
                if (A0I != null) {
                    A0I.setImageDrawable(c44352Jir);
                    Resources resources = A0I.getResources();
                    if (resources != null) {
                        str = resources.getString(enumC46212Kco.A00);
                    } else {
                        str = null;
                    }
                    A0I.setContentDescription(str);
                    ViewOnClickListenerC48068LPt.A00(A0I, this, inflate, enumC46212Kco, 39);
                }
            }
            AutosizingGradientTextView autosizingGradientTextView = (AutosizingGradientTextView) inflate.requireViewById(R.id.title);
            this.A02 = autosizingGradientTextView;
            CharSequence charSequence = this.A0D;
            int i4 = 14;
            if (charSequence != null) {
                if (z) {
                    Drawable drawable = context.getDrawable(R.drawable.instagram_channels_broadcast_pano_filled_24);
                    int A0F = AbstractC167017dG.A0F(context);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, A0F, A0F);
                    }
                    AutosizingGradientTextView autosizingGradientTextView2 = this.A02;
                    if (autosizingGradientTextView2 != null) {
                        autosizingGradientTextView2.setCompoundDrawables(drawable, null, null, null);
                    }
                    AutosizingGradientTextView autosizingGradientTextView3 = this.A02;
                    if (autosizingGradientTextView3 != null) {
                        autosizingGradientTextView3.setCompoundDrawablePadding(AbstractC167017dG.A04(context));
                    }
                    i2 = 16;
                } else {
                    if (autosizingGradientTextView != null) {
                        autosizingGradientTextView.setTypeface(this.A05);
                    }
                    AutosizingGradientTextView autosizingGradientTextView4 = this.A02;
                    if (autosizingGradientTextView4 != null) {
                        autosizingGradientTextView4.setGradient(this.A03.A02);
                    }
                    i2 = 40;
                }
                AutosizingGradientTextView autosizingGradientTextView5 = this.A02;
                if (autosizingGradientTextView5 != null) {
                    int A02 = AbstractC43593JPy.A02(context, 14);
                    int A022 = AbstractC43593JPy.A02(context, i2);
                    autosizingGradientTextView5.A01 = A02;
                    autosizingGradientTextView5.A00 = A022;
                }
                AutosizingGradientTextView autosizingGradientTextView6 = this.A02;
                if (autosizingGradientTextView6 != null) {
                    autosizingGradientTextView6.setText(charSequence);
                }
                AutosizingGradientTextView autosizingGradientTextView7 = this.A02;
                if (autosizingGradientTextView7 != null) {
                    autosizingGradientTextView7.setVisibility(0);
                }
            } else if (autosizingGradientTextView != null) {
                autosizingGradientTextView.setVisibility(8);
            }
            AutosizingGradientTextView autosizingGradientTextView8 = (AutosizingGradientTextView) inflate.requireViewById(R.id.subtitle);
            this.A01 = autosizingGradientTextView8;
            CharSequence charSequence2 = this.A0C;
            if (charSequence2 != null) {
                if (!z) {
                    if (autosizingGradientTextView8 != null) {
                        autosizingGradientTextView8.setTypeface(this.A05);
                    }
                    AutosizingGradientTextView autosizingGradientTextView9 = this.A01;
                    if (autosizingGradientTextView9 != null) {
                        autosizingGradientTextView9.setGradient(this.A03.A02);
                    }
                    i = 14;
                    i4 = 20;
                } else {
                    i = 10;
                }
                AutosizingGradientTextView autosizingGradientTextView10 = this.A01;
                if (autosizingGradientTextView10 != null) {
                    int A023 = AbstractC43593JPy.A02(context, i);
                    int A024 = AbstractC43593JPy.A02(context, i4);
                    autosizingGradientTextView10.A01 = A023;
                    autosizingGradientTextView10.A00 = A024;
                }
                AutosizingGradientTextView autosizingGradientTextView11 = this.A01;
                if (autosizingGradientTextView11 != null) {
                    autosizingGradientTextView11.setText(charSequence2);
                }
                AutosizingGradientTextView autosizingGradientTextView12 = this.A01;
                if (autosizingGradientTextView12 != null) {
                    autosizingGradientTextView12.setVisibility(0);
                }
            } else if (autosizingGradientTextView8 != null) {
                autosizingGradientTextView8.setVisibility(8);
            }
            A01(inflate, EnumC46212Kco.A06, this);
            C193328hC A0I2 = AbstractC31171DnF.A0I(context);
            A0I2.A0l(inflate);
            A0I2.A09 = true;
            A0I2.A0t(true);
            DialogInterfaceOnClickListenerC48023LMs A00 = DialogInterfaceOnClickListenerC48023LMs.A00(this, 67);
            DialogInterfaceOnClickListenerC48023LMs A002 = DialogInterfaceOnClickListenerC48023LMs.A00(this, 66);
            DialogInterfaceOnClickListenerC48023LMs A003 = DialogInterfaceOnClickListenerC48023LMs.A00(this, 65);
            if (this.A0K) {
                A0I2.A0J(A00, 2131971199);
                A0I2.A0H(A002, 2131971195);
                A0I2.A0I(A003, 2131961124);
            } else {
                A0I2.A0J(A002, 2131971195);
                A0I2.A0H(A003, 2131961124);
            }
            AbstractC166987dD.A1W(A0I2);
        }
    }

    public static final void A02(LLI lli) {
        Bitmap A00 = lli.A00();
        if (A00 != null) {
            C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(19, A00, lli), 1775937301);
            C43922JbX.A01(c121275eQ, lli, 21);
            C1GJ.A03(c121275eQ);
        }
    }

    public static final void A04(LLI lli) {
        Bitmap A00 = lli.A00();
        if (A00 != null) {
            boolean A1Z = AbstractC43593JPy.A1Z(Build.VERSION.SDK_INT, 30);
            C121275eQ c121275eQ = new C121275eQ(new B1O(1, A00, lli, A1Z), 759274554);
            c121275eQ.A00 = new C45686KJx(lli, A1Z);
            C1GJ.A04(c121275eQ, 759274554);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LLI(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MPL mpl, String str, String str2, String str3, String str4, String str5, boolean z) {
        this(context, interfaceC11380iw, userSession, null, null, mpl, str4, str5, str, str2, str3, z, false);
        AbstractC167027dH.A0a(1, context, userSession, interfaceC11380iw, str);
    }
}
