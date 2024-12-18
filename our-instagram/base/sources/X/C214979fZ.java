package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214979fZ extends C53Z {
    public static final String __redex_internal_original_name = "CanvasMemoriesBottomSheetFragment";
    public C218059kd A00;
    public GradientDrawable A01;
    public TextColorScheme A02;
    public NestableRecyclerView A03;
    public HashMap A04 = AbstractC166987dD.A1G();
    public List A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "canvas_memories_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession session = getSession();
        List list = this.A05;
        C9UK c9uk = new C9UK(this.A01, session, this, this.A04, list);
        View findViewById = view.findViewById(R.id.canvas_memories_bottom_sheet_list);
        findViewById.getClass();
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) findViewById;
        this.A03 = nestableRecyclerView;
        nestableRecyclerView.A05 = true;
        nestableRecyclerView.A01 = false;
        nestableRecyclerView.setAdapter(c9uk);
        this.A03.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        Resources A0N = AbstractC166997dE.A0N(this);
        this.A03.A10(new C38379GuG(this, AbstractC166997dE.A09(A0N), AbstractC166997dE.A05(A0N), 0));
        this.A03.setPassThroughEdge(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1654672798);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("CanvasTemplatesBottomSheetFragment.MEMORIES_LIST");
        serializable.getClass();
        this.A05 = (List) serializable;
        Parcelable parcelable = requireArguments.getParcelable("CanvasMemoriesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        parcelable.getClass();
        this.A02 = (TextColorScheme) parcelable;
        Serializable serializable2 = requireArguments.getSerializable("CanvasMemoriesBottomSheetFragment.ARG_MEDIUM_MAP");
        serializable2.getClass();
        this.A04 = (HashMap) serializable2;
        GradientDrawable.Orientation orientation = this.A02.A03;
        orientation.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A02.A01());
        this.A01 = gradientDrawable;
        gradientDrawable.setDither(true);
        this.A01.setCornerRadius(12.0f);
        C0f9.A09(-1039209775, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1353846819);
        View inflate = layoutInflater.inflate(R.layout.canvas_memories_bottom_sheet, viewGroup, false);
        C0f9.A09(1034445715, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1254384265);
        super.onPause();
        C3DN A01 = C3DN.A00.A01(getContext());
        if (A01 != null) {
            A01.A0B();
        }
        C0f9.A09(-893066174, A02);
    }
}
