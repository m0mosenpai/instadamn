package X;

/* renamed from: X.8TB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TB extends C8T9 {
    public final int A00;
    public final C51737MtK A01;
    public final C51737MtK A02;
    public final C51737MtK A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8TB) {
                C8TB c8tb = (C8TB) obj;
                if (this.A00 != c8tb.A00 || !C14360o3.A0K(this.A01, c8tb.A01) || !C14360o3.A0K(this.A03, c8tb.A03) || !C14360o3.A0K(this.A02, c8tb.A02) || this.A04 != c8tb.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VolumeControls(selectedVideoIndex=");
        sb.append(this.A00);
        sb.append(", selectedAudioCoords=");
        sb.append(this.A01);
        sb.append(", selectedVoiceoverCoords=");
        sb.append(this.A03);
        sb.append(", selectedStickerCoords=");
        sb.append(this.A02);
        sb.append(", originalCameraAudioOnMute=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.A00 * 31;
        C51737MtK c51737MtK = this.A01;
        int i2 = 0;
        if (c51737MtK == null) {
            hashCode = 0;
        } else {
            hashCode = c51737MtK.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        C51737MtK c51737MtK2 = this.A03;
        if (c51737MtK2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c51737MtK2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        C51737MtK c51737MtK3 = this.A02;
        if (c51737MtK3 != null) {
            i2 = c51737MtK3.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        int i6 = 1237;
        if (this.A04) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C8TB(C51737MtK c51737MtK, C51737MtK c51737MtK2, C51737MtK c51737MtK3, int i, boolean z) {
        this.A00 = i;
        this.A01 = c51737MtK;
        this.A03 = c51737MtK2;
        this.A02 = c51737MtK3;
        this.A04 = z;
    }

    public C8TB() {
        this(null, null, null, -1, false);
    }
}
