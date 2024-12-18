package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dy5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31786Dy5 extends AbstractC10350h1 {
    public final HashMap A00;
    public final /* synthetic */ C32314ELd A01;

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        C14360o3.A0B(obj, 0);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (C14360o3.A0K(A01(i), obj)) {
                return i;
            }
        }
        HashMap hashMap = this.A00;
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (true) {
            if (!A14.hasNext()) {
                break;
            }
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            long A0N = AbstractC166987dD.A0N(A1K.getKey());
            if (C14360o3.A0K(A1K.getValue(), obj)) {
                hashMap.remove(Long.valueOf(A0N));
                break;
            }
        }
        return -2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31786Dy5(AbstractC10360h2 abstractC10360h2, C32314ELd c32314ELd) {
        super(abstractC10360h2, 1);
        this.A01 = c32314ELd;
        this.A00 = AbstractC166987dD.A1G();
    }

    @Override // X.AbstractC10350h1
    public final long A00(int i) {
        return ((EnumC33414Epl) this.A01.A14.get(i)).ordinal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r11.A11 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r0 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0036. Please report as an issue. */
    @Override // X.AbstractC10350h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A01(int r13) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31786Dy5.A01(int):androidx.fragment.app.Fragment");
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A01.A14.size();
    }
}
