package X;

import android.graphics.RectF;
import com.instagram.archive.fragment.ArchiveReelMapFragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;

/* renamed from: X.V9b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68071V9b extends AbstractC140596Xn {
    public C41181vS A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ ArchiveReelMapFragment A02;
    public final /* synthetic */ KYY A03;

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    public C68071V9b(RectF rectF, ArchiveReelMapFragment archiveReelMapFragment, KYY kyy) {
        this.A02 = archiveReelMapFragment;
        this.A03 = kyy;
        this.A01 = rectF;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        RectF rectF;
        Ow3 ow3 = this.A02.A01;
        if (ow3.A00) {
            rectF = (RectF) ow3.A02.get(c41181vS.A0j);
            if (rectF == null) {
                return C6PN.A02();
            }
        } else {
            rectF = this.A01;
        }
        return C6PN.A03(rectF);
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        Ow3 ow3 = this.A02.A01;
        if (ow3.A00) {
            ow3.A01(c41181vS.A0j, C05F.A00);
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
        C38321qM c38321qM;
        String name;
        if (this.A00 != c41181vS && c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
            this.A00 = c41181vS;
            Venue A28 = c38321qM.A28();
            A28.getClass();
            KYY kyy = this.A03;
            String id = c38321qM.getId();
            ImageUrl A1S = c38321qM.A1S();
            if (A28.A00.getShortName() != null) {
                name = A28.A00.getShortName();
            } else {
                name = A28.A00.getName();
            }
            kyy.A0K(A1S, id, name);
            Ow3 ow3 = this.A02.A01;
            String id2 = c38321qM.getId();
            id2.getClass();
            ow3.A02(id2, C05F.A00);
        }
    }
}
