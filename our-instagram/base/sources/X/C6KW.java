package X;

import java.util.List;

/* renamed from: X.6KW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KW {
    public int A00;
    public final int A01;
    public final C25256BFu A02;
    public final List A03;

    public C6KW(C25256BFu c25256BFu, List list) {
        int i;
        int i2;
        this.A03 = list;
        this.A02 = c25256BFu;
        if (c25256BFu != null) {
            i = c25256BFu.A02.A00.getButtonState();
        } else {
            i = 0;
        }
        this.A01 = i;
        C25256BFu c25256BFu2 = this.A02;
        if (c25256BFu2 != null) {
            c25256BFu2.A02.A00.getMetaState();
        }
        C25256BFu c25256BFu3 = this.A02;
        if (c25256BFu3 != null) {
            int actionMasked = c25256BFu3.A02.A00.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    }
                    i2 = 3;
                }
                i2 = 2;
            }
            i2 = 1;
        } else {
            List list2 = this.A03;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                BFo bFo = (BFo) list2.get(i3);
                if (!AbstractC25253BFp.A02(bFo)) {
                    if (!bFo.A0C && bFo.A0B) {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
            }
            i2 = 3;
        }
        this.A00 = i2;
    }
}
