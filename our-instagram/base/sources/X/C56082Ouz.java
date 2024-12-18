package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Ouz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56082Ouz implements InterfaceC66482zP {
    public final Reel A00;

    public C56082Ouz(Reel reel) {
        C14360o3.A0B(reel, 1);
        this.A00 = reel;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC37301Gc2.A0i(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56082Ouz c56082Ouz = (C56082Ouz) obj;
        String id = this.A00.getId();
        if (c56082Ouz != null) {
            str = c56082Ouz.A00.getId();
        } else {
            str = null;
        }
        return C14360o3.A0K(id, str);
    }
}
