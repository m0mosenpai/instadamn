package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.LOt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48047LOt implements View.OnClickListener {
    public final /* synthetic */ C45508KCx A00;
    public final /* synthetic */ Folder A01;

    public ViewOnClickListenerC48047LOt(C45508KCx c45508KCx, Folder folder) {
        this.A00 = c45508KCx;
        this.A01 = folder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1635115219);
        C45508KCx c45508KCx = this.A00;
        int i = c45508KCx.getCurrentFolder().A02;
        Folder folder = this.A01;
        if (i != folder.A02) {
            C45508KCx.A00(c45508KCx, folder);
            TextView textView = ((C44417JkC) c45508KCx.A0E.getValue()).A02;
            if (textView != null) {
                textView.setText(folder.A03);
            }
        }
        C0f9.A0C(-1903282933, A05);
    }
}
