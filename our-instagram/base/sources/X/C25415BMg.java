package X;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.BMg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25415BMg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25415BMg(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A06 = z;
        this.A03 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, X.30T] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        SpannableStringBuilder spannableStringBuilder;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                C8MP c8mp = (C8MP) this.A05;
                C183978Ee c183978Ee = (C183978Ee) this.A02;
                return C8MP.A00((Bitmap) this.A01, null, (FilterChain) this.A04, (C198998qz) this.A03, c8mp, c183978Ee, null, this.A06, false, false);
            case 1:
                UserSession userSession = (UserSession) this.A05;
                Fragment fragment = (Fragment) this.A04;
                MusicOverlayStickerModel musicOverlayStickerModel = (MusicOverlayStickerModel) this.A02;
                C183978Ee c183978Ee2 = (C183978Ee) this.A01;
                boolean z = this.A06;
                Bitmap bitmap = (Bitmap) this.A03;
                ImageUrl imageUrl = musicOverlayStickerModel.A04;
                String Ar1 = imageUrl.Ar1();
                if (Ar1 != null) {
                    CYE.A00(bitmap, fragment, userSession, imageUrl, c183978Ee2, Ar1, z);
                }
                return C0eB.A00;
            case 2:
                if (this.A06) {
                    C2XI c2xi = (C2XI) this.A04;
                    boolean A1W = AbstractC25229BEm.A1W((C51762Yz) this.A02);
                    float f = 0.0f;
                    float f2 = 1.0f;
                    if (A1W) {
                        f2 = 0.0f;
                    }
                    AbstractC25227BEk.A1D(c2xi, f2);
                    C2XI c2xi2 = (C2XI) this.A01;
                    if (A1W) {
                        f = 1.0f;
                    }
                    AbstractC25227BEk.A1D(c2xi2, f);
                }
                ((C51762Yz) this.A03).A02(AbstractC166997dE.A0a());
                return C0eB.A00;
            case 3:
                if (AbstractC25229BEm.A1W((C51762Yz) this.A02)) {
                    spannableStringBuilder = AbstractC25225BEi.A0H(AbstractC77623dm.A0G((C76223bS) this.A04, AbstractC166987dD.A19(this.A01), 2131976419));
                    num = C05F.A01;
                } else {
                    spannableStringBuilder = (SpannableStringBuilder) this.A01;
                    if (this.A06) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A00;
                    }
                }
                return C92594Ct.A02(AbstractC25226BEj.A0P(this.A04), spannableStringBuilder, ((BPL) this.A05).A03, (C92584Cs) this.A03, num);
            case 4:
                return new C25416BMh((C51762Yz) this.A04, (C51762Yz) this.A01, (C51762Yz) this.A03, (BLI) this.A05, (InterfaceC16820sZ) this.A02, this.A06);
            default:
                ?? obj = new Object();
                C25665BWb c25665BWb = (C25665BWb) this.A05;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                if (this.A06) {
                    str = "midcard_primary_cta_tap";
                } else {
                    str = "midcard_secondary_cta_tap";
                }
                InstagramMidcardType instagramMidcardType = (InstagramMidcardType) this.A02;
                ClipsMidCardSubtype clipsMidCardSubtype = (ClipsMidCardSubtype) this.A01;
                C37522Gfe c37522Gfe = c25665BWb.A08;
                InterfaceC02590Ai A10 = AbstractC25232BEp.A10(c37522Gfe, abstractC12990ll);
                if (A10.isSampled()) {
                    AbstractC28348Cf7.A02(A10, clipsMidCardSubtype, instagramMidcardType, AbstractC25234BEr.A0W(A10, c37522Gfe, str));
                }
                obj.A00(C29891DGf.A00(this.A03, 10), 4000L);
                return C0eB.A00;
        }
    }
}
