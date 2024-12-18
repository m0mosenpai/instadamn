package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;

/* renamed from: X.Bre, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26757Bre extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PlaylistReelsTitleFragment";
    public EditText A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969684);
        interfaceC56362iU.Eha(ViewOnClickListenerC28662ClA.A00, R.drawable.instagram_check_pano_outline_24);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "playlist_reels_title_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.playlist_title_edittext);
        this.A00 = editText;
        if (editText == null) {
            C14360o3.A0F("titleEditText");
            throw C00O.createAndThrow();
        }
        editText.postDelayed(new D17(this), 500L);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-945582769);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_title, viewGroup, false);
        C0f9.A09(462331886, A02);
        return inflate;
    }
}
