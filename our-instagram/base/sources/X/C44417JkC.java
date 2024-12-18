package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.JkC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44417JkC extends BaseAdapter {
    public int A00;
    public int A01;
    public TextView A02;
    public final InterfaceC195648l5 A03;

    public C44417JkC(InterfaceC195648l5 interfaceC195648l5) {
        C14360o3.A0B(interfaceC195648l5, 1);
        this.A03 = interfaceC195648l5;
        this.A01 = R.layout.gallery_grid_folder_picker_title;
        this.A00 = R.layout.gallery_grid_folder_picker_item;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        boolean z = false;
        if (view == null) {
            view = AbstractC25228BEl.A0P(viewGroup).inflate(this.A00, viewGroup, false);
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) view;
        Object item = getItem(i);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.Folder");
        Folder folder = (Folder) item;
        textView.setText(folder.A03);
        if (this.A03.getCurrentFolder() == folder) {
            z = true;
        }
        textView.setActivated(z);
        return textView;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, this.A01);
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        this.A02 = (TextView) view;
        Object item = getItem(i);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.Folder");
        Folder folder = (Folder) item;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(folder.A03);
        }
        return this.A02;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.getFolders().size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A03.getFolders().get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((Folder) this.A03.getFolders().get(i)).A02;
    }
}
