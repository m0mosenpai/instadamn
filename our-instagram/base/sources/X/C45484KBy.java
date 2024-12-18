package X;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.KBy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45484KBy extends AbstractC59962oe implements InterfaceC60112ot {
    public static final String __redex_internal_original_name = "DirectClipsPreviewFragment";
    public TextView A00;
    public VideoView A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public IgTextView A06;
    public CircularImageView A07;
    public IgdsButton A08;
    public String A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final String A0B = "direct_clips_preview_fragment";
    public final boolean A0C = true;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Integer num = C05F.A00;
        int color = requireContext().getColor(R.color.fds_transparent);
        int color2 = requireContext().getColor(AbstractC53242c7.A0A(getContext()));
        Drawable drawable = requireContext().getDrawable(R.drawable.clips_viewer_action_bar_gradient_background);
        interfaceC56362iU.Efu(2131955670);
        interfaceC56362iU.EkT(ViewOnClickListenerC48072LPx.A00(this, 10), true);
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, drawable, null, null, num, color2, color, -2, -2, -2, -2, -2, false));
        C30D.A04(requireActivity(), requireActivity().getColor(R.color.black));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        if (r11 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45484KBy.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C45484KBy c45484KBy) {
        C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
        Context applicationContext = c45484KBy.requireContext().getApplicationContext();
        C14360o3.A0C(applicationContext, AbstractC111324zv.A00(19));
        ClipsDraftPreviewItemRepository A00 = c2ow.A00((Application) applicationContext, AbstractC166987dD.A0r(c45484KBy.A0A));
        String str = c45484KBy.A03;
        if (str != null) {
            A00.A01(str, new GWH(c45484KBy, 25));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A0C;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        IllegalStateException A14;
        int i;
        String string;
        String str2;
        int A02 = C0f9.A02(-2101104875);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString("direct_clips_preview_cdn_url");
        } else {
            str = null;
        }
        if (str != null) {
            this.A04 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (string = bundle3.getString("direct_clips_preview_author_id")) != null) {
                this.A09 = string;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    str2 = bundle4.getString("direct_clips_preview_audio_cluster_id");
                } else {
                    str2 = null;
                }
                this.A02 = str2;
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null) {
                    str3 = bundle5.getString("direct_clips_preview_draft_id");
                }
                this.A03 = str3;
                Bundle bundle6 = this.mArguments;
                if (bundle6 != null) {
                    boolean z = bundle6.getBoolean("direct_clips_preview_should_mute");
                    if (Boolean.valueOf(z) != null) {
                        this.A05 = z;
                        C0f9.A09(1361961758, A02);
                        return;
                    }
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1712704922;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1321702826;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -920887480;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-210142248);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_clips_preview, viewGroup, false);
        C0f9.A09(-149096737, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1528634344);
        super.onDestroyView();
        this.A08 = null;
        this.A06 = null;
        C0f9.A09(-16080779, A02);
    }
}
