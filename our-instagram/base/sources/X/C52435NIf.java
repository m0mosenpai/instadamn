package X;

import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.NIf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52435NIf extends AbstractC115485Ki {
    public int A00;
    public C206169Az A01;
    public C26086BgF A02;
    public C18160v1 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final MediaUploadMetadata A0D;
    public final String A0E;
    public final Map A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52435NIf(C206169Az c206169Az, C26086BgF c26086BgF, MediaUploadMetadata mediaUploadMetadata, C18160v1 c18160v1, String str, String str2, Map map, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        super(C05F.A00);
        C14360o3.A0B(str, 1);
        this.A0E = str;
        this.A00 = i;
        this.A0C = i2;
        this.A0A = i3;
        this.A0B = i4;
        this.A05 = z;
        this.A08 = z2;
        this.A02 = c26086BgF;
        this.A07 = z3;
        this.A06 = z4;
        this.A03 = c18160v1;
        this.A01 = c206169Az;
        this.A04 = str2;
        this.A0F = map;
        this.A09 = i5;
        this.A0D = mediaUploadMetadata;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52435NIf) {
                C52435NIf c52435NIf = (C52435NIf) obj;
                if (!C14360o3.A0K(this.A0E, c52435NIf.A0E) || this.A00 != c52435NIf.A00 || this.A0C != c52435NIf.A0C || this.A0A != c52435NIf.A0A || this.A0B != c52435NIf.A0B || this.A05 != c52435NIf.A05 || this.A08 != c52435NIf.A08 || !C14360o3.A0K(this.A02, c52435NIf.A02) || this.A07 != c52435NIf.A07 || this.A06 != c52435NIf.A06 || !C14360o3.A0K(this.A03, c52435NIf.A03) || !C14360o3.A0K(this.A01, c52435NIf.A01) || !C14360o3.A0K(this.A04, c52435NIf.A04) || !C14360o3.A0K(this.A0F, c52435NIf.A0F) || this.A09 != c52435NIf.A09 || !C14360o3.A0K(this.A0D, c52435NIf.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC115485Ki
    public final int A02() {
        return this.A0A;
    }

    @Override // X.AbstractC115485Ki
    public final int A03() {
        return this.A0C;
    }

    @Override // X.AbstractC115485Ki
    public final C206169Az A04() {
        return this.A01;
    }

    @Override // X.AbstractC115485Ki
    public final C18160v1 A05() {
        return this.A03;
    }

    @Override // X.AbstractC115485Ki
    public final C115545Ko A07() {
        return null;
    }

    @Override // X.AbstractC115485Ki
    public final String A08() {
        return this.A0E;
    }

    @Override // X.AbstractC115485Ki
    public final boolean A09() {
        return this.A05;
    }

    @Override // X.AbstractC115485Ki
    public final boolean A0A() {
        return this.A07;
    }

    public final ClipSegment.PhotoSegment A0B() {
        return new ClipSegment.PhotoSegment(AbstractC115515Kl.A04(this), null, null, this.A0E, null, null, this.A0C, this.A0A, this.A0B, this.A00, -1, false);
    }

    @Override // X.InterfaceC115495Kj
    public final int BsL() {
        return this.A00;
    }

    public final int hashCode() {
        return ((((((((((AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, (AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A05, (((((((AbstractC166987dD.A0J(this.A0E) + this.A00) * 31) + this.A0C) * 31) + this.A0A) * 31) + this.A0B) * 31)) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + this.A09) * 31) + AbstractC166997dE.A0I(this.A0D);
    }

    @Override // X.AbstractC115485Ki
    public final /* bridge */ /* synthetic */ AbstractC115485Ki A06() {
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0O2 = MSW.A0O(A0O);
            AbstractC54869OOe.A00(A0O2, this);
            try {
                return AbstractC54869OOe.parseFromJson(C16V.A00(MSX.A0e(A0O2, A0O)));
            } catch (IOException unused) {
                throw new RuntimeException();
            }
        } catch (IOException unused2) {
            throw new RuntimeException();
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IgPhotoSegment(filePath=");
        A1C.append(this.A0E);
        A1C.append(AbstractC111324zv.A00(3374));
        A1C.append(this.A00);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A0C);
        A1C.append(this.A0A);
        A1C.append(", rotation=");
        A1C.append(this.A0B);
        A1C.append(AbstractC111324zv.A00(3376));
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(3395));
        A1C.append(this.A08);
        A1C.append(AbstractC111324zv.A00(3349));
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(3386));
        A1C.append(this.A07);
        A1C.append(AbstractC111324zv.A00(3378));
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(3449));
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(569));
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(3419));
        A1C.append(this.A04);
        A1C.append(", exifData=");
        A1C.append(this.A0F);
        A1C.append(", exifOrientation=");
        A1C.append(this.A09);
        A1C.append(AbstractC111324zv.A00(572));
        return AbstractC167017dG.A0o(this.A0D, A1C);
    }
}
