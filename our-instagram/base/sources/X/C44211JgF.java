package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JgF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44211JgF extends C2UU {
    public final Context A00;
    public final Drawable A01;
    public final UserSession A02;
    public final C31683Dvo A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.refinement_item, viewGroup, false);
        if ((inflate instanceof TextView) && (textView = (TextView) inflate) != null) {
            int A06 = AbstractC167017dG.A06(context);
            AbstractC13880nE.A0j(textView, A06, A06);
            textView.setCompoundDrawablePadding(AbstractC167017dG.A05(context));
            LQ1.A00(textView, 50, this, new C44648Jps(textView));
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44648Jps(new TextView(viewGroup.getContext()));
    }

    public C44211JgF(Context context, UserSession userSession, C31683Dvo c31683Dvo) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c31683Dvo;
        Drawable drawable = context.getDrawable(R.drawable.instagram_star_pano_filled_12);
        if (drawable != null) {
            drawable.setTint(AbstractC167007dF.A09(context, android.R.attr.textColorPrimary));
        }
        this.A01 = drawable;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        C0f9.A0A(-788337711, C0f9.A03(-2135305497));
        return 0;
    }
}
