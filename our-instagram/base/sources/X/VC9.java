package X;

import android.graphics.RectF;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class VC9 extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ExploreShareGridFragment";
    public int A00;
    public RectF A01;
    public File A02;
    public File A03;
    public List A04;
    public final InterfaceC25214BDm A05 = new C23765Afc(this, 6);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "explore_grid_share";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1121494374);
        super.onCreate(bundle);
        float A01 = AbstractC13890nF.A01(requireContext());
        float A00 = AbstractC13890nF.A00(requireContext());
        RectF rectF = new RectF(0.0f, 0.0f, A01, A00);
        rectF.offsetTo(0.0f, A00);
        this.A01 = rectF;
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("string_list");
        AbstractC153636vY.A03(requireArguments, stringArrayList, "string_list");
        this.A04 = stringArrayList;
        this.A03 = new File(AbstractC153636vY.A01(requireArguments(), "explore_grid_file"));
        this.A02 = new File(AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(350)));
        this.A00 = requireArguments().getInt("entrypoint");
        C0f9.A09(-1362947172, A02);
    }
}
