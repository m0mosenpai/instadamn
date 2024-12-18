package X;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import java.util.List;

/* loaded from: classes10.dex */
public final class TP2 implements Runnable {
    public final /* synthetic */ DirectRecipientSearchActivity A00;
    public final /* synthetic */ List A01;

    public TP2(DirectRecipientSearchActivity directRecipientSearchActivity, List list) {
        this.A00 = directRecipientSearchActivity;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        DirectRecipientSearchActivity directRecipientSearchActivity = this.A00;
        ListView listView = directRecipientSearchActivity.A00;
        if (listView == null) {
            str = "recipientListView";
        } else {
            C58721Q4x c58721Q4x = directRecipientSearchActivity.A01;
            if (c58721Q4x == null) {
                str = "adapter";
            } else {
                listView.setAdapter((ListAdapter) c58721Q4x);
                View findViewById = directRecipientSearchActivity.findViewById(R.id.no_chats_view);
                C14360o3.A0C(findViewById, AbstractC111324zv.A00(3));
                findViewById.setVisibility(AbstractC167007dF.A05(this.A01.isEmpty() ? 1 : 0));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
