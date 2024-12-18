package X;

import android.widget.TextView;

/* renamed from: X.Jrh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44760Jrh extends C3OO {
    public final TextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44760Jrh(TextView textView) {
        super(textView);
        C14360o3.A0B(textView, 1);
        this.A00 = textView;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44760Jrh) && C14360o3.A0K(this.A00, ((C44760Jrh) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
