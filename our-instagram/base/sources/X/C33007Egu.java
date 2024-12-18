package X;

import android.os.Build;

/* renamed from: X.Egu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33007Egu extends AbstractC34718FRf {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33007Egu(EnumC33522Erv enumC33522Erv, String str, int i) {
        super(enumC33522Erv, str);
        this.A00 = i;
    }

    @Override // X.AbstractC34718FRf
    public final boolean A00() {
        switch (this.A00) {
            case 0:
                return true;
            default:
                if (AbstractC31172DnG.A01(AbstractC31174DnI.A0f(), AbstractC111324zv.A00(498)) == 0 && Build.VERSION.SDK_INT >= 33 && !AbstractC23451Ch.A07(AbstractC12290kX.A00.getApplicationContext(), "android.permission.POST_NOTIFICATIONS")) {
                    return true;
                }
                break;
            case 1:
                return false;
        }
    }
}
