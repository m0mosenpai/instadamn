package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Gv0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38425Gv0 extends C3OO {
    public final RecyclerView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38425Gv0(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View findViewById = view.findViewById(R.id.tracked_content);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        Context context = recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A03(context), AbstractC167017dG.A0A(context));
        C14360o3.A07(findViewById);
        this.A00 = recyclerView;
    }
}
