package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BrP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26743BrP extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BarcelonaIgFragment";
    public final String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC25225BEi.A15(this.A04);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C26743BrP() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C50150MDd(this, 8));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C50150MDd(this, 7));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C50150MDd(this, 11));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C50150MDd(this, 9));
        this.A00 = AbstractC111324zv.A00(4670);
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C50150MDd(this, 10));
        this.A05 = AbstractC60492pY.A02(this);
    }

    public static final void A00(C26743BrP c26743BrP) {
        FragmentActivity requireActivity = c26743BrP.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(c26743BrP.A05);
        User user = (User) c26743BrP.A03.getValue();
        C29102CsT c29102CsT = new C29102CsT(requireActivity, c26743BrP);
        C35135Fec c35135Fec = C35135Fec.A00;
        AbstractC167017dG.A1O(A0r, user);
        c35135Fec.A01(requireActivity, c29102CsT, A0r, user, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-902283021);
        C14360o3.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        ComposeView composeView = new ComposeView(context, null, 0);
        composeView.setContent(C5UA.A03(C30480DbP.A00(this, 31), -1274811315));
        C0f9.A09(413896972, A02);
        return composeView;
    }
}
