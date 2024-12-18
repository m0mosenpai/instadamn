package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.Vsl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69644Vsl {
    public C70908WkB A00;
    public boolean A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final RecyclerView A04;
    public final AppBarLayout A05;
    public final V5Q A06;
    public final C66362zD A07;

    public C69644Vsl(ViewStub viewStub, AppBarLayout appBarLayout, float f) {
        int A06 = AbstractC167007dF.A06(1, appBarLayout, viewStub);
        this.A01 = true;
        Context context = viewStub.getContext();
        View inflate = viewStub.inflate();
        if (inflate != null) {
            this.A02 = inflate;
            inflate.setVisibility(4);
            RecyclerView recyclerView = (RecyclerView) inflate.requireViewById(R.id.media_thumbnail_preview_recycler_view);
            this.A04 = recyclerView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            this.A03 = linearLayoutManager;
            recyclerView.setLayoutManager(linearLayoutManager);
            V5Q v5q = new V5Q(f);
            this.A06 = v5q;
            C66392zG A00 = C66362zD.A00(recyclerView.getContext());
            A00.A08 = true;
            A00.A01(new V5B(f));
            A00.A01(v5q);
            C66362zD A002 = A00.A00();
            this.A07 = A002;
            recyclerView.setAdapter(A002);
            recyclerView.A10(new UH4(this, f));
            new C80V().A07(recyclerView);
            recyclerView.A14(new C65986Txf(this, 3));
            this.A05 = appBarLayout;
            appBarLayout.A02(new MaW(this, A06));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final int A00() {
        LinearLayoutManager linearLayoutManager = this.A03;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        int A1c = linearLayoutManager.A1c();
        if (Math.abs(A1b - A1a) > 1) {
            return (A1a + A1b) / 2;
        }
        return A1c;
    }
}
