package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.6aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141396aI {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r1 == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(android.content.Context r6, com.instagram.common.session.UserSession r7, com.instagram.feed.media.CreativeConfigIntf r8) {
        /*
            r5 = 0
            r4 = 1
            if (r8 == 0) goto L3b
            boolean r0 = X.AbstractC121575f6.A08(r6, r8)
            if (r0 != r4) goto L3b
            java.lang.String r0 = r8.B3z()
            r3 = 0
            if (r0 == 0) goto L12
            r3 = 1
        L12:
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r8.B0b()
            r2 = 0
            if (r0 == 0) goto L1a
            r2 = 1
        L1a:
            java.util.List r0 = r8.B0S()
            if (r0 == 0) goto L27
            int r1 = r0.size()
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            if (r3 != 0) goto L3c
            if (r2 != 0) goto L3c
            if (r0 != 0) goto L3c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311178234102224(0x8100d3000501d0, double:3.0266735564005374E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L3c
        L3b:
            return r5
        L3c:
            boolean r0 = X.AbstractC141406aJ.A00(r6, r8)
            if (r0 != 0) goto L46
            boolean r4 = X.C6PX.A00(r6)
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC141396aI.A01(android.content.Context, com.instagram.common.session.UserSession, com.instagram.feed.media.CreativeConfigIntf):boolean");
    }

    public static final String A00(Context context, UserSession userSession, CreativeConfigIntf creativeConfigIntf) {
        String captureType;
        int i;
        ProductDetailsProductItemDictIntf BhA;
        EnumC138476Pd A03 = AbstractC121575f6.A03(creativeConfigIntf);
        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
        if (B0a == null || (captureType = B0a.getName()) == null) {
            captureType = creativeConfigIntf.getCaptureType();
        }
        ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
        if (B0b != null && (BhA = B0b.BhA()) != null) {
            captureType = AbstractC38048Gob.A01(BhA).A0J;
        } else if (AbstractC141406aJ.A00(context, creativeConfigIntf) && !C18U.A06(C06090Tz.A05, userSession, 36311178234102224L)) {
            String B3z = creativeConfigIntf.B3z();
            if (A03 != null) {
                switch (A03.ordinal()) {
                    case 2:
                    case 4:
                        i = 2131953246;
                        captureType = context.getString(i);
                        break;
                    case 3:
                        i = 2131953243;
                        captureType = context.getString(i);
                        break;
                    case 5:
                        if (B3z == null) {
                            i = 2131953237;
                            captureType = context.getString(i);
                            break;
                        }
                        break;
                    case 8:
                        List B0S = creativeConfigIntf.B0S();
                        if (B0S == null || B0S.size() <= 0) {
                            i = 2131953244;
                            captureType = context.getString(i);
                            break;
                        }
                        break;
                    case 10:
                        i = 2131953242;
                        captureType = context.getString(i);
                        break;
                }
            }
        }
        if (captureType == null) {
            C0w9.A03("EffectAttributionViewBinder", "Showing empty attribution label");
            return "";
        }
        return captureType;
    }
}
