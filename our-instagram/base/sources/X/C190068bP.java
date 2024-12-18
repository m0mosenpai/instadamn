package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190068bP {
    public int A00;
    public ARAudioEffectData A01;
    public C8JV A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;

    public final void A01(C8JV c8jv, AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel == null) {
            this.A03.schedule(new C23663Ady(c8jv));
            return;
        }
        this.A02 = c8jv;
        int i = audioOverlayTrack.A03;
        int i2 = audioOverlayTrack.A02;
        double d = i / 1000.0d;
        String str = musicAssetModel.A0D;
        String str2 = musicAssetModel.A0I;
        String str3 = musicAssetModel.A0B;
        this.A01 = new ARAudioEffectData(str3, str2, str, null, null, 0.0d, musicAssetModel.A00 / 1000.0d, d, d + (i2 / 1000.0d));
        this.A00 = 0;
        UserSession userSession = this.A04;
        C1ON A00 = C9NO.A00(userSession, musicAssetModel.A0E, str3);
        A00.A00 = new C1P1() { // from class: X.9NZ
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(387020680);
                C190068bP c190068bP = C190068bP.this;
                int i3 = c190068bP.A00 + 1;
                c190068bP.A00 = i3;
                ARAudioEffectData aRAudioEffectData = c190068bP.A01;
                if (aRAudioEffectData != null && i3 == 2) {
                    C190068bP.A00(c190068bP, aRAudioEffectData);
                }
                C0f9.A0A(-1415035022, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                List list;
                int A03 = C0f9.A03(1981284413);
                C214409ee c214409ee = (C214409ee) obj;
                int A0N = AbstractC167017dG.A0N(c214409ee, 238995945);
                C190068bP c190068bP = C190068bP.this;
                ARAudioEffectData aRAudioEffectData = c190068bP.A01;
                if (aRAudioEffectData != null) {
                    C38059Gom c38059Gom = c214409ee.A00;
                    if (c38059Gom != null) {
                        list = c38059Gom.A00;
                    } else {
                        list = null;
                    }
                    aRAudioEffectData.A01 = list;
                    int i3 = c190068bP.A00 + 1;
                    c190068bP.A00 = i3;
                    if (i3 == 2) {
                        C190068bP.A00(c190068bP, aRAudioEffectData);
                    }
                }
                C0f9.A0A(1159612646, A0N);
                C0f9.A0A(436851392, A03);
            }
        };
        String format = String.format(Locale.US, "music/track/%s/beats/", Arrays.copyOf(new Object[]{musicAssetModel.A0B}, 1));
        C14360o3.A07(format);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0E = format;
        c25621Ms.A9s("product", AbstractC65993Txo.A00(MusicProduct.A06));
        c25621Ms.A0P(null, C209409Nz.class, C9Ny.class, false);
        c25621Ms.A08(C05F.A0Y);
        c25621Ms.A0A = format;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.9Na
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(1899106132);
                C190068bP c190068bP = C190068bP.this;
                int i3 = c190068bP.A00 + 1;
                c190068bP.A00 = i3;
                ARAudioEffectData aRAudioEffectData = c190068bP.A01;
                if (aRAudioEffectData != null && i3 == 2) {
                    C190068bP.A00(c190068bP, aRAudioEffectData);
                }
                C0f9.A0A(-1891165353, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(509632955);
                C209409Nz c209409Nz = (C209409Nz) obj;
                int A0N2 = AbstractC167017dG.A0N(c209409Nz, 1602828552);
                C190068bP c190068bP = C190068bP.this;
                ARAudioEffectData aRAudioEffectData = c190068bP.A01;
                if (aRAudioEffectData != null) {
                    aRAudioEffectData.A00 = c209409Nz.A00;
                    int i3 = c190068bP.A00 + 1;
                    c190068bP.A00 = i3;
                    if (i3 == 2) {
                        C190068bP.A00(c190068bP, aRAudioEffectData);
                    }
                }
                C0f9.A0A(308718300, A0N2);
                C0f9.A0A(126978853, A03);
            }
        };
        AbstractC59962oe abstractC59962oe = this.A03;
        abstractC59962oe.schedule(A00);
        abstractC59962oe.schedule(A0N);
    }

    public static final void A00(C190068bP c190068bP, ARAudioEffectData aRAudioEffectData) {
        C8JV c8jv = c190068bP.A02;
        if (c8jv != null) {
            c8jv.CuA(aRAudioEffectData);
        }
        c190068bP.A01 = null;
        c190068bP.A02 = null;
        c190068bP.A00 = 0;
    }

    public C190068bP(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = abstractC59962oe;
    }
}
