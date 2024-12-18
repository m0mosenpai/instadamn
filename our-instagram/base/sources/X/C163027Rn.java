package X;

import android.widget.LinearLayout;
import com.facebook.common.messagingui.observableverticaloffsetlayout.ObservableVerticalOffsetFrameLayout;

/* renamed from: X.7Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163027Rn extends AbstractC163037Ro {
    public final LinearLayout A00;
    public final ObservableVerticalOffsetFrameLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163027Rn(LinearLayout linearLayout, ObservableVerticalOffsetFrameLayout observableVerticalOffsetFrameLayout) {
        super(observableVerticalOffsetFrameLayout);
        C14360o3.A0B(linearLayout, 2);
        this.A01 = observableVerticalOffsetFrameLayout;
        this.A00 = linearLayout;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163027Rn) {
                C163027Rn c163027Rn = (C163027Rn) obj;
                if (!C14360o3.A0K(this.A01, c163027Rn.A01) || !C14360o3.A0K(this.A00, c163027Rn.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frame(root=");
        sb.append(this.A01);
        sb.append(", linearLayout=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
