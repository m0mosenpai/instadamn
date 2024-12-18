package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBT extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MagicMediaRemixTemplateFragment";
    public int A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C66362zD A04;
    public IgLinearLayout A05;
    public IgSimpleImageView A06;
    public IgSimpleImageView A07;
    public DirectThreadKey A08;
    public KZD A0C;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public String A09 = "";
    public String A0A = "";
    public ArrayList A0B = AbstractC166987dD.A1E();
    public final List A0D = AbstractC166987dD.A1E();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable("magic_media_remix_template_direct_thread_key");
        } else {
            parcelable = null;
        }
        Parcelable.Creator creator = DirectThreadKey.CREATOR;
        C14360o3.A08(creator);
        this.A08 = (DirectThreadKey) C0B1.A01(creator, parcelable, DirectThreadKey.class);
        this.A0C = AbstractC46790Kml.A00(AbstractC166987dD.A0r(this.A0E));
        this.A03 = AbstractC31172DnG.A0G(view, R.id.magic_media_remix_template_item_recycler_view);
        this.A04 = AbstractC31173DnH.A0R(C66362zD.A00(view.getContext()), new Object());
        RecyclerView recyclerView = this.A03;
        int i = 0;
        if (recyclerView != null) {
            AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
            C66362zD c66362zD = this.A04;
            if (c66362zD == null) {
                C14360o3.A0F("magicMediaRemixTemplateAdapter");
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c66362zD);
        }
        C80V c80v = new C80V();
        new JnW();
        c80v.A07(this.A03);
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                i = bundle3.getInt("magic_media_remix_template_position");
            }
            recyclerView2.A0n(i);
        }
        this.A09 = requireArguments().getString("magic_media_remix_template_layout_name", "");
        this.A0A = requireArguments().getString("magic_media_remix_template_rule_id", "");
        this.A00 = requireArguments().getInt("magic_media_remix_template_component_count");
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("magic_media_remix_template_bitmap_paths");
        C14360o3.A0C(stringArrayList, MSV.A00(114));
        this.A0B = stringArrayList;
        AbstractC166987dD.A1Z(new MCL((InterfaceC23621Ds) null, this, view, 0), AbstractC25229BEm.A0a(this));
    }

    public static final int A00(KBT kbt) {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView = kbt.A03;
        AbstractC70663Fe abstractC70663Fe2 = null;
        if (recyclerView != null) {
            abstractC70663Fe = recyclerView.A0D;
        } else {
            abstractC70663Fe = null;
        }
        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int A1c = ((LinearLayoutManager) abstractC70663Fe).A1c();
        if (A1c == -1) {
            RecyclerView recyclerView2 = kbt.A03;
            if (recyclerView2 != null) {
                abstractC70663Fe2 = recyclerView2.A0D;
            }
            C14360o3.A0C(abstractC70663Fe2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            return ((LinearLayoutManager) abstractC70663Fe2).A1a();
        }
        return A1c;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            AbstractC25231BEo.A16(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1058515951);
        C14360o3.A0B(layoutInflater, 0);
        AbstractC31174DnI.A0H(this).getDecorView().setSystemUiVisibility(1028);
        View inflate = layoutInflater.inflate(R.layout.magic_media_remix_template_layout, viewGroup, false);
        C0f9.A09(-672457817, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1410020781);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        C0f9.A09(-1433096011, A02);
    }
}
