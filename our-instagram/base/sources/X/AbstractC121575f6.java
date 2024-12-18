package X;

import android.content.Context;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121575f6 {
    public static final CreativeConfig A01(CreativeConfigIntf creativeConfigIntf, String str, boolean z) {
        ArrayList arrayList;
        C14360o3.A0B(creativeConfigIntf, 0);
        List<EffectPreviewIntf> B0S = creativeConfigIntf.B0S();
        if (B0S != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(B0S, 10));
            for (EffectPreviewIntf effectPreviewIntf : B0S) {
                if (C14360o3.A0K(str, effectPreviewIntf.getId())) {
                    effectPreviewIntf = AbstractC41732Ie4.A01(effectPreviewIntf, z);
                }
                arrayList.add(effectPreviewIntf);
            }
        } else {
            arrayList = null;
        }
        AttributionUser AdP = creativeConfigIntf.AdP();
        List Ak7 = creativeConfigIntf.Ak7();
        String captureType = creativeConfigIntf.getCaptureType();
        List Asl = creativeConfigIntf.Asl();
        String AzG = creativeConfigIntf.AzG();
        String AzH = creativeConfigIntf.AzH();
        creativeConfigIntf.B0S();
        return I04.A00(AdP, creativeConfigIntf.B0a(), creativeConfigIntf.B0b(), captureType, AzG, AzH, creativeConfigIntf.B3R(), creativeConfigIntf.B3z(), creativeConfigIntf.getFailureReason(), creativeConfigIntf.B85(), creativeConfigIntf.BcZ(), Ak7, Asl, arrayList, creativeConfigIntf.B9a());
    }

    public static final boolean A08(Context context, CreativeConfigIntf creativeConfigIntf) {
        AttributionUser AdP;
        String str;
        StringBuilder sb;
        String str2;
        String captureType;
        EffectThumbnailImageDictIntf C84;
        String B3z;
        if (creativeConfigIntf.AdP() == null && creativeConfigIntf.B0a() == null) {
            str = "CreativeConfig";
            sb = new StringBuilder();
            str2 = "Attribution invalid due to missing top level attribution user and effect preview for effect ID: ";
        } else {
            EffectPreviewIntf B0a = creativeConfigIntf.B0a();
            if ((B0a == null || (AdP = B0a.AdP()) == null) && (AdP = creativeConfigIntf.AdP()) == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user for effect ID: ";
            } else if (AdP.getUsername() == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user name for effect ID: ";
            } else if (AdP.getInstagramUserId() == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user ID for effect ID: ";
            } else {
                if ((!A0B(creativeConfigIntf, EnumC138476Pd.A0A) || (B3z = creativeConfigIntf.B3z()) == null || B3z.length() == 0) && ((!A0B(creativeConfigIntf, EnumC138476Pd.A08) || !AnonymousClass820.A01(context)) && !A0B(creativeConfigIntf, EnumC138476Pd.A04, EnumC138476Pd.A0B))) {
                    String B3z2 = creativeConfigIntf.B3z();
                    if (B3z2 != null && B3z2.length() != 0) {
                        if (creativeConfigIntf.B0a() == null) {
                            str = "CreativeConfig";
                            sb = new StringBuilder();
                            str2 = "Effect invalid due to missing effect name for effect ID: ";
                        } else {
                            EffectPreviewIntf B0a2 = creativeConfigIntf.B0a();
                            if (B0a2 == null || (C84 = B0a2.C84()) == null || C84.CDO() == null) {
                                str = "CreativeConfig";
                                sb = new StringBuilder();
                                str2 = "Attribution invalid due to missing thumbnail image for effect ID: ";
                            }
                        }
                    } else {
                        str = "CreativeConfig";
                        sb = new StringBuilder();
                        sb.append("Attribution invalid due to missing effect ID. Capture Type: ");
                        captureType = creativeConfigIntf.getCaptureType();
                        sb.append(captureType);
                        C0w9.A03(str, sb.toString());
                        return false;
                    }
                }
                return true;
            }
        }
        sb.append(str2);
        captureType = creativeConfigIntf.B3z();
        sb.append(captureType);
        C0w9.A03(str, sb.toString());
        return false;
    }

    public static final boolean A0B(CreativeConfigIntf creativeConfigIntf, EnumC138476Pd... enumC138476PdArr) {
        for (EnumC138476Pd enumC138476Pd : enumC138476PdArr) {
            if (C14360o3.A0K(enumC138476Pd.A00, creativeConfigIntf.getCaptureType())) {
                return true;
            }
        }
        return false;
    }

    public static final EnumC138476Pd A03(CreativeConfigIntf creativeConfigIntf) {
        return EnumC138476Pd.A01.A00(creativeConfigIntf.getCaptureType());
    }

    public static final List A07(Context context, CreativeConfigIntf creativeConfigIntf) {
        HashSet hashSet = new HashSet();
        List Ak7 = creativeConfigIntf.Ak7();
        if (Ak7 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = Ak7.iterator();
            while (it.hasNext()) {
                EnumC25546BRi A00 = AbstractC25538BRa.A00(context, (String) it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
            hashSet.addAll(AbstractC001800i.A0j(arrayList));
        }
        List Asl = creativeConfigIntf.Asl();
        if (Asl != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = Asl.iterator();
            while (it2.hasNext()) {
                EnumC25546BRi A002 = AbstractC25538BRa.A00(context, ((CameraToolInfoIntf) it2.next()).Ak6().A00);
                if (A002 != null) {
                    arrayList2.add(A002);
                }
            }
            hashSet.addAll(AbstractC001800i.A0k(arrayList2));
        }
        return AbstractC001800i.A0a(hashSet);
    }

    public static final boolean A0A(CreativeConfigIntf creativeConfigIntf) {
        return A0B(creativeConfigIntf, EnumC138476Pd.A0E, EnumC138476Pd.A0F, EnumC138476Pd.A09);
    }

    public static final EnumC172837mv A00(CreativeConfigIntf creativeConfigIntf) {
        if (A03(creativeConfigIntf) == EnumC138476Pd.A0B) {
            EnumC172837mv enumC172837mv = EnumC172837mv.A0I;
            String B85 = creativeConfigIntf.B85();
            if (B85 == null) {
                return null;
            }
            for (EnumC172837mv enumC172837mv2 : EnumC172837mv.values()) {
                if (C14360o3.A0K(enumC172837mv2.A05, B85)) {
                    return enumC172837mv2;
                }
            }
            return EnumC172837mv.A0I;
        }
        return null;
    }

    public static final CreativeConfig A02(CreativeConfigIntf creativeConfigIntf, boolean z) {
        EffectPreview effectPreview;
        AttributionUser AdP = creativeConfigIntf.AdP();
        List Ak7 = creativeConfigIntf.Ak7();
        String captureType = creativeConfigIntf.getCaptureType();
        List Asl = creativeConfigIntf.Asl();
        String AzG = creativeConfigIntf.AzG();
        String AzH = creativeConfigIntf.AzH();
        List B0S = creativeConfigIntf.B0S();
        creativeConfigIntf.B0a();
        ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
        String B3R = creativeConfigIntf.B3R();
        String B3z = creativeConfigIntf.B3z();
        String failureReason = creativeConfigIntf.getFailureReason();
        String B85 = creativeConfigIntf.B85();
        List B9a = creativeConfigIntf.B9a();
        String BcZ = creativeConfigIntf.BcZ();
        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
        if (B0a != null) {
            effectPreview = AbstractC41732Ie4.A01(B0a, z);
        } else {
            effectPreview = null;
        }
        return I04.A00(AdP, effectPreview, B0b, captureType, AzG, AzH, B3R, B3z, failureReason, B85, BcZ, Ak7, Asl, B0S, B9a);
    }

    public static final EnumC223179sw A04(CreativeConfigIntf creativeConfigIntf) {
        String AxJ;
        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
        if (B0a != null && (AxJ = B0a.AxJ()) != null) {
            return EnumC223179sw.valueOf(AxJ);
        }
        return null;
    }

    public static final String A05(CreativeConfigIntf creativeConfigIntf) {
        AttributionUser AdP;
        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
        if ((B0a == null || (AdP = B0a.AdP()) == null) && (AdP = creativeConfigIntf.AdP()) == null) {
            return null;
        }
        return AdP.getInstagramUserId();
    }

    public static final String A06(CreativeConfigIntf creativeConfigIntf) {
        AttributionUser AdP;
        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
        if ((B0a == null || (AdP = B0a.AdP()) == null) && (AdP = creativeConfigIntf.AdP()) == null) {
            return null;
        }
        return AdP.getUsername();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A09(com.instagram.feed.media.CreativeConfigIntf r2) {
        /*
            java.util.List r0 = r2.B9a()
            if (r0 == 0) goto L30
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = (com.instagram.api.schemas.GenAIToolInfoDictIntf) r0
            com.instagram.api.schemas.CameraTool r0 = r0.C9G()
            X.9H2 r0 = X.AbstractC207699Gz.A00(r0)
            if (r0 == 0) goto Lf
            r2.add(r0)
            goto Lf
        L29:
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L31
        L30:
            r0 = 1
        L31:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC121575f6.A09(com.instagram.feed.media.CreativeConfigIntf):boolean");
    }
}
