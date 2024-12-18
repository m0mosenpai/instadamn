package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.3Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72393Mm extends C0T6 implements InterfaceC41141vN {
    public final ClickableSpan A00;
    public final View A01;
    public final C38321qM A02;
    public final String A03;
    public final boolean A04;

    public C72393Mm(ClickableSpan clickableSpan, View view, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(c38321qM, 1);
        this.A02 = c38321qM;
        this.A03 = str;
        this.A04 = z;
        this.A01 = view;
        this.A00 = clickableSpan;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72393Mm) {
                C72393Mm c72393Mm = (C72393Mm) obj;
                if (!C14360o3.A0K(this.A02, c72393Mm.A02) || !C14360o3.A0K(this.A03, c72393Mm.A03) || this.A04 != c72393Mm.A04 || !C14360o3.A0K(this.A01, c72393Mm.A01) || !C14360o3.A0K(this.A00, c72393Mm.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        View view = this.A01;
        int i3 = 0;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        ClickableSpan clickableSpan = this.A00;
        if (clickableSpan != null) {
            i3 = clickableSpan.hashCode();
        }
        return i4 + i3;
    }
}
