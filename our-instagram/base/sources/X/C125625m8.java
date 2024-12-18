package X;

import com.instagram.api.schemas.RIXULayoutFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5m8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125625m8 {
    public List A00;
    public final C76403bk A01;

    public C125625m8(C76403bk c76403bk, C60S c60s) {
        int i;
        List unmodifiableList;
        String A38;
        this.A01 = c76403bk;
        List A07 = AbstractC128065qa.A07(c76403bk.A0M);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A07) {
            if (((C120985dq) obj).A01 == EnumC129395t1.A0G) {
                arrayList.add(obj);
            }
        }
        List list = c76403bk.A0K;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && !unmodifiableList.isEmpty()) {
            List unmodifiableList2 = Collections.unmodifiableList(list);
            arrayList = new ArrayList();
            for (Object obj2 : arrayList) {
                C120985dq c120985dq = (C120985dq) obj2;
                if (unmodifiableList2 != null) {
                    C38321qM c38321qM = c120985dq.A02;
                    if (c38321qM != null && (A38 = c38321qM.A38()) != null) {
                        if (unmodifiableList2.contains(A38)) {
                            arrayList.add(obj2);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        this.A00 = arrayList;
        if (c60s != null && c60s.A00()) {
            RIXULayoutFormat rIXULayoutFormat = c60s.A01;
            if (rIXULayoutFormat != null) {
                int ordinal = rIXULayoutFormat.ordinal();
                if (ordinal != 3) {
                    i = ordinal == 2 ? 4 : 6;
                }
                this.A00 = AbstractC001800i.A0d(this.A00, i);
            }
            throw new IllegalArgumentException("Invalid RIXULayoutFormat");
        }
        if (this.A00.isEmpty()) {
            C0w9.A03("ClipsNetegoItems", "ClipsNetegoItems.clipsItems should not be empty.");
        }
    }
}
