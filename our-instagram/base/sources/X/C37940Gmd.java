package X;

import com.instagram.api.schemas.MusicInfoImpl;

/* renamed from: X.Gmd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37940Gmd extends C0T6 implements InterfaceC43474JIm {
    public final MusicInfoImpl A00;
    public final String A01;

    public C37940Gmd(MusicInfoImpl musicInfoImpl, String str) {
        C14360o3.A0B(musicInfoImpl, 2);
        this.A01 = str;
        this.A00 = musicInfoImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37940Gmd) {
                C37940Gmd c37940Gmd = (C37940Gmd) obj;
                if (!C14360o3.A0K(this.A01, c37940Gmd.A01) || !C14360o3.A0K(this.A00, c37940Gmd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
