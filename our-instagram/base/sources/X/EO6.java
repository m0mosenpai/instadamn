package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EO6 extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "AutoFollowBackBottomSheetFragment";
    public C34678FPn A00;
    public boolean A01;
    public final java.util.Set A02 = AbstractC31171DnF.A0l();
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "auto_follow_back_bottom_sheet";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.headline);
        igdsHeadline.setHeadline(getString(2131953366));
        igdsHeadline.setBody(getString(2131953365));
        int i = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.mArguments;
        if (i >= 33) {
            if (bundle2 != null) {
                parcelableArrayList = bundle2.getParcelableArrayList("auto_follow_back_list_data", AutoFollowBackBottomSheetData.class);
            } else {
                return;
            }
        } else if (bundle2 != null) {
            parcelableArrayList = bundle2.getParcelableArrayList("auto_follow_back_list_data");
        } else {
            return;
        }
        if (parcelableArrayList != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(parcelableArrayList);
            while (A13.hasNext()) {
                AutoFollowBackBottomSheetData autoFollowBackBottomSheetData = (AutoFollowBackBottomSheetData) A13.next();
                String str = autoFollowBackBottomSheetData.A01;
                String str2 = autoFollowBackBottomSheetData.A03;
                ImageUrl imageUrl = autoFollowBackBottomSheetData.A00;
                String str3 = autoFollowBackBottomSheetData.A02;
                A1E.add(new C32088E8m(imageUrl, new FJA(this, str3), str, str2));
                this.A02.add(str3);
            }
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && bundle3.getBoolean("auto_follow_back_system_setting_enabled", false)) {
                A1E.add(new C32086E8k(new C34436FGa(this), AbstractC25227BEk.A0v(this, 2131953375), AbstractC25227BEk.A0v(this, 2131953372)));
            }
            A0B(A1E);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37076GVl.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }
}
