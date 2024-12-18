package X;

/* renamed from: X.LZd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48304LZd implements InterfaceC66482zP {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "pending_threads_story_replies_row";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48304LZd c48304LZd = (C48304LZd) obj;
        C14360o3.A0B(c48304LZd, 0);
        if (this.A00 == c48304LZd.A00 && this.A01 == c48304LZd.A01 && this.A02 == c48304LZd.A02) {
            return true;
        }
        return false;
    }

    public C48304LZd(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }
}
