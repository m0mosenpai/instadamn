package X;

import android.text.style.ClickableSpan;

/* renamed from: X.EXz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32625EXz extends C4F4 {
    public final ClickableSpan A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32625EXz c32625EXz = (C32625EXz) obj;
        C14360o3.A0B(c32625EXz, 0);
        if (C14360o3.A0K(this.A01, c32625EXz.A01) && C14360o3.A0K(this.A02, c32625EXz.A02)) {
            return true;
        }
        return false;
    }

    public C32625EXz(ClickableSpan clickableSpan, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = clickableSpan;
    }
}
