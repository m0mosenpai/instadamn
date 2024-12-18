package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.direct.sharetostory.data.ChannelChallengeStickerData;
import java.io.File;

/* loaded from: classes11.dex */
public final class VCC extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelChannelChallengeWinnersShareFragment";
    public C22P A00;
    public ChannelChallengeStickerData A01;
    public File A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_channel_challenge_winners_share_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r0.intValue() <= 1) goto L10;
     */
    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            super.onViewCreated(r13, r14)
            com.instagram.common.session.UserSession r0 = r12.A00
            X.C14360o3.A06(r0)
            X.Fzs r2 = X.AbstractC34063F1q.A00(r0)
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r1 = r12.A01
            java.lang.String r0 = "stickerData"
            if (r1 != 0) goto L1e
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            java.lang.String r4 = r1.A06
            java.lang.String r5 = r1.A07
            java.lang.String r6 = r1.A0C
            java.lang.String r7 = r1.A09
            java.lang.String r8 = r1.A03
            java.lang.String r9 = r1.A0A
            int r0 = r1.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r1.A0D
            java.lang.Integer r0 = r1.A08
            if (r0 == 0) goto L3e
            int r1 = r0.intValue()
            r0 = 1
            r11 = 1
            if (r1 > r0) goto L3f
        L3e:
            r11 = 0
        L3f:
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VCC.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ChannelChallengeStickerData channelChallengeStickerData;
        int A02 = C0f9.A02(-1440226766);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(AbstractC111324zv.A00(325));
        C14360o3.A0C(obj, MSV.A00(237));
        this.A00 = (C22P) obj;
        String A00 = AbstractC111324zv.A00(1727);
        String string = requireArguments.getString(A00);
        AbstractC153636vY.A03(requireArguments, string, A00);
        this.A02 = new File(string);
        Parcelable parcelable = requireArguments.getParcelable(AbstractC111324zv.A00(326));
        if ((parcelable instanceof ChannelChallengeStickerData) && (channelChallengeStickerData = (ChannelChallengeStickerData) parcelable) != null) {
            this.A01 = channelChallengeStickerData;
            C0f9.A09(1045219347, A02);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
            C0f9.A09(1652325862, A02);
            throw illegalArgumentException;
        }
    }
}
