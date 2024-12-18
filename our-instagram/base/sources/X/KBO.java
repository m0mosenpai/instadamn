package X;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class KBO extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoPostCaptureFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A02 = "potato_post_capture_fragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 8), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(KBO kbo, MN9 mn9) {
        File A11;
        Bitmap.CompressFormat compressFormat;
        boolean z;
        long j;
        if (mn9 instanceof C48620Lew) {
            if (((C48620Lew) mn9).A00) {
                j = 100;
                AbstractC13880nE.A0K(kbo.requireActivity());
            } else {
                j = 0;
            }
            kbo.requireView().postDelayed(new M09(kbo), j);
            return;
        }
        if (mn9 instanceof C48621Lex) {
            C48621Lex c48621Lex = (C48621Lex) mn9;
            Bitmap bitmap = c48621Lex.A00;
            Path path = c48621Lex.A01;
            String str = c48621Lex.A03;
            String str2 = c48621Lex.A04;
            String str3 = c48621Lex.A05;
            EnumC76383bi enumC76383bi = c48621Lex.A02;
            int dimensionPixelSize = AbstractC166997dE.A0N(kbo).getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
            Bitmap A0D = C1NC.A0D(new C44346Jil(bitmap, path, dimensionPixelSize, dimensionPixelSize));
            C14360o3.A07(A0D);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    z = true;
                    A11 = File.createTempFile("tmp_webp_", ".webp", kbo.requireContext().getCacheDir());
                } else {
                    z = false;
                    A11 = File.createTempFile("tmp_photo_", ".png", kbo.requireContext().getCacheDir());
                }
            } catch (IOException e) {
                C0K8.A0F("FileUtil", "failed to create temp file", e);
                A11 = AbstractC166987dD.A11("");
            }
            C14360o3.A0A(A11);
            if (z) {
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            } else {
                compressFormat = Bitmap.CompressFormat.PNG;
            }
            C1NC.A0L(compressFormat, A0D, A11, 100);
            C14360o3.A0B(A11, 0);
            AbstractC46697KlG.A00(kbo.requireContext(), kbo, C8IU.A03(A11, 1, 0), AbstractC166987dD.A0r(kbo.A00), str, str2, str3, enumC76383bi.A00);
            kbo.requireActivity().setResult(-1);
            AbstractC25227BEk.A1B(kbo);
            return;
        }
        if (mn9 instanceof C48622Ley) {
            AbstractC13880nE.A0O(kbo.requireView());
            AbstractC12990ll A0o = AbstractC166987dD.A0o(kbo.A00);
            FragmentActivity requireActivity = kbo.requireActivity();
            C14360o3.A0B(A0o, 0);
            AbstractC25225BEi.A0y(A0o).A00().A02(requireActivity, new C26721Br2());
            return;
        }
        throw B4Z.A00();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public KBO() {
        B8S b8s = new B8S(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8S(new B8S(this, 17), 18));
        this.A01 = AbstractC25225BEi.A0a(new B8S(A00, 19), b8s, new B61(44, null, A00), AbstractC25225BEi.A1D(C25851Bc6.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1197967906);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30192DRx(this, 28), -1567867171);
        C0f9.A09(1836161738, A02);
        return A00;
    }
}
