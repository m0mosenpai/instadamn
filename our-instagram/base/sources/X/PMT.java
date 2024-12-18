package X;

import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.BrandedContentTag;

/* loaded from: classes9.dex */
public final class PMT implements Runnable {
    public final /* synthetic */ NJK A00;

    public PMT(NJK njk) {
        this.A00 = njk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC76383bi enumC76383bi;
        EnumC53171NfS enumC53171NfS;
        String str;
        NJK njk = this.A00;
        C55099ObA A09 = njk.A09();
        C47Z A02 = OX2.A02(njk);
        A09.A07 = A02;
        if (A02.CKm()) {
            BrandedContentTag A07 = A02.A07();
            if (A07 != null) {
                str = A07.A01;
            } else {
                str = null;
            }
            A09.A0D.A04(str);
        }
        MediaCaptureConfig mediaCaptureConfig = ((MX5) njk.A07()).A01.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A04) {
            enumC76383bi = EnumC76383bi.A07;
        } else {
            enumC76383bi = OX2.A02(njk).A1F;
        }
        C50991Mfy c50991Mfy = njk.A05;
        if (c50991Mfy != null) {
            C14360o3.A0B(enumC76383bi, 0);
            if (enumC76383bi == EnumC76383bi.A04) {
                enumC53171NfS = EnumC53171NfS.A02;
            } else if (enumC76383bi == EnumC76383bi.A0C) {
                enumC53171NfS = EnumC53171NfS.A05;
            } else if (enumC76383bi == EnumC76383bi.A07) {
                enumC53171NfS = EnumC53171NfS.A04;
            } else if (c50991Mfy.A0A) {
                enumC53171NfS = EnumC53171NfS.A06;
            } else {
                enumC53171NfS = EnumC53171NfS.A03;
            }
            c50991Mfy.A01(enumC53171NfS, true);
            return;
        }
        C14360o3.A0F("clipsAudienceControlViewModel");
        throw C00O.createAndThrow();
    }
}
