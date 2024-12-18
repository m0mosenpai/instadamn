package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3DH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DH implements InterfaceC41141vN {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final C1OP A03;
    public final List A04;

    public C3DH(C1OP c1op, List list, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = c1op;
        arrayList.addAll(list);
        this.A01 = z;
        this.A00 = i;
    }

    public C3DH(Reel reel, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = null;
        arrayList.add(reel);
        this.A02 = true;
    }

    public C3DH(Reel reel) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = null;
        arrayList.add(reel);
    }
}
