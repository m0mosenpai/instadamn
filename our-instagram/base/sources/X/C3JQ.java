package X;

import java.util.List;

/* renamed from: X.3JQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JQ {
    public int A00;
    public int A01;
    public String A02;
    public List A03;

    public final C23781El A00(String str) {
        for (C23781El c23781El : this.A03) {
            if (c23781El.A00.equalsIgnoreCase(str)) {
                return c23781El;
            }
        }
        return null;
    }

    public final boolean A01() {
        int i = this.A01;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }
}
