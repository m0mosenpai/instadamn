package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class N4C extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContextualPromoBottomSheetContentFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "BottomsheetPromoContentFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(DialogModule.KEY_TITLE);
        String string2 = requireArguments.getString("body");
        Bitmap bitmap = (Bitmap) requireArguments.getParcelable("illustration");
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.promo_headline);
        if (string != null) {
            igdsHeadline.setHeadline(string);
        }
        if (string2 != null) {
            igdsHeadline.setBody(string2);
        }
        if (bitmap != null) {
            igdsHeadline.setCircularImageBitmap(bitmap);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(473729015);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_bottomsheet_promo_content_fragment, false);
        C0f9.A09(-469354566, A02);
        return A0R;
    }
}
