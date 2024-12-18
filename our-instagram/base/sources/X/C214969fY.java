package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214969fY extends C53Z {
    public static final String __redex_internal_original_name = "CanvasTemplatesBottomSheetFragment";
    public C218089kg A00;
    public GradientDrawable A01;
    public TextColorScheme A02;
    public NestableRecyclerView A03;
    public List A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "canvas_templates_bottom_sheet_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1071178860);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST");
        serializable.getClass();
        this.A04 = (List) serializable;
        requireArguments.remove("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST");
        Parcelable parcelable = requireArguments.getParcelable("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        parcelable.getClass();
        this.A02 = (TextColorScheme) parcelable;
        requireArguments.remove("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        GradientDrawable.Orientation orientation = this.A02.A03;
        orientation.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A02.A01());
        this.A01 = gradientDrawable;
        gradientDrawable.setDither(true);
        this.A01.setCornerRadius(12.0f);
        C0f9.A09(924182792, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1799618911);
        View inflate = layoutInflater.inflate(R.layout.canvas_templates_bottom_sheet, viewGroup, false);
        C0f9.A09(-157503552, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.canvas_templates_bottom_sheet_list);
        this.A03 = nestableRecyclerView;
        nestableRecyclerView.getClass();
        NestableRecyclerView nestableRecyclerView2 = this.A03;
        nestableRecyclerView2.A05 = true;
        nestableRecyclerView2.A01 = false;
        this.A03.setAdapter(new C9UJ(this.A01, this, this, this.A04));
        this.A03.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        Context context = getContext();
        context.getClass();
        Resources resources = context.getResources();
        this.A03.A10(new C38379GuG(this, AbstractC166997dE.A09(resources), AbstractC166997dE.A05(resources), 2));
        this.A03.setPassThroughEdge(1);
    }
}
