package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.List;
import java.util.Map;

/* renamed from: X.9C2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C2 extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9C2(Integer num) {
        this((VoiceOption) null, num, (String) null);
        this.A03 = 1;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9C2) && ((C9C2) obj).A03 == i) {
            return true;
        }
        return false;
    }

    public final String A01() {
        String str = this.A02;
        if (str == null) {
            ImageUrl imageUrl = (ImageUrl) this.A01;
            if (imageUrl != null) {
                String url = imageUrl.getUrl();
                C14360o3.A07(url);
                return url;
            }
            Object obj = this.A00;
            if (obj != null) {
                return String.valueOf(obj.hashCode());
            }
            throw new IllegalArgumentException("Either url or drawable must be set");
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto La;
                case 1: goto L24;
                case 2: goto L3a;
                case 3: goto L5a;
                case 4: goto L7a;
                case 5: goto L97;
                case 6: goto L5;
                case 7: goto L9b;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto Lc6
            r0 = 0
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L4f
        L24:
            if (r2 == r3) goto Lc6
            r0 = 1
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto Lc4
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L73
        L3a:
            if (r2 == r3) goto Lc6
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto Lc4
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L4f:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto Lbe
        L5a:
            if (r2 == r3) goto Lc6
            r0 = 3
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L73:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L92
            goto Lc4
        L7a:
            if (r2 == r3) goto Lc6
            r0 = 4
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto Lc4
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L92
            goto Lc4
        L92:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto Lbe
        L97:
            if (r2 == r3) goto Lc6
            r0 = 5
            goto L9e
        L9b:
            if (r2 == r3) goto Lc6
            r0 = 7
        L9e:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lc4
            X.9C2 r3 = (X.C9C2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc4
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        Lbe:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lc6
        Lc4:
            r0 = 0
            return r0
        Lc6:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C2.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C2.hashCode():int");
    }

    public final String toString() {
        if (6 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PushUpRuleModificationTrackerData(previousPushUpMinGap=");
        sb.append(this.A00);
        sb.append(", previousTimeGap=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1450));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C9C2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public C9C2(C9BN c9bn, String str, Map map) {
        this.A03 = 7;
        this.A00 = c9bn;
        this.A02 = str;
        this.A01 = map;
    }

    public C9C2(Drawable drawable, ImageUrl imageUrl, String str, int i) {
        this.A03 = 3;
        imageUrl = (i & 1) != 0 ? null : imageUrl;
        drawable = (i & 2) != 0 ? null : drawable;
        str = (i & 4) != 0 ? null : str;
        this.A03 = 3;
        this.A01 = imageUrl;
        this.A00 = drawable;
        this.A02 = str;
        if (imageUrl == null && drawable == null) {
            throw new IllegalArgumentException("Either url or drawable must be set");
        }
    }

    public C9C2(VoiceOption voiceOption, Integer num, String str) {
        this.A03 = 1;
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = voiceOption;
        this.A02 = str;
    }

    public C9C2(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, String str, List list) {
        this.A03 = 0;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(intentAwareAdsInfoIntf, 2);
        this.A02 = str;
        this.A01 = intentAwareAdsInfoIntf;
        this.A00 = list;
    }

    public C9C2(QuickPromotionSurface quickPromotionSurface, Trigger trigger, String str) {
        this.A03 = 4;
        C14360o3.A0B(quickPromotionSurface, 1);
        C14360o3.A0B(trigger, 2);
        this.A00 = quickPromotionSurface;
        this.A01 = trigger;
        this.A02 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9C2() {
        this((Object) null, (Object) null, (String) null, 6);
        this.A03 = 6;
    }
}
