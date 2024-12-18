package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KDS extends AbstractC59962oe implements C51E {
    public static final String __redex_internal_original_name = "DirectReactionsPickerFragment";
    public C47974LIk A00;
    public InterfaceC50481MQj A01;
    public IgSegmentedTabLayout2 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final AnonymousClass987 A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_reactions_picker_fragment";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (requireArguments().getInt("fragment_thread_subtype", 0) == 29) {
            C44539Jmj c44539Jmj = (C44539Jmj) this.A04.getValue();
            ArrayList<String> stringArrayList = requireArguments().getStringArrayList("blocked_emojis_from_server");
            if (stringArrayList != null) {
                list = AbstractC001800i.A0a(stringArrayList);
            } else {
                list = C16930sl.A00;
            }
            C05A c05a = c44539Jmj.A06;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(C168157fA.A01(AbstractC166987dD.A1B(it)));
            }
            c05a.Egh(AbstractC001800i.A0j(C44539Jmj.A00(A1E)));
        }
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        C0eR c0eR = this.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        C57312k6 A00 = AbstractC57302k5.A00(c0eR);
        C47402Kwr c47402Kwr = new C47402Kwr(this);
        C44539Jmj c44539Jmj2 = (C44539Jmj) this.A04.getValue();
        boolean z = requireArguments().getBoolean("should_disable_reaction_edit_ability", false);
        String string = requireArguments().getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String string2 = requireArguments().getString("thread_v2_id");
        int i = requireArguments().getInt("audience_type", 0);
        boolean z2 = requireArguments().getBoolean("can_user_change_hidden_emoji", false);
        C47974LIk c47974LIk = new C47974LIk(requireContext, view, A00, this, A0r, c47402Kwr, c44539Jmj2, this.A02, string, string2, i, requireArguments().getInt("fragment_thread_subtype", 0), z, z2);
        this.A00 = c47974LIk;
        c47974LIk.A02();
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        C47974LIk c47974LIk = this.A00;
        if (c47974LIk == null) {
            C14360o3.A0F("reactionsPickerController");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A02(c47974LIk.A09);
    }

    public KDS() {
        C37056GUm c37056GUm = new C37056GUm(this, 27);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37056GUm(new C37056GUm(this, 28), 29));
        this.A04 = AbstractC25225BEi.A0a(new C37056GUm(A00, 30), c37056GUm, new MHU(36, null, A00), AbstractC25225BEi.A1D(C44539Jmj.class));
        this.A06 = new AnonymousClass987();
        this.A03 = C1XM.A00(new C37056GUm(this, 26));
        this.A05 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        int i = requireArguments().getInt("fragment_theme_override", 0);
        if (i != 0) {
            Context context = super.getContext();
            if (context != null) {
                return new ContextThemeWrapper(context, i);
            }
            throw AbstractC166997dE.A0g();
        }
        return super.getContext();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1462272855);
        C14360o3.A0B(layoutInflater, 0);
        this.A06.A02(viewGroup);
        if (requireArguments().getInt("fragment_theme_override", 0) != 0) {
            layoutInflater = layoutInflater.cloneInContext(requireContext());
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_reactions_picker, viewGroup, false);
        ViewGroup A0C = AbstractC31176DnK.A0C(inflate, R.id.emoji_list_fragment_container);
        A0C.setBackgroundColor(AbstractC53242c7.A0F(requireContext(), R.attr.elevatedBackgroundColor));
        AbstractC13880nE.A0s(A0C, new M1Q(A0C));
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int i = requireArguments().getInt("fragment_max_height");
        if (i >= 0) {
            i += C30D.A00;
        }
        layoutParams.height = i;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A05), 36326738900432960L)) {
            InterfaceC56392iX A0D = AbstractC37301Gc2.A0D(inflate, R.id.emoji_category_tabs_container_stub);
            this.A02 = (IgSegmentedTabLayout2) A0D.getView();
            A0D.getView().setBackgroundColor(AbstractC53242c7.A0F(requireContext(), R.attr.elevatedBackgroundColor));
            Number A0t = AbstractC43592JPx.A0t(this.A03);
            if (A0t != null) {
                AbstractC13880nE.A0Y(AbstractC166997dE.A0S(inflate, R.id.recycler_view), A0t.intValue());
            }
        }
        C0f9.A09(-1807779499, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1423223866);
        this.A06.A01();
        this.A02 = null;
        super.onDestroyView();
        C0f9.A09(877573695, A02);
    }
}
