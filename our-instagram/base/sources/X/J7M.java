package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.CollabFollowButtonInfo;
import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.feed.audio.AudioIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J7M extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7M(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                InterfaceC43539JKz interfaceC43539JKz = (InterfaceC43539JKz) this.A01;
                if (interfaceC43539JKz != null) {
                    return interfaceC43539JKz.F7o();
                }
                return null;
            case 1:
            case 33:
                InterfaceC84443pn interfaceC84443pn = (InterfaceC84443pn) this.A01;
                if (interfaceC84443pn != null) {
                    return interfaceC84443pn.F7o();
                }
                return null;
            case 2:
                InterfaceC104764ng interfaceC104764ng = (InterfaceC104764ng) this.A01;
                if (interfaceC104764ng != null) {
                    return interfaceC104764ng.F7o();
                }
                return null;
            case 3:
                List list = (List) this.A01;
                if (list != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0q.add(((InterfaceC88223wX) it.next()).F7o());
                    }
                    return A0q;
                }
                return null;
            case 4:
                InterfaceC87713vf interfaceC87713vf = (InterfaceC87713vf) this.A01;
                if (interfaceC87713vf != null) {
                    return interfaceC87713vf.F7o();
                }
                return null;
            case 5:
                InterfaceC109904xI interfaceC109904xI = (InterfaceC109904xI) this.A01;
                if (interfaceC109904xI != null) {
                    return interfaceC109904xI.F7o();
                }
                return null;
            case 6:
            case 27:
            case 43:
            default:
                List list2 = (List) this.A01;
                if (list2 != null) {
                    ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AbstractC31178DnM.A1U(A0q2, it2);
                    }
                    return A0q2;
                }
                return null;
            case 7:
                List list3 = (List) this.A01;
                if (list3 != null) {
                    ArrayList A0q3 = AbstractC167017dG.A0q(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        A0q3.add(((AndroidLink) it3.next()).F7o());
                    }
                    return A0q3;
                }
                return null;
            case 8:
                AppInstallCTAInfoIntf appInstallCTAInfoIntf = (AppInstallCTAInfoIntf) this.A01;
                if (appInstallCTAInfoIntf != null) {
                    return appInstallCTAInfoIntf.F7o();
                }
                return null;
            case 9:
                AppstoreMetadataDict appstoreMetadataDict = (AppstoreMetadataDict) this.A01;
                if (appstoreMetadataDict != null) {
                    return appstoreMetadataDict.F7o();
                }
                return null;
            case 10:
                List list4 = (List) this.A01;
                if (list4 != null) {
                    ArrayList A0q4 = AbstractC167017dG.A0q(list4);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        A0q4.add(((InterfaceC43514JKa) it4.next()).F7o());
                    }
                    return A0q4;
                }
                return null;
            case 11:
                C5L2 c5l2 = (C5L2) this.A01;
                if (c5l2 != null) {
                    return c5l2.F7o();
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                List list5 = (List) this.A01;
                if (list5 != null) {
                    ArrayList A0q5 = AbstractC167017dG.A0q(list5);
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        A0q5.add(((AudienceListIntf) it5.next()).F7o());
                    }
                    return A0q5;
                }
                return null;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AudioIntf audioIntf = (AudioIntf) this.A01;
                if (audioIntf != null) {
                    return audioIntf.F7o();
                }
                return null;
            case 14:
                List list6 = (List) this.A01;
                if (list6 != null) {
                    ArrayList A0q6 = AbstractC167017dG.A0q(list6);
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        A0q6.add(((JK9) it6.next()).F7o());
                    }
                    return A0q6;
                }
                return null;
            case Process.SIGTERM /* 15 */:
                List list7 = (List) this.A01;
                if (list7 != null) {
                    ArrayList A0q7 = AbstractC167017dG.A0q(list7);
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        A0q7.add(((InterfaceC102164im) it7.next()).F7o());
                    }
                    return A0q7;
                }
                return null;
            case 16:
                List list8 = (List) this.A01;
                if (list8 != null) {
                    ArrayList A0q8 = AbstractC167017dG.A0q(list8);
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        A0q8.add(((InterfaceC37271GbO) it8.next()).F7o());
                    }
                    return A0q8;
                }
                return null;
            case 17:
                BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema = (BoostUpsellBannerPayloadSchema) this.A01;
                if (boostUpsellBannerPayloadSchema != null) {
                    return boostUpsellBannerPayloadSchema.F7o();
                }
                return null;
            case 18:
                List list9 = (List) this.A01;
                if (list9 != null) {
                    ArrayList A0q9 = AbstractC167017dG.A0q(list9);
                    Iterator it9 = list9.iterator();
                    while (it9.hasNext()) {
                        A0q9.add(((InterfaceC43551JLl) it9.next()).F7o());
                    }
                    return A0q9;
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) this.A01;
                if (brandedContentProjectMetadataIntf != null) {
                    return brandedContentProjectMetadataIntf.F7o();
                }
                return null;
            case 20:
                BrandSafetyContentBlocklistBitmapQLObj brandSafetyContentBlocklistBitmapQLObj = (BrandSafetyContentBlocklistBitmapQLObj) this.A01;
                if (brandSafetyContentBlocklistBitmapQLObj != null) {
                    return brandSafetyContentBlocklistBitmapQLObj.F7o();
                }
                return null;
            case 21:
                JM2 jm2 = (JM2) this.A01;
                if (jm2 != null) {
                    return jm2.F7o();
                }
                return null;
            case 22:
                InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) this.A01;
                if (interfaceC38901rP != null) {
                    return interfaceC38901rP.F7o();
                }
                return null;
            case 23:
                AnonymousClass520 anonymousClass520 = (AnonymousClass520) this.A01;
                if (anonymousClass520 != null) {
                    return anonymousClass520.F7o();
                }
                return null;
            case 24:
            case 45:
                List list10 = (List) this.A01;
                if (list10 != null) {
                    ArrayList A0q10 = AbstractC167017dG.A0q(list10);
                    Iterator it10 = list10.iterator();
                    while (it10.hasNext()) {
                        AbstractC37303Gc4.A1S(A0q10, it10);
                    }
                    return A0q10;
                }
                return null;
            case 25:
                ImageInfo imageInfo = (ImageInfo) this.A01;
                if (imageInfo != null) {
                    return imageInfo.F7o();
                }
                return null;
            case 26:
                C44Q c44q = (C44Q) this.A01;
                if (c44q != null) {
                    return c44q.F7o();
                }
                return null;
            case 28:
                InterfaceC37265GbI interfaceC37265GbI = (InterfaceC37265GbI) this.A01;
                if (interfaceC37265GbI != null) {
                    return interfaceC37265GbI.F7o();
                }
                return null;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                InterfaceC43530JKq interfaceC43530JKq = (InterfaceC43530JKq) this.A01;
                if (interfaceC43530JKq != null) {
                    return interfaceC43530JKq.F7o();
                }
                return null;
            case 30:
                InterfaceC31131DmE interfaceC31131DmE = (InterfaceC31131DmE) this.A01;
                if (interfaceC31131DmE != null) {
                    return interfaceC31131DmE.F7o();
                }
                return null;
            case 31:
                List list11 = (List) this.A01;
                if (list11 != null) {
                    ArrayList A0q11 = AbstractC167017dG.A0q(list11);
                    Iterator it11 = list11.iterator();
                    while (it11.hasNext()) {
                        A0q11.add(((InterfaceC73614YQc) it11.next()).F7o());
                    }
                    return A0q11;
                }
                return null;
            case 32:
                InterfaceC83933od interfaceC83933od = (InterfaceC83933od) this.A01;
                if (interfaceC83933od != null) {
                    return interfaceC83933od.F7o();
                }
                return null;
            case 34:
                List list12 = (List) this.A01;
                if (list12 != null) {
                    ArrayList A0q12 = AbstractC167017dG.A0q(list12);
                    Iterator it12 = list12.iterator();
                    while (it12.hasNext()) {
                        A0q12.add(((YQW) it12.next()).F7o());
                    }
                    return A0q12;
                }
                return null;
            case 35:
                ClipsMashupFollowButtonInfo clipsMashupFollowButtonInfo = (ClipsMashupFollowButtonInfo) this.A01;
                if (clipsMashupFollowButtonInfo != null) {
                    return clipsMashupFollowButtonInfo.F7o();
                }
                return null;
            case 36:
                C3x9 c3x9 = (C3x9) this.A01;
                if (c3x9 != null) {
                    return c3x9.F7o();
                }
                return null;
            case 37:
                InterfaceC104934o6 interfaceC104934o6 = (InterfaceC104934o6) this.A01;
                if (interfaceC104934o6 != null) {
                    return interfaceC104934o6.F7o();
                }
                return null;
            case 38:
                List list13 = (List) this.A01;
                if (list13 != null) {
                    ArrayList A0q13 = AbstractC167017dG.A0q(list13);
                    Iterator it13 = list13.iterator();
                    while (it13.hasNext()) {
                        A0q13.add(((InterfaceC43531JKr) it13.next()).F7o());
                    }
                    return A0q13;
                }
                return null;
            case 39:
                List list14 = (List) this.A01;
                if (list14 != null) {
                    ArrayList A0q14 = AbstractC167017dG.A0q(list14);
                    Iterator it14 = list14.iterator();
                    while (it14.hasNext()) {
                        A0q14.add(((InterfaceC43532JKs) it14.next()).F7o());
                    }
                    return A0q14;
                }
                return null;
            case 40:
                InterfaceC31132DmF interfaceC31132DmF = (InterfaceC31132DmF) this.A01;
                if (interfaceC31132DmF != null) {
                    return interfaceC31132DmF.F7o();
                }
                return null;
            case Seq.NULL_REFNUM /* 41 */:
                List list15 = (List) this.A01;
                if (list15 != null) {
                    ArrayList A0q15 = AbstractC167017dG.A0q(list15);
                    Iterator it15 = list15.iterator();
                    while (it15.hasNext()) {
                        A0q15.add(((YR3) it15.next()).F7o());
                    }
                    return A0q15;
                }
                return null;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ClipsTrialDict clipsTrialDict = (ClipsTrialDict) this.A01;
                if (clipsTrialDict != null) {
                    return clipsTrialDict.F7o();
                }
                return null;
            case 44:
                CollabFollowButtonInfo collabFollowButtonInfo = (CollabFollowButtonInfo) this.A01;
                if (collabFollowButtonInfo != null) {
                    return collabFollowButtonInfo.F7o();
                }
                return null;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                InterfaceC38941rT interfaceC38941rT = (InterfaceC38941rT) this.A01;
                if (interfaceC38941rT != null) {
                    return interfaceC38941rT.F7o();
                }
                return null;
            case 47:
                IGCommentSheetMoreInfo iGCommentSheetMoreInfo = (IGCommentSheetMoreInfo) this.A01;
                if (iGCommentSheetMoreInfo != null) {
                    return iGCommentSheetMoreInfo.F7o();
                }
                return null;
            case 48:
                List list16 = (List) this.A01;
                if (list16 != null) {
                    ArrayList A0q16 = AbstractC167017dG.A0q(list16);
                    Iterator it16 = list16.iterator();
                    while (it16.hasNext()) {
                        A0q16.add(((InterfaceC38901rP) it16.next()).F7o());
                    }
                    return A0q16;
                }
                return null;
            case 49:
                InterfaceC43506JJs interfaceC43506JJs = (InterfaceC43506JJs) this.A01;
                if (interfaceC43506JJs != null) {
                    return interfaceC43506JJs.F7o();
                }
                return null;
        }
    }
}
