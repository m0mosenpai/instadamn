package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HBp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38918HBp extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AudioTranslationsStatusFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "auto_translations_status_bottomsheet";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.waveform_image_view);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A00);
        String A02 = AbstractC56412ia.A02(requireContext.getResources(), R.drawable.meta_ai_waveform_alpha);
        if (A02 == null) {
            A02 = "";
        }
        String valueOf = String.valueOf(R.drawable.meta_ai_waveform_alpha);
        C74P c74p = new C74P(requireContext, A0r, new C74V(-1, requireContext.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), AbstractC166997dE.A04(requireContext, R.dimen.audio_dubbing_gen_ai_gif_size)), C05F.A01, A02, valueOf, (String) null, 1.0f, requireContext.getColor(R.color.fds_transparent), requireContext.getColor(R.color.fds_transparent), false);
        c74p.A0A(1);
        A0D.setImageDrawable(c74p);
        AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(view, R.id.status_message), 2131953322);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1997173281);
        super.onCreate(bundle);
        C0f9.A09(-167966061, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1446291210);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.audio_translations_status_bottomsheet_layout, false);
        C0f9.A09(786968956, A02);
        return A0R;
    }
}
