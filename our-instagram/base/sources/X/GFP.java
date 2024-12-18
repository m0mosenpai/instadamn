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
public final class GFP implements InterfaceC37180GZr {
    public final Context A00;
    public final UserSession A01;
    public final EnumC39551HdN A02;
    public final SavedCollection A03;
    public final FHN A04;
    public final String A05;
    public final boolean A06;

    public GFP(Context context, UserSession userSession, EnumC39551HdN enumC39551HdN, SavedCollection savedCollection, FHN fhn, String str, boolean z) {
        C14360o3.A0B(userSession, 2);
        AbstractC167017dG.A1T(enumC39551HdN, str);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = savedCollection;
        this.A04 = fhn;
        this.A02 = enumC39551HdN;
        this.A05 = str;
        this.A06 = z;
    }

    @Override // X.InterfaceC37180GZr
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_photo_grid_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setTitle(AbstractC166997dE.A0p(context, 2131972795));
        View view = A00.getView();
        AbstractC31172DnG.A1E(context.getResources(), view, 2131972796);
        return view;
    }

    @Override // X.InterfaceC37180GZr
    public final InterfaceC37211GaM ANG() {
        FB6.A00();
        String str = this.A01.token;
        EnumC39551HdN enumC39551HdN = this.A02;
        SavedCollection savedCollection = this.A03;
        String str2 = this.A05;
        boolean z = this.A06;
        C14360o3.A0B(str, 0);
        C38288GsX c38288GsX = new C38288GsX();
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", enumC39551HdN);
        A09.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A09.putString("prior_module", str2);
        A09.putBoolean(AbstractC111324zv.A00(1793), true);
        A09.putBoolean(AbstractC111324zv.A00(1792), z);
        c38288GsX.setArguments(A09);
        return c38288GsX;
    }

    @Override // X.InterfaceC37180GZr
    public final FHN C4n() {
        return this.A04;
    }
}
