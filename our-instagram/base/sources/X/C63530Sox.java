package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Sox, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63530Sox implements AdapterView.OnItemClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ Q5b A01;
    public final /* synthetic */ DirectWidgetConfig A02;
    public final /* synthetic */ List A03;

    public C63530Sox(TextView textView, Q5b q5b, DirectWidgetConfig directWidgetConfig, List list) {
        this.A03 = list;
        this.A00 = textView;
        this.A01 = q5b;
        this.A02 = directWidgetConfig;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        List list = this.A03;
        String id = ((User) list.get(i)).getId();
        String username = ((User) list.get(i)).getUsername();
        this.A00.setText(((User) list.get(i)).getUsername());
        this.A01.dismiss();
        DirectWidgetConfig directWidgetConfig = this.A02;
        if (!C14360o3.A0K(directWidgetConfig.A03, id)) {
            DirectWidgetConfig.A00(directWidgetConfig);
            directWidgetConfig.A03 = id;
            directWidgetConfig.A04 = username;
        }
    }
}
