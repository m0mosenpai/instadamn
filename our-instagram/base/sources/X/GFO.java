package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class GFO implements InterfaceC37180GZr {
    public final Context A00;
    public final UserSession A01;
    public final SavedCollection A02;
    public final FHN A03;
    public final String A04;

    @Override // X.InterfaceC37180GZr
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setTitle(AbstractC166997dE.A0p(context, 2131972793));
        View view = A00.getView();
        AbstractC31172DnG.A1E(context.getResources(), view, 2131972794);
        return view;
    }

    public GFO(Context context, UserSession userSession, SavedCollection savedCollection, FHN fhn, String str) {
        AbstractC167017dG.A1R(userSession, savedCollection);
        C14360o3.A0B(str, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = savedCollection;
        this.A03 = fhn;
        this.A04 = str;
    }

    @Override // X.InterfaceC37180GZr
    public final InterfaceC37211GaM ANG() {
        FB6.A00();
        String str = this.A01.token;
        SavedCollection savedCollection = this.A02;
        String str2 = this.A04;
        C14360o3.A0B(str, 0);
        EnumC39551HdN enumC39551HdN = EnumC39551HdN.A06;
        HCZ hcz = new HCZ();
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A09.putString("prior_module", str2);
        A09.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", enumC39551HdN);
        hcz.setArguments(A09);
        return hcz;
    }

    @Override // X.InterfaceC37180GZr
    public final FHN C4n() {
        return this.A03;
    }
}
