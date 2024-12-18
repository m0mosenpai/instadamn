package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MlQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51303MlQ extends C3OO {
    public TextWatcher A00;
    public final EditText A01;
    public final IgTextView A02;

    public C51303MlQ(View view, boolean z) {
        super(view);
        this.A01 = (EditText) view.findViewById(R.id.description_edit_view);
        view = z ^ true ? view : null;
        this.A02 = view instanceof IgTextView ? (IgTextView) view : null;
    }
}
