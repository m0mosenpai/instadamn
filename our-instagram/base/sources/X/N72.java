package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;

/* loaded from: classes9.dex */
public class N72 extends AbstractC59962oe implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitInfoSheetFragment";
    public LinearLayout A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public RecyclerView A04;
    public IgSimpleImageView A05;
    public MediaKitInfoSheetConfig A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C57248PbW(this, 38));

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r1.A05 != null) goto L10;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N72.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final MediaKitInfoSheetConfig A00() {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig = this.A06;
        if (mediaKitInfoSheetConfig != null) {
            return mediaKitInfoSheetConfig;
        }
        C14360o3.A0F("mediaKitInfoSheetConfig");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A08.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig;
        int A02 = C0f9.A02(301325726);
        super.onCreate(bundle);
        if (this instanceof NPU) {
            mediaKitInfoSheetConfig = MediaKitInfoSheetConfig.A0E;
        } else {
            Parcelable parcelable = requireArguments().getParcelable("mk_info_sheet_config");
            if (parcelable != null) {
                mediaKitInfoSheetConfig = (MediaKitInfoSheetConfig) parcelable;
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("MediaKitInfoSheetConfig expected but was null");
                C0f9.A09(836732209, A02);
                throw A14;
            }
        }
        C14360o3.A0B(mediaKitInfoSheetConfig, 0);
        this.A06 = mediaKitInfoSheetConfig;
        C0f9.A09(-1643027817, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1279329042);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_info_sheet_fragment, viewGroup, false);
        C0f9.A09(1724931617, A02);
        return inflate;
    }
}
