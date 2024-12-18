package X;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.UJh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66482UJh extends C3OO {
    public ColorStateList A00;
    public boolean A01;
    public boolean A02;
    public final Drawable A03;
    public final SparseArray A04;

    public final View A00(int i) {
        SparseArray sparseArray = this.A04;
        View view = (View) sparseArray.get(i);
        if (view == null && (view = this.itemView.findViewById(i)) != null) {
            sparseArray.put(i, view);
        }
        return view;
    }

    public C66482UJh(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.A04 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.facebook.R.id.icon_frame, view.findViewById(com.facebook.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.A03 = view.getBackground();
        if (textView != null) {
            this.A00 = textView.getTextColors();
        }
    }
}
