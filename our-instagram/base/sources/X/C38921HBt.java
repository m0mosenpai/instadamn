package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HBt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38921HBt extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TranslatedAudioSelectionFragment";
    public C38310Gsw A00;
    public InterfaceC43431JGv A01;
    public String A02;
    public String A03;
    public boolean A05;
    public List A04 = C16930sl.A00;
    public final InterfaceC09390do A07 = AbstractC25225BEi.A0a(new C57515Pfp(this, 43), new C57515Pfp(this, 44), new D8J(36, null, this), AbstractC25225BEi.A1D(MVS.class));
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "translated_audio_selection_fragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, java.lang.Object, X.Gsw, android.view.ViewGroup] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String A0u;
        IgTextView igTextView;
        IgTextView igTextView2;
        IgTextView igTextView3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.audio_translations_enabled_group);
        List list = this.A04;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                Context A0L = AbstractC166997dE.A0L(view);
                View view2 = null;
                ?? linearLayout = new LinearLayout(A0L, null);
                View inflate = AbstractC25228BEl.A0P(linearLayout).inflate(R.layout.audio_translations_enabled_row, (ViewGroup) linearLayout);
                IgImageView igImageView = null;
                if ((inflate instanceof ViewGroup) && inflate != null) {
                    View requireViewById = inflate.requireViewById(R.id.language_name);
                    if (requireViewById instanceof IgTextView) {
                        igTextView = (IgTextView) requireViewById;
                    } else {
                        igTextView = null;
                    }
                    linearLayout.A00 = igTextView;
                    View requireViewById2 = inflate.requireViewById(R.id.now_playing_separator);
                    if (requireViewById2 instanceof IgTextView) {
                        igTextView2 = (IgTextView) requireViewById2;
                    } else {
                        igTextView2 = null;
                    }
                    linearLayout.A02 = igTextView2;
                    View requireViewById3 = inflate.requireViewById(R.id.now_playing_text);
                    if (requireViewById3 instanceof IgTextView) {
                        igTextView3 = (IgTextView) requireViewById3;
                    } else {
                        igTextView3 = null;
                    }
                    linearLayout.A01 = igTextView3;
                    View requireViewById4 = inflate.requireViewById(R.id.language_play_icon);
                    if (requireViewById4 instanceof IgImageView) {
                        igImageView = (IgImageView) requireViewById4;
                    }
                    linearLayout.A03 = igImageView;
                }
                if (A1B != null && A1B.length() != 0) {
                    A0u = AbstractC75373a4.A01(A1B);
                } else {
                    A0u = AbstractC25227BEk.A0u(A0L, 2131972091);
                }
                linearLayout.setLanguageName(A0u);
                String str = this.A03;
                boolean z = false;
                if (((A1B == null || A1B.length() == 0) && (str == null || str.length() == 0)) || C14360o3.A0K(A1B, str)) {
                    z = true;
                }
                linearLayout.setIsPlaying(z);
                if (z) {
                    this.A00 = linearLayout;
                }
                C0fQ.A00(new ViewOnClickListenerC41960Iir(linearLayout, this, A1B, 7), linearLayout);
                View requireViewById5 = linearLayout.requireViewById(R.id.language_more_button);
                if (requireViewById5 instanceof IgImageView) {
                    view2 = requireViewById5;
                }
                if (A1B != null && A1B.length() != 0 && this.A05) {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    Context context = getContext();
                    if (context != null && view2 != null) {
                        C0fQ.A00(new ViewOnClickListenerC41960Iir(context, this, A1B, 9), view2);
                    }
                } else {
                    linearLayout.setIconPadding(AbstractC167017dG.A0E(requireContext()));
                }
                A0C.addView(linearLayout);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2048465687);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("selected_audio_language_key");
            this.A04 = bundle2.getStringArrayList("available_audio_languages_key");
            this.A02 = bundle2.getString("media_id");
            this.A05 = bundle2.getBoolean("is_self_view");
        }
        C0f9.A09(-178759734, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-351658141);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.audio_translations_enabled_bottomsheet, false);
        C0f9.A09(1567522518, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1164798358);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(944206290, A02);
    }
}
