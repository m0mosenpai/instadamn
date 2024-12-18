package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.DzX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31865DzX extends AbstractC155316yK {
    public final GYJ A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31947E2b(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.language_locale_item, false));
    }

    public C31865DzX(GYJ gyj) {
        super(C31852DzK.A00);
        this.A00 = gyj;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C31947E2b c31947E2b = (C31947E2b) c3oo;
        C14360o3.A0B(c31947E2b, 0);
        C51758Mth c51758Mth = (C51758Mth) getItem(i);
        Context A05 = AbstractC31172DnG.A05(c31947E2b);
        C32110E9i c32110E9i = (C32110E9i) c51758Mth.A00;
        String A0p = AbstractC166997dE.A0p(A05, c32110E9i.A01);
        c31947E2b.A01.setText(A0p);
        String A0p2 = AbstractC166997dE.A0p(A05, c32110E9i.A00);
        boolean equals = A0p.equals(A0p2);
        int i2 = 8;
        TextView textView = c31947E2b.A02;
        if (equals) {
            textView.setVisibility(8);
        } else {
            textView.setText(A0p2);
            textView.setVisibility(0);
        }
        ViewOnClickListenerC35687FpM.A00(c31947E2b.itemView, 57, c51758Mth, this);
        View view = c31947E2b.A00;
        if (c51758Mth.A01) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(34516534);
        long j = ((C32110E9i) ((C51758Mth) getItem(i)).A00).A00;
        C0f9.A0A(-1423356075, A03);
        return j;
    }
}
