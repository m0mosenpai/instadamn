package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UGe extends C2UU {
    public int A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final A5M A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ViewOnLongClickListenerC70244WNo viewOnLongClickListenerC70244WNo;
        C66438UHo c66438UHo = (C66438UHo) c3oo;
        C148286ly c148286ly = (C148286ly) ((C148276lx) this.A06.get(i)).A0O.get(0);
        String str = c66438UHo.A04;
        if (str == null || !str.equals(c148286ly.A0H.getUrl())) {
            List list = this.A05;
            C148276lx C0S = ((InterfaceC148316m1) list.get(i)).C0S();
            C0S.getClass();
            C148286ly c148286ly2 = (C148286ly) C0S.A0O.get(0);
            boolean A1P = AbstractC167007dF.A1P(this.A00, i);
            RoundedCornerFrameLayout roundedCornerFrameLayout = c66438UHo.A03;
            roundedCornerFrameLayout.getClass();
            if (A1P) {
                roundedCornerFrameLayout.setStrokeWidth(AbstractC167017dG.A07(this.A02));
                roundedCornerFrameLayout.setStrokeColor(-1);
            } else {
                roundedCornerFrameLayout.setStrokeWidth(0.0f);
                roundedCornerFrameLayout.setStrokeColor(0);
            }
            c66438UHo.A01 = C0S;
            c66438UHo.A02 = c148286ly2;
            c66438UHo.A05 = ((KNF) list.get(i)).A00;
            c66438UHo.A04 = c148286ly.A0H.getUrl();
            ImageView imageView = c66438UHo.A00;
            imageView.getClass();
            float f = c148286ly.A01 / c148286ly.A00;
            Context context = this.A02;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.canvas_gifs_tile_height);
            imageView.setImageDrawable(new C74P(context, this.A03, c148286ly.A0H, null, null, C74U.A00(c148286ly.A01 / c148286ly.A00, (int) (dimensionPixelSize * f), dimensionPixelSize, -1), C05F.A00, c148286ly.A0S, AbstractC43594JPz.A04(context), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), false));
            ImageView imageView2 = c66438UHo.A00;
            imageView2.getClass();
            C0fQ.A00(new WMc(i, 0, c66438UHo, this), imageView2);
            String str2 = c66438UHo.A05;
            ImageView imageView3 = c66438UHo.A00;
            if (str2 == null) {
                imageView3.getClass();
                viewOnLongClickListenerC70244WNo = null;
            } else {
                imageView3.getClass();
                viewOnLongClickListenerC70244WNo = new ViewOnLongClickListenerC70244WNo(0, this, c66438UHo);
            }
            imageView3.setOnLongClickListener(viewOnLongClickListenerC70244WNo);
        }
    }

    public UGe(Context context, UserSession userSession, A5M a5m) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = a5m;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1646101233);
        int size = this.A05.size();
        C0f9.A0A(2076523627, A03);
        return size;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.UHo] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_gifs_tile);
        ?? c3oo = new C3OO(A0A);
        c3oo.A03 = (RoundedCornerFrameLayout) A0A.findViewById(R.id.canvas_gifs_tile_container);
        c3oo.A00 = (ImageView) A0A.findViewById(R.id.canvas_gifs_tile_image_view);
        return c3oo;
    }
}
