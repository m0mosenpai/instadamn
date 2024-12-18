package X;

import java.util.List;

/* renamed from: X.Our, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56074Our implements InterfaceC66482zP {
    public List A00;
    public boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming_events_model_key";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        C56074Our c56074Our = (C56074Our) obj;
        if (c56074Our == null || (list = c56074Our.A00) == null || this.A00.size() != list.size()) {
            return false;
        }
        return true;
    }
}
