package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;

/* renamed from: X.EHn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32229EHn extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SwitchProfileEducationFragment";
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(new MHI(this, 36), new MHI(this, 37), new C50171MDy(12, null, this), AbstractC25225BEi.A1D(C31788Dy7.class));
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "smart_glasses_sharing";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, this.A00);
        String username = A0g.getUsername();
        ImageUrl Bhu = A0g.Bhu();
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0S(view, R.id.headline);
        String str2 = null;
        String str3 = null;
        IgdsHeadline.A01(igdsHeadline, null).setUrl(Bhu, igdsHeadline);
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            str = AbstractC167007dF.A0f(context, username, 2131975066);
        } else {
            str = null;
        }
        igdsHeadline.setHeadline(str);
        View requireViewById = view.requireViewById(R.id.cancel_provider_linking);
        requireViewById.setEnabled(true);
        ViewOnClickListenerC35666Fp0.A00(requireViewById, 48, this);
        View requireViewById2 = view.requireViewById(R.id.next_button);
        requireViewById2.setEnabled(true);
        ViewOnClickListenerC35666Fp0.A00(requireViewById2, 49, this);
        if (A0g.A0M() == C05F.A01) {
            z = true;
        }
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) view.requireViewById(R.id.story_audience_cell);
        Context context2 = igdsBulletCell.getContext();
        if (z) {
            if (context2 != null) {
                str2 = context2.getString(2131974556);
                i = 2131974555;
                str3 = context2.getString(i);
            }
        } else if (context2 != null) {
            str2 = context2.getString(2131974554);
            i = 2131974553;
            str3 = context2.getString(i);
        }
        IgdsBulletCell.A00(igdsBulletCell, str2, str3);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1343700185);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_switching_education_fragment, false);
        C0f9.A09(725339562, A02);
        return A0R;
    }
}
