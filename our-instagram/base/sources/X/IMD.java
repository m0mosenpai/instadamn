package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.AdditionalCandidatesImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpriteSheetInfoCandidatesImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class IMD {
    public AdditionalCandidates A00;
    public SpriteSheetInfoCandidates A01;
    public SpriteSheetInfoCandidates A02;
    public List A03;
    public List A04;
    public final ImageInfo A05;

    public final ImageInfo A00() {
        AdditionalCandidatesImpl additionalCandidatesImpl;
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl;
        Object imageInfoImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ImageInfo imageInfo = this.A05;
        if (imageInfo instanceof ImmutablePandoImageInfo) {
            AdditionalCandidates additionalCandidates = this.A00;
            ArrayList arrayList2 = null;
            if (additionalCandidates != null) {
                treeUpdaterJNI = additionalCandidates.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L = AbstractC166987dD.A1L("additional_candidates", treeUpdaterJNI);
            SpriteSheetInfoCandidates spriteSheetInfoCandidates = this.A01;
            if (spriteSheetInfoCandidates != null) {
                treeUpdaterJNI2 = spriteSheetInfoCandidates.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L2 = AbstractC166987dD.A1L("animated_thumbnail_spritesheet_info_candidates", treeUpdaterJNI2);
            List list = this.A03;
            if (list != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1Q(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            C09530e4 A1L3 = AbstractC166987dD.A1L("candidates", arrayList);
            SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = this.A02;
            if (spriteSheetInfoCandidates2 != null) {
                treeUpdaterJNI3 = spriteSheetInfoCandidates2.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            C09530e4 A1L4 = AbstractC166987dD.A1L("scrubber_spritesheet_info_candidates", treeUpdaterJNI3);
            List list2 = this.A04;
            if (list2 != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A1Q(arrayList2, it2);
                }
            }
            imageInfoImpl = AbstractC37303Gc4.A06(imageInfo, new C09530e4[]{A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("spins_underlying_media_candidates", arrayList2)});
        } else {
            AdditionalCandidates additionalCandidates2 = this.A00;
            SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl2 = null;
            if (additionalCandidates2 != null) {
                additionalCandidatesImpl = additionalCandidates2.F5A();
            } else {
                additionalCandidatesImpl = null;
            }
            SpriteSheetInfoCandidates spriteSheetInfoCandidates3 = this.A01;
            if (spriteSheetInfoCandidates3 != null) {
                spriteSheetInfoCandidatesImpl = spriteSheetInfoCandidates3.F5C();
            } else {
                spriteSheetInfoCandidatesImpl = null;
            }
            List list3 = this.A03;
            SpriteSheetInfoCandidates spriteSheetInfoCandidates4 = this.A02;
            if (spriteSheetInfoCandidates4 != null) {
                spriteSheetInfoCandidatesImpl2 = spriteSheetInfoCandidates4.F5C();
            }
            imageInfoImpl = new ImageInfoImpl(additionalCandidatesImpl, spriteSheetInfoCandidatesImpl, spriteSheetInfoCandidatesImpl2, list3, this.A04);
        }
        return (ImageInfo) imageInfoImpl;
    }

    public IMD(ImageInfo imageInfo) {
        this.A05 = imageInfo;
        this.A00 = imageInfo.AZl();
        this.A01 = imageInfo.Abq();
        this.A03 = imageInfo.AlQ();
        this.A02 = imageInfo.Br7();
        this.A04 = imageInfo.BzD();
    }
}
