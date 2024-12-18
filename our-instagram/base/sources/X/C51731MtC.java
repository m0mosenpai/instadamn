package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import java.io.File;

/* renamed from: X.MtC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51731MtC extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C51731MtC(AbstractC193598he abstractC193598he, VoiceOption voiceOption, String str, String str2, String str3, int i) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(voiceOption, 6);
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = abstractC193598he;
        this.A01 = i;
        this.A03 = voiceOption;
    }

    public final String A00() {
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A02;
        if (abstractC193598he instanceof C8ZT) {
            return ((File) abstractC193598he.A00()).getPath();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        C51731MtC c51731MtC;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C51731MtC)) {
                        return false;
                    }
                    c51731MtC = (C51731MtC) obj;
                    if (c51731MtC.A00 != 0 || !C14360o3.A0K(this.A04, c51731MtC.A04) || !C14360o3.A0K(this.A06, c51731MtC.A06) || !C14360o3.A0K(this.A05, c51731MtC.A05) || !C14360o3.A0K(this.A02, c51731MtC.A02) || this.A01 != c51731MtC.A01) {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51731MtC)) {
                        return false;
                    }
                    C51731MtC c51731MtC2 = (C51731MtC) obj;
                    if (c51731MtC2.A00 != 1 || !C14360o3.A0K(this.A04, c51731MtC2.A04) || !C14360o3.A0K(this.A05, c51731MtC2.A05) || !C14360o3.A0K(this.A06, c51731MtC2.A06) || !C14360o3.A0K(this.A02, c51731MtC2.A02) || this.A01 != c51731MtC2.A01 || this.A03 != c51731MtC2.A03) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C51731MtC) {
                        c51731MtC = (C51731MtC) obj;
                        if (c51731MtC.A00 != 2 || !C14360o3.A0K(this.A05, c51731MtC.A05) || !C14360o3.A0K(this.A02, c51731MtC.A02) || this.A01 != c51731MtC.A01 || !C14360o3.A0K(this.A06, c51731MtC.A06) || !C14360o3.A0K(this.A04, c51731MtC.A04)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(this.A03, c51731MtC.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int A00;
        switch (this.A00) {
            case 0:
                A0J = (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A04)))) + this.A01) * 31;
                A00 = this.A03.hashCode();
                break;
            case 1:
                A0J = (((((AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A01) * 31;
                A00 = AbstractC53957NtU.A00((Integer) this.A03);
                break;
            default:
                A0J = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A06, (((AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A01) * 31));
                A00 = this.A03.hashCode();
                break;
        }
        return A0J + A00;
    }

    public C51731MtC(C7Q4 c7q4, Integer num, String str, String str2, String str3, int i) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = c7q4;
        this.A01 = i;
        this.A03 = num;
    }

    public C51731MtC(ImageUrl imageUrl, Long l, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A02 = l;
        this.A01 = i;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = imageUrl;
    }
}
