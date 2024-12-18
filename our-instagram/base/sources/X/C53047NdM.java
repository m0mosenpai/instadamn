package X;

import com.instagram.api.schemas.ClipChainType;
import com.instagram.music.common.model.AudioType;

/* renamed from: X.NdM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53047NdM extends AbstractC53584Nmq {
    public final ClipChainType A00;
    public final AudioType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53047NdM) {
                C53047NdM c53047NdM = (C53047NdM) obj;
                if (!C14360o3.A0K(this.A02, c53047NdM.A02) || this.A01 != c53047NdM.A01 || !C14360o3.A0K(this.A05, c53047NdM.A05) || !C14360o3.A0K(this.A03, c53047NdM.A03) || !C14360o3.A0K(this.A04, c53047NdM.A04) || this.A00 != c53047NdM.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C53047NdM(ClipChainType clipChainType, AudioType audioType, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A13(str, audioType, str2);
        this.A02 = str;
        this.A01 = audioType;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = clipChainType;
    }
}
