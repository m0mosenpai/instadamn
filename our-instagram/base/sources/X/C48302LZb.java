package X;

import java.util.Iterator;

/* renamed from: X.LZb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48302LZb implements InterfaceC66482zP {
    public final float A00;
    public final C153126ug A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48302LZb c48302LZb = (C48302LZb) obj;
        C14360o3.A0B(c48302LZb, 0);
        return C14360o3.A0K(this.A02, c48302LZb.A02);
    }

    public C48302LZb(C153126ug c153126ug, float f) {
        StringBuilder sb = new StringBuilder("emojis:");
        Iterator it = c153126ug.iterator();
        while (it.hasNext()) {
            sb.append(((C148336m3) it.next()).A01);
            sb.append("+");
        }
        this.A02 = AbstractC166987dD.A19(sb);
        this.A01 = c153126ug;
        this.A00 = f;
    }
}
