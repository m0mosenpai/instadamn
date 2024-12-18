package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EN6 extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "BroadcastFollowStepBottomSheetFragment";
    public C142846ck A00;
    public C34416FFg A01;
    public boolean A02;
    public String A03;
    public final InterfaceC09390do A04 = C1XM.A00(new C37017GSy(this, 18));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18A A0h = AbstractC31176DnK.A0h(this.A05);
        String string = requireArguments().getString("arg_key_creator_user_id");
        String string2 = requireArguments().getString("arg_key_thread_id");
        User A02 = A0h.A02(string);
        if (A02 != null) {
            IgImageView A0T = AbstractC167007dF.A0T(view, R.id.follow_sheet_avatar);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.follow_sheet_title);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.follow_sheet_subtitle);
            View A0S = AbstractC166997dE.A0S(view, R.id.follow_sheet_button);
            AbstractC31173DnH.A1T(this, A0T, A02);
            AbstractC31177DnL.A10(A0N, this, A02.getUsername(), 2131954291);
            AbstractC31177DnL.A10(A0N2, this, A02.getUsername(), 2131954290);
            C0fQ.A00(new ViewOnClickListenerC35673Fp8(A02, this, A0S, string2, 1), A0S);
            C47910LEe c47910LEe = (C47910LEe) this.A04.getValue();
            c47910LEe.A00.markerPoint(31786177, "Follow_Prompt_Shown");
            C47910LEe.A00(c47910LEe, (short) 2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        String str;
        boolean z = this.A02;
        if (!z) {
            C142846ck c142846ck = this.A00;
            if (c142846ck == null) {
                str = "broadcastLogger";
            } else {
                EnumC33373Ep6 enumC33373Ep6 = EnumC33373Ep6.A0L;
                String str2 = this.A03;
                if (str2 == null) {
                    str = "threadId";
                } else {
                    c142846ck.A0G(enumC33373Ep6, str2, 0, z);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1432256371);
        super.onCreate(bundle);
        this.A03 = AbstractC153636vY.A01(requireArguments(), "arg_key_thread_id");
        this.A00 = AbstractC31176DnK.A0V(this.A05);
        C0f9.A09(-1981117614, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1164867906);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.broadcast_follow_step_fragment, viewGroup, false);
        C0f9.A09(-379269237, A02);
        return inflate;
    }
}
