package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.user.model.User;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EKV extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ConnectContentFragment";
    public AbstractC18680vv A00;
    public EnumC33360Eot A01;
    public ConnectContent A02;
    public Integer A03;
    public boolean A04 = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "signup_account";
    }

    private Drawable A00(String str) {
        Context requireContext;
        int i;
        Locale locale = Locale.US;
        if (!AbstractC13670mt.A0G(str.toLowerCase(locale), FxcalAccountType.A05.toString().toLowerCase(locale)) && AbstractC13670mt.A0G(str.toLowerCase(locale), FxcalAccountType.A04.toString().toLowerCase(locale))) {
            requireContext = requireContext();
            i = R.drawable.fb_badge_color_logo;
        } else {
            requireContext = requireContext();
            i = R.drawable.ig_badge_color_logo;
        }
        return requireContext.getDrawable(i);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    private void A01(View view, AbstractC18680vv abstractC18680vv) {
        String username;
        FxAccountInfo fxAccountInfo = this.A02.A02;
        FxAccountInfo fxAccountInfo2 = fxAccountInfo;
        if (fxAccountInfo == null) {
            User A10 = AbstractC166987dD.A10((UserSession) abstractC18680vv);
            String obj = FxcalAccountType.A05.toString();
            if (!TextUtils.isEmpty(A10.getFullName())) {
                username = A10.getFullName();
            } else {
                username = A10.getUsername();
            }
            ImageUrl Bhu = A10.Bhu();
            ?? obj2 = new Object();
            obj2.A01 = obj;
            obj2.A02 = username;
            obj2.A00 = Bhu;
            obj2.A03 = obj;
            fxAccountInfo2 = obj2;
        }
        IgImageView igImageView = (IgImageView) AbstractC31173DnH.A0D(view, R.id.avatar_container);
        ImageUrl imageUrl = fxAccountInfo2.A00;
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, this);
        } else {
            AbstractC166997dE.A19(requireContext(), igImageView, R.drawable.profile_anonymous_user);
        }
        ((ImageView) AbstractC31173DnH.A0D(view, R.id.badge_container)).setImageDrawable(A00(fxAccountInfo2.A01));
        TextView A09 = AbstractC31175DnJ.A09(view, R.id.accountTitle);
        String str = fxAccountInfo2.A02;
        str.getClass();
        A09.setText(str);
        AbstractC31175DnJ.A09(view, R.id.accountSubtitle).setText(fxAccountInfo2.A03);
    }

    public final EnumC31713DwI A02() {
        int ordinal = this.A01.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return EnumC31713DwI.A0z;
                    }
                    return EnumC31713DwI.A13;
                }
                return EnumC31713DwI.A0R;
            }
            return EnumC31713DwI.A0K;
        }
        return EnumC31713DwI.A0N;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A04) {
            AbstractC18680vv abstractC18680vv = this.A00;
            String obj = EnumC33360Eot.A05.toString();
            AbstractC167017dG.A1N(abstractC18680vv, obj);
            C35191Ffj.A00(abstractC18680vv, "link_accounts_screen_closed", obj);
        }
        EnumC33360Eot enumC33360Eot = this.A01;
        if (enumC33360Eot != null && enumC33360Eot != EnumC33360Eot.A05) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC31176DnK.A0R(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r2 != X.EnumC33360Eot.A05) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -485860353(0xffffffffe30a5bff, float:-2.5522797E21)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r5)
            X.0vv r0 = X.AbstractC31176DnK.A0R(r4)
            r4.A00 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.instagram.nux.cal.model.ConnectContent r0 = (com.instagram.nux.cal.model.ConnectContent) r0
            r4.A02 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.AbstractC31173DnH.A0j(r1, r0)
            java.lang.Integer r0 = X.AbstractC34254F9a.A00(r0)
            r4.A03 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r2 = r1.getSerializable(r0)
            X.Eot r2 = (X.EnumC33360Eot) r2
            r4.A01 = r2
            if (r2 == 0) goto L46
            X.Eot r1 = X.EnumC33360Eot.A05
            r0 = 1
            if (r2 == r1) goto L47
        L46:
            r0 = 0
        L47:
            r4.A04 = r0
            r0 = 1980528907(0x760c790b, float:7.1228184E32)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKV.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKV.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
