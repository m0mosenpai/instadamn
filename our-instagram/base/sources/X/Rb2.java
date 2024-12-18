package X;

import android.content.Context;
import android.content.Intent;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class Rb2 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC69913Ca, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IdVerificationPhotoCaptureFragment";
    public Context A00;
    public android.net.Uri A01;
    public android.net.Uri A02;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public FragmentActivity A06;
    public AbstractC10360h2 A07;
    public UserSession A08;
    public IgdsBottomButtonLayout A09;
    public TF9 A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public TextView A0F;
    public boolean A0G;

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A06(this, intent, i);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        if (this.A0G) {
            C3LO c3lo = new C3LO();
            c3lo.A02(C05F.A09);
            c3lo.A0G = new ViewOnClickListenerC63507Soa(this, 20);
            Context context = this.A00;
            C14360o3.A0A(context);
            c3lo.A02 = context.getColor(AbstractC53242c7.A08(this.A00));
            interfaceC56362iU.AA9(new C3LY(c3lo));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "id_verification";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0E && this.A08 == null) {
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A00(Rb2 rb2) {
        if (rb2.A0E && rb2.A08 == null) {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        Context requireContext = rb2.requireContext();
        UserSession userSession = rb2.A08;
        if (userSession != null) {
            C69963Cf A00 = AbstractC69933Cc.A00(requireContext, userSession, rb2);
            EnumC69983Ch enumC69983Ch = EnumC69983Ch.A05;
            C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
            c43846JaA.A05 = false;
            c43846JaA.A0C = false;
            c43846JaA.A09 = false;
            c43846JaA.A0A = false;
            c43846JaA.A03 = false;
            c43846JaA.A0B = false;
            A00.Emz(EnumC33447EqK.A0J, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A08;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0E && this.A08 == null) {
            throw AbstractC166997dE.A0g();
        }
        return false;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        TF9 tf9 = this.A0A;
        C14360o3.A0A(tf9);
        tf9.A00(EnumC61065Ree.A04, EnumC61067Reg.A02, this.A0B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.Bitmap] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ?? r1;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent != null && intent.getAction() != null) {
            android.net.Uri A0I = AbstractC167007dF.A0I(intent.getAction());
            UserSession userSession = this.A08;
            if (userSession != null) {
                AbstractC50666MYj.A00(userSession).A09(AnonymousClass249.PHOTO, 15);
            }
            if (A0I != null) {
                ?? requireContext = requireContext();
                int round = Math.round(TypedValue.applyDimension(1, requireContext.getResources().getDimension(R.dimen.ar_effect_option_icon_size), AbstractC167007dF.A0K(requireContext)));
                try {
                    requireContext = ThumbnailUtils.extractThumbnail(MediaStore.Images.Media.getBitmap(requireContext.getContentResolver(), A0I), round, round);
                    if (requireContext != 0) {
                        if (this.A0D) {
                            r1 = this.A03;
                        } else {
                            r1 = this.A04;
                        }
                        C14360o3.A0A(r1);
                        r1.setImageBitmap(requireContext);
                        r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        boolean z = false;
                        r1.setPadding(0, 0, 0, 0);
                        r1.setColorFilter(null);
                        if (this.A0D) {
                            this.A01 = A0I;
                        } else {
                            this.A02 = A0I;
                        }
                        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
                        C14360o3.A0A(igdsBottomButtonLayout);
                        if (this.A01 != null && this.A02 != null) {
                            z = true;
                        }
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
                    }
                } catch (IOException unused) {
                    C9GR.A03(requireContext, requireContext.getString(2131974293), AbstractC43591JPw.A00(14), 0);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(-527932800);
        super.onCreate(bundle);
        this.A00 = requireContext();
        this.A08 = C023409i.A0A.A06(requireArguments());
        FragmentActivity requireActivity = requireActivity();
        this.A06 = requireActivity;
        C14360o3.A0A(requireActivity);
        this.A07 = requireActivity.getSupportFragmentManager();
        UserSession userSession = this.A08;
        C14360o3.A0A(userSession);
        this.A0A = new TF9(userSession);
        String string = requireArguments().getString("challenge_use_case");
        this.A0B = string;
        if (string == null || (!string.equals("idv_reactive") && !string.equals("ig_scraping"))) {
            z = true;
        } else {
            z = false;
        }
        this.A0G = z;
        requireArguments().getString("challenge_id");
        requireArguments().getString("av_session_id");
        requireArguments().getString("flow_id");
        this.A0C = requireArguments().getString("product_surface");
        this.A0E = "ig_age_verification_idv".equals(this.A0B);
        C0f9.A09(777839176, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-712276313);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_photo_capture_layout, viewGroup, false);
        this.A0F = AbstractC166997dE.A0T(inflate, R.id.capture_screen_description);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.capture_screen_description_link);
        this.A03 = AbstractC31173DnH.A0I(inflate, R.id.capture_screen_choose_photo_glyph_1);
        this.A04 = AbstractC31173DnH.A0I(inflate, R.id.capture_screen_choose_photo_glyph_2);
        this.A09 = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.id_verification_intro_next_button);
        ImageView imageView = this.A03;
        C14360o3.A0A(imageView);
        Context context = this.A00;
        C14360o3.A0A(context);
        boolean A1R = AbstractC167007dF.A1R(0, imageView, context);
        AbstractC31177DnL.A0p(context, imageView, AbstractC53242c7.A08(context));
        ImageView imageView2 = this.A04;
        C14360o3.A0A(imageView2);
        Context context2 = this.A00;
        C14360o3.A0A(context2);
        C14360o3.A0B(imageView2, 0);
        C14360o3.A0B(context2, A1R ? 1 : 0);
        AbstractC31177DnL.A0p(context2, imageView2, AbstractC53242c7.A08(context2));
        TextView textView = this.A05;
        C14360o3.A0A(textView);
        String A0v = AbstractC25227BEk.A0v(this, 2131969582);
        String string = getString(2131969581);
        FragmentActivity fragmentActivity = this.A06;
        C14360o3.A0A(fragmentActivity);
        AnonymousClass773.A07(new C46067KaO(this, fragmentActivity.getColor(AbstractC53242c7.A0C(this.A00))), textView, A0v, string);
        ImageView imageView3 = this.A03;
        C14360o3.A0A(imageView3);
        ViewOnClickListenerC63507Soa.A00(imageView3, 21, this);
        ImageView imageView4 = this.A04;
        C14360o3.A0A(imageView4);
        ViewOnClickListenerC63507Soa.A00(imageView4, 22, this);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        C14360o3.A0A(igdsBottomButtonLayout);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A09;
        C14360o3.A0A(igdsBottomButtonLayout2);
        igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new ViewOnClickListenerC63507Soa(this, 23));
        C0f9.A09(-1194275448, A02);
        return inflate;
    }
}
