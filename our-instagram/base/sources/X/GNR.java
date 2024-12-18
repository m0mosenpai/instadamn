package X;

import android.widget.ListView;
import com.instagram.business.fragment.CategorySearchFragment;

/* loaded from: classes6.dex */
public final class GNR implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;
    public final /* synthetic */ Integer A01;

    public GNR(CategorySearchFragment categorySearchFragment, Integer num) {
        this.A00 = categorySearchFragment;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.A00.categoriesListView;
        C14360o3.A0A(listView);
        listView.setSelection(this.A01.intValue());
    }
}
