package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.9Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210919Uo extends C3OO {
    public Hashtag A00;
    public final TextView A01;
    public final C3PF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210919Uo(View view, InterfaceC25174BBv interfaceC25174BBv) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (TextView) view;
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A0D = true;
        A0s.A07 = true;
        A0s.A02 = 0.97f;
        A0s.A04 = new C216529i9(0, this, interfaceC25174BBv);
        this.A02 = A0s.A00();
    }
}
