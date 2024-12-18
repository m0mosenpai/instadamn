package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.VrQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69561VrQ {
    public final Context A00;
    public final InterfaceC71986XDx A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.VJo] */
    public final View A00(ViewGroup viewGroup, boolean z) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.limited_comment_row);
        C14360o3.A0A(A0A);
        C14360o3.A0B(A0A, 1);
        ?? obj = new Object();
        obj.A01 = A0A;
        obj.A02 = AbstractC166997dE.A0S(A0A, R.id.limited_comment_row);
        obj.A07 = AbstractC31176DnK.A0U(obj.A01, R.id.row_comment_imageview);
        obj.A06 = AbstractC25231BEo.A0d(obj.A01, R.id.row_comment_textview_comment);
        obj.A05 = AbstractC167007dF.A0N(obj.A01, R.id.row_comment_textview_time_ago);
        obj.A03 = AbstractC167007dF.A0N(obj.A01, R.id.row_comment_textview_approve_button);
        obj.A04 = AbstractC167007dF.A0N(obj.A01, R.id.row_comment_textview_delete_button);
        View A0S = AbstractC166997dE.A0S(obj.A01, R.id.row_comment_indent);
        obj.A00 = A0S;
        A0S.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        obj.A06.A00 = true;
        A0A.setTag(obj);
        return A0A;
    }

    public C69561VrQ(Context context, InterfaceC71986XDx interfaceC71986XDx) {
        this.A00 = context;
        this.A01 = interfaceC71986XDx;
    }
}
