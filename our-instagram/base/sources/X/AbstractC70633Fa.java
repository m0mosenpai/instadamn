package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70633Fa {
    public static final void A00(Context context, RecyclerView recyclerView, UserSession userSession) {
        int dimensionPixelSize;
        int i;
        AbstractC70653Fc c70643Fb;
        recyclerView.setBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)));
        if (C25371Lr.A00(AbstractC25351Lp.A00(userSession))) {
            c70643Fb = new JoF(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        } else {
            C25371Lr A00 = AbstractC25351Lp.A00(userSession);
            Resources resources = context.getResources();
            InterfaceC09390do interfaceC09390do = A00.A02;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            if (((Boolean) value).booleanValue()) {
                i = R.dimen.abc_action_bar_elevation_material;
            } else {
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                if (((Boolean) value2).booleanValue()) {
                    i = R.dimen.annotation_hidden_location_pill_nub_padding;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
                    c70643Fb = new C70643Fb(dimensionPixelSize);
                }
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i);
            c70643Fb = new C70643Fb(dimensionPixelSize);
        }
        recyclerView.A10(c70643Fb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
