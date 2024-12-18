package X;

import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.MsY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51703MsY extends C0T6 {
    public final int A00;
    public final CreativeConfigIntf A01;
    public final EnumC39612HeM A02;
    public final C84823qW A03;
    public final PromptStickerModel A04;
    public final C60220Qvu A05;
    public final C60221Qvv A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C51703MsY() {
        this(null, EnumC39612HeM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, null, null, null, null, null, null, null, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51703MsY) {
                C51703MsY c51703MsY = (C51703MsY) obj;
                if (!C14360o3.A0K(this.A05, c51703MsY.A05) || !C14360o3.A0K(this.A08, c51703MsY.A08) || !C14360o3.A0K(this.A07, c51703MsY.A07) || this.A00 != c51703MsY.A00 || !C14360o3.A0K(this.A09, c51703MsY.A09) || !C14360o3.A0K(this.A06, c51703MsY.A06) || this.A02 != c51703MsY.A02 || !C14360o3.A0K(this.A04, c51703MsY.A04) || !C14360o3.A0K(this.A03, c51703MsY.A03) || !C14360o3.A0K(this.A01, c51703MsY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A02, ((((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51703MsY(CreativeConfigIntf creativeConfigIntf, EnumC39612HeM enumC39612HeM, C84823qW c84823qW, PromptStickerModel promptStickerModel, C60220Qvu c60220Qvu, C60221Qvv c60221Qvv, String str, String str2, String str3, int i) {
        this.A05 = c60220Qvu;
        this.A08 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A09 = str3;
        this.A06 = c60221Qvv;
        this.A02 = enumC39612HeM;
        this.A04 = promptStickerModel;
        this.A03 = c84823qW;
        this.A01 = creativeConfigIntf;
    }
}
