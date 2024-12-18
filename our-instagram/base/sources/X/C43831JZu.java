package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JZu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43831JZu extends BaseAdapter {
    public final Resources A00;
    public final MSG A01;

    public C43831JZu(Resources resources, MSG msg) {
        C14360o3.A0B(resources, 2);
        this.A01 = msg;
        this.A00 = resources;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(this.A00, 2);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spinner_menu_title, viewGroup, false);
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) view;
        Object item = getItem(i);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MixedFolder");
        textView.setText(((C8Z4) item).getName());
        return textView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A01.getCombinedFolders().size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A01.getCombinedFolders().get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r1.BF3() != r5.BF3()) goto L6;
     */
    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getDropDownView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            X.AbstractC167017dG.A1P(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r5 = r6.getItem(r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MixedFolder"
            X.C14360o3.A0C(r5, r0)
            X.8Z4 r5 = (X.C8Z4) r5
            X.MSG r4 = r6.A01
            X.8Z4 r1 = r4.getCurrentMixedFolder()
            java.lang.String r0 = r5.getName()
            r8.setText(r0)
            java.lang.Integer r0 = r1.CBv()
            java.lang.Integer r3 = r5.CBv()
            if (r0 != r3) goto L32
            int r2 = r1.BF3()
            int r1 = r5.BF3()
            r0 = 1
            if (r2 == r1) goto L33
        L32:
            r0 = 0
        L33:
            r8.setActivated(r0)
            java.lang.Integer r0 = X.C05F.A00
            if (r3 != r0) goto L44
            com.instagram.ui.widget.mediapicker.Folder r5 = (com.instagram.ui.widget.mediapicker.Folder) r5
            X.LQV r0 = new X.LQV
            r0.<init>(r4, r5)
            r8.setOnTouchListener(r0)
        L44:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43831JZu.getDropDownView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
