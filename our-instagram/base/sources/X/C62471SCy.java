package X;

import java.util.List;

/* renamed from: X.SCy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62471SCy {
    public final List A00;
    public final boolean A01;

    public C62471SCy(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        if (AbstractC166987dD.A1b(list)) {
        } else {
            throw AbstractC166987dD.A12("credentialOptions should not be empty");
        }
    }
}
