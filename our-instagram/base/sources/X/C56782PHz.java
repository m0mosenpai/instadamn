package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;

/* renamed from: X.PHz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56782PHz implements XDS {
    public final int A00;
    public final Object A01;

    public C56782PHz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static AudienceGeoLocation A00(AudienceGeoLocation audienceGeoLocation, int i) {
        String str = audienceGeoLocation.A06;
        String str2 = audienceGeoLocation.A05;
        AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
        double d = audienceGeoLocation.A00;
        double d2 = audienceGeoLocation.A01;
        String str3 = audienceGeoLocation.A04;
        String str4 = audienceGeoLocation.A08;
        String str5 = audienceGeoLocation.A07;
        ?? obj = new Object();
        obj.A06 = str;
        obj.A05 = str2;
        obj.A03 = adGeoLocationType;
        obj.A00 = d;
        obj.A01 = d2;
        obj.A02 = i;
        obj.A04 = str3;
        obj.A08 = str4;
        obj.A07 = str5;
        return obj;
    }

    public static void A01(AbstractC66357UBy abstractC66357UBy, Object obj, int i) {
        abstractC66357UBy.setOnSliderChangeListener(new C56782PHz(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // X.XDS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void DC5() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56782PHz.DC5():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XDS
    public final /* synthetic */ void DCA() {
        FilterGroupModel filterGroupModel;
        switch (this.A00) {
            case 3:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56232Oxf c56232Oxf = (C56232Oxf) this.A01;
                if (!c56232Oxf.A03) {
                    return;
                }
                filterGroupModel = c56232Oxf.A02;
                filterGroupModel.getClass();
                filterGroupModel.EUV(19, false);
                return;
            case 4:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56233Oxg c56233Oxg = (C56233Oxg) this.A01;
                if (!c56233Oxg.A04) {
                    return;
                }
                filterGroupModel = c56233Oxg.A03;
                filterGroupModel.getClass();
                filterGroupModel.EUV(19, false);
                return;
            case 5:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56229Oxc c56229Oxc = (C56229Oxc) this.A01;
                if (!c56229Oxc.A04) {
                    return;
                }
                c56229Oxc.A03.getClass();
                filterGroupModel = c56229Oxc.A03;
                filterGroupModel.EUV(19, false);
                return;
            case 6:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56230Oxd c56230Oxd = (C56230Oxd) this.A01;
                if (!c56230Oxd.A04) {
                    return;
                }
                c56230Oxd.A03.getClass();
                filterGroupModel = c56230Oxd.A03;
                filterGroupModel.EUV(19, false);
                return;
            case 7:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56231Oxe c56231Oxe = (C56231Oxe) this.A01;
                if (!c56231Oxe.A05) {
                    return;
                }
                filterGroupModel = c56231Oxe.A04;
                filterGroupModel.getClass();
                filterGroupModel.EUV(19, false);
                return;
            case 8:
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                C56234Oxh c56234Oxh = (C56234Oxh) this.A01;
                if (!c56234Oxh.A0L) {
                    return;
                }
                filterGroupModel = c56234Oxh.A0G;
                if (filterGroupModel == null) {
                    throw AbstractC166997dE.A0g();
                }
                filterGroupModel.EUV(19, false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XDS
    public final void Dbr(int i) {
        Object value;
        C66628UPq c66628UPq;
        AudienceGeoLocation audienceGeoLocation;
        AudienceGeoLocation audienceGeoLocation2;
        C8MA c8ma;
        switch (this.A00) {
            case 0:
                UFT uft = (UFT) ((C68721Vax) this.A01).A00.A0D.getValue();
                int A01 = AbstractC31176DnK.A01(WG3.A02, i);
                if (A01 == uft.A06().A01) {
                    return;
                }
                C05A c05a = uft.A02.A04;
                do {
                    value = c05a.getValue();
                    c66628UPq = (C66628UPq) value;
                    AudienceGeoLocation audienceGeoLocation3 = uft.A06().A02;
                    audienceGeoLocation = null;
                    if (audienceGeoLocation3 != null) {
                        audienceGeoLocation2 = A00(audienceGeoLocation3, A01);
                    } else {
                        audienceGeoLocation2 = null;
                    }
                    AudienceGeoLocation audienceGeoLocation4 = uft.A06().A03;
                    if (audienceGeoLocation4 != null) {
                        audienceGeoLocation = A00(audienceGeoLocation4, A01);
                    }
                } while (!c05a.AIi(value, C66628UPq.A00(audienceGeoLocation, audienceGeoLocation2, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, A01, c66628UPq.A06)));
                return;
            case 1:
                C56228Oxb c56228Oxb = (C56228Oxb) this.A01;
                c56228Oxb.A01 = i;
                C56228Oxb.A00(c56228Oxb, i);
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56228Oxb.A03;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 2:
                ((C50986Mft) ((N6W) this.A01).A03.getValue()).A01(i / 100.0f);
                return;
            case 3:
                C56232Oxf c56232Oxf = (C56232Oxf) this.A01;
                c56232Oxf.A00 = i;
                if (c56232Oxf.A04) {
                    return;
                }
                C56232Oxf.A00(c56232Oxf.A02, i);
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56232Oxf.A01;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 4:
                C56233Oxg c56233Oxg = (C56233Oxg) this.A01;
                c56233Oxg.A00 = i;
                if (c56233Oxg.A05) {
                    return;
                }
                C56233Oxg.A01(c56233Oxg, i);
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56233Oxg.A02;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 5:
                C56229Oxc c56229Oxc = (C56229Oxc) this.A01;
                c56229Oxc.A00 = i;
                C56229Oxc.A00(c56229Oxc, i);
                if (c56229Oxc.A05 || !AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56229Oxc.A02;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 6:
                C56230Oxd c56230Oxd = (C56230Oxd) this.A01;
                c56230Oxd.A00 = i;
                C56230Oxd.A00(c56230Oxd, i);
                if (c56230Oxd.A05 || !AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56230Oxd.A02;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 7:
                C56231Oxe c56231Oxe = (C56231Oxe) this.A01;
                c56231Oxe.A00 = i;
                if (c56231Oxe.A06) {
                    return;
                }
                C56231Oxe.A00(c56231Oxe, i);
                if (!AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56231Oxe.A03;
                c8ma.getClass();
                c8ma.EGV();
                return;
            case 8:
                C56234Oxh c56234Oxh = (C56234Oxh) this.A01;
                if (c56234Oxh.A0J) {
                    c56234Oxh.A05 = i;
                } else {
                    c56234Oxh.A00 = i;
                }
                C56234Oxh.A00(c56234Oxh);
                if (c56234Oxh.A0M || !AbstractC43593JPy.A1Z(O05.A00, 2)) {
                    return;
                }
                c8ma = c56234Oxh.A0F;
                if (c8ma == null) {
                    throw AbstractC166997dE.A0g();
                }
                c8ma.EGV();
                return;
            default:
                C56227Oxa c56227Oxa = (C56227Oxa) this.A01;
                c56227Oxa.A00 = i;
                FilterGroupModel filterGroupModel = c56227Oxa.A02;
                if (filterGroupModel != null) {
                    FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
                    if (filterGroupModelImpl.A04) {
                        ColorFilter colorFilter = (ColorFilter) MSX.A0C(filterGroupModelImpl.A02, 17);
                        if (colorFilter != null) {
                            colorFilter.A00 = i / 100.0f;
                        }
                        InterfaceC58287Psf interfaceC58287Psf = c56227Oxa.A01;
                        interfaceC58287Psf.getClass();
                        interfaceC58287Psf.CoQ();
                        return;
                    }
                }
                InterfaceC58287Psf interfaceC58287Psf2 = c56227Oxa.A01;
                interfaceC58287Psf2.getClass();
                interfaceC58287Psf2.EUZ(c56227Oxa.A00);
                HashMap hashMap = c56227Oxa.A03;
                VideoFilter B6O = c56227Oxa.A01.B6O();
                B6O.getClass();
                AbstractC166997dE.A1U(Integer.valueOf(B6O.A0O), hashMap, c56227Oxa.A00);
                InterfaceC58287Psf interfaceC58287Psf3 = c56227Oxa.A01;
                interfaceC58287Psf3.getClass();
                interfaceC58287Psf3.CoQ();
                return;
        }
    }
}
