package X;

import com.instagram.mediakit.model.MediaKitSectionType;

/* renamed from: X.OvT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56109OvT implements InterfaceC66482zP {
    public final MediaKitSectionType A00;
    public final N4J A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0T(this.A03, this.A00.A00, '_');
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56109OvT c56109OvT = (C56109OvT) obj;
        String str2 = this.A03;
        if (c56109OvT != null) {
            str = c56109OvT.A03;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A02, c56109OvT.A02) && this.A00 == c56109OvT.A00) {
            return true;
        }
        return false;
    }

    public C56109OvT(MediaKitSectionType mediaKitSectionType, N4J n4j, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = mediaKitSectionType;
        this.A01 = n4j;
    }
}
