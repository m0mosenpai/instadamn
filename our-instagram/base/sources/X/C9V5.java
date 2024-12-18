package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9V5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V5 extends C3OO implements BDL {
    public C203238yg A00;
    public final ColorDrawable A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final UserSession A07;
    public final InterfaceC193788hy A08;
    public final C194148iZ A09;
    public final C177907vP A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9V5(View view, UserSession userSession, InterfaceC193788hy interfaceC193788hy, C194148iZ c194148iZ) {
        super(view);
        AbstractC167017dG.A1R(userSession, c194148iZ);
        C14360o3.A0B(interfaceC193788hy, 4);
        this.A07 = userSession;
        this.A09 = c194148iZ;
        this.A08 = interfaceC193788hy;
        View findViewById = view.findViewById(R.id.gallery_drafts_item_imageview);
        ImageView imageView = (ImageView) findViewById;
        C0fQ.A00(new ViewOnClickListenerC23248ASj(16, imageView, this), imageView);
        C14360o3.A07(findViewById);
        this.A03 = imageView;
        Context A0L = AbstractC166997dE.A0L(view);
        C177907vP c177907vP = new C177907vP(A0L);
        c177907vP.A00 = 1;
        this.A0A = c177907vP;
        View findViewById2 = view.findViewById(R.id.gallery_drafts_item_selection_circle);
        ImageView imageView2 = (ImageView) findViewById2;
        if (C18U.A06(C06090Tz.A05, userSession, 36320219139940499L)) {
            imageView2.setImageDrawable(c177907vP);
        }
        C14360o3.A07(findViewById2);
        this.A04 = imageView2;
        this.A06 = (TextView) AbstractC166987dD.A0c(view, R.id.gallery_drafts_expiration_time);
        this.A05 = (TextView) AbstractC166987dD.A0c(view, R.id.gallery_grid_item_duration);
        this.A01 = new ColorDrawable(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_grey_09));
        this.A02 = AbstractC166987dD.A0c(view, R.id.gallery_drafts_item_selection_overlay);
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ boolean CXa(Object obj) {
        return obj.equals(this.A00);
    }

    @Override // X.BDL
    public final void Dt0(C82183lf c82183lf) {
        String str;
        if (c82183lf != null) {
            str = c82183lf.A02;
        } else {
            str = null;
        }
        AbstractC12120kG.A0F("StoryDraftViewHolder", AnonymousClass001.A0R("Draft cover thumbnail path load failed in StoryDraftViewHolder#onThumbnailLoadFailed. info: ", str), null);
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ void Dt3(Bitmap bitmap, Object obj) {
        C203238yg c203238yg = (C203238yg) obj;
        C14360o3.A0B(c203238yg, 0);
        String str = c203238yg.A06;
        if (str == null) {
            AbstractC12120kG.A0F("StoryDraftViewHolder", "draft cover thumbnail path is null", null);
            return;
        }
        Context context = this.itemView.getContext();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C14360o3.A0A(context);
        int A02 = AbstractC188868Yc.A02(context);
        C14360o3.A0B(context, 0);
        int A01 = C1H4.A01(AbstractC188868Yc.A02(context) / 0.5625f);
        int A012 = C197098ne.A01(str);
        boolean z = C1NC.A02;
        Matrix A0Q = AbstractC166987dD.A0Q();
        C1NC.A0J(A0Q, width, height, A02, A01, A012, false);
        ImageView imageView = this.A03;
        imageView.setImageMatrix(A0Q);
        imageView.setImageBitmap(bitmap);
    }
}
