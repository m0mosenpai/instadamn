package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class MWT extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;
    public final Object A05;

    public static /* synthetic */ MWT A00(MWT mwt, C148336m3 c148336m3, String str, List list, List list2, int i) {
        String str2 = str;
        C148336m3 c148336m32 = c148336m3;
        List list3 = list2;
        List list4 = list;
        List list5 = null;
        if ((i & 1) != 0) {
            list5 = (List) mwt.A02;
        }
        if ((i & 2) != 0) {
            list4 = (List) mwt.A05;
        }
        if ((i & 4) != 0) {
            list3 = (List) mwt.A00;
        }
        if ((i & 8) != 0) {
            c148336m32 = (C148336m3) mwt.A01;
        }
        if ((i & 16) != 0) {
            str2 = mwt.A03;
        }
        AbstractC167017dG.A1O(list5, list3);
        C14360o3.A0B(str2, 4);
        return new MWT(c148336m32, str2, list5, list4, list3);
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MWT) && ((MWT) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWT.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWT.hashCode():int");
    }

    public final String toString() {
        if (4 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectGenericInterstitialReplyModalViewModel(header=");
        A1C.append(this.A01);
        A1C.append(", content=");
        A1C.append(this.A00);
        A1C.append(", composerHintText=");
        A1C.append(this.A03);
        A1C.append(", iceBreaker=");
        A1C.append(this.A05);
        A1C.append(", userToSendMessageTo=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    public MWT(Integer num, Integer num2, Integer num3, String str, List list) {
        this.A04 = 1;
        AbstractC167007dF.A1F(str, 1, num2);
        this.A03 = str;
        this.A02 = list;
        this.A01 = num;
        this.A05 = num2;
        this.A00 = num3;
    }

    public MWT(C51761Mtk c51761Mtk, C51760Mtj c51760Mtj, User user, String str, List list) {
        this.A04 = 4;
        C14360o3.A0B(user, 5);
        this.A01 = c51761Mtk;
        this.A00 = c51760Mtj;
        this.A03 = str;
        this.A05 = list;
        this.A02 = user;
    }

    public MWT(EnumC53216NgE enumC53216NgE, InterfaceC57989PnZ interfaceC57989PnZ, Object obj, Object obj2, String str) {
        this.A04 = 9;
        AbstractC167017dG.A1P(interfaceC57989PnZ, enumC53216NgE);
        this.A02 = interfaceC57989PnZ;
        this.A01 = enumC53216NgE;
        this.A00 = obj;
        this.A05 = obj2;
        this.A03 = str;
    }

    public MWT(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43, String str, List list) {
        this.A04 = 8;
        this.A03 = str;
        this.A05 = list;
        this.A02 = abstractC55145Od4;
        this.A01 = abstractC55145Od42;
        this.A00 = abstractC55145Od43;
    }

    public MWT(android.net.Uri uri, android.net.Uri uri2, Integer num, String str, List list) {
        this.A04 = 10;
        this.A02 = list;
        this.A05 = uri;
        this.A03 = str;
        this.A00 = uri2;
        this.A01 = num;
    }

    public MWT(C148336m3 c148336m3, String str, List list, List list2, List list3) {
        this.A04 = 5;
        this.A02 = list;
        this.A05 = list2;
        this.A00 = list3;
        this.A01 = c148336m3;
        this.A03 = str;
    }

    public MWT(C5QE c5qe, C5QE c5qe2, C5QE c5qe3, ImageUrl imageUrl, String str) {
        this.A04 = 7;
        this.A02 = c5qe;
        this.A00 = c5qe2;
        this.A01 = c5qe3;
        this.A03 = str;
        this.A05 = imageUrl;
    }

    public MWT(Bitmap bitmap, Bitmap bitmap2, String str, List list, List list2) {
        this.A04 = 2;
        this.A02 = list;
        this.A01 = bitmap;
        this.A00 = bitmap2;
        this.A03 = str;
        this.A05 = list2;
    }

    public MWT(NewFundraiserInfo newFundraiserInfo, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, List list, List list2) {
        this.A04 = 3;
        this.A00 = existingStandaloneFundraiserForFeedModel;
        this.A03 = str;
        this.A05 = newFundraiserInfo;
        this.A02 = list;
        this.A01 = list2;
    }

    public MWT(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A03 = str;
        this.A02 = obj4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MWT() {
        /*
            r7 = this;
            r0 = 2
            r1 = r7
            r7.A04 = r0
            X.0sl r5 = X.C16930sl.A00
            r2 = 0
            r3 = r2
            r4 = r2
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWT.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MWT(X.C148336m3 r2, java.lang.String r3, java.util.List r4, java.util.List r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 5
            r1.A04 = r0
            X.0sl r4 = X.C16930sl.A00
            r2 = 0
            java.lang.String r3 = ""
            r5 = r2
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWT.<init>(X.6m3, java.lang.String, java.util.List, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MWT(Integer num, List list) {
        this((android.net.Uri) null, (android.net.Uri) null, num, (String) null, list);
        this.A04 = 10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MWT(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, C60492R0s c60492R0s, String str, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(null, null, null, null, null, 0);
        this.A04 = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MWT(com.instagram.model.fundraiser.NewFundraiserInfo r2, com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r3, java.lang.String r4, java.util.List r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 3
            r1.A04 = r0
            r2 = 0
            X.0sl r5 = X.C16930sl.A00
            r3 = r2
            r4 = r2
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWT.<init>(com.instagram.model.fundraiser.NewFundraiserInfo, com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel, java.lang.String, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }
}
