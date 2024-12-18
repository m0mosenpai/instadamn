package X;

import android.view.View;

/* renamed from: X.Ham, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39402Ham extends AnonymousClass772 {
    public final int A00;
    public final Object A01;

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        ((View.OnClickListener) this.A01).onClick(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39402Ham(View.OnClickListener onClickListener, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = onClickListener;
    }
}
