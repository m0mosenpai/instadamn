package X;

import com.instagram.model.mediatype.ProductType;
import java.util.UUID;

/* renamed from: X.Kam, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46088Kam extends C30P {
    public static String A01 = "";
    public static C46088Kam A02;
    public final C54999OUl A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C14360o3.A0B(c19280xC, 0);
        ?? obj = new Object();
        obj.A0F = 0;
        c19280xC.A08(0, AbstractC111324zv.A00(1050));
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.4So] */
    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C95804So A05(Object obj) {
        InterfaceC58104PpT interfaceC58104PpT = (InterfaceC58104PpT) obj;
        C14360o3.A0B(interfaceC58104PpT, 0);
        C4SH A07 = A07(interfaceC58104PpT);
        ?? c0Zx = new C0Zx();
        C95824Sr c95824Sr = C4Sq.A00;
        String str = A07.A0B;
        c0Zx.A05("media_id", Long.valueOf(c95824Sr.A01(str)));
        AbstractC43594JPz.A1A(EnumC95784Sm.ORGANIC, c0Zx, this);
        c0Zx.A06("tracking_token", A07.A0I);
        c0Zx.A06("pre_processing_media_id", str);
        return c0Zx;
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C4T2 A06(C4T2 c4t2, Object obj) {
        String str;
        ProductType productType;
        InterfaceC58104PpT interfaceC58104PpT = (InterfaceC58104PpT) obj;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC58104PpT, c4t2);
        super.A06(c4t2, interfaceC58104PpT);
        C75363a3 c75363a3 = A07(interfaceC58104PpT).A04;
        if (c75363a3 != null && (productType = c75363a3.A09) != null && productType.equals(ProductType.FACEBOOK_VIDEO) == A1R) {
            str = "facebook_video";
        } else {
            str = "instagram_video";
        }
        c4t2.A06("media_app_type", str);
        c4t2.A06("video_format", C4T3.A01(c75363a3, false, false));
        return c4t2;
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A07;
    }

    @Override // X.C30P
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public final C4SH A07(InterfaceC58104PpT interfaceC58104PpT) {
        EnumC40111tc enumC40111tc;
        EnumC40111tc enumC40111tc2;
        C14360o3.A0B(interfaceC58104PpT, 0);
        if (interfaceC58104PpT instanceof C51768MuY) {
            C51768MuY c51768MuY = (C51768MuY) interfaceC58104PpT;
            String str = c51768MuY.A05;
            boolean z = c51768MuY.A0A;
            int intValue = c51768MuY.A03.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue != 3) {
                        enumC40111tc2 = null;
                    } else {
                        enumC40111tc2 = EnumC40111tc.A09;
                    }
                } else {
                    enumC40111tc2 = EnumC40111tc.A0Q;
                }
            } else {
                enumC40111tc2 = EnumC40111tc.A0a;
            }
            C75363a3 A012 = this.A00.A01(c51768MuY);
            C45116Jxl c45116Jxl = c51768MuY.A01;
            C14360o3.A0A(c45116Jxl);
            String str2 = c45116Jxl.A01;
            int A08 = AbstractC001900j.A08(str2, "_", 0, false);
            C14360o3.A0A(c45116Jxl);
            if (A08 >= 0) {
                str2 = AbstractC43592JPx.A0z(str2, A08 + 1);
            }
            String str3 = c51768MuY.A07;
            EnumC76383bi enumC76383bi = EnumC76383bi.A06;
            C14360o3.A0B(str, 1);
            return new C4SH(enumC76383bi, enumC40111tc2, null, A012, null, str, null, str, str3, str2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, false, z, false);
        }
        if (interfaceC58104PpT instanceof C51767MuX) {
            C51767MuX c51767MuX = (C51767MuX) interfaceC58104PpT;
            String str4 = c51767MuX.A02;
            boolean z2 = c51767MuX.A08;
            EnumC40111tc enumC40111tc3 = EnumC40111tc.A0a;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("COWATCH_");
            String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), A1C);
            C75363a3 A013 = this.A00.A01(c51767MuX);
            EnumC76383bi enumC76383bi2 = EnumC76383bi.A06;
            C14360o3.A0B(str4, 1);
            return new C4SH(enumC76383bi2, enumC40111tc3, null, A013, null, str4, null, str4, A0v, null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, true, false, z2, false);
        }
        if (interfaceC58104PpT instanceof C51766MuW) {
            C51766MuW c51766MuW = (C51766MuW) interfaceC58104PpT;
            String str5 = c51766MuW.A04;
            boolean z3 = c51766MuW.A07;
            if (z3) {
                enumC40111tc = EnumC40111tc.A0a;
            } else {
                enumC40111tc = EnumC40111tc.A0Q;
            }
            C75363a3 A014 = this.A00.A01(c51766MuW);
            EnumC76383bi enumC76383bi3 = EnumC76383bi.A06;
            C14360o3.A0B(str5, 1);
            return new C4SH(enumC76383bi3, enumC40111tc, null, A014, null, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, false, z3, false);
        }
        throw AbstractC166987dD.A12(MSV.A00(871));
    }

    public C46088Kam(InterfaceC60442pS interfaceC60442pS, C54999OUl c54999OUl, String str) {
        super(interfaceC60442pS, str);
        this.A00 = c54999OUl;
    }
}
