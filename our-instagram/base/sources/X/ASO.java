package X;

import android.app.Activity;
import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class ASO implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C47772L7u A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public ASO(Activity activity, C47772L7u c47772L7u, String str, List list) {
        this.A01 = c47772L7u;
        this.A02 = str;
        this.A00 = activity;
        this.A03 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(200192179);
        this.A01.A00(this.A00, this.A02);
        C0f9.A0C(751734214, A05);
    }
}
