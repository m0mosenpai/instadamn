package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UwX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67706UwX extends AbstractC66440UHq {
    public final SparseArray A00;
    public final ViewGroup A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67706UwX(View view, SparseArray sparseArray) {
        super(view);
        AbstractC167017dG.A1P(view, sparseArray);
        this.A00 = sparseArray;
        this.A01 = AbstractC31176DnK.A0C(view, R.id.container);
        this.A02 = new ArrayList();
    }
}
