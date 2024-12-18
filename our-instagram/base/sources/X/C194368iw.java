package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.8iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194368iw implements InterfaceC66482zP {
    public final SpannableStringBuilder A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C194368iw c194368iw = (C194368iw) obj;
        C14360o3.A0B(c194368iw, 0);
        return C14360o3.A0K(this.A00, c194368iw.A00);
    }

    public C194368iw(SpannableStringBuilder spannableStringBuilder) {
        this.A00 = spannableStringBuilder;
    }
}
