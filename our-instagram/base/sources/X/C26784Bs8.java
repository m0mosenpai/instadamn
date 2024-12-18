package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.Bs8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26784Bs8 extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "ChannelEducationWeeklyGoalSelectorFragment";
    public ViewGroup A00;
    public IgdsButton A01;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A06 = "channel_education_weekly_goal_selector";
    public final List A02 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(new C37017GSy(this, 20), new C37017GSy(this, 21), new C50169MDw(40, this, null), AbstractC25225BEi.A1D(C25860BcF.class));
    public final InterfaceC16660sJ A05 = new MM0(this, 21);

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ViewGroup) view.requireViewById(R.id.goal_container);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.cta_button);
        this.A01 = igdsButton;
        if (igdsButton == null) {
            C14360o3.A0F("ctaButton");
            throw C00O.createAndThrow();
        }
        ViewOnClickListenerC28667ClF.A01(igdsButton, 60, this);
        C25860BcF c25860BcF = (C25860BcF) this.A04.getValue();
        C0UO c0uo = c25860BcF.A07;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        BY8.A00(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c0uo), new MM0(this, 22), 9);
        BY8.A00(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c25860BcF.A06), new C30172DRc(49, bundle, view, this), 9);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(163919234);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_channel_education_weekly_goal_selector, viewGroup, false);
        C0f9.A09(-400403072, A02);
        return inflate;
    }
}
