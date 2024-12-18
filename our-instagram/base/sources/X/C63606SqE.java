package X;

import android.text.TextUtils;

/* renamed from: X.SqE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63606SqE implements InterfaceC110624yZ {
    public final String A00;

    @Override // X.InterfaceC110624yZ
    public final /* bridge */ /* synthetic */ Object Bos() {
        return this;
    }

    public C63606SqE(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC110624yZ
    public final boolean CJo(C54532fA c54532fA, CharSequence charSequence, int i, int i2) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.A00)) {
            return true;
        }
        c54532fA.A02 = (c54532fA.A02 & 3) | 4;
        return false;
    }
}
