package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.EIy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC32263EIy extends AbstractC59962oe implements DialogInterface.OnCancelListener, CallerContextable {
    public static final String __redex_internal_original_name = "FbShareFragment";
    public UserSession A00;
    public ShareLaterMedia A01;
    public boolean A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1599);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (!this.A02) {
            AbstractC25651Mw.A00(this.A00).E4s(new C36111Fwl(null, false, false));
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 132) {
            intent.getClass();
            String stringExtra = intent.getStringExtra("page_name");
            if (stringExtra != null) {
                ShareLaterMedia shareLaterMedia = this.A01;
                if (shareLaterMedia != null) {
                    EnumC53382NjX.A05.A08(shareLaterMedia, true);
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36328852024213325L)) {
                        AbstractC25651Mw.A00(this.A00).E4s(new C55999OtW(true));
                    }
                }
                this.A02 = true;
                AbstractC25651Mw.A00(this.A00).E4s(new C36111Fwl(stringExtra, true, false));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1833797910);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A01 = (ShareLaterMedia) requireArguments().getParcelable(MSV.A00(364));
        UserSession userSession = this.A00;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36318947829619495L)) {
            C14360o3.A0B(this.A00, 0);
            C35929Ftn c35929Ftn = new C35929Ftn(this, 3);
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getSupportFragmentManager().A0u(new C35758Fqv(c35929Ftn, 3), requireActivity, "page_linking_request");
        }
        C0f9.A09(-449589743, A02);
    }
}
