package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W4k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70112W4k {
    public RecyclerView A00;
    public UGU A01;
    public EnumC132745yx A02;
    public List A03;
    public View A04;
    public LinearLayoutManager A05;
    public final int A06;
    public final InterfaceC11380iw A07;
    public final C19260xA A08;
    public final UserSession A09;
    public final C69577Vrg A0A;
    public final Hashtag A0B;
    public final String A0C;
    public final Context A0D;
    public final C69227Vjv A0E;

    public C70112W4k(Context context, InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C69577Vrg c69577Vrg, Hashtag hashtag, String str, int i) {
        C14360o3.A0B(userSession, 2);
        AbstractC167017dG.A1U(hashtag, str);
        this.A0D = context;
        this.A09 = userSession;
        this.A0A = c69577Vrg;
        this.A07 = interfaceC11380iw;
        this.A08 = c19260xA;
        this.A0B = hashtag;
        this.A0C = str;
        this.A06 = i;
        this.A0E = new C69227Vjv(interfaceC11380iw, c19260xA, userSession);
        C14360o3.A0B(c19260xA, 4);
        this.A01 = new UGU(interfaceC11380iw, c19260xA, userSession, c69577Vrg);
        this.A03 = new ArrayList();
    }

    public final void A01(C57012jc c57012jc) {
        C14360o3.A0B(c57012jc, 0);
        if (this.A03.isEmpty()) {
            c57012jc.A02();
            return;
        }
        View A01 = c57012jc.A01();
        this.A04 = A01;
        if (A01 == null) {
            return;
        }
        c57012jc.A03(0);
        Context context = this.A0D;
        AbstractC31172DnG.A1B(context, A01, AbstractC53242c7.A0H(context, R.attr.backgroundColorSecondary));
        RecyclerView recyclerView = (RecyclerView) A01.requireViewById(R.id.related_item_carousel_view);
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 A00 = AbstractC92774Dp.A00(context, this.A05, null);
        this.A05 = A00;
        recyclerView.setLayoutManager(A00);
        recyclerView.A14(new UHJ(recyclerView, this.A0E, this.A01));
        this.A00 = recyclerView;
        A00(this);
    }

    public static final void A00(C70112W4k c70112W4k) {
        RecyclerView recyclerView;
        Context context;
        Resources resources;
        int i;
        View view = c70112W4k.A04;
        if (view != null && (recyclerView = c70112W4k.A00) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (c70112W4k.A02 == EnumC132745yx.A05) {
                layoutParams.height = -2;
                view.requireViewById(R.id.related_items_title).setVisibility(0);
                context = c70112W4k.A0D;
                resources = context.getResources();
                i = R.dimen.abc_button_padding_horizontal_material;
            } else {
                context = c70112W4k.A0D;
                layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_margin_horizontal);
                AbstractC31176DnK.A1D(view, R.id.related_items_title);
                resources = context.getResources();
                i = R.dimen.ad4ad_button_bottom_margin;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            recyclerView.setLayoutParams(layoutParams);
            int size = recyclerView.A12.size();
            while (true) {
                size--;
                if (-1 < size) {
                    recyclerView.A0m(size);
                } else {
                    AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A03(context), dimensionPixelSize);
                    recyclerView.setAdapter(c70112W4k.A01);
                    return;
                }
            }
        }
    }
}
