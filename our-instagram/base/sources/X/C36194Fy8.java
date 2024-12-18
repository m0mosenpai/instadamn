package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Fy8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36194Fy8 implements InterfaceC66482zP {
    public final Reel A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        C14360o3.A07(id);
        return id;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C36194Fy8 c36194Fy8 = (C36194Fy8) obj;
        boolean z2 = this.A01;
        if (c36194Fy8 != null) {
            z = c36194Fy8.A01;
        } else {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return true;
    }

    public C36194Fy8(Reel reel, boolean z) {
        this.A00 = reel;
        this.A01 = z;
    }
}
