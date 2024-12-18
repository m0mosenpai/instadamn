package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BKw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25379BKw {
    public final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C25414BMf.A00);

    public final boolean A00(Context context, UserSession userSession, C38321qM c38321qM) {
        int i;
        int i2;
        AppstoreMetadataDict AcT;
        AppstoreMetadataDict AcT2;
        List A07;
        InterfaceC84163p3 BPh;
        C3x9 clipsMetadata;
        C3x9 clipsMetadata2;
        MusicInfo BVc;
        List B0S;
        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
        if (Asm != null && (B0S = Asm.B0S()) != null) {
            i = B0S.size();
        } else {
            i = 0;
        }
        C3x9 clipsMetadata3 = c38321qM.A0C.getClipsMetadata();
        OriginalSoundDataIntf originalSoundDataIntf = null;
        if (clipsMetadata3 != null) {
            originalSoundDataIntf = clipsMetadata3.BZw();
        }
        int i3 = 1;
        if (originalSoundDataIntf == null && (((clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || (BVc = clipsMetadata.BVc()) == null || BVc.BVV() == null) && (!c38321qM.CdW() || (clipsMetadata2 = c38321qM.A0C.getClipsMetadata()) == null || clipsMetadata2.AZi() == null))) {
            i3 = 0;
        }
        int i4 = i + i3;
        ArrayList A3M = c38321qM.A3M();
        if (A3M != null) {
            i2 = A3M.size();
        } else {
            i2 = 0;
        }
        int i5 = i4 + i2;
        C3x9 clipsMetadata4 = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata4 != null && (BPh = clipsMetadata4.BPh()) != null && BPh.BZr() != null) {
            i5++;
        }
        CreativeConfigIntf Asm2 = c38321qM.A0C.Asm();
        if (Asm2 != null && (A07 = AbstractC121575f6.A07(context, Asm2)) != null && (!A07.isEmpty())) {
            i5++;
        }
        if (c38321qM.A27() != null) {
            i5++;
        }
        if (AbstractC37668Gi1.A01(userSession, c38321qM)) {
            i5++;
        }
        if (c38321qM.A6J() && C18U.A06(C06090Tz.A05, userSession, 36317199778386802L)) {
            i5++;
        }
        if (c38321qM.CdW() && (((AcT = c38321qM.A0C.AcT()) != null && AcT.BY0() != null) || ((AcT2 = c38321qM.A0C.AcT()) != null && AcT2.BIT() != null))) {
            i5++;
        }
        this.A00.getValue();
        if (C25380BKx.A01(userSession, c38321qM)) {
            i5++;
        }
        if (c38321qM.A6k(userSession)) {
            i5++;
        }
        if (c38321qM.A6j(userSession)) {
            i5++;
        }
        if (c38321qM.A6g(userSession)) {
            i5++;
        }
        if (c38321qM.A6U()) {
            i5++;
        }
        if (c38321qM.CdW()) {
            if (i5 < 1) {
                return false;
            }
        } else if (i5 <= 1) {
            return false;
        }
        return true;
    }
}
