package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public final class FQY {
    public View A00;
    public RecyclerView A01;
    public Random A02;
    public final ImageView A03;
    public final C07270a1 A04;
    public final RegFlowExtras A05;
    public final SearchEditText A06;
    public final EnumC33445EqI A07;
    public final EnumC31713DwI A08;

    public final void A00(Context context, List list) {
        if (list != null && !list.isEmpty()) {
            ImageView imageView = this.A03;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.refresh);
            C35251Fgk.A01(imageView, AbstractC53242c7.A0B(context));
            ViewOnClickListenerC35687FpM.A00(imageView, 4, this, list);
            AbstractC31172DnG.A1E(imageView.getResources(), imageView, 2131974862);
            this.A00.setVisibility(0);
            RecyclerView recyclerView = this.A01;
            recyclerView.setAdapter(new C31876Dzi(0, context, this, list));
            AbstractC31174DnI.A17(context, recyclerView, false);
        }
    }

    public FQY(View view, ImageView imageView, C07270a1 c07270a1, RegFlowExtras regFlowExtras, SearchEditText searchEditText, EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI) {
        this.A00 = view.findViewById(R.id.username_suggestions_container);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.username_suggestions);
        this.A01 = A0G;
        this.A06 = searchEditText;
        this.A03 = imageView;
        this.A04 = c07270a1;
        this.A07 = enumC33445EqI;
        this.A05 = regFlowExtras;
        this.A08 = enumC31713DwI;
        A0G.A10(new E0C(this, 2));
        this.A02 = new Random();
    }
}
