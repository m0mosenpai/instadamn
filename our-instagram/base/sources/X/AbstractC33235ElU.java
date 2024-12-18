package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;

/* renamed from: X.ElU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33235ElU extends AbstractC60672pq {
    public static final String __redex_internal_original_name = "IgMenuFragment";
    public AbstractC18680vv mSession;

    public boolean isElevated() {
        return false;
    }

    public static void A06(Context context, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new GHY(context, new ViewOnClickListenerC35686FpL(obj, i), i2));
    }

    public static void A08(Fragment fragment, InterfaceC56362iU interfaceC56362iU, int i) {
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Ehg(new C114795Gm(null, C3DY.A00(fragment.requireContext().getColor(AbstractC53242c7.A08(fragment.requireContext()))), null, null, null, null, C05F.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public static void A09(Object obj, AbstractCollection abstractCollection, int i, int i2, boolean z) {
        abstractCollection.add(new C36731GHa(new C35745Fqd(obj, i), i2, z));
    }

    public static List A05(UserSession userSession, C08730cb c08730cb) {
        return c08730cb.A01(userSession).A03.B1A();
    }

    public static void A07(android.net.Uri uri, Fragment fragment, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C35246Fgf(AnonymousClass773.A00(uri, str, fragment.getString(i, str))));
    }

    public int getBottomPadding() {
        return AbstractC167017dG.A0E(requireContext());
    }

    public int getItemPosition(Object obj) {
        return ((EPV) getAdapter()).getPosition(obj);
    }

    public int getTopPadding() {
        return AbstractC167017dG.A0E(requireContext());
    }

    @Override // X.AbstractC60672pq
    public Boolean getUseRecyclerViewFromQE() {
        return AbstractC166997dE.A0b();
    }

    public void notifyItemChanged(int i) {
        ((C2UU) getAdapter()).notifyItemChanged(i);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-160817365);
        super.onCreate(bundle);
        this.mSession = AbstractC31176DnK.A0R(this);
        setAdapter(new EPV(requireContext(), this.mSession, this));
        C0f9.A09(-221509986, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(902052602);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        if (isElevated()) {
            A0A.setBackgroundResource(AbstractC53242c7.A02(requireContext()));
        }
        C0f9.A09(-74569936, A02);
        return A0A;
    }

    @Override // X.AbstractC60672pq
    public void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC31174DnI.A0G(this).setPadding(0, getTopPadding(), 0, getBottomPadding());
        AbstractC31174DnI.A0G(this).setClipToPadding(false);
        C1UC activity = getActivity();
        if (activity instanceof C2d4) {
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            C2d4 c2d4 = (C2d4) activity;
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C14360o3.A0B(c2d4, 1);
            scrollingViewProxy.AAJ(new C71373Hy(c2d4, 0));
        }
    }

    public void scrollToPosition(int i) {
        getScrollingViewProxy().EmD(i);
    }

    public void setBottomSheetMenuItems(Collection collection) {
        ((EPV) getAdapter()).setBottomSheetMenuItems(collection);
    }

    public void setItems(Collection collection) {
        ((EPV) getAdapter()).setItems(collection);
    }
}
