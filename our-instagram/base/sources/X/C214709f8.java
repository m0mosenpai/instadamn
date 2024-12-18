package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9f8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214709f8 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CanvasMentionBottomSheetFragment";
    public A5N A00;
    public UserSession A01;
    public NestableRecyclerView A02;
    public List A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "canvas_mention_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-391688140);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC166987dD.A0r(AbstractC60492pY.A02(this));
        Serializable serializable = requireArguments.getSerializable("CanvasMentionBottomSheetFragment.MEDIA_LIST");
        serializable.getClass();
        this.A03 = (List) serializable;
        requireArguments.remove("CanvasMentionBottomSheetFragment.MEDIA_LIST");
        C0f9.A09(1011958528, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1409201825);
        View inflate = layoutInflater.inflate(R.layout.canvas_mention_bottom_sheet, viewGroup, false);
        C0f9.A09(438707976, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Resources A0N = AbstractC166997dE.A0N(this);
        int A09 = AbstractC166997dE.A09(A0N);
        int A05 = AbstractC166997dE.A05(A0N);
        this.A02 = (NestableRecyclerView) view.requireViewById(R.id.canvas_mention_bottom_sheet_list);
        this.A02.setAdapter(new C66415UGj(this.A01, this, this.A03));
        this.A02.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        this.A02.A10(new C38379GuG(this, A09, A05, 1));
        this.A02.setPassThroughEdge(1);
    }
}
